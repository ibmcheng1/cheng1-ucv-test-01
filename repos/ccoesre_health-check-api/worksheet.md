

### Review Worksheet

* [ ] [Introduction](./README.md)
  * Best practices, example implementations, and the use of the health check API;
  * How to implement health check APIs.

* [ ] Determine how to use the health check API
  * [ ] External monitoring tools  
  * [ ] Kubernetes liveness or readiness probes

* [ ] Discuss the level of details to be provided through the health check API
  * [ ] Microservice operational status  
  * [ ] Ability to connect to the downstream dependent services or middleware
  * [ ] Component execution times
  * [ ] Downstream services connection times
* [ ]  Determine health checks to develop
  * [ ] Simple alive health check API
  * [ ] Extended end-to-end health check
  * [ ] Health check thresholds
* [ ] Discuss the format of the health check API response
* [ ] Discuss testing requirements. All health APIs must have an automated test that is part of a continuous integration (CI) pipeline.
  * [ ] Automated tests for simple health check run in the pipeline
  * [ ] Automated Extended end-to-end health check tested in the pipeline
  * [ ] Health check thresholds alerts implemented for out of limits
* [ ] Define the health check API documentation or reference manual.
* [ ] next steps


Three steps to get there:
* Cupcake: A simple up / down check
* Birthday cake:
  * A more quantitative result, paired with a deeper testing of functionality.
  * Differentiating between liveness and readiness.
* Wedding cake
  * Automatic checking of any dependent interfaces as part of the health check
  *  Inclusion of more KPIs for performance or response time
