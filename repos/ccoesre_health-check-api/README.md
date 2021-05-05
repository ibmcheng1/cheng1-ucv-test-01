# Build-to-Manage:  Health check API


The [Getting Started](#getting-started) section provides general guildlines on recommended practices for health check for microservices. We are also building code samples to help application squads enable health check API endpoints in their chosen technology stack. The [Code Samples](#code-samples) section contains the current snapshot of the work in progress.

## Getting Started

### Overview - health check API for Microservices

With the advent of cloud computing and DevOps practices, monolithic applications are being broken into individual components and microservices. The proliferation of these services imposes a new challenge to the operations team: how to monitor the health of these services in scalable and consistent ways.

One of the activities in the build-to-manage approach is the instrumentation of the code to implement health check API endpoints. Combined with proper logging, monitoring, and other build-to-manage practices, health checks enable faster recovery and higher-resilience applications.

After the code is instrumented, you can configure cloud environment capabilities or external monitoring tools to periodically probe these health endpoints:

* The cloud environment, such as Kubernetes, can be configured to periodically poll health endpoints to determine whether a service instance is responsive and ready to accept traffic.

* External monitoring tools can be used to proactively alert when an unhealthy status is detected or for calculating health and availability statistics and key performance indicators (KPIs).

### Writing health check API endpoints

There are two main types  of health checks: 

* **Shallow health checks:**  only returns  a healthy response when the endpoint is invoked. In this case, no extra checks are done on external dependencies, comparable to the liveness probe of Kubernetes. It will simply tell that the application is live, but won’t tell anything whether requests will fail due to failing dependencies.

* **Deep health checks:** returns the actual state of dependencies. In this case, extra checks are done whether the connections on external dependencies are in a healthy state. This is comparable to the readiness probe of Kubernetes. These checks can be done by actually executing a request against the dependency. For example running a query against a database.

In certain cases, the microservice may have faullback mechanisms in place to deal with dependency failures. It can be beneficial to expose the fallback mechanisms through an alternative response code.

Determining how much deep health checks are needed and how they are implemented depends per individual case. Simply checking whether a connection is still open could be enough in one situation. Integrating checks whether the interaction can be done could be more appropriate on other situations. They key is to find the right balance. Expensive checks, like running heavy queries, should be avoided since this slows down the response and can create stability issues.


#### Key considerations

* Depending on the deemed state of the dependencies, an appropriate HTTP return code and JSON object is returned. The most common responses are as follows:
  * Healthy (`2xx` codes): ``{"status": "pass"}`` (or `ok` or `up`)
  * Healthy with concerns (`3xx` codes): ``{"status": "warn"}``
  * Unhealthy (`4xx-5xx` codes): ``{"status": "fail"}`` (or `error` or `down`)
* The response must be explicitly defined as **non-cachable** to avoid any incorrect statuses from being returned by the introduction of caching network equipment or similar.
* Checking on **dependencies** doesn't mean calling the health check endpoints of downstream services, as they should already be monitored on their own. Instead, consider verifying the health of the references that your application has to downstream services. Those references might be a JMS connection to IBM® WebSphere® MQ or an initialized Kafka consumer or producer. If you check the viability of internal references to downstream services, cache the result to minimize the impact that health checking has on your application.
* Many **libraries** are available for popular programming languages, such as Node.js, Java™, Go, and Python. The libraries provide a framework for implementing health checks, such as cloud-health-connect from CloudNativeJS, MicroProfile Health from OpenLiberty, and many others.
* health check endpoints must be **protected from public access** to prevent exposing your service to potential malicious attacks. One thing to consider when you choose a monitoring tool and framework is that not all them can be configured to include credentials with the health verification request. A few tools that can be configured in such a way are IBM Cloud™ Availability Monitoring, New Relic, Pingdom, and Datadog.  

#### Examples

* shallow

  ```java
  Route.add('health', Method='GET') {
    headers = {'http_status', 200, 'cache-control': 'no-cache'}
    body = {'status', 'pass'}
  }
  ```

* deep

  ```java
  Route.add('health', Method='GET') {
    If (userdb.connect() == "successful") {
      headers = {'http_status', 200, 'cache-control': 'no-cache'}
      body = {'status', 'pass'}
    }
    Else {
      headers = {'http_status', 500, 'cache-control': 'no-cache'}
      body = {'status', 'fail'}
    }
  }
  ```

* with fallback for dependencies

  ```java
  Route.add('health', Method='GET') {
    If (userdb.connect() == "successful") {
      headers = {'http_status', 200, 'cache-control': 'no-cache'}
      body = {'status', 'pass'}
    }
    Elseif (backup.connect() == "successful") {
      headers = {'http_status', 303, 'cache-control': 'no-cache'}
      body = {'status', 'warn - backup-storage available'}
    }
    Else {
      headers = {'http_status', 500, 'cache-control': 'no-cache'}
      body = {'status', 'fail'}
    }
  }
  ```

### Cloud environment resilience capabilities

#### Health checks in Kubernetes

Kubernetes implements two types of health checks that can be used in conjunction:

* **Liveness** probes are used to determine whether the Pod (where the container runs) needs to be replaced. If your service’s liveness probe start failing, Kubernetes removes the Pod and starts a new one to replace it.

* **Readiness** probes are used to determine whether the container is ready to handle requests. Kubernetes doesn't route work to a container with a failing readiness probe, but doesn't remove it. A readiness probe can fail if a service isn't finished initializing or is otherwise busy, overloaded, or unable to process requests. As Kubernetes gains more insight into a Pod’s health status, it makes decisions about traffic-routing and load balancing.

### Monitoring health check endpoints

Many the commercial and open source monitoring solutions include an HTTP-probing feature. The commercial solutions include IBM Cloud Availability Monitoring, New Relic, Pingdom, and Datadog. The open source options include Prometheus Blackbox exporter, InfluxData, and Telegraf.

If your application is running on cloud environments such as Kubernetes or Cloud Foundry and you configured health probes to monitor and restore state of your application components, do you still need to plan to configure monitoring of health check endpoints? The answer is "yes", for these reasons:

* Kubernetes health probes are focused on ensuring that the running containers are working correctly and making intelligent decisions about traffic-routing and load balancing. You still want to consider calculating metrics on overall availability, variability (geo and low/high traffic periods), deterioration, and other KPIs.

* Kubernetes only checks the status code that is returned by the health check probes. The other useful information that you might have captured in the response body isn't evaluated.

* It's also possible that the probes are failing and the Pods are in a continuous starting-crash loop. You want to be notified if that is happening.

* Restarting a container might improve service reliability and availability, but it can mask issues. For example, to ultimately resolve underlying issues, it's important to monitor how frequently containers are restarted.

* It's useful to run health checks from different on-premises or hosted locations to measure and compare response times. Ideally, you want to monitor applications from locations that are close to customers to get an accurate view of the performance from each location. It can also be helpful to decide on the deployment location, or locations, for the application.

* In addition to running testing to inform on uptime, it's useful to run testing to gather and alert on the performance of critical business transactions and the most common navigation paths.

### Further Reading

* Liveness and Readiness Probes in Kubernetes: [https://kubernetes.io/docs/tasks/configure-podcontainer/configure-liveness-readiness-probes/](https://kubernetes.io/docs/tasks/configure-podcontainer/configure-liveness-readiness-probes/)

* Kubernetes Liveness and Readiness Probes: How to Avoid Shooting Yourself in the Foot: [https://blog.colinbreck.com/kubernetes-liveness-and-readiness-probes-how-to-avoid-shootingyourself-in-the-foot/](https://blog.colinbreck.com/kubernetes-liveness-and-readiness-probes-how-to-avoid-shootingyourself-in-the-foot/)

* Utilizing Kubernetes Liveness and Readiness Probes to Automatically Recover From Failure: [https://medium.com/spire-labs/utilizing-kubernetes-liveness-and-readiness-probes-to-automaticallyrecover-from-failure-2fe0314f2b2e](https://medium.com/spire-labs/utilizing-kubernetes-liveness-and-readiness-probes-to-automaticallyrecover-from-failure-2fe0314f2b2e)

* Implement health check APIs for microservices: [https://www.ibm.com/cloud/garage/practices/manage/health-check-apis](https://www.ibm.com/cloud/garage/practices/manage/health-check-apis)

* Kubernetes Readiness & Liveliness Probes — Best Practices: [https://medium.com/metrosystemsro/kubernetes-readiness-liveliness-probes-best-practices86c3cd9f0b4a](https://medium.com/metrosystemsro/kubernetes-readiness-liveliness-probes-best-practices86c3cd9f0b4a)

* Kubernetes and Containers Best Practices - Health Probes: [https://www.magalix.com/blog/kubernetes-and-containers-best-practices-health-probes](https://www.magalix.com/blog/kubernetes-and-containers-best-practices-health-probes)

The following documents provide a practical example of creating liveness and readiness probe endpoint for:

* Node.js - [https://cloud.ibm.com/docs/node?topic=nodejs-node-healthcheck](https://cloud.ibm.com/docs/node?topic=nodejs-node-healthcheck)

* Spring Boot - [https://cloud.ibm.com/docs/java?topic=java-spring-healthcheck](https://cloud.ibm.com/docs/java?topic=java-spring-healthcheck)

* Microprofile and Jakarta EE - [https://cloud.ibm.com/docs/java?topic=java-jaxrs-healthcheck](https://cloud.ibm.com/docs/java?topic=java-jaxrs-healthcheck)

Popular frameworks (not intended as an exhaust list)

* Node.js:
  * [https://github.com/CloudNativeJS/cloud-health-connect](https://github.com/CloudNativeJS/cloud-health-connect)
  * [https://github.com/broadly/node-healthchecks](https://github.com/broadly/node-healthchecks)
  * [https://cloud.ibm.com/docs/node?topic=nodejs-node-healthcheck](https://cloud.ibm.com/docs/node?topic=nodejs-node-healthcheck)
* Java
  * [https://www.ibm.com/support/knowledgecenter/en/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_microprofile_healthcheck.html](https://www.ibm.com/support/knowledgecenter/en/SSEQTP_liberty/com.ibm.websphere.wlp.doc/ae/twlp_microprofile_healthcheck.html)
  * [https://openliberty.io/guides/microprofile-health.html](https://openliberty.io/guides/microprofile-health.html)
  * [https://github.com/OpenLiberty/guide-microprofile-health](https://github.com/OpenLiberty/guide-microprofile-health)
  * [https://github.com/strengthened/prometheus-healthchecks](https://github.com/strengthened/prometheus-healthchecks)
* Go:
  * [https://github.com/dimiro1/health](https://github.com/dimiro1/health)
  * [https://github.com/etherlabsio/healthcheck](https://github.com/etherlabsio/healthcheck)
  * [https://github.com/heptiolabs/healthcheck](https://github.com/heptiolabs/healthcheck)
* Python:
  * Basic Python examples [https://github.com/ibm-cloud-architecture/build-tomanage/blob/master/HealthCheckAPIs/python](https://github.com/ibm-cloud-architecture/build-tomanage/blob/master/HealthCheckAPIs/python)
  * Runscope Python HealthCheck example [https://github.com/Runscope/healthcheck](https://github.com/Runscope/healthcheck)

## Activities and Responsibilities of Application Teams

To improve availability and reliability, application should adopt **Health Check API** practice during software development life cycle.  The section describes general activities and responsibilities application team in related to Health Check API.

* Add **Health Check API** related stories into backlog.
* Include **Health Check API** section in application design document. The follow illustrates a sample *Health Check API** section in application design document.

> ## Health Check API
> All services of this application will implement the following health check API endpoints to validate the status of designated services and all its dependencies. 
>   
> - Liveness endpoint: checks if the application instance (pod in Kubernetes terminology) is still running.    
> - Readiness endpoint: determines if an application instance is ready to service requests. If any dependency (e.g. DynamoDB, MQ, etc.) or internal component is not in ready state, the readiness endpoint will return error state with corresponding return code.   
>  
> These health check API endpoints are private and should not expose to public.   
> Liveness and readiness endpoints will integrate with OpenShift (Kubernetes) liveness and readiness probe to improve availability and reliability.   
> During testing stage of CI/CD pipeline, a pipeline step will verify health check API endpoints. 
>
>  
> Service Health Check API endpoint pattern: 
> - Liveness endpoint: http://HOSTNAME:PORT/health/live
> - Readiness endpoint: http://HOSTNAME:PORT/health/ready
> 
> *HOSTNAME* and *PORT* are determined by running environment. In local developer machine, *HOSTNAME* usually is localhost and the *PORT* must be unique locally to avoid conflict among services. In OpenShift, *HOSTNAME* usually follow <SERVICE_NAME>-<PROJECT_NAME>.<APPLICATION_DOMAIN> pattern, e.g. *service1-MyProject.apps.rosa.aws.com* in which <SERVICE_NAME>=service1, <PROJECT_NAME>=MyProject, and <APPLICATION_DOMAIN>=apps.rosa.aws.com 
   
* Implement **Health Check API** as described in **Health Check API** section of application design document to provide Health Check API endpoints. Every service provided by the application should provide **Health Check API** endpoints. For example, if application has 3 services, all 3 services should provide **Health Check API** endpoints.
* Test **Health Check API** endpoints appropriately in various runtimes, including local developer machine and OpenShift, or other target runtime and platform environments.
* Include **Health Check API** endpoints testing in CI/CD pipeline as part of quality verification.
* Integrate **Health Check API** endpoints with liveness and readiness probe of target platform, e.g. OpenShift (ROSA).
* Monitor **Health Check API** endpoints with designated monitoring tool and define alerts and event rules.
* Document **Health Check API** information for reference.


## Code Samples

* [Sample Spring Boot hello-world microservice with health check](./spring-boot-sample)
* [RAP Sample: Quarkus API running on OpenShift with health check](https://git.delta.com/ccoe/implementation-patterns/quarkus-api-with-cache-on-openshift) - here are the 
[details on how it was built and the health check endpoints](./contributing-to-rap.md).

