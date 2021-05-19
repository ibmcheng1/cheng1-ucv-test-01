/*
 * IBM Confidential OCO Source Material
 * 5724-J34 (C) COPYRIGHT International Business Machines Corp. 2009, 2016
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 *
 * $HeadURL$
 * $Id$
 *
 * Change Activity:
 *
 * Reason       Version   Date         Userid    Change Description
 * ------------ --------- ------------ --------- ---------------------------------------
 * b18584       XS7.1     03/19/2010   jaredp    Added CATALOG_SERVICES_PROPERTY and CATALOG_SERVICES_WCCM
 * b19212       XS7.1     04/19/2010   jaredp    Added CWOBJ3141W, updated CWOBJ0049W and CWOBJ0051W
 * b19522       XS7.1     04/23/2010   jaredp    Added FILES_DO_NOT_EXIST_CWOBJ0904
 * b19720       XS7.1     05/04/2010   jaredp    Added messages for FilePasswordEncoder class
 * b19292       XS7.1     05/05/2010   jaredp    Added INVALID_RESOURCE_CWOBJ1403E
 * b19612       XS7.1     05/13/2010   jaredp    Added CWOBJ3142I, exact copy of CWOBJ3141W but an info message
 * b19996       XS7.1     05/17/2010   jaredp    Removed CWOBJ0054W. Added INFOCENTER_CREATING_CATALOG_SERVICE_DOMAINS.
 * b20788       7.1 fix1  07/16/2010   vandersn  swap role with primary
 * b21035       XS7.1     08/18/2010   jhanders  Add TransactionManager function to manage transaction timeout
 * b22228       7.1.1      1/19/2011   kulack    key byte wrappers.
 * b22596       7.1       03/15/2011   koehler   Need to dump out the ORB properties
 * b23160       7.1.0.3   05/06/2011   jhanders  Add ability to configure JMX SSL port
 * b23976       7.1.1.0   06/30/2011   koehler   MMR: Intra-Domain support
 * b24420       7.1.1.0   08/11/2011   kristip   Start adding Exception messages for translation
 * b22328       7.1.1.0   09/27/2011   vanhill   Better message for test connection failure.
 * b25240       7.1.1.0   10/20/2011   koehler   Send message when both Loader class and container scope are specified.
 * b25419       8.5       01/17/2012   vanhill   Provide customers with configuration messages if heap size > threshold
 * b24416       7.1.1.1   01/18/2012   jckrueg   Fix Dynacache fail-fast message.
 * b25931       7.1.1.1   01/18/2012   vanhill   Add multi-platform support for restart.
 *    215       8.6       03/21/2012   scheiern  Remove static and final keywords for .NET compatibility.  Fix closing <pre> to </pre>.
 * t10276       8.6       07/09/2012   chenp     Task: metadata propagation enabled var  per backing map basis
 * t10331       8.6       07/31/2012   kobylin   Replication health: Aggregate data from new container server agent and log warnings when replication health issues are found.
 */

package com.ibm.ws.xs;

/**
 * WARNING: Do not use the static or final keywords on the Strings. These are being removed to ease the dual use of this
 *           file in the .NET/C# client.  These keywords are implicit in a Java interface and are not needed.  If added, they
 *           will break the XSNET build.
 * 
 * To reduce chaos in this file, please do the following:
 * 1. Add your messages to the proper nlsprops file (ObjectGridMessages.nlsprops)
 * 2. Find the right section for your message (individual words/phrases, help text translation, exceptions, CWOBJ messages)
 * 3. Put your CWOBJ message in numerical order.
 * 
 * @author kristip
 * 
 */
public interface NLSConstants {
    /**
     * The bundle containing the messages for this constants file.
     */
    public String TR_RESOURCE_BUNDLE_NAME = "com.ibm.ws.objectgrid.resources.ObjectGridMessages";

    // these trace groups are here instead of the regular constants files because some of the revisioning code
    // is in wxs.utils and we'd have a circular dependency between wxs.utils and objectgrid components.
    public String TR_GROUP_NAME = "WXS";

    public String TR_REVISION_GROUP_NAME = "WXSRevision";

    public String TR_REVISION_LITE_GROUP_NAME = "WXSRevisionLite";

    public String TR_STREAM_GROUP_NAME = "WXSStream";

    public String TR_OH_REVISION_GROUP_NAME = "OHWXSRevision";
    
    public String TR_COLLISION_GROUP_NAME = "WXSCollision";
    
    // Assorted constants to use in other messages

    public String SERVER = "SERVER";

    public String CLIENT = "CLIENT";

    public String SYNC_REPLICA = "SYNC_REPLICA";

    public String TEMP_SYNC_REPLICA = "TEMP_SYNC_REPLICA";

    public String ASYNC_REPLICA = "ASYNC_REPLICA";

    public String TEMP_ASYNC_REPLICA = "TEMP_ASYNC_REPLICA";

    public String PRIMARY = "PRIMARY";

    public String TEMP_PRIMARY = "TEMP_PRIMARY";

    public String INACTIVE = "INACTIVE";

    public String SYNC = "SYNC";

    public String ASYNC = "ASYNC";

    public String EMBEDDED = "EMBEDDED";

    public String EMBEDDED_PARTITION = "EMBEDDED_PARTITION";

    public String STATIC_TOPOLOGY = "STATIC_TOPOLOGY";

    public String DYNAMIC_TOPOLOGY = "DYNAMIC_TOPOLOGY";

    public String NEW_FEATURES = "NEW_FEATURES";

    public String CATALOG_SERVICE_PROPERTY = "CATALOG_SERVICE_PROPERTY";

    public String CATALOG_SERVICE_WCCM = "CATALOG_SERVICE_WCCM";

    public String INFOCENTER_CREATING_CATALOG_SERVICE_DOMAINS = "INFOCENTER_CREATING_CATALOG_SERVICE_DOMAINS";

    public String CONNECTION_SUCCEEDED = "CONNECTION_SUCCEEDED";

    public String CONNECTION_FAILED = "CONNECTION_FAILED";

    public String KEY = "KEY";

    public String VALUE = "VALUE";

    public String FOREIGN = "FOREIGN";

    public String DOMESTIC = "DOMESTIC";

    public String COMMITTED = "COMMITTED";

    public String ROLLED_BACK = "ROLLED_BACK";

    public String NONE = "NONE";

    public String SHORT = "SHORT";

    public String RELAXED = "RELAXED";

    public String SUSPENDED = "SUSPENDED";

    public String RESUMED = "RESUMED";

    public String TRIGGERED = "TRIGGERED";

    public String LINKRETRY="LINKRETRY";
    
    public String LINKNORETRY="LINKNORETRY";
    
    public String SERVER_PROPERTIES = "SERVER_PROPERTIES";

    public String SYSTEM_PROPERTIES = "SYSTEM_PROPERTIES";

    public String UP = "UP";

    public String DOWN = "DOWN";

    public String STOP = "STOP";

    public String DEMOTE = "DEMOTE";

    public String CAT = "CAT";

    public String CON = "CON";

    public String STOPPED = "STOPPED";

    public String ADDED = "ADDED";

    public String STARTED = "STARTED";
    
    public String TERMINATE="TERMINATE";

    public String TEARDOWN="TEARDOWN";
    
    public String CLIENT_ONLY_INSTALL="CLIENT_ONLY_INSTALL";
    
    public String UNSUPPORTED_PROCESS_TYPE = "UNSUPPORTED_PROCESS_TYPE";
    
    public String ZOS = "ZOS";
    
    public String ENABLED = "ENABLED";
    
    public String DISABLED = "DISABLED";
    
    public String INVALID = "INVALID";
    
    public String MIXED = "MIXED";
    
    public String PROPERTY_KEY_DESC="PROPERTY_KEY_DESC";
    
    public String CURRENT_PROPERTY_SETTING_DESC="CURRENT_PROPERTY_SETTING_DESC";
    
    public String PREVIOUS_PROPERTY_SETTING_DESC="PREVIOUS_PROPERTY_SETTING_DESC";
    
    public String PROPERTY_MESSAGE_DESC="PROPERTY_MESSAGE_DESC";
    
    public String TRANSPORT_COMMUNICATION_FAILURE_DETECTION_STATUS_DESC="TRANSPORT_COMMUNICATION_FAILURE_DETECTION_STATUS_DESC";
    
    public String INVALID_TRANSPORT_COMMUNICATION_FAILURE_DETECTION_TYPE="INVALID_TRANSPORT_COMMUNICATION_FAILURE_DETECTION_TYPE";
    
    public String UNEXPECTED_TRANSPORT_COMMUNICATION_FAILURE_DETECTION_ERROR="UNEXPECTED_TRANSPORT_COMMUNICATION_FAILURE_DETECTION_ERROR";

    // -------- COMMAND-LINE Help Text --------
    // start INVALID_ARGS_CWOBJ2515 valid arguments

    public String CMDLINE_START_CATALOG_SERVER = "CMDLINE_START_CATALOG_SERVER";

    public String CMDLINE_SERVER_OPTIONS = "CMDLINE_SERVER_OPTIONS";

    public String CMDLINE_START_CONTAINER_SERVER = "CMDLINE_START_CONTAINER_SERVER";

    public String CMDLINE_OBJECTGRID_FILE = "CMDLINE_OBJECTGRID_FILE";

    public String CMDLINE_OBJECTGRID_URL = "CMDLINE_OBJECTGRID_URL";

    public String CMDLINE_CATALOG_SERVER_OPTIONS = "CMDLINE_CATALOG_SERVER_OPTIONS";

    public String CMDLINE_CATALOG_SERVICE_ENDPOINTS = "CMDLINE_CATALOG_SERVICE_ENDPOINTS";

    public String CMDLINE_QUORUM = "CMDLINE_QUORUM";

    public String CMDLINE_HEARTBEAT = "CMDLINE_HEARTBEAT";

    public String CMDLINE_CLUSTER_FILE = "CMDLINE_CLUSTER_FILE";

    public String CMDLINE_CLUSTER_URL = "CMDLINE_CLUSTER_URL";

    public String CMDLINE_CLUSTER_SECURITY_FILE = "CMDLINE_CLUSTER_SECURITY_FILE";

    public String CMDLINE_CLUSTER_SECURITY_URL = "CMDLINE_CLUSTER_SECURITY_URL";

    public String CMDLINE_DOMAIN = "CMDLINE_DOMAIN";

    public String CMDLINE_LISTENER_HOST = "CMDLINE_LISTENER_HOST";

    public String CMDLINE_LISTENER_PORT = "CMDLINE_LISTENER_PORT";

    public String CMDLINE_SERVER_PROPS = "CMDLINE_SERVER_PROPS";

    public String CMDLINE_JMX_SERVICE_PORT = "CMDLINE_JMX_SERVICE_PORT";

    public String CMDLINE_JMX_CONNECTOR_PORT = "CMDLINE_JMX_CONNECTOR_PORT";

    public String CMDLINE_CONTAINER_SERVER_OPTIONS = "CMDLINE_CONTAINER_SERVER_OPTIONS";

    public String CMDLINE_CONTAINER_CATALOG_SERVICE_ENDPOINTS = "CMDLINE_CONTAINER_CATALOG_SERVICE_ENDPOINTS";

    public String CMDLINE_DEPLOYMENT_POLICY_FILE = "CMDLINE_DEPLOYMENT_POLICY_FILE";

    public String CMDLINE_DEPLOYMENT_POLICY_URL = "CMDLINE_DEPLOYMENT_POLICY_URL";

    public String CMDLINE_HA_MANAGER_PORT = "CMDLINE_HA_MANAGER_PORT";

    public String CMDLINE_ZONE = "CMDLINE_ZONE";

    public String CMDLINE_COMMON_OPTIONS = "CMDLINE_COMMON_OPTIONS";

    public String CMDLINE_TRACE_SPEC = "CMDLINE_TRACE_SPEC";

    public String CMDLINE_TRACE_FILE = "CMDLINE_TRACE_FILE";

    public String CMDLINE_TIMEOUT = "CMDLINE_TIMEOUT";

    public String CMDLINE_SCRIPT = "CMDLINE_SCRIPT";

    public String CMDLINE_JVM_ARGS = "CMDLINE_JVM_ARGS";

    public String CMDLINE_PARAMETER_AFTER = "CMDLINE_PARAMETER_AFTER";

    public String CMDLINE_JVMARGS_USED = "CMDLINE_JVMARGS_USED";

    public String CMDLINE_STOP_HELP = "CMDLINE_STOP_HELP";

    public String CMDLINE_SERVER_NAMES = "CMDLINE_SERVER_NAMES";

    public String CMDLINE_OPTIONS = "CMDLINE_OPTIONS";

    public String CMDLINE_CLIENT_SECURITY = "CMDLINE_CLIENT_SECURITY";

    public String CMDLINE_FIX_HOST_PORT = "CMDLINE_FIX_HOST_PORT";

    // end INVALID_ARGS_CWOBJ2515 valid arguments
    // -------- COMMAND-LINE Help Text END --------

    // -------- COMMAND-LINE FilePasswordEncoder Messages START --------

    public String CMDLINE_FPE_ERR_FILE_TYPE = "CMDLINE_FPE_ERR_FILE_TYPE";

    public String CMDLINE_FPE_ERR_FILE_NAME_EMPTY = "CMDLINE_FPE_ERR_FILE_NAME_EMPTY";

    public String CMDLINE_FPE_ERR_PROPERTY_LIST_EMPTY = "CMDLINE_FPE_ERR_PROPERTY_LIST_EMPTY";

    public String CMDLINE_FPE_INFO_FILE_NAME_IS = "CMDLINE_FPE_INFO_FILE_NAME_IS";

    public String CMDLINE_FPE_ERR_INVALID_FILE = "CMDLINE_FPE_ERR_INVALID_FILE";

    public String CMDLINE_FPE_ERR_CANNOT_OPEN_FILE = "CMDLINE_FPE_ERR_CANNOT_OPEN_FILE";

    public String CMDLINE_FPE_ERR_PASSWORD_ENCODING_EXCEPTION = "CMDLINE_FPE_ERR_PASSWORD_ENCODING_EXCEPTION";

    public String CMDLINE_FPE_ERR_CANNOT_READ_FROM_FILE = "CMDLINE_FPE_ERR_CANNOT_READ_FROM_FILE";

    public String CMDLINE_FPE_ERR_INVALID_XML_FILE = "CMDLINE_FPE_ERR_INVALID_XML_FILE";

    public String CMDLINE_FPE_ERR_PROPERTIES_NOT_FOUND = "CMDLINE_FPE_ERR_PROPERTIES_NOT_FOUND";

    public String CMDLINE_FPE_INFO_PASSWORDS_ALREADY_ENCODED = "CMDLINE_FPE_INFO_PASSWORDS_ALREADY_ENCODED";

    public String CMDLINE_FPE_ERR_FILE_NOT_FOUND = "CMDLINE_FPE_ERR_FILE_NOT_FOUND";

    public String CMDLINE_FPE_ERR_FILE_IO_EXCEPTION = "CMDLINE_FPE_ERR_FILE_IO_EXCEPTION";

    public String CMDLINE_FPE_ERR_CANNOT_CREATE_BACKUP_FILE = "CMDLINE_FPE_ERR_CANNOT_CREATE_BACKUP_FILE";

    public String CMDLINE_FPE_ERR_CANNOT_SAVE_PROPERTIES = "CMDLINE_FPE_ERR_CANNOT_SAVE_PROPERTIES";

    public String CMDLINE_FPE_ERR_CANNOT_LOAD_PROPERTIES = "CMDLINE_FPE_ERR_CANNOT_LOAD_PROPERTIES";

    public String CMDLINE_FPE_HELP_FILE_NAME = "CMDLINE_FPE_HELP_FILE_NAME";

    public String CMDLINE_FPE_HELP_PASSWORD_PROP_LIST = "CMDLINE_FPE_HELP_PASSWORD_PROP_LIST";

    public String CMDLINE_FPE_HELP_FILE_TYPE = "CMDLINE_FPE_HELP_FILE_TYPE";

    public String CMDLINE_FPE_HELP_MSG_WHERE = "CMDLINE_FPE_HELP_MSG_WHERE";

    public String CMDLINE_FPE_HELP_MSG_FILE_NAME = "CMDLINE_FPE_HELP_MSG_FILE_NAME";

    public String CMDLINE_FPE_HELP_MSG_PASSWORD_PROP_LIST = "CMDLINE_FPE_HELP_MSG_PASSWORD_PROP_LIST";

    public String CMDLINE_FPE_HELP_MSG_FILE_TYPE = "CMDLINE_FPE_HELP_MSG_FILE_TYPE";

    public String CMDLINE_TRANSPORT = "CMDLINE_TRANSPORT";

    // -------- COMMAND-LINE FilePasswordEncoder Messages END --------

    // messages for KeySearchAgent.java

    public String KSA_NULL_VALUE_RETURNED = "KSA_NULL_VALUE_RETURNED";

    public String KSA_OBJECT_CLASS_NOT_KNOWN_TO_SERVER = "KSA_OBJECT_CLASS_NOT_KNOWN_TO_SERVER";

    // ---------- KeySearchAgent messages END -------------------

    // Exception Section: Messages to be used in Exceptions that will be seen by customers

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} partition number
     * # {3} type of placement scope
     * TARGET_EXCEPTION_PLACEMENTSCOPE=Cannot find primary for {0}:{1}:{2}. The placement scope is set to {3}; only a collocated client is allowed.
     * </pre>
     */

    public String TARGET_EXCEPTION_PLACEMENTSCOPE = "TARGET_EXCEPTION_PLACEMENTSCOPE";

    /**
     * <pre>
     * NO_PRIMARY_REF=Unable to contact the primary shard during replication initialization.
     * </pre>
     */
    public String NO_PRIMARY_REF = "NO_PRIMARY_REF";

    /**
     * <pre>
     * # {0} service name
     * # {1} domain name
     * SERVICE_NOT_BOUND="The requested service {0} has not been bound in domain {1}
     * </pre>
     */
    public String SERVICE_NOT_BOUND = "SERVICE_NOT_BOUND";

    /**
     * <pre>
     * # {0} foreign domain name
     * # {1} retry time in milliseconds
     * RETRY_DOMAIN_LINK=The local domain failed to contact foreign domain, {0}, to link domains. The foreign domain is not available to accept requests. After an interval of {1} milliseconds, the connection is retried.
     * </pre>
     */
    public String RETRY_DOMAIN_LINK = "RETRY_DOMAIN_LINK";

    /**
     * <pre>
     * # {0} foreign domain name
     * RETRY_DOMAIN_LINK_CWOBJ4921=CWOBJ4921E: The foreign catalog service domain, {0}, is not currently available to accept requests. The local catalog service domain failed to contact foreign catalog service domain, {0}. Please try to establish link to the foreign domain again.
     * </pre>
     */
    public String RETRY_DOMAIN_LINK_CWOBJ4921 = "RETRY_DOMAIN_LINK_CWOBJ4921";

    /**
     * <pre>
     * # {0} foreign domain name
     * # {1} retry time in milliseconds.
     * DOMAIN_PING_FAILED=Attempt to ping foreign domain, {0}, failed.  Retrying ping in {1} milliseconds.
     * </pre>
     */
    public String DOMAIN_PING_FAILED = "DOMAIN_PING_FAILED";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} foreign endpoints
     * # do not translate establishLink
     * SAME_DOMAIN_NAMES_ESTABLISH=The local domain name and foreign domain name provided on the establishLink command are the same. A domain cannot be linked to itself. The local domain is {0}. The foreign domain name provided is {1} with foreign endpoints of {2}. Review the domain name configurations and verify the establishLink command parameters.
     * </pre>
     */
    public String SAME_DOMAIN_NAMES_ESTABLISH = "SAME_DOMAIN_NAMES_ESTABLISH";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} foreign endpoints
     * # do not translate dismissLink
     * SAME_DOMAIN_NAMES_DISMISS=The local domain name and foreign domain name provided on the dismissLink command are the same. A domain cannot be linked to itself. The local domain is {0}. The foreign domain name provided is {1} with foreign endpoints of {2}. Review the domain name configurations and verify the dismissLink command parameters.
     * </pre>
     */
    public String SAME_DOMAIN_NAMES_DISMISS = "SAME_DOMAIN_NAMES_DISMISS";

    /**
     * <pre>
     * # {0} provided domain name
     * # {1} actual domain name
     * # {2} provided endpoints
     * DOMAIN_ENDPOINT_MISMATCH="The domain name provided {0} does not match the configured domain name, {1}, of provided end points {2}.  Review the domain name configurations and verify the establishLink command parameters.
     * </pre>
     */
    public String DOMAIN_ENDPOINT_MISMATCH = "DOMAIN_ENDPOINT_MISMATCH";

    /**
     * <pre>
     * # {0} provided domain name
     * DISMISS_NO_DOMAIN=The provided foreign catalog service domain, {0}, is not currently linked.
     * </pre>
     */
    public String DISMISS_NO_DOMAIN = "DISMISS_NO_DOMAIN";

    /**
     * <pre>
     * # {0} domain name
     * # {1} objectgrid name
     * # {2} mapset name
     * # {3} partition number
     * CANNOT_FIND_PRIMARY_TARGET_FOR_OBJECTGRID=Cannot find primary for {0}:{1}:{2}:{3}.
     * </pre>
     */
    public String CANNOT_FIND_PRIMARY_TARGET_FOR_OBJECTGRID = "CANNOT_FIND_PRIMARY_TARGET_FOR_OBJECTGRID";

    /**
     * <pre>
     * # {0} domain name
     * # {1} objectgrid name
     * # {2} mapset name
     * # {3} partition number
     * # {4} type of placement strategy
     * TARGET_EXCEPTION_SHARD_DISCARDED=Cannot find primary for {0}:{1}:{2}:{3}. The shard is marked as discarded. The placement strategy is {4}.
     * </pre>
     */
    public String TARGET_EXCEPTION_SHARD_DISCARDED = "TARGET_EXCEPTION_SHARD_DISCARDED";

    /**
     * <pre>
     * # {0} causal exception/throwable message
     * TEST_CONNECTION_FAIL=The connection attempt to the catalog service domain failed. Verify that the catalog service is running. The following exception caused this error to occur: [{0}]
     * </pre>
     */
    public String TEST_CONNECTION_FAIL = "TEST_CONNECTION_FAIL";

    /**
     * <pre>
     * # {0} causal exception/throwable message
     * TEST_CONNECTION_TIMEOUT=The connection attempt to the catalog service domain timed out. Verify that the catalog service is running. The following exception caused this error to occur: [{0}]
     * </pre>
     */
    public String TEST_CONNECTION_TIMEOUT = "TEST_CONNECTION_TIMEOUT";

    /**
     * <pre>
     * # {0} Catalog server connection string
     * FAILED_TO_GET_LOCATION_SERVICE=Failed to get location service from {0}
     * </pre>
     */
    public String FAILED_TO_GET_LOCATION_SERVICE = "FAILED_TO_GET_LOCATION_SERVICE";

    /**
     * <pre>
     * # {0} Catalog server connection string
     * FAILED_TO_GET_REMOTE_PLACEMENT_SERVICE=Failed to get remote placement reference from {0}
     * </pre>
     */
    public String FAILED_TO_GET_REMOTE_PLACEMENT_SERVICE = "FAILED_TO_GET_REMOTE_PLACEMENT_SERVICE";

    // JMX Notifications
    /**
     * <pre>
     * # {0} The name of the server
     * SERVER_STARTED_NOTIFICATION=Server started: {0}
     * </pre>
     */
    public String SERVER_STARTED_NOTIFICATION = "SERVER_STARTED_NOTIFICATION";

    /**
     * <pre>
     * # {0} The name of the server
     * SERVER_STOPPED_NOTIFICATION=Server started: {0}
     * </pre>
     */
    public String SERVER_STOPPED_NOTIFICATION = "SERVER_STOPPED_NOTIFICATION";

    /**
     * <pre>
     * # {0} The name of the core group
     * CORE_GROUP_CHANGED_NOTIFICATION=Core group membership changed: {0}
     * </pre>
     */
    public String CORE_GROUP_CHANGED_NOTIFICATION = "CORE_GROUP_CHANGED_NOTIFICATION";

    /**
     * <pre>
     * # {0} The name of the server
     * # {1} The name of the core group
     * SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION=Server {0} has joined core group {1}
     * </pre>
     */
    public String SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION = "SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION";

    /**
     * <pre>
     * #Description for the messaging hub composite data type for a jmx notification
     * COMP_DATA_DESCRIPTION=Source and level of notificationn
     * </pre>
     */
    public String COMP_DATA_DESCRIPTION = "COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 1st field when building a messaging hub composite data type for a jmx notification
     * SOURCE_COMP_DATA_DESCRIPTION=Source server for the notification
     * </pre>
     */
    public String SOURCE_COMP_DATA_DESCRIPTION = "SOURCE_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 2nd field when building a messaging hub composite data type for a jmx notification
     * SEVERITY_COMP_DATA_DESCRIPTION=Severity level of the notification
     * </pre>
     */
    public String SEVERITY_COMP_DATA_DESCRIPTION = "SEVERITY_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 3rd field when building a messaging hub composite data type for a jmx notification
     * ORIG_TYPE_COMP_DATA_DESCRIPTION=Original notification type
     * </pre>
     */
    public String ORIG_TYPE_COMP_DATA_DESCRIPTION = "ORIG_TYPE_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 4th field when building a messaging hub composite data type for a jmx notification
     * TIMESTAMP_COMP_DATA_DESCRIPTION=Time stamp from source server
     * </pre>
     */
    public String TIMESTAMP_COMP_DATA_DESCRIPTION = "TIMESTAMP_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 5th field when building a messaging hub composite data type for a jmx notification
     * NEXT_STEP_COMP_DATA_DESCRIPTION=Advised resolution or debug step
     * </pre>
     */
    public String NEXT_STEP_COMP_DATA_DESCRIPTION = "NEXT_STEP_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 6th field when building a messaging hub composite data type for a jmx notification
     * CATEGORY_COMP_DATA_DESCRIPTION=Category of notification
     * </pre>
     */
    public String CATEGORY_COMP_DATA_DESCRIPTION = "CATEGORY_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 7th field when building a messaging hub composite data type for a jmx notification
     * FAILURE_EVENT_COMP_DATA_DESCRIPTION=Prior failure event which current event tries to recover from.
     * </pre>
     */
    public String FAILURE_EVENT_COMP_DATA_DESCRIPTION = "FAILURE_EVENT_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 8th field when building a messaging hub composite data type for a jmx notification
     * SERVER_AFFECTED_COMP_DATA_DESCRIPTION=Server affected by the event
     * </pre>
     */
    public String SERVER_AFFECTED_COMP_DATA_DESCRIPTION = "SERVER_AFFECTED_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 9th field when building a messaging hub composite data type for a jmx notification
     * EXCEPTION_COMP_DATA_DESCRIPTION=Exception or exception stack
     * </pre>
     */
    public String EXCEPTION_COMP_DATA_DESCRIPTION = "EXCEPTION_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * #Description for the 10th field when building a messaging hub composite data type for a jmx notification
     * EXT_POINT_COMP_DATA_DESCRIPTION=Generic extension point that the catalog server can use for extra processing
     * </pre>
     */
    public String EXT_POINT_COMP_DATA_DESCRIPTION = "EXT_POINT_COMP_DATA_DESCRIPTION";

    /**
     * <pre>
     * # {0} server name and port
     * # {1} remote transport
     * # {2} local transport
     * MIXED_TRANSPORT=The remote server on {0} uses the {1} transport, but the {2} transport is enabled locally.
     * </pre>
     */
    public String MIXED_TRANSPORT = "MIXED_TRANSPORT";

    /**
     * <pre>
     * # {0} local transport
     * # {1} remote transport
     * MIXED_TRANSPORT2=The local server has the {0} transport enabled locally, but received a request from a remote server with the {1} transport enabled. 
     * </pre>
     */
    public String MIXED_TRANSPORT2 = "MIXED_TRANSPORT2";

    /**
     * <pre>
     * # {0} server name and port
     * XIO_RECONNECT_FAILED=An attempt to reconnect to {0} has failed
     * </pre>
     */
    public String XIO_RECONNECT_FAILED = "XIO_RECONNECT_FAILED";

    /**
     * <pre>
     * # {0} the list of invalid partitions
     * ILLEGAL_PARTITION_ID=The following partitions are not valid: {0}
     * </pre>
     */
    public String ILLEGAL_PARTITION_ID = "ILLEGAL_PARTITION_ID";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * CLIENT_NO_CONFIG=There was a client security configuration error. The catalog server at endpoint {0}:{1} is configured with SSL, but the client does not have a security configuration. The client security configuration is null.
     * </pre>
     */
    public String CLIENT_NO_CONFIG = "CLIENT_NO_CONFIG";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * CLIENT_SECURITY_NOT_ENABLED=There was a client security configuration error. The catalog server at endpoint {0}:{1} is configured with SSL, but security is not enabled on the client configuration.
     * </pre>
     */
    public String CLIENT_SECURITY_NOT_ENABLED = "CLIENT_SECURITY_NOT_ENABLED";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * CLIENT_SSL_NOT_CONFIGURE=There was a client security configuration error. The catalog server at endpoint {0}:{1} is configured with SSL, but client does not have SSL configured. The client SSL configuration is null.
     * </pre>
     */
    public String CLIENT_SSL_NOT_CONFIGURE = "CLIENT_SSL_NOT_CONFIGURE";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * CLIENT_SSL_TCPIP_MISMATCH=There was a client security configuration error. The catalog server at endpoint {0}:{1} is configured with SSL, but the client is configured with a transportType set to TCP/IP. Change the client transportType to SSL-Supported or SSL-Required.
     * </pre>
     */
    public String CLIENT_SSL_TCPIP_MISMATCH = "CLIENT_SSL_TCPIP_MISMATCH";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * CLIENT_TCPIP_SSL_MISMATCH=The catalog server at endpoint {0}:{1} is configured without SSL, but the client is configured with a transportType set to SSL-Required. Change the client transportType to TCP/IP or SSL-Supported.
     * </pre>
     */
    public String CLIENT_TCPIP_SSL_MISMATCH = "CLIENT_TCPIP_SSL_MISMATCH";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * MAC_FAILED_CLIENT=The client failed to verify the Message Authentication Code (MAC) from server at endpoint {0}:{1}.
     * </pre>
     */
    public String MAC_FAILED_CLIENT = "MAC_FAILED_CLIENT";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * MAC_FAILED_SERVER=The server failed to verify the Message Authentication Code (MAC) from the client.
     * </pre>
     */
    public String MAC_FAILED_SERVER = "MAC_FAILED_SERVER";

    /**
     * <pre>
     * GEN_EXCEPTION=An exception occurred while initializing the {0}: {1}.
     * </pre>
     */
    public String GEN_EXCEPTION = "GEN_EXCEPTION";

    /**
     * <pre>
     * AUTH_SECRET_MISMATCH_SERVER=The authenticationSecret setting does not match on the client and server. The server authenticationSecret is defined. The client authenticationSecret is not defined.
     * </pre>
     */
    public String AUTH_SECRET_MISMATCH_SERVER = "AUTH_SECRET_MISMATCH_SERVER";

    /**
     * <pre>
     * AUTH_SECRET_MISMATCH_CLIENT=The authenticationSecret setting does not match on the client and server. The server authenticationSecret is not defined. The client authenticationSecret is defined.
     * </pre>
     */
    public String AUTH_SECRET_MISMATCH_CLIENT = "AUTH_SECRET_MISMATCH_CLIENT";

    /**
     * <pre>
     * CLIENT_INVALID_SEQ_LENGTH=The sequence bytes from the client for authentication validation was an invalid length.
     * </pre>
     */
    public String CLIENT_INVALID_SEQ_LENGTH = "CLIENT_INVALID_SEQ_LENGTH";

    /**
     * <pre>
     * # {0} Exception class
     * # {1} Exception message
     * MMR_LINK_FAIL_EXCEPTION=Received the following exception attempting to connect to the foreign domain: {0} : {1}
     * </pre>
     */
    public String MMR_LINK_FAIL_EXCEPTION = "MMR_LINK_FAIL_EXCEPTION";
    
    /**
     * <pre>
     * REMOVE_SHARDS_RESULT1=A removeExtraShards request is already running. No action taken.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT1 = "REMOVE_SHARDS_RESULT1";
    /**
     * <pre>
     * REMOVE_SHARDS_RESULT2=No containers found for the requested ObjectGrid.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT2 = "REMOVE_SHARDS_RESULT2";
    
    /**
     * <pre>
     * # {0} Exception
     * REMOVE_SHARDS_RESULT3=Exception received. {0}
     */
    public String REMOVE_SHARDS_RESULT3 = "REMOVE_SHARDS_RESULT3";
    
    /**
     * <pre>
     * REMOVE_SHARDS_RESULT4=Requests to containers completed.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT4 = "REMOVE_SHARDS_RESULT4";

    /**
     * <pre>
     * REMOVE_SHARDS_RESULT5=Requests to {0} containers launched
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT5 = "REMOVE_SHARDS_RESULT5";
    
    /**
     * <pre>
     * REMOVE_SHARDS_RESULT6=Fail over event detected on container {0}. The container name could not be resolved. The removeExtraShards request is canceled.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT6 = "REMOVE_SHARDS_RESULT6";

    /**
     * <pre>
     * REMOVE_SHARDS_RESULT7=Fail over event detected on container {0}. The bind information could not be found. The removeExtraShards request is canceled.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT7 = "REMOVE_SHARDS_RESULT7";
    
    /**
     * <pre>
     * REMOVE_SHARDS_RESULT8=The ObjectGrid {0} is set to CONTAINER placement scope. No action taken.
     * </pre>
     */
    public String REMOVE_SHARDS_RESULT8 = "REMOVE_SHARDS_RESULT8";

    public String NO_ACTION="NO_ACTION";
    public String PENALTY_BOX="PENALTY_BOX";
    public String MOVE_SHARD = "MOVE_SHARD";
    public String PRIMARY_BALANCE = "PRIMARY_BALANCE";
    public String MOVE_REPLICA = "MOVE_REPLICA";
    
    /**
     * <pre>
     * # {0} type provided
     * # {1} list of valid types
     * INVALID_FAILOVER_TYPE=The failover type {0} is not a valid type. Valid types include: {1}
     * </pre>
     */
    public String INVALID_FAILOVER_TYPE = "INVALID_FAILOVER_TYPE";

    /**
     * <pre>
     * # {0} time in milliseconds
     * EXCEEDED_MAX_RETRY_START_UP=Exceeded the maximum retry time ({0} milliseconds) for contacting the catalog server.
     * </pre>
     */
    public String EXCEEDED_MAX_RETRY_START_UP = "EXCEEDED_MAX_RETRY_START_UP";

    // CWOBJ Message Section: Add new CWOBJ messages in numerical order, not just at the beginning of this file.

    /**
     * <pre>
     * # {0} Method name that was called after initialization was completed.
     * ILLEGAL_STATE_EXCEPTION_CWOBJ0001=CWOBJ0001E: Method, {0}, was called after initialization completed.
     * ILLEGAL_STATE_EXCEPTION_CWOBJ0001.explanation=After initialization completes, certain method invocations are no longer accepted.
     * ILLEGAL_STATE_EXCEPTION_CWOBJ0001.useraction=Configuration methods must be called before initialization. Restructure the code so the configuration is completed before the runtime object is initialized. For example, on ObjectGrid, methods such as defineMap, setTransactionCallback, or setSecurityEnabled must be called before an ObjectGrid is used.
     * </pre>
     */
    public String ILLEGAL_STATE_EXCEPTION_CWOBJ0001 = "ILLEGAL_STATE_EXCEPTION_CWOBJ0001";

    /**
     * <pre>
     * # {0} exception
     * # {1} component
     * IGNORING_UNEXPECTED_EXCEPTION_CWOBJ0002=CWOBJ0002W: ObjectGrid component {1} is ignoring an unexpected exception: {0}.
     * IGNORING_UNEXPECTED_EXCEPTION_CWOBJ0002.explanation=An exception occurred, but the server will ignore the exception and continue to work on the current action.
     * IGNORING_UNEXPECTED_EXCEPTION_CWOBJ0002.useraction=Review the exception provided for any configuration errors. Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location.
     * </pre>
     */
    public String IGNORING_UNEXPECTED_EXCEPTION_CWOBJ0002 = "IGNORING_UNEXPECTED_EXCEPTION_CWOBJ0002";

    /**
     * <pre>
     * # {0} deprecated function
     * # {1} release number
     * # {2} replacement function or article to reference in documentation
     * DEPRECATED_FUNCTION_CWOBJ0003W=CWOBJ0003W: The {0} function was deprecated in the WebSphere eXtreme Scale {1} release and will be removed in a future release.  See {2} in the WebSphere eXtreme Scale documentation for more information.
     * DEPRECATED_FUNCTION_CWOBJ0003W.explanation=The function referenced in the message was deprecrated and should not be used. While the server will continue to work, the function will be removed in the future.
     * DEPRECATED_FUNCTION_CWOBJ0003W.useraction=Refer to the WebSphere eXtreme Scale documentation for the new function that should be used instead of the deprecated function.
     * </pre>
     */
    public String DEPRECATED_FUNCTION_CWOBJ0003W = "DEPRECATED_FUNCTION_CWOBJ0003W";

    /**
     * <pre>
     * # {0} method name
     * # {1} deprecated function
     * # {2} release number
     * # {3} replacement function or article to reference in documentation
     * DEPRECATED_FUNCTION_CWOBJ0004W=CWOBJ0004W: The {0} method is deprecated. The {1} function was deprecated in the WebSphere eXtreme Scale {2} release and will be removed in a future release.  See {3} in the WebSphere eXtreme Scale documentation for more information.
     * DEPRECATED_FUNCTION_CWOBJ0004W.explanation=The method and function referenced in the message was deprecrated and should not be used. While the server will continue to work, the function will be removed in the future.
     * DEPRECATED_FUNCTION_CWOBJ0004W.useraction=Refer to the WebSphere eXtreme Scale documentation for the new method and function that should be used instead of the deprecated function.
     * </pre>
     */
    public String DEPRECATED_FUNCTION_CWOBJ0004W = "DEPRECATED_FUNCTION_CWOBJ0004W";

    /**
     * <pre>
     * # {0} InterruptedException message
     * INTERRUPTED_EXCEPTION_CWOBJ0005=CWOBJ0005W: The thread created an java.lang.InterruptedException: {0}
     * INTERRUPTED_EXCEPTION_CWOBJ0005.explanation=A java.lang.InterruptedException occurred and woke up the waiting or sleeping sleep.
     * INTERRUPTED_EXCEPTION_CWOBJ0005.useraction=Check the exception message to see whether this interruption is expected. For example, if the user stopped the login panel. Otherwise, check for configuration or compatibility errors.
     * </pre>
     */
    public String INTERRUPTED_EXCEPTION_CWOBJ0005 = "INTERRUPTED_EXCEPTION_CWOBJ0005";

    /**
     * <pre>
     * # {0} Exception message
     * GENERAL_EXCEPTION_WARNING_CWOBJ0006=CWOBJ0006W: An exception occurred: {0}
     * GENERAL_EXCEPTION_WARNING_CWOBJ0006.explanation=An exception occurred during the runtime.
     * GENERAL_EXCEPTION_WARNING_CWOBJ0006.useraction=Check the exception message to see whether this is an expected exception. If it is not expected, check for configuration errors, network problems or other previous errors in the log. Also review the first failure data capture (FFDC) logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location.
     * </pre>
     */
    public String GENERAL_EXCEPTION_WARNING_CWOBJ0006 = "GENERAL_EXCEPTION_WARNING_CWOBJ0006";

    /**
     * <pre>
     * # {0} the variable or property name
     * # {1} the default value to be used
     * NULL_VALUE_WARNING_CWOBJ0007=CWOBJ0007W: The invalid value of null was specified for {0}. The default value of {1} will be used instead.
     * NULL_VALUE_WARNING_CWOBJ0007.explanation=The value null is invalid for the variable or property. A default value will be used.
     * NULL_VALUE_WARNING_CWOBJ0007.useraction=Replace null with a value appropriate for your deployment environment. Search on the variable or property name in the WebSphere eXtreme Scale documentation for valid values.
     * </pre>
     */
    public String NULL_VALUE_WARNING_CWOBJ0007 = "NULL_VALUE_WARNING_CWOBJ0007";

    /**
     * <pre>
     * # {0} the invalid value
     * # {1} The property name
     * INVALID_VALUE_ERROR_CWOBJ0008=CWOBJ0008E: The value {0} provided for the property {1} is invalid.
     * INVALID_VALUE_ERROR_CWOBJ0008.explanation=An invalid value was specified for the variable.
     * INVALID_VALUE_ERROR_CWOBJ0008.useraction=Replace the current invalid value with a value appropriate for your deployment environment. Search on the variable or property name in the WebSphere eXtreme Scale documentation for valid values.
     * </pre>
     */
    public String INVALID_VALUE_ERROR_CWOBJ0008 = "INVALID_VALUE_ERROR_CWOBJ0008";

    /**
     * <pre>
     * # {0} Message key string
     * MISSING_KEY_ERROR_CWOBJ0010=CWOBJ0010E: Message key {0} is missing. Caller is {1}.
     * MISSING_KEY_ERROR_CWOBJ0010.explanation=A message key is missing in the message resource bundle and cannot be printed to the log file.
     * MISSING_KEY_ERROR_CWOBJ0010.useraction=Examine the first failure data capture (FFDC) logs for errors that occurred at the time as the missing message key. Not all errors are also printed to the FFDC logs. Also contact IBM Software Support with the missing message key.
     * </pre>
     */
    public String MISSING_KEY_ERROR_CWOBJ0010 = "MISSING_KEY_ERROR_CWOBJ0010";

    /**
     * <pre>
     * # {0} LogElement type code
     * # {1} LogElement type toString (name)
     * INVALID_LOGELEMENT_TYPE_CWOBJ0012=CWOBJ0012E: The LogElement type code, {0} ({1}), is not recognized for this operation.
     * INVALID_LOGELEMENT_TYPE_CWOBJ0012.explanation=An internal error occurred in the ObjectGrid runtime.
     * INVALID_LOGELEMENT_TYPE_CWOBJ0012.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String INVALID_LOGELEMENT_TYPE_CWOBJ0012 = "INVALID_LOGELEMENT_TYPE_CWOBJ0012";

    /**
     * <pre>
     * # {0} Caught Exception
     * EVICT_ENTRIES_EXCEPTION_CWOBJ0013=CWOBJ0013E: An exception occurred while attempting to evict entries from the cache: {0}
     * EVICT_ENTRIES_EXCEPTION_CWOBJ0013.explanation=There was an exception evicting entries from the cache. The exception should be handled in the custom evictor code.
     * EVICT_ENTRIES_EXCEPTION_CWOBJ0013.useraction=Check the exception message to see whether this is an expected exception handled by the custom evictor. If it is not expected, check for configuration errors. Review the custom evictor code.
     * </pre>
     */
    public String EVICT_ENTRIES_EXCEPTION_CWOBJ0013 = "EVICT_ENTRIES_EXCEPTION_CWOBJ0013";

    /**
     * <pre>
     * # {0} Customer string displaying the objectgrid and deployment policy xml
     * LIST_CONFIGURATION_CWOBJ0014=CWOBJ0014I: The ObjectGrid configuration and Deployment Policy configuration supplied at container start are: {0}
     * LIST_CONFIGURATION_CWOBJ0014.explanation=Lists the information from the ObjectGrid xml and DeploymentPolicy xml supplied to the container. Null values are not displayed.
     * LIST_CONFIGURATION_CWOBJ0014.useraction=No action is required.
     * </pre>
     * 
     */
    public String LIST_CONFIGURATION_CWOBJ0014 = "LIST_CONFIGURATION_CWOBJ0014";

    /**
     * <pre>
     * CANNOT_SET_TRACE_VIA_XS_CWOBJ0015W=CWOBJ0015W: An attempt was made to configure trace settings, specifically {0}, using eXtreme Scale standalone settings. These settings must be configured through the application server.
     * CANNOT_SET_TRACE_VIA_XS_CWOBJ0015W.explanation=When eXtreme Scale is running in an application server such as WebSphere Application Server, the trace settings must be configured through the application server. Using XS server properties will be ignored.
     * CANNOT_SET_TRACE_VIA_XS_CWOBJ0015W.useraction=Remove any trace settings from XS configuration files and make all trace setting changed using the application server, i.e. server.xml.
     * </pre>
     */
    public String CANNOT_SET_TRACE_VIA_XS_CWOBJ0015W = "CANNOT_SET_TRACE_VIA_XS_CWOBJ0015W";
    
    /**
     * <pre>
     * # {0} ObjectGrid Name
	 * INVALID_CONFIGURATION_CWOBJ0016=CWOBJ0016E: The deployment policies for the {0} ObjectGrid cannot be merged. A COPY_TO_BYTES CopyMode mismatch exists between the new and old deployment policies.
	 * INVALID_CONFIGURATION_CWOBJ0016.explanation=The new deployment policy might contain a COPY_TO_BYTES map and the existing deployment does not. Or, the existing deployment policy might contain COPY_TO_BYTES maps but the new deployment policy does not.
	 * INVALID_CONFIGURATION_CWOBJ0016.useraction=Check the COPY_TO_BYTES map configurations. COPY_TO_BYTES mode is set on the CopyMode attribute in the ObjectGrid descriptor XML file.
     * </pre>
     */

    public String INVALID_CONFIGURATION_CWOBJ0016 = "INVALID_CONFIGURATION_CWOBJ0016";
    
    /**
     * <pre>
     * # {0} index name
     * # {1} grid name
     * # {2} map name
     * # {3} partition
     * # {4} exception
     * HASHINDEX_RELEASE_INDEXSET_FAILED_CWOBJ0017W=CWOBJ0017W: The HashIndex, \"{0}\", for grid \"{1}\" map \"{2}\" partition \"{3}\" failed to release an IndexSet.  Exception: {4}
     * HASHINDEX_RELEASE_INDEXSET_FAILED_CWOBJ0017W.explanation=An error occurred while releasing index data.  If eXtremeMemory is enabled this may lead to a memory leak.
     * HASHINDEX_RELEASE_INDEXSET_FAILED_CWOBJ0017W.useraction=If eXtremeMemory is not enabled, this message can be ignored.  If eXtremeMemory is enabled the user should pay attention to the process size to determine if the memory usage is higher than expected.  If the error happens multiple times the user should contact IBM Software Support.
     * </pre>
     */
    public String HASHINDEX_RELEASE_INDEXSET_FAILED_CWOBJ0017W = "HASHINDEX_RELEASE_INDEXSET_FAILED_CWOBJ0017W";

    /**
     * <pre>
     * # {0}  Name of ObjectGrid
     * # {1}  Name of ObjectMap
     * OBJECT_TRANSFORMER_NOT_FOUND_CWOBJ0021=CWOBJ0021E: A usable ObjectTransformer instance was not found during the deserialization of the LogSequence object for {0} ObjectGrid and {1} ObjectMap.
     * OBJECT_TRANSFORMER_NOT_FOUND_CWOBJ0021.explanation=The receiving side of a LogSequence object does not have the proper configuration to support the required ObjectTransformer instance.
     * OBJECT_TRANSFORMER_NOT_FOUND_CWOBJ0021.useraction=Verify the configuration of the ObjectGrid instances for both the sending and receiving sides of the LogSequence object.
     * </pre>
     */
    public String OBJECT_TRANSFORMER_NOT_FOUND_CWOBJ0021 = "OBJECT_TRANSFORMER_NOT_FOUND_CWOBJ0021";

    /**
     * <pre>
     * # {0} LockManager internal error.
     * LOCK_MANAGER_INTERNAL_ERROR_CWOBJ0022=CWOBJ0022E: The caller does not own mutex: {0}.
     * LOCK_MANAGER_INTERNAL_ERROR_CWOBJ0022.explanation=An internal error occurred in the ObjectGrid runtime.
     * LOCK_MANAGER_INTERNAL_ERROR_CWOBJ0022.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String LOCK_MANAGER_INTERNAL_ERROR_CWOBJ0022 = "LOCK_MANAGER_INTERNAL_ERROR_CWOBJ0022";

    /**
     * <pre>
     * UNRECOGNIZED_COPY_MODE_CWOBJ0023=CWOBJ0023E: The CopyMode ({0}) is not recognized for this operation.
     * UNRECOGNIZED_COPY_MODE_CWOBJ0023.explanation=An internal error occurred in the ObjectGrid runtime.
     * UNRECOGNIZED_COPY_MODE_CWOBJ0023.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String UNRECOGNIZED_COPY_MODE_CWOBJ0023 = "UNRECOGNIZED_COPY_MODE_CWOBJ0023";

    /**
     * <pre>
     * # {0} The field that is missing during deserialization
     * # {1} The classname of the object with the missing field
     * REQUIRED_FIELD_NOT_FOUND_CWOBJ0024=CWOBJ0024E: Cannot deserialize field {0} in class {1}.  Deserialization failed.
     * REQUIRED_FIELD_NOT_FOUND_CWOBJ0024.explanation=During deserialization of an object, a required field was not found.  This problem is likely an ObjectGrid runtime error.
     * REQUIRED_FIELD_NOT_FOUND_CWOBJ0024.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String REQUIRED_FIELD_NOT_FOUND_CWOBJ0024 = "REQUIRED_FIELD_NOT_FOUND_CWOBJ0024";

    /**
     * <pre>
     * # {0} The number of serialized LogElements
     * # {1} The number of read LogElements
     * SERIALIZATION_FAILED_CWOBJ0025=CWOBJ0025E: The serialization of the LogSequence object failed.  The number of serialized LogElement objects ({0}) does not match the number of read LogElement objects ({1}).
     * SERIALIZATION_FAILED_CWOBJ0025.explanation=An internal error occurred in the ObjectGrid runtime.
     * SERIALIZATION_FAILED_CWOBJ0025.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String SERIALIZATION_FAILED_CWOBJ0025 = "SERIALIZATION_FAILED_CWOBJ0025";

    /**
     * <pre>
     * # {0} The expected type of the credential
     * INVALID_JMX_CREDENTIAL_CWOBJ0026=CWOBJ0026E: The JMX credential type is not right. It should be of type {0}.
     * INVALID_JMX_CREDENTIAL_CWOBJ0026.explanation=The JMX credential type supplied is not correct and the user cannot be authenticated.
     * INVALID_JMX_CREDENTIAL_CWOBJ0026.useraction=Use the right credentials. Use the type suggested. If basic authentication is used, the expected type is String[] with the first element being user name and the second being password.
     * </pre>
     */
    public String INVALID_JMX_CREDENTIAL_CWOBJ0026 = "INVALID_JMX_CREDENTIAL_CWOBJ0026";

    /**
     * <pre>
     * # {0} exception that occurred
     * CLONE_METHOD_NOT_SUPPORTED_CWOBJ0027=CWOBJ0027E: Internal runtime error.  Clone method not supported: {0}
     * CLONE_METHOD_NOT_SUPPORTED_CWOBJ0027.explanation=An internal error occurred in the ObjectGrid runtime.
     * CLONE_METHOD_NOT_SUPPORTED_CWOBJ0027.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String CLONE_METHOD_NOT_SUPPORTED_CWOBJ0027 = "CLONE_METHOD_NOT_SUPPORTED_CWOBJ0027";

    /**
     * <pre>
     * # {0} instrumentation mode
     * OBJECTGRID_INSTRUMENTATION_ENABLED_CWOBJ0030=CWOBJ0030I: ObjectGrid entity class instrumentation is enabled.  The instrumentation mode is {0}.
     * OBJECTGRID_INSTRUMENTATION_ENABLED_CWOBJ0030.explanation=ObjectGrid entity class instrumentation is enabled.  Java classes in the configured transformation domain may be transformed to support field-access entities.
     * OBJECTGRID_INSTRUMENTATION_ENABLED_CWOBJ0030.useraction=No action is required.
     *  </pre>
     */
    public String OBJECTGRID_INSTRUMENTATION_ENABLED_CWOBJ0030 = "OBJECTGRID_INSTRUMENTATION_ENABLED_CWOBJ0030";

    /**
     * <pre>
     * # {0} Class name
     * # {1} map name
     * CLASS_NOT_IMPLEMENT_CLONE_CWOBJ0033=CWOBJ0033I: Class, {0}, does not implement the clone method.  Using serialization instead for this Class in map {1}.
     * CLASS_NOT_IMPLEMENT_CLONE_CWOBJ0033.explanation=If using the default ObjectTransformer and the object type does not implement the clone() method, the ObjectGrid is serialized and deserialized to create a copy of the object.
     * CLASS_NOT_IMPLEMENT_CLONE_CWOBJ0033.useraction=If you are using a copy mode such as COPY_ON_READ or COPY_ON_READ_AND_COMMIT and your performance is slow, add a clone method to your object type or provide in a custom ObjectTransformer implementation for your object type. See the ObjectTransformer interface best practices section in the WebSphere eXtreme Scale product documentation for more information about the ObjectTransformer interface.
     * </pre>
     */
    public String CLASS_NOT_IMPLEMENT_CLONE_CWOBJ0033 = "CLASS_NOT_IMPLEMENT_CLONE_CWOBJ0033";

    /**
     * <pre>
     * # {0} target memory utilization threshold percentage
     * TARGET_MEMORY_UTILIZATION_THRESHOLD_LEVEL_CWOBJ0034=CWOBJ0034I:  Memory utilization threshold percentage is set to {0} %.
     * TARGET_MEMORY_UTILIZATION_THRESHOLD_LEVEL_CWOBJ0034.explanation=The target memory utilization threshold percentage is set to the target level.
     * TARGET_MEMORY_UTILIZATION_THRESHOLD_LEVEL_CWOBJ0034.useraction=No action is required.
     * </pre>
     */
    public String TARGET_MEMORY_UTILIZATION_THRESHOLD_LEVEL_CWOBJ0034 = "TARGET_MEMORY_UTILIZATION_THRESHOLD_LEVEL_CWOBJ0034";

    /**
     * <pre>
     * MEMORY_UTILIZATION_THRESHOLD_NOT_SUPPORTED_CWOBJ0035=CWOBJ0035W:  Memory utilization threshold not supported for this JVM.
     * MEMORY_UTILIZATION_THRESHOLD_NOT_SUPPORTED_CWOBJ0035.explanation=The JVM does not support memory utilization threshold.
     * MEMORY_UTILIZATION_THRESHOLD_NOT_SUPPORTED_CWOBJ0035.useraction=Evictors and other ObjectGrid components can not rely on memory utilization threshold. They should run as normal. To stop this message from occurring: Remove the server property setting for memoryThresholdPercentage (or set to -1) if it is configured. Or remove the MEMORY_USAGE_THRESHOLD trigger on the BackingMap if configured. Or do not set the Java MemoryMXPool bean programmatically.
     * </pre>
     */
    public String MEMORY_UTILIZATION_THRESHOLD_NOT_SUPPORTED_CWOBJ0035 = "MEMORY_UTILIZATION_THRESHOLD_NOT_SUPPORTED_CWOBJ0035";

    /**
     * <pre>
     * # {0} current memory utilization threshold
     * # {1} new memory utilization threshold
     * # {2} memory pool name
     * CHANGING_MEMORY_UTILIZATION_THRESHOLD_CWOBJ0036=CWOBJ0036W:  Changing memory utilization threshold from {0} to {1} for {2} memory pool.
     * CHANGING_MEMORY_UTILIZATION_THRESHOLD_CWOBJ0036.explanation=The Java heap memory utilization threshold is changed. This may have an impact on other system components that rely on the memory utilization threshold setting.
     * CHANGING_MEMORY_UTILIZATION_THRESHOLD_CWOBJ0036.useraction=Ensure the new memory utilization threshold is acceptable.
     * </pre>
     */
    public String CHANGING_MEMORY_UTILIZATION_THRESHOLD_CWOBJ0036 = "CHANGING_MEMORY_UTILIZATION_THRESHOLD_CWOBJ0036";

    /**
     * <pre>
     * # {0} current memory collection utilization threshold
     * # {1} new memory collection utilization threshold
     * # {2} memory pool name
     * CHANGING_MEMORY_COLLECTION_UTILIZATION_THRESHOLD_CWOBJ0037=CWOBJ0037W:  Changing memory collection utilization threshold from {0} to {1} for {2} memory pool.
     * CHANGING_MEMORY_COLLECTION_UTILIZATION_THRESHOLD_CWOBJ0037.explanation=The Java heap memory collection utilization threshold is changed. This may have an impact on other system components that rely on the memory collection utilization threshold setting.
     * CHANGING_MEMORY_COLLECTION_UTILIZATION_THRESHOLD_CWOBJ0037.useraction=Ensure the new memory collection utilization threshold is acceptable.
     * </pre>
     */
    public String CHANGING_MEMORY_COLLECTION_UTILIZATION_THRESHOLD_CWOBJ0037 = "CHANGING_MEMORY_COLLECTION_UTILIZATION_THRESHOLD_CWOBJ0037";

    /**
     * <pre>
     * # {0} current heap memory usage
     * MEMORY_THRESHOLD_EXCEEDED_CWOBJ0038=CWOBJ0038W:  Memory threshold exceeded. Current heap memory usage: {0}.
     * MEMORY_THRESHOLD_EXCEEDED_CWOBJ0038.explanation=The Java heap memory threshold exceeded target usage threshold.
     * MEMORY_THRESHOLD_EXCEEDED_CWOBJ0038.useraction=No action is required.
     * </pre>
     */
    public String MEMORY_THRESHOLD_EXCEEDED_CWOBJ0038 = "MEMORY_THRESHOLD_EXCEEDED_CWOBJ0038";

    /**
     * <pre>
     * # {0} current heap memory usage
     * MEMORY_COLLECTION_THRESHOLD_EXCEEDED_CWOBJ0039=CWOBJ0039W:  Memory collection threshold exceeded. Current heap memory usage: {0}.
     * MEMORY_COLLECTION_THRESHOLD_EXCEEDED_CWOBJ0039.explanation=The Java heap memory collection threshold exceeded target usage threshold.
     * MEMORY_COLLECTION_THRESHOLD_EXCEEDED_CWOBJ0039.useraction=No action is required.
     * </pre?
     */
    public String MEMORY_COLLECTION_THRESHOLD_EXCEEDED_CWOBJ0039 = "MEMORY_COLLECTION_THRESHOLD_EXCEEDED_CWOBJ0039";

    /**
     * <pre>
     * # {0} The class name of the key class that has a poor hashCode method implementation.
     * # {1} The number of elements currently in the data structure.
     * CWOBJ0040=CWOBJ0040E: Hash based data structure over run for {0} with {1} elements in the data structure.  Examine the hashCode method on this class for better distribution.
     * CWOBJ0040.explanation=The hash based data structure holding elements in the grid is getting too many collisions.  This is likely because the hashCode method on the key class has not been implemented effectively.
     * CWOBJ0040.useraction=Examine the hashCode algorithm of the class to determine if a more distributed result is possible.
     * </pre>
     */
    public String CWOBJ0040 = "CWOBJ0040";

    /**
     * <pre>
     * # {0} index name
     * RANGE_INDEX_NOT_SUPPORTED_CWOBJ0041=CWOBJ0041W:  The rangeIndex property of HashIndex plug-in cannot be set to true for a composite index: {0}. The rangeIndex property setting will be ignored.
     * RANGE_INDEX_NOT_SUPPORTED_CWOBJ0041.explanation=Composite indexes do not support range indexing.
     * RANGE_INDEX_NOT_SUPPORTED_CWOBJ0041.useraction=Verify that the rangeIndex property of HashIndex is not configured or is set to false and resubmit the operation.
     * </pre>
     */
    public String RANGE_INDEX_NOT_SUPPORTED_CWOBJ0041 = "RANGE_INDEX_NOT_SUPPORTED_CWOBJ0041";

    /**
     * <pre>
     * # {0} the ExceptionMapper implementation class
     * # {1} the exception message
     * # Do no translate ExceptionMapper
     * EXCEPTION_MAPPER_THROWABLE_IGNORED_CWOBJ0042=CWOBJ0042E:   The ExceptionMapper implementation class {0} threw an unexpected exception with the following message: {1}. This exception is ignored.
     * EXCEPTION_MAPPER_THROWABLE_IGNORED_CWOBJ0042.explanation=The ExceptionMapper implementation class threw an exception. This is most likely due to an incorrect implementation.
     * EXCEPTION_MAPPER_THROWABLE_IGNORED_CWOBJ0042.useraction=Examine the First Failure Data Capture (FFDC) logs and the implementation class to find out why an exception was thrown. Correct the problem and resubmit the operation.
     * </pre>
     */
    public String EXCEPTION_MAPPER_THROWABLE_IGNORED_CWOBJ0042 = "EXCEPTION_MAPPER_THROWABLE_IGNORED_CWOBJ0042";

    /**
     * <pre>
     * # {0} WCCM or custom property
     * # {1} catalog service configuration string
     * CATALOG_CONFIG_PROBLEM_CELL_PROPERTY_CWOBJ0043=CWOBJ0043W: The {0} is formatted improperly but was corrected: {1}
     * CATALOG_CONFIG_PROBLEM_CELL_PROPERTY_CWOBJ0043.explanation=The catalog service configuration used "/" instead of "\", but the data was automatically corrected.
     * CATALOG_CONFIG_PROBLEM_CELL_PROPERTY_CWOBJ0043.useraction=Update the catalog service configuration to use the correct formatting and restart the process or application to avoid this message. See the Starting the catalog service process in a WebSphere Application Server environment section in the WebSphere eXtreme Scale product documentation for more information on catalog service configuration.
     * </pre>
     */
    public String CATALOG_CONFIG_PROBLEM_CELL_PROPERTY_CWOBJ0043 = "CATALOG_CONFIG_PROBLEM_CELL_PROPERTY_CWOBJ0043";

    /**
     * <pre>
     * # {0} WCCM or custom property
     * # {1} catalog service configuration string
     * # {2} exception
     * FORMAT_ERROR_INITIALIZE_CATALOG_CWOBJ0044=CWOBJ0044E: Invalid data in the {0}: {1}. The exception is: {2}
     * FORMAT_ERROR_INITIALIZE_CATALOG_CWOBJ0044.explanation=The eXtreme Scale runtime uses the catalog service configuration to define the catalog service for the process. The data is formatted incorrectly which may result in a failure to start a catalog service, start a container or connect to a catalog service from a client.
     * FORMAT_ERROR_INITIALIZE_CATALOG_CWOBJ0044.useraction=Review and fix the format of the catalog service configuration and restart the process or application. See the Starting the catalog service process in a WebSphere Application Server environment section in the WebSphere eXtreme Scale product documentation for more information on catalog service configuration.
     * </pre>
     */
    public String FORMAT_ERROR_INITIALIZE_CATALOG_CWOBJ0044 = "FORMAT_ERROR_INITIALIZE_CATALOG_CWOBJ0044";

    /**
     * <pre>
     * # {0} object name
     * # {1} exception
     * ERROR_CREATING_MBEAN_CWOBJ0045=CWOBJ0045W: Exception occurred while creating an MBean ObjectName for {0}. Exception: {1}.
     * ERROR_CREATING_MBEAN_CWOBJ0045.explanation=There was an exception while attempting to register the MBean.
     * ERROR_CREATING_MBEAN_CWOBJ0045.useraction=Review the exception, if there is a port conflict for the JMX Service, check for other service running on JMX Service Port (1099 by default).
     * </pre>
     */
    public String ERROR_CREATING_MBEAN_CWOBJ0045 = "ERROR_CREATING_MBEAN_CWOBJ0045";

    /**
     * <pre>
     * # {0} default memory threshold value
     * # Do not translate:  memoryThresholdPercentage, eXtreme, Scale, WebSphere, MemoryMXPool
     * MEMORY_THRESHOLD_DEFAULT_PERCENT_USED_CWOBJ0046=CWOBJ0046I: The Java MemoryMXPool bean was not set (current value = 0).  During initialization, the memoryThresholdPercentage property is set to default value of {0}.
     * MEMORY_THRESHOLD_DEFAULT_PERCENT_USED_CWOBJ0046.explanation=Memory-based eviction was enabled on the backing map, but a target usage threshold or memoryThresholdPercentage property was not set. The default value is being used.
     * MEMORY_THRESHOLD_DEFAULT_PERCENT_USED_CWOBJ0046.useraction=If the default value is acceptable, no action is required. You can set the memoryThresholdPercentage value in the server properties file or with the Java MemoryMXPool bean.  See the information center for details about how to configure a server properties file.
     * </pre>
     */
    public String MEMORY_THRESHOLD_DEFAULT_PERCENT_USED_CWOBJ0046 = "MEMORY_THRESHOLD_DEFAULT_PERCENT_USED_CWOBJ0046";

    /**
     * <pre>
     * # {0} objectGridNames
     * DEVELOPMENT_MODE_ENABLED_CWOBJ0047=CWOBJ0047I: Development mode is enabled for one or more MapSets for ObjectGrids: {0}. For a production deployment, set the development mode attribute in the deployment policy file to false.
     * DEVELOPMENT_MODE_ENABLED_CWOBJ0047.explanation=Development mode allows primary and replica shards for the same partition to be placed on the same machine. When using one or two machines to develop code, this behavior is acceptable. However, when running in production, allowing placement of a primary and its replicas on the same machine risks data loss in case of whole machine failure.
     * DEVELOPMENT_MODE_ENABLED_CWOBJ0047.useraction=If you are in production phase or test phase consider changing development mode to false. The default is true. Otherwise, no action is required. See the Deployment policy descriptor XML file article in the WebSphere eXtreme Scale product documentation for more information about the developmentMode setting.
     * </pre>
     */
    public String DEVELOPMENT_MODE_ENABLED_CWOBJ0047 = "DEVELOPMENT_MODE_ENABLED_CWOBJ0047";

    /**
     * <pre>
     * START_PROCESS_IN_WAS_CWOBJ0048=CWOBJ0048E: Starting stand-alone WebSphere eXtreme Scale server processes in a WebSphere Application Server 6.0.x deployment is not supported.
     * START_PROCESS_IN_WAS_CWOBJ0048.explanation=This configuration of WebSphere eXtreme Scale and WebSphere Application Server 6.0.x is not supported.
     * START_PROCESS_IN_WAS_CWOBJ0048.useraction=Install WebSphere eXtreme Scale outside of WebSphere Application Server or move to a version of WebSphere Application Server 6.1.x or higher.
     * </pre>
     */
    public String START_PROCESS_IN_WAS_CWOBJ0048 = "START_PROCESS_IN_WAS_CWOBJ0048";

    /**
     * <pre>
     * # Do not translate: WebSphere, eXtreme, Scale, or WebSphere Application Server
     * WAS_NOT_AUGMENTED_CWOBJ0049=CWOBJ0049W: This profile is not augmented with WebSphere eXtreme Scale. WebSphere eXtreme Scale container servers will therefore not start automatically.
     * WAS_NOT_AUGMENTED_CWOBJ0049.explanation=The current profile is not augmented with WebSphere eXtreme Scale. WebSphere eXtreme Scale features are not available for the profile to use until it is augmented.
     * WAS_NOT_AUGMENTED_CWOBJ0049.useraction=If the profile needs to use WebSphere eXtreme Scale, augment the profile using the WebSphere Application Server profile tools. See the Creating and augmenting profiles for WebSphere eXtreme Scale section in the WebSphere eXtreme Scale product documentation for more information on augmenting profiles.
     * </pre>
     */
    public String WAS_NOT_AUGMENTED_CWOBJ0049 = "WAS_NOT_AUGMENTED_CWOBJ0049";

    /**
     * <pre>
     * # {0} listenerPort
     * # {1} WCCM or custom property
     * # {2} bootstrap port
     * INVALID_PORT_BOOTSTRAP_OVERRIDE_CWOBJ0050=CWOBJ0050W: Invalid listenerPort {0} defined in the {1}. Overriding it with the bootstrap address port (BOOTSTRAP_ADDRESS) {2}.
     * INVALID_PORT_BOOTSTRAP_OVERRIDE_CWOBJ0050.explanation=The listenerPort provided in the catalog service configuration was incorrect. The bootstrap port from the server will be used instead.
     * INVALID_PORT_BOOTSTRAP_OVERRIDE_CWOBJ0050.useraction=Check the listenerPort in the catalog service configuration. See the Starting the catalog service process in a WebSphere Application Server environment section in the WebSphere eXtreme Scale product documentation for more information on catalog service configuration.
     * </pre>
     */
    public String INVALID_PORT_BOOTSTRAP_OVERRIDE_CWOBJ0050 = "INVALID_PORT_BOOTSTRAP_OVERRIDE_CWOBJ0050";

    /**
     * <pre>
     * # Do not translate: WebSphere, eXtreme, Scale or WebSphere Application Server
     * WAS_NOT_AUGMENTED_CWOBJ0051=CWOBJ0051W: This profile is not augmented with WebSphere eXtreme Scale. A WebSphere eXtreme Scale catalog service will therefore not start automatically.
     * WAS_NOT_AUGMENTED_CWOBJ0051.explanation=The profile is not augmented with WebSphere eXtreme Scale. WebSphere eXtreme Scale features are not available for the profile to use until it is augmented.
     * WAS_NOT_AUGMENTED_CWOBJ0051.useraction=If the profile needs to use WebSphere eXtreme Scale, augment the profile using the WebSphere Application Server profile tools. See the Creating and augmenting profiles for WebSphere eXtreme Scale section in the WebSphere eXtreme Scale product documentation for more information on augmenting profiles.
     * </pre>
     */
    public String WAS_NOT_AUGMENTED_CWOBJ0051 = "WAS_NOT_AUGMENTED_CWOBJ0051";

    /**
     * <pre>
    * ORB_CHANNELFRAMEWORK_CWOBJ0052=CWOBJ0052I: The IBM ORB TransportMode property was set to ChannelFramework.
    * ORB_CHANNELFRAMEWORK_CWOBJ0052.explanation=The Transport Mode was set automatically to ChannelFramework.
    * ORB_CHANNELFRAMEWORK_CWOBJ0052.useraction=No action is required unless you do not want to use the ChannelFramework TransportMode. The TransportMode may be set to Pluggable by setting it in the orb.properties file.
    * </pre>
     */
    public String ORB_CHANNELFRAMEWORK_CWOBJ0052 = "ORB_CHANNELFRAMEWORK_CWOBJ0052";

    /**
     * <pre>
    * # {0} new ServerSocketQueueDepth
    * ORB_SEVERSOCKETQUEUEDEPTH_OVERRIDE_CWOBJ0053=CWOBJ0053I: The IBM ORB ServerSocketQueueDepth property was set to {0} to run with correctly with the ChannelFramework TransportMode.
    * ORB_SEVERSOCKETQUEUEDEPTH_OVERRIDE_CWOBJ0053.explanation=The ChannelFramework TransportMode has a maximum allowed ServerSocketQueueDepth. If the current ServerSocketQueueDepth is greater than the allowed value, it will be reset to the maximum allowed value.
    * ORB_SEVERSOCKETQUEUEDEPTH_OVERRIDE_CWOBJ0053.useraction=No action is required. To stop this message from occurring, reset the ServerSocketQueueDepth to the suggested value in the orb.properties.
    * </pre>
     */
    public String ORB_SEVERSOCKETQUEUEDEPTH_OVERRIDE_CWOBJ0053 = "ORB_SEVERSOCKETQUEUEDEPTH_OVERRIDE_CWOBJ0053";

    /**
     * <pre>
     * # {0} The WXS property name
     * # {1} The WXS property value
     * ORB_PROPERTY_CWOBJ0062=WXS_PROPERTY_CWOBJ0054=CWOBJ0054I:  The value of the \"{0}\" property is \"{1}\".
     * ORB_PROPERTY_CWOBJ0062.explanation=This is a WebSphere eXtremeScale custom property.
     * ORB_PROPERTY_CWOBJ0062.useraction=No action is required.
     * </pre>
     */
    public String WXS_PROPERTY_CWOBJ0054 = "WXS_PROPERTY_CWOBJ0054";

    /**
     * <pre>
     * ORB_CHANNELFRAMEWORK_CWOBJ0055=CWOBJ0055W: The IBM ORB TransportMode property was set to ChannelFramework in the server properties file, but the existing orb.properties file already had a transportMode set. The transportMode will not be overridden.
     * ORB_CHANNELFRAMEWORK_CWOBJ0055.explanation=The TransportMode set in the server properties file will not override a TransportMode set in the orb.properties file.
     * ORB_CHANNELFRAMEWORK_CWOBJ0055.useraction=Review the TransportMode set in the orb.properties file. If it is set to Pluggable or SSL or Transport Security settings are used, the ChannelFramework Transport mode will not be used. To remove the warning, adjust the setting in one of the files.
     * </pre>
     */
    public String ORB_CHANNELFRAMEWORK_CWOBJ0055 = "ORB_CHANNELFRAMEWORK_CWOBJ0055";

    /**
     * <pre>
     * # {0} the ORB property name
     * # {1} the old ORB property value
     * # {2} the new ORB property value
     * ORB_PROPERTY_OVERRIDE_CWOBJ0056=CWOBJ0056I: The ORB property {0} value {1} is overridden as {2}.
     * ORB_PROPERTY_OVERRIDE_CWOBJ0056.explanation=The ORB property defined in the orb.properties file is overridden with a new value. These properties are overridden to support WebSphere eXtreme Scale transport security.
     * ORB_PROPERTY_OVERRIDE_CWOBJ0056.useraction=No action is required.
     * </pre>
     */
    public String ORB_PROPERTY_OVERRIDE_CWOBJ0056 = "ORB_PROPERTY_OVERRIDE_CWOBJ0056";

    /**
     * <pre>
     * # {0} the catalog server version.
     * # {1} the client or container server version
     * CATALOG_VERSION_DOWN_LEVEL_CWOBJ0057=CWOBJ0057E: The eXtreme Scale Catalog server version is {0}, and the client or container server version is {1}. Catalog server version cannot be older than the client or container server version.
     * CATALOG_VERSION_DOWN_LEVEL_CWOBJ0057.explanation=Catalog server version cannot be older than the client or container server version. This is not a supported configuration.
     * CATALOG_VERSION_DOWN_LEVEL_CWOBJ0057.useraction=Upgrade the catalog sever to the same or newer version than the client and container server version.
     * </pre>
     */
    public String CATALOG_VERSION_DOWN_LEVEL_CWOBJ0057 = "CATALOG_VERSION_DOWN_LEVEL_CWOBJ0057";

    /**
     * <pre>
     * # {0} name of the grid in the ObjectGridDeployment
     * SAME_GRID_DIFFERENT_MAPSETS_CWOBJ0058=CWOBJ0058I: A deployment policy conflict was detected.  Additional mapsets were found for ObjectGrid {0}.
     * SAME_GRID_DIFFERENT_MAPSETS_CWOBJ0058.explanation=An attempt was made to merge the two ObjectGridDeployments.
     * SAME_GRID_DIFFERENT_MAPSETS_CWOBJ0058.useraction=No action is required.
     * </pre>
     */
    public String SAME_GRID_DIFFERENT_MAPSETS_CWOBJ0058 = "SAME_GRID_DIFFERENT_MAPSETS_CWOBJ0058";

    /**
     * <pre>
     * DEFAULT_TRANSACTION_TIMEOUT_CWOBJ0059=CWOBJ0059I: The transaction timeout value is not set or set to 0 for ObjectGrid {0}. That means the transaction would never time out. eXtreme Scale overrides the transaction time out value to 600 seconds.
     * DEFAULT_TRANSACTION_TIMEOUT_CWOBJ0059.explanation=eXtreme Scale does not recommend a transaction that never times out. The transaction time out value is overridden as 600 seconds.
     * DEFAULT_TRANSACTION_TIMEOUT_CWOBJ0059.useraction=No action is required, or set an ObjectGrid transaction time out value.
     * </pre>
     */
    public String DEFAULT_TRANSACTION_TIMEOUT_CWOBJ0059 = "DEFAULT_TRANSACTION_TIMEOUT_CWOBJ0059";

    /**
     * <pre>
     * # Do not translate: JVM, ORB, eXtreme Scale
     * JVM_SHUTDOWN_HOOK_NOT_ORDERED_CWOBJ0060=CWOBJ0060W: The JVM shutdown hook is not ordered. The ORB shutdown hook might execute before eXtreme Scale shutdown hook executes. This may cause connectivity problem during the XS shutdown process.
     * JVM_SHUTDOWN_HOOK_NOT_ORDERED_CWOBJ0060.explanation=eXtreme Scale shutdown hook should be the first shutdown hook being executed. However, eXtreme Scale cannot gaurantee it by re-ordering the JVM shutdown hook execution.
     * JVM_SHUTDOWN_HOOK_NOT_ORDERED_CWOBJ0060.useraction=Gather the FFDC text files, and report to IBM support.
     * </pre>
     */
    public String JVM_SHUTDOWN_HOOK_NOT_ORDERED_CWOBJ0060 = "JVM_SHUTDOWN_HOOK_NOT_ORDERED_CWOBJ0060";

    /**
     * <pre>
     * # {0} the transaction ID
     * # {1} thread id
     * # {2} shard id (objectgridName:mapSetName:partitionID)
     * TRANSACTION_ROLLED_BACK_CWOBJ0061W=CWOBJ0061W: The transaction with TxID, {0}, that was last running on thread, {1}, on shard {2} has exceeded the configured transaction timeout value and was been marked rollback-only. This might be caused by lock contention or application deadlock, or your transaction timeout value is set too small.
     * TRANSACTION_ROLLED_BACK_CWOBJ0061W.explanation=WebSphere eXtreme Scale automatically marks a transaction rollback-only, when it has exceeded its configured transaction timeout value. This might be caused by lock contention or application deadlock, or your transaction timeout value is set too small.
     * TRANSACTION_ROLLED_BACK_CWOBJ0061W.useraction=Examine the application logic to determine whether a lock contention can be avoided. If a deadlock situation exists, remove that logic. If the transaction timeout value is too small and your application expects a long transaction, increase the transaction timeout value appropriately.
     * </pre>
     */
    public String TRANSACTION_ROLLED_BACK_CWOBJ0061W = "TRANSACTION_ROLLED_BACK_CWOBJ0061W";

    /**
     * <pre>
     * # {0} The ORB property name
     * # {1} The ORB property value
     * # Do not translate ORB
     * ORB_PROPERTY_CWOBJ0062=CWOBJ0062I: ORB property {0}={1}.
     * ORB_PROPERTY_CWOBJ0062.explanation=This is a ORB property that is used by the ORB.
     * ORB_PROPERTY_CWOBJ0062.useraction=No action is required.
     * </pre>
     */
    public String ORB_PROPERTY_CWOBJ0062 = "ORB_PROPERTY_CWOBJ0062";

    /**
     * <pre>
     * # Do not translate: ORB
     * # {0} ORB property
     * {1} default setting
     * ORB_DEFAULT_PROPERTY_SET_CWOBJ0063=CWOBJ0063I: The {0} property was not configured. The {0} property is being set to {0}.
     * ORB_DEFAULT_PROPERTY_SET_CWOBJ0063.explanation=The listed property was not set in an orb.properties file. For some properties, if a value is not set for a timeout, it is set by the ORB to infinite and requests will not time out. The server sets a default value to allow requests to time out in the event of a problem. Other default settings are suggested starting points.
     * ORB_DEFAULT_PROPERTY_SET_CWOBJ0063.useraction=No action is required, or set a specific value. See ORB properties in the information center for more information on changing the ORB properties and values.
     * </pre>
     */
    public String ORB_DEFAULT_PROPERTY_SET_CWOBJ0063 = "ORB_DEFAULT_PROPERTY_SET_CWOBJ0063";

    /**
     * <pre>
     * # {0} provided memory threshold value
     * MEMORY_THRESHOLD_USER_OVERRIDE_CWOBJ0064=CWOBJ0064I: The memoryThresholdPercentage property is provided in a server properties file, which overrides any previously set values.
     * MEMORY_THRESHOLD_USER_OVERRIDE_CWOBJ0064.explanation=The memoryThresholdPercentage property is set to {0} in a server properties file, overriding the previous value.
     * MEMORY_THRESHOLD_USER_OVERRIDE_CWOBJ0064.useraction=If the provided value is acceptable, no action is required. You can change the memoryThresholdPercentage in the server properties file or with the Java MemoryMXPool bean.  See the information center for details on how to configure a server properties file.
     * </pre>
     */
    public String MEMORY_THRESHOLD_USER_OVERRIDE_CWOBJ0064 = "MEMORY_THRESHOLD_USER_OVERRIDE_CWOBJ0064";

    /**
     * <pre>
     * # {0} index name
     * # {1} map name
     * # {2} either "key" or "value" string (translated)
     * # {3} attribute name
     * # {4} either KeyDataDescriptor or ValueDataDescriptor (not translated)
     * HASHINDEX_ATTRIBUTE_NOT_FOUND_IN_SERIALIZER_METADATA_CWOBJ0065=CWOBJ0065W:  HashIndex \"{0}\" for map \"{1}\" is enabled for multi-type access.  The {2} attribute \"{3}\" was not defined in the {4} for the configured DataSerializer plug-in.
     * HASHINDEX_ATTRIBUTE_NOT_FOUND_IN_SERIALIZER_METADATA_CWOBJ0065.explanation=The configured attribute was not found in the DataDescriptor for the configured DataSerializer plug-in, allowing multiple attribute types to be indexed with the same attribute name.  For example, the attribute name is \"id\" and its type can be Integer or String.
     * HASHINDEX_ATTRIBUTE_NOT_FOUND_IN_SERIALIZER_METADATA_CWOBJ0065.useraction=This message may indicate that the attribute path is defined incorrectly, or the DataDescriptor is missing a required attribute.  Verify the attribute path is correctly defined.
     * </pre>
     */
    public String HASHINDEX_ATTRIBUTE_NOT_FOUND_IN_SERIALIZER_METADATA_CWOBJ0065 = "HASHINDEX_ATTRIBUTE_NOT_FOUND_IN_SERIALIZER_METADATA_CWOBJ0065";

    /**
     * <pre>
     * #{0} the transaction ID
     * #{1} the ObjectGrid name
     * #{2} shard id (objectgridName:mapSetName:partitionID)
     * TRANSACTION_ROLLED_BACK_STATE_CWOBJ0066W=CWOBJ0066W: The {0} transaction has been marked rollback-only due to a state change of ObjectGrid {1} on shard {2} that forced transaction completion.  This could be caused by an administrator changing the availability state of the ObjectGrid instance or termination of the ObjectGrid instance.
     * TRANSACTION_ROLLED_BACK_STATE_CWOBJ0066W.explanation=eXtreme Scale automatically marks a transaction rollback-only when it does not end normally during some instances. When an administrator needs to quiesce activity to bring the data grid into the offline or preload state, if the transaction does not end normally in the allowed time, the transaction is marked rollback-only.
     * TRANSACTION_ROLLED_BACK_STATE_CWOBJ0066W.useraction=The administrator should wait for a period of inactivity to change the state of the data grid. Alternatively, you can manually end or put client applications and their transactions into an inactive state before you change the state of the data grid.
     * </pre>
     */
    public String TRANSACTION_ROLLED_BACK_STATE_CWOBJ0066W = "TRANSACTION_ROLLED_BACK_STATE_CWOBJ0066W";

    /**
     * <pre>
     * JMX_SSL_ENABLED_WITHOUT_PORT_CWOBJ0067W=CWOBJ0067W: SSL is enabled for JMX connections to this server, but the JMXServicePort property was not provided.
     * JMX_SSL_ENABLED_WITHOUT_PORT_CWOBJ0067W.explanation=If SSL is configured for JMX, JMX communication will not work when communicating with this server over SSL.
     * JMX_SSL_ENABLED_WITHOUT_PORT_CWOBJ0067W.useraction=Either provide the JMXServicePort and JMXConnectorPort properties when starting the server or disable SSL for the JMX protocol.  To disable SSL for the JMX protocol, either disable SSL for the server, or specify the JVM argument -Dcom.sun.management.jmxremote.ssl=false during server startup to disable SSL only for JMX communication.
     * </pre>
     */
    public String JMX_SSL_ENABLED_WITHOUT_PORT_CWOBJ0067W = "JMX_SSL_ENABLED_WITHOUT_PORT_CWOBJ0067W";

    /**
     * <pre>
     * JMX_SERVICE_URL_CWOBJ0068I=CWOBJ0068I: MBeanServer started with JMX URL {0}.
     * JMX_SERVICE_URL_CWOBJ0068I.explanation=The eXtreme Scale server can be contacted using the provided JMX URL.
     * JMX_SERVICE_URL_CWOBJ0068I.useraction=No action is required.
     * </pre>
     */
    public String JMX_SERVICE_URL_CWOBJ0068I = "JMX_SERVICE_URL_CWOBJ0068I";

    /**
     * <pre>
     * {0} Backing map name
     * GRID_NOT_OFFHEAP_ELIGIBLE_CWOBJ0069=CWOBJ0069W:  OffHeap is enabled but one of the BackingMaps for ObjectGrid \"{0}\" does not have a CopyMode of COPY_TO_BYTES or COPY_TO_BYTES_RAW. All BackingMaps for an ObjectGrid must be configured with either COPY_TO_BYTES or COPY_TO_BYTES_RAW to use OffHeap.
     * GRID_NOT_OFFHEAP_ELIGIBLE_CWOBJ0069.explanation=All BackingMaps for an ObjectGrid must be configured with either COPY_TO_BYTES or COPY_TO_BYTES_RAW to use OffHeap.One of the maps in the MapSet has a copy mode other than  COPY_TO_BYTES or COPY_TO_BYTES_RAW
     * GRID_NOT_OFFHEAP_ELIGIBLE_CWOBJ0069.useraction=Configure all BackingMaps with CopyModes of either: COPY_TO_BYTES or COPY_TO_BYTES_RAW
     * </pre>
     */
    public String GRID_NOT_OFFHEAP_ELIGIBLE_CWOBJ0069 = "GRID_NOT_OFFHEAP_ELIGIBLE_CWOBJ0069";

    /**
     * <pre>
     * {0} garbage collection policy
     * GC_POLICY_INFO_CWOBJ0070I=CWOBJ0070I: The IBM implementation of the JVM is using the {0} garbage collection policy.
     * GC_POLICY_INFO_CWOBJ0070I.explanation=The IBM implementation of the JVM provides garbage collection policies that might provide enhanced performance. 
     * GC_POLICY_INFO_CWOBJ0070I.useraction=None. This message is purely informational.
     * </pre>
     */
    public String GC_POLICY_INFO_CWOBJ0070I = "GC_POLICY_INFO_CWOBJ0070I";

    /**
     * <pre>
     * {0} Maximum heap size limit.
     * {1} Specified maximum heap size.
     * MAX_HEAP_WARNING_CWOBJ0071W=CWOBJ0071W: The maximum recommended heap size of {0} bytes has been surpassed ({1} bytes).
     * MAX_HEAP_WARNING_CWOBJ0071W.explanation=As heap size increases, garbage collection might cause performance degradation.
     * MAX_HEAP_WARNING_CWOBJ0071W.useraction=Reduce the maximum heap size allocated using the JVM argument -Xmx.
     * </pre>
     */
    public String MAX_HEAP_WARNING_CWOBJ0071W = "MAX_HEAP_WARNING_CWOBJ0071W";

    /**
     * <pre>
     * COMMAND_RUNAS_SUBJECT_CWOBJ0072I=CWOBJ0072I: The WebSphere eXtreme Scale command runtime is using the {0} Subject RunAs type.
     * COMMAND_RUNAS_SUBJECT_CWOBJ0072I.explanation=When you run multiple partition commands, such as those used by AgentManager, the configured RunAs type is used.
     * COMMAND_RUNAS_SUBJECT_CWOBJ0072I.useraction=No action is required.
     * </pre>
     */
    public String COMMAND_RUNAS_SUBJECT_CWOBJ0072I = "COMMAND_RUNAS_SUBJECT_CWOBJ0072I";

    /**
     * <pre>
     * MISSING_CLASS_FOR_OPTIMISTIC_CALLBACK_CWOBJ0073E=CWOBJ0073E:WebSphere eXtreme Scale is unable to load the {0} class during deserialization. This class or a serializer for this class must be loadable by the eXtreme Scale runtime when you are using using optimistic locking.
     * MISSING_CLASS_FOR_OPTIMISTIC_CALLBACK_CWOBJ0073E.explanation=When you are using optimistic locking, the default behavior is for the container server to check that the value was not updated. This check calls the equals method on the deserialized object. When you are using COPY_TO_BYTES copy mode, the class for the object might not exist on the container server.
     * MISSING_CLASS_FOR_OPTIMISTIC_CALLBACK_CWOBJ0073E.useraction= Use one of the following actions to resolve the error: (1) Package the specified class and any dependent classes so the container server can load the classes. (2) Package a serializer plug-in to deserialize data. (3) Use the built-in NoVersioningOptimisticCallback plug-in for this map. (4) Change the locking type to a type other than optimistic locking.
     * </pre>
     */
    public String MISSING_CLASS_FOR_OPTIMISTIC_CALLBACK_CWOBJ0073E = "MISSING_CLASS_FOR_OPTIMISTIC_CALLBACK_CWOBJ0073E";

    /**
     * <pre>
     * NO_IP_WAS_HOST_CWOBJ0074=CWOBJ0074E: No IP address for WebSphere end point host \"{0}\" could be found.  The catalog server ObjectGrid runtime will not start properly.
     * NO_IP_WAS_HOST_CWOBJ0074.explanation=Resolving the WebSphere defined host value is a requirement before starting the ObjectGrid runtime.
     * NO_IP_WAS_HOST_CWOBJ0074.useraction=Review the IBM ObjectGrid internet support web site for a similar problem or contact IBM service.
     * </pre>
     */
    public String NO_IP_WAS_HOST_CWOBJ0074 = "NO_IP_WAS_HOST_CWOBJ0074";

    /**
     * <pre>
     * # {0} JVM property
     * # {1} JVM propety value
     * # {2} Security property
     * # {3} Security property value
     * JVM_PROPERTY_OVERRIDES_SERVER_PROPERTY_CWOBJ0075I=CWOBJ0075: The {0} JVM property was set to {1}.  The {2} security server property is set to {3}.  The {0} JVM property is used.
     * JVM_PROPERTY_OVERRIDES_SERVER_PROPERTY_CWOBJ0075I.explanation=The {0} JVM property, {1}, is used.
     * JVM_PROPERTY_OVERRIDES_SERVER_PROPERTY_CWOBJ0075I.useraction=No action is required.
     * </pre>
     */
    public String JVM_PROPERTY_OVERRIDES_SERVER_PROPERTY_CWOBJ0075I = "JVM_PROPERTY_OVERRIDES_SERVER_PROPERTY_CWOBJ0075I";

    /**
     * <pre>
     * # {0} JVM property
     * # {1} JVM propety value
     * # {2} Security property
     * # {3} Security property value
     * JVM_PROPERTY_SERVER_PROPERTY_MISMATCH_CWOBJ0076E=CWOBJ0076E: The {0} JVM property is set to {1}.  The {2} security server property is set to {3}.
     * JVM_PROPERTY_SERVER_PROPERTY_MISMATCH_CWOBJ0076E.explanation=The {0} JVM property needs to match the security server property {1}.
     * JVM_PROPERTY_SERVER_PROPERTY_MISMATCH_CWOBJ0076E.useraction=Review the WebSphere JVM properties and security server properties associated with FIPS.
     * </pre>
     */
    public String JVM_PROPERTY_SERVER_PROPERTY_MISMATCH_CWOBJ0076E = "JVM_PROPERTY_SERVER_PROPERTY_MISMATCH_CWOBJ0076E";

    //
    // Liberty-related messages - starting at CWOBJ0080
    //

    /**
     * <pre>
     * NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W=CWOBJ0080W: No objectgrid.xml specified for container, {0}. Will not process.
     * NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W.explanation=No objectgrid.xml file was specified for the container so the container could not be started.
     * NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W.useraction=Make sure an objectgrid.xml file is specified for the container.NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W=CWOBJ0080W: No objectgrid.xml specified for container, {0}. Will not process.
     * </pre>
     */
    public String NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W = "NO_OBJECTGRID_XML_SPECIFIED_CWOBJ0080W";

    /**
     * <pre>
     * STARTING_CONTAINER_CWOBJ0081I=CWOBJ0081I: Starting container specified at: {0} with name, \"{1}\".
     * STARTING_CONTAINER_CWOBJ0081I.explanation=The specified container is being started.
     * STARTING_CONTAINER_CWOBJ0081I.useraction=No action is required.
     * </pre>
     */
    public String STARTING_CONTAINER_CWOBJ0081I = "STARTING_CONTAINER_CWOBJ0081I";

    /**
     * <pre>
     * UNABLE_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0082W=CWOBJ0082W: Unable to load properties from server properties file, {0}.
     * UNABLE_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0082W.explanation=There was an exception loading the server properties file.
     * UNABLE_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0082W.useraction=Verfiy the format of the file and try again.
     * </pre>
     */
    public String UNABLE_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0082W = "UNABLE_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0082W";

    /**
     * <pre>
     * UNRECOGNIZED_SERVER_PROPERTY_CWOBJ0083W=CWOBJ0083W: Unrecognized XS server property specified: {0}  Ignoring.
     * UNRECOGNIZED_SERVER_PROPERTY_CWOBJ0083W.explanation=There is an unrecognized property found while processing the server properties.
     * UNRECOGNIZED_SERVER_PROPERTY_CWOBJ0083W.useraction=Remove the incorrect property or replace it with the correct value.
     * </pre>
     */
    public String UNRECOGNIZED_SERVER_PROPERTY_CWOBJ0083W = "UNRECOGNIZED_SERVER_PROPERTY_CWOBJ0083W";

    /**
     * <pre>
     * UNSUPPORTED_MULTI_PARAMETER_PROPERTY_CWOBJ0084W=CWOBJ0084W: Unsupported multi-parameter property: {0} - ignoring.
     * UNSUPPORTED_MULTI_PARAMETER_PROPERTY_CWOBJ0084W.explanation=Multi-parameter properties are unsupported.
     * UNSUPPORTED_MULTI_PARAMETER_PROPERTY_CWOBJ0084W.useraction=Use a sinlge parameter on the property.
     * </pre>
     */
    public String UNSUPPORTED_MULTI_PARAMETER_PROPERTY_CWOBJ0084W = "UNSUPPORTED_MULTI_PARAMETER_PROPERTY_CWOBJ0084W";

    /**
     * <pre>
     * UNKNOWN_PARAMETER_TYPE_CWOBJ0085W=CWOBJ0085W: Unknown parameter type ( {0} ) while setting config property, {1} - ignoring.
     * UNKNOWN_PARAMETER_TYPE_CWOBJ0085W.explanation=An unknown parameter type was encountered while processing the properties.
     * UNKNOWN_PARAMETER_TYPE_CWOBJ0085W.useraction=CMSG0002
     * </pre>
     */
    public String UNKNOWN_PARAMETER_TYPE_CWOBJ0085W = "UNKNOWN_PARAMETER_TYPE_CWOBJ0085W";

    /**
     * <pre>
     * FAILED_TO_SET_PROPERTY_CWOBJ0086W=CWOBJ0086W: Failed to set user property ( {0} ) : {1}.
     * FAILED_TO_SET_PROPERTY_CWOBJ0086W.explanation=The property failed to be set.
     * FAILED_TO_SET_PROPERTY_CWOBJ0086W.useraction=Fix the exception.
     * </pre>
     */
    public String FAILED_TO_SET_PROPERTY_CWOBJ0086W = "FAILED_TO_SET_PROPERTY_CWOBJ0086W";

    /**
     * <pre>
     * PROPERTY_CHANGE_SERVER_RESTART_CWOBJ0087W=CWOBJ0087W: Property, {0}, has changed from {1} to {2} but will not take effect until the server is restarted.
     * PROPERTY_CHANGE_SERVER_RESTART_CWOBJ0087W.explanation=The property has been changed but the new value will not be used until the server is restarted.
     * PROPERTY_CHANGE_SERVER_RESTART_CWOBJ0087W.useraction=Restart the server if the new property value is required.
     * </pre>
     */
    public String PROPERTY_CHANGE_SERVER_RESTART_CWOBJ0087W = "PROPERTY_CHANGE_SERVER_RESTART_CWOBJ0087W";

    /**
     * <pre>
     * UNRECOGNIZED_WEB_APP_CONFIG_PROPERTY_CWOBJ0088W=CWOBJ0088W: Unrecognized XS Web App Configuration property specified: {0}  Ignoring.
     * UNRECOGNIZED_WEB_APP_CONFIG_PROPERTY_CWOBJ0088W.explanation=here is an unrecognized property found while processing the server properties.
     * UNRECOGNIZED_WEB_APP_CONFIG_PROPERTY_CWOBJ0088W.useraction=Remove the incorrect property or replace it with the correct value.
     * </pre>
     */
    public String UNRECOGNIZED_WEB_APP_CONFIG_PROPERTY_CWOBJ0088W = "UNRECOGNIZED_WEB_APP_CONFIG_PROPERTY_CWOBJ0088W";

    /**
     * <pre>
     * BUNDLE_FAILED_AUTO_INSTALL_CWOBJ0089E=CWOBJ0089E: Failed to install bundle from monitored directory: {0}
     * BUNDLE_FAILED_AUTO_INSTALL_CWOBJ0089E.explanation=A JAR file was added or modified in a monitored directory, but the eXtremeScale runtime was unable to install it into the OSGi framework.
     * BUNDLE_FAILED_AUTO_INSTALL_CWOBJ0089E.useraction=Verify that the specified JAR file is a valid bundle and consult the FFDC output to determine why the bundle could not be installed.
     * </pre>
     */
    public String BUNDLE_FAILED_AUTO_INSTALL_CWOBJ0089E = "BUNDLE_FAILED_AUTO_INSTALL_CWOBJ0089E";

    /**
     * <pre>
     * BUNDLE_FAILED_AUTO_START_CWOBJ0090E=CWOBJ0090E: Failed to start bundle, {0} from monitored directory file, {1}, with state, {2}.
     * BUNDLE_FAILED_AUTO_START_CWOBJ0090E.explanation=A bundle JAR file in a monitored directory failed to be started in the OSGi framework.
     * BUNDLE_FAILED_AUTO_START_CWOBJ0090E.useraction=Consult the logs and FFDC to determine the reason the bundle could not be started.
     * </pre>
     */
    public String BUNDLE_FAILED_AUTO_START_CWOBJ0090E = "BUNDLE_FAILED_AUTO_START_CWOBJ0090E";

    /**
     * <pre>
     * BUNDLE_FAILED_AUTO_UNINSTALL_CWOBJ0091E=CWOBJ0091E: Failed to uninstall bundle from monitored directory: {0}
     * BUNDLE_FAILED_AUTO_UNINSTALL_CWOBJ0091E.explanation=A JAR file was deleted or modified in a monitored directory, but the eXtremeScale runtime was unable to remove it from the OSGi framework.
     * BUNDLE_FAILED_AUTO_UNINSTALL_CWOBJ0091E.useraction=Connect to the OSGi console for the running server and manually verify that the bundle is still installed, and if so, uninstall it from the console.
     * </pre>
     */
    public String BUNDLE_FAILED_AUTO_UNINSTALL_CWOBJ0091E = "BUNDLE_FAILED_AUTO_UNINSTALL_CWOBJ0091E";

    /**
     * <pre>
     * USING_SERVER_PROPS_FILE_CWOBJ0092I=CWOBJ0092I: Loading initial server properties from file, {0}
     * USING_SERVER_PROPS_FILE_CWOBJ0092I.explanation=Initial server configuration settings will be loaded from the specified file, but can be overwritten by configuration settings in the server.xml.
     * USING_SERVER_PROPS_FILE_CWOBJ0092I.useraction=None. This message is purely informational.
     * </pre>
     */
    public String USING_SERVER_PROPS_FILE_CWOBJ0092I = "USING_SERVER_PROPS_FILE_CWOBJ0092I";

    /**
     * <pre>
     * FAILED_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0093W=CWOBJ0093W: Failed to load server properties file, {0}
     * FAILED_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0093W.explanation=The eXtreme Scale server failed to load the server properties specified in the server.xml.
     * FAILED_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0093W.useraction=Check that the file exists at the specified location and that the server has read permissions to the file.
     * </pre>
     */
    public String FAILED_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0093W = "FAILED_TO_LOAD_SERVER_PROPS_FILE_CWOBJ0093W";

    /**
     * <pre>
     * FAILED_TO_MONITOR_GRIDS_DIR_CWOBJ0094W=CWOBJ0094W: The eXtreme Scale server failed to set up a monitored directory for grid applications.
     * FAILED_TO_MONITOR_GRIDS_DIR_CWOBJ0094W.explanation=The eXtreme Scale server encountered an unexpected exception that prevented it from monitoring the grids directory.
     * FAILED_TO_MONITOR_GRIDS_DIR_CWOBJ0094W.useraction=Review the associated FFDC incident to determine the root cause of the failure.
     * </pre>
     */
    public String FAILED_TO_MONITOR_GRIDS_DIR_CWOBJ0094W = "FAILED_TO_MONITOR_GRIDS_DIR_CWOBJ0094W";

    /**
     * <pre>
     * FAILED_TO_START_CNTR_IN_MONITORED_DIR_CWOBJ0095E=CWOBJ0095E: The eXtreme Scale server failed to start container {0}, from the monitored grids directory.
     * FAILED_TO_START_CNTR_IN_MONITORED_DIR_CWOBJ0095E.explanation=The container defined either by an XML files or OSGi bundles in the server's grids directory failed to start.  This is usually the result of an error in the grid configuration.
     * FAILED_TO_START_CNTR_IN_MONITORED_DIR_CWOBJ0095E.useraction=See log output for more information as to why the container failed to start.
     * </pre>
     */
    public String FAILED_TO_START_CNTR_IN_MONITORED_DIR_CWOBJ0095E = "FAILED_TO_START_CNTR_IN_MONITORED_DIR_CWOBJ0095E";

    /**
     * <pre>
     * FAILED_TO_INSTALL_REST_WAB_CWOBJ0096E=CWOBJ0096E: The eXtreme Scale REST Gateway web application bundle could not be installed using this URL: {0}
     * FAILED_TO_INSTALL_REST_WAB_CWOBJ0096E.explanation=The eXtreme Scale REST Gateway application could not be installed into this Liberty server's OSGi framework. The REST Gateway is disabled.
     * FAILED_TO_INSTALL_REST_WAB_CWOBJ0096E.useraction=Make sure that the eXtremeScale.rest feature is configured in this server's configuration and ensure that the referenced file exists and is readable.
     * </pre>
     */
    public String FAILED_TO_INSTALL_REST_WAB_CWOBJ0096E = "FAILED_TO_INSTALL_REST_WAB_CWOBJ0096E";

    /**
     * <pre>
     * FAILED_TO_START_REST_WAB_CWOBJ0097E=CWOBJ0097E: The eXtreme Scale REST Gateway web application bundle could not be started.
     * FAILED_TO_START_REST_WAB_CWOBJ0097E.explanation=The eXtreme Scale REST Gateway application was installed into this Liberty server's OSGi framework, but could not be activated. The REST Gateway is disabled.
     * FAILED_TO_START_REST_WAB_CWOBJ0097E.useraction=See log output for more information as to why the web application bundle could not be started.
     * </pre>
     */
    public String FAILED_TO_START_REST_WAB_CWOBJ0097E = "FAILED_TO_START_REST_WAB_CWOBJ0097E";

    /**
     * <pre>
     * FAILED_TO_STOP_REST_WAB_CWOBJ0098E=CWOBJ0098E: The eXtreme Scale REST Gateway web application bundle could not be stopped.
     * FAILED_TO_STOP_REST_WAB_CWOBJ0098E.explanation=The active eXtreme Scale REST Gateway application bundle in this Liberty server's OSGi framework could not be deactivated. The REST Gateway is still active.
     * FAILED_TO_STOP_REST_WAB_CWOBJ0098E.useraction=See log output for more information as to why the web application bundle could not be stopped. You may need to restart the server.
     * </pre>
     */
    public String FAILED_TO_STOP_REST_WAB_CWOBJ0098E = "FAILED_TO_STOP_REST_WAB_CWOBJ0098E";

    /**
     * <pre>
     * FAILED_TO_UNINSTALL_REST_WAB_CWOBJ0099I=CWOBJ0099I: The eXtreme Scale REST Gateway web application bundle was stopped, but could not be uninstalled.
     * FAILED_TO_UNINSTALL_REST_WAB_CWOBJ0099I.explanation=The eXtreme Scale REST Gateway application bundle was stopped succesfully, but could not be uninstalled from this Liberty server's OSGi framework. This means that the bundle is sitting in INSTALLED state in the OSGi framework, but ultimately is not a problem.
     * FAILED_TO_UNINSTALL_REST_WAB_CWOBJ0099I.useraction=If your server has an OSGi console port specified, you can uninstall the bundle manually using the console. See log output for more information.
     * </pre>
     */
    public String FAILED_TO_UNINSTALL_REST_WAB_CWOBJ0099I = "FAILED_TO_UNINSTALL_REST_WAB_CWOBJ0099I";

    /**
     * <pre>
     * FAILED_TO_GENERATE_REST_WAB_CWOBJ0100E=CWOBJ0100E: The eXtreme Scale REST Gateway web application could not be generated here: {0}
     * FAILED_TO_GENERATE_REST_WAB_CWOBJ0100E.explanation=The REST Gateway application could not be generated in the specified temporary directory. This could indicate that the current user does not have write permissions or that the disk is full.
     * FAILED_TO_GENERATE_REST_WAB_CWOBJ0100E.useraction=Check the specified path to see if the current user has write permission to that directory and that it has sufficient free space (at least 1 MB).  See logs for more information.
     * </pre>
     */
    public String FAILED_TO_GENERATE_REST_WAB_CWOBJ0100E = "FAILED_TO_GENERATE_REST_WAB_CWOBJ0100E";

    /**
     * <pre>
     * INVALID_CLIENT_DOMAIN_CONFIG_CWOBJ0101W=CWOBJ0101W: Ignoring invalid client domain endpoint configuration: {0}
     * </pre>
     */
    public String INVALID_CLIENT_DOMAIN_CONFIG_CWOBJ0101W = "INVALID_CLIENT_DOMAIN_CONFIG_CWOBJ0101W";

    /**
     * <pre>
     * SPECIFIED_DEFAULT_DOMAIN_DOES_NOT_EXIST_CWOBJ0102W=CWOBJ0102W: Specified client default domain, {0}, does not exist in the endpointConfig configuration. No default domain will be set.
     * </pre>
     */
    public String SPECIFIED_DEFAULT_DOMAIN_DOES_NOT_EXIST_CWOBJ0102W = "SPECIFIED_DEFAULT_DOMAIN_DOES_NOT_EXIST_CWOBJ0102W";

    /**
     * <pre>
     * CANNOT_LOAD_IBMCFW_CLASSES_CWOBJ0103E=CWOBJ01013E: This server cannot load necessary channel framework and/or ORB classes. Ensure that ibmcfw.jar, ibmorb.jar, and ibmorbapi.jar are in your java.endorsed.dirs property.
     * CANNOT_LOAD_IBMCFW_CLASSES_CWOBJ0103E.explanation=The eXtreme Scale client and server code depends on channel framework and ORB classes that must be loaded in the JVM classloader.  The java.endorsed.dirs system property must include a path to a directory containing these files.
     * CANNOT_LOAD_IBMCFW_CLASSES_CWOBJ0103E.useraction=Update your jvm.options or bootstrap.properties file to include the directory containing these files in the java.endorsed.dirs system properties. An example of this can be found in <WLP_HOME>/etc/jvm.options.
     * </pre>
     */
    public String CANNOT_LOAD_IBMCFW_CLASSES_CWOBJ0103E = "CANNOT_LOAD_IBMCFW_CLASSES_CWOBJ0103E";

    /**
     * <pre>
     * UNEXPECTED_FILE_IN_GRIDS_DIR_CWOBJ0104W=CWOBJ0104W: Unexpected file found in the grids directory, {0}. This file will be ignored.
     * UNEXPECTED_FILE_IN_GRIDS_DIR_CWOBJ0104W.explanation=The only files in the grids directory that are recognized by the eXtreme Scale server are objectgrid.xml, objectGridDeployment.xml (both case-sensistive) or files with the ".jar" extension. This message indicates that a file not recognized by the server exists in the grids directory and will be ignored. 
     * UNEXPECTED_FILE_IN_GRIDS_DIR_CWOBJ0104W.useraction=Check to ensure whether the file was mis-named. If this is the case, the file should be renamed to either "objectgrid.xml", "objectGridDeployment.xml" or any name but with the ".jar" extension. If the file is not needed, it should be deleted to avoid this warning.
     * </pre>
     */
    public String UNEXPECTED_FILE_IN_GRIDS_DIR_CWOBJ0104W = "UNEXPECTED_FILE_IN_GRIDS_DIR_CWOBJ0104W";

    /**
     * <pre>
     * UNRECOGNIZED_DYNACACHE_APP_CONFIG_PROPERTY_CWOBJ0108W=CWOBJ0108W: Unrecognized XS Dynacache App Configuration property {0} is not correct and will be ignored.
     * UNRECOGNIZED_DYNACACHE_APP_CONFIG_PROPERTY_CWOBJ0108W.explanation=here is an unrecognized property found while processing the server properties.
     * UNRECOGNIZED_DYNACACHE_APP_CONFIG_PROPERTY_CWOBJ0108W.useraction=Remove the incorrect property or replace it with the correct value.
     * </pre>
     */
    public String UNRECOGNIZED_DYNACACHE_APP_CONFIG_PROPERTY_CWOBJ0108W = "UNRECOGNIZED_DYNACACHE_APP_CONFIG_PROPERTY_CWOBJ0108W";

    /**
     * <pre>
     * GLOBAL_INDEX_NEEDS_XIO_CWOBJ0109=CWOBJ0109E: A global index is defined for objectGrid {0}, and backingMap {1}, but eXtremeIO transport is not enabled.
     * GLOBAL_INDEX_NEEDS_XIO_CWOBJ0109.explanation=Global indexes require that you enable eXtremeIO transport.
     * GLOBAL_INDEX_NEEDS_XIO_CWOBJ0109.useraction=Enable eXtremeIO transport and restart the server.
     * </pre>
     */
    public String GLOBAL_INDEX_NEEDS_XIO_CWOBJ0109 = "GLOBAL_INDEX_NEEDS_XIO_CWOBJ0109";

    /**
     * <pre>
     * # {0} grid name
     * # {1} jndi name
     * UNABLE_TO_CONNECT_TO_GRID_FOR_JNDI_ACCESS_CWOBJ0110=CWOBJ0110E: Unable to connect to objectGrid \"{0}\" for JNDI access at {1}.
     * UNABLE_TO_CONNECT_TO_GRID_FOR_JNDI_ACCESS_CWOBJ0110.explanation=Unable to connect to objectGrid for JNDI access.  Catalog server endpoints and security settings may be incorrect.
     * UNABLE_TO_CONNECT_TO_GRID_FOR_JNDI_ACCESS_CWOBJ0110.useraction=Check catalog server endpoints and security settings.
     * </pre>
     */
    public String UNABLE_TO_CONNECT_TO_GRID_FOR_JNDI_ACCESS_CWOBJ0110 = "UNABLE_TO_CONNECT_TO_GRID_FOR_JNDI_ACCESS_CWOBJ0110";

    /**
     * <pre>
     * # {0} container server name
	 * UNABLE_TO_STOP_CONTAINER_SERVER_CWOBJ0111=CWOBJ0111E: Unable to stop container server named \"{0}\".
	 * UNABLE_TO_STOP_CONTAINER_SERVER_CWOBJ0111.explanation=Unable to stop container server.  Check log for details.
	 * UNABLE_TO_STOP_CONTAINER_SERVER_CWOBJ0111.useraction=Check log for details and corrective action. 
     * </pre>
     */
    public String UNABLE_TO_STOP_CONTAINER_SERVER_CWOBJ0111="UNABLE_TO_STOP_CONTAINER_SERVER_CWOBJ0111";
    
    /**
     * <pre>
     * SET_TRACE_FILE_NOT_SUPPORTED_CWOBJ0115=CWOBJ0115E: Set trace file name option -trf (--traceFile) is not support for xscmd under Liberty.
     * SET_TRACE_FILE_NOT_SUPPORTED_CWOBJ0115.explanation=Trace file name can only be specified in server.xml using <logging> tag.
     * SET_TRACE_FILE_NOT_SUPPORTED_CWOBJ0115.useraction=Specify trace file name in <wlp install root>\wxs\servers\xscmd\server.xml.
     * </pre>
     */
    public String SET_TRACE_FILE_NOT_SUPPORTED_CWOBJ0115 = "SET_TRACE_FILE_NOT_SUPPORTED_CWOBJ0115";

    /**
     * <pre>
     * SET_TRACE_SPEC_NOT_SUPPORTED_CWOBJ0112=CWOBJ0112E: Set trace specification option -trs (--traceSpec") is not support for xscmd under Liberty.
     * SET_TRACE_SPEC_NOT_SUPPORTED_CWOBJ0112.explanation=Trace specificatoin can only be specified in server.xml using <logging> tag.
     * SET_TRACE_SPEC_NOT_SUPPORTED_CWOBJ0112.useraction=Specify trace specificatoin in <wlp install root>\wxs\servers\xscmd\server.xml.
     * </pre>
     */
    public String SET_TRACE_SPEC_NOT_SUPPORTED_CWOBJ0112 = "SET_TRACE_SPEC_NOT_SUPPORTED_CWOBJ0112";

    /**
     * <pre>
     * SET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0113=CWOBJ0113E: setTraceSpec xscmd is not supported in Liberty.  Please set trace specification in server.xml.
     * SET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0113.explanation=Trace specificatoin can only be specified in server.xml using <logging> tag.
     * SET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0113.useraction=Specify trace specificatoin in server.xml.
     * </pre>
     */
    public String SET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0113 = "SET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0113";

    /**
     * <pre>
     * GET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0114=CWOBJ0114E: getTraceSpec xscmd is not supported in Liberty.  Please get trace specification from server.xml.
     * GET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0114.explanation=Trace specificatoin can only be retrieved from server.xml using <logging> tag.
     * GET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0114.useraction=Look at trace specificatoin in server.xml.
     * </pre>
     */
    public String GET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0114 = "GET_TRACE_SPEC_CMD_NOT_SUPPORTED_CWOBJ0114";
        
    /**
     * <pre>
     * {0} Request URI
	 * INCORRECT_URI_TOKEN_COUNT_REST_WAB_CWOBJ0141E=CWOBJ0141E: The URI accessing eXtreme Scale REST Gateway has incorrect number of tokens.  URI retrieved is {0}.
	 * INCORRECT_URI_TOKEN_COUNT_REST_WAB_CWOBJ0141E.explanation=The URI accessing eXtreme Scale REST Gateway has incorrect number of tokens.  URI retrieved is {0}.  
	 * INCORRECT_URI_TOKEN_COUNT_REST_WAB_CWOBJ0141E.useraction=Change the request URI to follow the specification provided by eXtreme Scale REST Gateway.
     * </pre>
     */
    public String INCORRECT_URI_TOKEN_COUNT_REST_WAB_CWOBJ0141E = "INCORRECT_URI_TOKEN_COUNT_REST_WAB_CWOBJ0141E";
    
    /**
     * <pre>
     * {0} Request URI
	 * INCORRECT_DELETE_URI_REST_WAB_CWOBJ0142E=CWOBJ0142E: The delete operation URI accessing eXtreme Scale REST Gateway has incorrect number of tokens.  URI retrieved is {0}.
	 * INCORRECT_DELETE_URI_REST_WAB_CWOBJ0142E.explanation=The delete operation URI accessing eXtreme Scale REST Gateway has incorrect number of tokens.  URI retrieved is {0}.  
	 * INCORRECT_DELETE_URI_REST_WAB_CWOBJ0142E.useraction=Change the delete operation request URI to follow the specification provided by eXtreme Scale REST Gateway.
     * </pre>
     */
    public String INCORRECT_DELETE_URI_REST_WAB_CWOBJ0142E = "INCORRECT_DELETE_URI_REST_WAB_CWOBJ0142E";

    //
    // End Liberty-related messages
    //

    /**
     * <pre>
     * # {0} Transport type
     * CURRENT_TRANSPORT_CWOBJ0200=CWOBJ0200I: The transport type is {0}.
     * CURRENT_TRANSPORT_CWOBJ0200.explanation=Specifies the transport type the server uses for communication. All servers in a catalog service domain use the same transport type.
     * CURRENT_TRANSPORT_CWOBJ0200.useraction=No action is required.
     * </pre>
     */
    public String CURRENT_TRANSPORT_CWOBJ0200 = "CURRENT_TRANSPORT_CWOBJ0200";

    /**
     * <pre>
     * # {0} server name
     * # {1} transport type, example ORB, XIO
     * # {2} exception
     * MIXED_TRANSPORT_CWOBJ0201=CWOBJ0201E: Received an exception when initiating communication with another server. Verify that all servers in the catalog service domain are using the same transport type. Server {0} uses the {1} transport type. The received exception: {2}
     * MIXED_TRANSPORT_CWOBJ0201.explanation=A server was unable to communicate with a remote server and might not start successfully.  Servers within the same catalog service domain must be using the same transport type, for example Object Request Broker (ORB) or IBM eXtremeIO (XIO).
     * MIXED_TRANSPORT_CWOBJ0201.useraction=Verify that all of the servers in a catalog service domain are starting with the same transport type. You can check the transport type on running servers,  with the xscmd -c showTransportType command.
     * </pre>
     */
    public String MIXED_TRANSPORT_CWOBJ0201 = "MIXED_TRANSPORT_CWOBJ0201";

    /**
     * <pre>
     * # {0} list of bootstraps
     * # {1} transport types
     * # {2} Exception message
     * UNKNOWN_TRANSPORT_CWOBJ0202=CWOBJ0202W: The transport type of the remote server on {0} could not be determined. Remote server transport type did not match {1}. The exception received while determining the transport type follows: {2}
     * UNKNOWN_TRANSPORT_CWOBJ0202.explanation=The local server could not determine the transport type of the remote server. Known transport types will be attempted.
     * UNKNOWN_TRANSPORT_CWOBJ0202.useraction=Review the transport types that are used by the servers in the catalog service domain and verify that they are set to the same transport type. If security is enabled, review the security settings between the servers or client and the catalog server. Verify network settings between the client or server and the catalog servers.
     * </pre>
     */
    public String UNKNOWN_TRANSPORT_CWOBJ0202 = "UNKNOWN_TRANSPORT_CWOBJ0202";

    /**
     * <pre>
     * # {0} list of bootstraps
     * # {1} transport types
     * HTTP_TRANSPORT_CWOBJ0203=CWOBJ0203E: The transport type of the remote server on {0} reported HTTP transport. Acceptable transport types are [{1}].
     * HTTP_TRANSPORT_CWOBJ0203.explanation=The remote server reported a transport type of HTTP. The local server cannot connect using that transport.
     * HTTP_TRANSPORT_CWOBJ0203.useraction=Review the catalog service endpoints and verify they are the bootstrap addresses or listener ports for the catalog servers.
     * </pre>
     */
    public String HTTP_TRANSPORT_CWOBJ0203 = "HTTP_TRANSPORT_CWOBJ0203";

    /**
     * <pre>
     * # {0} server or client
     * # {1} catalog service endpoints
     * AUTO_DETECT_TRANSPORT_CWOBJ0204=CWOBJ0204I: The transport type of this {0} JVM is being determined by contacting the catalog service domain with the catalog service endpoints of: {1}.
     * AUTO_DETECT_TRANSPORT_CWOBJ0204.explanation=The server or client JVM did not start up with a specific transport indicated. The transport will be determined by the transport of the catalog servers.
     * AUTO_DETECT_TRANSPORT_CWOBJ0204.useraction=No action is required.
     * </pre>
     */
    public String AUTO_DETECT_TRANSPORT_CWOBJ0204 = "AUTO_DETECT_TRANSPORT_CWOBJ0204";

    /**
     * <pre>
     * # {0} server or client
     * # {1} system or server property
     * # {2} property name
     * # {3} property value
     * TRANSPORT_TYPE_SET_BY_PROPERTIES_CWOBJ0205=CWOBJ0205I: The transport type of this {0} JVM was configured by the {1}, {2}. The value was {3}.
     * TRANSPORT_TYPE_SET_BY_PROPERTIES_CWOBJ0205.explanation=The transport type of the client or server JVM was configured by a property. The catalog server must run the same transport or the connection will fail.
     * TRANSPORT_TYPE_SET_BY_PROPERTIES_CWOBJ0205.useraction=No action is required.
     * </pre>
     */
    public String TRANSPORT_TYPE_SET_BY_PROPERTIES_CWOBJ0205 = "TRANSPORT_TYPE_SET_BY_PROPERTIES_CWOBJ0205";

    /**
     * <pre>
     * XM_SET_XIO_CWOBJ_CWOBJ0206=CWOBJ0206I: eXtremeMemory storage is enabled, the transport is automatically set to eXtremeIO.
     * XM_SET_XIO_CWOBJ_CWOBJ0206.explanation=The transport was automatically changed to eXtremeIO to support eXtremeMemory.
     * XM_SET_XIO_CWOBJ_CWOBJ0206.useraction=No action is required.
     * </pre>
     */
    public String XM_SET_XIO_CWOBJ_CWOBJ0206 = "XM_SET_XIO_CWOBJ_CWOBJ0206";

    /**
     * <pre>
     * # {0} host name
     * HOSTNAME_NOT_FULLY_QUALIFIED_CWOBJ0207W=CWOBJ0207: Hostname, {0}, does not appear to be fully qualified. Multi-host connectivity may not function correctly.
     * HOSTNAME_NOT_FULLY_QUALIFIED_CWOBJ0207W.explanation=The IP host address for this server does not contain a domain name (i.e. myhost.mydomain). This can lead to network connectivity issues when connecting with processes on remote hosts.
     * HOSTNAME_NOT_FULLY_QUALIFIED_CWOBJ0207W.useraction=Consult your operating system's documentation to specify a fully-qualified domain name for this host.
     * </pre>
     */
    public String HOSTNAME_NOT_FULLY_QUALIFIED_CWOBJ0207W = "HOSTNAME_NOT_FULLY_QUALIFIED_CWOBJ0207W";

    /**
     * <pre>
     * # {0} host address
     * XIO_ADDR_IS_LINK_LOCAL_CWOBJ0208W=CWOBJ0208W: The eXtremeIO transport has discovered that the host address, {0}, is link-local and unlikely to function properly.
     * XIO_ADDR_IS_LINK_LOCAL_CWOBJ0208W.explanation=The host address for this server is a link-local address, which may function properly in development environments, where the eXtreme Scale client and grid are all on the same host, but may fail when connecting with client or grid processes on other hosts.
     * XIO_ADDR_IS_LINK_LOCAL_CWOBJ0208W.useraction=Consult your operating system and/or network documentation to use a non-link-local address for this host, or specify a non-link-local address in the server properties for this server if one already exists.
     * </pre>
     */
    public String XIO_ADDR_IS_LINK_LOCAL_CWOBJ0208W = "XIO_ADDR_IS_LINK_LOCAL_CWOBJ0208W";

    /**
     * <pre>
     * UNABLE_TO_RESOLVE_LOCALHOST_HOSTNAME_CWOBJ0209=CWOBJ0209W: Unable to resolve host name, localhost - using 127.0.0.1 by default.
     * UNABLE_TO_RESOLVE_LOCALHOST_HOSTNAME_CWOBJ0209.explanation=The eXtreme Scale server was unable to resolve the IP address of the local host. This usually indicates a problem with the network or DNS settings of the host.
     * UNABLE_TO_RESOLVE_LOCALHOST_HOSTNAME_CWOBJ0209.useraction=Consult your operating system and/or network documentation to specify a loopback address for the local host.
     * </pre>
     */
    public String UNABLE_TO_RESOLVE_LOCALHOST_HOSTNAME_CWOBJ0209 = "UNABLE_TO_RESOLVE_LOCALHOST_HOSTNAME_CWOBJ0209";

    /**
     * <pre> 
     * # {0} list of bootstraps
     * # {1} Exception message
     * UNKNOWN_TRANSPORT_CWOBJ0210=CWOBJ0210W: The transport type of the remote server on {0} cannot be determined. The following exception occurred while determining the transport type: {1} 
     * UNKNOWN_TRANSPORT_CWOBJ0210.explanation=The local server cannot determine the transport type of the remote server.  This usually indicates a problem establishing a connection with the remote server.
     * UNKNOWN_TRANSPORT_CWOBJ0210.useraction=Verify network settings between the client or server and the catalog servers.
     * </pre>
     */
    public String UNKNOWN_TRANSPORT_CWOBJ0210 = "UNKNOWN_TRANSPORT_CWOBJ0210";

    /**
     * <pre>
     * # {0} provided catalog server endpoints
     * # {1} domain names reported by the endpoints
     * MIXED_DOMAIN_NAMES_CWOBJ0211E=CWOBJ0211E: The catalog server endpoints provided do not all point to the same domain. The provided catalog server endpoints are {0}. The domain names reported are {1}.
     * MIXED_DOMAIN_NAMES_CWOBJ0211E.explanation=A container server or client cannot only connect to a singled catalog service domain. The endpoints indicate the catalog servers at the provided endpoints belong to different domains.
     * MIXED_DOMAIN_NAMES_CWOBJ0211E.useraction=Review the catalog server endpoints and select endpoints from the same catalog service domain.
     * </pre>
     */
    public String MIXED_DOMAIN_NAMES_CWOBJ0211E = "MIXED_DOMAIN_NAMES_CWOBJ0211E";
    
    /**
     * <pre>
     * CWOBJ0900=CWOBJ0900I: The ObjectGrid runtime component is started for server {0}.
     * CWOBJ0900.explanation=The ObjectGrid component is started.
     * CWOBJ0900.useraction=No action is required.
     * </pre>
     */
    public String CWOBJ0900 = "CWOBJ0900";

    /**
     * <pre>
     * CWOBJ0901=CWOBJ0901E: {0} system property is required to start ObjectGrid component for server: {1}.
     * CWOBJ0901.explanation=ObjectGrid runtime component requires {0} to be specified as a Java Virtual Machine system property.
     * CWOBJ0901.useraction=See the Administering WebSphere eXtreme Scale with WebSphere Application Server section in the WebSphere eXtreme Scale product documentation.
     * </pre>
     */
    public String CWOBJ0901 = "CWOBJ0901";

    /**
     * <pre>
     * CWOBJ0902=CWOBJ0902W: An error prevented the ObjectGrid runtime component from starting for server: {0}.
     * CWOBJ0902.explanation=A prior error prevented the ObjectGrid component from starting.
     * CWOBJ0902.useraction=See prior error messages to determine what prevented ObjectGrid component from starting.
     * </pre>
     */
    public String CWOBJ0902 = "CWOBJ0902";

    /**
     * <pre>
     * # {0} version
     * INTERNAL_OBJECTGRID_VERSION_CWOBJ0903=CWOBJ0903I: Internal ObjectGrid version being used is {0}
     * INTERNAL_OBJECTGRID_VERSION_CWOBJ0903.explanation=The internal version of ObjectGrid being used, for use by IBM support.
     * INTERNAL_OBJECTGRID_VERSION_CWOBJ0903.useraction=None.
     * </pre>
     */
    public String INTERNAL_OBJECTGRID_VERSION_CWOBJ0903 = "INTERNAL_OBJECTGRID_VERSION_CWOBJ0903";

    /**
     * <pre>
     * # {0} application name
     * FILES_NOT_FOUND_CWOBJ0905=CWOBJ0904I: WebSphere eXtreme Scale scanned application {0} for object grid configuration files and did not find any.
     * FILES_NOT_FOUND_CWOBJ0905.explanation=WebSphere eXtreme Scale requires configuration files in order to start the runtime components for this server.
     * FILES_NOT_FOUND_CWOBJ0905.useraction=If the application is intended to provide object grid configuration, ensure the files are present and appropriately named, otherwise no action is neccessary.
     * </pre>
     */
    public String FILES_NOT_FOUND_CWOBJ0905 = "FILES_NOT_FOUND_CWOBJ0905";

    /**
     * <pre>
     * # {0} file that was found
     * # {1} list of missing files, comma separated
     * # {2} server name
     * # Do not translate:  WebSphere, eXtreme, Scale, ObjectGrid
     * FILES_DO_NOT_EXIST_CWOBJ0904=CWOBJ0904E: {0} exists but the following file or files are missing: {1}. Cannot start the ObjectGrid runtime component for server: {2}.
     * FILES_DO_NOT_EXIST_CWOBJ0904.explanation=WebSphere eXtreme Scale requires one or more missing files in order to start the runtime component for this server.
     * FILES_DO_NOT_EXIST_CWOBJ0904.useraction=Ensure the required file or files are present and perform this operation again. See the Administering WebSphere eXtreme Scale with WebSphere Application Server section in the WebSphere eXtreme Scale product documentation for more details.
     * </pre>
     */
    public String FILES_DO_NOT_EXIST_CWOBJ0904 = "FILES_DO_NOT_EXIST_CWOBJ0904";

    /**
     * <pre>
     * CWOBJ0910=CWOBJ0910I: The ObjectGrid runtime component is stopped for server {0}.
     * CWOBJ0910.explanation=The ObjectGrid component is stopped.
     * CWOBJ0910.useraction=No action is required.
     * </pre>
     */
    public String CWOBJ0910 = "CWOBJ0910";

    /**
     * <pre>
     * # {0} and {1} application names
     * CWOBJ0912=CWOBJ0912E: The application {0} has ObjectGrid configuration files that will not be used because application "{1}" is currently running an ObjectGrid server instance.
     * CWOBJ0912.explanation=Two applications with ObjectGrid server configuration files with this server name are deployed to this application server.  Only one ObjectGrid server configuration is allowed in a WebSphere Application Server.
     * CWOBJ0912.useraction=Ensure there is only one ObjectGrid server application deployed on this server.
     * </pre>
     */
    public String CWOBJ0912 = "CWOBJ0912";

    /**
     * <pre>
     * # {0} property files
     * LOADED_PROPERTY_FILES_CWOBJ0913=CWOBJ0913I: Server property files have been loaded: {0}
     * LOADED_PROPERTY_FILES_CWOBJ0913.explanation=One or more server properties files were loaded.  If multiple files are displayed, then the properties are loaded in the order displayed.
     * LOADED_PROPERTY_FILES_CWOBJ0913.useraction=None. Informational entry.
     * </pre>
     */
    public String LOADED_PROPERTY_FILES_CWOBJ0913 = "LOADED_PROPERTY_FILES_CWOBJ0913";

    /**
     * <pre>
     * # {0} ORB Version
     * # Do not translate ORB
     * "ORB version used is " + com.ibm.rmi.util.Version.asString());
     * ORB_VERSION_USED_CWOBJ0915=CWOBJ0915I: ORB version used is {0}
     * ORB_VERSION_USED_CWOBJ0915.explanation=The ORB version is being used is listed here using com.ibm.rmi.util.Version.
     * ORB_VERSION_USED_CWOBJ0915.useraction=None
     * </pre>
     */
    public String ORB_VERSION_USED_CWOBJ0915 = "ORB_VERSION_USED_CWOBJ0915";

    /**
     * <pre>
     * # {0} client security property file
     * CLIENT_SECURITY_PROP_FILE_JVM_ARG_CWOBJ0916=CWOBJ0916I: A client security property file is set as the JVM argument: {0}. This client security property file will be used as the default client security configuration.
     * CLIENT_SECURITY_PROP_FILE_JVM_ARG_CWOBJ0916.explanation=The user sets a client security property file using JVM argument. If no client security configuration is provided at the connect time, ObjectGrid client runtime will use this configuration file as the default client security configuration.
     * CLIENT_SECURITY_PROP_FILE_JVM_ARG_CWOBJ0916.useraction=None.
     * </pre>
     */
    // Message no longer used
    // public String CLIENT_SECURITY_PROP_FILE_JVM_ARG_CWOBJ0916 = "CLIENT_SECURITY_PROP_FILE_JVM_ARG_CWOBJ0916";

    /**
     * <pre>
     * # {0} Server or Client
     * # {1} host
     * # {2} port
     * # Do not translate ORB
     * ORB_LISTENING_CWOBJ0917=CWOBJ0917I: {0} ORB is listening on host and port {1}:{2}
     * ORB_LISTENING_CWOBJ0917.explanation=Lists the hostname and the port that the ORB listens on.
     * ORB_LISTENING_CWOBJ0917.useraction=None
     * </pre>
     */
    public String ORB_LISTENING_CWOBJ0917 = "ORB_LISTENING_CWOBJ0917";

    /**
     * <pre>
     * # {0} domain name
     * # {1} non ObjectGridConfiguration object
     * NON_OBJECTGRID_CONFIG_OBJECT_CWOBJ0918=CWOBJ0918W: The list that was supplied to override client side ObjectGrid settings for domain/cluster {0} contains an element that is not an ObjectGridConfiguration object.  This element will be removed from the List: {1}
     * NON_OBJECTGRID_CONFIG_OBJECT_CWOBJ0918.explanation=The specified object will be removed and not used to override any client side settings.
     * NON_OBJECTGRID_CONFIG_OBJECT_CWOBJ0918.useraction=Review the object listed and correct it necessary.
     * </pre>
     */
    public String NON_OBJECTGRID_CONFIG_OBJECT_CWOBJ0918 = "NON_OBJECTGRID_CONFIG_OBJECT_CWOBJ0918";

    /**
     * <pre>
     * # {0} server property file
     * SERVER_PROPERTY_NOT_FOUND_CWOBJ0919=CWOBJ0919W: The server property file {0} cannot be found. All server properties are set to the default values.
     * SERVER_PROPERTY_NOT_FOUND_CWOBJ0919.explanation=A ServerProperties file was created programmatically, but the property file name supplied does not exist.
     * SERVER_PROPERTY_NOT_FOUND_CWOBJ0919.useraction=Review the server property file path name, correct the error and resubmit the operation.
     * </pre>
     */
    public String SERVER_PROPERTY_NOT_FOUND_CWOBJ0919 = "SERVER_PROPERTY_NOT_FOUND_CWOBJ0919";

    /**
     * <pre>
     * # {0} Fully qualified server name
     * # {1} WCCM or custom property
     * # {2} Catalog service configuration string
     * CATALOG_SERVER_NOT_STARTED_FOR_PROCESS_CWOBJ0920=CWOBJ0920I: The catalog service was not started in this process: {0}. The {1} is: {2}
     * CATALOG_SERVER_NOT_STARTED_FOR_PROCESS_CWOBJ0920.explanation=This server process is not listed in the catalog service endpoints provided in the catalog service configuration. This indicates that the catalog service is not required for this process.
     * CATALOG_SERVER_NOT_STARTED_FOR_PROCESS_CWOBJ0920.useraction=If the process listed should have a catalog service started, review the catalog service configuration and verify that the hostname and port for the process is included and is correct. See the Starting the catalog service process in a WebSphere Application Server environment section in the WebSphere eXtreme Scale product documentation for more information on catalog service configuration.
     * </pre>
     */
    public String CATALOG_SERVER_NOT_STARTED_FOR_PROCESS_CWOBJ0920 = "CATALOG_SERVER_NOT_STARTED_FOR_PROCESS_CWOBJ0920";

    /**
     * <pre>
     * # {0} the property file name
     * CLIENT_PROP_FILE_NOT_FOUND_CWOBJ0922W=CWOBJ0922W: The ObjectGrid client property file {0} cannot be found.
     * CLIENT_PROP_FILE_NOT_FOUND_CWOBJ0922W.explanation=The ObjectGrid client property file {0} cannot be found.
     * CLIENT_PROP_FILE_NOT_FOUND_CWOBJ0922W.useraction=Ensure that the file path name is correct and that the file is in the classpath. See the Client properties file article in the WebSphere eXtreme Scale product documentation for more information about using the client properties file.
     * </pre>
     */
    public String CLIENT_PROP_FILE_NOT_FOUND_CWOBJ0922W = "CLIENT_PROP_FILE_NOT_FOUND_CWOBJ0922W";

    /**
     * <pre>
     * # {0} client property file name
     * LOADED_CLIENT_PROPERTY_FILES_CWOBJ0924I=CWOBJ0924I: The client property file {0} has been loaded.
     * LOADED_CLIENT_PROPERTY_FILES_CWOBJ0924I.explanation=The client property file is loaded.
     * LOADED_CLIENT_PROPERTY_FILES_CWOBJ0924I.useraction=No action is required.
     * </pre>
     */
    public String LOADED_CLIENT_PROPERTY_FILES_CWOBJ0924I = "LOADED_CLIENT_PROPERTY_FILES_CWOBJ0924I";

    /**
     * <pre>
     * # auto start file name
     * # missing property
     * AUTO_START_PROP_NOT_FOUND_CWOBJ0925E=CWOBJ0925E: A container autostart file {0} was found in the classpath, but the {1} property was not specified.
     * AUTO_START_PROP_NOT_FOUND_CWOBJ0925E.explanation=The listed property could not be found while automatically starting the container.
     * AUTO_START_PROP_NOT_FOUND_CWOBJ0925E.useraction=Review the autostart file and fix any formatting or syntax error or add the property.
     * </pre>
     */
    public String AUTO_START_PROP_NOT_FOUND_CWOBJ0925E = "AUTO_START_PROP_NOT_FOUND_CWOBJ0925E";

//            CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927
    /**
     * <pre>
     * # {0} system that is not supported
     * CATALOG_SERVER_NOT_SUPPORTED_CWOBJ0926=CWOBJ0926I: The eXtreme Scale server runtime environment is not supported on {0}.
     * CATALOG_SERVER_NOT_SUPPORTED_CWOBJ0926.explanation=The eXtreme Scale server runtime environment is not available on a client-only installation, on z/OS operating systems or on an unsupported process type.
     * CATALOG_SERVER_NOT_SUPPORTED_CWOBJ0926.useraction=Install the appropriate offering for your environment.
     * </pre>
     */
    public String CATALOG_SERVER_NOT_SUPPORTED_CWOBJ0926 = "CATALOG_SERVER_NOT_SUPPORTED_CWOBJ0926";
    
    /**
     * <pre>
     * CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927=CWOBJ0927I: The eXtreme Scale catalog server is not configured on this deployment manager or node agent.
     * CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927.explanation=The eXtreme Scale catalog server is not configured on the current deployment manager or node agent.
     * CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927.useraction=Configure the catalog server.
     * </pre>
     */
    public String CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927 = "CATALOG_SERVER_NOT_CONFIGURED_CWOBJ0927";
    
    /**
     * <pre>
     * OPEN_FOR_BUSINESS_CWOBJ1001=CWOBJ1001I: ObjectGrid Server {0} is ready to process requests.
     * OPEN_FOR_BUSINESS_CWOBJ1001.explanation=ObjectGrid Server is ready to process requests.
     * OPEN_FOR_BUSINESS_CWOBJ1001.useraction=The services for this ObjectGrid Server are available.
     * </pre>
     */
    public String OPEN_FOR_BUSINESS_CWOBJ1001 = "OPEN_FOR_BUSINESS_CWOBJ1001";
    
    /**
     * <pre>
     * # Do not translate XIO_ADDRESS
     * XIO_ADDRESS_NOT_DEFINED_CWOBJ0928=CWOBJ0928I: The eXtreme Scale catalog server is not starting because the XIO_ADDRESS port is not defined.
     * XIO_ADDRESS_NOT_DEFINED_CWOBJ0928.explanation=When the eXtremeIO transport is configured, the XIO_ADDRESS port needs to be defined.
     * XIO_ADDRESS_NOT_DEFINED_CWOBJ0928.useraction=Define the XIO_ADDRESS port.
     * </pre>
     */
    public String XIO_ADDRESS_NOT_DEFINED_CWOBJ0928= "XIO_ADDRESS_NOT_DEFINED_CWOBJ0928";

    /**
     * <pre>
     * CLIENT_REQUESTQ_CWOBJ1005=CWOBJ1005E: The incoming request queue is null.
     * CLIENT_REQUESTQ_CWOBJ1005.explanation=Client request handler cannot retrieve requests.
     * CLIENT_REQUESTQ_CWOBJ1005.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String CLIENT_REQUESTQ_CWOBJ1005 = "CLIENT_REQUESTQ_CWOBJ1005";

    /**
     * <pre>
     * CLIENT_RESULTQ_CWOBJ1006=CWOBJ1006E: The outgoing result queue is null.
     * CLIENT_RESULTQ_CWOBJ1006.explanation=Client request handler cannot give result to client.
     * CLIENT_RESULTQ_CWOBJ1006.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String CLIENT_RESULTQ_CWOBJ1006 = "CLIENT_RESULTQ_CWOBJ1006";

    /**
     * <pre>
     * ERROR_LOADING_ENTITY_CLASS_CWPRJ1006E=CWPRJ1006E: The class {0} cannot be found when loading entity {1}.
     * ERROR_LOADING_ENTITY_CLASS_CWPRJ1006E.explanation=The specified entity class or related class could not be loaded from the classpath.
     * ERROR_LOADING_ENTITY_CLASS_CWPRJ1006E.useraction=Verify that the class definition exists on the classpath.
     * </pre>
     */
    public String ERROR_LOADING_ENTITY_CLASS_CWPRJ1006E = "ERROR_LOADING_ENTITY_CLASS_CWPRJ1006E";

    /**
     * <pre>
     * CLIENT_REQUEST_CWOBJ1007=CWOBJ1007E: ObjectGrid client request is null.
     * CLIENT_REQUEST_CWOBJ1007.explanation=Client request handler cannot handle request that does not contain any information about the request.
     * CLIENT_REQUEST_CWOBJ1007.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String CLIENT_REQUEST_CWOBJ1007 = "CLIENT_REQUEST_CWOBJ1007";

    /**
     * <pre>
     * TXID_CWOBJ1008=CWOBJ1008E: ObjectGrid client request TxID is null.
     * TXID_CWOBJ1008.explanation=The TXID is necessary to match connections and for pooling. The TXID cannot be null.
     * TXID_CWOBJ1008.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String TXID_CWOBJ1008 = "TXID_CWOBJ1008";

    /**
     * <pre>
     * EXCEPTION_ON_SERVER_CWOBJ1013=CWOBJ1013W: An exception occurred on a remote server: {0}
     * EXCEPTION_ON_SERVER_CWOBJ1013.explanation=An exception occurred during the server runtime processing of a request from the client.
     * EXCEPTION_ON_SERVER_CWOBJ1013.useraction=Check the exception message to see whether this is an expected exception. Resolve any configuration errors, network problems or security errors.
     * </pre>
     */
    public String EXCEPTION_ON_SERVER_CWOBJ1013 = "EXCEPTION_ON_SERVER_CWOBJ1013";

    /**
     * <pre>
     * # {0} the message prefix on client or server that this message is about.  It should either be CWOBJ0006W or CWOBJ1013W
     * CLASSPATH_PROBLEM_CWOBJ1014=CWOBJ1014I: Preceding {0} message may be caused by application classes missing from the classpath on the server.
     * CLASSPATH_PROBLEM_CWOBJ1014.explanation=If an application class is not in the classpath on the server a serialization error will occur on the server when processing a message from a client.
     * CLASSPATH_PROBLEM_CWOBJ1014.useraction=Check the exception message to determine which class is missing on the server. Confirm that the class is included on the classpath. See the Class loader and classpath considerations section in the WebSphere eXtreme Scale product documentation for more information the classpath.
     * </pre>
     */
    public String CLASSPATH_PROBLEM_CWOBJ1014 = "CLASSPATH_PROBLEM_CWOBJ1014";

    /**
     * <pre>
     * # {0} the message prefix on client or server that this message is about.  It should either be CWOBJ0006W or CWOBJ1013W
     * OBJECTTRANSFORMER_PROBLEM_CWOBJ1015=CWOBJ1015I: Preceeding {0} message may be caused by an incorrect application implementation of the ObjectTransformer or Serializable interface
     * OBJECTTRANSFORMER_PROBLEM_CWOBJ1015.explanation=If an application implementation of ObjectTransformer or Serializable interface is incorrect, a serialization error will occur on the server when processing a message from a client.
     * OBJECTTRANSFORMER_PROBLEM_CWOBJ1015.useraction=Check the exception message to determine the problem. See the ObjectTransformer interface best practices section in the WebSphere eXtreme Scale product documentation for more information the ObjectTransformer interface.
     * </pre>
     */
    public String OBJECTTRANSFORMER_PROBLEM_CWOBJ1015 = "OBJECTTRANSFORMER_PROBLEM_CWOBJ1015";

    /**
     * <pre>
     * # {0} the property file name
     * # {1} the FileNotFoundException
     * PROPERTY_FILE_DOES_NOT_EXIST_CWOBJ1016E=CWOBJ1016E: The property file {0} does not exist: {1}.
     * PROPERTY_FILE_DOES_NOT_EXIST_CWOBJ1016E.explanation=The property file does not exist in the system. It will be ignored.
     * PROPERTY_FILE_DOES_NOT_EXIST_CWOBJ1016E.useraction=Specify a valid property file.
     * </pre>
     */
    public String PROPERTY_FILE_DOES_NOT_EXIST_CWOBJ1016E = "PROPERTY_FILE_DOES_NOT_EXIST_CWOBJ1016E";

    /**
     * <pre>
     * DCS_CWOBJ1118=CWOBJ1118I: ObjectGrid Server Initializing [Cluster: {0} Server: {1}].
     * DCS_CWOBJ1118.explanation=The ObjectGrid cluster member is initializing.
     * DCS_CWOBJ1118.useraction=No action is required.
     * </pre>
     */
    public String DCS_CWOBJ1118 = "DCS_CWOBJ1118";

    /**
     * <pre>
     * CLIENT_CWOBJ1119=CWOBJ1119I: ObjectGrid client failed to connect to host: {0} port: {1}.
     * CLIENT_CWOBJ1119.explanation=ObjectGrid client failed to connect.
     * CLIENT_CWOBJ1119.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_CWOBJ1119 = "CLIENT_CWOBJ1119";

    /**
     * <pre>
     * CLIENT_CWOBJ1120=CWOBJ1120I: ObjectGrid Client connected successfully to host: {0} port: {1}.
     * CLIENT_CWOBJ1120.explanation=ObjectGrid Client connected successfully.
     * CLIENT_CWOBJ1120.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_CWOBJ1120 = "CLIENT_CWOBJ1120";

    /**
     * <pre>
     * CLIENT_CONNECT_CWOBJ1126=CWOBJ1126I: The ObjectGrid client has connected to grid {0} in domain {1} using connection {2}.
     * CLIENT_CONNECT_CWOBJ1126.explanation=A client ObjectGrid instance connected successfully.
     * CLIENT_CONNECT_CWOBJ1126.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_CONNECT_CWOBJ1126 = "CLIENT_CONNECT_CWOBJ1126";

    /**
     * <pre>
     * CLIENT_DISCONNECT_CWOBJ1127=CWOBJ1127I: The ObjectGrid client connection {0} has disconnected from domain {1}.  ObjectGrids used by this connection were {2}.
     * CLIENT_DISCONNECT_CWOBJ1127.explanation=The ObjectGrid client disconnected successfully.
     * CLIENT_DISCONNECT_CWOBJ1127.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_DISCONNECT_CWOBJ1127 = "CLIENT_DISCONNECT_CWOBJ1127";

    /**
     * <pre>
     * CLIENT_CACHE_MAPS_CWOBJ1128=CWOBJ1128I: The client cache is enabled for maps {0} on ObjectGrid {1}.
     * CLIENT_CACHE_MAPS_CWOBJ1128.explanation=The provided list of maps has a client side cache enabled.
     * CLIENT_CACHE_MAPS_CWOBJ1128.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_CACHE_MAPS_CWOBJ1128 = "CLIENT_CACHE_MAPS_CWOBJ1128";

    /**
     * <pre>
     * # {0} container name
     * # {1} shards left
     * SHARDS_LEFT_ON_TERMINATE_CWOBJ1129=CWOBJ1129W: Some of the shards were not removed before the container terminate completed on {0} container. Shards left: {1}
     * SHARDS_LEFT_ON_TERMINATE_CWOBJ1129.explanation=A call to terminate the container attempted to destroy all of the shards on the container, but shards still remained on the container. A shard destroy could have failed or a new shard could have been placed during the terminate. Any shards placed on the terminating container will be failed over to other containers.
     * SHARDS_LEFT_ON_TERMINATE_CWOBJ1129.useraction=Verify the placement using the administrative tools, for example review placementStatus data.
     * </pre>
     */
    public String SHARDS_LEFT_ON_TERMINATE_CWOBJ1129 = "SHARDS_LEFT_ON_TERMINATE_CWOBJ1129";

    /**
     * <pre>
     * # {0} partition identifier
     * COMM_ERROR_WITH_SHARD_CWOBJ1130=CWOBJ1130W: Communication with the partition with the domain:grid:mapSet:partitionId {0} failed with an ORB exception.
     * COMM_ERROR_WITH_SHARD_CWOBJ1130.explanation=The shard access could not complete successfully because of some CORBA level exception.
     * COMM_ERROR_WITH_SHARD_CWOBJ1130.useraction=Potentially none, based on the ORB and eXtreme Scale tuning parameters specified, and whether allowable retries succeed.  Otherwise, the application perform some sort alternative data access or general failure handling.
     * </pre>
     */
    public String COMM_ERROR_WITH_SHARD_CWOBJ1130 = "COMM_ERROR_WITH_SHARD_CWOBJ1130";

    /**
     * <pre>
     * RECEIVED_ROUTE_UPDATE_FROM_CONTAINER_CWOBJ1131=CWOBJ1131I: An updated routing entry for shard with the domain:grid:mapSet:partitionId {0} was sent to this client.
     * RECEIVED_ROUTE_UPDATE_FROM_CONTAINER_CWOBJ1131.explanation=Some form of shard movement between containers as lead to updates to that partition's routing entry.
     * RECEIVED_ROUTE_UPDATE_FROM_CONTAINER_CWOBJ1131.useraction=No action necessary.
     * </pre>
     */
    public String RECEIVED_ROUTE_UPDATE_FROM_CONTAINER_CWOBJ1131 = "RECEIVED_ROUTE_UPDATE_FROM_CONTAINER_CWOBJ1131";

    /**
     * <pre>
     * # {0} partition identifier
     * RECEIVED_ROUTE_UPDATE_FROM_CATALOG_CWOBJ1132=CWOBJ1132I: An updated routing entry for the partition with domain:grid:mapSet:partitionId {0} was obtained from the catalog server.
     * RECEIVED_ROUTE_UPDATE_FROM_CATALOG_CWOBJ1132.explanation=Some form of shard movement between containers as lead to updates to that partition's routing entry.
     * RECEIVED_ROUTE_UPDATE_FROM_CATALOG_CWOBJ1132.useraction=No action necessary.
     * </pre>
     */
    public String RECEIVED_ROUTE_UPDATE_FROM_CATALOG_CWOBJ1132 = "RECEIVED_ROUTE_UPDATE_FROM_CATALOG_CWOBJ1132";

    /**
     * <pre>
     * # {0} partition identifier
     * # {2} container name
     * # {3} ip
     * RETRY_COMM_WITH_SHARD_CWOBJ1133=CWOBJ1133I: After an initial communication failuer, an attempt to access the partition for domain:grid:mapSet:partitionId {0} at conatiner {1} at {2} was successful.
     * RETRY_COMM_WITH_SHARD_CWOBJ1133.explanation=Following a communication exception, shard access was retried and was successful.
     * RETRY_COMM_WITH_SHARD_CWOBJ1133.useraction=No action necessary.
     * </pre>
     */
    public String RETRY_COMM_WITH_SHARD_CWOBJ1133 = "RETRY_COMM_WITH_SHARD_CWOBJ1133";

    /**
     * {0}, {1}, {2}
        SHARD_CAP_ENFORCED_CWOBJ1134=CWOBJ1134I: A limit on number of shards over idea balanced has been set to {0}, and as a result, no additional replica shards will be placed on container {1}, which has {2} shards.
        SHARD_CAP_ENFORCED_CWOBJ1134.explanation=The user has explicitly configured a limit on the number of shards per container.
        SHARD_CAP_ENFORCED_CWOBJ1134.useraction=No action is required; however, providing more containers to host shards could be warranted.
     * 
     */
    public String SHARD_CAP_ENFORCED_CWOBJ1134 = "SHARD_CAP_ENFORCED_CWOBJ1134";

    /**
     * <pre>
     * # {0} ObjectGrid
     * REMOVED_OBJECTGRID_FROM_ROUTE_TABLE_CWOBJ1135=CWOBJ1135I: The ObjectGrid: [{0}] was removed from the route table.
     * REMOVED_OBJECTGRID_FROM_ROUTE_TABLE_CWOBJ1135.explanation=The ObjectGrid specified was removed from the route table.
     * REMOVED_OBJECTGRID_FROM_ROUTE_TABLE_CWOBJ1135.useraction=No action is required.
     * </pre>
     */
    public String REMOVED_OBJECTGRID_FROM_ROUTE_TABLE_CWOBJ1135 = "REMOVED_OBJECTGRID_FROM_ROUTE_TABLE_CWOBJ1135";

    /**
     * <pre>
     * # {0} Mapset
     * # {1} ObjectGrid
     * REMOVED_MAPSET_FROM_ROUTE_TABLE_CWOBJ1136=CWOBJ1136I: The Mapset: [{0}] in ObjectGrid: [{1}] was removed from the route table.
     * REMOVED_MAPSET_FROM_ROUTE_TABLE_CWOBJ1136.explanation=The Mapset in the ObjectGrid specified was removed from the route table.
     * REMOVED_MAPSET_FROM_ROUTE_TABLE_CWOBJ1136.useraction=No action is required.
     * </pre>
     */
    public String REMOVED_MAPSET_FROM_ROUTE_TABLE_CWOBJ1136 = "REMOVED_MAPSET_FROM_ROUTE_TABLE_CWOBJ1136";

    /**
     * <pre>
     * # {0} ObjectGrid
     * CREATING_NEW_GRID_CWOBJ1137=CWOBJ1137I: Creating a new ObjectGrid: [{0}]
     * CREATING_NEW_GRID_CWOBJ1137.explanation=Creating a new ObjectGrid on the server with the MapSets specified.
     * CREATING_NEW_GRID_CWOBJ1137.useraction=No action is required.
     * </pre>
     */
    public String CREATING_NEW_GRID_CWOBJ1137 = "CREATING_NEW_GRID_CWOBJ1137";
    
    /**
     * <pre>
     * # {0} Terminate or teardown requested
     * # {1} Container name
     * # {2} reason code
     * CONTAINER_TEARDOWN_REQ_CWOBJ1138I=CWOBJ1138I: {0} container received a {1} request. The reason code is {2}.
     * CONTAINER_TEARDOWN_REQ_CWOBJ1138I.explanation=The listed container instead of the server JVM process received a request to teardown or terminate.
     * CONTAINER_TEARDOWN_REQ_CWOBJ1138I.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_TEARDOWN_REQ_CWOBJ1138I = "CONTAINER_TEARDOWN_REQ_CWOBJ1138I";
    
    /**
     * <pre>
     * # do not translate containerDisjoinQueue
     * # {0} timeout in seconds
     * DISJOIN_QUEUE_RUNNING_CWOBJ1139W=CWOBJ1139W: The containerDisjoinQueue thread is still processing requests after waiting for {0} seconds.
     * DISJOIN_QUEUE_RUNNING_CWOBJ1139W.explanation=During a server shutdown event, background processing for the containerDisjoinQueue thread. The thread processes removal and promotion of shards running on stopped containers.
     * DISJOIN_QUEUE_RUNNING_CWOBJ1139W.useraction=Review the JVM log for additional exceptions, errors or warnings. If none occur, no action is required
     * </pre>
     */
    public String DISJOIN_QUEUE_RUNNING_CWOBJ1139W = "DISJOIN_QUEUE_RUNNING_CWOBJ1139W";

    public String XIO_FUTURE_LOGGING_THRESHOLD_CWOBJ1140I = "XIO_FUTURE_LOGGING_THRESHOLD_CWOBJ1140I";
    
    public String XIO_SEND_MSG_INNER_THRESHOLD_CWOBJ1141I = "XIO_SEND_MSG_INNER_THRESHOLD_CWOBJ1141I";
    
    public String XIO_SEND_MSG_OUTER_THRESHOLD_CWOBJ1142I = "XIO_SEND_MSG_OUTER_THRESHOLD_CWOBJ1142I";
    
    public String XIO_WRITE_ASYNC_QUEUE_THRESHOLD_CWOBJ1143I = "XIO_WRITE_ASYNC_QUEUE_THRESHOLD_CWOBJ1143I";

    /**
     * <pre>
     * INVALID_COMPOSITE_INDEX_DEFINITION_CWPRJ1030E=CWPRJ1030E: Invalid composite index definition for entity: {0}. Either composite index name: {1} or attributeNames: {2} is empty or is not unique for the entity: {0}.
     * INVALID_COMPOSITE_INDEX_DEFINITION_CWPRJ1030E.explanation=The specified composite index definition is invalid. The composite index name and attributeNames cannot be empty and must be unique.
     * INVALID_COMPOSITE_INDEX_DEFINITION_CWPRJ1030E.useraction=Verify that the composite index definition is valid, resolve the error and resubmit the operation.
     * </pre>
     */
    public String INVALID_COMPOSITE_INDEX_DEFINITION_CWPRJ1030E = "INVALID_COMPOSITE_INDEX_DEFINITION_CWPRJ1030E";

    /**
     * <pre>
     * # {0} - the entity failed to register
     * EM_CLASSLESS_NOID_CWPRJ1032E=CWPRJ1032E: The Entity configuration {0} does not contain a valid id.
     * EM_CLASSLESS_NOID_CWPRJ1032E.explanation=The specified entity did not contain a valid id.
     * EM_CLASSLESS_NOID_CWPRJ1032E.useraction=Verify that there is at least one field marked with an id annotation or an association with id set to true.
     * </pre>
     */
    public String EM_CLASSLESS_NOID_CWPRJ1032E = "EM_CLASSLESS_NOID_CWPRJ1032E";

    /**
     * <pre>
     * # {0} - the entity failed to register
     * EM_CLASSLESS_MIXED_CONFIGURATION_CWPRJ1033E=CWPRJ1033E: The Entity configuration {0} contains both a class reference and a classless identifier marked with an @ symbol.
     * EM_CLASSLESS_MIXED_CONFIGURATION_CWPRJ1033E.explanation=The Entity configuration contains both entities with class references and those with classless identifiers.
     * EM_CLASSLESS_MIXED_CONFIGURATION_CWPRJ1033E.useraction=Verify that the entity configuration is either completely classless or all classes are present and referenced.
     * </pre>
     */
    public String EM_CLASSLESS_MIXED_CONFIGURATION_CWPRJ1033E = "EM_CLASSLESS_MIXED_CONFIGURATION_CWPRJ1033E";

    /**
     * <pre>
     * # {0} work item count
     * TIMEOUT_DURING_SHUTDOWN_WORK_LEFT_CWOBJ1121W=CWOBJ1121W: Timeout during shutdown while waiting for work items to complete. Work items left: {0}
     * TIMEOUT_DURING_SHUTDOWN_WORK_LEFT_CWOBJ1121W.explanation=During shutdown, the server attempts to wait for work items to complete. Work items could include shard movement off of the server. If they do complete before timeout, the server will complete shutdown and any remaining work items will failover instead.
     * TIMEOUT_DURING_SHUTDOWN_WORK_LEFT_CWOBJ1121W.useraction=The user may verify that the other servers are running normally and that shard placement is correct after the server complete shutdown. Otherwise no action is required.
     * </pre>
     */
    public String TIMEOUT_DURING_SHUTDOWN_WORK_LEFT_CWOBJ1121W = "TIMEOUT_DURING_SHUTDOWN_WORK_LEFT_CWOBJ1121W";

    /**
     * <pre>
     * # {0} shards left
     * TIMEOUT_DURING_SHUTDOWN_SHARDS_LEFT_CWOBJ1122W=CWOBJ1122W: Time out while waiting for shards to be moved off server. Shards left: {0}
     * TIMEOUT_DURING_SHUTDOWN_SHARDS_LEFT_CWOBJ1122W.explanation=During shutdown, the servers coordinate moving shards in an orderly fashion similar to when servers are added and shards are rebalanced (if running FIXED_PARTITIONS placement). If all the shards do not move before the timeout, they will failover instead.
     * TIMEOUT_DURING_SHUTDOWN_SHARDS_LEFT_CWOBJ1122W.useraction=The user may verify that the other servers are running normally and that shard placement is correct after the server complete shutdown. Otherwise no action is required.
     * </pre>
     */
    public String TIMEOUT_DURING_SHUTDOWN_SHARDS_LEFT_CWOBJ1122W = "TIMEOUT_DURING_SHUTDOWN_SHARDS_LEFT_CWOBJ1122W";

    /**
     * <pre>
     * SERVER_DISCONNECTED_FROM_CATALOG_SERVER_CWOBJ1123W=CWOBJ1123W: Server was disconnected from the primary catalog server and cannot be reconnected.
     * SERVER_DISCONNECTED_FROM_CATALOG_SERVER_CWOBJ1123W.explanation=The server was either rejected from the catalog server or received an error from the primary catalog server and cannot recover. It will be isolated from the catalog servers and other servers. This is usually due to network problems.
     * SERVER_DISCONNECTED_FROM_CATALOG_SERVER_CWOBJ1123W.useraction=Restart the server.
     * </pre>
     */
    public String SERVER_DISCONNECTED_FROM_CATALOG_SERVER_CWOBJ1123W = "SERVER_DISCONNECTED_FROM_CATALOG_SERVER_CWOBJ1123W";

    /**
     * # {0} the old master catalog server
     * # {1} the new master catalog server
     * DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W=CWOBJ1124W: The container server database timestamps are normalized with different catalog servers {0} and {1}. DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W=CWOBJ1124W: The container server database timestamps are normalized with different catalog servers {0} and {1}. Make sure the clocks of these two servers are synchronized.
     * DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W.explanation=The container server database timestamps are normalized with different catalog servers. This normally happens when a catalog server fails over when container servers are started.
     * DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W.useraction=Synchronize the time clocks between all the catalog servers. If the clocks are far apart, an out-f-date primary shard might be chosen.
     */
    public String DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W = "DIFFERENT_CATALOG_SERVER_TIMESTAMPS_CWOBJ1124W";

    /**
     * # {0} the container name
     * # {1} exception
     * CONTAINER_NOT_REGISTERED_CWOBJ1125W=CWOBJ1125W: The server was unable to register container, {0}, with the catalog server due to an exception. {1}
     * CONTAINER_NOT_REGISTERED_CWOBJ1125W.explanation=The server timed out or received an error from the primary catalog service while starting containers to initiate shard placement. This is usually due to network problems or heavy workload on the catalog server.
     * CONTAINER_NOT_REGISTERED_CWOBJ1125W.useraction=Restart the server.
     */
    public String CONTAINER_NOT_REGISTERED_CWOBJ1125W = "CONTAINER_NOT_REGISTERED_CWOBJ1125W";

    public String SERVER_RECONNECTED_AND_KEPT_EXISTING_SHARDS_CWOBJ1201I = "SERVER_RECONNECTED_AND_KEPT_EXISTING_SHARDS_CWOBJ1201I";

    /**
     * <pre>
     * CLIENT_RESPONSE_TIMEOUT_CWOBJ1203W=CWOBJ1203W: Received a timeout event from the server for transaction: {0}
     * CLIENT_RESPONSE_TIMEOUT_CWOBJ1203W.explanation=Client did not receive expected response message from the server within a configured timeout limit.
     * CLIENT_RESPONSE_TIMEOUT_CWOBJ1203W.useraction=Look for prior messages that may explain the timeout. If none found, try increasing the timeout limit.
     * </pre>
     */
    public String CLIENT_RESPONSE_TIMEOUT_CWOBJ1203W = "CLIENT_RESPONSE_TIMEOUT_CWOBJ1203W";

    /**
     * <pre>
     * UNKNOWN_MESSAGE_TYPE_CWOBJ1204W=CWOBJ1204W: Received a message of unknown message type.  The message is: {0}
     * UNKNOWN_MESSAGE_TYPE_CWOBJ1204W.explanation=An unexpected internal error was detected and a message cannot be processed. There may be an interoperability problem.
     * UNKNOWN_MESSAGE_TYPE_CWOBJ1204W.useraction=Review the WebSphere eXtreme Scale internet support web site for a similar problem or contact IBM Software Support.
     * </pre>
     */
    public String UNKNOWN_MESSAGE_TYPE_CWOBJ1204W = "UNKNOWN_MESSAGE_TYPE_CWOBJ1204W";

    /**
     * <pre>
     * CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W=CWOBJ1207W: The property {0} on plug-in {1} is using an unsupported property type.
     * CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W.explanation=Java primitives and their java.lang counterparts are the only supported property types. This includes java.lang.String.
     * CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W.useraction=Check the property type and change it to one of the supported types.
     * </pre>
     */
    public String CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W = "CONFIG_PROPERTY_UNSUPPORTED_CWOBJ1207W";

    /**
     * <pre>
     * CONFIG_PLUGIN_UNSUPPORTED_CWOBJ1208W=CWOBJ1208W: The specified plug-in type {0} is not supported.
     * CONFIG_PLUGIN_UNSUPPORTED_CWOBJ1208W.explanation=This type of plug-in is unsupported.
     * CONFIG_PLUGIN_UNSUPPORTED_CWOBJ1208W.useraction=Add one of the supported plug-in types. See the Introduction to plug-ins section in the WebSphere eXtreme Scale product documentation for more information on plug-ins.
     * </pre>
     */
    public String CONFIG_PLUGIN_UNSUPPORTED_CWOBJ1208W = "CONFIG_PLUGIN_UNSUPPORTED_CWOBJ1208W";

    /**
     * <pre>
     * # {0} ObjectGrid name
     * # {1} domain name
     * # {2} map set name
     * # {3} partition
     * # {4} shard type
     * # {5} exception
     * UNABLE_TO_ACTIVATE_SHARD_CWOBJ1209E=CWOBJ1209E: Unable to activate shard for ObjectGrid {0}, domain {1}, map set {2}, partition {3}, shard type {4} due to exception:  {5}
     * UNABLE_TO_ACTIVATE_SHARD_CWOBJ1209E.explanation=The ObjectGrid container attempted to activate a shard, but encountered an unexpected exception.  The catalog service will automatically try to start the shard on another container, if available.
     * UNABLE_TO_ACTIVATE_SHARD_CWOBJ1209E.useraction=Examine the exception included in this message and any first failure data capture (FFDC) logs, correct the error, and restart the ObjectGrid container.
     * </pre>
     */
    public String UNABLE_TO_ACTIVATE_SHARD_CWOBJ1209E = "UNABLE_TO_ACTIVATE_SHARD_CWOBJ1209E";

    /**
     * <pre>
     * # {0} ObjectGrid name
     * # {1} domain name
     * # {2} map set name
     * # {3} partition
     * # {4} shard type
     * # {5} exception
     * UNABLE_TO_RETURN_SHARD_CWOBJ1210E=CWOBJ1210E: Unable to return shard for ObjectGrid {0}, domain {1}, map set {2}, partition {3}, shard type {4} due to exception:  {5}
     * UNABLE_TO_RETURN_SHARD_CWOBJ1210E.explanation=The ObjectGrid container attempted to return the requested shard reference, but encountered an unexpected exception.
     * UNABLE_TO_RETURN_SHARD_CWOBJ1210E.useraction=Examine the exception included in this message and any first failure data capture (FFDC) logs, correct the error, and restart the ObjectGrid container.
     * </pre>
     */
    public String UNABLE_TO_RETURN_SHARD_CWOBJ1210E = "UNABLE_TO_RETURN_SHARD_CWOBJ1210E";

    /**
     * <pre>
     * # {0} The module name
     * # {1} The exception
     * ERROR_OG_PMI_CREATE_FAILED_CWOBJ1211E=CWOBJ1211E: The Performance Monitoring Infrastructure (PMI) creation of {0} failed. The exception is {1}.
     * ERROR_OG_PMI_CREATE_FAILED_CWOBJ1211E.explanation=An attempt to create ObjectGrid PMI failed.
     * ERROR_OG_PMI_CREATE_FAILED_CWOBJ1211E.useraction=Examine the exception message and the first failure data capture (FFDC) log.
     * </pre>
     */
    public String ERROR_OG_PMI_CREATE_FAILED_CWOBJ1211E = "ERROR_OG_PMI_CREATE_FAILED_CWOBJ1211E";

    /**
     * <pre>
     * SERVER_RECONNECTED_WITH_CATALOG_SERVER_CWOBJ1213I=CWOBJ1213I: Server was disconnected from the primary catalog server but was able to reconnect.
     * SERVER_RECONNECTED_WITH_CATALOG_SERVER_CWOBJ1213I.explanation=Usually because of network problems or garbage collection issues, the server was removed from the list of servers managed by the primary catalog server.  However, the network recovered in a timely enough fashion for the server to be reincluded.  It is no longer isolated from the catalog servers and other servers.
     * SERVER_RECONNECTED_WITH_CATALOG_SERVER_CWOBJ1213I.useraction=No action required, however verification of your network health JVM GC health could be wise.
     * </pre>
     */
    public String SERVER_RECONNECTED_WITH_CATALOG_SERVER_CWOBJ1213I = "SERVER_RECONNECTED_WITH_CATALOG_SERVER_CWOBJ1213I";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} suspended or resumed
     * PLACEMENT_BALANCE_STATUS_CWOBJ1214I=CWOBJ1214I: Shard balancing and placement for ObjectGrid {0} and map set {1} is {2}.
     * PLACEMENT_BALANCE_STATUS_CWOBJ1214I.explanation=The state of shard balancing and placement for the listed grid.
     * PLACEMENT_BALANCE_STATUS_CWOBJ1214I.useraction=No action is requred. Use the suspendBalance or resumeBalance mBean or xscmd interface to change the state of the grid.
     * </pre>
     */
    public String PLACEMENT_BALANCE_STATUS_CWOBJ1214I = "PLACEMENT_BALANCE_STATUS_CWOBJ1214I";
    

    /**
     * <pre>
     * PMI_NOT_FOUND=CWOBJ1212I: The WebSphere Application Server Performance Monitoring Infrastructure (PMI) cannot be found.
     * PMI_NOT_FOUND.explanation=The WebSphere Application Server PMI cannot be found. This is expected if eXtreme Scale is not running in WebSphere Application Server.
     * PMI_NOT_FOUND.useraction=If running standalone eXtreme Scale, no action is required. If eXtreme Scale is running in WebSphere Application Server, look for any configuration errors. Otherwise, contact IBM Software Support.
     * </pre>
     */
    public String PMI_NOT_FOUND = "PMI_NOT_FOUND";

    /**
     * <pre>
     * # "Transaction propagation event listener initializing"
     * TP_CWOBJ1215=CWOBJ1215I: ObjectGrid Transaction Propagation Event Listener is initializing [ObjectGrid {0}].
     * TP_CWOBJ1215.explanation=This informational message indicates that the ObjectGrid Transaction Propagation Event Listener is initializing.
     * TP_CWOBJ1215.useraction=No action is required.
     * </pre>
     */
    public String TP_CWOBJ1215 = "TP_CWOBJ1215";

    /**
     * <pre>
     * # "Transaction propagation event listener initialized"
     * TP_CWOBJ1216=CWOBJ1216I: ObjectGrid Transaction Propagation Event Listener is initialized [ObjectGrid {0}].
     * TP_CWOBJ1216.explanation=ObjectGrid Transaction Propagation Event Listener Initialized.
     * TP_CWOBJ1216.useraction=No action is required.
     * </pre>
     */
    public String TP_CWOBJ1216 = "TP_CWOBJ1216";

    /**
     * <pre>
     * # "Transaction propagation remote service endpoint initialized"
     * TP_CWOBJ1217=CWOBJ1217I: ObjectGrid Transaction Propagation Service Point Initialized [ObjectGrid {0}].
     * TP_CWOBJ1217.explanation=This informational message indicates that the ObjectGrid Transaction Propagation Event Listener is initialized.
     * TP_CWOBJ1217.useraction=No action is required.
     * </pre>
     */
    public String TP_CWOBJ1217 = "TP_CWOBJ1217";

    /**
     * <pre>
     * # Fails to initialize event listener
     * TP_CWOBJ1218=CWOBJ1218E: ObjectGrid Transaction Propagation Event Listener failure occurred [ObjectGrid {0} Exception message {1}].
     * TP_CWOBJ1218.explanation=ObjectGrid runtime encountered an ObjectGrid Transaction Propagation failure.
     * TP_CWOBJ1218.useraction=Examine the exception to determine the failure.
    * </pre>
     */
    public String TP_CWOBJ1218 = "TP_CWOBJ1218";

    /**
     * <pre>
     * # Fails to initialize event listener
     * TP_CWOBJ1219=CWOBJ1219E: ObjectGrid Transaction Propagation Service End Point failure occurred [ObjectGrid {0} Exception message {1}].
     * TP_CWOBJ1219.explanation=ObjectGrid runtime encountered an ObjectGrid Transaction Propagation Service End Point failure.
     * TP_CWOBJ1219.useraction=Examine the exception to determine the failure.
     * </pre>
     */
    public String TP_CWOBJ1219 = "TP_CWOBJ1219";

    /**
     * <pre>
     * # Unsupported environment
     * TRANPROPLISTENER_UNSUPPORTED_CWOBJ1220=CWOBJ1220E: ObjectGrid Transaction Propagation Service is not supported in this environment.
     * TRANPROPLISTENER_UNSUPPORTED_CWOBJ1220.explanation=ObjectGrid Transaction Propagation Service is not supported on z/OS or the standalone ObjectGrid server environment.
     * TRANPROPLISTENER_UNSUPPORTED_CWOBJ1220.useraction=Do not use ObjectGrid Transaction Propagation Service on z/OS or in the standalone ObjectGrid server environment
     * </pre>
     */
    public String TRANPROPLISTENER_UNSUPPORTED_CWOBJ1220 = "TRANPROPLISTENER_UNSUPPORTED_CWOBJ1220";

    /**
     * <pre>
     *  PLUGIN_FAILED_CWOBJ1221=CWOBJ1221E: The plug-in implemented by class {0} failed during a call to method {1}, the exception is {2}.
     *  PLUGIN_FAILED_CWOBJ1221.explanation=The plug-in should handle all exceptions during processing.
     *  PLUGIN_FAILED_CWOBJ1221.useraction=Review and repair the plug-in implementation or remove it from the grid configuration.
     * </pre>
     */
    public String PLUGIN_FAILED_CWOBJ1221 = "PLUGIN_FAILED_CWOBJ1221";

    /**
     * <pre>
     *  PLUGIN_INCORRECT_CWOBJ1222=CWOBJ1222E: The plug-in implemented by class {0} is in an incorrect state or has an incorrect status as indicated by method {1}.
     *  PLUGIN_INCORRECT_CWOBJ1222.explanation=The plug-in should record its state or status based on the lifecycle events delivered to it and should retain the state as appropriate.
     *  PLUGIN_INCORRECT_CWOBJ1222.useraction=Review and repair the plug-in implementation or remove it from the grid configuration.
     * </pre>
     */
    public String PLUGIN_INCORRECT_CWOBJ1222 = "PLUGIN_INCORRECT_CWOBJ1222";

    /**
     * <pre>
     *  INVALID_QUERY_SCHEMA_CONFIG_CWOBJ1223=CWOBJ1223E: An invalid ObjectQuery schema configuration is defined. The following maps have both an ObjectQuery configuration and a serializer or an entity configuration: {0}
     *  INVALID_QUERY_SCHEMA_CONFIG_CWOBJ1223.explanation=A query schema can only be defined for maps that do not have an entity or a MapSerializerPlugin plug-in associated with it.
     *  INVALID_QUERY_SCHEMA_CONFIG_CWOBJ1223.useraction=Complete one or more of the following actions: remove the entity definition from the entity configuration file, remove the MapSerializerPlugin plug-in from the specified backing map configurations, remove the ObjectQuery map definitions from the query schema in the ObjectGrid descriptor XML file, or remove the QueryConfig configuration object.
     * </pre>
     */
    public String INVALID_QUERY_SCHEMA_CONFIG_CWOBJ1223 = "INVALID_QUERY_SCHEMA_CONFIG_CWOBJ1223";

    /**
     * # Do not translate: JVM
     * <pre>
     * RESTART_EXITING_JVM_CWOBJ1224I=CWOBJ1224I: The JVM is exiting after starting a replacement JVM.
     * RESTART_EXITING_JVM_CWOBJ1224I.explanation=The JVM was requested to restart a new JVM to replace itself and is shutting down after starting the replacement JVM.
     * RESTART_EXITING_JVM_CWOBJ1224I.useraction=No user action is required.
     * </pre>
     */
    public String RESTART_EXITING_JVM_CWOBJ1224I = "RESTART_EXITING_JVM_CWOBJ1224I";

    /**
     * # Do not translate: JVM
     * <pre>
     * RESTART_JVM_FAILED_CWOBJ1225E=CWOBJ1225E: The JVM was unable to restart.
     * RESTART_JVM_FAILED_CWOBJ1225E.explanation=The JVM attempted to start a new JVM to replace itself but was unable.
     * RESTART_JVM_FAILED_CWOBJ1225E.useraction=See the logs.
     * </pre>
     */
    public String RESTART_JVM_FAILED_CWOBJ1225E = "RESTART_JVM_FAILED_CWOBJ1225E";

    /**
     * # {0} - Timeout value.
     * # Do not translate:  JVM
     * <pre>
     * RESTART_PARENT_TIMEOUT_CWOBJ1226E=CWOBJ1226E: The parent JVM did not terminate within the timeout period ({0} ms). Discontinuing with startup of the child JVM.
     * RESTART_PARENT_TIMEOUT_CWOBJ1226E.explanation=The child JVM waited for the parent JVM to terminate but the parent JVM took longer than expected.
     * RESTART_PARENT_TIMEOUT_CWOBJ1226E.useraction=No user action is required.
     * </pre>
     */
    public String RESTART_PARENT_TIMEOUT_CWOBJ1226E = "RESTART_PARENT_TIMEOUT_CWOBJ1226E";

    /**
     * <pre>
     * SERVER_REBOOT_TO_CONNECT_WITH_CATALOG_SERVER_CWOBJ1227I=CWOBJ1227I: Server was disconnected from the primary catalog server so we will restart it to reconnect.
     * SERVER_REBOOT_TO_CONNECT_WITH_CATALOG_SERVER_CWOBJ1227I.explanation=Usually because of network problems or garbage collection issues, the server was removed from the list of servers managed by the primary catalog server.  The server is going to restart itself in an attempt to reconnect with the catalog server.
     * SERVER_REBOOT_TO_CONNECT_WITH_CATALOG_SERVER_CWOBJ1227I.useraction=No action required, however verification of your network health JVM GC health could be wise.
     * </pre>
     */
    public String SERVER_REBOOT_TO_CONNECT_WITH_CATALOG_SERVER_CWOBJ1227I = "SERVER_REBOOT_TO_CONNECT_WITH_CATALOG_SERVER_CWOBJ1227I";

    /**
     * <pre>
     * CONTAINER_RECONNECT_IGNORED_CWOBJ1228I=CWOBJ1228I: The server ignored a request to reconnect its containers because a previous reconnect request was just completed.
     * CONTAINER_RECONNECT_IGNORED_CWOBJ1228I.explanation=This can be the result of both the local and a remote server concurrently trying to recover from a network outage.
     * CONTAINER_RECONNECT_IGNORED_CWOBJ1228I.useraction=No action required, however verifying the containers residing on this server are operational could be wise.
     * </pre>
     */
    public String CONTAINER_RECONNECT_IGNORED_CWOBJ1228I = "CONTAINER_RECONNECT_IGNORED_CWOBJ1228I";

    /**
     * <pre>
     * CONFIG_PLUGIN_MULTIPLES_UNSUPPORTED_CWOBJ1229W=CWOBJ1229W: The specified plug-in type {0} is not supported.
     * CONFIG_PLUGIN_MULTIPLES_UNSUPPORTED_CWOBJ1229W.explanation=This type of plug-in is unsupported.
     * CONFIG_PLUGIN_MULTIPLES_UNSUPPORTED_CWOBJ1229W.useraction=Add one of the supported plug-in types. See the Introduction to plug-ins section in the WebSphere eXtreme Scale product documentation for more information on plug-ins.
     * </pre>
     */
    public String CONFIG_PLUGIN_MULTIPLES_UNSUPPORTED_CWOBJ1229W = "CONFIG_PLUGIN_MULTIPLES_UNSUPPORTED_CWOBJ1229W";

    /**
     * # Do not translate:  JVM
     * # {0} - Process' STDERR or STDOUT output.
     * <pre>
     * RESTART_CHILD_STREAM_OUTPUT_CWOBJ1230I=CWOBJ1230I: During restart, the child Java virtual machine (JVM) produced the following output: {0}
     * RESTART_CHILD_STREAM_OUTPUT_CWOBJ1230I.explanation=The Java virtual machine (JVM) started a child JVM process to replace itself, and the child JVM produced standard error, standard output, or both.
     * RESTART_CHILD_STREAM_OUTPUT_CWOBJ1230I.useraction=No user action is required.
     * </pre>
     */
    public String RESTART_CHILD_STREAM_OUTPUT_CWOBJ1230I = "RESTART_CHILD_STREAM_OUTPUT_CWOBJ1230I";

    /**
     * # Do not translate: JVM
     * <pre>
     * RESTART_CHILD_STREAM_ERROR_CWOBJ1231E=CWOBJ1231E: During restart, an error occurred reading standard output from the child Java virtual machine (JVM) process. 
     * RESTART_CHILD_STREAM_ERROR_CWOBJ1231E.explanation=The Java virtual machine (JVM) started a child JVM process to replace itself, and the parent JVM process could not read standard output from the child JVM process.
     * RESTART_CHILD_STREAM_ERROR_CWOBJ1231E.useraction=No user action is required.
     * </pre>
     */
    public String RESTART_CHILD_STREAM_ERROR_CWOBJ1231E = "RESTART_CHILD_STREAM_ERROR_CWOBJ1231E";

    /**
     * <pre>
     * # {0} - Servers.
     * CONTAINER_RECONNECT_TX_CWOBJ1232I=CWOBJ1232I: The container reconnect message is being sent to the following server or servers: {0}
     * CONTAINER_RECONNECT_TX_CWOBJ1232I.explanation=This server is requesting the specified remote server or servers to perform container reconnect.
     * CONTAINER_RECONNECT_TX_CWOBJ1232I.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_TX_CWOBJ1232I = "CONTAINER_RECONNECT_TX_CWOBJ1232I";

    /**
     * <pre>
     * # {0} - Servers.
     * CONTAINER_RECONNECT_TX_FAIL_CWOBJ1233W=CWOBJ1233W: A failure occurred while sending a container reconnect message to the following server or servers: {0}
     * CONTAINER_RECONNECT_TX_FAIL_CWOBJ1233W.explanation=This server did not send a request to the specified remote server or servers to perform container reconnect.
     * CONTAINER_RECONNECT_TX_FAIL_CWOBJ1233W.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_TX_FAIL_CWOBJ1233W = "CONTAINER_RECONNECT_TX_FAIL_CWOBJ1233W";

    /**
     * <pre>
     * # {0} - Server.
     * CONTAINER_RECONNECT_RX_CWOBJ1234I=CWOBJ1234I: A container reconnect message was received from server {0}.
     * CONTAINER_RECONNECT_RX_CWOBJ1234I.explanation=The specified remote server has requested that this server perform container reconnect.
     * CONTAINER_RECONNECT_RX_CWOBJ1234I.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_RX_CWOBJ1234I = "CONTAINER_RECONNECT_RX_CWOBJ1234I";

    /**
     * <pre>
     * CONTAINER_RECONNECT_RX_NULL_CWOBJ1235E=CWOBJ1235E: The container reconnect request could not be processed.
     * CONTAINER_RECONNECT_RX_NULL_CWOBJ1235E.explanation=An internal error caused the container reconnect request to fail.
     * CONTAINER_RECONNECT_RX_NULL_CWOBJ1235E.useraction=Restart the server.
     * </pre>
     */
    public String CONTAINER_RECONNECT_RX_NULL_CWOBJ1235E = "CONTAINER_RECONNECT_RX_NULL_CWOBJ1235E";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} suspended or resumed or triggered or type balanced
     * # {3} failure message
     * BALANCE_REQUEST_FAILED_CWOBJ1236W=CWOBJ1236W: The shard balance request for ObjectGrid {0}:{1} to be {2} did not complete successfuly. Failure statis is {3}.
     * BALANCE_REQUEST_FAILED_CWOBJ1236W.explanation=A user request for a type of shard balancing failed. For example, if the user called resumeBalancing from xscmd, balancing will not be successfully resumed.
     * BALANCE_REQUEST_FAILED_CWOBJ1236W.useraction=Review the error message provided. The request can also be tried again.
     * </pre>
     */
    public String BALANCE_REQUEST_FAILED_CWOBJ1236W = "BALANCE_REQUEST_FAILED_CWOBJ1236W";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} suspended or resumed or triggered or type balanced
     * BALANCE_REQUESTED_CWOBJ1237I=CWOBJ1237I: The shard balance request for ObjectGrid {0}:{1} to be {2} was received.
     * BALANCE_REQUESTED_CWOBJ1237I.explanation=A user request was made to change the current state of placement balancing on the catalog server.
     * BALANCE_REQUESTED_CWOBJ1237I.useraction=No action is required.
     * </pre>
     */
    public String BALANCE_REQUESTED_CWOBJ1237I = "BALANCE_REQUESTED_CWOBJ1237I";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * BALANCE_STATUS_REQUESTED_CWOBJ1238=CWOBJ1238I: The balance status for ObjectGrid {0}:{1} was received.
     * BALANCE_STATUS_REQUESTED_CWOBJ1238.explanation=A user request was made to receive the current status of placement balancing for the ObjectGrid specified.
     * BALANCE_STATUS_REQUESTED_CWOBJ1238.useraction=No action is required.
     * </pre>
     */
    public String BALANCE_STATUS_REQUESTED_CWOBJ1238 = "BALANCE_STATUS_REQUESTED_CWOBJ1238";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * CONTAINER_STATUS_REQUESTED_CWOBJ1239=CWOBJ1239I: The container status request for ObjectGrid {0}:{1} was received.
     * CONTAINER_STATUS_REQUESTED_CWOBJ1239.explanation=A user request was made to receive the container status for the ObjectGrid specified.
     * CONTAINER_STATUS_REQUESTED_CWOBJ1239.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_STATUS_REQUESTED_CWOBJ1239 = "CONTAINER_STATUS_REQUESTED_CWOBJ1239";

    /**
     * <pre>
     * # {0} suspended or resumed
     * INTERNAL_HEARTBEATING_STATUS_CWOBJ1240I=CWOBJ1240I: Internal heartbeating is {0}.
     * INTERNAL_HEARTBEATING_STATUS_CWOBJ1240I.explanation=The state of internal heartbeating.
     * INTERNAL_HEARTBEATING_STATUS_CWOBJ1240I.useraction=No action is requred. Use the suspendInternalHeartbeating or resumeInternalHeartbeating mBean or xscmd interface to change the state.
     * </pre>
     */
    public String INTERNAL_HEARTBEATING_STATUS_CWOBJ1240I = "INTERNAL_HEARTBEATING_STATUS_CWOBJ1240I";

    /**
     * <pre>
     * # {0} suspended or resumed
     * # {1} failure message
     * INTERNAL_HEARTBEATING_REQUEST_FAILED_CWOBJ1241W=CWOBJ1241W: The internal heartbeat request to be {0} did not complete successfuly. Failure statis is {1}.
     * INTERNAL_HEARTBEATING_REQUEST_FAILED_CWOBJ1241W.explanation=A user request for a type of internal heartbeating failed. For example, if the user called resumeInternalHeartbeating from xscmd, heartbeating will not be successfully resumed.
     * INTERNAL_HEARTBEATING_REQUEST_FAILED_CWOBJ1241W.useraction=Review the error message provided. The request can also be tried again.
     * </pre>
     */
    public String INTERNAL_HEARTBEATING_REQUEST_FAILED_CWOBJ1241W = "INTERNAL_HEARTBEATING_REQUEST_FAILED_CWOBJ1241W";

    /**
     * <pre>
     * # {0} suspended or resumed
     * INTERNAL_HEARTBEATING_REQUESTED_CWOBJ1242I=CWOBJ1242I: The request to change the internal heartbeating to be {0} was received.
     * INTERNAL_HEARTBEATING_REQUESTED_CWOBJ1242I.explanation=A user request was made to change the current state of internal heartbeating on the catalog server.
     * INTERNAL_HEARTBEATING_REQUESTED_CWOBJ1242I.useraction=No action is required.
     * </pre>
     */
    public String INTERNAL_HEARTBEATING_REQUESTED_CWOBJ1242I = "INTERNAL_HEARTBEATING_REQUESTED_CWOBJ1242I";

    /**
     * <pre>
     * # {0} causal exception
     * CONTAINER_RECONNECT_REGISTER_FAIL_CWOBJ1243E=CWOBJ1243E: The server failed to register itself during container reconnect: {0}.
     * CONTAINER_RECONNECT_REGISTER_FAIL_CWOBJ1243E.explanation=An exception occurred that prevented container reconnect from registering the server.
     * CONTAINER_RECONNECT_REGISTER_FAIL_CWOBJ1243E.useraction=If the server remains unresponsive, it may be necessary to restart the server manually.
     * </pre>
     */
    public String CONTAINER_RECONNECT_REGISTER_FAIL_CWOBJ1243E = "CONTAINER_RECONNECT_REGISTER_FAIL_CWOBJ1243E";
    
    /**
     * <pre>
     * # {0} failed container names
     * CONTAINER_RECONNECT_PARTIAL_SUCCESS_CWOBJ1244W=CWOBJ1244W: The server's attempt at container reconnect was partially successful. This may result in reduced grid capacity. The following containers failed to reconnect: {0}.
     * CONTAINER_RECONNECT_PARTIAL_SUCCESS_CWOBJ1244W.explanation=The server was not able to reconnect the listed containers. Check the logs for more details.
     * CONTAINER_RECONNECT_PARTIAL_SUCCESS_CWOBJ1244W.useraction=If the server remains unresponsive, it may be necessary to restart the server manually.
     * </pre>
     */
    public String CONTAINER_RECONNECT_PARTIAL_SUCCESS_CWOBJ1244W = "CONTAINER_RECONNECT_PARTIAL_SUCCESS_CWOBJ1244W";
    
    /**
     * <pre>
     * CONTAINER_RECONNECT_FAIL_CWOBJ1245E=CWOBJ1245E: The server's attempt at container reconnect failed.
     * CONTAINER_RECONNECT_FAIL_CWOBJ1245E.explanation=The server was unable to reconnect any of its containers. 
     * CONTAINER_RECONNECT_FAIL_CWOBJ1245E.useraction=If the server remains unresponsive, it may be necessary to restart the server manually.
     * </pre>
     */
    public String CONTAINER_RECONNECT_FAIL_CWOBJ1245E = "CONTAINER_RECONNECT_FAIL_CWOBJ1245E";
    
    /**
     * <pre>
     * # {0} container name
     * # {1} causal exception
     * CONTAINER_RECONNECT_TEARDOWN_FAILED_CWOBJ1246E=CWOBJ1246E: The server failed to tear down container {0} during container reconnect: {1}.
     * CONTAINER_RECONNECT_TEARDOWN_FAILED_CWOBJ1246E.explanation=An exception occurred that prevented container reconnect from tearing down a container.
     * CONTAINER_RECONNECT_TEARDOWN_FAILED_CWOBJ1246E.useraction=If the container remains unresponsive, it may be necessary to restart the server manually.
     * </pre>
     */
    public String CONTAINER_RECONNECT_TEARDOWN_FAILED_CWOBJ1246E = "CONTAINER_RECONNECT_TEARDOWN_FAILED_CWOBJ1246E";
    
    /**
     * <pre>
     * # {0} container name
     * # {1} causal exception
     * CONTAINER_RECONNECT_REPLACE_FAILED_CWOBJ1247E=CWOBJ1247E: The server failed to create a replacement for container {0} during container reconnect: {1}.
     * CONTAINER_RECONNECT_REPLACE_FAILED_CWOBJ1247E.explanation=An exception occurred that prevented container reconnect from creating a replacement container.
     * CONTAINER_RECONNECT_REPLACE_FAILED_CWOBJ1247E.useraction=If the container remains unresponsive, it may be necessary to restart the server manually.
     * </pre>
     */
    public String CONTAINER_RECONNECT_REPLACE_FAILED_CWOBJ1247E = "CONTAINER_RECONNECT_REPLACE_FAILED_CWOBJ1247E";
    
    /**
     * <pre>
     * CONTAINER_RECONNECT_STOPPING_CWOBJ1248I=CWOBJ1248I: The server ignored a request to reconnect its containers because the server was in the process of shutting down.
     * CONTAINER_RECONNECT_STOPPING_CWOBJ1248I.explanation=Since the server is shutting down, there is no reason to perform container reconnect. 
     * CONTAINER_RECONNECT_STOPPING_CWOBJ1248I.useraction=No action required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_STOPPING_CWOBJ1248I = "CONTAINER_RECONNECT_STOPPING_CWOBJ1248I";    
    
    /**
     * <pre>
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1249I=CWOBJ1249I: CWOBJ1249I: The request to remove extra shards for ObjectGrid {0}:{1} was received.
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1249I.explanation=A request to remove extra shards was recevied. Container servers receive a master list of the correct shards. Any extra or duplicate shards are removed.
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1249I.useraction=No action required.
     * </pre>
     */
    public String REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1249I = "REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1249I";
    
    /** 
     * <pre>
     * # client version
     * UPGRADE_CATALOG_CWOBJ1250=CWOBJ1250W: Client greater than or equal to {0} is connecting to a catalog server that is less than {0}.  Catalog server must be upgraded before clients are upgraded.
     * UPGRADE_CATALOG_CWOBJ1250.explanation=The upgrade path for eXtreme Scale requires the catalog server to be upgrade first. The client connecting to the objectGrid is at a higher level than the catalog server.
     * UPGRADE_CATALOG_CWOBJ1250.useraction=Refer to the eXtreme Scale documentation on upgrading the product and upgrade the catalog server.
     * </pre>
     */
    public String UPGRADE_CATALOG_CWOBJ1250 = "UPGRADE_CATALOG_CWOBJ1250";

    /**
     * <pre>
     * QUORUM_ENABLED_CWOBJ1251I=CWOBJ1251I: Quorum is enabled for the catalog service.
     * QUORUM_ENABLED_CWOBJ1251I.explanation=The catalog service has quorum detection enabled and has successfully reached a quorum.  The catalog service can successfully process requests.
     * QUORUM_ENABLED_CWOBJ1251I.useraction=No action is required.  This is the normal state of a quorum-enabled catalog service grid.
     * </pre>
     */
    public String QUORUM_ENABLED_CWOBJ1251I = "QUORUM_ENABLED_CWOBJ1251I";

    /**
     * <pre>
     * QUORUM_DISABLED_CWOBJ1252I=CWOBJ1252I: Quorum is disabled for the catalog service.
     * QUORUM_DISABLED_CWOBJ1252I.explanation=The catalog service does not have quorum enabled.  The catalog service will continue to process requests if the catalog service grid is partitioned because of a network failure.
     * QUORUM_DISABLED_CWOBJ1252I.useraction=No action is required.
     * </pre>
     */
    public String QUORUM_DISABLED_CWOBJ1252I = "QUORUM_DISABLED_CWOBJ1252I";

    /**
     * <pre>
     * QUORUM_OVERRIDE_CWOBJ1253I=CWOBJ1253I: Quorum has been overridden for the catalog service.
     * QUORUM_OVERRIDE_CWOBJ1253I.explanation=The catalog service has quorum enabled and did not have all servers available to make a quorum.  The quorum has been overridden to force a quorum.
     * QUORUM_OVERRIDE_CWOBJ1253I.useraction=None.  Informational entry.
     * </pre>
     */
    public String QUORUM_OVERRIDE_CWOBJ1253I = "QUORUM_OVERRIDE_CWOBJ1253I";

    /**
     * <pre>
     * # Do not translate:  CoreGroupServiceMBean, overrideQuorum
     * QUORUM_WAITING_CWOBJ1254W=CWOBJ1254W: The catalog service is waiting for quorum.
     * QUORUM_WAITING_CWOBJ1254W.explanation=Quorum is enabled for the catalog service, but is not processing requests because the minimum number of servers to reach a quorum has not been met.
     * QUORUM_WAITING_CWOBJ1254W.useraction=Verify that all catalog service grid members are visible to this catalog service process, resolve any network failures, restart failed catalog service processes or call the CoreGroupServiceMBean overrideQuorum MBean operation to override quorum state for this catalog service instance.
     * </pre>
     */
    public String QUORUM_WAITING_CWOBJ1254W = "QUORUM_WAITING_CWOBJ1254W";
    
    /**
     * <pre>
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1256I=CWOBJ1256I: CWOBJ1256I: The request to remove extra shards for ObjectGrid {0}:{1} completed. {2}
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1256I.explanation=All container servers confirmed the master list of shards. Any extra or duplicate shards were removed unless actively doing other placement work.
     * REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1256I.useraction=No action required.
     * </pre>
     */
    public String REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1256I = "REMOVE_EXTRA_SHARDS_REQUEST_CWOBJ1256I";

    /**
     * <pre>
     * # {0} - Server
     * CONTAINER_RECONNECT_START_CWOBJ1257I=CWOBJ1257I: Server {0} started a process to reconnect to the container.
     * CONTAINER_RECONNECT_START_CWOBJ1257I.explanation=The specified server is attempting to reconnect to the containers. 
     * CONTAINER_RECONNECT_START_CWOBJ1257I.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_START_CWOBJ1257I = "CONTAINER_RECONNECT_START_CWOBJ1257I";

    /**
     * <pre>
     * CONTAINER_RECONNECT_SUCCESS_CWOBJ1258I=CWOBJ1258I: The server reconnected to containers successfully. 
     * CONTAINER_RECONNECT_SUCCESS_CWOBJ1258I.explanation=The server is reconnected to all containers.
     * CONTAINER_RECONNECT_SUCCESS_CWOBJ1258I.useraction=No action is required.
     * </pre>
     */
    public String CONTAINER_RECONNECT_SUCCESS_CWOBJ1258I = "CONTAINER_RECONNECT_SUCCESS_CWOBJ1258I";
    
    public String ZONE_NOT_ACCESSIBLE_NOTIFICATION_CWOBJ1259I = "ZONE_NOT_ACCESSIBLE_NOTIFICATION_CWOBJ1259I";
    
    /**
     * <pre>
     * # {0} failoverAll, failoverSocket or failoverClient
     * # {1} suspended or resumed
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_STATUS_CWOBJ1260I=CWOBJ1260I: Detection of transport communication failure type {0} is {1}.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_STATUS_CWOBJ1260I.explanation=The state of the transport communication failure detection.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_STATUS_CWOBJ1260I.useraction=No action is requred. Use the suspendTransportCommunicationFailureDetection or resumeTransportCommunicationFailureDetection mBean or xscmd interface to change the state.
     * </pre>
     */
    public String TRANSPORT_COMMUNICATION_FAILURE_DETECT_STATUS_CWOBJ1260I = "TRANSPORT_COMMUNICATION_FAILURE_DETECT_STATUS_CWOBJ1260I";

    /**
     * <pre>
     * # {0} failoverAll or failoverSocket or failoverClient
     * # {1} suspended or resumed
     * # {2} failure message
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1261W=CWOBJ1261W: The request for detection of transport communication failure type {0} to be {1} did not complete successfuly. Failure statis is {2}.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1261W.explanation=A user request to suspend or resume a type of transport communication failure detection failed.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1261W.useraction=Review the error message provided. The request can also be tried again.
     * </pre>
     */
    public String TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1261W = "TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1261W";

    /**
     * <pre>
     * # {0} failoverAll or failoverSocket or failoverClient
     * # {1} suspended or resumed
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1262I=CWOBJ1262I: The request to change the detection of transport communication failure type {0} to {1} was received.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1262I.explanation=A user request was made to suspend or resume a type of transport communication failure detection.
     * TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1262I.useraction=No action is required.
     * </pre>
     */
    public String TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1262I = "TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1262I";
    
    /**
     * <pre>
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1263W=CWOBJ1263W: The request to set the detection of transport communication failure properties to their initial states failed did not complete successfuly.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1263W.explanation=A user request to set the transport communication failure detection properties to their initial states failed.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1263W.useraction=Review the error message provided. The request can also be tried again.
     * </pre>
     */
    public String INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1263W = "INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUEST_FAILED_CWOBJ1263W";
    
    /**
     * <pre>
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1264I=CWOBJ1264I: The request to change the detection of transport communication failure properties to their initial states was recieved.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1264I.explanation=A user request was made to set the transport communication failure detection properties to their initial states.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1264I.useraction=No action is required.
     * </pre>
     */
    public String INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1264I = "INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_REQUESTED_CWOBJ1264I";
    
    /**
     * <pre>
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_SUCCEEDED_CWOBJ1265I=CWOBJ1265I: The request to change the detection of transport communication failure properties to their initial states succeeded.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_SUCCEEDED_CWOBJ1265I.explanation=The transport communication failure detection properties were successfully restored to their initial states.
     * INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_SUCCEEDED_CWOBJ1265I.useraction=No action is required.
     * </pre>
     */
    public String INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_SUCCEEDED_CWOBJ1265I = "INITIALIZE_TRANSPORT_COMMUNICATION_FAILURE_DETECT_SUCCEEDED_CWOBJ1265I";
    
    /**
     * <pre>
     * PMA_CWOBJ1300=CWOBJ1300I: Adapter successfully initialized ObjectGrid.
     * PMA_CWOBJ1300.explanation=Adapter successfully initialized ObjectGrid.
     * PMA_CWOBJ1300.useraction=No action is required.
     * </pre>
     */
    public String PMA_CWOBJ1300 = "PMA_CWOBJ1300";

    /**
     * <pre>
     * PMA_CWOBJ1301=CWOBJ1301E: Adapter failed to initialize ObjectGrid. Exception occurred {0}.
     * PMA_CWOBJ1301.explanation=The adapter's attempt to initialize ObjectGrid failed.
     * PMA_CWOBJ1301.useraction=Review the exception, resolve the error and retry the operation. If the com.ibm.ws.pmcache.config property has a badly formed URL, fix the property. If there is an ObjectGridException, review the message or caused by exception for the root cause.
     * </pre>
     */
    public String PMA_CWOBJ1301 = "PMA_CWOBJ1301";

    /**
     * <pre>
     * PMA_CWOBJ1302=CWOBJ1302I: Adapter stopped.
     * PMA_CWOBJ1302.explanation=Adapter stopped.
     * PMA_CWOBJ1302.useraction=No action is required.
     * </pre>
     */
    public String PMA_CWOBJ1302 = "PMA_CWOBJ1302";

    /**
     * <pre>
     * PMA_CWOBJ1303=CWOBJ1303I: Adapter started.
     * PMA_CWOBJ1303.explanation=Adapter started.
     * PMA_CWOBJ1303.useraction=No action is required.
     * </pre>
     */
    public String PMA_CWOBJ1303 = "PMA_CWOBJ1303";

    /**
     * <pre>
     * SECURITY_ENABLED_CWOBJ1304=CWOBJ1304I: Security is enabled.
     * SECURITY_ENABLED_CWOBJ1304.explanation=Security is enabled.
     * SECURITY_ENABLED_CWOBJ1304.useraction=No action is required.
     * </pre>
     */
    public String SECURITY_ENABLED_CWOBJ1304 = "SECURITY_ENABLED_CWOBJ1304";

    /**
     * <pre>
     * SECURITY_DISABLED_CWOBJ1305=CWOBJ1305I: Security is disabled.
     * SECURITY_DISABLED_CWOBJ1305.explanation=Security is disabled.
     * SECURITY_DISABLED_CWOBJ1305.useraction=No action is required.
     * </pre>
     */
    public String SECURITY_DISABLED_CWOBJ1305 = "SECURITY_DISABLED_CWOBJ1305";

    /**
     * <pre>
     * CANNOT_RETRIEVE_CLIENT_CERTS_CWOBJ1306=CWOBJ1306W: Cannot retrieve the client certificates from the SSL socket.
     * CANNOT_RETRIEVE_CLIENT_CERTS_CWOBJ1306.explanation=The runtime cannot retrieve the client certificates from the SSL socket.
     * CANNOT_RETRIEVE_CLIENT_CERTS_CWOBJ1306.useraction=If you are running eXtreme Scale in WebSphere Application Server, use the administrative console to review your SSL configuration. If you are running eXtreme Scale standalone, review your SSL configuration in the property files for your servers and clients. Verify the SSL configuration settings, including the location of the key store, trust store, passwords and transportType. Check the client and server side to ensure that they match and have complimentary transportTypes. See the Transport layer security and secure sockets layer section in the WebSphere eXtreme Scale documentation for more information.
     * </pre>
     */
    public String CANNOT_RETRIEVE_CLIENT_CERTS_CWOBJ1306 = "CANNOT_RETRIEVE_CLIENT_CERTS_CWOBJ1306";

    /**
     * <pre>
     * # {0} the objectgrid instance name
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1307=CWOBJ1307I: Security of the ObjectGrid instance {0} is enabled.
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1307.explanation=Security is enabled for the specified ObjectGrid instance.
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1307.useraction=No action is required.
     * </pre>
     */
    public String OBJECTGRID_SECURITY_ENABLED_CWOBJ1307 = "OBJECTGRID_SECURITY_ENABLED_CWOBJ1307";

    /**
     * <pre>
     * # {0} the objectgrid instance name
     * OBJECTGRID_SECURITY_DISABLED_CWOBJ1308=CWOBJ1308I: Security of the ObjectGrid instance {0} is disabled.
     * OBJECTGRID_SECURITY_DISABLED_CWOBJ1308.explanation=Security is disabled for the specified ObjectGrid instance.
     * OBJECTGRID_SECURITY_DISABLED_CWOBJ1308.useraction=No action is required.
     * </pre>
     */
    public String OBJECTGRID_SECURITY_DISABLED_CWOBJ1308 = "OBJECTGRID_SECURITY_DISABLED_CWOBJ1308";

    /**
     * <pre>
     * # {0} the exception
     * OBJECTGRID_CONNECT_TOKEN_CREATION_CWOBJ1309=CWOBJ1309E: Unexpected error occured in the connect token creation: {0}
     * OBJECTGRID_CONNECT_TOKEN_CREATION_CWOBJ1309.explanation=An unexpected error occured in the connection token creation.
     * OBJECTGRID_CONNECT_TOKEN_CREATION_CWOBJ1309.useraction=Check the security configuration and verify the secureToken settings the authenticationSecret.
     * </pre>
     */
    public String OBJECTGRID_CONNECT_TOKEN_CREATION_CWOBJ1309 = "OBJECTGRID_CONNECT_TOKEN_CREATION_CWOBJ1309";

    /**
     * <pre>
     * OBJECTGRID_CONNECT_TOKEN_VALIDATION_CWOBJ1310=CWOBJ1310E: An attempt by another process to connect to this process via the core group transport has been rejected. The connecting process provided a source core group name of {0}, a target of {1}, a member name of {2} and an IP address of {3}. The error message is {4}
     * OBJECTGRID_CONNECT_TOKEN_VALIDATION_CWOBJ1310.explanation=The High Availability Manager has rejected a connection attempt.
     * OBJECTGRID_CONNECT_TOKEN_VALIDATION_CWOBJ1310.useraction=This may be a connection attempt from an unauthorized party.
     * </pre>
     */
    public String OBJECTGRID_CONNECT_TOKEN_VALIDATION_CWOBJ1310 = "OBJECTGRID_CONNECT_TOKEN_VALIDATION_CWOBJ1310";

    /**
     * <pre>
     * IGNORE_CREDENTIAL_GENERATOR_PROPS=CWOBJ1311W: The credentialGeneratorProps setting is ignored since the credentialGeneratorClass value is not provided.
     * IGNORE_CREDENTIAL_GENERATOR_PROPS.explanation= The credentialGeneratorProps setting is only used if the credentialGeneratorClass value is provided.
     * IGNORE_CREDENTIAL_GENERATOR_PROPS.useraction=Set the credentialGeneratorClass if you plan to customize the credential generator.
     * </pre>
     */
    public String IGNORE_CREDENTIAL_GENERATOR_PROPS = "IGNORE_CREDENTIAL_GENERATOR_PROPS";

    /**
     * <pre>
     *
     * # {0} The credentialGeneratorClass value
     * IGNORE_CREDENTIAL_GENERATOR_CLASS_CWOBJ1314W=CWOBJ1314W: The credentialGeneratorClass property with value \"{0}\" is being overridden.
     * IGNORE_CREDENTIAL_GENERATOR_CLASS_CWOBJ1314W.explanation=The credentialGeneratorClass property can be overridden dynamically by certain eXtreme Scale components that require specific credentialGeneratorClass implementations.
     * IGNORE_CREDENTIAL_GENERATOR_CLASS_CWOBJ1314W.useraction=No user action is required.
     * </pre>
     */
    public String IGNORE_CREDENTIAL_GENERATOR_CLASS_CWOBJ1314W = "IGNORE_CREDENTIAL_GENERATOR_CLASS_CWOBJ1314W";

    /**
     * <pre>
     * # {0} the credentialGeneratorClass that was set dynamically.
     * DYNAMIC_CREDENTIAL_GENERATOR_CLASS_CWOBJ1315I=CWOBJ1315I: The credentialGeneratorClass property was set dynamically to a value of \"{0}\".
     * DYNAMIC_CREDENTIAL_GENERATOR_CLASS_CWOBJ1315I.explanation=The credentialGeneratorClass property can be set dynamically by certain eXtreme Scale components that require specific credentialGeneratorClass implementations.
     * DYNAMIC_CREDENTIAL_GENERATOR_CLASS_CWOBJ1315I.useraction=No user action is required.
     * </pre>
     */
    public String DYNAMIC_CREDENTIAL_GENERATOR_CLASS_CWOBJ1315I = "DYNAMIC_CREDENTIAL_GENERATOR_CLASS_CWOBJ1315I";

    /**
     * <pre>
     * #{0} The credential expiring exception
     * EXPIRED_CREDENTIAL_EXCEPTION=CWOBJ1312W: The credential has been expired. The exception message is {0}
     * EXPIRED_CREDENTIAL_EXCEPTION.explanation= The credential has been expired. Please check the exception message for why it expires.
     * EXPIRED_CREDENTIAL_EXCEPTION.useraction=ObjectGrid will try to re-generate a credential. If the problem persists, please check the exception messages for the reason why the credential expires.
     * </pre>
     */
    public String EXPIRED_CREDENTIAL_EXCEPTION = "EXPIRED_CREDENTIAL_EXCEPTION";

    /**
     * <pre>
     * CUSTOM_SECURE_TOKEN_MANAGER_CLASS_IGNORED=CWOBJ1313W: The customSecureTokenManagerClass setting is ignored since the provided customSecureTokenManagerType value is not "custom".
     * CUSTOM_SECURE_TOKEN_MANAGER_CLASS_IGNORED.explanation=In order to use the custom secure token manager, the customSecureTokenManagerType property has to be set to "custom".
     * CUSTOM_SECURE_TOKEN_MANAGER_CLASS_IGNORED.useraction=Set the customSecureTokenManagerType value to "custom" to use the custom secure token manager; or remove the customSecureTokenManagerClass value to get rid of this warning.
     * </pre>
     */
    public String CUSTOM_SECURE_TOKEN_MANAGER_CLASS_IGNORED = "CUSTOM_SECURE_TOKEN_MANAGER_CLASS_IGNORED";

    /**
     * <pre>
     * CLIENT_SECURITY_ENABLED_SERVER_SECURITY_DISABLED_CWOBJ1316W=CWOBJ1316W: This non-secure server receives a client request containing credential information. The credential information is ignored by this server.
     * CLIENT_SECURITY_ENABLED_SERVER_SECURITY_DISABLED_CWOBJ1316W.explanation=The server started in this JVM is a non-secure server. Any credential information sent from a client is ignored. This normally indicates a security mismatch between the client and server.
     * CLIENT_SECURITY_ENABLED_SERVER_SECURITY_DISABLED_CWOBJ1316W.useraction=Make sure the server is intended to be non-secure, or the client is intented to be secure. Correct the client or server security configuration if necessary.
     * </pre>
     */
    public String CLIENT_SECURITY_ENABLED_SERVER_SECURITY_DISABLED_CWOBJ1316W = "CLIENT_SECURITY_ENABLED_SERVER_SECURITY_DISABLED_CWOBJ1316W";

    /**
     * <pre>
     * # {0} the property name
     * # {1} the encoding algorithm
     * UNSUPPORTED_ENCODE_ALGORITHM_CWOBJ1317W=CWOBJ1317W: The property {0} is encoded with an unsupported encoding algorithm \'{1}\'. The property is ignored.
     * UNSUPPORTED_ENCODE_ALGORITHM_CWOBJ1317W.explanation=Currently, WebSphere eXtreme Scale only supports \{xor\} encoding elgorithm.
     * UNSUPPORTED_ENCODE_ALGORITHM_CWOBJ1317W.useraction=Use \{xor\} encoding elgorithm. Use FilePasswordEncoder.bat or FilePasswordEncoder.sh to encode the properties.
     * </pre>
     */
    public String UNSUPPORTED_ENCODE_ALGORITHM_CWOBJ1317W = "UNSUPPORTED_ENCODE_ALGORITHM_CWOBJ1317W";

    /**
     * <pre>
     * # {0} the level enabled: TCP/IP, SSL-Supported or SSL-Required
     * SSL_TRANSPORT_TYPE_ENABLED_CWOBJ1318I=CWOBJ1318I: Transport layer security configuration is set to {0}.
     * SSL_TRANSPORT_TYPE_ENABLED_CWOBJ1318I.explanation=The current setting for transport layer security. Available settings are listed in the property file articles or the SecurityConstants API in the information center.
     * SSL_TRANSPORT_TYPE_ENABLED_CWOBJ1318I.useraction=No user action is required.
     * </pre>
     */
    public String SSL_TRANSPORT_TYPE_ENABLED_CWOBJ1318I = "SSL_TRANSPORT_TYPE_ENABLED_CWOBJ1318I";

    /**
     * <pre>
     * # {0} Exception
     * SECURITY_NOT_PROVIDED_ON_STOP_CWOBJ1319=CWOBJ1319E: The exception {0} occured attempting to stop the server. Verify that a client property file was provided with the stop command including the required security settings.
     * SECURITY_NOT_PROVIDED_ON_STOP_CWOBJ1319.explanation=To stop a server, the correct SSL configuration properties and Credential authentication configuration properties as needed.
     * SECURITY_NOT_PROVIDED_ON_STOP_CWOBJ1319.useraction=If security was enabled to start start the server, provide a client property file to stop the server. See the Starting and stopping secure eXtreme Scale servers and Client properties file articles in the information center for more information.
     * </pre>
     */
    public String SECURITY_NOT_PROVIDED_ON_STOP_CWOBJ1319 = "SECURITY_NOT_PROVIDED_ON_STOP_CWOBJ1319";

    /**
     * <pre>
     * # {0} Error details
     * # {1} File name, optional
     * # Do not translate: FilePasswordEncoder
     * FILEPASSWORDENCODER_ERROR_CWOBJ1320E=CWOBJ1320E: An error occured while processing the FilePasswordEncoder request: {0} {1}
     * FILEPASSWORDENCODER_ERROR_CWOBJ1320E.explanation=An error occured which prevents the FilePasswordEncoder operation from completing successfully.
     * FILEPASSWORDENCODER_ERROR_CWOBJ1320E.useraction=Review the provided error message and perform any recommended actions.
     * </pre>
     */
    public String FILEPASSWORDENCODER_ERROR_CWOBJ1320E = "FILEPASSWORDENCODER_ERROR_CWOBJ1320E";

    /**
     * <pre>
     * # {0} Info message details
     * # {1} File name, optional
     * # Do not translate: FilePasswordEncoder
     * FILEPASSWORDENCODER_INFO_CWOBJ1321I=CWOBJ1321I: FilePasswordEncoder informational message: {0} {1}
     * FILEPASSWORDENCODER_INFO_CWOBJ1321I.explanation=This is an informational message pertaining to a FilePasswordEncoder operation.
     * FILEPASSWORDENCODER_INFO_CWOBJ1321I.useraction=No user action is required at this time.
     * </pre>
     */
    public String FILEPASSWORDENCODER_INFO_CWOBJ1321I = "FILEPASSWORDENCODER_INFO_CWOBJ1321I";

    /**
     * <pre>
     * # {0} Thread identity
     * # {1} Client Secuirty context map
     * CLIENTSECURITYCONTEXT_ERROR_CWOBJ1322E=CWOBJ1322E: Internal runtime error occured for client request on thread {0}.  Security Context Map information is {1}
     * CLIENTSECURITYCONTEXT_ERROR_CWOBJ1322E.explanation=Internal error in ObjectGrid runtime.
     * CLIENTSECURITYCONTEXT_ERROR_CWOBJ1322E.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String CLIENTSECURITYCONTEXT_ERROR_CWOBJ1322E = "CLIENTSECURITYCONTEXT_ERROR_CWOBJ1322E";

    /**
     * <pre>
     * # {0} Class name of authenticator
     * SECURITY_AUTHENTICATOR_NOT_FOUND_CWOBJ1323E=CWOBJ1323E: The provided authenticator {0} could not be initialized.
     * SECURITY_AUTHENTICATOR_NOT_FOUND_CWOBJ1323E.explanation=The authenticator provided in the security configuration for the catalog service could not be initializaed. Authentication will fail for any authentication required requests.
     * SECURITY_AUTHENTICATOR_NOT_FOUND_CWOBJ1323E.useraction=Verify that the authenticator class name is correct and available on the class path. Review the FFDC files and other JVM Logs for additional information.
     * </pre>
     */
    public String SECURITY_AUTHENTICATOR_NOT_FOUND_CWOBJ1323E = "SECURITY_AUTHENTICATOR_NOT_FOUND_CWOBJ1323E";

    /**
     * <pre>
     * SECURITY_NO_ADMINISTRATOR_PERMISSIONS_CWOBJ1324E=CWOBJ1324E: The user does not have administration permission for the appliance.
     * SECURITY_NO_ADMINISTRATOR_PERMISSIONS_CWOBJ1324E.explanation=The user has not been granted appliance administration permissions.
     * SECURITY_NO_ADMINISTRATOR_PERMISSIONS_CWOBJ1324E.useraction=Invoke the administrative command using a user ID that has been granted appliance administration permission.
     * </pre>
     */
    public String SECURITY_NO_ADMINISTRATOR_PERMISSIONS_CWOBJ1324E = "SECURITY_NO_ADMINISTRATOR_PERMISSIONS_CWOBJ1324E";

    /**
     * <pre>
     * # {0} Configuration error
     * CLIENT_SEC_CONFIG_ERROR_CWOBJ1325E=CWOBJ1325E: There was a client security configuration error. {0}
     * CLIENT_SEC_CONFIG_ERROR_CWOBJ1325E.explanation=There was a security error on the client attempting to connect to the catalog service domain. The security configurations for the client and server do not match.
     * CLIENT_SEC_CONFIG_ERROR_CWOBJ1325E.useraction=Review the rest of the exception for the specific error. Update the client security configuration to match the server security configuration.
     * </pre>
     */
    public String CLIENT_SEC_CONFIG_ERROR_CWOBJ1325E = "CLIENT_SEC_CONFIG_ERROR_CWOBJ1325E";

    /**
     * <pre>
     * SSL_TRANSPORT_CLIENTAUTHENICATION_ENABLED_CWOBJ1326W=CWOBJ1326W: The server security property, clientAuthentication,is set to true. This property is not supported in this environment and is ignored. 
     * SSL_TRANSPORT_CLIENTAUTHENICATION_ENABLED_CWOBJ1326W.explanation=WebSphere eXtreme Scale only supports the clientAuthentication property when running both the object grid client and servers in a WebSphere Application server or when running with the IBM eXtreme (XIO) transport.   
     * SSL_TRANSPORT_CLIENTAUTHENICATION_ENABLED_CWOBJ1326W.useraction=Remove this property from the server properties, or set the clientAuthentication property to false.
     *  </pre>
     */
    public String SSL_TRANSPORT_CLIENTAUTHENICATION_ENABLED_CWOBJ1326W = "SSL_TRANSPORT_CLIENTAUTHENICATION_ENABLED_CWOBJ1326W";

    /**
     * <pre>
     * SECURITY_NO_PERMISSIONS_CWOBJ1327E=CWOBJ1327E: The caller does not have permission for the request.
     * SECURITY_NO_PERMISSIONS_CWOBJ1327E.explanation=The caller has not been granted proper administration permissions for the requested operation.
     * SECURITY_NO_PERMISSIONS_CWOBJ1327E.useraction=Invoke the command using a user ID that has been granted administration permission.
     * </pre>
     */
    public String SECURITY_NO_PERMISSIONS_CWOBJ1327E = "SECURITY_NO_PERMISSIONS_CWOBJ1327E";

    /**
    # {0} feature
    # {1} algorithm
    AES_NOT_SUPPORTED_CWOBJ1328W=CWOBJ1328W: The Advanced Encryption Standard (AES) algorithm is not supported in this environment. The {1} algorithm is used by the {0} feature instead.
    AES_NOT_SUPPORTED_CWOBJ1328W.explanation=Some Java implementation environments do not support the AES algorithm.
    AES_NOT_SUPPORTED_CWOBJ1328W.useraction=No user action is required
    */
    public String AES_NOT_SUPPORTED_CWOBJ1328W = "AES_NOT_SUPPORTED_CWOBJ1328W";

    /**
     * <pre>
     * # {0} The SP800-131 certificate is invalid
     * SSL_VALIDATION_SP800_131_BAD_CERTIFICATE_CWOBJ1329E=CWOBJ1329E:Review your security settings and log files to verify that the certificate in the keystore meets SP800-131a {0} requirements
     * SSL_VALIDATION_SP800_131_BAD_CERTIFICATE_CWOBJ1329E.explanation=The SSL setting validation test failed because the certificte is not compliant with SP800-131a {0} requirements
     * SSL_VALIDATION_SP800_131_BAD_CERTIFICATE_CWOBJ1329E.useraction=Use a valid SP800-131a {0} compliant certificate
     * </pre>
     */
    public String SSL_VALIDATION_SP800_131_BAD_CERTIFICATE_CWOBJ1329E = "SSL_VALIDATION_SP800_131_BAD_CERTIFICATE_CWOBJ1329E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_KEYSTORE_CWOBJ1330E=CWOBJ1330E: No keystore was specified
     * SSL_VALIDATION_NO_KEYSTORE_CWOBJ1330E.explanation=The SSL setting validation test was not provided a keystore.
     * SSL_VALIDATION_NO_KEYSTORE_CWOBJ1330E.useraction=Specify a valid keystore and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_KEYSTORE_CWOBJ1330E = "SSL_VALIDATION_NO_KEYSTORE_CWOBJ1330E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_KEYSTORE_TYPE_CWOBJ1331E=CWOBJ1331E: No keystore type was specified
     * SSL_VALIDATION_NO_KEYSTORE_TYPE_CWOBJ1331E.explanation=The SSL setting validation test was not provided a keystore type.
     * SSL_VALIDATION_NO_KEYSTORE_TYPE_CWOBJ1331E.useraction=Specify a valid keystore type and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_KEYSTORE_TYPE_CWOBJ1331E = "SSL_VALIDATION_NO_KEYSTORE_TYPE_CWOBJ1331E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_KEYSTORE_PASSWORD_CWOBJ1332E=CWOBJ1332E: No keystore password was specified
     * SSL_VALIDATION_NO_KEYSTORE_PASSWORD_CWOBJ1332E.explanation=The SSL setting validation test was not provided a keystore password.
     * SSL_VALIDATION_NO_KEYSTORE_PASSWORD_CWOBJ1332E.useraction=Specify a valid keystore password and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_KEYSTORE_PASSWORD_CWOBJ1332E = "SSL_VALIDATION_NO_KEYSTORE_PASSWORD_CWOBJ1332E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_TRUSTSTORE_TYPE_CWOBJ1333E=CWOBJ1333E: No truststore type was specified
     * SSL_VALIDATION_NO_TRUSTSTORE_TYPE_CWOBJ1333E.explanation=The SSL setting validation test was not provided a truststore type.
     * SSL_VALIDATION_NO_TRUSTSTORE_TYPE_CWOBJ1333E.useraction=Specify a valid truststore type and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_TRUSTSTORE_TYPE_CWOBJ1333E = "SSL_VALIDATION_NO_TRUSTSTORE_TYPE_CWOBJ1333E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_TRUSTSTORE_PASSWORD_CWOBJ1334E=CWOBJ1334E: No truststore password was specified
     * SSL_VALIDATION_NO_TRUSTSTORE_PASSWORD_CWOBJ1334E.explanation=The SSL setting validation test was not provided a truststore password.
     * SSL_VALIDATION_NO_TRUSTSTORE_PASSWORD_CWOBJ1334E.useraction=Specify a valid truststore password and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_TRUSTSTORE_PASSWORD_CWOBJ1334E = "SSL_VALIDATION_NO_TRUSTSTORE_PASSWORD_CWOBJ1334E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_TRUSTSTORE_LOAD_ERROR_CWOBJ1335E=CWOBJ1335E: Failed to load truststore: {0}
     * SSL_VALIDATION_TRUSTSTORE_LOAD_ERROR_CWOBJ1335E.explanation=The SSL setting validation test failed to load the truststore.
     * SSL_VALIDATION_TRUSTSTORE_LOAD_ERROR_CWOBJ1335E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_TRUSTSTORE_LOAD_ERROR_CWOBJ1335E = "SSL_VALIDATION_TRUSTSTORE_LOAD_ERROR_CWOBJ1335E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_PROTOCOL_CWOBJ1336E=CWOBJ1336E: No SSL/TLS protocol was specified
     * SSL_VALIDATION_NO_PROTOCOL_CWOBJ1336E.explanation=The SSL setting validation test was not provided an SSL/TLS protocol.
     * SSL_VALIDATION_NO_PROTOCOL_CWOBJ1336E.useraction=Specify a valid SSL/TLS protocol and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_NO_PROTOCOL_CWOBJ1336E = "SSL_VALIDATION_NO_PROTOCOL_CWOBJ1336E";

    /**
     * <pre>
     * SSL_VALIDATION_NO_FIPS_PROVIDER_CWOBJ1337E=CWOBJ1337E: FIPS 140-2 requires the IBMJCEFIPS security provider.
     * SSL_VALIDATION_NO_FIPS_PROVIDER_CWOBJ1337E.explanation=The SSL setting validation test failed because FIPS 140-2 requires the IBMJCEFIPS security provider.
     * SSL_VALIDATION_NO_FIPS_PROVIDER_CWOBJ1337E.useraction=Ensure the specified security provider is available or turn off FIPS 140-2.
     * </pre>
     */
    public String SSL_VALIDATION_NO_FIPS_PROVIDER_CWOBJ1337E = "SSL_VALIDATION_NO_FIPS_PROVIDER_CWOBJ1337E";

    /**
     * <pre>
     * # {0} The SP800-131 option that is invalid
     * SSL_VALIDATION_SP800_131_BAD_OPTION_CWOBJ1338E=CWOBJ1338E: NIST SP800-131a value of ''{0}'' is not supported
     * SSL_VALIDATION_SP800_131_BAD_OPTION_CWOBJ1338E.explanation=The SSL setting validation test failed because a bad SP800-131a was provided.
     * SSL_VALIDATION_SP800_131_BAD_OPTION_CWOBJ1338E.useraction=Specify a valid SP800-131a option.
     * </pre>
     */
    public String SSL_VALIDATION_SP800_131_BAD_OPTION_CWOBJ1338E = "SSL_VALIDATION_SP800_131_BAD_OPTION_CWOBJ1338E";
    
    /**
     * <pre>
     * SSL_VALIDATION_NO_SP800_PROVIDER_CWOBJ1339E=CWOBJ1339E: NIST SP800-131a requires the IBMJCE or IBMJCEFIPS security provider.
     * SSL_VALIDATION_NO_SP800_PROVIDER_CWOBJ1339E.explanation=The SSL setting validation test failed because NIST SP800-131a requires the IBMJCE or IBMJCEFIPS security provider.
     * SSL_VALIDATION_NO_SP800_PROVIDER_CWOBJ1339E.useraction=Ensure one of the specified security providers is available or turn off NIST SP800-131a.
     * </pre>
     */
    public String SSL_VALIDATION_NO_SP800_PROVIDER_CWOBJ1339E = "SSL_VALIDATION_NO_SP800_PROVIDER_CWOBJ1339E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_KEYSTORE_LOAD_ERROR_CWOBJ1340E=CWOBJ1340E: Failed to load keystore: {0}
     * SSL_VALIDATION_KEYSTORE_LOAD_ERROR_CWOBJ1340E.explanation=The SSL setting validation test failed to load the keystore.
     * SSL_VALIDATION_KEYSTORE_LOAD_ERROR_CWOBJ1340E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_KEYSTORE_LOAD_ERROR_CWOBJ1340E = "SSL_VALIDATION_KEYSTORE_LOAD_ERROR_CWOBJ1340E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_KEY_MANAGER_FACTORY_ERROR_CWOBJ1341E=CWOBJ1341E: Failed to initialize KeyManagerFactory: {0} 
     * SSL_VALIDATION_KEY_MANAGER_FACTORY_ERROR_CWOBJ1341E.explanation=The SSL setting validation test failed to initialize the KeyManagerFactory.
     * SSL_VALIDATION_KEY_MANAGER_FACTORY_ERROR_CWOBJ1341E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_KEY_MANAGER_FACTORY_ERROR_CWOBJ1341E = "SSL_VALIDATION_KEY_MANAGER_FACTORY_ERROR_CWOBJ1341E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_TRUST_MANAGER_FACTORY_ERROR_CWOBJ1342E=CWOBJ1342E: Failed to initialize TrustManagerFactory: {0} 
     * SSL_VALIDATION_TRUST_MANAGER_FACTORY_ERROR_CWOBJ1342E.explanation=The SSL setting validation test failed to initialize the TrustManagerFactory.
     * SSL_VALIDATION_TRUST_MANAGER_FACTORY_ERROR_CWOBJ1342E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_TRUST_MANAGER_FACTORY_ERROR_CWOBJ1342E = "SSL_VALIDATION_TRUST_MANAGER_FACTORY_ERROR_CWOBJ1342E";

    /**
     * <pre>
     * # {0} Alias name
     * SSL_VALIDATION_ALIAS_NOT_IN_KEYSTORE_CWOBJ1343E=CWOBJ1343E: Keystore does not contain specified alias ''{0}''
     * SSL_VALIDATION_ALIAS_NOT_IN_KEYSTORE_CWOBJ1343E.explanation=The SSL setting validation test failed because the keystore did not contain the specified alias.
     * SSL_VALIDATION_ALIAS_NOT_IN_KEYSTORE_CWOBJ1343E.useraction=Ensure the alias is in the keystore and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_ALIAS_NOT_IN_KEYSTORE_CWOBJ1343E = "SSL_VALIDATION_ALIAS_NOT_IN_KEYSTORE_CWOBJ1343E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_SSL_CONTEXT_ERROR_CWOBJ1344E=CWOBJ1344E: Failed to initialize the SSLContext: {0}
     * SSL_VALIDATION_SSL_CONTEXT_ERROR_CWOBJ1344E.explanation=The SSL setting validation test failed because it could not initialize an SSLContext.
     * SSL_VALIDATION_SSL_CONTEXT_ERROR_CWOBJ1344E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_SSL_CONTEXT_ERROR_CWOBJ1344E = "SSL_VALIDATION_SSL_CONTEXT_ERROR_CWOBJ1344E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_CREATE_RESULT_ERROR_CWOBJ1345E=CWOBJ1345E: Error creating test results file: {0}
     * SSL_VALIDATION_CREATE_RESULT_ERROR_CWOBJ1345E.explanation=The SSL setting validation test failed because it was unable to create a test results file.
     * SSL_VALIDATION_CREATE_RESULT_ERROR_CWOBJ1345E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_CREATE_RESULT_ERROR_CWOBJ1345E = "SSL_VALIDATION_CREATE_RESULT_ERROR_CWOBJ1345E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_START_TEST_ERROR_CWOBJ1346E=CWOBJ1346E: Error starting test process: {0}
     * SSL_VALIDATION_START_TEST_ERROR_CWOBJ1346E.explanation=The SSL setting validation test failed because it was unable to start a test process.
     * SSL_VALIDATION_START_TEST_ERROR_CWOBJ1346E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_START_TEST_ERROR_CWOBJ1346E = "SSL_VALIDATION_START_TEST_ERROR_CWOBJ1346E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_READ_RESULT_ERROR_CWOBJ1347E=CWOBJ1347E: Error reading test result: {0}
     * SSL_VALIDATION_READ_RESULT_ERROR_CWOBJ1347E.explanation=The SSL setting validation test failed because it was unable to read from the test results file.
     * SSL_VALIDATION_READ_RESULT_ERROR_CWOBJ1347E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_READ_RESULT_ERROR_CWOBJ1347E = "SSL_VALIDATION_READ_RESULT_ERROR_CWOBJ1347E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_WRITE_RESULT_ERROR_CWOBJ1348E=CWOBJ1348E: Error writing test result: {0}
     * SSL_VALIDATION_WRITE_RESULT_ERROR_CWOBJ1348E.explanation=The SSL setting validation test failed because it was unable to write to the test results file.
     * SSL_VALIDATION_WRITE_RESULT_ERROR_CWOBJ1348E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_WRITE_RESULT_ERROR_CWOBJ1348E = "SSL_VALIDATION_WRITE_RESULT_ERROR_CWOBJ1348E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_UNEXPECTED_EXCEPTION_CWOBJ1349E=CWOBJ1349E: Unexpected exception: {0}
     * SSL_VALIDATION_UNEXPECTED_EXCEPTION_CWOBJ1349E.explanation=The SSL setting validation test failed because it encountered an unexpected exception.
     * SSL_VALIDATION_UNEXPECTED_EXCEPTION_CWOBJ1349E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_UNEXPECTED_EXCEPTION_CWOBJ1349E = "SSL_VALIDATION_UNEXPECTED_EXCEPTION_CWOBJ1349E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_CLIENT_CONNECT_ERROR_CWOBJ1350E=CWOBJ1350E: Client failed to connect to server: {0}
     * SSL_VALIDATION_CLIENT_CONNECT_ERROR_CWOBJ1350E.explanation=The SSL setting validation test failed because the client was unable to connect to the server.
     * SSL_VALIDATION_CLIENT_CONNECT_ERROR_CWOBJ1350E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_CLIENT_CONNECT_ERROR_CWOBJ1350E = "SSL_VALIDATION_CLIENT_CONNECT_ERROR_CWOBJ1350E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_CLIENT_WRITE_ERROR_CWOBJ1351E=CWOBJ1351E: Client failed to write to socket: {0}
     * SSL_VALIDATION_CLIENT_WRITE_ERROR_CWOBJ1351E.explanation=The SSL setting validation test failed because the client was unable to write to the socket.
     * SSL_VALIDATION_CLIENT_WRITE_ERROR_CWOBJ1351E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_CLIENT_WRITE_ERROR_CWOBJ1351E = "SSL_VALIDATION_CLIENT_WRITE_ERROR_CWOBJ1351E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_SERVER_BIND_ERROR_CWOBJ1352E=CWOBJ1352E: Server failed to bind: {0}
     * SSL_VALIDATION_SERVER_BIND_ERROR_CWOBJ1352E.explanation=The SSL setting validation test failed because the server was unable to bind.
     * SSL_VALIDATION_SERVER_BIND_ERROR_CWOBJ1352E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_SERVER_BIND_ERROR_CWOBJ1352E = "SSL_VALIDATION_SERVER_BIND_ERROR_CWOBJ1352E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_SERVER_ACCEPT_ERROR_CWOBJ1353E=CWOBJ1353E: Server failed to accept connection: {0}
     * SSL_VALIDATION_SERVER_ACCEPT_ERROR_CWOBJ1353E.explanation=The SSL setting validation test failed because the server was unable to accept connection.
     * SSL_VALIDATION_SERVER_ACCEPT_ERROR_CWOBJ1353E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_SERVER_ACCEPT_ERROR_CWOBJ1353E = "SSL_VALIDATION_SERVER_ACCEPT_ERROR_CWOBJ1353E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_SERVER_READ_ERROR_CWOBJ1354E=CWOBJ1354E: Server failed to read from socket: {0}
     * SSL_VALIDATION_SERVER_READ_ERROR_CWOBJ1354E.explanation=The SSL setting validation test failed because the server was unable to read from the socket.
     * SSL_VALIDATION_SERVER_READ_ERROR_CWOBJ1354E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_SERVER_READ_ERROR_CWOBJ1354E = "SSL_VALIDATION_SERVER_READ_ERROR_CWOBJ1354E";

    /**
     * <pre>
     * # {0} Causal Exception
     * SSL_VALIDATION_SERVER_WRONG_DATA_CWOBJ1355E=CWOBJ1355E: Server received unexpected data: {0}
     * SSL_VALIDATION_SERVER_WRONG_DATA_CWOBJ1355E.explanation=The SSL setting validation test failed because the server received unexpected data.
     * SSL_VALIDATION_SERVER_WRONG_DATA_CWOBJ1355E.useraction=Address the issue descibed in the exception at the end of this message and re-run.
     * </pre>
     */
    public String SSL_VALIDATION_SERVER_WRONG_DATA_CWOBJ1355E = "SSL_VALIDATION_SERVER_WRONG_DATA_CWOBJ1355E";

    /**
     * <pre>
     * XS_DOESNT_SUPPPORT_FIPS_AND_TLSV12_CWOBJ1356W=CWOBJ1356W: Having both FIPS and the TLSv1.2 encryprition algorithm set is not supported.  FIPS will be disabled. 
     * XS_DOESNT_SUPPPORT_FIPS_AND_TLSV12_CWOBJ1356W.explanation=Currently WebSphere eXtreme Scale can not support a configuration where FIPS and TLSv1.2 are configured.
     * XS_DOESNT_SUPPPORT_FIPS_AND_TLSV12_CWOBJ1356W.useraction=If user requires FIPS disable TLSv1.2.
     * </pre>
     */
    public String XS_DOESNT_SUPPPORT_FIPS_AND_TLSV12_CWOBJ1356W = "XS_DOESNT_SUPPPORT_FIPS_AND_TLSV12_CWOBJ1356W";
    
    /**
     * {0} - Host and subnets in the white list.
     * 
     * <pre>
     * HOST_BLOCKER_WHITELIST_CWOBJ1357I=CWOBJ1357I: Host blocking whitelist: {0}  
     * HOST_BLOCKER_WHITELIST_CWOBJ1357I.explanation=The list hosts and subnets in the host blocking service's white list.
     * HOST_BLOCKER_WHITELIST_CWOBJ1357I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_WHITELIST_CWOBJ1357I = "HOST_BLOCKER_WHITELIST_CWOBJ1357I";
    
    /**
     * {0} - Number of failures allowed before blocking a host.
     * 
     * <pre>
     * HOST_BLOCKER_FAILURES_CWOBJ1358I=CWOBJ1358I: Host blocking failures: {0}  
     * HOST_BLOCKER_FAILURES_CWOBJ1358I.explanation=The number of failures that are allowed to accumulate from a single host before that host is blocked.
     * HOST_BLOCKER_FAILURES_CWOBJ1358I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_FAILURES_CWOBJ1358I = "HOST_BLOCKER_FAILURES_CWOBJ1358I";
    
    /**
     * {0} - The duration that a host will be blocked for.
     * 
     * <pre>
     * HOST_BLOCKER_DURATION_CWOBJ1359I=CWOBJ1359I: Host blocking duration: {0}  
     * HOST_BLOCKER_DURATION_CWOBJ1359I.explanation=The duration (in ms) a host will remained blocked.
     * HOST_BLOCKER_DURATION_CWOBJ1359I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_DURATION_CWOBJ1359I = "HOST_BLOCKER_DURATION_CWOBJ1359I";
    
    /**
     * {0} - The interval that all failures must occur within to block a host.
     * 
     * <pre>
     * HOST_BLOCKER_FAILURE_INTERVAL_CWOBJ1360I=CWOBJ1360I: Host blocking failure interval: {0}  
     * HOST_BLOCKER_FAILURE_INTERVAL_CWOBJ1360I.explanation=The interval (in ms) that all failures must occur within to block a host.
     * HOST_BLOCKER_FAILURE_INTERVAL_CWOBJ1360I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_FAILURE_INTERVAL_CWOBJ1360I = "HOST_BLOCKER_FAILURE_INTERVAL_CWOBJ1360I";
    
    /**
     * {0} - The host that was blocked.
     * 
     * <pre>
     * HOST_BLOCKER_HOST_BLOCKED_CWOBJ1361I=CWOBJ1361I: The following host has been temporarily blocked: {0}  
     * HOST_BLOCKER_HOST_BLOCKED_CWOBJ1361I.explanation=The host has been blocked for too many invalid authentication attempts.
     * HOST_BLOCKER_HOST_BLOCKED_CWOBJ1361I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_HOST_BLOCKED_CWOBJ1361I = "HOST_BLOCKER_HOST_BLOCKED_CWOBJ1361I";
    
    /**
     * {0} - The host that was unblocked.
     * 
     * <pre>
     * HOST_BLOCKER_HOST_UNBLOCKED_CWOBJ1362I=CWOBJ1362I: The following host has been unblocked: {0}  
     * HOST_BLOCKER_HOST_UNBLOCKED_CWOBJ1362I.explanation=A request to unblock the host was received.
     * HOST_BLOCKER_HOST_UNBLOCKED_CWOBJ1362I.useraction=No action is required.
     * </pre>
     */
    public String HOST_BLOCKER_HOST_UNBLOCKED_CWOBJ1362I = "HOST_BLOCKER_HOST_UNBLOCKED_CWOBJ1362I";
    
    /**
     * <pre>
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1363I=CWOBJ1363I: Both FIPS encryption and SP800-131a security mode have been configured with the ORB transport type.
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1363I.explanation=The ORB transport type does not support both configurations; therefore, the SP800-131a security mode is used.
     * OBJECTGRID_SECURITY_ENABLED_CWOBJ1363I.useraction=No action is required.
     * </pre>
     */
    public String OBJECTGRID_SECURITY_ENABLED_CWOBJ1363I = "OBJECTGRID_SECURITY_ENABLED_CWOBJ1363I";
    
    /**
     * <pre>
     * SECURITYUTIL_NO_STRING_FIELD_CWOBJ1364W=CWOBJ1364W: Could not get Field 'value' from type String. Memory purging is disabled.
	 * SECURITYUTIL_NO_STRING_FIELD_CWOBJ1364W.explanation=The feature that purges credential data from memory to mitigate the risk of a long GC cycle could not be started.
	 * SECURITYUTIL_NO_STRING_FIELD_CWOBJ1364W.useraction=Contact IBM Software Support.
	 * </pre>
     */
    public String SECURITYUTIL_NO_STRING_FIELD_CWOBJ1364W = "SECURITYUTIL_NO_STRING_FIELD_CWOBJ1364W";
    
    /**
     * <pre>
     * INSUFFICIENT_ADMINISTRATIVE_AUTHORITY_CWOBJ1365=CWOBJ1365E: The {0} is not configured to have the required permissions.
	 * INSUFFICIENT_ADMINISTRATIVE_AUTHORITY_CWOBJ1365.explanation=The Java security policy file does not grant the necessary permissions to allow execution.
	 * INSUFFICIENT_ADMINISTRATIVE_AUTHORITY_CWOBJ1365.useraction=Add the following to the Java security policy file:  grant codebase "file:${objectgrid.home}/-" { permission java.security.AllPermission; };
	 * </pre>
     */
    public String INSUFFICIENT_ADMINISTRATIVE_AUTHORITY_CWOBJ1365 = "INSUFFICIENT_ADMINISTRATIVE_AUTHORITY_CWOBJ1365";
    
    /**
     * <pre>
     * MULTIPLE_JAR_FILE_CWOBJ1400W=CWOBJ1400W: Detected multiple ObjectGrid runtime JARS files in the JVM.  Using multiple ObjectGrid runtime JAR files may cause problems.
     * MULTIPLE_JAR_FILE_CWOBJ1400W.explanation=Usually only one ObjectGrid runtime JAR should be found in a JVM.
     * MULTIPLE_JAR_FILE_CWOBJ1400W.useraction=Use the appropriate ObjectGrid runtime JAR for your configuration.
     * </pre>
     */
    public String MULTIPLE_JAR_FILE_CWOBJ1400W = "MULTIPLE_JAR_FILE_CWOBJ1400W";

    /**
     * <pre>
     * WRONG_JAR_FILE_CWOBJ1401E=CWOBJ1401E: Detected a wrong ObjectGrid runtime JAR file for this configuration.  Detected configuration is {0}.  Expected Jar file is {1}.
     * WRONG_JAR_FILE_CWOBJ1401E.explanation=Each ObjectGrid runtime JAR file corresponds to a particular supported configuration.
     * WRONG_JAR_FILE_CWOBJ1401E.useraction=Use the appropriate ObjectGrid runtime JAR for your configuration.
     * </pre>
     */
    public String WRONG_JAR_FILE_CWOBJ1401E = "WRONG_JAR_FILE_CWOBJ1401E";

    /**
     * <pre>
     * MISSING_CONNECTION_LINK_CALLBACK_CWOBJ1402E=CWOBJ1402E: ObjectGrid connection link callback not found for id: {0}
     * MISSING_CONNECTION_LINK_CALLBACK_CWOBJ1402E.explanation=Internal error in ObjectGrid runtime.
     * MISSING_CONNECTION_LINK_CALLBACK_CWOBJ1402E.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String MISSING_CONNECTION_LINK_CALLBACK_CWOBJ1402E = "MISSING_CONNECTION_LINK_CALLBACK_CWOBJ1402E";

    /**
     * <pre>
     * # {0} resource name
     * INVALID_RESOURCE_CWOBJ1403E=CWOBJ1403E: The resource specified is invalid: {0}
     * INVALID_RESOURCE_CWOBJ1403E.explanation=The specified resource may not exist, may not be accessible, or it may not be in the appropriate format.
     * INVALID_RESOURCE_CWOBJ1403E.useraction=Verify that the resource exists, is accessible, and is in the correct format.
     * </pre>
     */
    public String INVALID_RESOURCE_CWOBJ1403E = "INVALID_RESOURCE_CWOBJ1403E";

    /**
     * <pre>
     * # Static replication
     * # {0} RuntimeReplicationGroupMember.toString()
     * # {1} Caught Exception
     * CANNOT_PROCESS_REPLICA_CHANGES_CWOBJ1504=CWOBJ1504E: An exception occurred when attempting to process the LogSequences for replica ({0}): {1}.
     * CANNOT_PROCESS_REPLICA_CHANGES_CWOBJ1504.explanation=An exception occurred on the replica while it was processing data.
     * CANNOT_PROCESS_REPLICA_CHANGES_CWOBJ1504.useraction=If the exception indicates that there is a configuration problem on the replica, correct the problem and restart the replica server. Otherwise, the replica will rollback the failed transaction.
     * </pre>
     */
    public String CANNOT_PROCESS_REPLICA_CHANGES_CWOBJ1504 = "CANNOT_PROCESS_REPLICA_CHANGES_CWOBJ1504";

    /**
     * <pre>
     * # Static replication
     * # {0} HA GroupMemberIds (array)
     * MORE_THAN_ONE_PRIMARY_RESPONSE_CWOBJ1505=CWOBJ1505E: More than one replication group member reported back as the primary.  Only one primary can be active.  ({0}).
     * MORE_THAN_ONE_PRIMARY_RESPONSE_CWOBJ1505.explanation=While pushing out the routing table, there is more than one replication group member reported as primary.
     * MORE_THAN_ONE_PRIMARY_RESPONSE_CWOBJ1505.useraction=The routing table will not be updated at this time. Check the current list of primaries to ensure there are no duplicates using the logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location, or the ManagementGateway Interface.
     * </pre>
     */
    public String MORE_THAN_ONE_PRIMARY_RESPONSE_CWOBJ1505 = "MORE_THAN_ONE_PRIMARY_RESPONSE_CWOBJ1505";

    /**
     * <pre>
     * # Static replicaiton
     * # {0} HA GroupMemberIds (array)
     * # {1} RuntimeReplicationGroup.toString()
     * POSSIBLE_NETWORK_PARTITION_CWOBJ1506=CWOBJ1506E: More than one primary replication group member exists in this group ({1}).  Only one primary can be active.  ({0}).
     * POSSIBLE_NETWORK_PARTITION_CWOBJ1506.explanation=There may have been a temporary network partition or brown out condition and now there is more than one primary active.
     * POSSIBLE_NETWORK_PARTITION_CWOBJ1506.useraction=No additional placement or routing updates will be done. Restart the servers that were network partitioned.
     * </pre>
     */
    public String POSSIBLE_NETWORK_PARTITION_CWOBJ1506 = "POSSIBLE_NETWORK_PARTITION_CWOBJ1506";

    /**
     * <pre>
     * # {0} Message
     * # {1} Sender GroupMemberId
     * # {2} Receiver GroupMemberId(s)
     * # {3} Caught Exception
     * CANNOT_SEND_MESSAGE_CWOBJ1508=CWOBJ1508E: An exception occurred when attempting to send message ({0}) from sender ({1}) to receiver ({2}): {3}.
     * CANNOT_SEND_MESSAGE_CWOBJ1508.explanation=A problem occurred while attempting to send a message between replication group members.
     * CANNOT_SEND_MESSAGE_CWOBJ1508.useraction=Review the error message listed. If there is a configuration problem, correct it and restart the replica server. Otherwise, verify the correct placement of primaries and replicas using the logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location, or the ManagementGateway Interface.
     * </pre>
     */
    public String CANNOT_SEND_MESSAGE_CWOBJ1508 = "CANNOT_SEND_MESSAGE_CWOBJ1508";

    /**
     * <pre>
     * # {0} Message (SystemEvent)
     * # {1} Caught Exception
     * CANNOT_SERIALIZE_MESSAGE_CWOBJ1509=CWOBJ1509E: An exception occurred when attempting to serialize message ({0}): {1}.
     * CANNOT_SERIALIZE_MESSAGE_CWOBJ1509.explanation=An exception occurred while serialing an internal message.
     * CANNOT_SERIALIZE_MESSAGE_CWOBJ1509.useraction=Review the error message listed. If there is a configuration problem, correct it and restart the replica server.
     * </pre>
     */
    public String CANNOT_SERIALIZE_MESSAGE_CWOBJ1509 = "CANNOT_SERIALIZE_MESSAGE_CWOBJ1509";

    /**
     * <pre>
     * # {0} byte[] message
     * # {1} Caught Exception
     * CANNOT_DESERIALIZE_MESSAGE_CWOBJ1510=CWOBJ1510E: An exception occurred when attempting to inflate message ({0}): {1}.
     * CANNOT_DESERIALIZE_MESSAGE_CWOBJ1510.explanation=An exception occurred while inflating an internal message.
     * CANNOT_DESERIALIZE_MESSAGE_CWOBJ1510.useraction=Review the error message listed. If there is a configuration problem, correct it and restart the replica server.
     * </pre>
     */
    public String CANNOT_DESERIALIZE_MESSAGE_CWOBJ1510 = "CANNOT_DESERIALIZE_MESSAGE_CWOBJ1510";

    /**
     * <pre>
     * # {0} RuntimeReplicationGroupMember.toString()
     * # {1} type of member ("primary", "replica", "standby")
     * OPEN_FOR_BUSINESS_CWOBJ1511=CWOBJ1511I: {0} ({1}) is open for business.
     * OPEN_FOR_BUSINESS_CWOBJ1511.explanation=Specified replication group member is now ready to accept requests.
     * OPEN_FOR_BUSINESS_CWOBJ1511.useraction=No action is required.
     * </pre>
     */
    public String OPEN_FOR_BUSINESS_CWOBJ1511 = "OPEN_FOR_BUSINESS_CWOBJ1511";

    /**
     * <pre>
     * Static replication
     * # {0} RuntimeReplicationGroupMember.toString()
     * # {1} type of member ("primary", "replica", "standby")
     * SYNCH_REPLICATION_FAILED_CWOBJ1513=CWOBJ1513E: Synchronous replication failed on {0} ({1}).  This member is no longer active.
     * SYNCH_REPLICATION_FAILED_CWOBJ1513.explanation=A problem was encountered that prevented synchronous replication from successfully completing.
     * SYNCH_REPLICATION_FAILED_CWOBJ1513.useraction=Review previous messages in the log. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location to help diagnose the problem.  Restart the specified server to replace the removed replica.
     * </pre>
     */
    public String SYNCH_REPLICATION_FAILED_CWOBJ1513 = "SYNCH_REPLICATION_FAILED_CWOBJ1513";

    /**
     * <pre>
     * # Static replication
     * # {0} RuntimeReplicationGroupMember.toString()
     * PRIMARY_DOWNGRADED_CWOBJ1514=CWOBJ1514I: Primary ({0}) is being downgraded to either a replica or standby.
     * PRIMARY_DOWNGRADED_CWOBJ1514.explanation=This is not a normal operation, but ObjectGrid processing can continue.
     * PRIMARY_DOWNGRADED_CWOBJ1514.useraction=Verify the correct placement of primaries and replicas using the logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location, or the ManagementGateway Interface.
     * </pre>
     */
    public String PRIMARY_DOWNGRADED_CWOBJ1514 = "PRIMARY_DOWNGRADED_CWOBJ1514";

    /**
     * <pre>
     * # {0} String Replication Group Name
     * MIN_CONFIG_NOT_MET_CWOBJ1515=CWOBJ1515I: Minimum configuration requirements not satisfied for replication group ({0}).
     * MIN_CONFIG_NOT_MET_CWOBJ1515.explanation=The necessary primary and replica configuration requirements were not met with the recent replication group member change.
     * MIN_CONFIG_NOT_MET_CWOBJ1515.useraction=Wait for additional resources to be started and recognized for this configuration.
     * </pre>
     */
    public String MIN_CONFIG_NOT_MET_CWOBJ1515 = "MIN_CONFIG_NOT_MET_CWOBJ1515";

    /**
     * <pre>
     * # Static replication
     * # {0} ObjectGrid name
     * # {1} Caught Exception
     * CANNOT_ACTIVATE_OBJECTGRID_CWOBJ1516=CWOBJ1516E: An exception occurred when attempting to activate the replication process for ObjectGrid ({0}): {1}.
     * CANNOT_ACTIVATE_OBJECTGRID_CWOBJ1516.explanation=While attempting to start a primay replication group member, an exception occurred during the activation processing.
     * CANNOT_ACTIVATE_OBJECTGRID_CWOBJ1516.useraction=The primary will continue to run. Verify the correct placement of primaries and replicas using the logs. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location, or the ManagementGateway Interface. Restart the server if the primary continues to have errors.
     * </pre>
     */
    public String CANNOT_ACTIVATE_OBJECTGRID_CWOBJ1516 = "CANNOT_ACTIVATE_OBJECTGRID_CWOBJ1516";

    /**
     * <pre>
     * # Static replication
     * # {0} replica TxID
     * # {1} primary TxID
     * # {2} RuntimeReplicationGroupMember.toString()
     * # {3} Caught Exception
     * CANNOT_COMMIT_REPLICA_CHANGES_CWOBJ1518=CWOBJ1518E: An exception occurred when attempting to commit replica transaction ({0}) for primary transaction ({1}) on Replica ({2}): {3}.
     * CANNOT_COMMIT_REPLICA_CHANGES_CWOBJ1518.explanation=There was an exception while committing data on the replica.
     * CANNOT_COMMIT_REPLICA_CHANGES_CWOBJ1518.useraction=If the exception indicates that there is a configuration problem on the replica, correct the problem and restart the replica server. Otherwise, the replica will rollback the failed transaction.
     * </pre>
     */
    public String CANNOT_COMMIT_REPLICA_CHANGES_CWOBJ1518 = "CANNOT_COMMIT_REPLICA_CHANGES_CWOBJ1518";

    /**
     * <pre>
     * # Static replication
     * # {0} RuntimeReplicationGroupMember.toString()
     * # {1} Caught Exception
     * CANNOT_ROLLBACK_REPLICA_CHANGES_CWOBJ1519=CWOBJ1519E: An exception occurred when attempting to rollback the LogSequences for replica ({0}): {1}
     * CANNOT_ROLLBACK_REPLICA_CHANGES_CWOBJ1519.explanation=After a transaction failed to commit on a replica, the rollback also failed on the replica.
     * CANNOT_ROLLBACK_REPLICA_CHANGES_CWOBJ1519.useraction=If the exception indicates that there is a configuration problem on the replica, correct the problem and restart the replica server.
     * </pre>
     */
    public String CANNOT_ROLLBACK_REPLICA_CHANGES_CWOBJ1519 = "CANNOT_ROLLBACK_REPLICA_CHANGES_CWOBJ1519";

    /**
     * <pre>
     * # {0} replica name
     * # {1} exception returned
     * LISTENER_REREGISTER_CWOBJ1524=CWOBJ1524I: Replica listener {0} must re-register with the primary. Reason: {1}
     * LISTENER_REREGISTER_CWOBJ1524.explanation=The replica will deregister and reregister the primary. It will get a new snapshot of the data and then continue processing new transactions. This happens when an error occurs on the replica.
     * LISTENER_REREGISTER_CWOBJ1524.useraction=If the replica enters peer mode successfully, no immediate action is neccessary (CWOBJ1526I). To look for the cause, check on the reason for the reregister. If there is an error inflating the key, verify that the server for the replica has the correct classpath and the correct code to deserialize the object. Also, verify that the hashcode() and equals() methods are correct for the key or keys being used if a custom key is used. Otherwise, contact IBM Software Support.
     * </pre>
     */
    public String LISTENER_REREGISTER_CWOBJ1524 = "LISTENER_REREGISTER_CWOBJ1524";

    /**
     * <pre>
     * # {0} Class name of ReplicaPreloadController
     * # {1} map name
     * # {2} exception that occurred
     * # Do not translate ReplicaPreloadController, checkPreloadState
     * CHECKPRELOADSTATE_EXCEPTION_CWOBJ1525=CWOBJ1525I: A ReplicaPreloadController ({0}) for map {1} threw an unexpected exception in method checkPreloadState {2}
     * CHECKPRELOADSTATE_EXCEPTION_CWOBJ1525.explanation=When promoting from replica to primary an exception occurred when the ReplicaPreloadController was called to determine the state of the replica.  The exception is ignored and preload is performed on the map.
     * CHECKPRELOADSTATE_EXCEPTION_CWOBJ1525.useraction=Examine the stack trace to determine the cause of the problem.  Fix the problem in your implementation or contact IBM Software Support if the problem does not appear to be in your implementation.
     * </pre>
     */
    public String CHECKPRELOADSTATE_EXCEPTION_CWOBJ1525 = "CHECKPRELOADSTATE_EXCEPTION_CWOBJ1525";

    /**
     * <pre>
     * # {0} replica name
     * # {1} number of seconds to enter peer mode
     * # {2} primary container name
     * ENTERING_PEER_MODE_CWOBJ1526=CWOBJ1526I: Replica {0} entering peer mode after {1} seconds, replicating from primary on {2}
     * ENTERING_PEER_MODE_CWOBJ1526.explanation=This is an informational message on how long it took for a replica to enter peer mode where both primary and replica have the same data.
     * ENTERING_PEER_MODE_CWOBJ1526.useraction=No action is required.
     * </pre>
     */
    public String ENTERING_PEER_MODE_CWOBJ1526 = "ENTERING_PEER_MODE_CWOBJ1526";

    /**
     * <pre>
     * # {0} replica name
     * # {1} number of seconds to enter peer mode
     * FAILED_ENTERING_PEER_MODE_CWOBJ1527=CWOBJ1527W: Replica {0} failed to enter peer mode after {1} seconds
     * FAILED_ENTERING_PEER_MODE_CWOBJ1527.explanation=The replica failed to enter peer mode. Look for additional messages that point to the specific cause of the failure. Possible reasons may include a timeout or data failing to copy from the primary.
     * FAILED_ENTERING_PEER_MODE_CWOBJ1527.useraction=Review the action recommended by the specific message for timeout, bad data copy or other reason.
     * </pre>
     */
    public String FAILED_ENTERING_PEER_MODE_CWOBJ1527 = "FAILED_ENTERING_PEER_MODE_CWOBJ1527";

    /**
     * <pre>
     * # {0} shard name
     * # {1} type of shard ("primary", "synchronous replica", "asynchronous replica")
     * CLOSED_FOR_BUSINESS_CWOBJ1531=CWOBJ1531I: {0} ({1}) stopped on this server.
     * CLOSED_FOR_BUSINESS_CWOBJ1531.explanation=Specified shard stopped running on this server and moved to another server if another is available.
     * CLOSED_FOR_BUSINESS_CWOBJ1531.useraction=None.
     * </pre>
     */
    public String CLOSED_FOR_BUSINESS_CWOBJ1531 = "CLOSED_FOR_BUSINESS_CWOBJ1531";

    /**
     * <pre>
     * # {0} shard name
     * # {1} server name
     * # {2} container name
     * # {3} type of replica ("synchronous replica", "asynchronous replica", "inactive")
     * SHARD_TRANSITION_CWOBJ1532=CWOBJ1532I: {0} (moving from server {1} ({2}), promoting {3} to primary) in transition.
     * SHARD_TRANSITION_CWOBJ1532.explanation=Specified shard is in a transitional state. The primary is moving from the server specified to the local server and a replica will be promoted. Either an existing replica will be promoted or an new sync replica will be placed and promoted. If an there are no replicas to promote and no primaries to take over from, a new primary start. This is indicated by promoting an inactive replica.
     * SHARD_TRANSITION_CWOBJ1532.useraction=None.
     * </pre>
     */
    public String SHARD_TRANSITION_CWOBJ1532 = "SHARD_TRANSITION_CWOBJ1532";

    /**
     * <pre>
     * # {0} replica name
     * # {1} map name
     * REPLICA_IN_PEER_MODE_CWOBJ1533=CWOBJ1533W: {0} {1} is already in peer mode.
     * REPLICA_IN_PEER_MODE_CWOBJ1533.explanation=Specified replica is in peer mode and attempted to enter peer mode again.
     * REPLICA_IN_PEER_MODE_CWOBJ1533.useraction=Contact IBM support.
     * /<pre>
     */
    public String REPLICA_IN_PEER_MODE_CWOBJ1533 = "REPLICA_IN_PEER_MODE_CWOBJ1533";

    /**
     * <pre>
     * # {0} replica name
     * # {1} map name
     * # {2} current timeout
     * REPLICA_FAIL_ON_PEER_MODE_TIMEOUT_CWOBJ1534=CWOBJ1534E: {0}:{1} Replica failed to enter peer mode. Waiting for data copy from the primary to complete timed out. Current timeout (ms): {2}
     * REPLICA_FAIL_ON_PEER_MODE__TIMEOUT_CWOBJ1534.explanation=The replica shard timed out while waiting for the existing data on the primary to copy over.
     * REPLICA_FAIL_ON_PEER_MODE__TIMEOUT_CWOBJ1534.useraction=Verify that the primary shard remained available while the replica was doing the copy. Contact IBM support.
     * </pre>
     */
    public String REPLICA_FAIL_ON_PEER_MODE_TIMEOUT_CWOBJ1534 = "REPLICA_FAIL_ON_PEER_MODE_TIMEOUT_CWOBJ1534";

    /**
     * <pre>
     * # {0} replica name
     * # {1} map name
     * # {2} error message
     * REPLICA_FAIL_ON_PEER_MODE_BAD_TRAN_CWOBJ1535=CWOBJ1535E: {0}:{1} Replica failed to enter peer mode. A transaction threw an error while copying data from the primary. Error received: {2}
     * REPLICA_FAIL_ON_PEER_MODE_BAD_TRAN_CWOBJ1535.explanation=There was an error on the replica while it copied existing data over the from the primary.
     * REPLICA_FAIL_ON_PEER_MODE_BAD_TRAN_CWOBJ1535.useraction=Review the error message received. Also review any other log messages for related errors from the application. If there is an error inflating the key, verify that the server for the replica has the correct classpath. Also, verify that the hashcode() and equals() methods are correct for the key or keys being used if a custom key is used.
     * </pre>
     */
    public String REPLICA_FAIL_ON_PEER_MODE_BAD_TRAN_CWOBJ1535 = "REPLICA_FAIL_ON_PEER_MODE_BAD_TRAN_CWOBJ1535";

    /**
     * <pre>
     * # {0} replica name
     * # {1} map name
     * REPLICA_FAIL_ON_PEER_MODE_ORDERING_CWOBJ1536=CWOBJ1536E: {0}:{1} Replica failed to enter peer mode. Received incorrect ordering data from the primary, data copy cannot complete.
     * REPLICA_FAIL_ON_PEER_MODE_ORDERING_CWOBJ1536.explanation=The data that the replica received from the primary was in the incorrect order.
     * REPLICA_FAIL_ON_PEER_MODE_ORDERING_CWOBJ1536.useraction=Contact IBM support.
     * </pre>
     */
    public String REPLICA_FAIL_ON_PEER_MODE_ORDERING_CWOBJ1536 = "REPLICA_FAIL_ON_PEER_MODE_ORDERING_CWOBJ1536";

    /**
     * <pre>
     * # {0} replica name
     * # {1} max times to reregister
     * REPLICA_FAIL_TO_REREGISTER_CWOBJ1537=CWOBJ1537E: {0} exceeded the maximum number of times to reregister ({1}) without successful transactions.
     * REPLICA_FAIL_TO_REREGISTER_CWOBJ1537.explanation=The replica attempted to reregister several times in a row due to errors, but failed to successfully commit any data before the next reregister. The replica will stop attempting to reregister.
     * REPLICA_FAIL_TO_REREGISTER_CWOBJ1537.useraction=Review the logs for messages why the replica had to reregister. Check for configuration or application errors that would prevent the replica from working correctly, such as classpath issues, errors deserializing the data, etc.
     * </pre>
     */
    public String REPLICA_FAIL_TO_REREGISTER_CWOBJ1537 = "REPLICA_FAIL_TO_REREGISTER_CWOBJ1537";

    /**
     * <pre>
     * # {0} replica name
     * # {1} replica type
     * # {2} container name
     * PRIMARY_REJECT_SAME_REPLICA_CWOBJ1538=CWOBJ1538E: {0} received a {1} replica with the same container name as the local container. The replica will not be placed. Container: {2}.
     * PRIMARY_REJECT_SAME_REPLICA_CWOBJ1538.explanation=The primary shard received a new replica, but the new replica is located on the same container as the primary which is an illegal placement. The replica will be rejected.
     * PRIMARY_REJECT_SAME_REPLICA_CWOBJ1538.useraction=Contact IBM support. Use XSAdmin to review where the primary and replica should have been placed.
     * </pre>
     */
    public String PRIMARY_REJECT_SAME_REPLICA_CWOBJ1538 = "PRIMARY_REJECT_SAME_REPLICA_CWOBJ1538";

    /**
     * <pre>
     * # {0} exception
     * CLIENT_REPLICA_SERIALIZATION_ERROR_CWOBJ1539=CWOBJ1539W: Unable to serialize client listener data to send to replica, the client listener may not failover: {0}
     * CLIENT_REPLICA_SERIALIZATION_ERROR_CWOBJ1539.explanation=The client replica is serialized and sent over replicas to be saved in the event of failover. If there is an error during serialization, the replicas will not be able to failover the replica.
     * CLIENT_REPLICA_SERIALIZATION_ERROR_CWOBJ1539.useraction=Review the error and correct any classpath issues or custom application errors. Otherwise, contact IBM support.
     * </pre>
     */
    public String CLIENT_REPLICA_SERIALIZATION_ERROR_CWOBJ1539 = "CLIENT_REPLICA_SERIALIZATION_ERROR_CWOBJ1539";

    /**
     * <pre>
     * # {0} timeout in milliseconds
     * CREATING_CLIENT_REPLICA_TIMED_OUT_CWOBJ1540=CWOBJ1540E: Creating a client replica map times out after {0} ms.
     * CREATING_CLIENT_REPLICA_TIMED_OUT_CWOBJ1540.explanation=The replica did not enter peer mode before the timeout was met. It was not able to copy the primary's existing data and then start to receive data in realtime.
     * CREATING_CLIENT_REPLICA_TIMED_OUT_CWOBJ1540.useraction=Review the client log for errors copying data.
     * </pre>
     */
    public String CREATING_CLIENT_REPLICA_TIMED_OUT_CWOBJ1540 = "CREATING_CLIENT_REPLICA_TIMED_OUT_CWOBJ1540";

    /**
     * <pre>
     * # {0} replica name
     * # {1} map name
     * # {2} error message
     * REPLICA_FAIL_ON_PRIOR_MAP_CWOBJ1541=CWOBJ1541E: {0}:{1} Replica map failed to enter peer mode because a previous map failed to enter peer mode. The entire replica cannot continue to enter peer mode. The prior exception was {2}.
     * REPLICA_FAIL_ON_PRIOR_MAP_CWOBJ1541.explanation=There was an error on a previous map entering peer mode. The replica cannot finish entering peer mode with some failed maps.
     * REPLICA_FAIL_ON_PRIOR_MAP_CWOBJ1541.useraction=Review the log for the failed map. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location. Correct any configuration or network problems. Restart the servers or use the triggerPlacement method on the PlacementServiceMBean Mbean to replace the replica. See the Life cycle, recovery, and failure events section in the WebSphere eXtreme Scale documentation for more information on the triggerPlacement method.
     * </pre>
     */
    public String REPLICA_FAIL_ON_PRIOR_MAP_CWOBJ1541 = "REPLICA_FAIL_ON_PRIOR_MAP_CWOBJ1541";

    /**
     * <pre>
     * # {0} primary name
     * # {1} remote primary container name
     * # {2} map names
     * # {4} type of primary (ie foreign, domestic)
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1542=CWOBJ1542I: Primary {0} started or continued replicating from {4} primary ({1}). Replicating for maps: {2}
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1542.explanation=A primary shard started or restarted replicating to another primary.
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1542.useraction=No action is required.
     * </pre>
     */
    public String FOREIGN_PRIMARY_REPLICATING_CWOBJ1542 = "FOREIGN_PRIMARY_REPLICATING_CWOBJ1542";

    /**
     * <pre>
     * # {0} replica type
     * # {1} replica name
     * # {2} map names
     * # {3} primary container name
     * REPLICA_REPLICATING_CWOBJ1543=CWOBJ1543I: The {0} {1} started or continued replicating from the primary on {3}. Replicating for maps: {2}
     * REPLICA_REPLICATING_CWOBJ1543.explanation=A replica shard started or restarted replicating.
     * REPLICA_REPLICATING_CWOBJ1543.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_REPLICATING_CWOBJ1543 = "REPLICA_REPLICATING_CWOBJ1543";

    /**
     * <pre>
     * # {0} primary name
     * # {1} remote primary container name
     * # {2} type of primary (ie foreign, domestic)
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1544=CWOBJ1544I: Primary {0} stopped replicating from {2} primary ({1}).
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1544.explanation=A primary shard stopped replicating from another primary.
     * FOREIGN_PRIMARY_REPLICATING_CWOBJ1544.useraction=No action is required.
     * * </pre>
     */
    public String FOREIGN_PRIMARY_REPLICATING_CWOBJ1544 = "FOREIGN_PRIMARY_REPLICATING_CWOBJ1544";

    /**
     * <pre>
     * # {0} Shard identity
     * # {1} type of replica
     * # {2} remote container
     * REPLICA_NOT_PLACED_CWOBJ1545=CWOBJ1545W: Primary {0} could not place a ({1}) at this time on {2}. The remote container did not respond or returned an error.
     * REPLICA_NOT_PLACED_CWOBJ1545.explanation=The primary shard attempted to add a replica on a remote container. Either the remote container was not running or the remote container returned an error creating a replica shard.
     * REPLICA_NOT_PLACED_CWOBJ1545.useraction=Verify that the remote container listed in the message is running. If the container stopped or failed while the primary attempted to place a replica on it, another placement event should occure. If the replica shard is not automatically replaced, placement of the shard can be intiated by using the triggerPlacement method on the PlacementServiceMBean Mbean.
     * </pre>
     */
    public String REPLICA_NOT_PLACED_CWOBJ1545 = "REPLICA_NOT_PLACED_CWOBJ1545";

    /**
     * <pre>
     * # {0} Shard identity
     * # {1} remote domain and container
     * # {2} type of primary (ie foreign, domestic)
     * FOREIGN_PRIMARY_NOT_ADDED_CWOBJ1546=CWOBJ1546W: Primary {0} could not initiate replication to a {2} primary on {1}. The remote container did not respond or returned an error.
     * FOREIGN_PRIMARY_NOT_ADDED_CWOBJ1546.explanation=The primary shard attempted to start replication with a another primary. Either the remote container was not running or the remote container returned an error instead of a reference to the other primary shard.
     * FOREIGN_PRIMARY_NOT_ADDED_CWOBJ1546.useraction=Verify that the remote container listed in the message is running. If the container stopped or failed while the primary attempted to contact it, another placement event should occur. If there was an error on the remote container, the JVM logs should container the message key CWOBJ1209E.
     * </pre>
     */
    public String FOREIGN_PRIMARY_NOT_ADDED_CWOBJ1546 = "FOREIGN_PRIMARY_NOT_ADDED_CWOBJ1546";

    /**
     * <pre>
     *
     * # {0} shard name
     * # {1} NLS Constant type of shard ("synchronous replica", "primary")
     * # {2} NLS Constant type of replica ("synchronous replica", "asynchronous replica", "inactive")
     * SHARD_DEMOTION_CWOBJ1547=CWOBJ1547I: {0} (demoting {1} to {2}) in transition.
     * SHARD_DEMOTION_CWOBJ1547.explanation=Specified shard is in a transitional state. The message indicates the state of the shard and the state the shard will become after transition completes. There will likely be an additional message printed later in the log indicating the new state of the shard.
     * SHARD_DEMOTION_CWOBJ1547.useraction=No action is required.
     * </pre>
     */
    public String SHARD_DEMOTION_CWOBJ1547 = "SHARD_DEMOTION_CWOBJ1547";

    /**
     * <pre>
     * # {0} replica name
     * # {1} primary container name
     * ENTERING_PEER_MODE_CWOBJ1548=CWOBJ1548W: Replica {0} failed to peer mode, replication failed from primary on {1}.
     * ENTERING_PEER_MODE_CWOBJ1548.explanation=This is an informational message on how long it took for a replica to enter peer mode where both primary and replica have the same data.
     * ENTERING_PEER_MODE_CWOBJ1548.useraction=No action is required.
     * </pre>
     */
    public String ENTERING_PEER_MODE_CWOBJ1548 = "ENTERING_PEER_MODE_CWOBJ1548";

    /**
     * </pre
     * # {0} transitioning primary (temp replica)
     * # {1} old primary container name
     * # {2} type of replica to pull data from
     * # {3} replica container name
     * COPY_FROM_REPLICA_CWOBJ1549=CWOBJ1549I: Transitioning primary {0} failed to finish copying data from the previous primary on {1}. Attempt replication from existing {2} replica on {3}.
     * COPY_FROM_REPLICA_CWOBJ1549.explanation=A new primary attempted to replicate data from the previous primary, but could not finish. To recover, the new primary will copy data from an existing replica.
     * COPY_FROM_REPLICA_CWOBJ1549.useraction=No action is required.
     * </pre>
     */
    public String COPY_FROM_REPLICA_CWOBJ1549 = "COPY_FROM_REPLICA_CWOBJ1549";

    /**
     * </pre
     * # {0} shard name
     * # {1} NLS Constant type of shard ("synchronous replica", "primary")
     * # {2} primary container name
     * # {3} exception received from primary
     * ERROR_REPLICATING_FROM_PRIMARY_CWOBJ1550=CWOBJ1550W: {0} {1} received several exceptions while replicating from the primary on {2}. The {1} will continue to poll the primary. Exception received: {3}
     * ERROR_REPLICATING_FROM_PRIMARY_CWOBJ1550.explanation=The replica or foreign primary shard received several of the same exceptions from the primary. Replication will continue until the shard is successful or stopped.
     * ERROR_REPLICATING_FROM_PRIMARY_CWOBJ1550.useraction=Check the shard's JVM logs for a later message that states the replica recovered. Or use xsadmin to review the mapsizes or revisions to see if the shard recovered and matches the primary. If the errors continue, review the exception printed to the JVM log or in the FFDC logs.
     * </pre>
     */
    public String ERROR_REPLICATING_FROM_PRIMARY_CWOBJ1550 = "ERROR_REPLICATING_FROM_PRIMARY_CWOBJ1550";

    /**
     * <pre>
     * # {0} shard name
     * # {1} NLS Constant type of shard ("synchronous replica", "primary")
     * # {2} primary container name
     * RECOVERED_REPLICATING_FROM_PRIMARY_CWOBJ1551=CWOBJ1551I: {0} {1} successfully recovered and replicated after several exceptions from the primary on {2}.
     * RECOVERED_REPLICATING_FROM_PRIMARY_CWOBJ1551.explanation=The replica or foreign primary shard was able to start replicating successfully from the primary again after a period of several exceptions from the primary.
     * RECOVERED_REPLICATING_FROM_PRIMARY_CWOBJ1551.useraction=Review the exception previously printed in the JVM or ffdc log. Otherwise, no action is required.
     * </pre>
     */
    public String RECOVERED_REPLICATING_FROM_PRIMARY_CWOBJ1551 = "RECOVERED_REPLICATING_FROM_PRIMARY_CWOBJ1551";

    /**
     * <pre>
     * # {0} replica type
     * # {1} replica name
     * # {2} map names
     * # {3} primary container name
     * REPLICA_NOT_REPLICATING_CWOBJ1552=CWOBJ1552W: The {0} {1} could not start replicating from the primary on {3}. Could not replicate for maps: {2}
     * REPLICA_NOT_REPLICATING_CWOBJ1552.explanation=A replica shard was not able to start replication for the listed maps.
     * REPLICA_NOT_REPLICATING_CWOBJ1552.useraction=Review the JVM logs for additional shard replication or shard stoppnig messages. If the shard is not stopping, also review the FFDC logs for additional exceptions.
     * </pre>
     */
    public String REPLICA_NOT_REPLICATING_CWOBJ1552 = "REPLICA_NOT_REPLICATING_CWOBJ1552";

    /**
     * <pre>
     * # {0} replication idle level
     * # {1} replication idle level, integer setting
     * REPLICA_IDLE_TIME_CWOBJ1553=CWOBJ1553I: The maximum replication idle level is set to {0} ({1}).
     * REPLICA_IDLE_TIME_CWOBJ1553.explanation=The setting for the maximum replication idle time.
     * REPLICA_IDLE_TIME_CWOBJ1553.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_IDLE_TIME_CWOBJ1553 = "REPLICA_IDLE_TIME_CWOBJ1553";

    /**
     * <pre>
     * # {0} Invalid value
     * # {1} Valid options
     * REPLICATION_IDLE_INCORRECT_CWOBJ1554=CWOBJ1554E: The replication idle level was set to an invalid value of {0}. Valid levels are {1}.
     * REPLICATION_IDLE_INCORRECT_CWOBJ1554.explanation=The replication idle level was set to an invalid value. A default value will be used instead.
     * REPLICATION_IDLE_INCORRECT_CWOBJ1554.useraction=Correct the replication idle level in the server properties file and restart the server.
     * </pre>
     */
    public String REPLICATION_IDLE_INCORRECT_CWOBJ1554 = "REPLICATION_IDLE_INCORRECT_CWOBJ1554";

    /**
     * <pre>
     * # {0} replica type
     * # {1} replica name
     * # {2} primary container name
     * # {3} Exception
     * REPLICA_INITIALIZATION_FAIL_CWOBJ1555=CWOBJ1555E: The {0} ({1}) shard failed to initialize. The shard was added by a primary shard on the {2} primary container. The initialization exception is {3}
     * REPLICA_INITIALIZATION_FAIL_CWOBJ1555.explanation=A replica shard was placed on the container server, but there was an error initializing the shard and the shard cannot be started succesfully.
     * REPLICA_INITIALIZATION_FAIL_CWOBJ1555.useraction=The failed replica will be stopped and primary shard for the partition will notify the catalog server that the replica could not be placed. The replica will be placed again if shards are rebalanced, such as a container stopping or starting, or when the triggerPlacement command is used on the administrative tools.
     * </pre>
     */
    public String REPLICA_INITIALIZATION_FAIL_CWOBJ1555 = "REPLICA_INITIALIZATION_FAIL_CWOBJ1555";

    /**
     * <pre>
     * # {0} replica type
     * # {1} replica name
     * # {2} primary container name
     * REPLICA_ORPHANED_CWOBJ1556=CWOBJ1556I: The {0} ({1}) shard is orphaned and does not have a valid primary shard. The last primary shard for this {0} shard is on {2} primary container. This shard will be stopped.
     * REPLICA_ORPHANED_CWOBJ1556.explanation=A replica shard removal was missed. The removal was likely missed when the primary shard for this shard was terminated before completing the removal work. The replica shard completes its own cleanup when it no longer has a valid primary shard.
     * REPLICA_ORPHANED_CWOBJ1556.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_ORPHANED_CWOBJ1556 = "REPLICA_ORPHANED_CWOBJ1556";

    /**
     * <pre>
     * # {0} replica type
     * # {1} replica name
     * # {2} old primary container name
     * # {3} current primary container name
     * REPLICA_RECEIVED_OLD_PRIMARY_TRAN_CWOBJ1557=CWOBJ1557W: The {0} ({1}) shard received a transaction from a primary shard on the {2} primary container. The current primary shard is on the {3} primary container. The primary on the {2} primary container is an old primary and should be stopped.
     * REPLICA_RECEIVED_OLD_PRIMARY_TRAN_CWOBJ1557.explanation=The shard received a transaction from a primary shard that is not the current primary shard. A re-register action may take place if an exception occurs on the replica. The old primary shard is delayed stopping or the new primary was unable to contact it to stop it.
     * REPLICA_RECEIVED_OLD_PRIMARY_TRAN_CWOBJ1557.useraction=Verify the old primary on the listed container is stopped. If the replica shard performs a re-register, verify that the maps for the shard entered peer mode successfully.
     * </pre>
     */
    public String REPLICA_RECEIVED_OLD_PRIMARY_TRAN_CWOBJ1557 = "REPLICA_RECEIVED_OLD_PRIMARY_TRAN_CWOBJ1557";

    /**
     * <pre>
     * # {0} shard type
     * # {1} shard identity
     * # {2} exception
     * PRIMARY_FAILED_ACTIVATION_CWOBJ1558=CWOBJ1558E: The {0} ({1}) shard failed to activate. The exception that occurred is {2}.
     * PRIMARY_FAILED_ACTIVATION_CWOBJ1558.explanation=The shard was not able to activate. Until the shard is moved, transactions that run against the shard will fail.
     * PRIMARY_FAILED_ACTIVATION_CWOBJ1558.useraction=If the shard is not stopped and moved automatically, use triggerPlacement on the administrative tool or restart the container.
     * </pre>
     */
    public String PRIMARY_FAILED_ACTIVATION_CWOBJ1558 = "PRIMARY_FAILED_ACTIVATION_CWOBJ1558";

    /**
     * <pre>
     * SCHEDULE_ROUTE_UPDATE_CWOBJ1559=CWOBJ1559I: The route update for partition {0} is scheduled for transfer to the catalog server.
     * SCHEDULE_ROUTE_UPDATE_CWOBJ1559.explanation=As part of processing placement work from the catalog server, routing updates for the partition placed in this container are being scheduled for transfer to the catalog server.
     * SCHEDULE_ROUTE_UPDATE_CWOBJ1559.useraction=No action necessary.
     * </pre>
     */
    public String SCHEDULE_ROUTE_UPDATE_CWOBJ1559 = "SCHEDULE_ROUTE_UPDATE_CWOBJ1559";

    /**
     * <pre>
     * ROUTE_UPDATE_SENT_CWOBJ1560=CWOBJ1560I: The next set of routing updates transfer has been sent to the catalog server.
     * ROUTE_UPDATE_SENT_CWOBJ1560.explanation=As part of processing placement work from the catalog server, routing updates for partitions recently placed in this container have been transferred to the catalog server.
     * ROUTE_UPDATE_SENT_CWOBJ1560.useraction=No action necessary.
     * </pre>
     */
    public String ROUTE_UPDATE_SENT_CWOBJ1560 = "ROUTE_UPDATE_SENT_CWOBJ1560";

    /**
     * <pre>
        ROUTE_TRANSFERS_TO_CLIENT_START_CWOBJ1561=CWOBJ1561I:  The transferring of routing updates directly to eXtreme Scale clients will start.
        ROUTE_TRANSFERS_TO_CLIENT_START_CWOBJ1561.explanation=As client requests come in during this time period, if a particular client has not received the latest routing updates from this process, it will do so as part of the response to its next request.
        ROUTE_TRANSFERS_TO_CLIENT_START_CWOBJ1561.useraction=No action necessary.
     * </pre>
     */

    public String ROUTE_TRANSFERS_TO_CLIENT_START_CWOBJ1561 = "ROUTE_TRANSFERS_TO_CLIENT_START_CWOBJ1561";

    /**
     * <pre>
        ROUTE_TRANSFERS_TO_CLIENT_STOP_CWOBJ1562=CWOBJ1562I:  The transferring of routing updates directly to eXtreme Scale clients will stop.
        ROUTE_TRANSFERS_TO_CLIENT_STOP_CWOBJ1562.explanation=This process will stop including routing updates in responses to clients until the next change in routing information.
        ROUTE_TRANSFERS_TO_CLIENT_STOP_CWOBJ1562.useraction=No action necessary.
     * </pre>
     */

    public String ROUTE_TRANSFERS_TO_CLIENT_STOP_CWOBJ1562 = "ROUTE_TRANSFERS_TO_CLIENT_STOP_CWOBJ1562";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} foreign primary container
     * # {2} container version
     * XM_HOSTPORT_FOREIGN_PRIMARY_CWOBJ1563=CWOBJ1563E: The {0} primary shard failed could not parse the host name and port for the foreign primary on the {1} container. The local primary shard version is {2}.
     * XM_HOSTPORT_FOREIGN_PRIMARY_CWOBJ1563.explanation=There was an error parsing the hostname and the port for the foreign primary shard. Replication between primaries cannot be started.
     * XM_HOSTPORT_FOREIGN_PRIMARY_CWOBJ1563.useraction=Review the eXtremeMemory configuration including the port settings used for eXtremeMemory.
     * </pre>
     */
    public String XM_HOSTPORT_FOREIGN_PRIMARY_CWOBJ1563 = "XM_HOSTPORT_FOREIGN_PRIMARY_CWOBJ1563";

    /**
     * <pre>
     * Replication monitoring warning.
     * # {0} container name
     * REPLICATION_QUEUE_INCREASE_LOCAL_INBOUND_CWOBJ1564=CWOBJ1564W: The inbound queue of primary-replica replication has increased for container {0}.
     * REPLICATION_QUEUE_INCREASE_LOCAL_INBOUND_CWOBJ1564.explanation=The replication of incoming data changes for replica shards hosted by the container falls behind.
     * REPLICATION_QUEUE_INCREASE_LOCAL_INBOUND_CWOBJ1564.useraction=Please check if there is no degradation in network connection between container hosting primay shards and container hosting replica shards.
     * </pre>
     */
    public String REPLICATION_QUEUE_INCREASE_LOCAL_INBOUND_CWOBJ1564 = "REPLICATION_QUEUE_INCREASE_LOCAL_INBOUND_CWOBJ1564";

    /**
     * <pre>
     * Replication monitoring warning.
     * # {0} container name
     * # {1} domain name
     * REPLICATION_QUEUE_INCREASE_REMOTE_INBOUND_CWOBJ1565=CWOBJ1565W: The inbound queue of remote replication has increased for container {0} in domain {1}.
     * REPLICATION_QUEUE_INCREASE_REMOTE_INBOUND_CWOBJ1565.explanation=The replication of incoming data changes for local primary shards hosted by the container falls behind.
     * REPLICATION_QUEUE_INCREASE_REMOTE_INBOUND_CWOBJ1565.useraction=Please check if there is no degradation in network connection between local grid and remote grid.
     * </pre>
     */
    public String REPLICATION_QUEUE_INCREASE_REMOTE_INBOUND_CWOBJ1565 = "REPLICATION_QUEUE_INCREASE_REMOTE_INBOUND_CWOBJ1565";

    /**
     * <pre>
     * Replication monitoring warning.
     * # {0} container name
     * REPLICATION_QUEUE_INCREASE_LOCAL_OUTBOUND_CWOBJ1566=CWOBJ1566W: The outbound queue of primary-replica replication has increased for container {0}.
     * REPLICATION_QUEUE_INCREASE_LOCAL_OUTBOUND_CWOBJ1566.explanation=The replication of outgoing data changes from primary shards hosted by the container falls behind.
     * REPLICATION_QUEUE_INCREASE_LOCAL_OUTBOUND_CWOBJ1566.useraction=Please check if there is no degradation in network connection between container hosting primay shards and container hosting replica shards.
     * </pre>
     */
    public String REPLICATION_QUEUE_INCREASE_LOCAL_OUTBOUND_CWOBJ1566 = "REPLICATION_QUEUE_INCREASE_LOCAL_OUTBOUND_CWOBJ1566";

    /**
     * <pre>
     * Replication monitoring warning.
     * # {0} container name
     * # {1} domain name
     * REPLICATION_QUEUE_INCREASE_REMOTE_OUTBOUND_CWOBJ1567=CWOBJ1567W: The outbound queue of remote replication has increased for container {0} in domain {1}. 
     * REPLICATION_QUEUE_INCREASE_REMOTE_OUTBOUND_CWOBJ1567.explanation=The replication of outgoing data changes from primary shards hosted by the container falls behind.
     * REPLICATION_QUEUE_INCREASE_REMOTE_OUTBOUND_CWOBJ1567.useraction=Please check if there is no degradation in network connection between local grid and remote grid.
     * </pre>
     */
    public String REPLICATION_QUEUE_INCREASE_REMOTE_OUTBOUND_CWOBJ1567 = "REPLICATION_QUEUE_INCREASE_REMOTE_OUTBOUND_CWOBJ1567";

    /**
     * <pre>
     * # {0} shard identity
     * DISCARD_EMPTY_PRIMARY_CWOBJ1568=CWOBJ1568I: Primary {0} was empty after shard promotion. The ObjectGrid, {1}, uses a per container placement strategy and the empty primary shard is discarded.
     * DISCARD_EMPTY_PRIMARY_CWOBJ1568.explantion=A primary shard was promoted after a shard movement event. The primary shard's grid definition includes the per container placement strategy and the size of the primary shard is checked after a promotion. If the shard is empty, it will be discarded.
     * DISCARD_EMPTY_PRIMARY_CWOBJ1568.useraction=No action is required. Clients will use primary shards placed on current and new servers. See the articles "Placement and partitions" and "SessionHandle for routing" in the WebSphere eXtreme Scale Information center for more information about using the per container placement strategy.
     * </pre>
     */
    public String DISCARD_EMPTY_PRIMARY_CWOBJ1568 = "DISCARD_EMPTY_PRIMARY_CWOBJ1568";

    public String JPG_NEEDS_RETRY_CWOBJ1569 = "JPG_NEEDS_RETRY_CWOBJ1569";

    public String JPG_NEEDS_RETRY_WORKED_CWOBJ1570 = "JPG_NEEDS_RETRY_WORKED_CWOBJ1570";

    public String JPG_NEEDS_RETRY_FAILED_CWOBJ1571 = "JPG_NEEDS_RETRY_FAILED_CWOBJ1571";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} server for the primary shard
     * SYNC_NO_PEER_MODE_PROMOTE_CWOBJ1572=CWOBJ1572W: {0} (synchronous replica) was not able to enter peer mode with the previous primary on server {1} before promotion to primary.
     * SYNC_NO_PEER_MODE_PROMOTE_CWOBJ1572.explanation=Before a replica shard promotes to primary, the replica checks that if it is in sync with the existing primary. If the primary is still running, the replica will copy over any missing data before promoting to the new primary. If a sync replica shard is in peer mode, it has all of the existing data from the primary shard.
     * SYNC_NO_PEER_MODE_PROMOTE_CWOBJ1572.useraction=The previous primary stopped running before the sync replica could enter peer mode. Review the JVM logs for the previous primary listed in the message. The sync replica will complete the primary promotion request.
     * </pre>
     */
    public String SYNC_NO_PEER_MODE_PROMOTE_CWOBJ1572 = "SYNC_NO_PEER_MODE_PROMOTE_CWOBJ1572";

    public String NO_DATA_FROM_OLD_PRI_CWOBJ1573 = "NO_DATA_FROM_OLD_PRI_CWOBJ1573";

    /**
     * <pre>
     * # {0} Shard Identity
     * # {1} shard type
     * # {2} thread name
     * # {3} timeout
     * LONG_OG_ACTIVATION_CWOBJ1574=CWOBJ1574I: The activation of {0} ({1}) on thread {2} processed longer than {3} seconds. Activation of the shard continues.
     * LONG_OG_ACTIVATION_CWOBJ1574.explanation=The activation phase of a shard took several seconds. If the activation completes successfully, a CWOBJ1511 message will appear for the same shard.
     * LONG_OG_ACTIVATION_CWOBJ1574.useraction=To debug possible hung thread scenarios, use the JVM argument, com.ibm.websphere.xs.ProduceJavaCoreOnObjectGridActivateTimeout=true, to create java cores when the activation phase runs for a long time.
     * </pre>
     */
    public String LONG_OG_ACTIVATION_CWOBJ1574 = "LONG_OG_ACTIVATION_CWOBJ1574";

    /**
     * <pre>
     * # {0} type of action, demotion, stopped
     * # {1} shard name
     * # {2} container name
     * SHARD_REQUEST_FROM_CWOBJ1575I=CWOBJ1575I: Request to {0} for partition {1} originated from container {2}.
     * SHARD_REQUEST_FROM_CWOBJ1575I.explanation=Lists the container that instructed the local shard to do a demotion.
     * SHARD_REQUEST_FROM_CWOBJ1575I.useraction=No action is required.
     * </pre>
     */
    public String SHARD_REQUEST_FROM_CWOBJ1575I = "SHARD_REQUEST_FROM_CWOBJ1575I";

    /**
     * <pre>
     * # {0} Shard identity
     * # {1} type of action, stopped added
     * # {2} type of replica
     * # {3} remote container
     * REPLICA_PLACED_CWOBJ1576I=CWOBJ1576I: Primary {0} {1} a {2} shard on container server {3}.
     * REPLICA_PLACED_CWOBJ1576I.explanation=The primary shard successfully completed an action for a replica on the listed server.
     * REPLICA_PLACED_CWOBJ1576I.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_PLACED_CWOBJ1576I = "REPLICA_PLACED_CWOBJ1576I";

    /**
     * <pre>
     * # {0} Shard identity
     * # {1} remote container
     * OLD_PRIMARY_STOPPED_CWOBJ1577I=CWOBJ1577I: {0} stopped the previous primary on container server {1}.
     * OLD_PRIMARY_STOPPED_CWOBJ1577I.explanation=The primary shard successfully stopped the prior primary shard.
     * OLD_PRIMARY_STOPPED_CWOBJ1577I.useraction=No action is required.
     * </pre>
     */
    public String OLD_PRIMARY_STOPPED_CWOBJ1577I = "OLD_PRIMARY_STOPPED_CWOBJ1577I";

    /**
     * <pre>
     * # {0} Shard identity
     * # {1} type of replica
     * # {2} remote container
     * REPLICA_PLACED_PEER_CWOBJ1578I=CWOBJ1578I: Primary {0} put a {1} shard on container server {2} into peer mode.
     * REPLICA_PLACED_PEER_CWOBJ1578I.explanation=The primary shard successfully put a replica into peer mode.
     * REPLICA_PLACED_PEER_CWOBJ1578I.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_PLACED_PEER_CWOBJ1578I = "REPLICA_PLACED_PEER_CWOBJ1578I";
    
    /**
     * <pre>
     * # {0} Shard identity
     * # {1} type of replica
     * # {2} remote container
     * REPLICA_NOT_PLACED_TO_CWOBJ1579W=CWOBJ1579W: Primary {0} attempted to place a ({1}) on {2}. The remote container timed out before completing the task. Check {2} container server for confirmation of {1} creation.
     * REPLICA_NOT_PLACED_TO_CWOBJ1579W.explanation=The primary shard attempted to add a replica on a remote container. The primary shard received a timeout and could not confirm whether the replica completed successfully.
     * REPLICA_NOT_PLACED_TO_CWOBJ1579W.useraction=Verify that the remote container listed in the message is running. If the container stopped or failed while the primary attempted to place a replica on it, another placement event should occur. If the replica shard is not automatically replaced, placement of the shard can be intiated by using the triggerPlacement method on the PlacementServiceMBean Mbean. If there was an error on the remote container, the JVM logs should container the message key CWOBJ1209E.
     * </pre>
     */
    public String REPLICA_NOT_PLACED_TO_CWOBJ1579W = "REPLICA_NOT_PLACED_TO_CWOBJ1579W";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} host name of the removed replica
     * STALE_REPLICA_ROUTE_REMOVED_CWOBJ1580I=CWOBJ1580I: Primary {0} removed a stale replica shard from the route table entry. The removed replica shard was on host name {1}.
     * STALE_REPLICA_ROUTE_REMOVED_CWOBJ1580I.explanation=While refreshing the route table, the primary shard found a stale replica shard and removed it.
     * STALE_REPLICA_ROUTE_REMOVED_CWOBJ1580I.useraction=No action is required.
     * </pre>
     */
    public String STALE_REPLICA_ROUTE_REMOVED_CWOBJ1580I = "STALE_REPLICA_ROUTE_REMOVED_CWOBJ1580I";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} host name of the removed replica
     * REPLICA_ROUTE_ADDED_CWOBJ1581I=CWOBJ1581I: Primary {0} added a replica shard to the route table entry. The removed replica shard was on host name {1}.
     * REPLICA_ROUTE_ADDED_CWOBJ1581I.explanation=While refreshing the route table, the primary shard found a missing replica shard and added it.
     * REPLICA_ROUTE_ADDED_CWOBJ1581I.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_ROUTE_ADDED_CWOBJ1581I = "REPLICA_ROUTE_ADDED_CWOBJ1581I";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} shard type
     * REMOVED_EXTRA_SHARD_CWOBJ1582I=CWOBJ1582I: {0} ({1}) is an extra shard and is removed.
     * REMOVED_EXTRA_SHARD_CWOBJ1582I.explanation=The listed shard was identified as an extra or stale shard and is removed from the container server.
     * REMOVED_EXTRA_SHARD_CWOBJ1582I.useraction=No action is required.
     * </pre>
     */
    public String REMOVED_EXTRA_SHARD_CWOBJ1582I = "REMOVED_EXTRA_SHARD_CWOBJ1582I";

    /**
     * <pre>
     * # {0} name of thread
     * # Do not translated BalanceGrid
     * STOPPING_ROUTETABLE_THREAD_CWOBJ1583I=CWOBJ1583I: The {0} thread detected that the BalanceGrid was destroyed. Stopping the {0} thread.
     * STOPPING_ROUTETABLE_THREAD_CWOBJ1583I.explanation=An internal thread received exceptions that indicate the catalog service process stopped or exited. The listed thread ended.
     * STOPPING_ROUTETABLE_THREAD_CWOBJ1583I.useraction=If the catalog service stopped or ended, no action is required. Restart the process running the catalog service.
     * </pre>
     */
    public String STOPPING_ROUTETABLE_THREAD_CWOBJ1583I = "STOPPING_ROUTETABLE_THREAD_CWOBJ1583I";

    public String RESENDING_ROUTES_TO_CATALOG_CLUSTER_CWOBJ1584I = "RESENDING_ROUTES_TO_CATALOG_CLUSTER_CWOBJ1584I";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} shard type
     * # {2} container name of previous primary shard
     * # {3} shard type of previous primary shard
     * # {4} time in milliseconds
     * PRIOR_PRIMARY_IN_PROGRESS_CWOBJ1585I=CWOBJ1585I: {0} ({1}) is promoting to primary. The previous primary on {2} reports as type {3} and indicates it is still promoting to primary. Promotion is delayed until the previous primary transition completes or the timeout expires. Current timeout is {4} milliseconds.
     * PRIOR_PRIMARY_IN_PROGRESS_CWOBJ1585I.explanation=A new primary is promoting but the previous primary is still in transition. This shard tries to wait for the prior transition to finish.
     * PRIOR_PRIMARY_IN_PROGRESS_CWOBJ1585I.useraction=If the transition is successful, a CWOBJ1532 and CWOBJ1511 message prints to the log. If this message occurs a lot during server restarts, consolidate placement events using the xscmd suspendBalancing and resumeBalancing options.
     * </pre>
     */
    public String PRIOR_PRIMARY_IN_PROGRESS_CWOBJ1585I = "PRIOR_PRIMARY_IN_PROGRESS_CWOBJ1585I";
    
    /**
     * <pre>
     * # {0} shard identity
     * # {1} container name of new primary
     * # {2} container name of previous primary
     * # {3} time in seconds
     * # {4} exception
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1586I=CWOBJ1586I: The new primary shard {0} on {1} attempted to contact the previous primary shard on {2}, but the response timed out. The previous primary shard could still be running. Another stop request is scheduled in {3} seconds. The exception recevied was {4}.
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1586I.explanation=The new primary shard tried to stop the previous primary shard, but received an exception. The request to stop the previous primary retries.
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1586I.useraction=Review the container logs for the previous primary shard. If the server is down, no additional action is required. Otherwise, check the server for resource contention such as high CPU or long garbage collection. Ensure network communication is avaiable. Check for additional CWOBJ messages for the list shard.
     * </pre>
     */
    public String OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1586I = "OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1586I";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} container name of new primary
     * # {2} container name of previous primary
     * OLD_PRIMARY_SHARD_STOPPED_ON_RETRY_CWOBJ1587I=CWOBJ1587I: The new primary shard {0} on {1} successfully stopped the previous primary shard on {2} after the previous attempt failed.
     * OLD_PRIMARY_SHARD_STOPPED_ON_RETRY_CWOBJ1587I.explanation=The new primary shard stopped the previous primary shard.
     * OLD_PRIMARY_SHARD_STOPPED_ON_RETRY_CWOBJ1587I.useraction=No action is required.
     * </pre>
     */
    public String OLD_PRIMARY_SHARD_STOPPED_ON_RETRY_CWOBJ1587I = "OLD_PRIMARY_SHARD_STOPPED_ON_RETRY_CWOBJ1587I";
    
    /**
     * <pre>
     * # {0} shard identity
     * # {1} container name of new primary
     * # {2} container name of previous primary
     * # {3} exception
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1588I=CWOBJ1588I: The new primary shard {0} on {1} attempted to contact the previous primary shard on {2}, but the response timed out. The previous primary shard could still be running. The stop request is not tried again. The exception recevied was {3}.
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1588I.explanation=The new primary shard tried to stop the previous primary shard, but received an exception.
     * OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1588I.useraction=Use the xscmd command showMapSizes to check if a primary shard for the listed partition is still running on the container listed for the old primary. To remove the duplicate primary shard, run xscmd command triggerPlacement with the -remoteExtra option.
     * </pre> 
     */
    public String OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1588I = "OLD_PRIMARY_SHARD_NOT_STOPPED_CWOBJ1588I";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} container name of new primary
     * # {2} container name of previous primary
     * # {3} exception
     * ABDICATE_REQUEST_REJECTED_CWOBJ1591I=CWOBJ1591I: The shard {0} on {1} attempted to stop the previous primary shard on {2} to process a primary promotion, but the request was rejected. This primary shard does not promote. The rejection exception is {3}.
     * ABDICATE_REQUEST_REJECTED_CWOBJ1591I.explanation=A shard attempted to promote. The request to stop the previous primary shard was rejected. The current shard cancels the promotion. Usually this occurs when multiple placement actions happen either from either rapid server restarts or repeated network issues. Some placement work is delayed and runs concurrently or after newer work.
     * ABDICATE_REQUEST_REJECTED_CWOBJ1591I.useraction=If server restarts or network issues recently occurred, this is an expected message and no action is required. Otherwise, review the exception. To run placement work again, use the triggerPlacement xscmd command.
     */
    public String ABDICATE_REQUEST_REJECTED_CWOBJ1591I = "ABDICATE_REQUEST_REJECTED_CWOBJ1591I";

    /**
     * <pre>
     * # {0} Port
     * # Do not translate ManagementGateway
     * GATEWAY_STARTED_CWOBJ1600=CWOBJ1600I: ManagementGateway service started on port ({0}).
     * GATEWAY_STARTED_CWOBJ1600.explanation=ManagementGateway service is ready to process requests.
     * GATEWAY_STARTED_CWOBJ1600.useraction=ManagementGateway service is available.
     * </pre>
     */
    public String GATEWAY_STARTED_CWOBJ1600 = "GATEWAY_STARTED_CWOBJ1600";

    /**
     * <pre>
     * # {0} Port
     * # Do not translate ManagementGateway
     * GATEWAY_SERVICE_FAILED_CWOBJ1601=CWOBJ1601E: ManagementGateway service failed to start on port ({0}).
     * GATEWAY_SERVICE_FAILED_CWOBJ1601.explanation=ManagementGateway service failed to start.
     * GATEWAY_SERVICE_FAILED_CWOBJ1601.useraction=Ensure specified port is not already in use.
     * </pre>
     */
    public String GATEWAY_SERVICE_FAILED_CWOBJ1601 = "GATEWAY_SERVICE_FAILED_CWOBJ1601";

    /**
     * <pre>
     * # {0} host
     * # {1} port
     * # Do not translate ManagementGateway
     * GATEWAY_CLIENT_CONNECT_FAILED_CWOBJ1602=CWOBJ1602E: ManagementGateway service failed to connect to server at ({0}):({1}).
     * GATEWAY_CLIENT_CONNECT_FAILED_CWOBJ1602.explanation=ManagementGateway service failed to connect to server.
     * GATEWAY_CLIENT_CONNECT_FAILED_CWOBJ1602.useraction=Ensure server is running.
     * </pre>
     */
    public String GATEWAY_CLIENT_CONNECT_FAILED_CWOBJ1602 = "GATEWAY_CLIENT_CONNECT_FAILED_CWOBJ1602";

    /**
     * <pre>
     * # {0} request
     * # {1) exception
     * MANAGEMENT_SERVICE_RESPONSE_FAILED_CWOBJ1603=CWOBJ1603E: Management service failed to respond to ({0}) remote request: {1}.
     * MANAGEMENT_SERVICE_RESPONSE_FAILED_CWOBJ1603.explanation=The request failed due to the exception listed in the error message.
     * MANAGEMENT_SERVICE_RESPONSE_FAILED_CWOBJ1603.useraction=Review the exception returned. If there is a configuration problem, correct it and retry the request. Review the troubleshooting section in the WebSphere eXtreme Scale Infocenter documentation.
     * </pre>
     */
    public String MANAGEMENT_SERVICE_RESPONSE_FAILED_CWOBJ1603 = "MANAGEMENT_SERVICE_RESPONSE_FAILED_CWOBJ1603";

    /**
     * <pre>
     * # Static configuration
     * # {0} throwable
     * # Do not translate ManagementGateway
     * MANAGEMENT_GATEWAY_STOP_FAILED_CWOBJ1604=CWOBJ1604I: ManagementGateway service failed to stop connector due to Throwable {0}. Exiting.
     * MANAGEMENT_GATEWAY_STOP_FAILED_CWOBJ1604.explanation=ManagementGateway service failed to stop connector.
     * MANAGEMENT_GATEWAY_STOP_FAILED_CWOBJ1604.useraction=Verify that the eXtreme Scale configuration is still running. If security is enabled, provide the correct security credentials.
     * </pre>
     */
    public String MANAGEMENT_GATEWAY_STOP_FAILED_CWOBJ1604 = "MANAGEMENT_GATEWAY_STOP_FAILED_CWOBJ1604";

    /**
     * <pre>
    * # Static configuration
    * # {0} throwable
    * # Do not translate ManagementGateway
    * MANAGEMENT_GATEWAY_REFRESH_FAILED_CWOBJ1605=CWOBJ1605I: ManagementGateway caught Throwable {0} while refreshing attributes. Exiting.
    * MANAGEMENT_GATEWAY_REFRESH_FAILED_CWOBJ1605.explanation=ManagementGateway service failed while refreshing attributes.
    * MANAGEMENT_GATEWAY_REFRESH_FAILED_CWOBJ1605.useraction=Verify that the eXtreme Scale configuration is still running. If security is enabled, provide the correct security credentials.
    * </pre>
     */
    public String MANAGEMENT_GATEWAY_REFRESH_FAILED_CWOBJ1605 = "MANAGEMENT_GATEWAY_REFRESH_FAILED_CWOBJ1605";

    /**
     * <pre>
     * # Static configuration
     * # {0} method
     * # {1} server name
     * NO_RESPONSE_FROM_SERVER_CWOBJ1606=CWOBJ1606I: {0} - Unable to get response from server {1}. Returning false.
     * NO_RESPONSE_FROM_SERVER_CWOBJ1606.explanation=Unable to get response from server while attempting to stop.
     * NO_RESPONSE_FROM_SERVER_CWOBJ1606.useraction=Verify that the eXtreme Scale configuration is still running. If security is enabled, provide the correct security credentials. Attempt to stop again or manually stop the servers.
     * </pre>
     */
    public String NO_RESPONSE_FROM_SERVER_CWOBJ1606 = "NO_RESPONSE_FROM_SERVER_CWOBJ1606";

    /**
     * <pre>
     * # {0} method
     * # {1} server name
     * # Do not translate WSADMIN
     * USE_WSADMIN_CWOBJ1607=CWOBJ1607I: {0} - When an ObjectGrid server is colocated with a WebSphere Application Server, use WSADMIN to stop server {1}. Returning false.
     * USE_WSADMIN_CWOBJ1607.explanation=When in a WebSphere Application Server environment, use WSADMIN to stop server.
     * USE_WSADMIN_CWOBJ1607.useraction=When in WebSphere Application Server environment, use WSADMIN to stop server.
     * </pre>
     */
    public String USE_WSADMIN_CWOBJ1607 = "USE_WSADMIN_CWOBJ1607";

    /**
     * <pre>
    * # {0} method
    * # {1} server name
    * SERVER_NOT_RESPONDING_NULL_CWOBJ1608=CWOBJ1608I: {0} - Unable to get response from server {1}. Ensure server is running. Returning null.
    * SERVER_NOT_RESPONDING_NULL_CWOBJ1608.explanation=Unable to get response from server.
    * SERVER_NOT_RESPONDING_NULL_CWOBJ1608.useraction=Wait several seconds and retry operation.
    * </pre>
     */
    public String SERVER_NOT_RESPONDING_NULL_CWOBJ1608 = "SERVER_NOT_RESPONDING_NULL_CWOBJ1608";

    /**
     * <pre>
     * # {0} method
     * NO_ROUTING_TABLE_CWOBJ1609=CWOBJ1609I: {0} - Unable to get routing table. Wait several seconds and retry operation. Returning null.
     * NO_ROUTING_TABLE_CWOBJ1609.explanation=Unable to get routing table.
     * NO_ROUTING_TABLE_CWOBJ1609.useraction=Wait several seconds and retry operation.
     * </pre>
     */
    public String NO_ROUTING_TABLE_CWOBJ1609 = "NO_ROUTING_TABLE_CWOBJ1609";

    /**
     * <pre>
     * # {0} replication group ID
     * RESET_NULL_CLUSTER_CWOBJ1610=CWOBJ1610W: Try to reset a null cluster for {0}.
     * RESET_NULL_CLUSTER_CWOBJ1610.explanation=Replication group cluster data are not available.
     * RESET_NULL_CLUSTER_CWOBJ1610.useraction=No action is required.
     * </pre>
     */
    public String RESET_NULL_CLUSTER_CWOBJ1610 = "RESET_NULL_CLUSTER_CWOBJ1610";

    /**
     * <pre>
     * # {0} credential
     * CREDENTIAL_EXPIRED_CWOBJ1615=CWOBJ1615E: The JMX credential has expired: {0}.
     * CREDENTIAL_EXPIRED_CWOBJ1615.explanation=The JMX credential has expired.
     * CREDENTIAL_EXPIRED_CWOBJ1615.useraction=Retry with new credential.
     * <pre>
     */
    public String CREDENTIAL_EXPIRED_CWOBJ1615 = "CREDENTIAL_EXPIRED_CWOBJ1615";

    /**
     * <pre>
     * JMX_SECURITY_NOT_FOUND_CWOBJ1616=CWOBJ1616I: JMX Security implementation not found.
     * JMX_SECURITY_NOT_FOUND_CWOBJ1616.explanation=MX4J or Java version 5.0 or above is not available.
     * JMX_SECURITY_NOT_FOUND_CWOBJ1616.useraction=If JMX Security is required, add MX4J to the classpath or use a level of Java that supports JMX.
     * </pre>
     */
    public String JMX_SECURITY_NOT_FOUND_CWOBJ1616 = "JMX_SECURITY_NOT_FOUND_CWOBJ1616";

    /**
     * <pre>
     * NO_JNDI_NAME_SUPPLIED_BIND_CWOBJ1617=CWOBJ1617: No JNDI name was supplied while doing a bind. The bind will not complete.
     * NO_JNDI_NAME_SUPPLIED_BIND_CWOBJ1617.explanation=A JNDI name is need for binding objects. The eXtreme Scale name service uses a two name deep space of "objectgrid/second name" by default.
     * NO_JNDI_NAME_SUPPLIED_BIND_CWOBJ1617.useraction=Supply a JNDI name for the bind and try the operation again.
     * </pre>
     */
    public String NO_JNDI_NAME_SUPPLIED_BIND_CWOBJ1617 = "NO_JNDI_NAME_SUPPLIED_BIND_CWOBJ1617";

    /**
     * <pre>
     * # {0} unknown prefix
     * INCORRECT_JNDI_BIND_NAME_CWOBJ1618=CWOBJ1618: An incorrect JNDI name, {0}, was supplied while doing a bind.
     * INCORRECT_JNDI_BIND_NAME_CWOBJ.explanation=The eXtreme Scale name service uses a two name deep space of "objectgrid/second name" by default.
     * INCORRECT_JNDI_BIND_NAME_CWOBJ.useraction=Fix the JNDI prefix to match objectgrid and use one additional name, then try the operation again.
     * </pre>
     */
    public String INCORRECT_JNDI_BIND_NAME_CWOBJ1618 = "INCORRECT_JNDI_BIND_NAME_CWOBJ1618";

    /**
     * <pre>
     * NO_JNDI_NAME_SUPPLIED_RESOLVE_CWOBJ1619=CWOBJ1619: No name was supplied while doing a JNDI resolve.
     * NO_JNDI_NAME_SUPPLIED_RESOLVE_CWOBJ1619.explanation=A name is need for resolving objects. The eXtreme Scale name service uses a two name deep space of "objectgrid/second name" by default.
     * NO_JNDI_NAME_SUPPLIED_RESOLVE_CWOBJ1619.useraction=Supply a name for the resolve and try the operation again.
     * </pre>
     */
    public String NO_JNDI_NAME_SUPPLIED_RESOLVE_CWOBJ1619 = "NO_JNDI_NAME_SUPPLIED_RESOLVE_CWOBJ1619";

    /**
     * <pre>
     * # {0} Replication group member (RuntimeReplicationGroupMember.toString())
     * REPLACE_SERVER_CWOBJ1620=CWOBJ1620I: Replacing target for wrongly routed request due to changes in the server.  The new target is {0}.
     * REPLACE_SERVER_CWOBJ1620.explanation=Old routing target replaced with new target.
     * REPLACE_SERVER_CWOBJ1620.useraction=If the intended replication group is out of service, restart the servers in the replication group.
     * </pre>
     */
    public String REPLACE_SERVER_CWOBJ1620 = "REPLACE_SERVER_CWOBJ1620";

    /**
     * <pre>
     * # {0} name
     * UNABLE_TO_RESOVLE_JNDI_CWOBJ1621=CWOBJ1621: Unable to resolve JNDI name, {0}.
     * UNABLE_TO_RESOVLE_JNDI_CWOBJ1621.explanation=The eXtreme Scale name service uses a two name deep space of "objectgrid/second name" by default. The supplied name was not found in the name space.
     * UNABLE_TO_RESOVLE_JNDI_CWOBJ1621.useraction=Correct any spelling errors and try the operation again.
     * </pre>
     */
    public String UNABLE_TO_RESOVLE_JNDI_CWOBJ1621 = "UNABLE_TO_RESOVLE_JNDI_CWOBJ1621";

    /**
     * <pre>
     * # {0} Request
     * DOMINO_MODE_CWOBJ1630=CWOBJ1630I: Replication group cannot serve this request {0}.
     * DOMINO_MODE_CWOBJ1630.explanation=Routing is refused due to the unavailable service such as the Domino effect
     * DOMINO_MODE_CWOBJ1630.useraction=No action is required.
     * </pre>
     */
    public String DOMINO_MODE_CWOBJ1630 = "DOMINO_MODE_CWOBJ1630";

    /**
     * <pre>
     * NULL_ID_CWOBJ1632=CWOBJ1632E: Original request does not have a valid ID; no way to forward this request.
     * NULL_ID_CWOBJ1632.explanation=No way to forward this request because the original request does not have a valid ID.
     * NULL_ID_CWOBJ1632.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String NULL_ID_CWOBJ1632 = "NULL_ID_CWOBJ1632";

    /**
     * <pre>
     * BLIND_FORWARD_CWOBJ1634=CWOBJ1634I: Router cannot find the forwarding target; using blind forwarding.
     * BLIND_FORWARD_CWOBJ1634.explanation=Router cannot find the forwarding target.
     * BLIND_FORWARD_CWOBJ1634.useraction=No action is required.
     * </pre>
     */
    public String BLIND_FORWARD_CWOBJ1634 = "BLIND_FORWARD_CWOBJ1634";

    /**
     * <pre>
     * # {0} Request
     * SERVER_NOT_RIGHT_CWOBJ1660=CWOBJ1660I: Replication group member has changed.  This server does not host what is requested anymore.  The original request is {0}.
     * SERVER_NOT_RIGHT_CWOBJ1660.explanation=Replication group member has changed and does not host the received request.
     * SERVER_NOT_RIGHT_CWOBJ1660.useraction=If the intended replication group is out of service, restart the servers in the replication group.
     * </pre>
     */
    public String SERVER_NOT_RIGHT_CWOBJ1660 = "SERVER_NOT_RIGHT_CWOBJ1660";

    /**
     * <pre>
     * # {0} replication group ID
     * VERIFY_NULL_CLUSTER_CWOBJ1663=CWOBJ1663E: Server router cannot verify server routing for {0}, because cluster data for this replication group are null in the server.
     * VERIFY_NULL_CLUSTER_CWOBJ1663.explanation=No replication group cluster data are available to verify.
     * VERIFY_NULL_CLUSTER_CWOBJ1663.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String VERIFY_NULL_CLUSTER_CWOBJ1663 = "VERIFY_NULL_CLUSTER_CWOBJ1663";

    /**
     * <pre>
     * # {0} replication group ID
     * NOT_STARTED_CWOBJ1668=CWOBJ1668W: A client is making a request to a server that has not completed starting.
     * NOT_STARTED_CWOBJ1668.explanation=Server startup takes 60-120 seconds. The request will automatically be retried unless you have configured otherwise.
     * NOT_STARTED_CWOBJ1668.useraction=Adjust your configuration or start your clients 60-120 seconds after you start your servers.
     * </pre>
     */
    public String NOT_STARTED_CWOBJ1668 = "NOT_STARTED_CWOBJ1668";

    /**
     * <pre>
     * # {0} server name
     * SERVER_NAME_DIRECTLY_BOUND_CWOBJ1683E=CWOBJ1683E: The {0} name is already directly bound to another server.
     * SERVER_NAME_DIRECTLY_BOUND_CWOBJ1683E.explanation=An object is currently bound to this name. 
     * SERVER_NAME_DIRECTLY_BOUND_CWOBJ1683E.useraction=Rename the server and attempt to create or reconnect the object again.
     * </pre>
     */
    public String SERVER_NAME_DIRECTLY_BOUND_CWOBJ1683E = "SERVER_NAME_DIRECTLY_BOUND_CWOBJ1683E";

    /**
     * <pre>
     * # {0} server name
     * # {1} binding
     * # {2} bindInfo
     * SERVER_NAME_ALREADY_BOUND_CWOBJ1684E=CWOBJ1684E: The {0} name is already bound to the {1} binding. The new {2} binding cannot be bound.
     * SERVER_NAME_ALREADY_BOUND_CWOBJ1684E.explanation=Server names must be unique.
     * SERVER_NAME_ALREADY_BOUND_CWOBJ1684E.useraction=Rename the server and attempt to create or reconnect the object again.
     * </pre>
     */
    public String SERVER_NAME_ALREADY_BOUND_CWOBJ1684E = "SERVER_NAME_ALREADY_BOUND_CWOBJ1684E";

    /**
    * # {0} server name
    * SERVER_BIND_EXCEPTION_CWOBJ1685E=CWOBJ1685E: Unable to bind the {0} server name. 
    * SERVER_BIND_EXCEPTION_CWOBJ1685E.explanation=An unknown bind exception. This error is probably occurring because another server exists with the same name.
    * SERVER_BIND_EXCEPTION_CWOBJ1685E.useraction=Rename the server and attempt to create or reconnect the object again.
    * </pre>
     */
    public String SERVER_BIND_EXCEPTION_CWOBJ1685E = "SERVER_BIND_EXCEPTION_CWOBJ1685E";

    /**
     * <pre>
     * # {0} server name
     * # {1} exception message
     * REGISTER_BIND_EXCEPTION_CWOBJ1686E=CWOBJ1686E: Unable to bind the {0} server name: {1}
     * REGISTER_BIND_EXCEPTION_CWOBJ1686E.explanation=Could not bind during the registration. 
     * REGISTER_BIND_EXCEPTION_CWOBJ1686E.useraction=Check the first-failure data capture (FFDC) logs for details about this error.
     * </pre>
     */
    public String REGISTER_BIND_EXCEPTION_CWOBJ1686E = "REGISTER_BIND_EXCEPTION_CWOBJ1686E";

    /**
     * <pre>
     * # {0} server name
     * RESOLVE_SERVER_FAILURE_CWOBJ1687E=CWOBJ1687E: Unable to resolve the {0} server name.
     * RESOLVE_SERVER_FAILURE_CWOBJ1687E.explanation=Unable to resolve server.
     * RESOLVE_SERVER_FAILURE_CWOBJ1687E.useraction=Check the first-failure data capture (FFDC) logs for details about this error.
     * </pre>
     */
    public String RESOLVE_SERVER_FAILURE_CWOBJ1687E = "RESOLVE_SERVER_FAILURE_CWOBJ1687E";

    /**
     * <pre>
     * # {0} exception message
     * PLACEMENT_SERVICE_BIND_EXCEPTION_CWOBJ1688E=CWOBJ1688E: Unable to bind OBJECTGRID_PLACEMENT_SERVICE: {0}
     * PLACEMENT_SERVICE_BIND_EXCEPTION_CWOBJ1688E.explanation=Unable to bind the ObjectGrid placement service.
     * </pre>
     */
    public String PLACEMENT_SERVICE_BIND_EXCEPTION_CWOBJ1688E = "PLACEMENT_SERVICE_BIND_EXCEPTION_CWOBJ1688E";

    /**
     * <pre>
     * # {0} Server names
     * TEAR_DOWN_SERVERS_REQUESTED_CWOBJ1689=CWOBJ1689I: A request to tear down the following servers: {0} was received.
     * TEAR_DOWN_SERVERS_REQUESTED_CWOBJ1689.explanation=A user request was received to tear down the servers specified.
     * TEAR_DOWN_SERVERS_REQUESTED_CWOBJ1689.useraction=No user action is required.
     * </pre>
     */
    public String TEAR_DOWN_SERVERS_REQUESTED_CWOBJ1689 = "TEAR_DOWN_SERVERS_REQUESTED_CWOBJ1689";

    /**
     * <pre>
     * # {0} Coregroup
     * STANDLAONE_HAMANAGER_INITIALIZED_CWOBJ1700=CWOBJ1700I: Standalone HAManager initialized with coregroup {0}.
     * STANDLAONE_HAMANAGER_INITIALIZED_CWOBJ1700.explanation=Standalone HAManager initialized successfully.
     * STANDLAONE_HAMANAGER_INITIALIZED_CWOBJ1700.useraction=No action is required.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_INITIALIZED_CWOBJ1700 = "STANDLAONE_HAMANAGER_INITIALIZED_CWOBJ1700";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_ALREADY_INITIALIZED_CWOBJ1701=CWOBJ1701I: Standalone HAManager is already initialized.
     * STANDLAONE_HAMANAGER_ALREADY_INITIALIZED_CWOBJ1701.explanation=Standalone HAManager is already initialized successfully.
     * STANDLAONE_HAMANAGER_ALREADY_INITIALIZED_CWOBJ1701.useraction=No action is required.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_ALREADY_INITIALIZED_CWOBJ1701 = "STANDLAONE_HAMANAGER_ALREADY_INITIALIZED_CWOBJ1701";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_NOT_INITIALIZED_CWOBJ1702=CWOBJ1702E: Standalone HAManager is not initialized, so it cannot be started.
     * STANDLAONE_HAMANAGER_NOT_INITIALIZED_CWOBJ1702.explanation=Standalone HAManager is not initialized.
     * STANDLAONE_HAMANAGER_NOT_INITIALIZED_CWOBJ1702.useraction=Initialize it before starting it.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_NOT_INITIALIZED_CWOBJ1702 = "STANDLAONE_HAMANAGER_NOT_INITIALIZED_CWOBJ1702";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_STARTED_CWOBJ1710=CWOBJ1710I: Standalone HAManager started successfully.
     * STANDLAONE_HAMANAGER_STARTED_CWOBJ1710.explanation=Standalone HAManager started successfully.
     * STANDLAONE_HAMANAGER_STARTED_CWOBJ1710.useraction=No action is required.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_STARTED_CWOBJ1710 = "STANDLAONE_HAMANAGER_STARTED_CWOBJ1710";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_ALREADY_STARTED_CWOBJ1711=CWOBJ1711I: Standalone HAManager already started successfully.
     * STANDLAONE_HAMANAGER_ALREADY_STARTED_CWOBJ1711.explanation=Standalone HAManager already started successfully.
     * STANDLAONE_HAMANAGER_ALREADY_STARTED_CWOBJ1711.useraction=No action is required.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_ALREADY_STARTED_CWOBJ1711 = "STANDLAONE_HAMANAGER_ALREADY_STARTED_CWOBJ1711";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_NOT_STARTED_CWOBJ1712=CWOBJ1712E: Standalone HAManager is not started.
     * STANDLAONE_HAMANAGER_NOT_STARTED_CWOBJ1712.explanation=Standalone HAManager is not started.
     * STANDLAONE_HAMANAGER_NOT_STARTED_CWOBJ1712.useraction=Initialize and start it before using it.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_NOT_STARTED_CWOBJ1712 = "STANDLAONE_HAMANAGER_NOT_STARTED_CWOBJ1712";

    /**
     * <pre>
     * STANDLAONE_HAMANAGER_START_FAIL_CWOBJ1713=CWOBJ1713E: Standalone HAManager failed to start.
     * STANDLAONE_HAMANAGER_START_FAIL_CWOBJ1713.explanation=Standalone HAManager failed to start.
     * STANDLAONE_HAMANAGER_START_FAIL_CWOBJ1713.useraction=Check if ports are used already.
     * </pre>
     */
    public String STANDLAONE_HAMANAGER_START_FAIL_CWOBJ1713 = "STANDLAONE_HAMANAGER_START_FAIL_CWOBJ1713";

    /**
     * <pre>
     * # {0} interval
     * DCS_SLIDEBAR_SET_CWOBJ1767=CWOBJ1767I: The DCS heartbeating interval is {0}.
     * DCS_SLIDEBAR_SET_CWOBJ1767.explanation= The DCS heartbeating interval is used
     * DCS_SLIDEBAR_SET_CWOBJ1767.useraction=No action is required.
     * </pre>
     */
    public String DCS_SLIDEBAR_SET_CWOBJ1767 = "DCS_SLIDEBAR_SET_CWOBJ1767";

    /**
     * <pre>
     * # {0} timeout
     * DCS_SLIDEBAR_SET_CWOBJ1768=CWOBJ1768I: The DCS heartbeating timeout is {0}.
     * DCS_SLIDEBAR_SET_CWOBJ1768.explanation= The DCS heartbeating timeout is being used and set to the timeout provided.
     * DCS_SLIDEBAR_SET_CWOBJ1768.useraction=No action is required.
     * </pre>
     */
    public String DCS_SLIDEBAR_SET_CWOBJ1768 = "DCS_SLIDEBAR_SET_CWOBJ1768";

    /**
     * <pre>
     * # {0} threads
     * DCS_SLIDEBAR_SET_CWOBJ1769=CWOBJ1769I: The number of DCS heartbeating threads is {0}.
     * DCS_SLIDEBAR_SET_CWOBJ1769.explanation= The number of DCS heartbeating threads is set to number provided.
     * DCS_SLIDEBAR_SET_CWOBJ1769.useraction=No action is required.
     * </pre>
     */
    public String DCS_SLIDEBAR_SET_CWOBJ1769 = "DCS_SLIDEBAR_SET_CWOBJ1769";

    /**
     * <pre>
     * # {0} core group name
    HA_NOW_COREGROUP_LEADER_CWOBJ1770=CWOBJ1770I: This process is now the core group leader for the group {0}.
    HA_NOW_COREGROUP_LEADER_CWOBJ1770.explanation=One server in every core group serves as the leader for that core group and periodically notifies the catalog server with the list of servers that are running.
    HA_NOW_COREGROUP_LEADER_CWOBJ1770.useraction=No action is required.
     * </pre>
     */
    public String HA_NOW_COREGROUP_LEADER_CWOBJ1770 = "HA_NOW_COREGROUP_LEADER_CWOBJ1770";

    /**
     * <pre>
     # {0} core group name
    HA_NOT_COREGROUP_LEADER_CWOBJ1771=CWOBJ1771I: This process is no longer the core group leader for the group {0}.
    HA_NOT_COREGROUP_LEADER_CWOBJ1771.explanation=One server in every core group serves as the leader for that core group and periodically notifies the catalog server with the list of servers that are running.  It is possible that the leader can change with a server going down.
    HA_NOT_COREGROUP_LEADER_CWOBJ1771.useraction=No action is required.

     * </pre>
     */
    public String HA_NOT_COREGROUP_LEADER_CWOBJ1771 = "HA_NOT_COREGROUP_LEADER_CWOBJ1771";

    /**
     * <pre>
     # {0} list of servers
    HA_MEMBERS_CHANGED_CWOBJ1772I=CWOBJ1772I: HAM/DCS have notified eXtreme Scale that the list of servers running in this core group has changed to (0).
    HA_MEMBERS_CHANGED_CWOBJ1772I.explanation=eXtreme Scale servers learn when other servers in the domain start up or stop (expectedly or unexpectedly).
    HA_MEMBERS_CHANGED_CWOBJ1772I.useraction=No Action is required.
     * </pre>
     */
    public String HA_MEMBERS_CHANGED_CWOBJ1772I = "HA_MEMBERS_CHANGED_CWOBJ1772I";

    /**
     * <pre>
    # {0} core group version
    # {1} list of servers
    HA_STANDALONE_DEFINED_SET_IMPORTED_CWOBJ1773I=CWOBJ1773I: This server has received an updated HA defined set from the catalog, version {0} with the set now containing the servers {1}
    HA_STANDALONE_DEFINED_SET_IMPORTED_CWOBJ1773I.explanation=The defined set indicates the list of servers the catalog has currently assigned to the core group of which this server is a member.
    HA_STANDALONE_DEFINED_SET_IMPORTED_CWOBJ1773I.useraction=No action is required.
     * </pre>
     */
    public String HA_STANDALONE_DEFINED_SET_IMPORTED_CWOBJ1773I = "HA_STANDALONE_DEFINED_SET_IMPORTED_CWOBJ1773I";

    /**
     * <pre>
     * HAMANAGER_CONTROLLER_NEED_STANDALONE_HAM_CWOBJ1790=CWOBJ1790I: Need to initialize and start the standalone HAManager.
     * HAMANAGER_CONTROLLER_NEED_STANDALONE_HAM_CWOBJ1790.explanation=There is no external HAManager manager running from a WebSphere Application Server install. A standalone HAManager will be initialized and started.
     * HAMANAGER_CONTROLLER_NEED_STANDALONE_HAM_CWOBJ1790.useraction=No action is required.
     * </pre>
     */
    public String HAMANAGER_CONTROLLER_NEED_STANDALONE_HAM_CWOBJ1790 = "HAMANAGER_CONTROLLER_NEED_STANDALONE_HAM_CWOBJ1790";

    /**
     * <pre>
     * # {0} Response
     * CLIENT_FORWARDING_CWOBJ1810=CWOBJ1810I: Forwarding is required for response {0}.
     * CLIENT_FORWARDING_CWOBJ1810.explanation=Forwarding is required for response.
     * CLIENT_FORWARDING_CWOBJ1810.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_FORWARDING_CWOBJ1810 = "CLIENT_FORWARDING_CWOBJ1810";

    /**
     * <pre>
     * FORWARDING_NOT_FOUND_REQUEST_CWOBJ1811=CWOBJ1811E: Forwarding is required, but the original request cannot be found.
     * FORWARDING_NOT_FOUND_REQUEST_CWOBJ1811.explanation=Forwarding is required, but the original request cannot be found.
     * FORWARDING_NOT_FOUND_REQUEST_CWOBJ1811.useraction=No action is required.
     * </pre>
     */
    public String FORWARDING_NOT_FOUND_REQUEST_CWOBJ1811 = "FORWARDING_NOT_FOUND_REQUEST_CWOBJ1811";

    /**
     * <pre>
     * # {0} Response
     * CLIENT_DOMINO_CWOBJ1870=CWOBJ1870I: Server service is not available for response {0}.
     * CLIENT_DOMINO_CWOBJ1870.explanation=Server service is not available due to the number of available replicas or other events.
     * CLIENT_DOMINO_CWOBJ1870.useraction=Bring at least the minimum number of servers up.
     * </pre>
     */
    public String CLIENT_DOMINO_CWOBJ1870 = "CLIENT_DOMINO_CWOBJ1870";

    /**
     * <pre>
     * NULL_DOMINO_CWOBJ1871=CWOBJ1871E: Detected unavailable service, received null response, no way to retry.
     * NULL_DOMINO_CWOBJ1871.explanation=Null response from the unavailable service.
     * NULL_DOMINO_CWOBJ1871.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String NULL_DOMINO_CWOBJ1871 = "NULL_DOMINO_CWOBJ1871";

    /**
     * <pre>
     * # {0} Response
     * CLIENT_DOMINO_TIMEOUT_CWOBJ1872=CWOBJ1872I: Service is unavailable with response of {0}.
     * CLIENT_DOMINO_TIMEOUT_CWOBJ1872.explanation=Service is not available
     * CLIENT_DOMINO_TIMEOUT_CWOBJ1872.useraction=Bring at least the minimum number of servers up or check if server startup is successful.
     * </pre>
     */
    public String CLIENT_DOMINO_TIMEOUT_CWOBJ1872 = "CLIENT_DOMINO_TIMEOUT_CWOBJ1872";

    /**
     * <pre>
     * # {0} Request
     * DEAD_SERVER_REROUTING_CWOBJ1890=CWOBJ1890I: Re-routing request {0} due to an un-responsive server.
     * DEAD_SERVER_REROUTING_CWOBJ1890.explanation=The request for intended server failed to complete. Request was re-routed to another server.
     * DEAD_SERVER_REROUTING_CWOBJ1890.useraction=No action is required. Handled automatically.  If the intended replication group is out of service, restart the servers that host the replication group.
     * </pre>
     */
    public String DEAD_SERVER_REROUTING_CWOBJ1890 = "DEAD_SERVER_REROUTING_CWOBJ1890";

    /**
     * <pre>
     * # {0} Replication group ID
     * NO_SERVER_REROUTING_CWOBJ1891=CWOBJ1891E: All servers are not available in replication group {0}.
     * NO_SERVER_REROUTING_CWOBJ1891.explanation=All servers were either not started or have failed. They are not available
     * NO_SERVER_REROUTING_CWOBJ1891.useraction=If the intended replication group is out of service, restart the servers that host the replication group.
     * </pre>
     */
    public String NO_SERVER_REROUTING_CWOBJ1891 = "NO_SERVER_REROUTING_CWOBJ1891";

    /**
     * <pre>
     * # {0} Response
     * FORWARD_NULL_RGID_CWOBJ1899=CWOBJ1899W: Forwarding is required, but router cannot find right replication group for response {0}
     * FORWARD_NULL_RGID_CWOBJ1899.explanation=Replication group ID is lost.
     * FORWARD_NULL_RGID_CWOBJ1899.useraction=Restart the servers that host the replication group. If the problem continues, contact IBM Software Support.
     * </pre>
     */
    public String FORWARD_NULL_RGID_CWOBJ1899 = "FORWARD_NULL_RGID_CWOBJ1899";

    /**
     * <pre>
     * RPC_SERVICE_INIT_CWOBJ1900=CWOBJ1900I: Client server remote procedure call service is initialized.
     * RPC_SERVICE_INIT_CWOBJ1900.explanation=Client server remote procedure call service is initialized.
     * RPC_SERVICE_INIT_CWOBJ1900.useraction=No action is required.
     * </pre>
     */
    public String RPC_SERVICE_INIT_CWOBJ1900 = "RPC_SERVICE_INIT_CWOBJ1900";

    /**
     * <pre>
     * RPC_SERVICE_START_CWOBJ1901=CWOBJ1901I: Client server remote procedure call service is started.
     * RPC_SERVICE_START_CWOBJ1901.explanation=Client server remote procedure call service is started.
     * RPC_SERVICE_START_CWOBJ1901.useraction=No action is required.
     * </pre>
     */
    public String RPC_SERVICE_START_CWOBJ1901 = "RPC_SERVICE_START_CWOBJ1901";

    /**
     * <pre>
     * RPC_HANDLER_THREADS_START_CWOBJ1902=CWOBJ1902I: Client server remote procedure call handler threads are started.
     * RPC_HANDLER_THREADS_START_CWOBJ1902.explanation=Client server remote procedure call handler threads are started.
     * RPC_HANDLER_THREADS_START_CWOBJ1902.useraction=No action is required.
     * </pre>
     */
    public String RPC_HANDLER_THREADS_START_CWOBJ1902 = "RPC_HANDLER_THREADS_START_CWOBJ1902";

    /**
     * <pre>
     * CONFIG_NETWORK_SERVICE_INIT_CWOBJ1903=CWOBJ1903I: Configuration network service is initialized.
     * CONFIG_NETWORK_SERVICE_INIT_CWOBJ1903.explanation=Configuration network service is initialized.
     * CONFIG_NETWORK_SERVICE_INIT_CWOBJ1903.useraction=No action is required.
     * </pre>
     */
    public String CONFIG_NETWORK_SERVICE_INIT_CWOBJ1903 = "CONFIG_NETWORK_SERVICE_INIT_CWOBJ1903";

    /**
     * <pre>
     * CONFIG_NETWORK_SERVICE_START_CWOBJ1904=CWOBJ1904I: Configuration network service is started.
     * CONFIG_NETWORK_SERVICE_START_CWOBJ1904.explanation=Configuration network service is started.
     * CONFIG_NETWORK_SERVICE_START_CWOBJ1904.useraction=No action is required.
     * </pre>
     */
    public String CONFIG_NETWORK_SERVICE_START_CWOBJ1904 = "CONFIG_NETWORK_SERVICE_START_CWOBJ1904";

    /**
     * <pre>
     * CONFIG_NETWORK_HANDLER_START_CWOBJ1905=CWOBJ1905I: Configuration handler is started.
     * CONFIG_NETWORK_HANDLER_START_CWOBJ1905.explanation=Configuration handler is started.
     * CONFIG_NETWORK_HANDLER_START_CWOBJ1905.useraction=No action is required.
     * </pre>
     */
    public String CONFIG_NETWORK_HANDLER_START_CWOBJ1905 = "CONFIG_NETWORK_HANDLER_START_CWOBJ1905";

    /**
     * <pre>
     * {0} host name
     * Cannot_Find_host_name=CWOBJ1921W: Cannot find host name {0}.
     * Cannot_Find_host_name.explanation=You must provide a valid hostname or the local host will be used.
     * Cannot_Find_host_name.useraction=Verify the host name provided is the correct host name for the server and is set correctly.
     * </pre>
     */
    public String Cannot_Find_host_name = "Cannot_Find_host_name";

    /**
     * <pre>
     * Cannot_Lookup_IP=CWOBJ1922E: Cannot lookup the IP address for this host {0}.
     * Cannot_Lookup_IP.explanation=The host name that you configured is not correct.
     * Cannot_Lookup_IP.useraction=Check the host name and IP address configured for the server.
     * </pre>
     */
    public String Cannot_Lookup_IP = "Cannot_Lookup_IP";

    /**
     * <pre>
     * LocalHostUsed=CWOBJ1929W: LOCALHOST is used in the configuration which may lose server identity in multiple machine environment.
     * LocalHostUsed.explanation=In multiple computer systems with remote actions, localhost cannot be used.
     * LocalHostUsed.useraction=Change localhost to an actual host name or IP address.
     * </pre>
     */
    public String LocalHostUsed = "LocalHostUsed";

    /**
     * <pre>
     * # {0} server name
     * ServerSupport=CWOBJ1931I: The configuration for {0} does not support either an ObjectGrid replication group member or a client-server transaction processor. This server will provide bootstrap support to peer ObjectGrid servers and clients only.
     * ServerSupport.explanation=The configuration for this server does not support either an ObjectGrid replication group member or a client-server transaction processor.
     * ServerSupport.useraction=Check your cluster xml configuration and add replication or ObjectGrid bindings if required.
     * </pre>
     */
    public String ServerSupport = "ServerSupport";

    /**
     * <pre>
     * # {0} min
     * # {1} max
     * ThreadPoolMinMax=CWOBJ1932I: Client thread pool minimum size is {0} maximum size {1}.
     * ThreadPoolMinMax.explanation=The minimum and maxiumum client thread pool size.
     * ThreadPoolMinMax.useraction=No action is required.
     * </pre>
     */
    public String ThreadPoolMinMax = "ThreadPoolMinMax";

    /**
     * <pre>
     * # {0} replication group ID
     * NO_RGM_CWOBJ2000=CWOBJ2000E: No member in this replication group {0}.
     * NO_RGM_CWOBJ2000.explanation=No member can be found in this replication group.
     * NO_RGM_CWOBJ2000.useraction=Check if servers are started or data are available
     * </pre>
     */
    public String NO_RGM_CWOBJ2000 = "NO_RGM_CWOBJ2000";

    /**
     * <pre>
     * # {0} replication group ID
     * NO_AVAILABLE_RT_CWOBJ2002=CWOBJ2002W: No available routing table for this replication group {0}.
     * NO_AVAILABLE_RT_CWOBJ2002.explanation=Clients are not able to route to the provided replication group.
     * NO_AVAILABLE_RT_CWOBJ2002.useraction=Check if clients have brought in routing table and servers that host the replication group are available.
     * </pre>
     */
    public String NO_AVAILABLE_RT_CWOBJ2002 = "NO_AVAILABLE_RT_CWOBJ2002";

    /**
     * <pre>
     * NULL_TARGET_CWOBJ2010=CWOBJ2010E: Target for this request is null.
     * NULL_TARGET_CWOBJ2010.explanation=Request did not come with target information.
     * NULL_TARGET_CWOBJ2010.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String NULL_TARGET_CWOBJ2010 = "NULL_TARGET_CWOBJ2010";

    /**
     * <pre>
     * ClientProperty_CWOBJ2020=CWOBJ2020I: Client properties are {0}.
     * ClientProperty_CWOBJ2020.explanation=Client properties are loaded.
     * ClientProperty_CWOBJ2020.useraction=No action is required.
     * </pre>
     */
    public String ClientProperty_CWOBJ2020 = "ClientProperty_CWOBJ2020";

    /**
     * <pre>
     * # {0} client retry property
     * # {1} failed value
     * FAILED_TO_LOAD_CLIENT_RETRY_CWOBJ2024E=CWOBJ2024E: Failed to process the value for the client retry property {0}. Value supplied: {1}. The correct value type is an integer up to a long indicating the timeout.
     * FAILED_TO_LOAD_CLIENT_RETRY_CWOBJ2024E.explanation=While processing the client properties file, the client retry value was incorrect. The client retry will not be set.
     * FAILED_TO_LOAD_CLIENT_RETRY_CWOBJ2024E.useraction=Change the value in the client properties file (sometimes named client.propertes) to an integer or a long. Restart the client for the correct value to be used.
     * </pre>
     */
    public String FAILED_TO_LOAD_CLIENT_RETRY_CWOBJ2024E = "FAILED_TO_LOAD_CLIENT_RETRY_CWOBJ2024E";

    /**
     * <pre>
     * # {0} Replication group cluster
     * NEW_RT_CHANGE_CWOBJ2060=CWOBJ2060I: Client received new version of replication group cluster {0}.
     * NEW_RT_CHANGE_CWOBJ2060.explanation=Client received new version of replication group cluster.
     * NEW_RT_CHANGE_CWOBJ2060.useraction=No action is required.
     * </pre>
     */
    public String NEW_RT_CHANGE_CWOBJ2060 = "NEW_RT_CHANGE_CWOBJ2060";

    /**
     * <pre>
     * STALECONN_CWOBJ2100=CWOBJ2100I: Connection ({0}) is stale, it cannot be reused.
     * STALECONN_CWOBJ2100.explanation=Connection is stale.
     * STALECONN_CWOBJ2100.useraction=No action is required.
     * </pre>
     */
    public String STALECONN_CWOBJ2100 = "STALECONN_CWOBJ2100";

    /**
     * <pre>
     * # {0} backingMap name
     * INVALID_MAP_SET_CONFIGURATION_CWOBJ2400=CWOBJ2400E: Invalid Configuration: backingMap {0} is a member of more than one mapSet.
     * INVALID_MAP_SET_CONFIGURATION_CWOBJ2400.explanation=A backingMap can belong to only one mapSet.
     * INVALID_MAP_SET_CONFIGURATION_CWOBJ2400.useraction=Edit the cluster XML file so that each backingMap belongs to only one mapSet.
     * </pre>
     */
    public String INVALID_MAP_SET_CONFIGURATION_CWOBJ2400 = "INVALID_MAP_SET_CONFIGURATION_CWOBJ2400";

    /**
     * <pre>
     * # {0} backingMap name
     * # {1} objectGrid name
     * BACKING_MAP_WO_MAPSET_CWOBJ2401=CWOBJ2401E: Invalid Configuration: backingMap {0} in distributed ObjectGrid {1} is not in a mapSet.
     * BACKING_MAP_WO_MAPSET_CWOBJ2401.explanation=Each backingMap of a distributed ObjectGrid must be placed in a mapSet.
     * BACKING_MAP_WO_MAPSET_CWOBJ2401.useraction=Edit the cluster XML file so that each backingMap in a distributed ObjectGrid belongs to a mapSet.
     * </pre>
     */
    public String BACKING_MAP_WO_MAPSET_CWOBJ2401 = "BACKING_MAP_WO_MAPSET_CWOBJ2401";

    /**
     * <pre>
     * # {0} map-set map reference name
     * MAPSET_REF_NONEXISTENT_BMAP_CWOBJ2402=CWOBJ2402E: Invalid Configuration: mapSet has a reference to a {0} map.  This backingMap does not exist in the ObjectGrid XML file.
     * MAPSET_REF_NONEXISTENT_BMAP_CWOBJ2402.explanation=Each map within a mapSet must reference a backingMap from the ObjectGrid XML file.
     * MAPSET_REF_NONEXISTENT_BMAP_CWOBJ2402.useraction=Edit the XML file(s) so that each map within the mapSet references a backingMap from the ObjectGrid XML file.
     * </pre>
     */
    public String MAPSET_REF_NONEXISTENT_BMAP_CWOBJ2402 = "MAPSET_REF_NONEXISTENT_BMAP_CWOBJ2402";

    /**
     * <pre>
     * # {0} xml file
     * # {1} line number
     * # {2} error message
     * INVALID_XML_FILE_CWOBJ2403=CWOBJ2403E: The XML file is invalid. A problem has been detected with {0} at line {1}. The error message is {2}.
     * INVALID_XML_FILE_CWOBJ2403.explanation=The XML file does not conform to the schema.
     * INVALID_XML_FILE_CWOBJ2403.useraction=Edit the XML file so that it is conforms to the schema. See the Configuring with XML files section in the WebSphere eXtreme Scale documentation.
     * </pre>
     */
    public String INVALID_XML_FILE_CWOBJ2403 = "INVALID_XML_FILE_CWOBJ2403";

    /**
     * <pre>
     * # {0} config parameter
     * # {1} value of parameter
     * INVALID_CONFIG_VALUE_CWOBJ2404=CWOBJ2404W: The value specified for {0} is {1}. This is an invalid value. {0} will not be set.
     * INVALID_CONFIG_VALUE_CWOBJ2404.explanation=The value for this configuration attribute is not valid.
     * INVALID_CONFIG_VALUE_CWOBJ2404.useraction=Set the configuration attribute to a proper value in the XML file. See the Configuring with XML files section in the WebSphere eXtreme Scale documentation.
     * </pre>
     */
    public String INVALID_CONFIG_VALUE_CWOBJ2404 = "INVALID_CONFIG_VALUE_CWOBJ2404";

    /**
     * <pre>
     * # {0} objectgrid-binding ref value
     * OG_BINDING_REF_NONEXISTENT_OG_CWOBJ2405=CWOBJ2405E: The objectgridBinding ref {0} in the Cluster XML file does not reference a valid objectGrid from the ObjectGrid XML file.
     * OG_BINDING_REF_NONEXISTENT_OG_CWOBJ2405.explanation=Each of the objectgridBindings must reference an objectGrid from the ObjectGrid XML file.
     * OG_BINDING_REF_NONEXISTENT_OG_CWOBJ2405.useraction=Edit the XML files so that the objectgridBinding in the Cluster XML references a valid objectGrid in the ObjectGrid XML.
     * </pre>
     */
    public String OG_BINDING_REF_NONEXISTENT_OG_CWOBJ2405 = "OG_BINDING_REF_NONEXISTENT_OG_CWOBJ2405";

    /**
     * <pre>
     * # {0} xml file
     * # {1} line number
     * # {2} error message
     * INVALID_XML_FILE_CWOBJ2406=CWOBJ2406W: The XML file is invalid. A problem has been detected with {0} at line {1}. The error message is {2}.
     * INVALID_XML_FILE_CWOBJ2406.explanation=The XML file does not conform to the schema.
     * INVALID_XML_FILE_CWOBJ2406.useraction=Edit the XML file so that it is conforms to the schema. See the Configuring with XML files section in the WebSphere eXtreme Scale documentation.
     * </pre>
     */
    public String INVALID_XML_FILE_CWOBJ2406 = "INVALID_XML_FILE_CWOBJ2406";

    /**
     * <pre>
     * # {0} property name
     * # {1} plug-in class
     * # {2} exception
     * PLUGIN_PROPERTY_INVALID_CWOBJ2407=CWOBJ2407W: The {0} property on the {1} plug-in class could not be set.  The exception is {2}.
     * PLUGIN_PROPERTY_INVALID_CWOBJ2407.explanation=The property for this plug-in could not be set.
     * PLUGIN_PROPERTY_INVALID_CWOBJ2407.useraction=See the exception and first failure data capture (FFDC) logs for more information. Correct any configuration problems. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location.
     * </pre>
     */
    public String PLUGIN_PROPERTY_INVALID_CWOBJ2407 = "PLUGIN_PROPERTY_INVALID_CWOBJ2407";

    /**
     * <pre>
     * # {0} invalid argument
     * INVALID_ARGUMENT_CWOBJ2408=CWOBJ2408E: The following argument is invalid: {0}
     * INVALID_ARGUMENT_CWOBJ2408.explanation=This argument is not a valid command line argument.
     * INVALID_ARGUMENT_CWOBJ2408.useraction=Only use valid arguments on the command line.
     * </pre>
     */
    public String INVALID_ARGUMENT_CWOBJ2408 = "INVALID_ARGUMENT_CWOBJ2408";

    /**
     * <pre>
     * # {0} Exception message
     * SERVER_STARTUP_EXCEPTION_CWOBJ2409=CWOBJ2409E: An exception occurred during server startup: {0}
     * SERVER_STARTUP_EXCEPTION_CWOBJ2409.explanation=An exception occurred during server startup.
     * SERVER_STARTUP_EXCEPTION_CWOBJ2409.useraction=Check the exception message.
     * </pre>
     */
    public String SERVER_STARTUP_EXCEPTION_CWOBJ2409 = "SERVER_STARTUP_EXCEPTION_CWOBJ2409";

    /**
     * <pre>
     * ACTIVATION_FAILURE_CWOBJ2410=CWOBJ2410E: ObjectGrid server failed to activate.
     * ACTIVATION_FAILURE_CWOBJ2410.explanation=A problem occurred which caused server activation to fail.
     * ACTIVATION_FAILURE_CWOBJ2410.useraction=Check the log for exceptions.
     * </pre>
     */
    public String ACTIVATION_FAILURE_CWOBJ2410 = "ACTIVATION_FAILURE_CWOBJ2410";

    /**
     * <pre>
     * INITIALIZATION_FAILURE_CWOBJ2411=CWOBJ2411E: ObjectGrid server failed to initialize.
     * INITIALIZATION_FAILURE_CWOBJ2411.explanation=A problem occurred which caused server initialization to fail.
     * INITIALIZATION_FAILURE_CWOBJ2411.useraction=Check the log for exceptions.
     * </pre>
     */
    public String INITIALIZATION_FAILURE_CWOBJ2411 = "INITIALIZATION_FAILURE_CWOBJ2411";

    /**
     * <pre>
     * BOOTSTRAP_FAILURE_CWOBJ2412=CWOBJ2412E: ObjectGrid server failed to bootstrap.
     * BOOTSTRAP_FAILURE_CWOBJ2412.explanation=A problem occurred which caused server bootstrap to fail.
     * BOOTSTRAP_FAILURE_CWOBJ2412.useraction=Check the log for exceptions.
     * </pre>
     */
    public String BOOTSTRAP_FAILURE_CWOBJ2412 = "BOOTSTRAP_FAILURE_CWOBJ2412";

    /**
     * <pre>
     * SERVER_STOP_UNSUCCESSFUL_CWOBJ2413=CWOBJ2413E: The attempt to stop the ObjectGrid server was unsuccessful.
     * SERVER_STOP_UNSUCCESSFUL_CWOBJ2413.explanation=A problem occurred during server shutdown.
     * SERVER_STOP_UNSUCCESSFUL_CWOBJ2413.useraction=Check the log for exceptions.
     * </pre>
     */
    public String SERVER_STOP_UNSUCCESSFUL_CWOBJ2413 = "SERVER_STOP_UNSUCCESSFUL_CWOBJ2413";

    /**
     * <pre>
     * FORCEFUL_TERMINATION_CWOBJ2414=CWOBJ2414E: The ObjectGrid server will be forcefully terminated.
     * FORCEFUL_TERMINATION_CWOBJ2414.explanation=A problem occurred during server shutdown.
     * FORCEFUL_TERMINATION_CWOBJ2414.useraction=Check the log for exceptions.
     * </pre>
     */
    public String FORCEFUL_TERMINATION_CWOBJ2414 = "FORCEFUL_TERMINATION_CWOBJ2414";

    /**
     * <pre>
     * # {0} Name of the script file that is being created
     * SCRIPT_CREATION_CWOBJ2415=CWOBJ2415I: Creating script file {0}
     * SCRIPT_CREATION_CWOBJ2415.explanation=A script file will be created in the OBJECTGRID_HOME directory.
     * SCRIPT_CREATION_CWOBJ2415.useraction=See the OBJECTGRID_HOME directory for the script file.
     * </pre>
     */
    public String SCRIPT_CREATION_CWOBJ2415 = "SCRIPT_CREATION_CWOBJ2415";

    /**
     * <pre>
     * # {0} the plugin class
     * # {1} the exception
     * PLUGIN_INSTANTIATION_ERROR_CWOBJ2416=CWOBJ2416E: Plugin {0} could not be instantiated and will not be set.  The exception is {1}
     * PLUGIN_INSTANTIATION_ERROR_CWOBJ2416.explanation=Plugin instantiation was not completed successfully.
     * PLUGIN_INSTANTIATION_ERROR_CWOBJ2416.useraction=See the accompanying exception.
     * </pre>
     */
    public String PLUGIN_INSTANTIATION_ERROR_CWOBJ2416 = "PLUGIN_INSTANTIATION_ERROR_CWOBJ2416";

    /**
     * <pre>
     * # {0} name of the deprecated attribute
     * DEPRECATED_CLUSTER_XML_ATTRIBUTE_CWOBJ2417=CWOBJ2417W: The {0} attribute on the objectgridBinding element has been deprecated in the cluster XML.  Use the {0} attribute on the serverDefinition element.
     * DEPRECATED_CLUSTER_XML_ATTRIBUTE_CWOBJ2417.explanation=This is no longer a valid attribute
     * DEPRECATED_CLUSTER_XML_ATTRIBUTE_CWOBJ2417.useraction=Do not use the deprecated attribute.  Use the attribute on the serverDefinition element.
     * </pre>
     */
    public String DEPRECATED_CLUSTER_XML_ATTRIBUTE_CWOBJ2417 = "DEPRECATED_CLUSTER_XML_ATTRIBUTE_CWOBJ2417";

    /**
     * <pre>
     * SERVER_LAUNCH_FAILED_CWOBJ2418=CWOBJ2418E: ObjectGrid server was not successfully launched.
     * SERVER_LAUNCH_FAILED_CWOBJ2418.explanation=A problem occurred during server startup.
     * SERVER_LAUNCH_FAILED_CWOBJ2418.useraction=Check the log for exceptions.
     * </pre>
     */
    public String SERVER_LAUNCH_FAILED_CWOBJ2418 = "SERVER_LAUNCH_FAILED_CWOBJ2418";

    /**
     * <pre>
     * # {0} default minThreadPoolSize
     * # do not translate minThreadPoolSize
     * MIN_THREADPOOL_SIZE_WARNING_CWOBJ2419=CWOBJ2419W: minThreadPoolSize cannot be less than 1.  The default value of {0} will be used.
     * MIN_THREADPOOL_SIZE_WARNING_CWOBJ2419.explanation=The minThreadPoolSize was set to a value less than 1.
     * MIN_THREADPOOL_SIZE_WARNING_CWOBJ2419.useraction=Set the minThreadPoolSize to a value equal to or greater than 1.
     * </pre>
     */
    public String MIN_THREADPOOL_SIZE_WARNING_CWOBJ2419 = "MIN_THREADPOOL_SIZE_WARNING_CWOBJ2419";

    /**
     * <pre>
     * # {0} minThreadPoolSize value
     * # {1} maxThreadPoolSize value
     * # {2} minThreadPoolSize default value
     * # {3} maxThreadPoolSize default value
     * # do not translate minThreadPoolSize and maxThreadPoolSize
     * MAX_THREADPOOL_SIZE_WARNING_CWOBJ2420=CWOBJ2420W: minThreadPoolSize is set to {0}. maxThreadPoolSize is set to {1}.  maxThreadPoolSize must be greater than minThreadPoolSize.  The default values will be used.  minThreadPoolSize = {2}, maxThreadPoolSize = {3}.
     * MAX_THREADPOOL_SIZE_WARNING_CWOBJ2420.explanation=maxThreadPoolSize must be greater than minThreadPoolSize.
     * MAX_THREADPOOL_SIZE_WARNING_CWOBJ2420.useraction=Set maxThreadPoolSize to a value greater than the minThreadPoolSize value.
     * </pre>
     */
    public String MAX_THREADPOOL_SIZE_WARNING_CWOBJ2420 = "MAX_THREADPOOL_SIZE_WARNING_CWOBJ2420";

    /**
     * <pre>
     * # {0} cluster name
     * # {1} element that will be removed
     * # do not translate List
     * # do not translate ObjectGridConfiguration
     * OVERRIDE_WARNING_CWOBJ2421=CWOBJ2421W: The List that was supplied to override client side ObjectGrid settings for cluster {0} contains an element that is not an ObjectGridConfiguration object.  This element will be removed from the List: {1}.
     * OVERRIDE_WARNING_CWOBJ2421.explanation=Client-side overriding will take place using only the objects in the List that are of type com.ibm.websphere.objectgrid.config.ObjectGridConfiguration.
     * OVERRIDE_WARNING_CWOBJ2421.useraction=Remove objects from the client-side override List that are not of type com.ibm.websphere.objectgrid.config.ObjectGridConfiguration.
     * </pre>
     */
    public String OVERRIDE_WARNING_CWOBJ2421 = "OVERRIDE_WARNING_CWOBJ2421";

    /**
     * <pre>
     * # {0} client host
     * # {1} client port
     * # {2} server host
     * # {3} server port
     * CHECKSUM_DIFFERENCE_CWOBJ2422=CWOBJ2422I: Configuration version on client may not be the same as configuration version used by this server. Client side: host = {0}, , port = {1}, , Server side: host = {2}, port = {3}.
     * CHECKSUM_DIFFERENCE_CWOBJ2422.explanation=An ObjectGrid client has connected to this server with a configuration version that is different than this server configuration version. This can occur when an ObjectGrid client bootstraps from one ObjectGrid server, and then contacts another server that was started with a different configuration file or the same configuration file with changes.
     * CHECKSUM_DIFFERENCE_CWOBJ2422.useraction=Users should have administrators compare the configuration files provided by each server to determine if the differences are incompatiable.
     * </pre>
     */
    public String CHECKSUM_DIFFERENCE_CWOBJ2422 = "CHECKSUM_DIFFERENCE_CWOBJ2422";

    /**
     * <pre>
     * # {0} cluster name
     * # {1} URL
     * CLIENT_OVERRIDE_URL_CWOBJ2423=CWOBJ2423I: Client side ObjectGrid settings will be overridden for cluster {0} using the URL {1}
     * CLIENT_OVERRIDE_URL_CWOBJ2423.explanation=Overriding ObjectGrids on the client side using ObjectGrids found in the URL.
     * CLIENT_OVERRIDE_URL_CWOBJ2423.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_OVERRIDE_URL_CWOBJ2423 = "CLIENT_OVERRIDE_URL_CWOBJ2423";

    /**
     * <pre>
     * # {0} cluster name
     * # do not translate overrideMap
     * CLIENT_OVERRIDE_MAP_CWOBJ2424=CWOBJ2424I: Client side ObjectGrid settings will be overridden for cluster {0} using an entry supplied in the overrideMap.
     * CLIENT_OVERRIDE_MAP_CWOBJ2424.explanation=ObjectGridConfigurations will be used to override client side settings for the cluster specified.
     * CLIENT_OVERRIDE_MAP_CWOBJ2424.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_OVERRIDE_MAP_CWOBJ2424 = "CLIENT_OVERRIDE_MAP_CWOBJ2424";

    /**
     * <pre>
     * # {0} cluster name
     * # do not translate the following: Map, java.util.List
     * CLIENT_OVERRIDE_MAP_ERROR_CWOBJ2425=CWOBJ2425E: The Map provided to override client side ObjectGrid settings for cluster {0} contains a value that is not of type java.util.List.  Client side ObjectGrid settings will not be overridden for this cluster.
     * CLIENT_OVERRIDE_MAP_ERROR_CWOBJ2425.explanation=Each value in the overrideMap must be of type java.util.List that contains ObjectGridConfiguration objects.
     * CLIENT_OVERRIDE_MAP_ERROR_CWOBJ2425.useraction=Make this value of type java.util.List
     * </pre>
     */
    public String CLIENT_OVERRIDE_MAP_ERROR_CWOBJ2425 = "CLIENT_OVERRIDE_MAP_ERROR_CWOBJ2425";

    /**
     * <pre>
     * CONTAINER_WITHOUT_ZONE_INVALID_CWOBJ2426=CWOBJ2426E: This ObjectGrid container has been started without a zone association.  This ObjectGrid container must be started within a zone since one or more containers in the domain already have been started within one or more zones.
     * CONTAINER_WITHOUT_ZONE_INVALID_CWOBJ2426.explanation=If ObjectGrid containers have already been started within zones in this domain, then no subsequent container can be started without an association to a zone in the domain.
     * CONTAINER_WITHOUT_ZONE_INVALID_CWOBJ2426.useraction=Start this container within a zone.
     * </pre>
     */
    public String CONTAINER_WITHOUT_ZONE_INVALID_CWOBJ2426 = "CONTAINER_WITHOUT_ZONE_INVALID_CWOBJ2426";

    /**
     * <pre>
     * CONTAINER_WITH_ZONE_INVALID_CWOBJ2427=CWOBJ2427E: This ObjectGrid container has been started with a zone association.  This ObjectGrid container must be started without a zone since one or more containers in the domain already have been started without a zone.
     * CONTAINER_WITH_ZONE_INVALID_CWOBJ2427.explanation=If ObjectGrid containers have already been started without zones in this domain, then no subsequent container can be started with an association to a zone in the domain.
     * CONTAINER_WITH_ZONE_INVALID_CWOBJ2427.useraction=Start the container without a zone.
     * </pre>
     */
    public String CONTAINER_WITH_ZONE_INVALID_CWOBJ2427 = "CONTAINER_WITH_ZONE_INVALID_CWOBJ2427";

    /**
     * <pre>
     * # {0} container name
     * ZONE_CONFIG_DEFAULT_INVALID_CWOBJ2428=CWOBJ2428W: The ObjectGrid container {0} has started without an association to a zone, but other containers have already started within zones.  {0} will be torn down.
     * ZONE_CONFIG_DEFAULT_INVALID_CWOBJ2428.explanation=If ObjectGrid containers have already been started within zones in this domain, then no subsequent container can be started without an association to a zone in the domain.
     * ZONE_CONFIG_DEFAULT_INVALID_CWOBJ2428.useraction=Start the container within a zone.
     * </pre>
     */
    public String ZONE_CONFIG_DEFAULT_INVALID_CWOBJ2428 = "ZONE_CONFIG_DEFAULT_INVALID_CWOBJ2428";

    /**
     * <pre>
     * # {0} container name
     * ZONE_CONFIG_CUSTOM_INVALID_CWOBJ2429=CWOBJ2429W: The ObjectGrid container {0} has started with an association to a zone, but other containers have already started without zone associations.  {0} will be torn down.
     * ZONE_CONFIG_CUSTOM_INVALID_CWOBJ2429.explanation=If ObjectGrid containers have already been started without zones in this domain, then no subsequent container can be started within a zone in the domain.
     * ZONE_CONFIG_CUSTOM_INVALID_CWOBJ2429.useraction=Start the container without a zone.
     * </pre>
     */
    public String ZONE_CONFIG_CUSTOM_INVALID_CWOBJ2429 = "ZONE_CONFIG_CUSTOM_INVALID_CWOBJ2429";

    /**
     * <pre>
     * # {0} zoneRule name
     * # {1} number of zones
     * # {2} number of shardMappings
     * ZONE_RULE_TOO_FEW_ZONES_CWOBJ2430=CWOBJ2430E: The zoneRule {0} contains too few zones ({1}) for the number of shardMappings ({2}) that use the zoneRule.
     * ZONE_RULE_TOO_FEW_ZONES_CWOBJ2430.explanation=If a zoneRule contains more than one zone, it must have at least as many zones as shardMappings that make use of the zoneRule.
     * ZONE_RULE_TOO_FEW_ZONES_CWOBJ2430.useraction=Add zones to the zoneRule or move shardMappings to different zoneRules.
     * </pre
     */
    public String ZONE_RULE_TOO_FEW_ZONES_CWOBJ2430 = "ZONE_RULE_TOO_FEW_ZONES_CWOBJ2430";

    /**
     * <pre>
     * # {0} zone name
     * # {1} mapSet name
     * # {2} ObjectGrid name
     * MAP_SET_NOT_CONFIGURED_FOR_ZONE_CWOBJ2431=CWOBJ2431E: The container was started in zone {0}, but the {1} mapSet for ObjectGrid {2} is not configured to run within this zone.
     * MAP_SET_NOT_CONFIGURED_FOR_ZONE_CWOBJ2431.explanation=The zone name that is used to start the container must be within a zoneRule used by one of the shardMappings for the mapSet.
     * MAP_SET_NOT_CONFIGURED_FOR_ZONE_CWOBJ2431.useraction=Ensure that the zone is used by each mapSet within the deploymentPolicy that was used to start the container.
     * </pre>
     */
    public String MAP_SET_NOT_CONFIGURED_FOR_ZONE_CWOBJ2431 = "MAP_SET_NOT_CONFIGURED_FOR_ZONE_CWOBJ2431";

    /**
     * <pre>
     * # {0} shard type
     * # {1} mapSet name
     * # {2} objectGrid name
     * # {3} number of shardMappings expected
     * # {4} number of shardMappings found
     * WRONG_NUMBER_SHARD_MAPPINGS_CWOBJ2432=CWOBJ2432E: The wrong number of {0} shardMappings were found for the {1} mapSet in the {2} ObjectGrid.  Expected {3} shardMappings, but found {4}.
     * WRONG_NUMBER_SHARD_MAPPINGS_CWOBJ2432.explanation=If the shard type is a replica, the number of shardMappings for the type should match the maximum number of replicas specified on the mapSet.  There should be only 1 primary shardMapping.
     * WRONG_NUMBER_SHARD_MAPPINGS_CWOBJ2432.useraction=Adjust the number of shardMappings for the shardType.
     * </pre>
     */
    public String WRONG_NUMBER_SHARD_MAPPINGS_CWOBJ2432 = "WRONG_NUMBER_SHARD_MAPPINGS_CWOBJ2432";

    /**
     * <pre>
     * # {0} domain name
     * # {1} URL
     * CLIENT_OVERRIDE_URL_CWOBJ2433=CWOBJ2433I: Client side ObjectGrid settings will be overridden for domain {0} using the URL {1}
     * CLIENT_OVERRIDE_URL_CWOBJ2433.explanation=Overriding ObjectGrids on the client side using ObjectGrids found in the URL.
     * CLIENT_OVERRIDE_URL_CWOBJ2433.useraction=No action is required.
     * </pre>
     */
    public String CLIENT_OVERRIDE_URL_CWOBJ2433 = "CLIENT_OVERRIDE_URL_CWOBJ2433";

    /**
     * <pre>
     * # {0} client side CopyMode
     * # {1} server side CopyMode
     * # {2} map name
     * # {3} ObjectGrid name
     * NEAR_CACHE_COPYMODE_NOT_COMPATIBLE_CWOBJ2434=CWOBJ2434E: Near-cache CopyMode, {0}, is not compatible with the server CopyMode, {1}, for the {2} map in the {3} ObjectGrid.
     * NEAR_CACHE_COPYMODE_NOT_COMPATIBLE_CWOBJ2434.explanation=The near-cache CopyMode cannot be bytes based if the server is POJO based, and only NO_COPY, COPY_TO_BYTES and COPY_TO_BYTES_RAW are supported when the server CopyMode is bytes based.
     * NEAR_CACHE_COPYMODE_NOT_COMPATIBLE_CWOBJ2434.useraction=Update the near-cache CopyMode to be compatible with the server side CopyMode.
     * </pre>
     */
    public String NEAR_CACHE_COPYMODE_NOT_COMPATIBLE_CWOBJ2434 = "NEAR_CACHE_COPYMODE_NOT_COMPATIBLE_CWOBJ2434";

    /**
     * <pre>
     * # {0} server side CopyMode
     * # {1} client side CopyMode
     * # {2} map name
     * # {3} ObjectGrid name
     * NEAR_CACHE_COPYMODE_OVERRIDDEN_CWOBJ2435=CWOBJ2435I: Near-cache CopyMode was changed from a server CopyMode, {0}, to the {1} CopyMode for the {2} map in the {3} ObjectGrid.
     * NEAR_CACHE_COPYMODE_OVERRIDDEN_CWOBJ2435.explanation=The CopyMode was updated on the near cache to be different from the CopyMode on the server.
     * NEAR_CACHE_COPYMODE_OVERRIDDEN_CWOBJ2435.useraction=No action is required.
     * </pre>
     */
    public String NEAR_CACHE_COPYMODE_OVERRIDDEN_CWOBJ2435 = "NEAR_CACHE_COPYMODE_OVERRIDDEN_CWOBJ2435";

    /**
     * <pre>
     * # {0} map name
     * # {1} ObjectGrid name
     * NEAR_CACHE_MARKED_READONLY_CWOBJ2436=CWOBJ2436I: The near cache was marked read only for the {0} map in the {1} ObjectGrid.
     * NEAR_CACHE_MARKED_READONLY_CWOBJ2436.explanation=The readOnly attribute was overridden on the client to make this client read only.
     * NEAR_CACHE_MARKED_READONLY_CWOBJ2436.useraction=No action is required.
     * </pre>
     */
    public String NEAR_CACHE_MARKED_READONLY_CWOBJ2436 = "NEAR_CACHE_MARKED_READONLY_CWOBJ2436";
    
    /**
     * <pre>
     * # {0} client side LockStrategy
     * # {1} server side LockStrategy
     * # {2} map name
     * # {3} ObjectGrid name
     * NEAR_CACHE_LOCKSTRATEGY_NOT_COMPATIBLE_CWOBJ2437=CWOBJ2437E: Near-cache LockStrategy, {0}, is not compatible with the server LockStrategy, {1}, for the {2} map in the {3} ObjectGrid.
     * NEAR_CACHE_LOCKSTRATEGY_NOT_COMPATIBLE_CWOBJ2437.explanation=The near-cache LockStrategy can only be overridden to NONE, OPTIMISTIC and OPTIMISTIC_NO_VERSIONING, if the server LockStrategy is OPTIMISTIC or OPTIMISTIC_NO_VERSIONING.
     * NEAR_CACHE_LOCKSTRATEGY_NOT_COMPATIBLE_CWOBJ2437.useraction=Update the near-cache LockStragegy to be compatible with the server side LockStrategy.
	 * </pre>
	 */
    public String NEAR_CACHE_LOCKSTRATEGY_NOT_COMPATIBLE_CWOBJ2437 = "NEAR_CACHE_LOCKSTRATEGY_NOT_COMPATIBLE_CWOBJ2437";
    
    
    /**
     * <pre>
     * # {0} serverName
     * SERVER_STARTUP_ERROR_CWOBJ2500=CWOBJ2500E: Failed to start ObjectGrid server {0}.
     * SERVER_STARTUP_ERROR_CWOBJ2500.explanation=The ObjectGrid server failed to start properly.
     * SERVER_STARTUP_ERROR_CWOBJ2500.useraction=Check the log for previous exceptions. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location.
     * </pre>
     */
    public String SERVER_STARTUP_ERROR_CWOBJ2500 = "SERVER_STARTUP_ERROR_CWOBJ2500";

    /**
     * <pre>
     * # {0} serverName
     * LAUNCHING_SERVER_CWOBJ2501=CWOBJ2501I: Launching ObjectGrid server {0}.
     * LAUNCHING_SERVER_CWOBJ2501.explanation=An ObjectGrid server is starting up.
     * LAUNCHING_SERVER_CWOBJ2501.useraction=No action is required.
     * </pre>
     */
    public String LAUNCHING_SERVER_CWOBJ2501 = "LAUNCHING_SERVER_CWOBJ2501";

    /**
     * <pre>
     * # {0} cluster xml file
     * # {1} objectgrid xml file
     * LAUNCHING_SERVER_XML_CWOBJ2502=CWOBJ2502I: Starting ObjectGrid server using ObjectGrid XML file URL {0} and Cluster XML file URL {1}.
     * LAUNCHING_SERVER_XML_CWOBJ2502.explanation=An ObjectGrid server is starting using a cluster XML file and an ObjectGrid xml file.
     * LAUNCHING_SERVER_XML_CWOBJ2502.useraction=No action is required.
     * </pre>
     */
    public String LAUNCHING_SERVER_XML_CWOBJ2502 = "LAUNCHING_SERVER_XML_CWOBJ2502";

    /**
     * <pre>
     * SERVER_BOOTSTRAP_LIST_CWOBJ2504=CWOBJ2504I: Attempting to bootstrap to a peer ObjectGrid server using the following host(s) and port(s) {0}.
     * SERVER_BOOTSTRAP_LIST_CWOBJ2504.explanation=This ObjectGrid server will use the list of hosts and ports provided in an attempt to connect to a peer ObjectGrid server.
     * SERVER_BOOTSTRAP_LIST_CWOBJ2504.useraction=No action is required.
     * </pre>
     */
    public String SERVER_BOOTSTRAP_LIST_CWOBJ2504 = "SERVER_BOOTSTRAP_LIST_CWOBJ2504";

    /**
     * <pre>
     * # {0} trace file specified
     * COMMAND_LINE_TRACE_FILE_CWOBJ2506=CWOBJ2506I: Trace is being logged to {0}.
     * COMMAND_LINE_TRACE_FILE_CWOBJ2506.explanation=The trace file has been set on the command line.
     * COMMAND_LINE_TRACE_FILE_CWOBJ2506.useraction=See the specified trace file for ObjectGrid server start-up trace.
     * </pre>
     */
    public String COMMAND_LINE_TRACE_FILE_CWOBJ2506 = "COMMAND_LINE_TRACE_FILE_CWOBJ2506";

    /**
     * <pre>
     * # {0} trace spec specified
     * COMMAND_LINE_TRACE_SPEC_CWOBJ2507=CWOBJ2507I: Trace specification is set to {0}.
     * COMMAND_LINE_TRACE_SPEC_CWOBJ2507.explanation=The trace specification has been set on the command line.
     * COMMAND_LINE_TRACE_SPEC_CWOBJ2507.useraction=No action is required.
     * </pre>
     */
    public String COMMAND_LINE_TRACE_SPEC_CWOBJ2507 = "COMMAND_LINE_TRACE_SPEC_CWOBJ2507";

    /**
     * <pre>
     * # {0} security properties file
     * LAUNCHING_SERVER_SECURITY_CWOBJ2508=CWOBJ2508I: A security properties file {0} has been specified and will be used to start the server.
     * LAUNCHING_SERVER_SECURITY_CWOBJ2508.explanation=A security properties file has been provided to start a secure server.
     * LAUNCHING_SERVER_SECURITY_CWOBJ2508.useraction=No action is required.
     * </pre>
     */
    public String LAUNCHING_SERVER_SECURITY_CWOBJ2508 = "LAUNCHING_SERVER_SECURITY_CWOBJ2508";

    /**
     * <pre>
     * # {0} timeout value in seconds
     * SERVER_STARTUP_TIMEOUT_CWOBJ2509=CWOBJ2509E: Timed out after waiting {0} seconds for the server to start.
     * SERVER_STARTUP_TIMEOUT_CWOBJ2509.explanation=The ObjectGrid server did not start within the timeout interval.
     * SERVER_STARTUP_TIMEOUT_CWOBJ2509.useraction=Check the log for previous exceptions. See the Logs and Trace section in the WebSphere eXtreme Scale documentation for JVM log location.
     * </pre>
     */
    public String SERVER_STARTUP_TIMEOUT_CWOBJ2509 = "SERVER_STARTUP_TIMEOUT_CWOBJ2509";

    /**
     * <pre>
     * # {0} server name
     * SERVER_STOP_CWOBJ2510=CWOBJ2510I: Stopping ObjectGrid server {0}.
     * SERVER_STOP_CWOBJ2510.explanation=Stopping ObjectGrid server.
     * SERVER_STOP_CWOBJ2510.useraction=No action is required.
     * </pre>
     */
    public String SERVER_STOP_CWOBJ2510 = "SERVER_STOP_CWOBJ2510";

    /**
     * <pre>
     * # {0} server name
     * SERVER_STOPPED_CWOBJ2512=CWOBJ2512I: ObjectGrid server {0} stopped.
     * SERVER_STOPPED_CWOBJ2512.explanation=ObjectGrid server stopped.
     * SERVER_STOPPED_CWOBJ2512.useraction=No action is required.
     * </pre>
     */
    public String SERVER_STOPPED_CWOBJ2512 = "SERVER_STOPPED_CWOBJ2512";

    /**
     * <pre>
     * SERVER_START_WAITING_CWOBJ2514=CWOBJ2514I: Waiting for ObjectGrid server activation to complete.
     * SERVER_START_WAITING_CWOBJ2514.explanation=The ObjectGrid server has launched.  Waiting for the server to complete activation.
     * SERVER_START_WAITING_CWOBJ2514.useraction=No action is required.
     * </pre>
     */
    public String SERVER_START_WAITING_CWOBJ2514 = "SERVER_START_WAITING_CWOBJ2514";

    /**
     * <pre>
     * # {0} new line
     * # {1} valid arguments
     * INVALID_ARGS_CWOBJ2515=CWOBJ2515E: The arguments provided are invalid. The following are valid arguments: {0}{1}
     * INVALID_ARGS_CWOBJ2515.explanation=The arguments provided to this script are not correct and the catalog server or container cannot be started.
     * INVALID_ARGS_CWOBJ2515.useraction=Review the valid arguments, check for spelling errors and submit again.
     * </pre>
     */
    public String INVALID_ARGS_CWOBJ2515 = "INVALID_ARGS_CWOBJ2515";

    /**
     * <pre>
    * # {0} serverName
    * LAUNCHING_CATALOG_SERVICE_CWOBJ2518I=CWOBJ2518I: Launching ObjectGrid catalog service {0} for domain {1} [{2}].
    * LAUNCHING_CATALOG_SERVICE_CWOBJ2518I.explanation=An ObjectGrid catalog service is starting up.
    * LAUNCHING_CATALOG_SERVICE_CWOBJ2518I..useraction=None. Informational entry.
     */
    public String LAUNCHING_CATALOG_SERVICE_CWOBJ2518I = "LAUNCHING_CATALOG_SERVICE_CWOBJ2518I";

    /**
     * <pre>
     * CWOBJ2519=CWOBJ2519I: The client interceptor has not been registered. Security will not be enabled.
     * CWOBJ2519.explanation=The client is running without the ObjectGrid initializer specified in the orb.properties file and/or does not have the ObjectGrid binaries available to the root classloader.
     * CWOBJ2519.useraction=If ObjectGrid authentication and authorization are desired, then a full ObjectGrid install is required.
     * </pre>
     */
    public String CWOBJ2519 = "CWOBJ2519";

    /**
     * <pre>
     * # {0} serverName
     * SERVER_NAME_NOT_FOUND_CWOBJ2520=CWOBJ2520E: Server reference for {0} not found in the supplied configuration, please verify provided server name.
     * SERVER_NAME_NOT_FOUND_CWOBJ2520.explanation=The server name provided to start this server could not be found. The server cannot be started.
     * SERVER_NAME_NOT_FOUND_CWOBJ2520.useraction=Correct the server name provided in the configuration or used to start the server.
     * </pre>
     */
    public String SERVER_NAME_NOT_FOUND_CWOBJ2520 = "SERVER_NAME_NOT_FOUND_CWOBJ2520";

    /**
     * <pre>
     *
     * # {0} the old catalog server bootstrap addresses
     * # {1} the new catalog server bootstrap addresses
     * CATALOG_CLUSTER_BOOTSTRAP_CHANGED_CWOBJ2521I=CWOBJ2521I: The catalog server bootstrap addresses changed from {0} to {1}.
     * CATALOG_CLUSTER_BOOTSTRAP_CHANGED_CWOBJ2521I.explanation=The catalog server bootstrap addresses changed. This could be because a new catalog server member joins the cluster, a new catalog server member leaves the cluster, or the catalog server cluster restarts with different bootstrap addresses.
     * CATALOG_CLUSTER_BOOTSTRAP_CHANGED_CWOBJ2521I.useraction=No action is required.
     */
    public String CATALOG_CLUSTER_BOOTSTRAP_CHANGED_CWOBJ2521I = "CATALOG_CLUSTER_BOOTSTRAP_CHANGED_CWOBJ2521I";

    /**
     * <pre>
     * # ---------------------------------
     * # {0} the new stats specification
     * STATSSPEC_CHANGED_CWOBJ2522I=CWOBJ2522I: The statistics specification has changed to: {0}.
     * STATSSPEC_CHANGED_CWOBJ2522I.explanation=The statistics specification can be updated using the StatsAccessor API and has been changed.
     * STATSSPEC_CHANGED_CWOBJ2522I.useraction=No action is required.
     * </pre>
     */
    public String STATSSPEC_CHANGED_CWOBJ2522I = "STATSSPEC_CHANGED_CWOBJ2522I";

    /**
     * <pre>
     * SERVER_STOP_CWOBJ2523I_SIGNAL=CWOBJ2523I:  Stopping this catalog or container server due to an external signal from the operating system.
     * SERVER_STOP_CWOBJ2523I_SIGNAL.explaination=Stopping this catalog or container server due to an external signal from the operating system.
     * SERVER_STOP_CWOBJ2523I_SIGNAL.useraction=No action is required

     * </pre>
     */
    public String SERVER_STOP_CWOBJ2523I_SIGNAL = "SERVER_STOP_CWOBJ2523I_SIGNAL";

    /**
     * <pre>
     * # {0} timeout
     * SERVER_TIMEOUT_STARTING_CWOBJ2524=CWOBJ2524E: The server failed to complete initialization after {0} minutes.
     * SERVER_TIMEOUT_STARTING_CWOBJ2524.explanation=There was an error during server initialization. The server did not start successfully.
     * SERVER_TIMEOUT_STARTING_CWOBJ2524.useraction=Review the JVM logs and FFDC for errors during server start. Ensure the server is using unique ports and a unique container name.
     * </pre>
     */
    public String SERVER_TIMEOUT_STARTING_CWOBJ2524 = "SERVER_TIMEOUT_STARTING_CWOBJ2524";
    
    /**
     * <pre>
     * # {0} the old catalog server bootstrap addresses
     * # {1} the new catalog server bootstrap addresses
     * ISLANDED_CLIENT_RECONNECT_CWOBJ2525I=CWOBJ2525I: After failing to connect to the working list of catalog bootstrap addresses, {0}, the catalog bootstrap list is reset to {1}.
     * ISLANDED_CLIENT_RECONNECT_CWOBJ2525I.explanation=All endpoints in the current list of catalog bootstrap addresses failed. The client reverted to a previous list of catalog bootstrap addresses and found viable endpoints.
     * ISLANDED_CLIENT_RECONNECT_CWOBJ2525I.useraction=No action is required.
     * </pre>
     */
    public String ISLANDED_CLIENT_RECONNECT_CWOBJ2525I = "ISLANDED_CLIENT_RECONNECT_CWOBJ2525I";
    
    /**
     * <pre>
     * # {0} the old catalog server bootstrap addresses
     * # {1} the new catalog server bootstrap addresses
     * # {2} bad endpoint
     * # {3} unknown domain name
     * # {4} expected domain name
     * ISLANDED_CLIENT_BADDOMAIN_CWOBJ2526I=CWOBJ2526I: After failing to connect to the working list of catalog bootstrap addresses, {0}, the following list is tried {1}. The endpoint {2} reported an unknown domain name, {3}, and is not used again. The expected domain name is {4}.
     * ISLANDED_CLIENT_BADDOMAIN_CWOBJ2526I.explanation=All endpoints in the current list of catalog bootstrap addresses failed. The client reverted to a previous list of catalog bootstrap addresses. And endpoint reported with a different domain name and is not used again.
     * ISLANDED_CLIENT_BADDOMAIN_CWOBJ2526I.useraction=No action is required.
     * </pre>
     */
    public String ISLANDED_CLIENT_BADDOMAIN_CWOBJ2526I = "ISLANDED_CLIENT_BADDOMAIN_CWOBJ2526I";

    /**
     * <pre>
     * # {0} the suffix
     * # {1} partition name
     * ADD_SUFFIX_TO_VIEW_NAME=CWOBJ2601I: Add suffix {0} to stream query views deployed in partition {1}.
     * ADD_SUFFIX_TO_VIEW_NAME.explanation=The stream query is executed to a partitioned map set, so we need to add partition name suffix to view names.
     * ADD_SUFFIX_TO_VIEW_NAME.useraction=No action is required.
     * </pre>
     */
    public String ADD_SUFFIX_TO_VIEW_NAME = "ADD_SUFFIX_TO_VIEW_NAME";

    /**
     * <pre>
     * #{0} the view name
     * VIEW_TRANSFORMER_EXISTS=CWOBJ2602W: The view transformer {0} has already existed.
     * VIEW_TRANSFORMER_EXISTS.explanation=The view transfomer has already been added. This case should not happen.
     * VIEW_TRANSFORMER_EXISTS.useraction=Please report to support team.
     * </pre>
     */
    public String VIEW_TRANSFORMER_EXISTS = "VIEW_TRANSFORMER_EXISTS";

    /**
     * <pre>
     * EXCEEDED_RETRY_UNPROJECT_CWOBJ2608=CWOBJ2608E: Exceeded retry attempts to publish the message, exception: {0}
     * EXCEEDED_RETRY_UNPROJECT_CWOBJ2608.explanation=While attempting to publish a message, it failed several times and exceeded the number of tries allowed.
     * EXCEEDED_RETRY_UNPROJECT_CWOBJ2608.useraction=Review the exception for any network or configuration related errors.
     * </pre>
     */
    public String EXCEEDED_RETRY_UNPROJECT_CWOBJ2608 = "EXCEEDED_RETRY_UNPROJECT_CWOBJ2608";

    /**
     * <pre>
     * CONTAINER_SCOPE_PER_CONTAINER_STRATEGY_ERROR=CWOBJ2609E: The combination of container scope and per container strategy were specified for map set {0}.
     * CONTAINER_SCOPE_PER_CONTAINER_STRATEGY_ERROR.explanation=The combination of container scope and per container strategy is not currently supported.
     * CONTAINER_SCOPE_PER_CONTAINER_STRATEGY_ERROR.useraction=Change either the placement scope or placement strategy.
     * </pre>
     */
    public String CONTAINER_SCOPE_PER_CONTAINER_STRATEGY_ERROR = "CONTAINER_SCOPE_PER_CONTAINER_STRATEGY_ERROR";

    /**
     * <pre>
     * CONTAINER_SCOPE_REPLICA_WARNING=CWOBJ2610W:  A replica setting greater than zero is specified with container scope for map set {0}.
     * CONTAINER_SCOPE_REPLICA_WARNING.explanation=With primaries on every container, replicas do not make sense with container scope.
     * CONTAINER_SCOPE_REPLICA_WARNING.useraction=The system will ignore the replica settings, forcing them to zero.  Change your config at the next opportunity.
     * </pre>
     */
    public String CONTAINER_SCOPE_REPLICA_WARNING = "CONTAINER_SCOPE_REPLICA_WARNING";

    /**
     * <pre>
     * CONTAINER_SCOPE_PARTITION_COUNT_WARNING=CWOBJ2611W: A partition count greater than one was specified on the container scoped map set {0}.
     * CONTAINER_SCOPE_PARTITION_COUNT_WARNING.explanation=Having more than one primary with a container scope map set is atyipcal.
     * CONTAINER_SCOPE_PARTITION_COUNT_WARNING.useraction=Review you configuration with IBM support to confirm if multiple partitions are useful with your container scoped map set.
     * </pre>
     */
    public String CONTAINER_SCOPE_PARTITION_COUNT_WARNING = "CONTAINER_SCOPE_PARTITION_COUNT_WARNING";

    /**
     * <pre>
     * # Do not translate:  ObjectGrid, EntityManager
     * EM_SERVICE_STARTED_CWOBJ3001I=CWOBJ3001I: The ObjectGrid EntityManager service is available to process requests for ObjectGrid: {0} and container or server: {1}
     * EM_SERVICE_STARTED_CWOBJ3001I.explanation=The EntityManager service can now accept requests.
     * EM_SERVICE_STARTED_CWOBJ3001I.useraction=No action is required.
     * </pre>
     */
    public String EM_SERVICE_STARTED_CWOBJ3001I = "EM_SERVICE_STARTED_CWOBJ3001I";

    /**
     * <pre>
     * # Do not translate: ObjectGrid
     * EM_INIT_ENTITIES_CWOBJ3002I=CWOBJ3002I: Initializing entity metadata for ObjectGrid: {0}
     * EM_INIT_ENTITIES_CWOBJ3002I.explanation=Entity metadata is being discovered and cached for use.
     * EM_INIT_ENTITIES_CWOBJ3002I.useraction=No action is required.
     * </pre>
     */
    public String EM_INIT_ENTITIES_CWOBJ3002I = "EM_INIT_ENTITIES_CWOBJ3002I";

    /**
     * <pre>
     * # Do not translate: ObjectGrid
     * EM_REGISTERED_CWOBJ3003I=CWOBJ3003I: Entity registered: {0}
     * EM_REGISTERED_CWOBJ3003I.explanation=The specified entity metadata has been successfully bound to the ObjectGrid infrastructure.
     * EM_REGISTERED_CWOBJ3003I.useraction=No action is required.
     * </pre>
     */
    public String EM_REGISTERED_CWOBJ3003I = "EM_REGISTERED_CWOBJ3003I";

    /**
     * <pre>
     * # Do not translate:  EntityManager
     * EM_REGISTER_EXCEPTION_CWOBJ3004E=CWOBJ3004E: An exception occurred while registering an entity: {0}
     * EM_REGISTER_EXCEPTION_CWOBJ3004E.explanation=An exception was detected when attempting to register an entity with the EntityManager service.
     * EM_REGISTER_EXCEPTION_CWOBJ3004E.useraction=Review the exception, resolve the error and retry the operation.
     * </pre>
     */
    public String EM_REGISTER_EXCEPTION_CWOBJ3004E = "EM_REGISTER_EXCEPTION_CWOBJ3004E";

    /**
     * <pre>
     * # Do not translate:  BackingMap
     * EM_CREATING_INDEX_CWOBJ3005I=CWOBJ3005I: Creating index {0} for entity BackingMap {1}, attribute {2}
     * EM_CREATING_INDEX_CWOBJ3005I.explanation=An index was not explicitly defined for an entity BackingMap and was automatically created.
     * EM_CREATING_INDEX_CWOBJ3005I.useraction=No action is required.
     * </pre>
     */
    public String EM_CREATING_INDEX_CWOBJ3005I = "EM_CREATING_INDEX_CWOBJ3005I";

    /**
     * <pre>
     * EM_UNSUPPORTED_INDEX_TYPE_CWOBJ3006E=CWOBJ3006E: The defined MapIndexPlugin type is unsupported for index: {0}, BackingMap: {1}, attribute: {2}.
     * EM_UNSUPPORTED_INDEX_TYPE_CWOBJ3006E.explanation=An index was created for an entity BackingMap but is not compatible with the EntityManager service
     * EM_UNSUPPORTED_INDEX_TYPE_CWOBJ3006E.useraction=Change the MapIndexPlugin to use a supported index configuration.
     * </pre>
     */
    public String EM_UNSUPPORTED_INDEX_TYPE_CWOBJ3006E = "EM_UNSUPPORTED_INDEX_TYPE_CWOBJ3006E";

    /**
     * <pre>
     * EM_LATE_REGISTRATION_CWOBJ3007E=CWOBJ3007E: Unable to register new entity {0} after ObjectGrid initialization has completed.
     * EM_LATE_REGISTRATION_CWOBJ3007E.explanation=New, non-subset entities must be defined prior to ObjectGrid initialization.
     * EM_LATE_REGISTRATION_CWOBJ3007E.useraction=Register the entities prior to initializing the ObjectGrid instance.
     * </pre>
     */
    public String EM_LATE_REGISTRATION_CWOBJ3007E = "EM_LATE_REGISTRATION_CWOBJ3007E";

    /**
     * <pre>
     * EM_BACKINGMAP_REASSOCIATION_CWOBJ3008E=CWOBJ3008E: BackingMap {0} is associated with entity {1} and cannot be reassociated with entity {2}
     * EM_BACKINGMAP_REASSOCIATION_CWOBJ3008E.explanation=A BackingMap can only be associated with a single entity type and cannot be reassigned.
     * EM_BACKINGMAP_REASSOCIATION_CWOBJ3008E.useraction=Review the entity metadata definitions and choose a name that is not in use.
     * </pre>
     */
    public String EM_BACKINGMAP_REASSOCIATION_CWOBJ3008E = "EM_BACKINGMAP_REASSOCIATION_CWOBJ3008E";

    /**
     * <pre>
     * EM_REPOSITORY_EXCEPTION_CWOBJ3009E=CWOBJ3009E: An exception occurred while communicating with the entity metadata repository: {0}
     * EM_REPOSITORY_EXCEPTION_CWOBJ3009E.explanation=An exception occurred while communicating with the entity metadata repository.
     * EM_REPOSITORY_EXCEPTION_CWOBJ3009E.useraction=Review the exception, resolve the error and retry the operation.
     * </pre>
     */
    public String EM_REPOSITORY_EXCEPTION_CWOBJ3009E = "EM_REPOSITORY_EXCEPTION_CWOBJ3009E";

    /**
     * <pre>
     * EM_INVALID_MAPSET_CWOBJ3010E=CWOBJ3010E: All entity BackingMaps must be members of a MapSet with the name: \"ENTITY_MAPSET\".
     * EM_INVALID_MAPSET_CWOBJ3010E.explanation=All entity BackingMaps must be defined in a single MapSet named ENTITY_MAPSET when using the EntityManager service in a clustered ObjectGrid.
     * EM_INVALID_MAPSET_CWOBJ3010E.useraction=Identify the entity BackingMaps and add them to the ENTITY_MAPSET MapSet.
     * </pre>
     */
    public String EM_INVALID_MAPSET_CWOBJ3010E = "EM_INVALID_MAPSET_CWOBJ3010E";

    /**
     * <pre>
     * # {0} - entity name
     * # {1} - entity class
     * # {2} - the error message
     * EM_METADATALISTENER_EXCEPTION_CWOBJ3011E=CWOBJ3011E:  Error creating entity metadata for entity {0} ({1}): {2}
     * EM_METADATALISTENER_EXCEPTION_CWOBJ3011E.explanation=The specified entity metadata could not be created due to the specified exception.
     * EM_METADATALISTENER_EXCEPTION_CWOBJ3011E.useraction=Review the exception, resolve the error and retry the operation.
     * </pre>
     */
    public String EM_METADATALISTENER_EXCEPTION_CWOBJ3011E = "EM_METADATALISTENER_EXCEPTION_CWOBJ3011E";

    /**
     * <pre>
     * # {0} - map set names, comma-delimited.
     * # Do not translate:  ObjectGrid, MapSet
     * EM_MULTIPLE_MAPSETS_CWOBJ3012E=CWOBJ3012E: Invalid entity MapSet configuration.  Only one entity MapSet is allowed.  Invalid MapSets: {0}
     * EM_MULTIPLE_MAPSETS_CWOBJ3012E.explanation=Only one MapSet with entities is allowed per ObjectGrid configuration
     * EM_MULTIPLE_MAPSETS_CWOBJ3012E.useraction=Consolidate all entities into a single MapSet and restart the server.
     * </pre>
     */
    // # 11/13/09 kristip Message no longer used
    // public String EM_MULTIPLE_MAPSETS_CWOBJ3012E = "EM_MULTIPLE_MAPSETS_CWOBJ3012E";
    /**
     * <pre>
     * # {0} - the entity failed to register
     * EM_MULTIPLE_MAPSETS_CWOBJ3013E=CWOBJ3013E: The EntityMetadata repository is not available.  Timeout threshold reached when trying to register the entity: {0}.
     * EM_MULTIPLE_MAPSETS_CWOBJ3013E.explanation=The runtime could not register the defined entities with the metadata repository.
     * EM_MULTIPLE_MAPSETS_CWOBJ3013E.useraction=Verify that there is at least one primary shard activated for the entity manager.
     * </pre>
     */
    public String EM_MULTIPLE_MAPSETS_CWOBJ3013E = "EM_MULTIPLE_MAPSETS_CWOBJ3013E";

    /**
     * <pre>
     * # {0} - shard name
     * # {1} - current state
     * # {2} - previous state
     * AVAILABILITY_STATE_CHANGED_CWOBJ3014=CWOBJ3014I: The availability state has changed for {0}.  The state is now {1}.  It was previously {2}.
     * AVAILABILITY_STATE_CHANGED_CWOBJ3014.explanation=The availability state for a shard has changed.
     * AVAILABILITY_STATE_CHANGED_CWOBJ3014.useraction=No action is required.
     * </pre>
     */
    public String AVAILABILITY_STATE_CHANGED_CWOBJ3014 = "AVAILABILITY_STATE_CHANGED_CWOBJ3014";

    /**
     * <pre>
     * # {0} - the entity failed to register
     * EM_MISSING_MAPSET_CWOBJ3015E=CWOBJ3015E: Invalid entity MapSet configuration.  Unable to find MapSet that contains a BackingMap for {0}
     * EM_MISSING_MAPSET_CWOBJ3015E.explanation=Each entity needs a BackingMap of the same name.
     * EM_MISSING_MAPSET_CWOBJ3015E.useraction=Verify that a BackingMap named {0} is defined in your configuration.
     * </pre>
     */
    public String EM_MISSING_MAPSET_CWOBJ3015E = "EM_MISSING_MAPSET_CWOBJ3015E";

    /**
     * <pre>
     * EM_SCHEMA_MAPSET_CROSSOVER_CWOBJ3016E=CWOBJ3016E: Invalid entity MapSet configuration. Entity {0} should be present in MapSet {1} but is actually present in {2}.
     * EM_SCHEMA_MAPSET_CROSSOVER_CWOBJ3016E.explanation=The entities for a logical schema must be contained in a single mapset.
     * EM_SCHEMA_MAPSET_CROSSOVER_CWOBJ3016E.useraction=Make sure that entities do not contain references to other Entities that exist in another mapset and restart the server.
     * </pre>
     */
    public String EM_SCHEMA_MAPSET_CROSSOVER_CWOBJ3016E = "EM_SCHEMA_MAPSET_CROSSOVER_CWOBJ3016E";

    /**
     * <pre>
     * FAILED_TO_VERIFY_ENTITY_CWOBJ3017E=CWOBJ3017E: An entity {0} has been defined in the entity descriptor XML file, but does not have an associated backing map of the same name defined.
     * FAILED_TO_VERIFY_ENTITY_CWOBJ3017E.explanation=Each entity is associated with a single backing map.  The backing map must be defined in the ObjectGrid configuration with the same name as the entity.
     * FAILED_TO_VERIFY_ENTITY_CWOBJ3017E.useraction=Verify that there is a backing map configured that matches the entity name and resubmit the operation.
     * </pre>
     */
    public String FAILED_TO_VERIFY_ENTITY_CWOBJ3017E = "FAILED_TO_VERIFY_ENTITY_CWOBJ3017E";

    /**
     * <pre>
     * # {0} the name of the object grid with the failure.
     * FAILED_TO_INIT_ENTITIES_CWOBJ3018E=CWOBJ3018E: Failed to initialize the Entities in ObjectGrid {0}.
     * FAILED_TO_INIT_ENTITIES_CWOBJ3018E.explanation=There was a problem loading and initialzing one more of the specified the Entity Classes.
     * FAILED_TO_INIT_ENTITIES_CWOBJ3018E.useraction=Make sure all your Entity Classes are on your classpath and check your Entity configuration for errors.
     * </pre>
     */
    public String FAILED_TO_INIT_ENTITIES_CWOBJ3018E = "FAILED_TO_INIT_ENTITIES_CWOBJ3018E";

    /**
     * <pre>
     * # {0} the name of the class that could not be loaded.
     * # {1} objectGrid name
     * FAILED_TO_LOAD_OG_CLASSES_CWOBJ3019E=CWOBJ3019E: The class {0} cannot be found for ObjectGrid {1}.
     * FAILED_TO_LOAD_OG_CLASSES_CWOBJ3019E.explanation=The classes specified could not be loaded or were not present on the classpath.
     * FAILED_TO_LOAD_OG_CLASSES_CWOBJ3019E.useraction=Update your configuration with the right class name or update your classpath or Java EE application module to include the necessary classes.
     * </pre>
     */
    public String FAILED_TO_LOAD_OG_CLASSES_CWOBJ3019E = "FAILED_TO_LOAD_OG_CLASSES_CWOBJ3019E";

    /**
     * <pre>
     * #---
     * # {0} - the ObjectMap name
     * # {1} - the partition number
     * # {2} - exception message.
     * WB_LOADER_INITIALIZATION_FAILED_CWOBJ3101E=CWOBJ3101E: The write-behind loader for map {0} on partition {1} failed to initialize with exception {2}.
     * WB_LOADER_INITIALIZATION_FAILED_CWOBJ3101E.explanation=The write-behind loader initialization failed. The session might not be initialized or the write behind queue map does not exist.
     * WB_LOADER_INITIALIZATION_FAILED_CWOBJ3101E.useraction=Review the exception for configuration errors or the log for prior errors. Correct any configuration errors and restarts the servers. See the Logs and Trace section in the information center for JVM log location. Otherwise, contact IBM Software Support.
     * </pre>
     */
    public String WB_LOADER_INITIALIZATION_FAILED_CWOBJ3101E = "WB_LOADER_INITIALIZATION_FAILED_CWOBJ3101E";

    /**
     * <pre>
     * # {0} - the ObjectMap name
     * # {1} - the partition number
     * # {2} - the failed update index
     * # {3} - the failed map key
     * # {4} - exception message.
     * WB_LOADER_FAILED_CWOBJ3102E=CWOBJ3102E: Loader fails to do a write-behind update to the database for map {0} partition {1}. A failed update is logged in the failed update map. The failed update index is {2}, and the failed map key is {3}. The exception causing the failed update was {4}.
     * WB_LOADER_FAILED_CWOBJ3102E.explanation=Loader fails to do a write-behind update to the database. It could be that the database is updated by other applications. The write-behind loader logs the failed update in the failed update map.
     * WB_LOADER_FAILED_CWOBJ3102E.useraction=Remove the failed update data from the failed update map, examine the exception, and compensate the failed update.
     * </pre>
     */
    public String WB_LOADER_FAILED_CWOBJ3102E = "WB_LOADER_FAILED_CWOBJ3102E";

    /**
     * <pre>
     * # {0} - the ObjectMap name
     * # {1} - the partition number
     * # {2} - exception message.
     * WB_LOADER_FAILED_CWOBJ3103E=CWOBJ3103E: The write-behind loader for map {0} on partition {1} failed to complete a transaction. The exception is {2}.
     * WB_LOADER_FAILED_CWOBJ3103E.explanation=The write-behind loader failed to complete a transaction. See exception for more details.
     * WB_LOADER_FAILED_CWOBJ3103E.useraction=Look at the exception and take appropriate actions to compensate this failure. See the Handling failed write-behind updates in the information center for more information on handling failed updates.
     * </pre>
     */
    public String WB_LOADER_FAILED_CWOBJ3103E = "WB_LOADER_FAILED_CWOBJ3103E";

    /**
     * <pre>
     * # {0} - the ObjectMap name
     * # {1} - the partition number
     * # {2} - exception message.
     * WB_LOADER_LOCKTIMEOUT_CWOBJ3104W=CWOBJ3104W: The write-behind loader for map {0} on partition {1} gets a lock timeout exception, {2}, when trying to switch the queue maps.
     * WB_LOADER_LOCKTIMEOUT_CWOBJ3104W.explanation=The write-behind loader gets a lock timeout exception when trying to flip the queue map states. See exception for more details.
     * WB_LOADER_LOCKTIMEOUT_CWOBJ3104W.useraction=A lock timeout exception may be normal in some cases. The write-behind loader recovers from the exception and will try to switch the queue maps later. If this problem continues happening, try to increase the lock timeout value, or contact IBM Software Support.
     * </pre>
     */
    public String WB_LOADER_LOCKTIMEOUT_CWOBJ3104W = "WB_LOADER_LOCKTIMEOUT_CWOBJ3104W";

    /**
     * <pre>
     * # {0} - the ObjectGrid name
     * # {1} - the ObjectMap name
     * # {2} - the partition number
     * # {3} - the exception message
     * WB_LOADER_LOADER_NOT_AVAILABLE_CWOBJ3105E=CWOBJ3105E: The write-behind loader of ObjectGrid {0} map {1} partition {2} receives a loader not available exception: {3}
     * WB_LOADER_LOADER_NOT_AVAILABLE_CWOBJ3105E.explanation=The write-behind loader catches a LoaderNotAvailableException. The write-behind loader will try to update the loader in an interval basis.
     * WB_LOADER_LOADER_NOT_AVAILABLE_CWOBJ3105E.useraction=Examine the exception to find the root problem and correct it. Most likely, it could be that the network is down, database is down, or the database runs out of resources.
     * </pre>
     */
    public String WB_LOADER_LOADER_NOT_AVAILABLE_CWOBJ3105E = "WB_LOADER_LOADER_NOT_AVAILABLE_CWOBJ3105E";

    /**
     * <pre>
     * # {0} - the ObjectGrid name
     * # {1} - the ObjectMap name
     * # {2} - the partition number
     * # {3} - the transaction time
     * # {4} - loader batch update time
     * WB_LOADER_LONG_TRAN_COMMIT_CWOBJ3106W=CWOBJ3106W: The write-behind loader for ObjectGrid {0}, map {1} on partition {2} committed a {3} ms long transaction when removing the data from the queue map and batch updating to the loader. Within this eXtreme Scale transaction, the loader batch update takes {4} ms. The possible causes are: 1) The data store backend cannot keep up. Considering tuning database and using connection pool. 2) The write-behind parameter update count is too big or update time is too long. Consider decreasing the write-behind parameter value.
     * WB_LOADER_LONG_TRAN_ROLLBACK_CWOBJ3106W=CWOBJ3106W: The write-behind loader for ObjectGrid {0}, map {1} on partition {2} rolled back a {3} ms long transaction when removing the data from the queue map and batch updating to the loader. Within this eXtreme Scale transaction, the loader batch update takes {4} ms. The possible causes are: 1) The data store backend cannot keep up. Considering tuning database and using connection pool. 2) The write-behind parameter update count is too big or update time is too long. Consider decreasing the write-behind parameter value.
     * WB_LOADER_LONG_TRAN_CWOBJ3106W.explanation=The write-behind loader transaction takes a long time to complete. This normally indicates some tuning is needed. The possible causes are: 1) The data store backend cannot keep up. Considering tuning database and using connection pool. 2) The write-behind parameter update count is too big or update time is too long. Consider decreasing the write-behind parameter value.
     * WB_LOADER_LONG_TRAN_CWOBJ3106W.useraction=Tune database and use connection pool. And consider decreasing the write-behind parameter value.
     * </pre>
     */
    public String WB_LOADER_LONG_TRAN_COMMIT_CWOBJ3096W = "WB_LOADER_LONG_TRAN_COMMIT_CWOBJ3096W";

    public String WB_LOADER_LONG_TRAN_ROLLBACK_CWOBJ3097W = "WB_LOADER_LONG_TRAN_ROLLBACK_CWOBJ3097W";

    /**
     * <pre>
     * # {0} - the ObjectGrid name
     * # {1} - the ObjectMap name
     * # {2} - the partition number
     * # {3} - the transaction time
     * # {4} - the transaction timeout value
     * # {5} - loader batch update time
     * WB_LOADER_SMALL_TRAN_TIMEOUT_COMMIT_CWOBJ3107W=CWOBJ3107W: The write-behind loader for ObjectGrid {0}, map {1} on partition {2} committed a {3} ms long transaction, which is approaching to the transaction timeout value {4} ms. Within this eXtreme Scale transaction, the loader batch update takes {5} ms. The transaction timeout value is probably too small. Consider increasing the transction timeout value.
     * WB_LOADER_SMALL_TRAN_TIMEOUT_ROLLBACK_CWOBJ3107W=CWOBJ3107W: The write-behind loader for ObjectGrid {0}, map {1} on partition {2} rolled back a {3} ms long transaction, which is approaching to the transaction timeout value {4} ms. Within this eXtreme Scale transaction, the loader batch update takes {5} ms. The transaction timeout value is probably too small. Consider increasing the transction timeout value.
     * WB_LOADER_SMALL_TRAN_TIMEOUT_CWOBJ3107W.explanation=The transaction timeout value is probably too small. Consider increasing the transction timeout value.
     * WB_LOADER_SMALL_TRAN_TIMEOUT_CWOBJ3107W.useraction=Increase the transaction timeout value.
     * </pre>
     */
    public String WB_LOADER_SMALL_TRAN_TIMEOUT_COMMIT_CWOBJ3098W = "WB_LOADER_SMALL_TRAN_TIMEOUT_COMMIT_CWOBJ3098W";

    public String WB_LOADER_SMALL_TRAN_TIMEOUT_ROLLBACK_CWOBJ3099W = "WB_LOADER_SMALL_TRAN_TIMEOUT_ROLLBACK_CWOBJ3099W";

    /**
     * <pre>
     * # {0} - the ObjectGrid name
     * # {1} - the ObjectMap name
     * # {2} - the partition number
     * # {3} - exception
     * WB_LOADER_REPLICA_UNAVAILABLE_CWOBJ3108E=CWOBJ3108E: The write-behind loader of ObjectGrid {0}, map {1} on partition {2} received a ReplicationVotedToRollbackTransactionException: {3}
     * WB_LOADER_REPLICA_UNAVAILABLE_CWOBJ3108E.explanation=The required minimum number of sync replicas did not successfully commit the write-behind transaction and voted to rollback the transaction.
     * WB_LOADER_REPLICA_UNAVAILABLE_CWOBJ3108E.useraction=If a failover recently occured, a sync replica may be in the process of being replaced on another container. Review the container placement status and the route table availability with the xsadmin tool or administrative tools.
     * </pre>
     */
    public String WB_LOADER_REPLICA_UNAVAILABLE_CWOBJ3108E = "WB_LOADER_REPLICA_UNAVAILABLE_CWOBJ3108E";

    /**
     * <pre>
     * # {0} the data grid agent name
     * # {1} exception mesasge
     * CLIENT_LOADER_AGENT_FAIL_CWOBJ3111E=CWOBJ3111E: The client loader agent {0} execution fails with exception: {1}.
     * CLIENT_LOADER_AGENT_FAIL_CWOBJ3111E.explanation=The client loader agent execution fails. The agent will be re-executed for a certain number of times.
     * CLIENT_LOADER_AGENT_FAIL_CWOBJ3111E.useraction=No action is required unless the agent fails permanently with a later exception.
     * </pre>
     */
    public String CLIENT_LOADER_AGENT_FAIL_CWOBJ3111E = "CLIENT_LOADER_AGENT_FAIL_CWOBJ3111E";

    /**
     * <pre>
    * # {0} the persistent unit name
    * # Do not translate:   JPA, ObjectGrid, persistence.xml.
    * DEFAULT_PERSISTENCE_UNIT_CWOBJ3112I=CWOBJ3112I: A JPA persistence unit name was not specified. The first persistence unit {0} defined in the persistence.xml will used as the default persistence unit.
    * DEFAULT_PERSISTENCE_UNIT_CWOBJ3112I.explanation=The JPA persistence unit name was not provided to the method using the persistence.xml. By default, eXtreme Scale will use the first persistence unit defined in the persistence.xml.
    * DEFAULT_PERSISTENCE_UNIT_CWOBJ3112I.useraction=No action is required if the first persistence unit isacceptable. Otherwise, specify a persistence unit name when calling methods with the persistence unit name parameter (for example, ClienterLoader#Load).
    * </pre>
     **/
    public String DEFAULT_PERSISTENCE_UNIT_CWOBJ3112I = "DEFAULT_PERSISTENCE_UNIT_CWOBJ3112I";

    /**
     * <pre>
     * # {0} the data grid agent name
     * # {1} exception mesasge
     * # Do not translate:   DataGrid
     * AGENT_FAIL_CWOBJ3113E=CWOBJ3113E: The DataGrid agent {0} execution failed with a exception {1}.
     * AGENT_FAIL_CWOBJ3113E.explanation=The DataGrid agent execution failed with a fatal non-retryable exception.
     * AGENT_FAIL_CWOBJ3113E.useraction=Examine the exception and agent implementation for possible causes.
     * </pre>
     */
    public String AGENT_FAIL_CWOBJ3113E = "AGENT_FAIL_CWOBJ3113E";

    /**
     * <pre>
     * # {0} the data grid agent name
     * # {1} exception mesasge
     * AGENT_FAIL_RETRYABLE_CWOBJ3114E=CWOBJ3114E: The DataGrid agent {0} execution failed with a retryable exception {1}.
     * AGENT_FAIL_RETRYABLE_CWOBJ3114E.explanation=The DataGrid agent execution failed with a retryable exception. The agent will be tried again automatically.
     * AGENT_FAIL_RETRYABLE_CWOBJ3114E.useraction=No action is required unless there is a configuration exception that needs to be corrected.
     * </pre>
     */
    public String AGENT_FAIL_RETRYABLE_CWOBJ3114E = "AGENT_FAIL_RETRYABLE_CWOBJ3114E";

    /**
     * <pre>
     * # {0} expected state
     * # {1} current state
     * UNEXPECTED_SHARD_STATE_CWOBJ3115E=CWOBJ3115E: The shard is expected to be in the {0} state, but currently it is in the {1} state. If you have already set the shard to the {0} state, it might take a while for it to move to the target state. If you have not set the shard to the {0} state, revise your application to do so.
     * UNEXPECTED_SHARD_STATE_CWOBJ3115E.explanation=The shard state is not expected. It might take a while for a shard to move to the target state.
     * UNEXPECTED_SHARD_STATE_CWOBJ3115E.useraction=Update the application to set the shard state to the expected state if necessary. Otherwise, no action is required. The state will be automatically checked again.
     * </pre>
     */
    public String UNEXPECTED_SHARD_STATE_CWOBJ3115E = "UNEXPECTED_SHARD_STATE_CWOBJ3115E";

    /**
     * <pre>
     * # {0} the ObjectGrid name
     * # {1} the map name
     * # {2} the partition number
     * PRELOAD_STARTS_CWOBJ3116I=CWOBJ3116I: Preloading ObjectGrid {0} Map {1} at partition {2} started.
     * PRELOAD_STARTS_CWOBJ3116I.explanation=The preload started.
     * PRELOAD_STARTS_CWOBJ3116I.useraction=No action is required.
     * </pre>
     */
    public String PRELOAD_STARTS_CWOBJ3116I = "PRELOAD_STARTS_CWOBJ3116I";

    /**
     * <pre>
     * # {0} the ObjectGrid name
     * # {1} the map name
     * # {2} the partition number
     * PRELOAD_FINISHES_CWOBJ3117I=CWOBJ3117I: Preloading ObjectGrid {0} Map {1} at partition {2} finished.
     * PRELOAD_FINISHES_CWOBJ3117I.explanation=The preload finished.
     * PRELOAD_FINISHES_CWOBJ3117I.useraction=No action is required.
     * </pre>
     */
    public String PRELOAD_FINISHES_CWOBJ3117I = "PRELOAD_FINISHES_CWOBJ3117I";

    /**
     * <pre>
     * # {0} the ObjectGrid name
     * # {1} the map name
     * # {2} the partition number
     * # {3} the exception
     * PRELOAD_FAILS_CWOBJ3118E=CWOBJ3118E: Failed to preload ObjectGrid {0} Map {1} at partition {2} with the exception {3}.
     * PRELOAD_FAILS_CWOBJ3118E.explanation=The preload failed with an exception.
     * PRELOAD_FAILS_CWOBJ3118E.useraction=Review the exception for any database configuration errors, network exceptions or other errors. Correct them and retry the preload.
     * </pre>
     */
    public String PRELOAD_FAILS_CWOBJ3118E = "PRELOAD_FAILS_CWOBJ3118E";

    /**
     * <pre>
     * # {0} exception message
     * TIME_BASED_DBUPDATE_AGENT_FAIL_CWOBJ3121E=CWOBJ3121E: The time-based database update agent fails with exception {0}.
     * TIME_BASED_DBUPDATE_AGENT_FAIL_CWOBJ3121E.explanation=The time-based database update agent execution fails. The agent will be re-executed for a certain number of times.
     * TIME_BASED_DBUPDATE_AGENT_FAIL_CWOBJ3121E.useraction=No action is required unless there is a configuration exception that needs to be corrected.
     * </pre>
     */
    public String TIME_BASED_DBUPDATE_AGENT_FAIL_CWOBJ3121E = "TIME_BASED_DBUPDATE_AGENT_FAIL_CWOBJ3121E";

    /**
     * <pre>
     * # {0} exception message
     * TIME_BASED_DBUPDATE_FAIL_CWOBJ3122E=CWOBJ3122E: The time-based database update fails with exception {0}.
     * TIME_BASED_DBUPDATE_FAIL_CWOBJ3122E.explanation=The time-based database update fails. The update will be tried again.
     * TIME_BASED_DBUPDATE_FAIL_CWOBJ3122E.useraction=No action is required unless there is a configuration exception that needs to be corrected.
     * </pre>
     */
    public String TIME_BASED_DBUPDATE_FAIL_CWOBJ3122E = "TIME_BASED_DBUPDATE_FAIL_CWOBJ3122E";

    /**
     * <pre>
     * # {0} exception message
     * UNEXPECTED_CONNECTION_TYPE_CWOBJ3130E=CWOBJ3130E: Unable to set the connection information because an unexpected connection type was detected: {0}
     * UNEXPECTED_CONNECTION_TYPE_CWOBJ3130E.explanation=An unexpected connection type was detected.
     * UNEXPECTED_CONNECTION_TYPE_CWOBJ3130E.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String UNEXPECTED_CONNECTION_TYPE_CWOBJ3130E = "UNEXPECTED_CONNECTION_TYPE_CWOBJ3130E";

    /**
     * <pre>
     * JPA_TX_CALLBACK_NOT_FOUND_CWOBJ3131E=CWOBJ3131E: The JPATxCallback transaction callback plug-in cannot be found.
     * JPA_TX_CALLBACK_NOT_FOUND_CWOBJ3131E.explanation=When using JPALoader or JPAEntityLoader, the JPATxCallback transaction callback plug-in is expected to be configured on the ObjectGrid.
     * JPA_TX_CALLBACK_NOT_FOUND_CWOBJ3131E.useraction=Configure the JPATxCallback transaction callback plug-in on the ObjectGrid. See the Configuring JPA loaders section in the WebSphere eXtreme Scale documentation for more information on configuring the JPATxCallback transaction callback plug-in.
     * </pre>
     */
    public String JPA_TX_CALLBACK_NOT_FOUND_CWOBJ3131E = "JPA_TX_CALLBACK_NOT_FOUND_CWOBJ3131E";

    /**
     * <pre>
     * # {0} the JPA persistence unit name.
     * # {1} the property map for customizing the JPA EntityManagerFactory
     * EMF_NOT_FOUND_CWOBJ3132E=CWOBJ3132E: The JPA EntityManagerFactory with persistence unit name {0} and property map (1) cannot be found.
     * EMF_NOT_FOUND_CWOBJ3132E.explanation=The JPA EntityManagerFactory cannot be found. This should not happen. It might indicate an internal error.
     * EMF_NOT_FOUND_CWOBJ3132E.useraction=Contact IBM support for assistance.
     * </pre>
     */
    public String EMF_NOT_FOUND_CWOBJ3132E = "EMF_NOT_FOUND_CWOBJ3132E";

    /**
     * <pre>
     * # {0} exception
     * OBJECTGRID_CACHE_INITIALIZE_OBJECTGRID_FAILED_CWOBJ3133E=CWOBJ3133E: ObjectGrid cache plugin initializes ObjectGrid failed: {0}
     * OBJECTGRID_CACHE_INITIALIZE_OBJECTGRID_FAILED_CWOBJ3133E.explanation=An exception occurred while attempting to initialize ObjectGrid for an ObjectGrid cache plugin. It could be caused by problems during creating ObjectGrid server and container, connecting to catalog service, duplicate ObjectGrid name, and so on.
     * OBJECTGRID_CACHE_INITIALIZE_OBJECTGRID_FAILED_CWOBJ3133E.useraction=Review the exception provided.
     * </pre>
     */
    public String OBJECTGRID_CACHE_INITIALIZE_OBJECTGRID_FAILED_CWOBJ3133E = "OBJECTGRID_CACHE_INITIALIZE_OBJECTGRID_FAILED_CWOBJ3133E";

    /**
     * <pre>
     * # {0} ObjectGrid type
     * # {1} number of replicas
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_CWOBJ3134I=CWOBJ3134I: The ObjectGrid type is {0} and the default maximum number of replicas is {1}.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_CWOBJ3134I.explanation=To avoid poor performance in JVMs, the configured ObjectGrid type requires that the maximum number of replicas to be greater than or equal to the number of JVMs in the system.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_CWOBJ3134I.useraction=The maximum number of replicas must be greater than or equal to the number of JVMs in the system. Adjust the number of replicas in the deployment policy. in the deployment policy. See the information about configuring deployment policies section in the information center for more information on details about deployment policies.
     * </pre>
     */
    public String OBJECTGRID_CACHE_TYPE_EMBEDDED_CWOBJ3134I = "OBJECTGRID_CACHE_TYPE_EMBEDDED_CWOBJ3134I";

    /**
     * <pre>
     * # {0} ObjectGrid type
     * # {1} number of partitions
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_PARTITION_CWOBJ3135I=CWOBJ3135I: The ObjectGridType is {0} and the default number of partitions is {1}. Please ensure the number of partitions is equal to or less than the number of JVMs in the system.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_PARTITION_CWOBJ3135I.explanation=The configured ObjectGrid type requires the number of partitions is equal to or less than the number of JVMs in the system; otherwise, poor performance might occur.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_PARTITION_CWOBJ3135I.useraction=Verify the property of number of partitions is equal to or less than the number of JVMs in the system.
     * </pre>
     */
    public String OBJECTGRID_CACHE_TYPE_EMBEDDED_PARTITION_CWOBJ3135I = "OBJECTGRID_CACHE_TYPE_EMBEDDED_PARTITION_CWOBJ3135I";

    /*
     * <pre>
     * # {0} ObjectGrid type
     * # {1} replication scope
     * # {2} scope topology
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_INTERDOMAIN_CWOBJ3136I=CWOBJ3136I: The ObjectGrid type is {0}.  The placement scope is {1} and the scope topology is {2}.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_INTERDOMAIN_CWOBJ3136I.explanation=This is an informational message describing how the JPA Grid is configured.
     * OBJECTGRID_CACHE_TYPE_EMBEDDED_INTERDOMAIN_CWOBJ3136I.useraction=No user action required.
     *  </pre>
     */
    public String OBJECTGRID_CACHE_TYPE_EMBEDDED_INTERDOMAIN_CWOBJ3136I = "OBJECTGRID_CACHE_TYPE_EMBEDDED_INTERDOMAIN_CWOBJ3136I";

    /**
     * <pre>
     * # Do not translate:  WebSphere, eXtreme, Scale or WebSphere Application Server
     * # 5/13/10 jaredp Message no longer used
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3141W=CWOBJ3141W: This WebSphere Application Server is not associated with a WebSphere eXtreme Scale zone.  In order to start the server in a zone, ensure that the server's node is within a node group whose name begins with the string ReplicationZone.
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3141W.explanation=A WebSphere Application Server's node must be within a nodegroup whose name begins with ReplicationZone in order for that server to be placed into a WebSphere eXtreme Scale zone.
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3141W.useraction=In order to start the WebSphere Application Server in a WebSphere eXtreme Scale zone, ensure that the server's node is within a node group whose name begins with the string ReplicationZone. See the Zone-preferred routing section in the WebSphere eXtreme Scale documentation for more information on zones.
     * </pre>
     */
    public String NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3141W = "NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3141W";

    /**
     * <pre>
     * # b19612: This is an exact copy of CWOBJ3141W, except that it is marked informational
     * # Do not translate:  WebSphere, eXtreme, Scale or WebSphere Application Server
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3142I=CWOBJ3142I: This WebSphere Application Server is not associated with a WebSphere eXtreme Scale zone.  In order to start the server in a zone, ensure that the server's node is within a node group whose name begins with the string ReplicationZone.
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3142I.explanation=A WebSphere Application Server's node must be within a nodegroup whose name begins with ReplicationZone in order for that server to be placed into a WebSphere eXtreme Scale zone.
     * NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3142I.useraction=In order to start the WebSphere Application Server in a WebSphere eXtreme Scale zone, ensure that the server's node is within a node group whose name begins with the string ReplicationZone. See the Zone-preferred routing section in the WebSphere eXtreme Scale documentation for more information on zones.
     * </pre>
     */
    public String NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3142I = "NODEGROUP_NOT_SET_FOR_ZONE_SUPPORT_CWOBJ3142I";

    /**
     * <pre>
     * # {0} timeout in milliseconds
     * CLEAR_TIMED_OUT_CWOBJ3150=CWOBJ3150E: Clear times out after {0} ms.
     * CLEAR_TIMED_OUT_CWOBJ3150.explanation=Clear command has timed out because server is not responsive or an exception has occurred on the server.
     * CLEAR_TIMED_OUT_CWOBJ3150.useraction=Ensure servers are online, examine servers' FFDC logs, and resubmit the clear command.
     * </pre>
     */
    public String CLEAR_TIMED_OUT_CWOBJ3150 = "CLEAR_TIMED_OUT_CWOBJ3150";

    /**
     * <pre>
     * # {0} the name of the bean factory that failed to register.
     * # {1} the name of the object grid.
     * # {2} the exception
     * FAILED_TO_REGISTER_BEAN_FACTORY_CWOBJ3175E=CWOBJ3175E: An exception occurred when registering Spring bean factory {0} with the ObjectGrid {1}: {2}
     * FAILED_TO_REGISTER_BEAN_FACTORY_CWOBJ3175E.explanation=The Spring bean factory specified could not be registered with the ObjectGrid.
     * FAILED_TO_REGISTER_BEAN_FACTORY_CWOBJ3175E.useraction=Update your configuration with the right factory name or update your classpath or Java EE application module to include the necessary classes.
     * </pre>
     */
    public String FAILED_TO_REGISTER_BEAN_FACTORY_CWOBJ3175E = "FAILED_TO_REGISTER_BEAN_FACTORY_CWOBJ3175E";

    /**
     * <pre>
     * # {0} the name of the object grid.
     * # {1} the exception
     * FAILED_TO_GET_BEAN_FACTORY_CWOBJ3176E=CWOBJ3176E: An exception occurred when loading Spring bean factory with the ObjectGrid {0}: {1}.
     * FAILED_TO_GET_BEAN_FACTORY_CWOBJ3176E.explanation=The Spring bean factory specified could not be found.
     * FAILED_TO_GET_BEAN_FACTORY_CWOBJ3176E.useraction=Update your configuration with the right class name or update your classpath or Java EE application module to include the necessary classes.
     * </pre>
     */
    public String FAILED_TO_GET_BEAN_FACTORY_CWOBJ3176E = "FAILED_TO_GET_BEAN_FACTORY_CWOBJ3176E";

    /**
     * <pre>
     * FAILED_TO_LOCATE_OBJECTGRID_XML_FILE_CWOBJ3177E=CWOBJ3177E: Failed to locate the ObjectGrid XML file.
     * FAILED_TO_LOCATE_OBJECTGRID_XML_FILE_CWOBJ3177E.explanation=There was a problem locating the specified ObjectGrid XML.
     * FAILED_TO_LOCATE_OBJECTGRID_XML_FILE_CWOBJ3177E.useraction=Update your configuration with the right file name and esnure the file is in the location specified.
     * </pre>
     */
    public String FAILED_TO_LOCATE_OBJECTGRID_XML_FILE_CWOBJ3177E = "FAILED_TO_LOCATE_OBJECTGRID_XML_FILE_CWOBJ3177E";

    /**
     * <pre>
     * # {1} the name of missing backing map
     * # {0} the name of the object grid.
     * BACKING_MAP_NOT_FOUND_IN_OBJECTGRID_XML_CWOBJ3178E=CWOBJ3178E: The map {1} in ObjectGrid {0} referenced in the ObjectGrid XML was not found in the deployment descriptor file.
     * BACKING_MAP_NOT_FOUND_IN_OBJECTGRID_XML_CWOBJ3178E.explanation=An entry was found for a backing map in the ObjectGrid XML file but not the deployment descriptor XML file.
     * BACKING_MAP_NOT_FOUND_IN_OBJECTGRID_XML_CWOBJ3178E.useraction=Add the backing map to the proper mapset in the deployment descriptor XML file or remove the entry from the ObjectGrid XML file.
     * </pre>
     */
    public String BACKING_MAP_NOT_FOUND_IN_OBJECTGRID_XML_CWOBJ3178E = "BACKING_MAP_NOT_FOUND_IN_OBJECTGRID_XML_CWOBJ3178E";

    /**
     * <pre>
     * # {0} the name of map
     * # {1} the name of the mapSet
     * # the {2} ObjectGrid deployment descriptor
     * INVALID_BACKING_MAP_IN_DEPLOYMENT_XML_CWOBJ3179E=CWOBJ3179E: The {0} map reference in the {1} mapSet of {2} ObjectGrid deployment descriptor file does not reference a valid backing map from the ObjectGrid XML.
     * INVALID_BACKING_MAP_IN_DEPLOYMENT_XML_CWOBJ3179E.explanation=The specified map is referenced in the specified mapSet of the ObjectGrid deployment descriptor but is not found in the ObjectGrid XML.
     * INVALID_BACKING_MAP_IN_DEPLOYMENT_XML_CWOBJ3179E.useraction=Add the missing map to the specified mapSet in the in the ObjectGrid XML or remove the invalid map in the deployment descriptor XML file.
     * </pre>
     */
    public String INVALID_BACKING_MAP_IN_DEPLOYMENT_XML_CWOBJ3179E = "INVALID_BACKING_MAP_IN_DEPLOYMENT_XML_CWOBJ3179E";

    /**
     * <pre>
     * # {0} the name of the object grid.
     * INVALID_OBJECTGRID_IN_DEPLOYMENT_XML_CWOBJ3180E=CWOBJ3180E: The ObjectGrid {0} specified in the deployment descriptor file is not defined in the ObjectGrid XML file.
     * INVALID_OBJECTGRID_IN_DEPLOYMENT_XML_CWOBJ3180E.explanation=The specified ObjectGrid was found in the deployment descriptor XML file but not tin the ObjectGrid XML file.
     * INVALID_OBJECTGRID_IN_DEPLOYMENT_XML_CWOBJ3180E.useraction=add the missing ObjectGrid to the ObjectGrid XML file or remove the entry in the deployment descriptor XML file.
     * </pre>
     */
    public String INVALID_OBJECTGRID_IN_DEPLOYMENT_XML_CWOBJ3180E = "INVALID_OBJECTGRID_IN_DEPLOYMENT_XML_CWOBJ3180E";

    /**
     * <pre>
     * INVALID_SERVER_SECURITY_FILE_OPTION_CWOBJ3181E=CWOBJ3181E: The command-line option -serverSecurityFile is invalid for ObjectGrid container servers.
     * INVALID_SERVER_SECURITY_FILE_OPTION_CWOBJ3181E=CWOBJ3181E.explanation=The command-line option -serverSecurityFile is not valid for ObjectGrid catalog service.
     * INVALID_SERVER_SECURITY_FILE_OPTION_CWOBJ3181E=CWOBJ3181E.useraction=Remove the command-line option -serverSecurityFile and restart the ObjectGrid catalog service.
     * </pre>
     */
    public String INVALID_SERVER_SECURITY_FILE_OPTION_CWOBJ3181E = "INVALID_SERVER_SECURITY_FILE_OPTION_CWOBJ3181E";

    /**
     * <pre>
     * XERCES_IMPLEMENTATION_NOT_IN_CLASSPATH_CWOBJ3182E=CWOBJ3182E: A Xerces implementation was not found in the classpath.
     * XERCES_IMPLEMENTATION_NOT_IN_CLASSPATH_CWOBJ3182E.explanation=A Xerces implementation must be present in the classpath for the ObjectGrid container to start properly.
     * XERCES_IMPLEMENTATION_NOT_IN_CLASSPATH_CWOBJ3182E.useraction=Add a Xerces implementation to classpath and restart ObjectGrid container.
     * </pre>
     */
    public String XERCES_IMPLEMENTATION_NOT_IN_CLASSPATH_CWOBJ3182E = "XERCES_IMPLEMENTATION_NOT_IN_CLASSPATH_CWOBJ3182E";

    /**
     * <pre>
     * # {0} the name of the mapSet
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_IGNORE_REPLICA_CWOBJ3183W=CWOBJ3183W: When the container placement scope of CONTAINER_SCOPE setting is specified, any replica setting must be zero.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_IGNORE_REPLICA_CWOBJ3183W.explanation=The mapSet with name {0} contains non zero replica setting(s) in the deployment descriptor file.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_IGNORE_REPLICA_CWOBJ3183W.useraction=Set maxAsyncReplicas="0" maxSyncReplicas="0" minSyncReplicas="0" in the deployment descriptor file.
     * </pre>
     */
    public String CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_IGNORE_REPLICA_CWOBJ3183W = "CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_IGNORE_REPLICA_CWOBJ3183W";

    /**
     * <pre>
     * # {0} the name of the mapSet
     * # {1} the number of partitions
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_NON_ONE_PARTITION_COUNT_CWOBJ3184W=CWOBJ3184W: When the container placement scope of CONTAINER_SCOPE setting is specified, the number of partitions setting must be one.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_NON_ONE_PARTITION_COUNT_CWOBJ3184W.explanation=The mapSet with name {0} contains {1) for the number of partitions setting in the deployment descriptor file.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_NON_ONE_PARTITION_COUNT_CWOBJ3184W.useraction=Review you configuration with IBM support to confirm if multiple partitions are useful with your container placement scoped map set.
     * </pre>
     */
    public String CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_NON_ONE_PARTITION_COUNT_CWOBJ3184W = "CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_NON_ONE_PARTITION_COUNT_CWOBJ3184W";

    /**
     * <pre>
     * # {0} the name of the mapSet
     * INVALID_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3185E=CWOBJ3185E: The placement strategy of per container and the container placement scope of CONTAINER_SCOPE can not be used together.
     * INVALID_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3185E.explanation=The mapSet with name {0} contains mismatched placementStrategy and placementScope settings in the deployment descriptor file.
     * INVALID_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3185E.useraction=Either set the placementStrategy to "FIXED_PARTITIONS" or set the placementScope to "DOMAIN" in the deployment descriptor file.
     * </pre>
     */
    public String INVALID_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3185E = "INVALID_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3185E";

    /**
     * <pre>
     * # {0} the name of the mapSet
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_DEFAULT_COLLISION_ARBITER_CWOBJ3186I=CWOBJ3186I: No custom COLLISION_ARBITER is defined.  The default arbitration will be use.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_DEFAULT_COLLISION_ARBITER_CWOBJ3186I.explanation=The mapSet with name {0} is being defined with the default arbitration.
     * CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_DEFAULT_COLLISION_ARBITER_CWOBJ3186I.useraction=none
     * </pre>
     */
    public String CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_DEFAULT_COLLISION_ARBITER_CWOBJ3186I = "CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_DEFAULT_COLLISION_ARBITER_CWOBJ3186I";

    /**
     * <pre>
     * # {0} exception message
     * # {1} shard identity (lifetime:domain:ogName:mapSetName:partition)
     * ERROR_IN_ARBITER_CWOBJ3187E=CWOBJ3187E: The collision arbiter implementation on {0} generate exception, {0}, which will result in a halt to replication.
     * ERROR_IN_ARBITER_CWOBJ3187E.explanation=During replication, the same key collided with updates from another primary. The collision arbiter encountered an error resolving the collision.
     * ERROR_IN_ARBITER_CWOBJ3187E.useraction=Review the provided error in the JVM logs and the FFDC logs. Review your custom collision arbiter code.
     * </pre>
     */
    public String ERROR_IN_ARBITER_CWOBJ3187E = "ERROR_IN_ARBITER_CWOBJ3187E";

    /**
     * <pre>
     * # {0} the name of the container
     * # {1} the name of the server
     * # {2) the version
     * # {3} the name of the object grid
     * # {4} the name of the map set
     * CONTAINER_PLACEMENT_SCOPE_IN_DOWNLEVEL_CONTAINER_CWOBJ3188E=CWOBJ3188E: A map set with a container placement scope of CONTAINER_SCOPE can not be deployed to a pre 7.1.1 WebSphere eXtreme Scal container.
     * CONTAINER_PLACEMENT_SCOPE_IN_DOWNLEVEL_CONTAINER_CWOBJ3188E.explanation=The container {0} on server {1} is at internal version {2} has a configured deployed CONTAINER_SCOPE map set with grid name {3} and map set {4}.  This map set will not be deployed to the container.
     * CONTAINER_PLACEMENT_SCOPE_IN_DOWNLEVEL_CONTAINER_CWOBJ3188E.useraction=If you want this map set to run on this container, the container must be upgraded to at least version 7.1.1.
     * </pre>
     */
    public String CONTAINER_PLACEMENT_SCOPE_IN_DOWNLEVEL_CONTAINER_CWOBJ3188E = "CONTAINER_PLACEMENT_SCOPE_IN_DOWNLEVEL_CONTAINER_CWOBJ3188E";

    /**
     * <pre>
     * # {0} the name of the container
     * # {1} that name of the grid:mapSet
     * CONTAINER_PLACEMENT_SCOPE_HUB_CONTAINER_CWOBJ3189I=CWOBJ3189I: The hub container for the container scope placement scope map set {1} is container {0}.
     * CONTAINER_PLACEMENT_SCOPE_HUB_CONTAINER_CWOBJ3189I.explanation=See documentation for explanation of hub topology.
     * CONTAINER_PLACEMENT_SCOPE_HUB_CONTAINER_CWOBJ3189I.useraction=none
     * </pre>
     */
    public String CONTAINER_PLACEMENT_SCOPE_HUB_CONTAINER_CWOBJ3189I = "CONTAINER_PLACEMENT_SCOPE_HUB_CONTAINER_CWOBJ3189I";

    /**
     * <pre>
     * # {0} the name of the mapSet
     * INVALID_CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3190E=CWOBJ3190E: When the container placement scope of CONTAINER_SCOPE setting is specified in the deployment descriptor file, the Loader class in the object grid file can not be specified.
     * INVALID_CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3190E=The mapSet with name {0} contains mismatched placementScope setting in the deployment descriptor file and Loader class setting in the object grid file.
     * INVALID_CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3190E=Either remove the Loader class from the object grid file or set the placementScope to "DOMAIN_SCOPE" in the deployment descriptor file.
     * </pre>
     */
    public String INVALID_CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3190E = "INVALID_CONTAINER_PLACEMENT_SCOPE_IN_DEPLOYMENT_XML_CWOBJ3190E";

    /**
     * <pre>
     * # {0} the name of the object grid
     * CATALOG_SERVER_DID_NOT_CONTAIN_MATCHING_OGNAME_CWOBJ3191E=CWOBJ3191E: The catalog server did not contain an ObjectGridDeployment matching the name {0}.
	 * CATALOG_SERVER_DID_NOT_CONTAIN_MATCHING_OGNAME_CWOBJ3191E.explanation=The catalog server did not contain an ObjectGridDeployment matching the object grid.
	 * CATALOG_SERVER_DID_NOT_CONTAIN_MATCHING_OGNAME_CWOBJ3191E.useraction=Verify the object grid name is correct.
     * </pre>
     */
    public String CATALOG_SERVER_DID_NOT_CONTAIN_MATCHING_OGNAME_CWOBJ3191E = "CATALOG_SERVER_DID_NOT_CONTAIN_MATCHING_OGNAME_CWOBJ3191E";

    /**
     * <pre>
     * DYNACACHE_PROVIDER_INITIALIZED_CWOBJ4500=CWOBJ4500I: WebSphere eXtreme Scale DynaCache provider is successfully initialized.
     * DYNACACHE_PROVIDER_INITIALIZED_CWOBJ4500.explanation=The provider is ready to create DynaCache instances.
     * DYNACACHE_PROVIDER_INITIALIZED_CWOBJ4500.useraction=The provider is ready to create DynaCache instances.
     * </pre>
     */
    public String DYNACACHE_PROVIDER_INITIALIZED_CWOBJ4500 = "DYNACACHE_PROVIDER_INITIALIZED_CWOBJ4500";

    /**
     * <pre>
     * # {0} exception
     * DYNACACHE_CREATION_FAILURE_CWOBJ4501=CWOBJ4501E: The WebSphere eXtreme Scale DynaCache provider encountered an error while creating the following cache instance: {0}.
     * DYNACACHE_CREATION_FAILURE_CWOBJ4501.explanation=The provider was unable to complete cache creation for the specified DynaCache instances.
     * DYNACACHE_CREATION_FAILURE_CWOBJ4501.useraction=Check to make sure all required jar files are on the class path and required configuration parameters are set properly.
     * </pre>
     */
    public String DYNACACHE_CREATION_FAILURE_CWOBJ4501 = "DYNACACHE_CREATION_FAILURE_CWOBJ4501";

    /**
     * <pre>
     *  # {0} required configuration parameter
     *  MISSING_REQUIRED_CONFIGURATION_PARAMETER_CWOBJ4502=CWOBJ4502E: Missing the following required configuration parameter: {0}.
     *  MISSING_REQUIRED_CONFIGURATION_PARAMETER_CWOBJ4502.explanation=A required configuration parameter has not been set.  The WebSphere eXtreme Scale DynaCache provider cannot initialize.
     *  MISSING_REQUIRED_CONFIGURATION_PARAMETER_CWOBJ4502.useraction=Set the required configuration parameter and restart the WebSphere server.
     *  </pre>
     */
    public String MISSING_REQUIRED_CONFIGURATION_PARAMETER_CWOBJ4502 = "MISSING_REQUIRED_CONFIGURATION_PARAMETER_CWOBJ4502";

    /**
     * <pre>
     * DYNACACHE_PROVIDER_FAILED_INIT_CWOBJ4503=CWOBJ4503E: WebSphere eXtreme Scale DynaCache provider failed to initialize successfully.
     * DYNACACHE_PROVIDER_FAILED_INIT_CWOBJ4503.explanation=A fatal error occured during initialization.  The provider is unable to create DynaCache instances.
     * DYNACACHE_PROVIDER_FAILED_INIT_CWOBJ4503.useraction=Look for more information in FFDC and Error logs.  Restart WebSphere Application server when problems are corrected.
     * </pre>
     */
    public String DYNACACHE_PROVIDER_FAILED_INIT_CWOBJ4503 = "DYNACACHE_PROVIDER_FAILED_INIT_CWOBJ4503";

    /**
     * <pre>
     * DYNACACHE_UNEXPECTED_SPECIAL_VALUE_CWOBJ4504=CWOBJ4504W: Cache Entry is tagged as a Special Value. Value is being ignored.
     * DYNACACHE_UNEXPECTED_SPECIAL_VALUE_CWOBJ4504.explanation=This should not happen under normal circumstances.  It indicates unsecure access to Dynamic Cache data stored on standalone ObjectGrid containers.
     * DYNACACHE_UNEXPECTED_SPECIAL_VALUE_CWOBJ4504.useraction=Check access controls to the machines or networks where your ObjectGrid containers are located.
     * </pre>
     */
    public String DYNACACHE_UNEXPECTED_SPECIAL_VALUE_CWOBJ4504 = "DYNACACHE_UNEXPECTED_SPECIAL_VALUE_CWOBJ4504";

    /**
     * <pre>
     * # {0} cache
     * # {1} stored configuration
     * # {2} received configuration
     * DYNACACHE_CONFIG_MISMATCH_CWOBJ4505=CWOBJ4505W: DynaCache configuration sent from provider does not match currently stored configuration for cache {0}.  Stored configuration {1}. Recieved configuration {2}.
     * DYNACACHE_CONFIG_MISMATCH_CWOBJ4505.explanation=This is caused by different settings on two or more WebSphere Application Server instances that are sharing a distributed dynacache instance.  This may also be encountered and safely ignored when ripple starting after a configuration change.
     * DYNACACHE_CONFIG_MISMATCH_CWOBJ4505.useraction=Make sure that every server using the DynaCache instance has the same configuration.
     * </pre>
     */
    public String DYNACACHE_CONFIG_MISMATCH_CWOBJ4505 = "DYNACACHE_CONFIG_MISMATCH_CWOBJ4505";

    /**
     * <pre>
     * # {0} Dynamic Cache Evictor configuration
     * DYNACACHE_EVICTOR_FAILOVER_CWOBJ4506=CWOBJ4506I: Configuration found in map. Shard is becoming primary after a failover. Setting DynaCache Evictor configuration. Configuration: {0}
     * DYNACACHE_EVICTOR_FAILOVER_CWOBJ4506.explanation=The DynaCache Evictor is being configured after a failover.
     * DYNACACHE_EVICTOR_FAILOVER_CWOBJ4506.useraction=None
     * </pre>
     */
    public String DYNACACHE_EVICTOR_FAILOVER_CWOBJ4506 = "DYNACACHE_EVICTOR_FAILOVER_CWOBJ4506";

    /**
     * <pre>
     * # {0} optional parameter
     * # {1} value
     * DYNACACHE_INCORRECT_PARAMETER_FORMAT_CWOBJ4507=CWOBJ4507E: The value set for an optional configuration parameter is invalid. Parameter: {0}  Value: {1}
     * DYNACACHE_INCORRECT_PARAMETER_FORMAT_CWOBJ4507.explanation=An optional configuration parameter has been configured with an incorrect value and is being ignored.
     * DYNACACHE_INCORRECT_PARAMETER_FORMAT_CWOBJ4507.useraction=Remove or set the configuration parameter to an acceptable value and restart the WebSphere Application Server.
     * </pre>
     */
    public String DYNACACHE_INCORRECT_PARAMETER_FORMAT_CWOBJ4507 = "DYNACACHE_INCORRECT_PARAMETER_FORMAT_CWOBJ4507";

    /**
     * <pre>
     * # {0} Dynamic Cache name
     * # {1} topology
     * DYNACACHE_CREATED_CWOBJ4508=CWOBJ4508I: The WebSphere eXtreme Scale provider has created a DynaCache instance with name \"{0}\" using topology \"{1}\"
     * DYNACACHE_CREATED_CWOBJ4508.explanation=A DynaCache instance has been successfully created.
     * DYNACACHE_CREATED_CWOBJ4508.useraction=A DynaCache instance has been successfully created.
     * </pre>
     */
    public String DYNACACHE_CREATED_CWOBJ4508 = "DYNACACHE_CREATED_CWOBJ4508";

    /**
     * <pre>
     * # {0} replication policy
     * # {1} cache
     * # {2} key
     * DYNACACHE_UNSUPPORTED_REPLICATION_POLICY_CWOBJ4509=CWOBJ4509E: The WebSphere eXtreme Scale Dynamic Cache provider does not support the {0} replication policy for Cache {1} with key {2}.
     * DYNACACHE_UNSUPPORTED_REPLICATION_POLICY_CWOBJ4509.explanation=A Dynamic Cache entry has been created with a replication policy that is not supported.
     * DYNACACHE_UNSUPPORTED_REPLICATION_POLICY_CWOBJ4509.useraction=Update the application or cachespec file to set a supported replication policy for the entry.
     * </pre>
     */
    public String DYNACACHE_UNSUPPORTED_REPLICATION_POLICY_CWOBJ4509 = "DYNACACHE_UNSUPPORTED_REPLICATION_POLICY_CWOBJ4509";

    /**
     * <pre>
     * # {0} topology
     * # {1} cache name
     * DYNACACHE_REQUIRES_SERVER_CWOBJ4510=CWOBJ4510E: WebSphere eXtreme Scale Server is required to create Dynamic Cache instances with topology {0}. Cache name is {1}.
     * DYNACACHE_REQUIRES_SERVER_CWOBJ4510.explanation=The provider was unable to complete cache creation for the specified Dynamic Cache instances.
     * DYNACACHE_REQUIRES_SERVER_CWOBJ4510.useraction=Set the cache topology to remote or install WebSphere eXtreme Scale Server.
     * </pre>
     */
    public String DYNACACHE_REQUIRES_SERVER_CWOBJ4510 = "DYNACACHE_REQUIRES_SERVER_CWOBJ4510";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * # {2} exception
     * DYNACACHE_GRID_DISCONNECTED_CWOBJ4511=CWOBJ4511E: The WebSphere eXtreme Scale DynaCache provider has become disconnected from {0} WebSphere eXtreme Scale grid and {1} map: {2}
     * DYNACACHE_GRID_DISCONNECTED_CWOBJ4511.explanation=The provider has become disconnected from the specified grid and map.
     * DYNACACHE_GRID_DISCONNECTED_CWOBJ4511.useraction=Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs.
     * </pre>
     */
    public String DYNACACHE_GRID_DISCONNECTED_CWOBJ4511 = "DYNACACHE_GRID_DISCONNECTED_CWOBJ4511";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * DYNACACHE_GRID_RECONNECTED_CWOBJ4512=CWOBJ4512I: The WebSphere eXtreme Scale DynaCache provider has reconnected with {0} WebSphere eXtreme Scale grid and {1} map.
     * DYNACACHE_GRID_RECONNECTED_CWOBJ4512.explanation=The provider has been reconnected the specified grid and map.
     * DYNACACHE_GRID_RECONNECTED_CWOBJ4512.useraction=No action is required.
     * </pre>
     */
    public String DYNACACHE_GRID_RECONNECTED_CWOBJ4512 = "DYNACACHE_GRID_RECONNECTED_CWOBJ4512";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * DYNACACHE_NEAR_CACHE_ENABLED_CWOBJ4513=CWOBJ4513I: A near cache is enabled for  {0} WebSphere eXtreme Scale grid and {1} map.
     * DYNACACHE_NEAR_CACHE_ENABLED_CWOBJ4513.explanation=A near cache is enabled for the specified data grid and map.
     * DYNACACHE_NEAR_CACHE_ENABLED_CWOBJ4513.useraction=No action is required.
     * </pre>
     */
    public String DYNACACHE_NEAR_CACHE_ENABLED_CWOBJ4513 = "DYNACACHE_NEAR_CACHE_ENABLED_CWOBJ4513";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * # {2} Property
     * DYNACACHE_NEAR_CACHE_CONFIGURATION_ERROR_CWOBJ4514=CWOBJ4514E: The near cache configuration for {0} data grid and {1} map is missing the {2} property.
     * DYNACACHE_NEAR_CACHE_CONFIGURATION_ERROR_CWOBJ4514.explanation=A near cache for a dynamic cache must have the nearCacheEnabled and nearCacheInvalidationEnabled properties set to "true".
     * DYNACACHE_NEAR_CACHE_CONFIGURATION_ERROR_CWOBJ4514.useraction=Make the appropriate changes in the objectgrid.xml file and retry.
     * </pre>
     */
    public String DYNACACHE_NEAR_CACHE_CONFIGURATION_ERROR_CWOBJ4514 = "DYNACACHE_NEAR_CACHE_CONFIGURATION_ERROR_CWOBJ4514";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * # {2} Plugin
     * DYNACACHE_REQUIRED_PLUGIN_MISSING_CWOBJ4515=CWOBJ4515E: The cache configuration for the {0} data grid and the {1} map is missing the {2} plug-in.
     * DYNACACHE_REQUIRED_PLUGIN_MISSING_CWOBJ4515.explanation=The configuration is missing a required plug-in.
     * DYNACACHE_REQUIRED_PLUGIN_MISSING_CWOBJ4515.useraction=Update the ObjectGrid configuration XML file with the plug-in configuration and retry.
     * </pre>
     */
    public String DYNACACHE_REQUIRED_PLUGIN_MISSING_CWOBJ4515 = "DYNACACHE_REQUIRED_PLUGIN_MISSING_CWOBJ4515";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * # {2} Plugin
     * DYNACACHE_INCORRECT_PLUGIN_CONFIGURED_CWOBJ4516=CWOBJ4516E: The cache configuration for the {0} data grid and {1} map must not contain the {2} plug-in.
     * DYNACACHE_INCORRECT_PLUGIN_CONFIGURED_CWOBJ4516.explanation=The configuration specifies an incorrect plug-in.
     * DYNACACHE_INCORRECT_PLUGIN_CONFIGURED_CWOBJ4516.useraction=Update the ObjectGrid configuration XML file with the plug-in configuration and retry.
     * </pre>
     */
    public String DYNACACHE_INCORRECT_PLUGIN_CONFIGURED_CWOBJ4516 = "DYNACACHE_INCORRECT_PLUGIN_CONFIGURED_CWOBJ4516";

    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} Map
     * # {2} Transport Type
     * DYNACACHE_INCORRECT_NEAR_CACHE_TRANSPORT_TYPE_CWOBJ4517=CWOBJ4517E: The near cache configuration for {0} data grid and {1} map will not run in transport type: {2}
     * DYNACACHE_INCORRECT_NEAR_CACHE_TRANSPORT_TYPE_CWOBJ4517.explanation=A near cache configuration for dynamic cache must run in using the XIO transport type.
     * DYNACACHE_INCORRECT_NEAR_CACHE_TRANSPORT_TYPE_CWOBJ4517.useraction=Ensure that the data grid is started using the XIO transport type and retry.
     * </pre>
     */
    public String DYNACACHE_INCORRECT_NEAR_CACHE_TRANSPORT_TYPE_CWOBJ4517 = "DYNACACHE_INCORRECT_NEAR_CACHE_TRANSPORT_TYPE_CWOBJ4517";

    /**
     * <pre>
     * # {0} key
     * DYNACACHE_INVALIDATION_TIMEOUT_CWOBJ4518=CWOBJ4518W: Time expired waiting for the invalidation of id  {0} to complete.
     * DYNACACHE_INVALIDATION_TIMEOUT_CWOBJ4518.explanation=To avoid hung threads, the client process will not wait indefinitely for an invalidation to complete.
     * DYNACACHE_INVALIDATION_TIMEOUT_CWOBJ4518.useraction=Check the client and server logs to determine why the invalidation activity was hung.
     * </pre>
     */
    public String DYNACACHE_INVALIDATION_TIMEOUT_CWOBJ4518 = "DYNACACHE_INVALIDATION_TIMEOUT_CWOBJ4518";

    /**
     * <pre>
     * # Do not translate: WebSphere, eXtreme, Scale, Dynamic Cache
     * # {0} WAS cache name
     * # {1} WXS cache name
     * DYNACACHE_CACHE_NAME_CHANGED_CWOBJ4519=CWOBJ4519I: The name of the {0} dynamic cache instance in WebSphere Application Server has been changed to {1} in the WebSphere eXtreme Scale data grid.
     * DYNACACHE_CACHE_NAME_CHANGED_CWOBJ4519.explanation=The name of the dynamic cache instance has been changed and will map to a different name within the WebSphere eXtreme Scale data grid.
     * DYNACACHE_CACHE_NAME_CHANGED_CWOBJ4519.useraction=No action is required.
     * </pre>
     */
    public String DYNACACHE_CACHE_NAME_CHANGED_CWOBJ4519 = "DYNACACHE_CACHE_NAME_CHANGED_CWOBJ4519";

    /**
     * <pre>
     * # {0} function
     * DYNACACHE_FUNCTION_NOT_SUPPORTED_CWOBJ4520=CWOBJ4520W: The {0} function is not supported in WebSphere eXtreme Scale.
     * DYNACACHE_FUNCTION_NOT_SUPPORTED_CWOBJ4520.explanation=The specified function  is not supported in this version of WebSphere eXtreme Scale.
     * DYNACACHE_FUNCTION_NOT_SUPPORTED_CWOBJ4520.useraction=No action is required.
     * </pre>
     */
    public String DYNACACHE_FUNCTION_NOT_SUPPORTED_CWOBJ4520 = "DYNACACHE_FUNCTION_NOT_SUPPORTED_CWOBJ4520";

    /**
     * <pre>
     * # Do not translate: backingMap
     * # {0} property
     * # {1} value
     * # {2} cache name
     * # {3} grid name
     * # {4} map name
     * DYNACACHE_BACKINGMAP_PROPERTY_VALUE_CWOBJ4521=CWOBJ4521I: The {0} backingMap property is set to {1} for the {2} cache in the {3} grid and {4} map.
     * DYNACACHE_BACKINGMAP_PROPERTY_VALUE_CWOBJ4521.explanation=Indicates the value of the specified backingMap property.
     * DYNACACHE_BACKINGMAP_PROPERTY_VALUE_CWOBJ4521.useraction=No action is required.
     * </pre>
     */
    public String DYNACACHE_BACKINGMAP_PROPERTY_VALUE_CWOBJ4521 = "DYNACACHE_BACKINGMAP_PROPERTY_VALUE_CWOBJ4521";

    /**
     * <pre>
      * # Do not translate: backingMap
      * # {0} property
      * # {1} value
      * # {2} cache name
      * DYNACACHE_CUSTOM_PROPERTY_SET_CWOBJ4522=CWOBJ4522I: The {0} custom property is set to {1} for the {2} cache instance.
      * DYNACACHE_CUSTOM_PROPERTY_SET_CWOBJ4522.explanation=Indicates that this specifiec custom property has been set and provides the value for that property.
      * DYNACACHE_CUSTOM_PROPERTY_SET_CWOBJ4522.useraction=No action is required.
      * </pre>
     */
    public String DYNACACHE_CUSTOM_PROPERTY_SET_CWOBJ4522 = "DYNACACHE_CUSTOM_PROPERTY_SET_CWOBJ4522";

    /**
     * <pre>
     * MEMORYSTATS_ENHANCED_SIZING_IN_USE_CWOBJ4541=CWOBJ4541I: Enhanced BackingMap memory sizing is enabled.
     * MEMORYSTATS_ENHANCED_SIZING_IN_USE_CWOBJ4541.explanation=The USED BYTES statistics for WebSphere Extreme Scale maps will have enhanced accuracy.
     * MEMORYSTATS_ENHANCED_SIZING_IN_USE_CWOBJ4541.useraction=No action is required.
     * </pre>
     */
    public String MEMORYSTATS_ENHANCED_SIZING_IN_USE_CWOBJ4541 = "MEMORYSTATS_ENHANCED_SIZING_IN_USE_CWOBJ4541";

    /**
     * <pre>
     * # {0} minutes of time gap
     * # {1} timeout
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4822I=CWOBJ4822I: There is a gap longer than {0} minutes between the start time of work units and the current time. Work times out after {1} minutes. Review the date and time set on the catalog servers.
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4822I.explanation=A catalog and container server failure or server stop happened and a new primary catalog server verifies outstanding placement work. The expected timeout of current work is unexpectedly long. This can occur if the time on catalog servers is not synchronized.
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4822I.useraction=Review xscmd -c showPlacement. If placement is not outstanding, no action is required. If waiting for placement to occur on some servers, placement occurs after the listed timeout. To immediate work around the problem, reset the time on the catalog server to an earlier time and run xscmd -c triggerPlacement. In the future, synchronize the date and time on the catalog servers.
     * </pre>
     */
    public String LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4822I = "LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4822I";

    /**
     * <pre>
     * # {0} minutes of time gap
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4823I=CWOBJ4823I: There is a gap longer than {0} minutes between the start time of work units and the current time. Work immediately times out. Review the date and time set on the catalog servers.
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4823I.explanation=A catalog and container server failure or server stop happened and a new primary catalog server verifies outstanding placement work. The expected timeout of the current work expired several minutes prior. This can occur if the time on catalog servers is not synchronized.
     * LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4823I.useraction=No action is required.
     * </pre>
     */
    public String LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4823I = "LARGE_TIME_GAP_WORKCOMPLET_CWOBJ4823I";

    /**
     * <pre>
     *  MEMORYSTATS_DEFAULT_SIZING_IN_USE_CWOBJ4542=CWOBJ4542I: Basic BackingMap memory sizing is enabled.
     *  MEMORYSTATS_DEFAULT_SIZING_IN_USE_CWOBJ4542.explanation=The USED BYTES statistics for WebSphere Extreme Scale maps will be less accurate.
     *  MEMORYSTATS_DEFAULT_SIZING_IN_USE_CWOBJ4542.useraction=If using JDK 1.5 or later, consult the Infocenter for instructions on enabling the sizing agent.
     *  </pre>
     */
    public String MEMORYSTATS_DEFAULT_SIZING_IN_USE_CWOBJ4542 = "MEMORYSTATS_DEFAULT_SIZING_IN_USE_CWOBJ4542";

    /**
     * <pre>
     * # {0} Object type
     * MEMORYSTATS_OBJECT_TOO_COMPLEX_CWOBJ4543=CWOBJ4543W: The size of an object of type {0} is not accurate.
     * MEMORYSTATS_OBJECT_TOO_COMPLEX_CWOBJ4543.explanation=The USED BYTES statistics for WebSphere extreme scale may underestimate the size of the map.  Treat the result as a trend instead a precise value.
     * MEMORYSTATS_OBJECT_TOO_COMPLEX_CWOBJ4543.useraction=Consult the Infocenter and simplify the Object accordingly.
     * </pre>
     */
    public String MEMORYSTATS_OBJECT_TOO_COMPLEX_CWOBJ4543 = "MEMORYSTATS_OBJECT_TOO_COMPLEX_CWOBJ4543";

    /**
     * <pre>
     *  # {0} eviction trigger
     *  # {1} Java Virtual Machine configuration parameter
     *  EVICTION_TRIGGER_NOT_SUPPORTED_CWOBJ4551=CWOBJ4551E: The eviction trigger {0} cannot be used with the current Java Virtual Machine configuration parameter {1}.
     *  EVICTION_TRIGGER_NOT_SUPPORTED_CWOBJ4551.explanation=The current Java Virtual Machine configuration is known to be unstable when combined with the eviction trigger.
     *  EVICTION_TRIGGER_NOT_SUPPORTED_CWOBJ4551.useraction=See the Eviction section in the WebSphere eXtreme Scale documentation for evictions triggers and use a supported Java Virtual Machine and configuration.
     *  </pre>
     */
    public String EVICTION_TRIGGER_NOT_SUPPORTED_CWOBJ4551 = "EVICTION_TRIGGER_NOT_SUPPORTED_CWOBJ4551";

    /**
     * <pre>
     * # Do not translate: Java, Virtual, Machine
     * # {0} eviction trigger
     * # {1} Java Virtual Machine setting
     * EVICTION_TRIGGER_NOT_STABLE_CWOBJ4552=CWOBJ4552W: The eviction trigger {0} might not behave as expected when used with the Java Virtual Machine setting {1}.
     * EVICTION_TRIGGER_NOT_STABLE_CWOBJ4552.explanation=The current Java Virtual Machine configuration is known to be unstable when combined with the eviction trigger.
     * EVICTION_TRIGGER_NOT_STABLE_CWOBJ4552.useraction=See the Eviction section in the WebSphere eXtreme Scale documentation for evictions triggers and suggested Java Virtual Machine configurations.
     * </pre>
     */
    public String EVICTION_TRIGGER_NOT_STABLE_CWOBJ4552 = "EVICTION_TRIGGER_NOT_STABLE_CWOBJ4552";

    /**
     * <pre>
     * # {0} objectGrid name
     * # {1} max entries
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4560=CWOBJ4560W: The query queue cache of ObjectGrid {0} reached the maximum size of {1}. Eviction of the query queues will occur based on the Least Recently Used rule. This message will only be logged for the first eviction.
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4560.explanation=The query cache will automatically start evicting the least recently used queries.
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4560.useraction=To use the query cache more efficiently reuse query strings when possible. See the Query performance tuning section in the WebSphere eXtreme Scale product documentation for more information on using the query cache.
     * </pre>
     */
    public String QUERY_CACHE_MAX_ENTRIES_CWOBJ4560 = "QUERY_CACHE_MAX_ENTRIES_CWOBJ4560";

    /**
     * <pre>
     * # {0} objectGrid name
     * # {1} partition
     * # {2} max entries
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4561=CWOBJ4561W: The query queue cache of ObjectGrid {0} for partition {1} reached the maximum size of {2}. Eviction of the query queues will occur based on the Least Recently Used rule. This message will only be logged for the first eviction.
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4561.explanation=The query cache will automatically start evicting the least recently used queries.
     * QUERY_CACHE_MAX_ENTRIES_CWOBJ4561.useraction=To use the query cache more efficiently reuse query strings when possible. See the Query performance tuning section in the WebSphere eXtreme Scale product documentation for more information on using the query cache.
     * </pre>
     */
    public String QUERY_CACHE_MAX_ENTRIES_CWOBJ4561 = "QUERY_CACHE_MAX_ENTRIES_CWOBJ4561";

    /**
     * <pre>
     * # {0} key
     * # {1} exception
     * INVALIDATION_ERROR_CWOBJ4570=CWOBJ4570E: An exception occured invalidating key, {0}. The exception was {1}.
     * INVALIDATION_ERROR_CWOBJ4570.explanation=Invalidating a key failed. It may not be invalidated on the server.
     * INVALIDATION_ERROR_CWOBJ4570.useraction=Review the exception provided.
     * </pre>
     */
    public String INVALIDATION_ERROR_CWOBJ4570 = "INVALIDATION_ERROR_CWOBJ4570";

    /**
     * <pre>
     * # {0} shard id
     * # {1} num keys invalidated
     * # {2} total keys to invalidate
     * # {3} timeout
     * KEY_SEARCH_AGENT_INVALIDATION_TIME_EXCEEDED_CWOBJ4571=CWOBJ4571W: Invalidation time has been exceeded on partition {0} ({1} of {2} keys invalidated. The invalidation timeout is {3} milliseconds.
     * KEY_SEARCH_AGENT_INVALIDATION_TIME_EXCEEDED_CWOBJ4571.explanation=Invalidating keys did not complete before the timeout.
     * KEY_SEARCH_AGENT_INVALIDATION_TIME_EXCEEDED_CWOBJ4571.useraction=Request fewer keys for invalidation.
     * </pre>
     */
    public String KEY_SEARCH_AGENT_INVALIDATION_TIME_EXCEEDED_CWOBJ4571 = "KEY_SEARCH_AGENT_INVALIDATION_TIME_EXCEEDED_CWOBJ4571";

    /**
     * <pre>
     * # {0} shard id
     * # {1} num keys invalidated
     * # {2} total keys to invalidate
     * KEY_SEARCH_AGENT_INVALIDATION_FAILURE_CWOBJ4572=CWOBJ4572W: Invalidation failed on partition {0} ({1} of {2} keys invalidated.
     * KEY_SEARCH_AGENT_INVALIDATION_FAILURE_CWOBJ4572.explanation=Some or all of the keys failed invalidation.
     * KEY_SEARCH_AGENT_INVALIDATION_FAILURE_CWOBJ4572.useraction=Review previous exceptions in the JVM log for failed invalidations.
     * </pre>
     */
    public String KEY_SEARCH_AGENT_INVALIDATION_FAILURE_CWOBJ4572 = "KEY_SEARCH_AGENT_INVALIDATION_FAILURE_CWOBJ4572";

    /**
     * <pre>
     * # {0} class name
     * KEY_SEARCH_DYNACACHE_FAILURE_CWOBJ4573=CWOBJ4573W: Could not find the WebSphere eXtreme Scale Dynamic Cache class, {0}. The KeySearchAgent may not be able to perform actions on WebSphere eXtreme Scale Dynamic Cache maps.
     * KEY_SEARCH_DYNACACHE_FAILURE_CWOBJ4573.explanation=Keys using WebSphere eXtreme Scale Dynamic Cache classes will not be found using the KeySearchAgent for findByKey command.
     * KEY_SEARCH_DYNACACHE_FAILURE_CWOBJ4573.useraction=Check the classpath and configuration for the WebSphere eXtreme Scale Dynamic Cache classes.
     * </pre>
     */
    public String KEY_SEARCH_DYNACACHE_FAILURE_CWOBJ4573 = "KEY_SEARCH_DYNACACHE_FAILURE_CWOBJ4573";

    /**
     * <pre>
    * KEY_SEARCH_AGENT_VALUE_RETURN_TIME_EXCEEDED_CWOBJ4574=CWOBJ4574W: The value return time was exceeded.
    * KEY_SEARCH_AGENT_VALUE_RETURN_TIME_EXCEEDED_CWOBJ4574.explanation=The values corresponding to the provided list of keys could not be returned before the timeout.
    * KEY_SEARCH_AGENT_VALUE_RETURN_TIME_EXCEEDED_CWOBJ4574.useraction=Request the values for fewer keys.
     */
    public String KEY_SEARCH_AGENT_VALUE_RETURN_TIME_EXCEEDED_CWOBJ4574 = "KEY_SEARCH_AGENT_VALUE_RETURN_TIME_EXCEEDED_CWOBJ4574";

    /**
     * <pre>
     * # {0} attribute
     * # {1} exception
     * # Do not translate getAttributes
     * GET_ATTRIBUTES_EXCEPTION_CWOBJ4600=CWOBJ4600E: There was an exception on the getAttribute for {0}. Exception: {1}. Continuting to create attribute list.
     * GET_ATTRIBUTES_EXCEPTION_CWOBJ4600.explanation=An exception occurred on getting an attribute. A null value will be set for the failing attribute and the rest of the attribute will be created.
     * GET_ATTRIBUTES_EXCEPTION_CWOBJ4600.useraction=Review the exception and correct any configuration related errors.
     * </pre>
     */
    public String GET_ATTRIBUTES_EXCEPTION_CWOBJ4600 = "GET_ATTRIBUTES_EXCEPTION_CWOBJ4600";

    /**
     * <pre>
     * # {0} attribute
     * # {1} exception
     * # Do not translate getAttributes
     * SET_ATTRIBUTES_EXCEPTION_CWOBJ4601=CWOBJ4601E: There was an exception on the setAttribute for {0}. Exception: {1}. Continuting to set other attributes.
     * SET_ATTRIBUTES_EXCEPTION_CWOBJ4601.explanation=An exception occurred on setting an attribute. The attribute listed in the message will be skipped and the rest of the attributes set.
     * SET_ATTRIBUTES_EXCEPTION_CWOBJ4601.useraction=Review the exception and correct any configuration related errors.
     * </pre>
     */
    public String SET_ATTRIBUTES_EXCEPTION_CWOBJ4601 = "SET_ATTRIBUTES_EXCEPTION_CWOBJ4601";

    /**
     * <pre>
     * DISK_EVICTOR_DETECTED_CWOBJ4650=CWOBJ4650I: The Evictor {0} is using disk based persistance within the following table: {1}.
     * DISK_EVICTOR_DETECTED_CWOBJ4650.explanation=The Evictor is using disk based storage instead of memory.
     * DISK_EVICTOR_DETECTED_CWOBJ4650.useraction=No action is required
     * </pre>
     */
    public String DISK_EVICTOR_DETECTED_CWOBJ4650 = "DISK_EVICTOR_DETECTED_CWOBJ4650";

    /**
     * <pre>
     * # {0} database directory
     * DISK_OFFLOAD_CWOBJ4651=CWOBJ4651W: Persistence directory {0} already exists but does not contain valid data.  It will be cleared.
     * DISK_OFFLOAD_CWOBJ4651.explanation=The directory to be used for grid data storage already existed but contained corrupted or unrelated data.  The directory will be emptied so it can be used for grid data.
     * DISK_OFFLOAD_CWOBJ4651.useraction=No action is required.
     * </pre>
     */
    public String DISK_OFFLOAD_CWOBJ4651 = "DISK_OFFLOAD_CWOBJ4651";

    /**
     * <pre>
     * # {0} database directory
     * DISK_OFFLOAD_CWOBJ4652=CWOBJ4652W: Persistence directory {0} cannot be opened because it is in use by another process.
     * DISK_OFFLOAD_CWOBJ4652.explanation=The directory to be used for grid data storage is already being accessed by another process, this process cannot open it.
     * DISK_OFFLOAD_CWOBJ4652.useraction=No action is required.
     * </pre>
     */
    public String DISK_OFFLOAD_CWOBJ4652 = "DISK_OFFLOAD_CWOBJ4652";

    /**
     * <pre>
     * # messages for story: no story associated, cleanup from previous release.
     * DISK_OFFLOAD_CWOBJ4653=CWOBJ4653W: DiskOverFlowHashtable was classloaded but disk overflow mode is not enabled
     * DISK_OFFLOAD_CWOBJ4653.explanation=Classes related to the disk persistence feature were loaded unnecessarily.
     * DISK_OFFLOAD_CWOBJ4653.useraction=No action is required.
     * </pre>
     */
    public String DISK_OFFLOAD_CWOBJ4653 = "DISK_OFFLOAD_CWOBJ4653";

    /**
     * <pre>
     * # {0} grid name
     * # messages for story: no story associated, cleanup from previous release.
     * DISK_OFFLOAD_CWOBJ4654=CWOBJ4654W: Unable to retrieve config information for grid {0}, grid capacity limit will not be updated.
     * DISK_OFFLOAD_CWOBJ4654.explanation=The grid configuration information could not be retrieved so the grid's capacity limited will not be set.
     * DISK_OFFLOAD_CWOBJ4654.useraction=Confirm that the grid name is valid.
     * </pre>
     */
    public String DISK_OFFLOAD_CWOBJ4654 = "DISK_OFFLOAD_CWOBJ4654";

    /**
     * <pre>
     * # {0} map name
     * # {1} template map name
     * # {2} ObjectGrid name
     * DYNAMIC_MAP_CREATED_CWOBJ4700=CWOBJ4700I: The map name {0} matched the regular expression of template map {1}.  The {0} map has been created for ObjectGrid {2}.
     * DYNAMIC_MAP_CREATED_CWOBJ4700.explanation=A new dynamic map has been successfully created.
     * DYNAMIC_MAP_CREATED_CWOBJ4700.useraction=No action is required.
     * </pre>
     */
    public String DYNAMIC_MAP_CREATED_CWOBJ4700 = "DYNAMIC_MAP_CREATED_CWOBJ4700";

    /**
     * <pre>
     * # {0} template map name
     * # {1} ObjectGrid name
     * TEMPLATE_MAP_CONFIGURED_CWOBJ4701=CWOBJ4701I: Template map {0} is configured in ObjectGrid {1}.
     * TEMPLATE_MAP_CONFIGURED_CWOBJ4701.explanation=A template map configuration has been detected.
     * TEMPLATE_MAP_CONFIGURED_CWOBJ4701.useraction=No action is required.
     * </pre>
     */
    public String TEMPLATE_MAP_CONFIGURED_CWOBJ4701 = "TEMPLATE_MAP_CONFIGURED_CWOBJ4701";

    /**
     * <pre>
     * # {0} map name
     * # {1} exception
     * DYNAMIC_MAP_CREATION_ERROR_CWOBJ4702=CWOBJ4702E: Dynamic creation failed for map {0} due to the following exception {1}.
     * DYNAMIC_MAP_CREATION_ERROR_CWOBJ4702.explanation=A fatal error occured during dynamic map creation.
     * DYNAMIC_MAP_CREATION_ERROR_CWOBJ4702.useraction=Examine the exception for more detail.  Correct the problem that caused the exception and retry dynamic map creation.
     * </pre>
     */
    public String DYNAMIC_MAP_CREATION_ERROR_CWOBJ4702 = "DYNAMIC_MAP_CREATION_ERROR_CWOBJ4702";

    /**
     * <pre>
     * # {0} shard name
     * # {1} container attempting reservation
     * # {2} container with existing reservation
     * SHARD_ALREADY_RESERVED_ERROR_CWOBJ4800=CWOBJ4800E: Attempt to reserve shard {0} on container {1} has failed because this shard has already been reserved by container {2}.
     * SHARD_ALREADY_RESERVED_ERROR_CWOBJ4800.explanation=Only one container can reserve a shard at a time.
     * SHARD_ALREADY_RESERVED_ERROR_CWOBJ4800.useraction=Release the shard from its owning container before attempting to reserve it with another container.
     * </pre>
     */
    public String SHARD_ALREADY_RESERVED_ERROR_CWOBJ4800 = "SHARD_ALREADY_RESERVED_ERROR_CWOBJ4800";

    /**
     * <pre>
     * # {0} partition name
     * # {1} container name
     * PARTITION_NOT_FOUND_CWOBJ4801=CWOBJ4801W: Partition {0} was not released from container {1} because it was not found on the container.
     * PARTITION_NOT_FOUND_CWOBJ4801.explanation=A container can only release shards that are currently placed on it.
     * PARTITION_NOT_FOUND_CWOBJ4801.useraction=No action is required.
     * </pre>
     */
    public String PARTITION_NOT_FOUND_CWOBJ4801 = "PARTITION_NOT_FOUND_CWOBJ4801";

    /**
     * <pre>
     * # {0} shard name
     * # {1} container name
     * RESERVE_PARTITION_NON_EXISTENT_CWOBJ4802=CWOBJ4802E: Attempt to reserve shard {0} on container {1} has failed because the partition does not exist.
     * RESERVE_PARTITION_NON_EXISTENT_CWOBJ4802.explanation=A partition does not exist for the shard that you attempted to reserve.
     * RESERVE_PARTITION_NON_EXISTENT_CWOBJ4802.useraction=Attempt to reserve shards for valid partitions.
     * </pre>
     */
    public String RESERVE_PARTITION_NON_EXISTENT_CWOBJ4802 = "RESERVE_PARTITION_NON_EXISTENT_CWOBJ4802";

    /**
     * <pre>
     * PER_CONTAINER_UNSUPPORTED_CWOBJ4803=CWOBJ4803E: The shard reservation feature is not supported with PER_CONTAINER placement strategy or scope.
     * PER_CONTAINER_UNSUPPORTED_CWOBJ4803.explanation=Shards can only be reserved when using the FIXED_PARTITIONS placement strategy with PER_DOMAIN scope.
     * PER_CONTAINER_UNSUPPORTED_CWOBJ4803.useraction=Do not attempt to reserve or release shards while using PER_CONTAINER placement strategy or scope.
     * </pre>
     */
    public String PER_CONTAINER_UNSUPPORTED_CWOBJ4803 = "PER_CONTAINER_UNSUPPORTED_CWOBJ4803";

    /**
     * <pre>
     * # {0} shard name
     * # {1} container name
     * SUCCESSFUL_SHARD_RESERVATION_CWOBJ4804=CWOBJ4804I: Shard {0} was successfully reserved on container {1}.
     * SUCCESSFUL_SHARD_RESERVATION_CWOBJ4804.explanation=Request to reserve shard was executed successfully.
     * SUCCESSFUL_SHARD_RESERVATION_CWOBJ4804.useraction=No action is required.
     * </pre>
     */
    public String SUCCESSFUL_SHARD_RESERVATION_CWOBJ4804 = "SUCCESSFUL_SHARD_RESERVATION_CWOBJ4804";

    /**
     * <pre>
     * # {0} partition name
     * # {1} container name
     * SUCCESSFUL_SHARD_RELEASE_CWOBJ4805=CWOBJ4805I: Shard from partition {0} was successfully released from container {1}.
     * SUCCESSFUL_SHARD_RELEASE_CWOBJ4805.explanation=Request to release shard was executed successfully.
     * SUCCESSFUL_SHARD_RELEASE_CWOBJ4805.useraction=No action is required.
     * </pre>
     */
    public String SUCCESSFUL_SHARD_RELEASE_CWOBJ4805 = "SUCCESSFUL_SHARD_RELEASE_CWOBJ4805";

    /**
     * <pre>
     * # {0} shard name
     * # {1} container name
     * SHARD_RESERVED_PRIOR_INIT_PLACEMENT_CWOBJ4806=CWOBJ4806I: Shard {0} has been reserved on container {1} prior to initial placement.  Shard will be placed onto this container when initial placement occurs.
     * SHARD_RESERVED_PRIOR_INIT_PLACEMENT_CWOBJ4806.explanation=Initial placement can be gated by several factors with numInitialContainers being the most common.
     * SHARD_RESERVED_PRIOR_INIT_PLACEMENT_CWOBJ4806.useraction=Start enough containers to trigger placement.
     * </pre>
     */
    public String SHARD_RESERVED_PRIOR_INIT_PLACEMENT_CWOBJ4806 = "SHARD_RESERVED_PRIOR_INIT_PLACEMENT_CWOBJ4806";

    /**
     * <pre>
     * # {0} shard name
     * # {1} container name
     * # {2} map set name
     * # {3} ObjectGrid name
     * RESERVE_CONTAINER_NOT_SUPPORTING_MAPSET_CWOBJ4807=CWOBJ4807E: Shard {0} cannot be reserved on container {1} because this container does not support map set {2} from ObjectGrid {3}.
     * RESERVE_CONTAINER_NOT_SUPPORTING_MAPSET_CWOBJ4807.explanation=This container does not support the map set specified.
     * RESERVE_CONTAINER_NOT_SUPPORTING_MAPSET_CWOBJ4807.useraction=Only reserve shards that a container can support.  Optionally, provide an ObjectGrid XML and a deployment policy XML that include the desired ObjectGrid and map set.
     * </pre>
     */
    public String RESERVE_CONTAINER_NOT_SUPPORTING_MAPSET_CWOBJ4807 = "RESERVE_CONTAINER_NOT_SUPPORTING_MAPSET_CWOBJ4807";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * ROLE_SWAP_SUCCESSFUL_CWOBJ4808=CWOBJ4808I: Request from shard {0} to swap roles with a(n) {1} shard was processed successfully.  This shard is now a(n) {1}.
     * ROLE_SWAP_SUCCESSFUL_CWOBJ4808.explanation=This shard requested a role swap with another shard.  The request executed successfully.  The shards have exchanged roles.
     * ROLE_SWAP_SUCCESSFUL_CWOBJ4808.useraction=No action is required.
     * </pre>
     */
    public String ROLE_SWAP_SUCCESSFUL_CWOBJ4808 = "ROLE_SWAP_SUCCESSFUL_CWOBJ4808";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * ROLE_SWAP_SAME_TYPE_CWOBJ4809=CWOBJ4809W: Request from shard {0} to swap roles with a(n) {1} shard failed to execute because this shard is already a(n) {1}
     * ROLE_SWAP_SAME_TYPE_CWOBJ4809.explanation=A shard can only swap roles with a shard of another type.
     * ROLE_SWAP_SAME_TYPE_CWOBJ4809.useraction=Attempt to swap roles with a shard of another type.
     * </pre>
     */
    public String ROLE_SWAP_SAME_TYPE_CWOBJ4809 = "ROLE_SWAP_SAME_TYPE_CWOBJ4809";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * ROLE_SWAP_SHARD_TYPE_NOT_PLACED_CWOBJ4810=CWOBJ4810E: Request from shard {0} to swap roles with a(n) {1} shard has failed because no {1} from this partition is currently placed.
     * ROLE_SWAP_SHARD_TYPE_NOT_PLACED_CWOBJ4810.explanation=Only currently placed shards can swap roles.
     * ROLE_SWAP_SHARD_TYPE_NOT_PLACED_CWOBJ4810.useraction=Attempt to swap roles with a shard that is currently placed.
     * </pre>
     */
    public String ROLE_SWAP_SHARD_TYPE_NOT_PLACED_CWOBJ4810 = "ROLE_SWAP_SHARD_TYPE_NOT_PLACED_CWOBJ4810";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * ROLE_SWAP_SHARD_TIMEOUT_CWOBJ4811=CWOBJ4811E: Request from shard {0} to swap roles with a(n) {1} shard has timed out.  Shard {0} did not inherit its new role in the allotted time.
     * ROLE_SWAP_SHARD_TIMEOUT_CWOBJ4811.explanation=The shard was able to contact the PlacemeService and request the swap.  However, it did not inherit its new role before timing out.
     * ROLE_SWAP_SHARD_TIMEOUT_CWOBJ4811.useraction=Examine the logs and FFDC for errors that may indicate why the role swap couldn't complete in the allotted time.
     * </pre>
     */
    public String ROLE_SWAP_SHARD_TIMEOUT_CWOBJ4811 = "ROLE_SWAP_SHARD_TIMEOUT_CWOBJ4811";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * # {2} container name
     * ROLE_SWAP_SHARD_NOT_FOUND_ON_CONTAINER_CWOBJ4812=CWOBJ4812E: Request from shard {0} to swap roles with the {1} shard on container {2} has failed.  No {1} shard was found on the specified container for this partition.
     * ROLE_SWAP_SHARD_NOT_FOUND_ON_CONTAINER_CWOBJ4812.explanation=Shard of the type specified was not found on the container specified.
     * ROLE_SWAP_SHARD_NOT_FOUND_ON_CONTAINER_CWOBJ4812.useraction=Specify a container hosting the shard type desired or use null as the container argument for random selection of shard type specified.
     * </pre>
     */
    public String ROLE_SWAP_SHARD_NOT_FOUND_ON_CONTAINER_CWOBJ4812 = "ROLE_SWAP_SHARD_NOT_FOUND_ON_CONTAINER_CWOBJ4812";

    /**
     * <pre>
     * # {0} requesting shard
     * # {1} shard type desired
     * # {2} container name
     * ROLE_SWAP_INVALID_CONTAINER_CWOBJ4813=CWOBJ4813E: No container was found to match the name {2}. Request from shard {0} to swap roles with the {1} shard on container {2} has failed.
     * ROLE_SWAP_INVALID_CONTAINER_CWOBJ4813.explanation= The PlacementService is not aware of a container that matches the name specified.
     * ROLE_SWAP_INVALID_CONTAINER_CWOBJ4813.useraction=Specify a valid container that is currently hosting a shard of the desired type.
     * </pre>
     */
    public String ROLE_SWAP_INVALID_CONTAINER_CWOBJ4813 = "ROLE_SWAP_INVALID_CONTAINER_CWOBJ4813";

    /**
     * <pre>
     * # {0} requesting shard
     * ROLE_SWAP_PER_CONTAINER_SCOPE_NOT_SUPPROTED_CWOBJ4814=CWOBJ4813E: The shard {0} has a placement scope of per container.
     * ROLE_SWAP_PER_CONTAINER_SCOPE_NOT_SUPPROTED_CWOBJ4814.explanation= Shards with per container placement scope only have primary roles.
     * ROLE_SWAP_PER_CONTAINER_SCOPE_NOT_SUPPROTED_CWOBJ4814.useraction=Perform swap roles on shards with per domain placement scope with replicas defined.
     * </pre>
     */
    public String ROLE_SWAP_PER_CONTAINER_SCOPE_NOT_SUPPROTED_CWOBJ4814 = "ROLE_SWAP_PER_CONTAINER_SCOPE_NOT_SUPPROTED_CWOBJ4814";

    /**
     * # {0} objectGrid:mapSet
     * # {1} container list
     * BATCH_PROCESSED_CONTAINER_STOPS_CWOBJ4818=CWOBJ4818I: The following containers with the capability of hosting ObjectGrid:MapSet {0} have been stopped or otherwise lost: {1}.
     * BATCH_PROCESSED_CONTAINER_STOPS_CWOBJ4818.explanation=The PlacementService processed stop events for the containers specified.
     * BATCH_PROCESSED_CONTAINER_STOPS_CWOBJ4818.useraction=No action is required.  If the containers were lost unexpectedly, look at the individual container logs for additional information.
     */
    public String BATCH_PROCESSED_CONTAINER_STOPS_CWOBJ4818 = "BATCH_PROCESSED_CONTAINER_STOPS_CWOBJ4818";

    /**
     * # {0} work unit id (objectGridName:mapSetName:workId)
     * OVERDUE_WORK_UNIT_CWOBJ4819=CWOBJ4819W: Detected and removed overdue placement work unit associated with work identifier {0}.
     * OVERDUE_WORK_UNIT_CWOBJ4819.explanation=A placement work unit that was sent to a container did not complete in the allotted time.  It will not be retried.
     * OVERDUE_WORK_UNIT_CWOBJ4819.useraction=Examine the logs and FFDC for errors that may indicate why the work did not complete in the allotted time.
     */
    public String OVERDUE_WORK_UNIT_CWOBJ4819 = "OVERDUE_WORK_UNIT_CWOBJ4819";

    /**
     * <pre>
     *   # {0} queued work unit count
     *   # {1} outstanding work unit count
     *   # {2} objectGrid:mapSet
     *   MANY_WORKITEMS_CWOBJ4820=CWOBJ4820I: A large number of placement work units ({0} queued and {1} outstanding) intended for ObjectGrid:MapSet {2} are in progress. This condition may not be a problem, but for a system in distress, can indicate an inability to complete work.
     *   MANY_WORKITEMS_CWOBJ4820.explanation=Many placement work units cannot be completed or are queued. In some situations this indicates a resource constraint or inability to complete work. In many cases, this can simply indicate a busy system.
     *   MANY_WORKITEMS_CWOBJ4820.useraction=Examine the logs and FFDC for errors that may indicate why work is not being completed in a timely fashion. 
     * </pre>
     */
    public String MANY_WORKITEMS_CWOBJ4820 = "MANY_WORKITEMS_CWOBJ4820";

    /**
     * <pre>
     * # {0} task count
     * # {1} work unit id (objectGridName:mapSetName:workId)
     * # {2} ObjectGrid:MapSet
     * MANY_TIMERTASKS_CWOBJ4821=CWOBJ4821I: A large number of work units are currently being monitored for completion ({0} tasks), for ObjectGrid:MapSet {2}. The current work item being scheduled is {1}. This condition may not be a problem, but for a system in distress, can indicate an inability to complete work.
     * MANY_TIMERTASKS_CWOBJ4821.explanation=Many placement work units cannot be completed or are queued. In some situations this indicates a resource constraint or inability to complete work. In many cases, this can simply indicate a busy system.
     * MANY_TIMERTASKS_CWOBJ4821.useraction=Examine the logs and FFDC for errors that may indicate why work is not being completed in a timely fashion. 
     * </pre>
     */
    public String MANY_TIMERTASKS_CWOBJ4821 = "MANY_TIMERTASKS_CWOBJ4821";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} map set name
     * # {3} ObjectGrid name
     * # {4} number of partitions in local domain
     * # {5} number of partitions in foreign domain
     * MAPSET_INCOMPATIBLE_PARTITION_NUM_CWOBJ4900=CWOBJ4900E: Domain {0} will not send updates to domain {1} for map set {2} from ObjectGrid {3} because of a mismatch in the number of partitions.  The map set is configured for {4} partitions in domain {0} and {5} partitions in domain {1}.
     * MAPSET_INCOMPATIBLE_PARTITION_NUM_CWOBJ4900.explanation=The map set must be configured with the same number of partitions in each domain in order to achieve a multi-primary topology.
     * MAPSET_INCOMPATIBLE_PARTITION_NUM_CWOBJ4900.useraction=Stop the containers hosting the map set in 1 of the domains.  Restart these containers using a deployment policy containing the map set with the proper number of partitions.
     * </pre>
     */
    public String MAPSET_INCOMPATIBLE_PARTITION_NUM_CWOBJ4900 = "MAPSET_INCOMPATIBLE_PARTITION_NUM_CWOBJ4900";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} map set name
     * # {3} ObjectGrid name
     * # {4} placement strategy in local domain
     * # {5} placement strategy in foreign domain
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRAT_CWOBJ4901=CWOBJ4901E: Domain {0} will not send updates to domain {1} for map set {2} from ObjectGrid {3} because of a mismatch in the placement strategy.  The map set is configured for {4} placement strategy in domain {0} and {5} placement strategy in domain {1}.
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRAT_CWOBJ4901.explanation=The map set must be configured with the same placement strategy in each domain in order to achieve a multi-primary topology.
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRAT_CWOBJ4901.useraction=Stop the containers hosting the map set in 1 of the domains.  Restart these containers using a deployment policy containing the map set with the proper placement strategy.
     * </pre>
     */
    public String MAPSET_INCOMPATIBLE_PLACEMENT_STRAT_CWOBJ4901 = "MAPSET_INCOMPATIBLE_PLACEMENT_STRAT_CWOBJ4901";

    /**
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} map set name
     * # {3} ObjectGrid name
     * MAPSET_COMPATIBLE_CWOBJ4902=CWOBJ4902I: This domain ({0}) received a compatible map set from domain {1}.  Updates for map set {2} from ObjectGrid {3} will be sent to domain {1}.
     * MAPSET_COMPATIBLE_CWOBJ4902.explanation=The foreign domain published a map set that is compatible with the local domain.  The local domain will now send updates regarding this map set to the foreign domain.
     * MAPSET_COMPATIBLE_CWOBJ4902.useraction=No action is required.
     */
    public String MAPSET_COMPATIBLE_CWOBJ4902 = "MAPSET_COMPATIBLE_CWOBJ4902";

    /**
     * # {0} foreign domain list
     * FOREIGN_DOMAINS_FOUND_CWOBJ4903=CWOBJ4903I: The following foreign domains have been provided: {0}
     * FOREIGN_DOMAINS_FOUND_CWOBJ4903.explanation=This domain will attempt to link to the foreign domains for the purpose of supporting an AP topology.
     * FOREIGN_DOMAINS_FOUND_CWOBJ4903.useraction=No action is required.
     */
    public String FOREIGN_DOMAINS_FOUND_CWOBJ4903 = "FOREIGN_DOMAINS_FOUND_CWOBJ4903";

    /**
     * # {0} foreign domain name
     * # {1} foreign domain end points
     * FOREIGN_DOMAIN_END_POINTS_CWOBJ4904=CWOBJ4904I: The following end points have been provided for foreign domain {0}: {1}
     * FOREIGN_DOMAIN_END_POINTS_CWOBJ4904.explanation=This domain will attempt to link to the foreign domain using the end points provided.
     * FOREIGN_DOMAIN_END_POINTS_CWOBJ4904.useraction=No action is required.
     */
    public String FOREIGN_DOMAIN_END_POINTS_CWOBJ4904 = "FOREIGN_DOMAIN_END_POINTS_CWOBJ4904";

    /**
     * # {0} objectGridName:mapSetName
     * # {1} local domain
     * # {2} maps in local domain
     * # {3} foreign domain
     * # {4} maps in foreign domain
     * MAPSET_WRONG_NUM_MAPS_CWOBJ4905=CWOBJ4905E: {0} from linked domains do not contain the same maps.  While domain {1} contains the following maps for this map set: {2}, domain {3} contains: {4}.
     * MAPSET_WRONG_NUM_MAPS_CWOBJ4905.explanation=The map set must be configured with the same maps in each domain in order to achieve a multi-primary topology.
     * MAPSET_WRONG_NUM_MAPS_CWOBJ4905.useraction=Stop the containers hosting the map set in 1 of the domains.  Restart these containers using a deployment policy and ObjectGrid XML containing the same maps in the map set as found in the linked domain.
     */
    public String MAPSET_WRONG_NUM_MAPS_CWOBJ4905 = "MAPSET_WRONG_NUM_MAPS_CWOBJ4905";

    /**
     * # {0} local domain
     * # {1} foreign domain
     * # {2} map set name
     * # {3} ObjectGrid name
     * # {4} inconsistent map name
     * # {5} domain containing map
     * # {6} domain without map
     * MAPSET_MISSING_MAP_CWOBJ4906=CWOBJ4906E: Domain {0} will not send updates to domain {1} for map set {2} from ObjectGrid {3}. The maps in the map set are not consistent.  The {4} map was found in the map set for domain {5}, but not for domain {6}.
     * MAPSET_MISSING_MAP_CWOBJ4906.explanation=The map set must contain the same maps in each domain.
     * MAPSET_MISSING_MAP_CWOBJ4906.useraction=Stop the containers hosting the map set in 1 of the domains.  Restart these containers using a deployment policy and ObjectGrid XML containing the same maps in the map set as found in the linked domain.
     */
    public String MAPSET_MISSING_MAP_CWOBJ4906 = "MAPSET_MISSING_MAP_CWOBJ4906";

    /**
     * # {0} foreign domain<br>
     * # {1} local domain<br>
     * # {2} expected property<br>
     * FOREIGN_ENDPOINTS_NOT_FOUND_CWOBJ4907=CWOBJ4907E: No end points were provided for foreign domain {0} was expecting {2} property. No attempt
     * will be made to establish a link between the {1} and {0} domains. <br>
     * FOREIGN_ENDPOINTS_NOT_FOUND_CWOBJ4907.explanation=A set of end points must accompany each foreign domain. <br>
     * FOREIGN_ENDPOINTS_NOT_FOUND_CWOBJ4907.useraction=Define end points for this foreign domain in the server properties file.
     */
    public String FOREIGN_ENDPOINTS_NOT_FOUND_CWOBJ4907 = "FOREIGN_ENDPOINTS_NOT_FOUND_CWOBJ4907";

    /**
     * # {0} local domain
     * LOCAL_DOMAIN_INCLUDED_IN_FOREIGN_CWOBJ4908=CWOBJ4908E: The local domain name {0} was found in the set of foreign domains in the server properties.
     * LOCAL_DOMAIN_INCLUDED_IN_FOREIGN_CWOBJ4908.explanation=The domainName provided in the server properties must not be included in the set of foreign domains in the same server properties.
     * LOCAL_DOMAIN_INCLUDED_IN_FOREIGN_CWOBJ4908.useraction=Remove the domain name from the set of foreign domains and restart the catalog server.
     */
    public String LOCAL_DOMAIN_INCLUDED_IN_FOREIGN_CWOBJ4908 = "LOCAL_DOMAIN_INCLUDED_IN_FOREIGN_CWOBJ4908";

    /**
     * # {0} local domain
     * # {1} foreign domain
     * # {2} map set name
     * # {3} ObjectGrid name
     * # {4} map name
     * # {5} domain containing write-behind map
     * WRITE_BEHIND_MAP_FOUND_CWOBJ4909=CWOBJ4909E: Domain {0} will not send updates to domain {1} for map set {2} from ObjectGrid {3} because the {4} map is configued for write-behind support in {5}.
     * WRITE_BEHIND_MAP_FOUND_CWOBJ4909.explanation=Map sets containing maps with write-behind loaders are not supported in a multi-primary environment.
     * WRITE_BEHIND_MAP_FOUND_CWOBJ4909.useraction=Remove the write-behind loader from all maps in the map set to enable primaires in both domains for this map set.  No action is required if you do not wish to support a multi-primary topology with this map set.
     */
    public String WRITE_BEHIND_MAP_FOUND_CWOBJ4909 = "WRITE_BEHIND_MAP_FOUND_CWOBJ4909";

    /**
     * # {0} local domain
     * # {1} foreign domain
     * # {2} ObjectGrid name
     * # {3} map set name
     * # {4} map name
     * # {5} domain containing entity map
     * ENTITY_MAP_FOUND_CWOBJ4911=CWOBJ4911E: Domain {0} will not send updates to domain {1} for {2}:{3} because the {4} map is backing an entity in {5}.
     * ENTITY_MAP_FOUND_CWOBJ4911.explanation=Map sets containing entities are not supported in a multi-primary environment.
     * ENTITY_MAP_FOUND_CWOBJ4911.useraction=Remove entities from the map set in order to enable primaires in both domains for this map set.  No action is required if you do not wish to support a multi-primary topology with this map set.
     */
    public String ENTITY_MAP_FOUND_CWOBJ4911 = "ENTITY_MAP_FOUND_CWOBJ4911";

    /**
     * # {0} local domain
     * # {1} foreign domain
     * # {2} ObjectGrid name
     * # {3} map set name
     * # {4} map name
     * # {5} domain containing bytes for keys
     * KEYTYPE_BYTES_FOUND_CWOBJ4912=CWOBJ4912E: Domain {0} will not send updates to domain {1} for {2}:{3} because the {4} map is configured as a bytes for keys map in {5}.
     * KEYTYPE_BYTES_FOUND_CWOBJ4912.explanation=Map sets containing bytes for keys are not supported in a multi-primary environment.
     * KEYTYPE_BYTES_FOUND_CWOBJ4912.useraction=Remove bytes for keys maps from the map set in order to enable primaires in both domains for this map set.  No action is required if you do not wish to support a multi-primary topology with this map set.
     */
    public String KEYTYPE_BYTES_FOUND_CWOBJ4912 = "KEYTYPE_BYTES_FOUND_CWOBJ4912";

    /**
     * <pre>
     * # {0} action
     * # {1} domain name
     * FOREIGN_DOMAIN_NOT_AVAILABLE_CWOBJ4913=CWOBJ4913I: During an attempt to {0} the foreign catalog service for foreign domain {1} could not be reached.  The procedure completed in the local domain but was not completed in the foreign domain.
     * FOREIGN_DOMAIN_NOT_AVAILABLE_CWOBJ4913.explaination=An action was triggered that normally requires interaction between catalog servers of different domains.  That action was not able to coordinate that change with the foreign domain but was able to complete locally.
     * FOREIGN_DOMAIN_NOT_AVAILABLE_CWOBJ4913.useraction=If the foreign domain is still available, run the action on the foreign domain separately.  If the foreign domain is not running, no action is necessary.
     * </pre>
     */
    public String FOREIGN_DOMAIN_NOT_AVAILABLE_CWOBJ4913 = "FOREIGN_DOMAIN_NOT_AVAILABLE_CWOBJ4913";

    /**
     * <pre>
     * # {0} foreign domain name
     * # {1} retry interval in milliseconds
     * DOMAIN_PING_FAILURE_CWOBJ4914=CWOBJ4914W: Attempt to ping foreign domain, {0}, failed.  Retrying ping in {1} milliseconds.
     * DOMAIN_PING_FAILURE_CWOBJ4914.explanation=The foreign domain is unreachable.
     * DOMAIN_PING_FAILURE_CWOBJ4914.useraction=Restart the unreachable foreign domain in order to replicate data between domains.
     * </pre>
     */
    public String DOMAIN_PING_FAILURE_CWOBJ4914 = "DOMAIN_PING_FAILURE_CWOBJ4914";

    /**
     * <pre>
     * # {0} foreign domain name
     * DOMAIN_PING_SUCCESS_CWOBJ4915=CWOBJ4915I: Successfully pinged the foreign domain, {0}.
     * DOMAIN_PING_SUCCESS_CWOBJ4915.explanation=This domain successfully reached the foreign domain.
     * DOMAIN_PING_SUCCESS_CWOBJ4915.useraction=No user action required.
     * </pre>
     */
    public String DOMAIN_PING_SUCCESS_CWOBJ4915 = "DOMAIN_PING_SUCCESS_CWOBJ4915";

    /**
     * <pre>
     * # {0} foreign domain name
     * FOREIGN_DOMAIN_RECYCLED_CWOBJ4916=CWOBJ4916I: The local domain detected that domain {0} has been restarted after being unavailable for some time.
     * FOREIGN_DOMAIN_RECYCLED_CWOBJ4916.explanation=The foreign domain has been recycled.  An exchange of data between domains will be initiated.
     * FOREIGN_DOMAIN_RECYCLED_CWOBJ4916.useraction=No user action required.
     * </pre>
     */
    public String FOREIGN_DOMAIN_RECYCLED_CWOBJ4916 = "FOREIGN_DOMAIN_RECYCLED_CWOBJ4916";

    /**
     * <pre>
     * # {0} foreign domain name
     * # {1} number of consecutive unsuccessful attempts
     * DOMAIN_PING_SUCCESSFUL_AFTER_UNSUCCESSFUL_CWOBJ4917=CWOBJ4917: This domain successfully pinged the foreign domain, {0}, after {1} consecutive unsuccessful attempts.
     * DOMAIN_PING_SUCCESSFUL_AFTER_UNSUCCESSFUL_CWOBJ4917.explanation=This domain successfully reached the foreign domain after a series of unsuccessful attempts.
     * DOMAIN_PING_SUCCESSFUL_AFTER_UNSUCCESSFUL_CWOBJ4917.useraction=No user action required.
     * </pre>
     */
    public String DOMAIN_PING_SUCCESSFUL_AFTER_UNSUCCESSFUL_CWOBJ4917 = "DOMAIN_PING_SUCCESSFUL_AFTER_UNSUCCESSFUL_CWOBJ4917";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} map set name
     * # {3} ObjectGrid name
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRATEGY_CWOBJ4918=CWOBJ4918E: Domain {0} will not send updates to domain {1} for map set {2} from ObjectGrid {3} because the placement strategy on foreign domain {1} is set to something other than a FIXED_PARTITION strategy.
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRATEGY_CWOBJ4918.explanation=The map set must be configured to use a fixed partition placement strategy in order to achieve a multi-primary topology.
     * MAPSET_INCOMPATIBLE_PLACEMENT_STRATEGY_CWOBJ4918.useraction=Stop the containers hosting the map set in 1 of the domains.  Restart these containers using a fixed partition placement strategy.
     * </pre>
     */
    public String MAPSET_INCOMPATIBLE_PLACEMENT_STRATEGY_CWOBJ4918 = "MAPSET_INCOMPATIBLE_PLACEMENT_STRATEGY_CWOBJ4918";

    /**
     * <pre>
     * # {0} foreign domain name
     * FOREIGN_DOMAIN_UNAVAILABLE_CWOBJ4919=CWOBJ4919E: The foreign catalog service domain, {0}, is not currently available to accept requests. The local catalog service domain lost connection with the foreign catalog service domain, {0}. When the foreign catalog service domain becomes available, the catalog service domains will be linked.
     * FOREIGN_DOMAIN_UNAVAILABLE_CWOBJ4919.explanation=Connection to the foreign catalog service has been lost.
     * FOREIGN_DOMAIN_UNAVAILABLE_CWOBJ4919.useraction=Make sure connectivity is established between local and foreign domain. Restart foreign catalog server if needed.
     * </pre>
     */
    public String FOREIGN_DOMAIN_UNAVAILABLE_CWOBJ4919 = "FOREIGN_DOMAIN_UNAVAILABLE_CWOBJ4919";

    /**
     * <pre>
     * # {0} foreign domain name
     * FOREIGN_DOMAIN_LINK_TERMINATED_CWOBJ4920=CWOBJ4920W: The link to the foreign catalog service domain {0} has been terminated.
     * FOREIGN_DOMAIN_LINK_TERMINATED_CWOBJ4920.explanation=The was a request for the link to be termianted.
     * FOREIGN_DOMAIN_LINK_TERMINATED_CWOBJ4920.useraction=Make sure that the request is legimit and establish the link back if needed.
     * </pre>
     */
    public String FOREIGN_DOMAIN_LINK_TERMINATED_CWOBJ4920 = "FOREIGN_DOMAIN_LINK_TERMINATED_CWOBJ4920";

    /**
     * <pre>
     * # {0} received domain name
     * # {1} received endpoints
     * ESTABLISH_LINK_RECEIVED_CWOBJ4922=CWOBJ4922I: Received request to establish a link with catalog service domain {0} at catalog service endpoints {1}.
     * ESTABLISH_LINK_RECEIVED_CWOBJ4922.explanation=The catalog server received a request to establish a Multi-master replicaton link to a catalog server at the provided endpoints.
     * ESTABLISH_LINK_RECEIVED_CWOBJ4922.useraction=No user action required.
     * </pre>
     */
    public String ESTABLISH_LINK_RECEIVED_CWOBJ4922 = "ESTABLISH_LINK_RECEIVED_CWOBJ4922";

    /**
     * <pre>
     * # {0} received domain name
     * DISMISS_LINK_RECEIVED_CWOBJ4923=CWOBJ4923I: Received request to dismiss a link with catalog service domain {0}.
     * DISMISS_LINK_RECEIVED_CWOBJ4923.explanation=The catalog server received a request to dismiss a Multi-master replicaton link to a catalog service domain.
     * DISMISS_LINK_RECEIVED_CWOBJ4923.useraction=No user action required.
     * </pre>
     */
    public String DISMISS_LINK_RECEIVED_CWOBJ4923 = "DISMISS_LINK_RECEIVED_CWOBJ4923";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} received domain name
     * DOMAIN_NAME_CHECK_CWOBJ4924I=CWOBJ4924I: This domain, {0}, received a domain name confirmation from foreign domain {1}.
     * DOMAIN_NAME_CHECK_CWOBJ4924I.explanation=A foreign domain started the establish link process for multi master replication.
     * DOMAIN_NAME_CHECK_CWOBJ4924I.useraction=No user action required.
     * </pre>
     */
    public String DOMAIN_NAME_CHECK_CWOBJ4924I = "DOMAIN_NAME_CHECK_CWOBJ4924I";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} received domain name
     * # {2} link status
     * DOMAIN_HEARTBEAT_STOP_CWOBJ4925I=CWOBJ4925I: This domain ({0}) stopped heartbeating from foreign domain {1} because the current link status is {2}.
     * DOMAIN_HEARTBEAT_STOP_CWOBJ4925I.explanation=This domain no longer needs to maintain a heartbeat with the foreign domain.
     * DOMAIN_HEARTBEAT_STOP_CWOBJ4925I.useraction=No user action required.
     * </pre>
     */
    public String DOMAIN_HEARTBEAT_STOP_CWOBJ4925I ="DOMAIN_HEARTBEAT_STOP_CWOBJ4925I";
    
    /**
     * <pre>
     * # {0} provided domain name
     * # {1} actual domain name
     * # {2} provided endpoints
     * # do not translate establishLink
     * DOMAIN_ENDPOINT_MISMATCH_CWOBJ4926W=CWOBJ4926W: The provided foreign catalog service domain name, {0}, does not match the configured catalog service domain name, {1}, for the provided end points: {2}.  Review the catalog service domain name configurations and verify the establishLink command parameters or foreign domain and foreign endpoint properties.
     * DOMAIN_ENDPOINT_MISMATCH_CWOBJ4926W.explanation=The local domain contacted the provided foreign catalog server endpoints, but provided domain name does not match the actual domain name of the foreign domain. The domains cannot be linked.
     * DOMAIN_ENDPOINT_MISMATCH_CWOBJ4926W.useraction=Review the domain names of the catalog service domains and compare to the establishLink parameters or foreign domain properties configured in the catalog server property files.
     * </pre>
     */
    public String DOMAIN_ENDPOINT_MISMATCH_CWOBJ4926W = "DOMAIN_ENDPOINT_MISMATCH_CWOBJ4926W";

    /**
     * <pre>
     * # {0} provided foreign endpoints
     * # {1} provided foreign domain name
     * FOREIGN_DOMAIN_ENDPOINTS_INCORRECT_CWOBJ4927E=CWOBJ4927E: The provided foreign endpoints, {0}, are in the wrong format. The correct format is a comma separated list of host name:listener port (or bootstrap port). The foreign domain {1} cannot be linked.
     * FOREIGN_DOMAIN_ENDPOINTS_INCORRECT_CWOBJ4927E.explanation=The provided foreign endpoints could not be parsed into a list of hostnames and listener or bootstrap ports. For example, host1:2809,host2810.
     * FOREIGN_DOMAIN_ENDPOINTS_INCORRECT_CWOBJ4927E.useraction=Change the foreign endpoints. Review the CatalogServiceProperties javadoc for an example of the correct format.
     * </pre>
     */
    public String FOREIGN_DOMAIN_ENDPOINTS_INCORRECT_CWOBJ4927E = "FOREIGN_DOMAIN_ENDPOINTS_INCORRECT_CWOBJ4927E";
    
    /**
     * <pre>
     * # {0} provided domain name
     * # {1} provided endpoints
     * # {2} local endpoints
     * # do not translate establishLink
     * FOREIGN_ENDPOINTS_OVERLAP_LOCAL_CWOBJ4928W=CWOBJ4928W: The provided foreign catalog service endpoints, {1}, for domain {0} conflict with the locally configured catalog service endpoints, {2}.  Review the catalog service domain name configurations and verify the establishLink command parameters or foreign domain and foreign endpoint properties.
     * FOREIGN_ENDPOINTS_OVERLAP_LOCAL_CWOBJ4928W.explanation=The provided foreign catalog server endpoints include one or more endpoints which are part of the list of local catalog service endpoints. The domains cannot be linked.
     * FOREIGN_ENDPOINTS_OVERLAP_LOCAL_CWOBJ4928W.useraction=Review the endpoints of the catalog service domains and compare them to the establishLink parameters or foreign domain properties configured in the catalog server property files.
     * </pre>
     */
    public String FOREIGN_ENDPOINTS_OVERLAP_LOCAL_CWOBJ4928W = "FOREIGN_ENDPOINTS_OVERLAP_LOCAL_CWOBJ4928W";

    /**
     * <pre>
     * # {0} foreign domain name
     * DISMISS_SENT_TO_FOREIGN_CWOBJ4929I=CWOBJ4929I: Dismiss link request to unlink from this domain successfully sent to foreign domain {0}.
     * DISMISS_SENT_TO_FOREIGN_CWOBJ4929I.explanation=The local catalog service domain was successfully able to tell the foreign domain to unlink the Multi-master replication (MMR) link.
     * DISMISS_SENT_TO_FOREIGN_CWOBJ4929I.useraction=No user action required.
     * </pre>
     */
    public String DISMISS_SENT_TO_FOREIGN_CWOBJ4929I = "DISMISS_SENT_TO_FOREIGN_CWOBJ4929I";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} foreign endpoints
     * # do not translate establishLink
     * SAME_DOMAIN_NAMES_ESTABLISH_CWOBJ4930W=CWOBJ4930W: The local catalog service domain name and foreign catalog service domain name provided on the establishLink command are the same. A catalog service domain cannot be linked to itself. The local catalog service domain is {0}. The foreign catalog service domain name provided is {1} with foreign endpoints of: {2}. Review the catalog service domain name configurations and verify the establishLink command parameters.
     * SAME_DOMAIN_NAMES_ESTABLISH_CWOBJ4930W.explanation=The foreign domain name matched the local domain name.
     * SAME_DOMAIN_NAMES_ESTABLISH_CWOBJ4930W.useraction=Provide the name of the foreign domain.
     * </pre>
     */
    public String SAME_DOMAIN_NAMES_ESTABLISH_CWOBJ4930W = "SAME_DOMAIN_NAMES_ESTABLISH_CWOBJ4930W";

    /**
     * <pre>
     * # {0} local domain name
     * # {1} foreign domain name
     * # {2} foreign endpoints
     * # do not translate dismissLink
     * SAME_DOMAIN_NAMES_DISMISS_CWOBJ4931W=CWOBJ4931W: The local catalog service domain name and foreign catalog service domain name provided on the dismissLink command are the same. A domain cannot be unlinked from itself. The local catalog service domain is {0}. The foreign catalog service domain name provided is {1}. Review the catalog service domain name configurations and verify the dismissLink command parameters.
     * SAME_DOMAIN_NAMES_DISMISS_CWOBJ4931W.explanation=The foreign domain name matched the local domain name.
     * SAME_DOMAIN_NAMES_DISMISS_CWOBJ4931W.useraction=Provide the name of the foreign domain.
     * </pre>
     */
    public String SAME_DOMAIN_NAMES_DISMISS_CWOBJ4931W = "SAME_DOMAIN_NAMES_DISMISS_CWOBJ4931W";
    
    /**
     * <pre>
     * # {0} foreign domain name
     * # {1} exception
     * CANNOT_ESTABLISH_LINK_CWOBJ4932I=CWOBJ4932I: The first request to establish link to the foreign domain {0} failed. The link will retry until the foreign domain is available. The exception was {1}.
     * CANNOT_ESTABLISH_LINK_CWOBJ4932I.explanation=The first request to establish a linke to the request foreign domain fail, but will be tried again until the foreign domain starts.
     * CANNOT_ESTABLISH_LINK_CWOBJ4932I.useraction=If the foreign domain is not started yet, no user action required. If the foreign domain is running, review the full exception in the ffdc directory.
     * </pre>
     */
    public String CANNOT_ESTABLISH_LINK_CWOBJ4932I = "CANNOT_ESTABLISH_LINK_CWOBJ4932I";
    
    /**
     * <pre>
     * # {0} Exception class
     * # {1} Exception message
     * MMR_LINK_FAIL_EXCEPTION_CWOBJ4933E=CWOBJ4933E: Received an exception attempting to connect to the foreign domain, {0}. The domains are not linked. {1}
     * MMR_LINK_FAIL_EXCEPTION_CWOBJ4933E.explanation=The request to establish a multi-master replication link to a foreign domain failed. Review the exception.
     * MMR_LINK_FAIL_EXCEPTION_CWOBJ4933E.useraction=Review the foreign domain endpoints. Verify the foreign domain is available.
     * </pre>
     */
    public String MMR_LINK_FAIL_EXCEPTION_CWOBJ4933E = "MMR_LINK_FAIL_EXCEPTION_CWOBJ4933E";
    
    /**
     * <pre>
     * # {0} foreign domain name
     * DISMISS_SUCCESSFUL_CWOBJ4934I=CWOBJ4934I: The link to foreign domain {0} was successfully dismissed.
     * DISMISS_SUCCESSFUL_CWOBJ4934I.explanation=The local domain is no longer linked to the listed foreign domain. To link the domains again, use the xscmd command establishLink.
     * DISMISS_SUCCESSFUL_CWOBJ4934I.useraction=No user action required.
     * </pre>
     */
    public String DISMISS_SUCCESSFUL_CWOBJ4934I = "DISMISS_SUCCESSFUL_CWOBJ4934I";
    
    /**
     * <pre>
     * # {0} partition name
     * InvalidPartition=CWOBJ6622E: Partition ({0}) is invalid.
     * InvalidPartition.explanation=Partition is invalid.
     * InvalidPartition.useraction=No action is required.
     * </pre>
     */
    // 11/11/09 kristip No longer used
    // public String InvalidPartition = "InvalidPartition";
    /**
     * <pre>
     * # {0} zone name
     * # {1} partition name
     * PrimaryZone=CWOBJ6904I: Zone ({0}) is set as the primary zone of partition ({1}).
     * PrimaryZone.explanation= This zone is set as the primary zone for the specified partition.
     * PrimaryZone.useraction=No action is required.
     * </pre>
     */
    // 11/11/09 kristip No longer used
    // public String PrimaryZone = "PrimaryZone";
    /**
     * <pre>
     * # {0} port number
     * DynamicPort=CWOBJ7006I: ObjectGrid server agent generated dynamic port {0}.
     * DynamicPort.explanation=ObjectGrid server agent generated dynamic port for HAManager.
     * DynamicPort.useraction=No action is required.
     * </pre>
     */
    public String DynamicPort = "DynamicPort";

    /**
     * <pre>
     * # {0} server name
     * # {1} core group name
     * DeadServer=CWOBJ7200I: Detected the failure of server ({0}) in core group ({1}).
     * DeadServer.explanation= Server failure is detected and reported to catalog server.
     * DeadServer.useraction=No action is required.
     * </pre>
     */
    public String DeadServer = "DeadServer";

    /**
     * <pre>
     * # {0} server name
     * # {1} core group name
     * NewServer=CWOBJ7201I: Detected the addition of new server ({0}) in core group ({1}).
     * NewServer.explanation= New server is detected and reported to catalog server.
     * NewServer.useraction=No action is required.
     * </pre>
     */
    public String NewServer = "NewServer";

    /**
     * <pre>
     * # {0} server name
     * # {1} core group name
     * NewLeader=CWOBJ7203I: Leader changed.  New leader ({0}) is elected in core group ({1}) and reported to catalog server.
     * NewLeader.explanation= New leader is elected and reported to catalog server.
     * NewLeader.useraction=No action is required.
     * </pre>
     */

    public String NewLeader = "NewLeader";

    /**
     * <pre>
     * # {0} server name
     * # {1} core group name
     * CurrLeader=CWOBJ7204I: The current leader for core group ({1}) is ({0}).
     * CurrLeader.explanation= Report the current leader.
     * CurrLeader.useraction=No action is required.
     * </pre>
     */

    // 10/27/09 kristip No longer used
    // public String CWOBJ7204 = "CurrLeader";
    /**
     * <pre>
     * # {0} The server who is leader but not in core group.
     * CWOBJ7205=CWOBJ7205I: Server, {0}, has sent a membership change notice that will be rejected as this member has already been removed from the core group.
     * CWOBJ7205.explanation=The server was removed from the grid's core group because it was previously unreachable, the new action sent to this server will be ignored.
     * CWOBJ7205.useraction=Restart this server as it is no longer a member of the grid.
     * </pre>
     */
    public String CWOBJ7205 = "CWOBJ7205";

    /**
     * <pre>
     * # {0} new leader name
     * # {1} old leader name
     * ChangeLeader=CWOBJ7206I: New leader is ({0}). Old leader was ({1}).
     * ChangeLeader.explanation= New leader is elected to replace old leader.
     * ChangeLeader.useraction=none
     * </pre>
     */
    // 10/27/09 kristip No longer used
    // public String CWOBJ7206 = "ChangeLeader";

    /**
     * <pre>
     * # {0} the server who submitted the heartbeat
     * # {1} the core group associated with the heartbeat
     * # {2} the list of members of the core group according to the server who submitted the heart beat
     * # {3} member previously associated with the core group who are being removed from view
     * CWOBJ7211=CWOBJ7211I: As a result of a heartbeat (view heartbeat type) from leader {0} for core group {1} with member list {2}, the server {3} is being removed from the core grop view.
     * CWOBJ7211.explanation=The server was removed from the core group because it was deemed unreachable.
     * CWOBJ7211.useraction=Investigate whether the becomes network accessible to the server sending the heartbeat, and if not, restart the server and if possible address accessibility.
     * </pre>
     */
    public String CWOBJ7211 = "CWOBJ7211";

    /**
     * <pre>
     # {0} core group version
    # {1} list of host:port
    # {2} list of servers
    HA_STANDALONE_DEFINED_SET_EXPORTED_CWOBJ7212I=CWOBJ7212I: The catalog has sent an updated defined set with version {0} and host:port list {1} to the following list of servers:  {2}.
    HA_STANDALONE_DEFINED_SET_EXPORTED_CWOBJ7212I.explanation=The defined set indicates the list of servers the catalog has currently assigned to a given core group.
    HA_STANDALONE_DEFINED_SET_EXPORTED_CWOBJ7212I.useraction=No action is required.
     * </pre>
     */
    public String HA_STANDALONE_DEFINED_SET_EXPORTED_CWOBJ7212I = "HA_STANDALONE_DEFINED_SET_EXPORTED_CWOBJ7212I";

    /**
     * <pre>
    # {0} core group
    # {1} server which heartbeated
    # {2} revisoin
    # {3} current view
    # {4} previous view
    HA_SPLIT_PARTITION_DETECTED_CWOBJ7213W=CWOBJ7213W: The core group {0} received a heart beat notfication from the server {1} with revision {2} and a current view listing {3} and previous listing {4} - such a combination indicates a partitioned core group.
    HA_SPLIT_PARTITION_DETECTED_CWOBJ7213W.explanation=Resource contentation, such as networking issues or Java garbage collection, can lead to eXtreme Scale processes being unable to communicate with each other.  As such, the core group could be divided into multiple core groups, each with a leader.
    HA_SPLIT_PARTITION_DETECTED_CWOBJ7213W.useracation=Correction of the resource contention or problem is strongly suggested.
     * </pre>
     */
    public String HA_SPLIT_PARTITION_DETECTED_CWOBJ7213W = "HA_SPLIT_PARTITION_DETECTED_CWOBJ7213W";

    /**
     * <pre>
    # {0} core group
    # {1} view
    HA_DEFINED_SET_VIEW_DIFFERENCE_IGNORED_CWOBJ7214I=CWOBJ7214I:  While processing a container heart beat for the core group {0}, a difference between the defined set and view was detected.  However, since the previous and current views are the same, {1}, this difference can be ignored.
    HA_DEFINED_SET_VIEW_DIFFERENCE_IGNORED_CWOBJ7214I.explanation=Especially during concurrent server starts, there are potential windows where defined set and view discrepancies can be ignored.  But we note the condition for potential debug purposes.
    HA_DEFINED_SET_VIEW_DIFFERENCE_IGNORED_CWOBJ7214I.useraction=No action is required.
     * </pre>
     */
    public String HA_DEFINED_SET_VIEW_DIFFERENCE_IGNORED_CWOBJ7214I = "HA_DEFINED_SET_VIEW_DIFFERENCE_IGNORED_CWOBJ7214I";

    /**
     * <pre>
     * # {0} the server who submitted the heartbeat
     * # {1} the core group associated with the heartbeat
     * # {2} the list of members of the core group according to the server who submitted the heart beat
     * # {3} member previously associated with the core group who are being removed from view
     * CWOBJ7215=CWOBJ7215I: While batching failures via the config property com.ibm.websphere.objectgrid.server.catalog.ha.server.per.unit, as a result of a heartbeat (view heartbeat type) from leader {0} for core group {1} with member list {2}, the server {3} is scheduled to be removed from the core grop view.  Look for corresponding CWOBJ7211 for actual removal.
     * CWOBJ7215.explanation=The server was removed from the core group because it was deemed unreachable.
     * CWOBJ7215.useraction=Investigate whether the becomes network accessible to the server sending the heartbeat, and if not, restart the server and if possible address accessibility.
     * </pre>
     */
    public String CWOBJ7215="CWOBJ7215";
    
    /**
     * <pre>
     * # {0} core group
     * # {1} server which heartbeated
     * HEARTBEAT_IGNORED_RECONNECTING_CWOBJ7216I=CWOBJ7216I: While processing a container heartbeat for the core group {0} from server {1}, the heartbeat was ignored because the server had recently reconnected. 
     * HEARTBEAT_IGNORED_RECONNECTING_CWOBJ7216I.explanation=When containers are reconnecting, there are potential windows where those servers may send a heartbeat with an incomplete view of the core group. The condition is noted for potential debug purposes.
     * HEARTBEAT_IGNORED_RECONNECTING_CWOBJ7216I.useraction=No action is required.
     * </pre>
     */
    public String HEARTBEAT_IGNORED_RECONNECTING_CWOBJ7216I = "HEARTBEAT_IGNORED_RECONNECTING_CWOBJ7216I";
    
    public String CAT_XIO_CHFW_NOTIFY_OF_SERVER_DOWN_CWOBJ7217I = "CAT_XIO_CHFW_NOTIFY_OF_SERVER_DOWN_CWOBJ7217I";
    
    public String CAT_LEADER_MGR_NOTIFY_OF_SERVER_DOWN_CWOBJ7218I = "CAT_LEADER_MGR_NOTIFY_OF_SERVER_DOWN_CWOBJ7218I";
    
    public String LS_XIO_SERVER_BIND_CWOBJ7219 = "LS_XIO_SERVER_BIND_CWOBJ7219";
    
    public String LS_XIO_SERVER_UNBIND_CWOBJ7220 = "LS_XIO_SERVER_UNBIND_CWOBJ7220";
    
    /**
     * <pre>
     * # {0} server name
     * # {0} core group name
     * PeerManagerStart=CWOBJ7700I: Peer Manager service started successfully in server ({0}) with core group ({1}).
     * PeerManagerStart.explanation=Peer Manager service started successfully.
     * PeerManagerStart.useraction=No action is required.
     * </pre>
     */
    public String PeerManagerStart = "PeerManagerStart";

    /**
     * <pre>
     * # {0} core group name
     * # {1} host name
     * # {2} port number
     * Start_HAController=CWOBJ7800I: Start ObjectGrid HA Controller with core group ({0}), host ({1}), and port ({2}).
     * Start_HAController.explanation=Start ObjectGrid High Availability Controller.
     * Start_HAController.useraction=No action is required.
     * </pre>
     */
    public String Start_HAController = "Start_HAController";

    /*
     * XIO messages: 7850-7899
     */

    /**
     * # {0} method name not implemented
     * ERROR_UNIMPLEMENTED_IN_XIO_CWOBJ7850E=CWOBJ7850E: The internal {0} API is from a previous version and is not implemented in the eXtremeIO transport.
     * ERROR_UNIMPLEMENTED_IN_XIO_CWOBJ7850E.explanation=This error occurred because an internal method from a previous version was run that should no longer be used.
     * ERROR_UNIMPLEMENTED_IN_XIO_CWOBJ7850E.user=Contact IBM support.  For more information about contacting support, see the information center.
     */
    public String ERROR_UNIMPLEMENTED_IN_XIO_CWOBJ7850E = "ERROR_UNIMPLEMENTED_IN_XIO_CWOBJ7850E";

    /**
     * # {0} exception
     * WRITE_BEHIND_FAILED_CWOBJ5050=CWOBJ5050W: The write behind operation failed with exception: {0}
     * WRITE_BEHIND_FAILED_CWOBJ5050.explanation=The write behind operation failed. The configuration may be incorrect or the WebSphere eXtreme Scale environment may be unreachable.
     * WRITE_BEHIND_FAILED_CWOBJ5050.useraction=Review the exception, resolve the error and retry the operation.
     */
    public String WRITE_BEHIND_FAILED_CWOBJ5050 = "WRITE_BEHIND_FAILED_CWOBJ5050";

    /**
     * # {0} parameter name
     * # {1} parameter value
     * DEPRECATED_CONFIGURATION_PARAMETER_CWOBJ5051=CWOBJ5051W: Deprecated configuration parameter {0} defined with value {1}
     * DEPRECATED_CONFIGURATION_PARAMETER_CWOBJ5051.explanation=A deprecated configuration parameter was defined.
     * DEPRECATED_CONFIGURATION_PARAMETER_CWOBJ5051.useraction=Migrate to new configuration parameters.
     */
    public String DEPRECATED_CONFIGURATION_PARAMETER_CWOBJ5051 = "DEPRECATED_CONFIGURATION_PARAMETER_CWOBJ5051";

    /**
     * # Do not translate: WebSphere, eXtreme, Scale, Hibernate
     * # {0} unsupported Hibernate cache access strategy type
     * # {1} supported Hibernate cache access strategy type
     * UNSUPPORTED_ACCESS_STRATEGY_CWOBJ5052=CWOBJ5052E: Unsupported Hibernate cache access strategy {0} configured. Use {1} instead.
     * UNSUPPORTED_ACCESS_STRATEGY_CWOBJ5052.explanation=An unsupported Hibernate cache access strategy was configured.
     * UNSUPPORTED_ACCESS_STRATEGY_CWOBJ5052.useraction=Configure the WebSphere eXtreme Scale Hibernate cache to use a supported cache access strategy.
     */
    public String UNSUPPORTED_ACCESS_STRATEGY_CWOBJ5052 = "UNSUPPORTED_ACCESS_STRATEGY_CWOBJ5052";

    /**
     * # Do not translate: WebSphere, eXtreme, Scale
     * # {0} Grid
     * HIBERNATE_CACHE_GRID_RECONNECTED_CWOBJ5053=CWOBJ5053I: The WebSphere eXtreme Scale Hibernate Cache provider has reconnected with the {0} WebSphere eXtreme Scale grid.
     * HIBERNATE_CACHE_GRID_RECONNECTED_CWOBJ5053.explanation=The provider has been reconnected the specified grid.
     * HIBERNATE_CACHE_GRID_RECONNECTED_CWOBJ5053.useraction=No action is required.
     */
    public String HIBERNATE_CACHE_GRID_RECONNECTED_CWOBJ5053 = "HIBERNATE_CACHE_GRID_RECONNECTED_CWOBJ5053";

    /**
     * # Do not translate: WebSphere, eXtreme, Scale, Hibernate
     * # {0} Grid
     * HIBERNATE_CACHE_GRID_DISCONNECTED_CWOBJ5054=CWOBJ5054E: The WebSphere eXtreme Scale Hibernate Cache provider has become disconnected from the {0} WebSphere eXtreme Scale grid.
     * HIBERNATE_CACHE_GRID_DISCONNECTED_CWOBJ5054.explanation=The provider has become disconnected from the specified grid.
     * HIBERNATE_CACHE_GRID_DISCONNECTED_CWOBJ5054.useraction=Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs.
     */
    public String HIBERNATE_CACHE_GRID_DISCONNECTED_CWOBJ5054 = "HIBERNATE_CACHE_GRID_DISCONNECTED_CWOBJ5054";

    /**
     * <pre>
     * # {0} The session state store provider name
     * # {1} A string comprising the web application site name concatentated with the web application virtual path
     * # {2} A string repesenting the target logs directory
     * # DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_STARTING_CWOBJ6200=CWOBJ6200I: Initialization started: provider: '{0}', application: '{1}', log directory: {2}
     * # DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_STARTING_CWOBJ6200.explanation=The session state store provider initialization for the specified web application has begun.
     * # DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_STARTING_CWOBJ6200.useraction=No action is required.
     * </pre>
     */
    public String DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_STARTING_CWOBJ6200 = "DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_STARTING_CWOBJ6200";

    /**
     * <pre>
     * # {0} The session state store provider name
     * # {1} A string comprising the web application site name concatenated with the web application virtual path
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_OK_CWOBJ6201=CWOBJ6201I: Initialization complete for provider: '{0}', application: '{1}'.  
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_OK_CWOBJ6201.explanation=The session state store provider initialization for the specified web application has completed successfully.
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_OK_CWOBJ6201.useraction=No action is required.
     * </pre>
     */
    public String DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_OK_CWOBJ6201 = "DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_OK_CWOBJ6201";

    /**
     * <pre>
     * # {0} The session state store provider name
     * # {1} A string comprising the web application site name concatenated with the web application virtual path
     * # {2} The target grid name
     * # {3} The target map name
     * # {4} The connection failure details
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_FAIL_CWOBJ6202=CWOBJ6202E: Initialization failed for provider: '{0}', application: '{1}'.  Connecting to grid '{2}' and map '{3}' encountered the following error:\n{4}
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_FAIL_CWOBJ6202.explanation=The session state store provider initialization failed.
     * DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_FAIL_CWOBJ6202.useraction=Depending on the failure details, check network connectivity with the grid, confirm the grid and map names, and confirm that the grid configuration matches the session state store provider requirements.
     * </pre>
     */
    public String DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_FAIL_CWOBJ6202 = "DOTNET_SESSION_STATE_STORE_PROVIDER_INITIALIZATION_COMPLETE_FAIL_CWOBJ6202";

    /**
     * <pre>
     * # {0} A string comprising the web application site name concatenated with the web application virtual path
     * # {1} The target grid name
     * # {2} The target map name
     * # {3} The connection failure details
     * DOTNET_SESSION_STATE_STORE_PROVIDER_GRID_CONNECTION_DROPPED_CWOBJ6203=CWOBJ6203E: Grid connection failure: application: '{0}', grid '{1}', map '{2}'.  The following error was encountered:\n{3}
     * DOTNET_SESSION_STATE_STORE_PROVIDER_GRID_CONNECTION_DROPPED_CWOBJ6203.explanation=The session state store provider is not able to communicate with the grid.
     * DOTNET_SESSION_STATE_STORE_PROVIDER_GRID_CONNECTION_DROPPED_CWOBJ6203.useraction=Check network connectivity with the grid.  Also check that the grid servers are running.
     * </pre>
     */
    public String DOTNET_SESSION_STATE_STORE_PROVIDER_GRID_CONNECTION_DROPPED_CWOBJ6203 = "DOTNET_SESSION_STATE_STORE_PROVIDER_GRID_CONNECTION_DROPPED_CWOBJ6203";

    /**
     * <pre>
     * # {0} A string listing the publicKeyFile Client.Net.properties value being used by the client for .NET Dll
     * DOTNET_PUBLICKEYFILE_NOT_FOUND_CWOBJ6204=CWOBJ6204E: Client.Net.properties publicKeyFile {0} not found, keyfile
     * DOTNET_PUBLICKEYFILE_NOT_FOUND_CWOBJ6204.explanation=The client for .NET cold not locate the configured publicKeyFile.
     * DOTNET_PUBLICKEYFILE_NOT_FOUND_CWOBJ6204.useraction=Check Client.Net.properties publicKeyFile property setting is set to an existing key file.
     * </pre>
     */
    public String DOTNET_PUBLICKEYFILE_NOT_FOUND_CWOBJ6204 = "DOTNET_PUBLICKEYFILE_NOT_FOUND_CWOBJ6204";

    /**
     * <pre>
     * # {0} The clientCertificateKeyStoreLocation Client.Net.properties value being used by the client for .NET
     * # {1} The clientCertificateKeyStore Client.Net.properties value being used by the client for .NET
     * # {2} The clientCertificateSubject Client.Net.properties value being used by the client for .NET
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6205=CWOBJ6205E: The client certificate with a subject of \"{2}\" in key store location:name \"{0}\":\"{1}\" does not have a private key.
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6205.explanation=The client certificate sent to the server during the SSL handshake must have a private key defined.
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6205.useraction=Verify that the Client.Net.properties'' clientCertificateKeyStoreLocation, clientCertificateKeyStore and clientCertificateSubject property settings point to a certificate with a private key.
     * </pre>
     */
    public String DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6205 = "DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6205";

    /**
     * <pre>
     * # {0} The clientCertificateKeyStoreLocation Client.Net.properties value being used by the client for .NET
     * # {1} The clientCertificateKeyStore Client.Net.properties value being used by the client for .NET
     * # {2} The clientCertificateFriendlyName Client.Net.properties value being used by the client for .NET
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6206=CWOBJ6206E: The client certificate with a friendly name of \"{2}\" in key store location:name \"{0}\":\"{1}\" does not have a private key.
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6206.explanation=The client certificate sent to the server during the SSL handshake must have a private key defined.
     * DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6206.useraction=Verify that the Client.Net.properties'' clientCertificateKeyStoreLocation, clientCertificateKeyStore and clientCertificateFriendlyName property settings point to a certificate with a private key.
     * </pre>
     */
    public String DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6206 = "DOTNET_CLIENT_CERTIFICATE_DOESNT_HAVE_PRIVATE_KEY_CWOBJ6206";

    /**
     * <pre>
     * # {0} The clientCertificateKeyStoreLocation Client.Net.properties value being used by the client for .NET
     * # {1} The clientCertificateKeyStore Client.Net.properties value being used by the client for .NET
     * # {2} The clientCertificateSubject Client.Net.properties value being used by the client for .NET
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6207=CWOBJ6207E: A client certificate with a subject of \"{2}\" does not exist in the key store location:name \"{0}\":\"{1}\".
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6207.explanation=The client certificate specified by the Client.Net.properties properties clientCertificateKeyStore and clientCertificateSubject does not exist.
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6207.useraction=Verify that the Client.Net.properties'' clientCertificateKeyStoreLocation, clientCertificateKeyStore and clientCertificateSubject property settings point to an existing certificate.
     * </pre>
     */
    public String DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6207 = "DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6207";

    /**
     * <pre>
     * # {0} The clientCertificateKeyStoreLocation Client.Net.properties value being used by the client for .NET
     * # {1} The clientCertificateKeyStore Client.Net.properties value being used by the client for .NET
     * # {2} The clientCertificateFriendlyName Client.Net.properties value being used by the client for .NET
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6208=CWOBJ6208E: A client certificate with a friendly name of \"{2}\" does not exist in the key store location:name \"{0}\":\"{1}\".
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6208.explanation=The client certificate specified by the Client.Net.properties properties clientCertificateKeyStore and clientCertificateFriendlyName does not exist.
     * DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6208.useraction=Verify that the Client.Net.properties'' clientCertificateKeyStoreLocation, clientCertificateKeyStore and clientCertificateFriendlyName property settings point to an existing certificate.
     * </pre>
     */
    public String DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6208 = "DOTNET_CLIENT_CERTIFICATE_DOES_NOT_EXIST_CWOBJ6208";

    /**
     * <pre>
     * # {0} The clientCertificateKeyStoreLocation Client.Net.properties value being used by the client for .NET
     * # {1} The clientCertificateKeyStore Client.Net.properties value being used by the client for .NET
     * DOTNET_CLIENT_KEY_STORE_DOES_NOT_EXIST_CWOBJ6209=CWOBJ6209E: Unable to access key store location:name \"{0}\":\"{1}\".
     * DOTNET_CLIENT_KEY_STORE_DOES_NOT_EXIST_CWOBJ6209.explanation=The client key store specified by the Client.Net.properties properties clientCertificateKeyStore does not exist.
     * DOTNET_CLIENT_KEY_STORE_DOES_NOT_EXIST_CWOBJ6209.useraction=Verify that the Client.Net.properties'' clientCertificateKeyStoreLocation and clientCertificateKeyStore settings point to an existing key store.
     * </pre>
     */
    public String DOTNET_CLIENT_KEY_STORE_DOES_NOT_EXIST_CWOBJ6209 = "DOTNET_CLIENT_KEY_STORE_DOES_NOT_EXIST_CWOBJ6209";

    /**
     * <pre>
     * # {0} The exception class type
     * # {1} The exception message
     * DOTNET_CLIENT_PRUNING_THREAD_CREATION_FAILURE_CWOBJ6210=CWOBJ6210E: Unable start the log file pruning thread.  Exception: {0} {1}
     * DOTNET_CLIENT_PRUNING_THREAD_CREATION_FAILURE_CWOBJ6210.explanation=Log file pruning is enabled; however, a thread to perform the log file pruning could not be created.
     * DOTNET_CLIENT_PRUNING_THREAD_CREATION_FAILURE_CWOBJ6210.useraction=Examine the exception information to determine the root cause of the failure. Possible causes include invalid client configuration or insufficient system resources.
     * </pre>
     */
    public String DOTNET_CLIENT_PRUNING_THREAD_CREATION_FAILURE_CWOBJ6210 = "DOTNET_CLIENT_PRUNING_THREAD_CREATION_FAILURE_CWOBJ6210";

    /**
     * <pre>
     * # {0} Log file directory
     * # {1} Number of KB deleted during this pruning cycle
     * # {2} Number of filed deleted during this pruning cycle
     * # {3} Number of directories deleted during this pruning cycle
     * DOTNET_CLIENT_PRUNING_RESULTS_CWOBJ6211=CWOBJ6211I: Pruning complete for log dir {0}.  {1}KB pruned from disk: {2} files deleted, {3} directories deleted.
     * DOTNET_CLIENT_PRUNING_RESULTS_CWOBJ6211.explanation=A log file pruning cycle just completed.  Statistics on how many log files and directories were deleted is provided.
     * DOTNET_CLIENT_PRUNING_RESULTS_CWOBJ6211.useraction=None.
     * </pre>
     */
    public String DOTNET_CLIENT_PRUNING_RESULTS_CWOBJ6211 = "DOTNET_CLIENT_PRUNING_RESULTS_CWOBJ6211";

    /**
     * <pre>
     * # {0} ThreadPool maximum worker thread setting
     * # {1} ThreadPool minimum worker thread setting
     * # {2} ThreadPool number of active worker threads
     * # {3} ThreadPool threshold that triggered this message
     * DOTNET_CLIENT_WORKER_THREADPOOL_LOW_CWOBJ6212=CWOBJ6212W: The number of active ThreadPool worker threads is near or has exceeded the ThreadPools minimum level.  ThreadPool worker thread maximum={0} minimum={1} active={2} warning threshold={3}.
     * DOTNET_CLIENT_WORKER_THREADPOOL_LOW_CWOBJ6212.explanation=The application domain''s worker thread pool is close to exceeding or already has exceeded its minimum threshold.  When the minimum threshold is exceeded, grid perfomance can degrade.
     * DOTNET_CLIENT_WORKER_THREADPOOL_LOW_CWOBJ6212.useraction=Either restrict the number of ThreadPool worker threads used by the .NET application, or update the .NET application to programmatically increase the minimum number of worker threads in the ThreadPool.
     * </pre>
     */
    public String DOTNET_CLIENT_WORKER_THREADPOOL_LOW_CWOBJ6212 = "DOTNET_CLIENT_WORKER_THREADPOOL_LOW_CWOBJ6212";

    /**
     * <pre>
     * # {0} ThreadPool maximum IO thread setting
     * # {1} ThreadPool minimum IO thread setting
     * # {2} ThreadPool number of active IO threads
     * # {3} ThreadPool threshold that triggered this message
     * DOTNET_CLIENT_IO_THREADPOOL_LOW_CWOBJ6213=CWOBJ6213W: The number of active ThreadPool IO threads is near or has exceeded the ThreadPools minimum level.  ThreadPool IO thread maximum={0} minimum={1} active={2} warning threshold={3}.
     * DOTNET_CLIENT_IO_THREADPOOL_LOW_CWOBJ6213.explanation=The application domain''s IO thread pool is close to exceeding or already has exceeded its minimum threshold.  When the minimum threshold is exceeded, grid perfomance can degrade.
     * DOTNET_CLIENT_IO_THREADPOOL_LOW_CWOBJ6213.useraction=Either restrict the number of ThreadPool IO threads used by the .NET application, or update the .NET application to programmatically increase the minimum number of IO threads in the ThreadPool
     * </pre>
     */
    public String DOTNET_CLIENT_IO_THREADPOOL_LOW_CWOBJ6213 = "DOTNET_CLIENT_IO_THREADPOOL_LOW_CWOBJ6213";

    /**
     * <pre>
     * # {0} The name of the class
     * # {1} exception
     * XDF_CLASS_NOT_FOUND_IN_APP_CWOBJ6300=CWOBJ6300E: The class {0} could not be found in the application's environment.  Exception: {1}
     * XDF_CLASS_NOT_FOUND_IN_APP_CWOBJ6300.explanation=A serialized value in the map refers to a class that cannot be found in the application's environment.
     * XDF_CLASS_NOT_FOUND_IN_APP_CWOBJ6300.useraction=In order to process this value from the map, the class must be added to the application's CLASSPATH
     * </pre>
     */
    public String XDF_CLASS_NOT_FOUND_IN_APP_CWOBJ6300 = "XDF_CLASS_NOT_FOUND_IN_APP_CWOBJ6300";

    /**
     * <pre>
     * # {0} The name of the class
     * XDF_CLASS_NOT_FOUND_IN_CONTAINER_CWOBJ6301=CWOBJ6301E: The class {0} could not be found in the container server environment.
     * XDF_CLASS_NOT_FOUND_IN_CONTAINER_CWOBJ6301.explanation=A serialized value in the map refers to a class that cannot be found in the container server's environment.
     * XDF_CLASS_NOT_FOUND_IN_CONTAINER_CWOBJ6301.useraction=In order to process this value from the map, the class must be added to the container server's CLASSPATH.
     * </pre>
     */
    public String XDF_CLASS_NOT_FOUND_IN_CONTAINER_CWOBJ6301 = "XDF_CLASS_NOT_FOUND_IN_CONTAINER_CWOBJ6301";

    /**
     * <pre>
     * # {0} The name of the class
     * # {1} Exception
     * XDF_DATADESCRIPTOR_GENERATION_FAILED_CWOBJ6302=CWOBJ6302E: The generation of a data descriptor for class {0} failed with the exception {1}.
     * XDF_DATADESCRIPTOR_GENERATION_FAILED_CWOBJ6302.explanation=An unexpected exception occurred while initializing the data descriptor for the serialization infrastructure.
     * XDF_DATADESCRIPTOR_GENERATION_FAILED_CWOBJ6302.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String XDF_DATADESCRIPTOR_GENERATION_FAILED_CWOBJ6302 = "XDF_DATADESCRIPTOR_GENERATION_FAILED_CWOBJ6302";

    /**
     * <pre>
     * # {0} The name of the class
     * # {1} Exception
     * XDF_TYPE_ID_RETRIEVAL_FAILED_CWOBJ6303=CWOBJ6303E: The retrieval of the type id assignment from the global map for class {0} failed with the exception {1}.
     * XDF_TYPE_ID_RETRIEVAL_FAILED_CWOBJ6303.explanation=An unexpected exception occurred while retrieving the type for the specified class from the grid.  Without this type assignment, the client cannot process the values in the map.
     * XDF_TYPE_ID_RETRIEVAL_FAILED_CWOBJ6303.useraction=Correct the problem specified within the exception message or contact IBM Software Support.
     * </pre>
     */
    public String XDF_TYPE_ID_RETRIEVAL_FAILED_CWOBJ6303 = "XDF_TYPE_ID_RETRIEVAL_FAILED_CWOBJ6303";

    /**
     * <pre>
     * # {0} The name of the class 
     * # {1} Exception
     * XDF_TYPEID_NOT_ASSIGNED_CWOBJ6304=CWOBJ6304E: A type identifer was not assigned to class {0} due to the exception {1}.
     * XDF_TYPEID_NOT_ASSIGNED_CWOBJ6304.explanation=An error occurred while communicating with the grid that resulted in an exception.
     * XDF_TYPEID_NOT_ASSIGNED_CWOBJ6304.useraction=Correct the problem identified by the exception message or contact IBM Software Support.
     * </pre>
     */
    public String XDF_TYPEID_NOT_ASSIGNED_CWOBJ6304 = "XDF_TYPEID_NOT_ASSIGNED_CWOBJ6304";

    /**
     * <pre>
     * # {0} The name of the class
     * XDF_NOT_CONFIGURED_WITH_GRID_CWOBJ6305=CWOBJ6305E: A grid was not associated with the serialization infrastructure - could not lookup class {0}
     * XDF_NOT_CONFIGURED_WITH_GRID_CWOBJ6305.explanation=An error occurred while configuring the serialization infrastructure.
     * XDF_NOT_CONFIGURED_WITH_GRID_CWOBJ6305.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String XDF_NOT_CONFIGURED_WITH_GRID_CWOBJ6305 = "XDF_NOT_CONFIGURED_WITH_GRID_CWOBJ6305";

    /**
     * <pre>
     * # {0} The name of the map
     * XDF_ENABLED_CWOBJ6306=CWOBJ6306I: XDF has been enabled for map {0}.
     * XDF_ENABLED_CWOBJ6306.explanation=XDF serialization has been enabled for the specified map.  
     * XDF_ENABLED_CWOBJ6306.useraction=No action is required.
     * </pre>
     */
    public String XDF_ENABLED_CWOBJ6306 = "XDF_ENABLED_CWOBJ6306";

    /**
     * <pre>
     * # {0} Class name of serializer
     * # {1} Exception
     * XDF_FAILED_TO_CREATE_SERIALIZER_CWOBJ6307E=CWOBJ6307E: The creation of a serializer failed for {0} with the exception={1}. 
     * XDF_FAILED_TO_CREATE_SERIALIZER_CWOBJ6307E.explanation=An error occurred while creating a serializer class.   
     * XDF_FAILED_TO_CREATE_SERIALIZER_CWOBJ6307E.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String XDF_FAILED_TO_CREATE_SERIALIZER_CWOBJ6307 = "XDF_FAILED_TO_CREATE_SERIALIZER_CWOBJ6307";

    /**
     * <pre>
     * # {0} Class name
     * # {1} Exception
     * XDF_METADATA_FAILED_UPDATE_EXCEPTION_CWOBJ6308=CWOBJ6308E: An exception occurred while updating the metadata for class {0}.  Exception={1}  
     * XDF_METADATA_FAILED_UPDATE_EXCEPTION_CWOBJ6308.explanation=An error occurred while updating the metadata for the specified class.  This metadata is required in order for the application to use this type.   
     * XDF_METADATA_FAILED_UPDATE_EXCEPTION_CWOBJ6308.useraction=Correct the problem identified by the exception message or contact IBM Software Support is the problem persists.
     * </pre>
     */
    public String XDF_METADATA_FAILED_UPDATE_EXCEPTION_CWOBJ6308 = "XDF_METADATA_FAILED_UPDATE_EXCEPTION_CWOBJ6308";

    /**
     * <pre>
     * # {0} Class Alias discovery path     
     * XDF_JVM_ARG_CLASSALIAS_PATH_NOT_SPECIFIED_CWOBJ6309=CWOBJ6309I: The JVM argument -D{0} is not specified in the client application. The class alias discovery scan is skipped.  
     * XDF_JVM_ARG_CLASSALIAS_PATH_NOT_SPECIFIED_CWOBJ6309.explanation=The class alias classpath JVM option is not specified in the application when the client application is started. The class alias discovery is ignored.   
     * XDF_JVM_ARG_CLASSALIAS_PATH_NOT_SPECIFIED_CWOBJ6309.useraction=Set the -D option for class alias jvm argument and pass in the list of the jars and/or specify folders that contains Java classes to be correlated with the class alias. Application requires to set it as java JVM argument in their application to leverage the Class Alias discovery feature.
     * </pre>
     */
    public String XDF_JVM_ARG_CLASSALIAS_PATH_NOT_SPECIFIED_CWOBJ6309 = "XDF_JVM_ARG_CLASSALIAS_PATH_NOT_SPECIFIED_CWOBJ6309";

    /**
     * <pre>
     * # {0} class name
     * # {1} exception
     * EXCEPTION_CREATING_SERIALIZATION_OBJECT_CWOBJ6310=CWOBJ6310E: Exception creating a new object for serialization {0}.  Exception: {1}
     * EXCEPTION_CREATING_SERIALIZATION_OBJECT_CWOBJ6310.explanation= error creating a new instance of your object
     * EXCEPTION_CREATING_SERIALIZATION_OBJECT_CWOBJ6310.useraction= most likely a casting problem, make sure your object can be casted to a base type
     * <pre>
     */
    public String EXCEPTION_CREATING_SERIALIZATION_OBJECT_CWOBJ6310 = "EXCEPTION_CREATING_SERIALIZATION_OBJECT_CWOBJ6310";

    /**
     * <pre>
     * # {0} class name
     * CANNOT_INSTANTIATE_ARRAY_OBJECT_FOR_CLASS_CWOBJ6311=CWOBJ6311E: {0}
     * CANNOT_INSTANTIATE_ARRAY_OBJECT_FOR_CLASS_CWOBJ6311.explanation= the class definition was found to be null 
     * CANNOT_INSTANTIATE_ARRAY_OBJECT_FOR_CLASS_CWOBJ6311.useraction= Contact IBM Software Support.
     * <pre>
     */
    public String CANNOT_INSTANTIATE_ARRAY_OBJECT_FOR_CLASS_CWOBJ6311 = "CANNOT_INSTANTIATE_ARRAY_OBJECT_FOR_CLASS_CWOBJ6311";

    /**
     * <pre>
     * # {0} class name
     * # {1} exception
     * ERROR_INSTANTIATING_ARRAY_OBJECT_CWOBJ6312=CWOBJ6312E: Error creating a new instance of {0}.  Exception: {1}
     * ERROR_INSTANTIATING_ARRAY_OBJECT_CWOBJ6312.explanation= Error instantiating array object
     * ERROR_INSTANTIATING_ARRAY_OBJECT_CWOBJ6312.useraction= check that your base type for array allocation is correct
     * <pre>
     */
    public String ERROR_INSTANTIATING_ARRAY_OBJECT_CWOBJ6312 = "ERROR_INSTANTIATING_ARRAY_OBJECT_CWOBJ6312";

    /**
     * <pre>
     * # {0} type id
     * UNRECOGNIZED_TYPE_ID_CWOBJ6313=CWOBJ6313E: Unrecognized type ID = {0} {1}
     * UNRECOGNIZED_TYPE_ID_CWOBJ6313.explanation= could not get descriptor from type id as type id is not recognized. a type id was read however
     * UNRECOGNIZED_TYPE_ID_CWOBJ6313.useraction= make sure your object is within the scope of the product and has a type id assigned to it.
     * <pre>
     */
    public String UNRECOGNIZED_TYPE_ID_CWOBJ6313 = "UNRECOGNIZED_TYPE_ID_CWOBJ6313";

    /**
     * <pre>
     * # {0} type name
     * ATTRIBUTE_CONTEXT_TYPE_NOT_VALID_QUERYPLAN_CWOBJ6314=CWOBJ6314E: Attribute Context type is not a valid QueryPlan. Type is {0} {1}.
     * ATTRIBUTE_CONTEXT_TYPE_NOT_VALID_QUERYPLAN_CWOBJ6314.explanation= either the attribute contexts were null or the attribute context was not an instance of a queryplan.
     * ATTRIBUTE_CONTEXT_TYPE_NOT_VALID_QUERYPLAN_CWOBJ6314.useraction= make sure your attribute contexts in your object follow the specification listed in the error explanation.
     * <pre>
     */
    public String ATTRIBUTE_CONTEXT_TYPE_NOT_VALID_QUERYPLAN_CWOBJ6314 = "ATTRIBUTE_CONTEXT_TYPE_NOT_VALID_QUERYPLAN_CWOBJ6314";

    /**
     * <pre>
     * # {0} class name
     * NOT_SERIALIZABLE_EXCEPTION_CWOBJ6315=CWOBJ6315E: The value {0} could not be serialized using normal java serialization.
     * NOT_SERIALIZABLE_EXCEPTION_CWOBJ6315.explanation= The value could not be serialized using normal java serialization.
     * NOT_SERIALIZABLE_EXCEPTION_CWOBJ6315.useraction= mark the object you wish to serialize as serializable, otherwise you may be required to create your own custom serializer as the basic java serialization does not seem sufficient
     * <pre>
     */
    public String NOT_SERIALIZABLE_EXCEPTION_CWOBJ6315 = "NOT_SERIALIZABLE_EXCEPTION_CWOBJ6315";

    /**
     * <pre>
     * # {0} exception
     * JAVA_SERIALIZATION_EXCEPTION_CWOBJ6316=CWOBJ6316E: An exception occurred during java serialization {0}.
     * JAVA_SERIALIZATION_EXCEPTION_CWOBJ6316.explanation= An exception occurred during java serialization
     * JAVA_SERIALIZATION_EXCEPTION_CWOBJ6316.useraction= Contact IBM Software Support.
     * <pre>
     */
    public String JAVA_SERIALIZATION_EXCEPTION_CWOBJ6316 = "JAVA_SERIALIZATION_EXCEPTION_CWOBJ6316";

    /**
     * <pre>
     * # {0} exception
     * EXCEPTION_ACCESSING_INTERNAL_OBJECTGRID_SESSION_CWOBJ6318=CWOBJ6318E: Exception attempting to access the internal session for the ObjectGrid {0}
     * EXCEPTION_ACCESSING_INTERNAL_OBJECTGRID_SESSION_CWOBJ6318.explanation= Exception attempting to access the internal session for the ObjectGrid
     * EXCEPTION_ACCESSING_INTERNAL_OBJECTGRID_SESSION_CWOBJ6318.useraction= Contact IBM Software Support.
     * <pre>
     */
    public String EXCEPTION_ACCESSING_INTERNAL_OBJECTGRID_SESSION_CWOBJ6318 = "EXCEPTION_ACCESSING_INTERNAL_OBJECTGRID_SESSION_CWOBJ6318";

    /**
     * <pre>
     * # {0} class name
     * XDF_CLASS_CACHE_MAP_RETURNED_NULL_CWOBJ6319=CWOBJ6319E: getClassIdFromGlobalMap: XDF_CLASS_CACHE_MAP returned null for {0}
     * XDF_CLASS_CACHE_MAP_RETURNED_NULL_CWOBJ6319.explanation= Loader did not generate an ID 
     * XDF_CLASS_CACHE_MAP_RETURNED_NULL_CWOBJ6319.useraction= ClassId was not returned - this is a configuration error or a problem with the server XDF loader that assigns the values in most cases
     * <pre>
     */
    public String XDF_CLASS_CACHE_MAP_RETURNED_NULL_CWOBJ6319 = "XDF_CLASS_CACHE_MAP_RETURNED_NULL_CWOBJ6319";

    /**
     * <pre>
     * # {0} exception
     * GET_CLASS_ID_FROM_GLOBAL_MAP_EXCEPTION_CWOBJ6320=_CWOBJ6320E: getClassIdFromGlobalMap Exception {0}
     * GET_CLASS_ID_FROM_GLOBAL_MAP_EXCEPTION_CWOBJ6320.explanation= an exception has occured while attempting to get the class id from the class map
     * GET_CLASS_ID_FROM_GLOBAL_MAP_EXCEPTION_CWOBJ6320.useraction= make sure the class is in the grid otherwise Contact IBM Software Support.
     * <pre>
     */
    public String GET_CLASS_ID_FROM_GLOBAL_MAP_EXCEPTION_CWOBJ6320 = "GET_CLASS_ID_FROM_GLOBAL_MAP_EXCEPTION_CWOBJ6320";

    /**
     * <pre>
     * # {0} Exception
     * NO_ACTIVE_TRANSACTION_EXCEPTION_CWOBJ6321=CWOBJ6321E: no active transaction with error {0}.
     * NO_ACTIVE_TRANSACTION_EXCEPTION_CWOBJ6321.explanation= the commit has failed when using getClassIdFromGlobalMap because there is no active transaction
     * NO_ACTIVE_TRANSACTION_EXCEPTION_CWOBJ6321.useraction= please check your configurations and contact IBM Software Support.
     * <pre>
     */
    public String NO_ACTIVE_TRANSACTION_EXCEPTION_CWOBJ6321 = "NO_ACTIVE_TRANSACTION_EXCEPTION_CWOBJ6321";

    /**
     * <pre>
     * # {0} Exception
     * TRANSACTION_EXCEPTION_CWOBJ6322=CWOBJ6322E: general transaction exception with error {0}.
     * TRANSACTION_EXCEPTION_CWOBJ6322.explanation= the commit has failed when using getClassIdFromGlobalMap because there was a transaction exception
     * TRANSACTION_EXCEPTION_CWOBJ6322.useraction= The isTransactionActive() and wasTransactionRolledBack() can be used to see if the transaction was rolled back due to this exception.
     * <pre>
     */
    public String TRANSACTION_EXCEPTION_CWOBJ6322 = "TRANSACTION_EXCEPTION_CWOBJ6322";

    /**
     * <pre>
     * # {0} class name
     * OBJECTGRID_NULL_COULD_NOT_LOOKUP_CLASS_NAME_CWOBJ6323=CWOBJ6323E: getClassIdFromGlobalMap: objectGrid is null - could not lookup class name {0}
     * OBJECTGRID_NULL_COULD_NOT_LOOKUP_CLASS_NAME_CWOBJ6323.explanation= the object grid is null, there is no way too look up the class name
     * OBJECTGRID_NULL_COULD_NOT_LOOKUP_CLASS_NAME_CWOBJ6323.useraction= the descriptor may have been generated while we were waiting for access to the global map from this ObjectGrid
     * <pre>
     */
    public String OBJECTGRID_NULL_COULD_NOT_LOOKUP_CLASS_NAME_CWOBJ6323 = "OBJECTGRID_NULL_COULD_NOT_LOOKUP_CLASS_NAME_CWOBJ6323";

    /**
     * <pre>
     * # {0} name of class
     * CLASS_DEFINITION_IS_NULL_CWOBJ6324=CWOBJ6324E: Class definition is null for object {0} 
     * CLASS_DEFINITION_IS_NULL_CWOBJ6324.explanation= when trying to create a new object for serialization the described class or constructor were null
     * CLASS_DEFINITION_IS_NULL_CWOBJ6324.useraction= make sure the class you are trying to serialize is not null
     * <pre>
     */
    public String CLASS_DEFINITION_IS_NULL_CWOBJ6324 = "CLASS_DEFINITION_IS_NULL_CWOBJ6324";

    /**
     * <pre>
     * # {0} Class name
     * XDF_CLASS_ALIAS_EMPTY_STRING_CWOBJ6325=CWOBJ6325E: The class {0} defines an empty or a null class alias string.  
     * XDF_CLASS_ALIAS_EMPTY_STRING_CWOBJ6325.explanation=The class alias defined can not be an empty or a null string.   
     * XDF_CLASS_ALIAS_EMPTY_STRING_CWOBJ6325.useraction=Define a valid class alias.
     * </pre>
     */
    public String XDF_CLASS_ALIAS_EMPTY_STRING_CWOBJ6325 = "XDF_CLASS_ALIAS_EMPTY_STRING_CWOBJ6325";

    /**
     * <pre>
     * # {0} Field name
     * # {1} Class name
     * XDF_FIELD_ALIAS_EMPTY_STRING_CWOBJ6326=CWOBJ6326E: The field {0} in class {1} defines an empty or a null field alias string.  
     * XDF_FIELD_ALIAS_EMPTY_STRING_CWOBJ6326.explanation=The field alias defined can not be an empty or a null string.   
     * XDF_FIELD_ALIAS_EMPTY_STRING_CWOBJ6326.useraction=Define a valid field alias
     * </pre>
     */
    public String XDF_FIELD_ALIAS_EMPTY_STRING_CWOBJ6326 = "XDF_FIELD_ALIAS_EMPTY_STRING_CWOBJ6326";

    /**
     * <pre>
     * # {0} Source Class name
     * # {1} Target Class name
     * XDF_CAST_EXCEPTION_CWOBJ6327=CWOBJ6327E: The value of type {0} could not be cast to the type {1}.
     * XDF_CAST_EXCEPTION_CWOBJ6327.explanation=The value provided by the application or retrieved from the ObjectGrid could not be cast to the target type. 
     * XDF_CAST_EXCEPTION_CWOBJ6327.useraction=Ensure that the types you are retrieving from the grid or putting into the grid are compatible with the target type definition.
     * </pre>
     */
    public String XDF_CAST_EXCEPTION_CWOBJ6327 = "XDF_CAST_EXCEPTION_CWOBJ6327";

    /**
     * <pre>
     * # {0} Type identifier
     * # {1} Exception
     * XDF_TYPEID_FAILED_TO_RESOLVE_CLASS_CWOBJ6328=CWOBJ6328E: The resolution of type identifier {0} failed with the exception={1}. 
     * XDF_TYPEID_FAILED_TO_RESOLVE_CLASS_CWOBJ6328.explanation=An error occurred while communicating with the grid that resulted in an exception.   
     * XDF_TYPEID_FAILED_TO_RESOLVE_CLASS_CWOBJ6328.useraction=Correct the problem identified by the exception message or contact IBM Software Support.
     * </pre>
     */
    public String XDF_TYPEID_FAILED_TO_RESOLVE_CLASS_CWOBJ6328 = "XDF_TYPEID_FAILED_TO_RESOLVE_CLASS_CWOBJ6328";

    /**
     * <pre>
     * # {0} String value
     * # {1} Exception
     * XDF_BINARY_SERIALIZATION_FAILED_CWOBJ6329=CWOBJ6329E: Serialization using the C# BinaryFormatter failed to serialize the object {0} with an exception={1}
     * XDF_BINARY_SERIALIZATION_FAILED_CWOBJ6329.explanation=The extreme scale serializer requested the BinaryFormatter to serialize an object provided by the application and that serialization failed.
     * XDF_BINARY_SERIALIZATION_FAILED_CWOBJ6329.useraction=Check the error message and ensure that the object being serialized meets the requirements for serialization as outlined by the Microsoft documentation.
     * </pre>
     */
    public String XDF_BINARY_SERIALIZATION_FAILED_CWOBJ6329 = "XDF_BINARY_SERIALIZATION_FAILED_CWOBJ6329";

    /**
     * <pre>
     * # {0} Descriptor
     * # {1} Exception
     * XDF_FAILED_TO_INITIALIZE_JAVA_FIELDS_CWOBJ6330=CWOBJ6330E: An exception occurred while initializing java fields for descriptor {0}.  Exception: {1}  
     * XDF_FAILED_TO_INITIALIZE_JAVA_FIELDS_CWOBJ6330.explanation=An error occurred while initializing java fields.   
     * XDF_FAILED_TO_INITIALIZE_JAVA_FIELDS_CWOBJ6330.useraction=Correct the problem identified by the exception message or contact IBM Software Support if the problem persists.
     * </pre>
     */
    public String XDF_FAILED_TO_INITIALIZE_JAVA_FIELDS_CWOBJ6330 = "XDF_FAILED_TO_INITIALIZE_JAVA_FIELDS_CWOBJ6330";

    /**
     * <pre>
     * # {0} Class name
     * # {1} Exception
     * XDF_FAILED_TO_INITIALIZE_VALUE_SERIALIZER_PLUGIN_CWOBJ6331=CWOBJ6331E: "The value serializer plugin was not initialized with class {0} because the class could not be found.  Exception: {1}  
     * XDF_FAILED_TO_INITIALIZE_VALUE_SERIALIZER_PLUGIN_CWOBJ6331.explanation=An error occurred while initializing the value serializer plugin.   
     * XDF_FAILED_TO_INITIALIZE_VALUE_SERIALIZER_PLUGIN_CWOBJ6331.useraction=Correct the problem identified by the exception message or contact IBM Software Support if the problem persists.
     * </pre>
     */
    public String XDF_FAILED_TO_INITIALIZE_VALUE_SERIALIZER_PLUGIN_CWOBJ6331 = "XDF_FAILED_TO_INITIALIZE_VALUE_SERIALIZER_PLUGIN_CWOBJ6331";

    /**
     * <pre>
     * # {0} Field name
     * XDF_FIELD_NOT_FOUND_CWOBJ6332=CWOBJ6332E: "The field {0} could not be found in the field list.  
     * XDF_FIELD_NOT_FOUND_CWOBJ6332.explanation=The field could not be found.   
     * XDF_FIELD_NOT_FOUND_CWOBJ6332.useraction=Correct the problem identified by the exception message or contact IBM Software Support if the problem persists.
     * </pre>
     */
    public String XDF_FIELD_NOT_FOUND_CWOBJ6332 = "XDF_FIELD_NOT_FOUND_CWOBJ6332";

    /**
     * <pre>
     * # {0} Field name
     * XDF_FIELD_WITHOUT_SERIALIZER_CWOBJ6333=CWOBJ6333E: "Serializers could not be found for the field(s): {0}  
     * XDF_FIELD_WITHOUT_SERIALIZER_CWOBJ6333.explanation=Serializers for the field(s) could not be found.   
     * XDF_FIELD_WITHOUT_SERIALIZER_CWOBJ6333.useraction=Correct the problem identified by the exception message or contact IBM Software Support if the problem persists.
     * </pre>
     */
    public String XDF_FIELD_WITHOUT_SERIALIZER_CWOBJ6333 = "XDF_FIELD_WITHOUT_SERIALIZER_CWOBJ6333";

    /**
     * <pre>
     * # {0} Field1 name
     * # {1} Field2 name
     * # {2} Order value
     * XDF_DUPLICATE_FIELD_PARTITION_KEY_ORDER_CWOBJ6334=CWOBJ6334E: The field {0} and field {1} defines the same partition key order number {2}.  
     * XDF_DUPLICATE_FIELD_PARTITION_KEY_ORDER_CWOBJ6334.explanation=The field partition keys defined within the same object cannot have the same order attribute.   
     * XDF_DUPLICATE_FIELD_PARTITION_KEY_ORDER_CWOBJ6334.useraction=Verify the user defined class and ensure that the partition key annotations defined do not use the same order attribute for different fields, or if there are multiple fields ensure that an order is explicitly specified.
     * </pre>
     */
    public String XDF_DUPLICATE_FIELD_PARTITION_KEY_ORDER_CWOBJ6334 = "XDF_DUPLICATE_FIELD_PARTITION_KEY_ORDER_CWOBJ6334";

    /**
     * <pre>
     * # {0} Field name
     * # {1} Class name
     * XDF_NULL_VALUE_FOR_NON_NULLABLE_FIELD_CWOBJ6335=CWOBJ6335E: The field {0} in class {1} contains a null value but is a non-nullable field.  
     * XDF_NULL_VALUE_FOR_NON_NULLABLE_FIELD_CWOBJ6335.explanation=The non-nullable field contains a null value.
     * XDF_NULL_VALUE_FOR_NON_NULLABLE_FIELD_CWOBJ6335.useraction=Correct the problem identified by the exception message or contact IBM Software Support if the problem persists.
     * </pre>
     */
    public String XDF_NULL_VALUE_FOR_NON_NULLABLE_FIELD_CWOBJ6335 = "XDF_NULL_VALUE_FOR_NON_NULLABLE_FIELD_CWOBJ6335";

    /**
     * <pre>
     * # {0} Object name    
     * XDF_CALENDAR_SERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6336=CWOBJ6336E: Calendar object {0} serialization from C# is not supported.  
     * XDF_CALENDAR_SERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6336.explanation=The calendar object between C# and Java is not compatible.
     * XDF_CALENDAR_SERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6336.useraction=Use DateTime object from C# to serialize the data instead.
     * </pre>
     */
    public String XDF_CALENDAR_SERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6336 = "XDF_CALENDAR_SERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6336";

    /**
     * <pre>    
     * XDF_CALENDAR_DESERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6337=CWOBJ6337E: Calendar deserialization from C# is not supported.  
     * XDF_CALENDAR_DESERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6337.explanation=The calendar object between C# and Java is not compatible.
     * XDF_CALENDAR_DESERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6337.useraction=Use DateTime object from C# to de-serialize the data instead.
     * </pre>
     */
    public String XDF_CALENDAR_DESERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6337 = "XDF_CALENDAR_DESERIALIZATION_FROM_C_SHARP_NOT_SUPPORTED_CWOBJ6337";

    /**
     * <pre>
     * # {0} Source Type
     * # {1} Target Type
     * XDF_TYPE_CONVERSION_NOT_SUPPORTED_CWOBJ6338=CWOBJ6338E: The conversion of type {0} to type {1} is not supported.
     * XDF_TYPE_CONVERSION_NOT_SUPPORTED_CWOBJ6338.explanation=The type provided by the application or retrieved from the ObjectGrid could not be converted to the target type. 
     * XDF_TYPE_CONVERSION_NOT_SUPPORTED_CWOBJ6338.useraction=Ensure that the types you are retrieving from the grid or putting into the grid are compatible with the target type definition.
     * </pre>
     */
    public String XDF_TYPE_CONVERSION_NOT_SUPPORTED_CWOBJ6338 = "XDF_TYPE_CONVERSION_NOT_SUPPORTED_CWOBJ6338";

    /**
     * <pre>
     * # {0} Source Type
     * # {1} Target Type
     * XDF_TYPE_CONVERSION_FAILED_CWOBJ6339=CWOBJ6339E: The conversion of type {0} to type {1} failed.
     * XDF_TYPE_CONVERSION_FAILED_CWOBJ6339.explanation=The type provided by the application or retrieved from the ObjectGrid could not be converted to the target type. 
     * XDF_TYPE_CONVERSION_FAILED_CWOBJ6339.useraction=Ensure that the types you are retrieving from the grid or putting into the grid are compatible with the target type definition.
     * </pre>
     */
    public String XDF_TYPE_CONVERSION_FAILED_CWOBJ6339 = "XDF_TYPE_CONVERSION_FAILED_CWOBJ6339";

    /**
     * <pre>
     * # {0} Map name
     * # {1} Output format
     * INVALID_KEY_OUTPUT_FORMAT_CWOBJ6340E=CWOBJ6340E: The {0} map is not compatible with the {1} output format on the key objects.
     * INVALID_KEY_OUTPUT_FORMAT_CWOBJ6340E.explanation=The RAW output format on the key objects is applicable to COPY_TO_BYTES and COPY_TO_BYTES_RAW maps that have MapSerializerPlugin plug-in configured, that use eXtreme data format (XDF), or that have an associated entity manager.  Otherwise, use the NATIVE output format.
     * INVALID_KEY_OUTPUT_FORMAT_CWOBJ6340E.useraction=Change to the appropriate output format in the object grid configuration XML or through the ObjectMap API.
     * </pre>
     */
    public String INVALID_KEY_OUTPUT_FORMAT_CWOBJ6340E = "INVALID_KEY_OUTPUT_FORMAT_CWOBJ6340E";

    /**
     * <pre>
     * # {0} Map name
     * # {1} Output format
     * INVALID_VALUE_OUTPUT_FORMAT_CWOBJ6341E=CWOBJ6341E:The {0} map is not compatible with the {1} output format on the value objects.
     * INVALID_VALUE_OUTPUT_FORMAT_CWOBJ6341E.explanation=The RAW output format on the value objects is applicable to COPY_TO_BYTES and COPY_TO_BYTES_RAW maps that have MapSerializerPlugin plug-in configured, that use eXtreme data format (XDF), or that have an associated entity manager.  Otherwise, use the NATIVE output format.
     * INVALID_VALUE_OUTPUT_FORMAT_CWOBJ6341E.useraction=Change to the appropriate output format in the object grid configuration XML or through the ObjectMap API.
     * </pre>
     */
    public String INVALID_VALUE_OUTPUT_FORMAT_CWOBJ6341E = "INVALID_VALUE_OUTPUT_FORMAT_CWOBJ6341E";

    /**
     * <pre>
     * # {0} Value
     * # {1} Target Type
     * XDF_VALUE_EXCEEDS_CAPACITY_OF_TARGET_TYPE_CWOBJ6342=CWOBJ6342E: The value {0} exceeds the capacity of the target type {1}.
     * XDF_VALUE_EXCEEDS_CAPACITY_OF_TARGET_TYPE_CWOBJ6342.explanation=The value for the type provided by the application or retrieved from the ObjectGrid exceeds the capacity of the target type. 
     * XDF_VALUE_EXCEEDS_CAPACITY_OF_TARGET_TYPE_CWOBJ6342.useraction=Ensure that the value of the types you are retrieving from the grid or putting into the grid are within the capacity of the target type.
     * </pre>
     */
    public String XDF_VALUE_EXCEEDS_CAPACITY_OF_TARGET_TYPE_CWOBJ6342 = "XDF_VALUE_EXCEEDS_CAPACITY_OF_TARGET_TYPE_CWOBJ6342";

    /**
     * <pre>          
     * XDF_JAVA_HASHTABLE_CANNOT_BE_NULL_KEY_OR_VALUE_CWOBJ6343=CWOBJ6343E: Can not deserialize Java Hashtable object when either the Hashtable key or value is null.  
     * XDF_JAVA_HASHTABLE_CANNOT_BE_NULL_KEY_OR_VALUE_CWOBJ6343.explanation=Java Hashtable object does not allow to have a null key or a null value.   
     * XDF_JAVA_HASHTABLE_CANNOT_BE_NULL_KEY_OR_VALUE_CWOBJ6343.useraction=Use HashMap instead when a null value is required during the object serialization and deserialization.
     * </pre>
     */
    public String XDF_JAVA_HASHTABLE_CANNOT_BE_NULL_KEY_OR_VALUE_CWOBJ6343 = "XDF_JAVA_HASHTABLE_CANNOT_BE_NULL_KEY_OR_VALUE_CWOBJ6343";

    /**
     * <pre>
     * # {0} Class name
     * XDF_SERIALIZER_DOES_NOT_EXIST_FOR_CLASS_CWOBJ6344=CWOBJ6344E: No serializer exists for class {0}.
     * XDF_SERIALIZER_DOES_NOT_EXIST_FOR_CLASS_CWOBJ6344.explanation= Could not generate a serializer for the class.
     * XDF_SERIALIZER_DOES_NOT_EXIST_FOR_CLASS_CWOBJ6344.useraction= Contact IBM Support for Assistance.
     * </pre>
     */

    public String XDF_SERIALIZER_DOES_NOT_EXIST_FOR_CLASS_CWOBJ6344 = "XDF_SERIALIZER_DOES_NOT_EXIST_FOR_CLASS_CWOBJ6344";

    /**
     * <pre>
     * # 
     * XDF_ERROR_INITIALIZING_CSHARP_FIELDS_CWOBJ6345=CWOBJ6345E: Error encountered when initializing C# fields during the generateDescriptor processing.
     * XDF_ERROR_INITIALIZING_CSHARP_FIELDS_CWOBJ6345.explanation= The internal descriptor will be removed from cache because it is not complete.
     * XDF_ERROR_INITIALIZING_CSHARP_FIELDS_CWOBJ6345.useraction= Contact IBM Support for Assistance.
     * </pre>
     */

    public String XDF_ERROR_INITIALIZING_CSHARP_FIELDS_CWOBJ6345 = "XDF_ERROR_INITIALIZING_CSHARP_FIELDS_CWOBJ6345";

    /**
     * <pre>
     * # {0} Class name
     * # {1} Exception
     * XDF_PROTO_DESCRIPTOR_ERROR_CWOBJ6346=CWOBJ6346E: generateProtoDescriptorFromDescriptor: Unexpected error while generating message for Class {0}. Exception: {1}
     * XDF_PROTO_DESCRIPTOR_ERROR_CWOBJ6346.explanation= The descriptor will be removed from cache because of the encountered error.
     * XDF_PROTO_DESCRIPTOR_ERROR_CWOBJ6346.useraction= Contact IBM Support for Assistance.
     * </pre>
     */

    public String XDF_PROTO_DESCRIPTOR_ERROR_CWOBJ6346 = "XDF_PROTO_DESCRIPTOR_ERROR_CWOBJ6346";

    /**
     * <pre>
     * # {0} Class name 
     * # {1} Type identifier
     * XDF_INFO_TYPE_ID_MISMATCH_CWOBJ6347=CWOBJ6347I: During XDF metadata recovery, a potential mismatch was discovered for the class {0} type id={1}
     * XDF_INFO_TYPE_ID_MISMATCH_CWOBJ6347.explanation= During XDF metadata recovery, when processing a type id it was found to be assigned to a different type.  This may cause serialization problems.
     * XDF_INFO_TYPE_ID_MISMATCH_CWOBJ6347.explanation= Restarting the containers may correct this problem.  Contact IBM Support for additional assistance.
     * </pre>
     */

    public String XDF_INFO_TYPE_ID_MISMATCH_CWOBJ6347 = "XDF_INFO_TYPE_ID_MISMATCH_CWOBJ6347";

    /**
     * <pre>
     * # {0} Configuration attributes
     * # {1} Configuration value
     * XDF_INFO_CONFIGURATION_SET_CWOBJ6348=CWOBJ6348I: The configuration property {0} was set to a value of {1}
     * XDF_INFO_CONFIGURATION_SET_CWOBJ6348.explanation=A property was set during the XDF initialization.  This may impact the behavior of the serialization for the application. 
     * XDF_INFO_CONFIGURATION_SET_CWOBJ6348.action= No action is required.
     * </pre>
     */
    public String XDF_INFO_CONFIGURATION_SET_CWOBJ6348="XDF_INFO_CONFIGURATION_SET_CWOBJ6348";
    
    
    
    /**
     * <pre>
     * # {0} the OSGi service name
     * # {1} the OSGi service ranking
     * # {2} the OSGi bundle id
     * OSGI_NEW_SERVICE_ADDED_CWOBJ6400=CWOBJ6400I: An OSGi service {0} with service ranking {1} from service Id {2} is available.
     * OSGI_NEW_SERVICE_ADDED_CWOBJ6400.explanation=An OSGi service is available to the JVM.
     * OSGI_NEW_SERVICE_ADDED_CWOBJ6400.useraction=No Action is required.
     * </pre>
     */
    public String OSGI_NEW_SERVICE_ADDED_CWOBJ6400 = "OSGI_NEW_SERVICE_ADDED_CWOBJ6400";

    /**
     * <pre>
     * # {0} the OSGi service name
     * # {1} the OSGi service ranking
     * # {2} the OSGi service id
     * OSGI_SERVICE_REMOVED_CWOBJ6401=CWOBJ6401I: An OSGi service {0} with service ranking {1} from service Id {2} is unavailble any more.
     * OSGI_SERVICE_REMOVED_CWOBJ6401.explanation=An OSGi service becomes unavailable to the JVM.
     * OSGI_SERVICE_REMOVED_CWOBJ6401.useraction=No Action is required.
     * </pre>
     */
    public String OSGI_SERVICE_REMOVED_CWOBJ6401 = "OSGI_SERVICE_REMOVED_CWOBJ6401";

    /**
     * <pre>
     * # {0} the OSGi service name
     * # {1} the OSGi service ranking
     * # {2} the OSGI service ID
     * OSGI_SERVICE_NOT_FOUND_CWOBJ6402=CWOBJ6402W: An OSGi service {0} with eXtreme Scale ranking {1} from service Id {2} cannot be found in the eXtreme Scale runtime.
     * OSGI_SERVICE_NOT_FOUND_CWOBJ6402.explanation=An OSGi service cannot be found in the eXtreme Scale runtime. This indicates an internal error.
     * OSGI_SERVICE_NOT_FOUND_CWOBJ6402.useraction=Examine the first failure data capture (FFDC) logs for errors. Also contact IBM Software Support.
     * </pre>
     */
    public String OSGI_SERVICE_NOT_FOUND_CWOBJ6402 = "OSGI_SERVICE_NOT_FOUND_CWOBJ6402";

    /**
     * <pre>
     * # {0} the OSGi service name
     * # {1} the OSGi service ranking
     * # {2} the OSGi service ID
     * OSGI_SERVICE_USED_CWOBJ6403=CWOBJ6403I: An OSGi service {0} with service ranking {1} from service Id {2} is used by the eXtreme Scale runtime.
     * OSGI_SERVICE_USED_CWOBJ6403.explanation=An OSGi service is used by the eXtreme Scale runtime.
     * OSGI_SERVICE_USED_CWOBJ6403.useraction=No Action is required.
     * </pre>
     */
    public String OSGI_SERVICE_USED_CWOBJ6403 = "OSGI_SERVICE_USED_CWOBJ6403";

    /**
     * <pre>
     * # {0} the OSGi service name
     * # {1} the OSGi service rank
     * # {2} the OSGi bundle id
     * OSGI_SERVICE_ALREADY_USED_CWOBJ6404=CWOBJ6404I: An OSGi service {0} with service ranking {1} has already been used. The service bundle Id is {2}.
     * OSGI_SERVICE_ALREADY_USED_CWOBJ6404.explanation=An OSGi service with a specific service ranking has already been used by the eXtreme Scale runtime. No Action is going to take place.
     * OSGI_SERVICE_ALREADY_USED_CWOBJ6404.useraction=No Action is required.
     * </pre>
     */
    public String OSGI_SERVICE_ALREADY_USED_CWOBJ6404 = "OSGI_SERVICE_ALREADY_USED_CWOBJ6404";

    /**
     * <pre>
     * # {0} the eXtreme Scale OSGi bundle symbolic name
     * OSGI_BUNDLE_ACTIVATED_CWOBJ6405=CWOBJ6405I: The eXtreme Scale OSGi Bundle with symbolic name {0} is activated.
     * OSGI_BUNDLE_ACTIVATED_CWOBJ6405.explanation=The eXtreme Scale OSGi Bundle is activated.
     * OSGI_BUNDLE_ACTIVATED_CWOBJ6405.useraction=No Action is required.
     * </pre>
     */
    public String OSGI_BUNDLE_ACTIVATED_CWOBJ6405 = "OSGI_BUNDLE_ACTIVATED_CWOBJ6405";

    /**
     * <pre>
    * # {0} the eXtreme Scale OSGi bundle symbolic name
    * OSGI_BUNDLE_STOPPED_CWOBJ6406=CWOBJ6405I: The eXtreme Scale OSGi Bundle with symbolic name {0} is stopped.
    * OSGI_BUNDLE_STOPPED_CWOBJ6406.explanation=The eXtreme Scale OSGi Bundle is stopped.
    * OSGI_BUNDLE_STOPPED_CWOBJ6406.useraction=No Action is required.
    * </pre>
     */
    public String OSGI_BUNDLE_STOPPED_CWOBJ6406 = "OSGI_BUNDLE_STOPPED_CWOBJ6406";

    /**
     * <pre>
     * # {0} the ObjectGrid name
     * OSGI_SERVICE_UPGRADE_WARNING_CWOBJ6407=CWOBJ6407I: The OSGi service upgrade failed to find a client identifier for the grid {0}.
     * OSGI_SERVICE_UPGRADE_WARNING_CWOBJ6407.explanation=The identifier for the client initiating the upgrade was incorrectly removed.
     * OSGI_SERVICE_UPGRADE_WARNING_CWOBJ6407.useraction=Verify that the upgrade completes as expected.
     * </pre>
     */
    public String OSGI_SERVICE_UPGRADE_WARNING_CWOBJ6407 = "OSGI_SERVICE_UPGRADE_WARNING_CWOBJ6407";

    /**
     * <pre>
      * # Do not translate: Shard, Spring
      * #{0} the thread local name
      * #{1} the thread local value
      * SHARD_SCOPE_THREADLOCAL_WARNING_CWOBJ6408=CWOBJ6408W: The Spring custom Shard scope thread local {0} value is not null. It is {1}.
      * SHARD_SCOPE_THREADLOCAL_WARNING_CWOBJ6408.explanation=The Spring custom Shard scope thread local {0} value should always be cleared in a finally block.
      * SHARD_SCOPE_THREADLOCAL_WARNING_CWOBJ6408.useraction=Add the code to clear the thread local value in a finally block or Contact IBM Support.
      * </pre>
     */
    public String SHARD_SCOPE_THREADLOCAL_WARNING_CWOBJ6408 = "SHARD_SCOPE_THREADLOCAL_WARNING_CWOBJ6408";

    /**
     * <pre>
      * Do not translate: OSGi, destroy()
      * {0} the service instance
      * {1} the exception mesasge
      * SERVICE_DESTROY_FAILED_CWOBJ6409=CWOBJ6409W: When a new OSGi service is used, the destroy() call on the old service instance {0} throws an exception with the following message: {1). For detailed exception stack, check the ffdc directory.
      * SERVICE_DESTROY_FAILED_CWOBJ6409.explanation=The destroy() call on the old OSGi service fails with an exception. WebSphere eXtreme Scale runtime logs this exception and continues the processing.
      * SERVICE_DESTROY_FAILED_CWOBJ6409.useraction=Check the destroy() method implementation to see why an exception is thrown. Make sure the error condition is handled in the destroy() method as the WebSphere eXtreme Scale runtime will not re-throw this exception.
      * </pre>
     */
    public String SERVICE_DESTROY_FAILED_CWOBJ6409 = "SERVICE_DESTROY_FAILED_CWOBJ6409";

    /**
     * <pre>
      * #{0} the service name
      * #{1} the ObjectGrid OSGi ID
      * #{2} the OSGi service ranking to update
      * #{3} the exception message.
      * SERVICE_UPDATE_FAILED_CWOBJ6410=CWOBJ6410E: The update for OSGi service {0} of ObjectGrid {1} to service ranking {2} failed with the following message: {3}. The failure is logged and ignored.
      * SERVICE_UPDATE_FAILED_CWOBJ6410.explanation=The OSGi service ranking update failed.
      * SERVICE_UPDATE_FAILED_CWOBJ6410.useraction=Use OSGi admin functions to update the OSGi service to a workable service.
     * </pre>
     */
    public String SERVICE_UPDATE_FAILED_CWOBJ6410 = "SERVICE_UPDATE_FAILED_CWOBJ6410";

    /**
     * <pre>
     * #{0} the ObjectGrid OSGi ID
     * #{1} the service ranking stored in the OSGi metadata repository
     * #{2} the service name
     * #{3} the highest service ranking for this JVM
     * #{4} the service ranking stored in the OSGi metadata repository
     * REPOSITORY_SERVICE_RANKING_USED_CWOBJ6411=CWOBJ6411W: For ObjectGrid {0}, the OSGi metadata repository is currently using service ranking {1} for service {2}, which is not the highest service ranking {3} for this JVM. The ObjectGrid instance will try to use service ranking {4} for this service.
     * REPOSITORY_SERVICE_RANKING_USED_CWOBJ6411.explanation=By default, the highest ranking service available in the JVM is going to be used. However, the other JVMs use a lower ranking service. To be consistent, this JVM will also try to use the lower ranking service too.
     * REPOSITORY_SERVICE_RANKING_USED_CWOBJ6411.useraction=Check why the other JVMs do not have the highest ranking service as this JVM does.
     * </pre>
     */
    public String REPOSITORY_SERVICE_RANKING_USED_CWOBJ6411 = "REPOSITORY_SERVICE_RANKING_USED_CWOBJ6411";

    /**
     * <pre>
    * # Do not translate: OSGi, blueprint
    * # {0} blueprint container classes
    * MULTI_BLUEPRINT_SERVICE_FOUND_CWOBJ6412=CWOBJ6412W: Multiple OSGi blueprint container classes are found: {0}.
    * MULTI_BLUEPRINT_SERVICE_FOUND_CWOBJ6412.explanation=Multiple OSGi blueprint container classes are found. Normally, only one blueprint container should be install in an OSGi container.
    * MULTI_BLUEPRINT_SERVICE_FOUND_CWOBJ6412.useraction=Check the installed bundles of the OSGi container to see why multiple oSGi blueprint container classes are installed. Install one blueprint container to avoid confusions.
    * </pre>
     */
    public String MULTI_BLUEPRINT_SERVICE_FOUND_CWOBJ6412 = "MULTI_BLUEPRINT_SERVICE_FOUND_CWOBJ6412";

    /**
     * <pre>
    * # Do not ranslate: OSGi
    * # {0} the OSGi service name
    * # {1} the old service ranking
    * # {2} the new service ranking
    * # {3} the number of services using the old service ranking
    * # {4} the number of services using the new service ranking
    * NUMBER_SERVICES_NOT_MATCH_AFTER_UPDATE_CWOBJ6413=CWOBJ6413W: After updating OSGi service {0} from the old service ranking {1} to the new service ranking {2}, the number of service instancess is changed from {3} to {4}. One possible explanation is that the new service could refrence to a bean using a different scope.
    * NUMBER_SERVICES_NOT_MATCH_AFTER_UPDATE_CWOBJ6413.explanation=One possible explanation is that the new service could refrence to a bean using a different scope.
    * NUMBER_SERVICES_NOT_MATCH_AFTER_UPDATE_CWOBJ6413.useraction=Check the plug-in service bundle to make sure the scope of the bean referenced by the service does not change among different versions.
    * </pre>
     */
    public String NUMBER_SERVICES_NOT_MATCH_AFTER_UPDATE_CWOBJ6413 = "NUMBER_SERVICES_NOT_MATCH_AFTER_UPDATE_CWOBJ6413";

    /**
     * <pre>
    * # Do not ranslate: OSGi
    * # {0} the server property file
    * SERVER_PROPERTIES_UPDATED_CWOBJ6414=CWOBJ6414W: The server property file is updated to '{0}' using OSGi Configuration Admin while the eXtreme Scale Server is running. The update will not take effect until the server is restarted.
    * SERVER_PROPERTIES_UPDATED_CWOBJ6414.explanation=Server property file update is ignored while the server is running. However, if the server is restarted, the new configured server property file will be used.
    * SERVER_PROPERTIES_UPDATED_CWOBJ6414.useraction=Check why the server property file is updated. Make sure it is not an operation error.
    * </pre>
     */
    public String SERVER_PROPERTIES_UPDATED_CWOBJ6414 = "SERVER_PROPERTIES_UPDATED_CWOBJ6414";

    /**
     * <pre>
    * BUNDLE_RESTART_NOT_ALLOWED_CWOBJ6415=CWOBJ6415E: Restarting the eXtreme Scale (XS) bundles is not allowed.
    * BUNDLE_RESTART_NOT_ALLOWED_CWOBJ6415.explanation=The Object Request Broker (ORB) does not allow for dynamic starting and stopping of its consumers which prevents XS from being restarted without also restarting the Java Virtual Machine (JVM).
    * BUNDLE_RESTART_NOT_ALLOWED_CWOBJ6415.useraction=Exit the current JVM and restart the process with the XS bundle.
    * </pre>
     */

    public String BUNDLE_RESTART_NOT_ALLOWED_CWOBJ6415 = "BUNDLE_RESTART_NOT_ALLOWED_CWOBJ6415";

    /**
     * <pre>
    * EXIT_JVM_ON_TEARDOWN_CWOBJ6416=CWOBJ6416I: The exitJVMOnTeardown server property is set to true, and the Java virtual machine (JVM) is exiting.
    * EXIT_JVM_ON_TEARDOWN_CWOBJ6416.explanation=The exitJVMOnTeardown server property is set to true.  After the eXtreme Scale server connection ends, the JVM stops.
    * EXIT_JVM_ON_TEARDOWN_CWOBJ6416.useraction=Set the exitJVMOnTeardown server property to false if you do not want to exit the JVM after the eXtreme Scale server connection ends.
    * </pre>
     */
    public String EXIT_JVM_ON_TEARDOWN_CWOBJ6416 = "EXIT_JVM_ON_TEARDOWN_CWOBJ6416";

    /**
     * <pre>
    * STATS_MAP_INJECTION_GRID_ENABLED_CWOBJ7000=CWOBJ7000I: ObjectGrid {0} is enabled for storing historic statistics on container "{1}".
    * STATS_MAP_INJECTION_GRID_ENABLED_CWOBJ7000.explanation=ObjectGrid is enabled to track and store historic statistics within the grid for monitoring.
    * STATS_MAP_INJECTION_GRID_ENABLED_CWOBJ7000.useraction=No action is required.
    * </pre>
     */
    public String STATS_MAP_INJECTION_GRID_ENABLED_CWOBJ7000 = "STATS_MAP_INJECTION_GRID_ENABLED_CWOBJ7000";

    /**
     * <pre>
    * STATS_MAP_INJECTION_GRID_DISABLED_CWOBJ7001=CWOBJ7001I: ObjectGrid {0} is disabled for storing historic statistics on container "{1}".
    * STATS_MAP_INJECTION_GRID_DISABLED_CWOBJ7001.explanation=ObjectGrid is disabled to track and store historic statistics.  The ObjectGrid will not be capable of being monitored by the Extreme Scale monitoring user interface.
    * STATS_MAP_INJECTION_GRID_DISABLED_CWOBJ7001.useraction=No action is required.
    * </pre>
     */
    public String STATS_MAP_INJECTION_GRID_DISABLED_CWOBJ7001 = "STATS_MAP_INJECTION_GRID_DISABLED_CWOBJ7001";

    /**
     * <pre>
    * STATS_MAP_INJECTION_MAPSET_ENABLED_CWOBJ7002=CWOBJ7002I: ObjectGrid:MapSet {0}:{1} is enabled for storing historic statistics on container "{2}".
    * STATS_MAP_INJECTION_MAPSET_ENABLED_CWOBJ7002.explanation=ObjectGrid's mapset is enabled to track and store historic statistics within the grid for monitoring.
    * STATS_MAP_INJECTION_MAPSET_ENABLED_CWOBJ7002.useraction=No action is required.
    * </pre>
     */
    public String STATS_MAP_INJECTION_MAPSET_ENABLED_CWOBJ7002 = "STATS_MAP_INJECTION_MAPSET_ENABLED_CWOBJ7002";

    /**
     * <pre>
    * STATS_MAP_INJECTION_MAPSET_DISABLED_CWOBJ7003=CWOBJ7003I: ObjectGrid:MapSet {0}:{1} is disabled for storing historic statistics on container "{2}".
    * STATS_MAP_INJECTION_MAPSET_DISABLED_CWOBJ7003.explanation=ObjectGrid's mapset is disabled to track and store historic statistics. The maps within the mapset will not be capable of being monitored by the Extreme Scale monitoring user interface.
    * STATS_MAP_INJECTION_MAPSET_DISABLED_CWOBJ7003.useraction=No action is required.
    * </pre>
     */
    public String STATS_MAP_INJECTION_MAPSET_DISABLED_CWOBJ7003 = "STATS_MAP_INJECTION_MAPSET_DISABLED_CWOBJ7003";

    public String AGENT_LOG_MONITOR_ON_INTERVAL_CWOBJ7011 = "AGENT_LOG_MONITOR_ON_INTERVAL_CWOBJ7011";
    
    /**
     * <pre>
     * STATS_COLLECTOR_CWOBJ7100=CWOBJ7100E: Could not locate internal ObjectGrid information map for the following shard:{0}.  Ensure that the grid and mapset is appropriately enabled for historic statistics monitoring.
     * STATS_COLLECTOR_CWOBJ7100.explanation=Statistic monitoring infrastructure injects a very small information map into each ObjectGrid enabled for historic stats monitoring in order to provide and track information about active shards.  If the information map can not be located, historic statistics monitoring will fail for that shard.
     * STATS_COLLECTOR_CWOBJ7100.useraction=Ensure that the grid and mapset is appropriately enabled for historic statistic monitoring. Review the statsSpec setting in server properties file. See the Managed MBean usage overview section in the information center for more information on using statistics.
     * </pre>
     */
    public String STATS_COLLECTOR_CWOBJ7100 = "STATS_COLLECTOR_CWOBJ7100";

    /**
     * <pre>
     * STATS_COLLECTOR_CWOBJ7101=CWOBJ7101E: Statistic monitoring infrastructure could not find any maps associated with ObjectGrid {0}. No monitoring will be performed on an empty ObjectGrid
     * STATS_COLLECTOR_CWOBJ7101.explanation=Statistic monitoring infrastructure monitors ObjectGrids configured with maps which store client data.  If the monitoring infrastructure can not locate maps within the ObjectGrid, no monitoring can be performed.
     * STATS_COLLECTOR_CWOBJ7101.useraction=Ensure that the ObjectGrid deployed has map definitions.
     * </pre>
     */
    public String STATS_COLLECTOR_CWOBJ7101 = "STATS_COLLECTOR_CWOBJ7101";

    /**
     * <pre>
     * STATS_COLLECTOR_CWOBJ7102=CWOBJ7102E: Statistic monitoring infrastructure could not retrieve statistics for path {0}. Ensure statistics tracking is enabled for this process.
     * STATS_COLLECTOR_CWOBJ7102.explanation=Statistic monitoring infrastructure monitors ObjectGrids, their maps, and jvm level statistics, however requires that statistics tracking be enabled for the process. Ensure statistics tracking is enabled such that they can be monitored and historically tracked.
     * STATS_COLLECTOR_CWOBJ7102.useraction=Ensure that the statistics tracking is enabled for this process in the server properties file. Review the statsSpec setting in server properties file. See the Managed MBean usage overview section in the information center for more information on using statistics.
     * </pre>
     */
    public String STATS_COLLECTOR_CWOBJ7102 = "STATS_COLLECTOR_CWOBJ7102";

    /**
     * <pre>
     * STATS_COLLECTOR_ROUTING_ADDITION_PROCESSED_CWOBJ7103=CWOBJ7103I: Statistic charting can now display charts using statistics from partition {0}.
     * STATS_COLLECTOR_ROUTING_ADDITION_PROCESSED_CWOBJ7103.explanation= The statistics charting function has received the proper connections to pull statistics for the given ObjectGrid partition.
     * STATS_COLLECTOR_ROUTING_ADDITION_PROCESSED_CWOBJ7103.useraction=No action is required.
     * </pre>
     */
    public String STATS_COLLECTOR_ROUTING_ADDITION_PROCESSED_CWOBJ7103 = "STATS_COLLECTOR_ROUTING_ADDITION_PROCESSED_CWOBJ7103";

    /**
     * <pre>
     * STATS_COLLECTOR_ROUTING_DELETION_PROCESSED_CWOBJ7104=CWOBJ7104I: Statistic charting has been informed to remove its reference to partition {0}.
     * STATS_COLLECTOR_ROUTING_DELETION_PROCESSED_CWOBJ7104.explanation= The statistics charting function has received indication that stop pulling statistics for the given ObjectGrid partition.
     * STATS_COLLECTOR_ROUTING_DELETION_PROCESSED_CWOBJ7104.useraction=No action is required.
     * </pre>
     */
    public String STATS_COLLECTOR_ROUTING_DELETION_PROCESSED_CWOBJ7104 = "STATS_COLLECTOR_ROUTING_DELETION_PROCESSED_CWOBJ7104";

    /**
     * <pre>
     * STATS_COLLECTOR_ROUTING_STOP_PROCESSED_CWOBJ7105=CWOBJ7105: Statistic charting has been informed to stop collecting data.
     * STATS_COLLECTOR_ROUTING_STOP_PROCESSED_CWOBJ7105.explanation= The statistics charting function has received indication to stop pulling statistics for all ObjectGrid partition.
     * STATS_COLLECTOR_ROUTING_STOP_PROCESSED_CWOBJ7105.useraction=No action is required.
     * </pre>
     */
    public String STATS_COLLECTOR_ROUTING_STOP_PROCESSED_CWOBJ7105 = "STATS_COLLECTOR_ROUTING_STOP_PROCESSED_CWOBJ7105";

    /**
     * <pre>
     * # {0} server properties file path
     * IOEXCEPTION_LOADING_SERVER_PROPS_CWOBJ7199=CWOBJ7199E: An IOException occurred while trying to load server properties path: {0}
     * IOEXCEPTION_LOADING_SERVER_PROPS_CWOBJ7199.explanation=An exception occurred while trying to read the server properties. Statistics might not be collected properly for the server.
     * IOEXCEPTION_LOADING_SERVER_PROPS_CWOBJ7199.useraction=Verify that the server properties file is formatted correctly.
     * </pre>
     */
    public String IOEXCEPTION_LOADING_SERVER_PROPS_CWOBJ7199 = "IOEXCEPTION_LOADING_SERVER_PROPS_CWOBJ7199";

    /**
     * <pre>
     * # {0} server properties file path
     * EXCEPTION_LOADING_SERVER_PROPS_CWOBJ7198=CWOBJ7198E: An exception occurred while trying to load server properties path: {0}
     * EXCEPTION_LOADING_SERVER_PROPS_CWOBJ7198.explanation=An exception occurred while trying to read the server properties. Statistics might not be collected properly for the server.
     * EXCEPTION_LOADING_SERVER_PROPS_CWOBJ7198.useraction=Verify that the server properties file is formatted correctly.
     * </pre>
     */
    public String EXCEPTION_LOADING_SERVER_PROPS_CWOBJ7198 = "EXCEPTION_LOADING_SERVER_PROPS_CWOBJ7198";

    /**
     * <pre>
     * CATALOG_SERVER_HOST_LIST_EMPTY_CWOBJ7197=CWOBJ7197W: The server cannot retrieve the data grid names because the catalog server host list was empty or not defined. Verify that a catalog server endpoint and catalog service domain is defined and selected.
     * CATALOG_SERVER_HOST_LIST_EMPTY_CWOBJ7197.explanation=A catalog service domain must have a list of catalog servers defined before statistics can be retrieved from a data grid.
     * CATALOG_SERVER_HOST_LIST_EMPTY_CWOBJ7197.useraction=Login to the monitoring console. Add a catalog server. Add a catalog service domain. Add the new catalog server to the list of servers for the catalog service domain.
     * </pre>
     */
    public String CATALOG_SERVER_HOST_LIST_EMPTY_CWOBJ7197 = "CATALOG_SERVER_HOST_LIST_EMPTY_CWOBJ7197";

    /**
     * <pre>
    * UNABLED_TO_START_EXTREME_SCALE_TRANSPORT_CWOBJ7403=CWOBJ7403E: Unable to start the eXtreme Scale transport.
    * UNABLED_TO_START_EXTREME_SCALE_TRANSPORT_CWOBJ7403.explanation=An unexpected exception occurred while starting the eXtreme Scale transport.
    * UNABLED_TO_START_EXTREME_SCALE_TRANSPORT_CWOBJ7403.useraction=Examine the JVM logs and FFDC for errors that may indicate why the transport didn't start.
    * </pre>
     */
    public String UNABLE_TO_START_EXTREME_SCALE_TRANSPORT_CWOBJ7403 = "UNABLE_TO_START_EXTREME_SCALE_TRANSPORT_CWOBJ7403";

    /**
     * <pre>
    * # {0} server name
    * OFFHEAP_ENABLED_CWOBJ7404=CWOBJ7404I: Off Heap Storage is enabled for {0}.
    * OFFHEAP_ENABLED_CWOBJ7404.explanation=The offHeapEnabled property was set to true for this server.
    * OFFHEAP_ENABLED_CWOBJ7404.useraction=No action is required.
    * </pre>
     */
    public String OFFHEAP_ENABLED_CWOBJ7404 = "OFFHEAP_ENABLED_CWOBJ7404";

    /**
     * <pre>
     * FAILED_TO_GET_EVICTION_LIST_CWOBJ7405=CWOBJ7405E: Failed to get eviction list from off-heap address.
     * FAILED_TO_GET_EVICTION_LIST_CWOBJ7405.explanation=An internal error occurred failing to get eviction list from off-heap address.
     * FAILED_TO_GET_EVICTION_LIST_CWOBJ7405.useraction=Retrieve the must gathers for debugging ExtremeMemory errors.
     * </pre>
     */
    public String FAILED_TO_GET_EVICTION_LIST_CWOBJ7405 = "FAILED_TO_GET_EVICTION_LIST_CWOBJ7405";

    /**
     * <pre>
     * XM_NO_CONTAINER_CWOBJ7406=CWOBJ7406W: No container named {0} hosted on this server.
     * XM_NO_CONTAINER_CWOBJ7406.explanation=Trying to replicate to a container that no longer exists on this server.
     * XM_NO_CONTAINER_CWOBJ7406.useraction=Check that the replica properly failed over to another container. Otherwise, retrieve the must gathers for debugging ExtremeMemory errors.
     * </pre>
     */
    public String XM_NO_CONTAINER_CWOBJ7406 = "XM_NO_CONTAINER_CWOBJ7406";

    /**
     * <pre>
     * XM_NO_SHARD_CWOBJ7407=CWOBJ7407W: No shard named {0} hosted on this server.
     * XM_NO_SHARD_CWOBJ7407.explanation=Trying to replicate to a shard that no longer exists on this server.
     * XM_NO_SHARD_CWOBJ7407.useraction=Check that the replica properly failed over to another shard. Otherwise, retrieve the must gathers for debugging ExtremeMemory errors.
     * </pre>
     */
    public String XM_NO_SHARD_CWOBJ7407 = "XM_NO_SHARD_CWOBJ7407";

    /**
     * <pre>
     * ERROR_STARTING_XIO_TRANSPORT_CWOBJ7408=CWOBJ7408E: Caught exception starting eXtremeIO transport service.
     * ERROR_STARTING_XIO_TRANSPORT_CWOBJ7408.explanation=An unexpected error occurred starting the eXtremeIO transport service.
     * ERROR_STARTING_XIO_TRANSPORT_CWOBJ7408.useraction=Verify there are no port conflicts with the port chosen. Otherwise, retrieve the must gathers for debugging ExtremeMemory errors.
     * </pre>
     */
    public String ERROR_STARTING_XIO_TRANSPORT_CWOBJ7408 = "ERROR_STARTING_XIO_TRANSPORT_CWOBJ7408";

    /**
     * <pre>
     * ERROR_STARTING_LOADING_XM_NATIVE_LIBRARIES_CWOBJ7409=CWOBJ7409E: Caught exception starting eXtremeMemory due to missing native libraries.
     * ERROR_STARTING_LOADING_XM_NATIVE_LIBRARIES_CWOBJ7409.explanation=Native libraries are required to be loaded when using eXtremeMemory.
     * ERROR_STARTING_LOADING_XM_NATIVE_LIBRARIES_CWOBJ7409.useraction=Verify you are using a supported platform for eXtremeMemory.
     * </pre>
     */
    public String ERROR_STARTING_LOADING_XM_NATIVE_LIBRARIES_CWOBJ7409 = "ERROR_STARTING_LOADING_XM_NATIVE_LIBRARIES_CWOBJ7409";

    /**
     * <pre>
     * # {0} shard identity
     * # {1} shard type (primary, sync replica, async replica), follows 1511I format
     * REPLICA_XM_ENABLED_CWOBJ7410=CWOBJ7410I: {0} ({1}) is using eXtremeMemory.
     * REPLICA_XM_ENABLED_CWOBJ7410.explanation=The specified shard is using eXtremeMemory for replication.
     * REPLICA_XM_ENABLED_CWOBJ7410.useraction=No action is required.
     * </pre>
     */
    public String REPLICA_XM_ENABLED_CWOBJ7410 = "REPLICA_XM_ENABLED_CWOBJ7410";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} map name
     * XM_NOT_ENABLED_COPY_MODE_CWOBJ7411=CWOBJ7411W: Can not enable eXtremeMemory for ObjectGrid {0} map set {1} map {2} because the copy mode is not COPY_TO_BYTES or COPY_TO_BYTES_RAW.
     * XM_NOT_ENABLED_COPY_MODE_CWOBJ7411.explanation=The copy mode on the provided map is not set to a copy mode that is compatible with eXtremeMemory.
     * XM_NOT_ENABLED_COPY_MODE_CWOBJ7411.useraction=To use eXtremeMemory with the provided map, change the copyMode attribute on the map to a compatible copy mode.
     * </pre>
     */
    public String XM_NOT_ENABLED_COPY_MODE_CWOBJ7411 = "XM_NOT_ENABLED_COPY_MODE_CWOBJ7411";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} map name
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7412=CWOBJ7412W: Can not enable eXtremeMemory for ObjectGrid {0} map set {1} map {2} because the built-in write behind loader is not supported with eXtremeMemory.
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7412.explanation=A write behind loader was configured for the provided map, but the write behind loader is not supported with eXtremeMemory.
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7412.useraction=To use eXtremeMemory with the provided map, disable the write behind loader.
     * </pre>
     */
    public String XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7412 = "XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7412";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} map name
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7413=CWOBJ7413W: Can not enable eXtremeMemory for ObjectGrid {0} map set {1} map {2} because custom evictors are not supported with eXtremeMemory.
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7413.explanation=A custom evictor was configured for the provided map, but custom evictors are not supported with eXtremeMemory.
     * XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7413.useraction=To use eXtremeMemory with the provided map, disable custom evictors.
     * </pre>
     */
    public String XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7413 = "XM_NOT_ENABLED_WRITE_BEHIND_CWOBJ7413";

    /**
     * <pre>
     * # {0} objectgrid name
     * XM_NOT_ENABLED_GRID_CWOBJ7414=CWOBJ7414W: Can not enable eXtremeMemory for ObjectGrid {0} because one of the maps is using a configuration unsupported in eXtremeMemory mode.
     * XM_NOT_ENABLED_GRID_CWOBJ7414.explanation=A setting for the map for the provided ObjectGrid is incompatible with eXtremeMemory.
     * XM_NOT_ENABLED_GRID_CWOBJ7414.useraction=Review previous messages to find the map using an incompatible configuration and the type of configuration problem.
     * </pre>
     */
    public String XM_NOT_ENABLED_GRID_CWOBJ7414 = "XM_NOT_ENABLED_GRID_CWOBJ7414";

    /**
     * <pre>
     * # {0} property
     * # {1} value
     * # {2} default timeout
     * XM_READ_NUMBERFORMAT_CWOBJ7415=CWOBJ7415W: The {0} property could not be parsed into an integer. The value provided was {1}. A default timeout of {2} seconds will be used.
     * XM_READ_NUMBERFORMAT_CWOBJ7415.explanation=The property could not be parsed into an integer. A default timeout will be used.
     * XM_READ_NUMBERFORMAT_CWOBJ7415.useraction=Provide a valid timeout in seconds.
     * </pre>
     */
    public String XM_READ_NUMBERFORMAT_CWOBJ7415 = "XM_READ_NUMBERFORMAT_CWOBJ7415";

    /**
     * <pre>
     * # {0} exception
     * XM_AUTH_KEY_CWOBJ7416=CWOBJ7416E: The AuthKeyClient could not be initialized due to the exception, {0}.
     * XM_AUTH_KEY_CWOBJ7416.explanation=The authentication key could not be initialized. Security will not be correctly configured.
     * XM_AUTH_KEY_CWOBJ7416.useraction=Review the provided exception.
     * </pre>
     */
    public String XM_AUTH_KEY_CWOBJ7416 = "XM_AUTH_KEY_CWOBJ7416";

    /**
     * <pre>
     * # {0} server trust required
     * # {1} client trust required
     * XM_TRUST_MISMATCH_CWOBJ7417=CWOBJ7417E: The authenticationSecret settings do not match on the client and server configurations. Server authenticationSecret required is set to {0}. The client authenticationSecret required is set to {1}.
     * XM_TRUST_MISMATCH_CWOBJ7417.explanation=The client and server security configuration settings are the same. One side requires an authenticationSecret and one side does not.
     * XM_TRUST_MISMATCH_CWOBJ7417.useraction=Review the configuration and add or remove the authenticationSecret settings so the client and server sides match.
     * </pre>
     */
    public String XM_TRUST_MISMATCH_CWOBJ7417 = "XM_TRUST_MISMATCH_CWOBJ7417";

    /**
     * <pre>
     * # {0} config file
     * # {1} property
     * # {2} Maximum off heap size
     * XM_OVERRIDE_MAX_SIZE_CWOBJ7418=CWOBJ7418I: Overriding eXtremeMemory maximum off heap size found in the {0} file with the {1} property configured in the server properties. The new value is {2}.
     * XM_OVERRIDE_MAX_SIZE_CWOBJ7418.explanation=The maxiumum off heap size is set to the value found in the server properties.
     * XM_OVERRIDE_MAX_SIZE_CWOBJ7418.useraction=No action is required.
     * </pre>
     */
    public String XM_OVERRIDE_MAX_SIZE_CWOBJ7418 = "XM_OVERRIDE_MAX_SIZE_CWOBJ7418";

    /**
     * <pre>
     * # {0} objectgrid name
     * # {1} mapset name
     * # {2} map name
     * XM_COPY_MODE_CHANGED_CWOBJ7426=CWOBJ7426I: ObjectGrid {0} map set {1} map {2} copy mode is changed to COPY_TO_BYTES since eXtreme Memory is enabled.
     * XM_COPY_MODE_CHANGED_CWOBJ7426.explanation=The XC10 appliance has dynamic grid instances are confirgured with default maps defined with COPY_ON_READ_AND_COMMIT copyMode. This is not compatible with eXtremeMemory so the copyMode is changed for these maps.
     * XM_COPY_MODE_CHANGED_CWOBJ7426.useraction=No action is required.
     * </pre>
     */
    public String XM_COPY_MODE_CHANGED_CWOBJ7426 = "XM_COPY_MODE_CHANGED_CWOBJ7426";
    
    /**
     * <pre>
     * # {0} zone name
     * # {1} coregroup name
     * Register_CWOBJ8000=CWOBJ8000I: Registration is successful with zone ({0}) and coregroup of ({1}).
     * Register_CWOBJ8000.explanation=This process succesfully registered with the specified zone and the catalog service successfully allocated a coregroup for this process.
     * Register_CWOBJ8000.useraction=No action is required.
     * </pre>
     */
    public String Register_CWOBJ8000 = "Register_CWOBJ8000";

    /**
     * <pre>
     * # {0} zone name
     * Failed_Register_CWOBJ8009=CWOBJ8009E: Registration failed for zone ({0})
     * Failed_Register_CWOBJ8009.explanation=This process failed to register with catalog service.
     * Failed_Register_CWOBJ8009.useraction=Examine other messages and exceptions in this log and the first failure data capture (FFDC), resolve the problem and restart the process.
     * </pre>
     */
    public String Failed_Register_CWOBJ8009 = "Failed_Register_CWOBJ8009";

    /**
     * <pre>
     * # {0} domain
     * # {1) IOR
     * StandbyCatalogServerCreated_CWOBJ8101=CWOBJ8101I: Notify that standby catalog service is created with domain= {0} and with IOR= {1}
     * StandbyCatalogServerCreated_CWOBJ8101.explanation=Standby Catalog Service is created and notified.
     * StandbyCatalogServerCreated_CWOBJ8101.useraction=No action is required.
     * </pre>
     */
    public String StandbyCatalogServerCreated_CWOBJ8101 = "StandbyCatalogServerCreated_CWOBJ8101";

    /**
     * <pre>
     * # {0} domain
     * # {1) IOR
     * MasterCatalogServerCreated_CWOBJ8102=CWOBJ8102I: Notify that master catalog service is created with domain= {0} and with IOR= {1}
     * MasterCatalogServerCreated_CWOBJ8102.explanation=Master Catalog Service is created and notified.
     * MasterCatalogServerCreated_CWOBJ8102.useraction=No action is required.
     * </pre>
     */
    public String MasterCatalogServerCreated_CWOBJ8102 = "MasterCatalogServerCreated_CWOBJ8102";

    /**
     * <pre>
     * # {0} CatalogServerCluster
     * MasterCatalogServerActivated_CWOBJ8106=CWOBJ8106I: The master catalog service cluster activated with cluster {0}
     * MasterCatalogServerActivated_CWOBJ8106.explanation=Master catalog service is activated.
     * MasterCatalogServerActivated_CWOBJ8106.useraction=No action is required.
     * </pre>
     */
    public String MasterCatalogServerActivated_CWOBJ8106 = "MasterCatalogServerActivated_CWOBJ8106";

    /**
     * <pre>
     * # {0} domain
     * # {1) IOR
     * ResentStandbyCatalogServer_CWOBJ8108=CWOBJ8108I: Re-send standby catalog service on the request of master catalog service with domain= {0} and IOR= {1}
     * ResentStandbyCatalogServer_CWOBJ8108.explanation=Tell master catalog service who are replica catalog services
     * ResentStandbyCatalogServer_CWOBJ8108.useraction=No action is required.
     * </pre>
     */
    public String ResentStandbyCatalogServer_CWOBJ8108 = "ResentStandbyCatalogServer_CWOBJ8108";

    /**
     * <pre>
     * # {0} catalogServerCluster
     * # {1) server
     * # {2} entry
     * UpdateCatalogServerCluster_CWOBJ8109=CWOBJ8109I: Updated catalog service cluster {0} from server {1} with entry {2}
     * UpdateCatalogServerCluster_CWOBJ8109.explanation=Tell master catalog service who are replica catalog services
     * UpdateCatalogServerCluster_CWOBJ8109.useraction=No action is required.
     * </pre>
     */
    public String UpdateCatalogServerCluster_CWOBJ8109 = "UpdateCatalogServerCluster_CWOBJ8109";

    /**
     * <pre>
     * WaitForReplica_CWOBJ8401=CWOBJ8401I: Waiting for a server replica to be started. Start another server(s) immediately.
     * WaitForReplica_CWOBJ8401.explanation=Waiting for a server replica to be started. Start another server(s) immediately.
     * WaitForReplica_CWOBJ8401.useraction=No action is required.
     * </pre>
     */
    public String WaitForReplica_CWOBJ8401 = "WaitForReplica_CWOBJ8401";

    /**
     * <pre>
     * # {0} numberOfPeers
     * PeerServers_CWOBJ8601=CWOBJ8601I: PeerManager found peers of size {0}
     * PeerServers_CWOBJ8601.explanation=Processing batch jobs for this coregroup.
     * PeerServers_CWOBJ8601.useraction=No action is required.
     * </pre>
     */
    public String PeerServers_CWOBJ8601 = "PeerServers_CWOBJ8601";

    /**
     * <pre>
     * # {0} name of the listener class
     * ListenerClass_CWOBJ8602=CWOBJ8602W: Listener class {0} throws an exception.
     * ListenerClass_CWOBJ8602.explanation=An exception was thrown when listener object was invoked. Listener processing stopped.
     * ListenerClass_CWOBJ8602.useraction=No action is required.
     * </pre>
     */
    public String ListenerClass_CWOBJ8602 = "ListenerClass_CWOBJ8602";

    /**
     * <pre>
     * # {0} number of miliseconds before next retry
     * CONTAINER_FAILED_BOOTSTRAP_CWOBJ7300=CWOBJ7300: This server's attempt to bootstrap to a catalog server has failed.  Will retry in {0} ms.
     * CONTAINER_FAILED_BOOTSTRAP_CWOBJ7300.explanation=This server must be able to reach an active catalog server in order to initialize itself.
     * CONTAINER_FAILED_BOOTSTRAP_CWOBJ7300.useraction=Ensure that a catalog server is active prior to launching a container server.
     * </pre>
     */
    public String CONTAINER_FAILED_BOOTSTRAP_CWOBJ7300 = "CONTAINER_FAILED_BOOTSTRAP_CWOBJ7300";

    /**
     * <pre>
     * CONTAINER_TIMEOUT_BOOTSTRAP_CWOBJ7301=CWOBJ7301E: This server failed to start because it exceeded the maximum allowable number of retry attempts for bootstraping to a catalog server.
     * CONTAINER_TIMEOUT_BOOTSTRAP_CWOBJ7301.explanation=This server must be able to reach an active catalog server within 24 attempts in order to initialize itself.
     * CONTAINER_TIMEOUT_BOOTSTRAP_CWOBJ7301.useraction=Ensure that a catalog server is active and reachable prior to launching this container server.
     * </pre>
     */
    public String CONTAINER_TIMEOUT_BOOTSTRAP_CWOBJ7301 = "CONTAINER_TIMEOUT_BOOTSTRAP_CWOBJ7301";

    /**
     * <pre>
    * OUT_OF_MEMORY_CWOBJ7930=CWOBJ7930E: The eXtremeMemory library could not allocate memory. The available memory is all used.
    * OUT_OF_MEMORY_CWOBJ7930.explanation=The eXtremeMemory library could not allocate new native memory. The operation stopped.
    * OUT_OF_MEMORY_CWOBJ7930.useraction=Review the configured maximum eXtremeMemory size that is set for this server and the number of entries that are stored in the server. You can update the maximum eXtremeMemory size with the maxXmSize server property.
    * </pre>
     */
    public String OUT_OF_MEMORY_CWOBJ7930 = "OUT_OF_MEMORY_CWOBJ7930";

    /**
     * <pre>
     * # {0} this catalog server name
     * # {1} exception
     * CATALOGSERVICE_ENDPOINTS_INCONSISTENT_ORDER_CWOBJ7400=CWOBJ7400E: The decision to honor the order of catalogServiceEndPoints must be consistent across the catalog servers in the domain.  This server ({0}) will be stopped. Exception detected: {1}
     * CATALOGSERVICE_ENDPOINTS_INCONSISTENT_ORDER_CWOBJ7400.explanation=Each catalog server in the domain must have the same value for the ordered argument/property.
     * CATALOGSERVICE_ENDPOINTS_INCONSISTENT_ORDER_CWOBJ7400.useraction=Restart your catalog servers.  Ensure that every catalog server in the domain has set the ordered argument/property consistently.
     * </pre>
     */
    public String CATALOGSERVICE_ENDPOINTS_INCONSISTENT_ORDER_CWOBJ7400 = "CATALOGSERVICE_ENDPOINTS_INCONSISTENT_ORDER_CWOBJ7400";

    /**
     * <pre>
     * # {0} this catalog server name
     * # {1} exception
     * CATALOGSERVICE_ENDPOINTS_STRING_INCONSISTENT_CWOBJ7401=CWOBJ7401E: A discrepancy in the catalogServiceEndPoints value was detected.  The catalogServiceEndPoints value must be the same on each catalog server.  This server ({0}) will be stopped.  Exception detected: {1}
     * CATALOGSERVICE_ENDPOINTS_STRING_INCONSISTENT_CWOBJ7401.explanation=Each catalog server in the domain must use the same catalogServiceEndPoints.  Order is important when the ordered argument/property is true.
     * CATALOGSERVICE_ENDPOINTS_STRING_INCONSISTENT_CWOBJ7401.useraction=Ensure that every catalog server in the domain is using the same catalogServiceEndPoints.  Restart this catalog server with catalogServiceEndPoints that are consistent with those used by other catalog servers in the domain.
     * </pre>
     */
    public String CATALOGSERVICE_ENDPOINTS_STRING_INCONSISTENT_CWOBJ7401 = "CATALOGSERVICE_ENDPOINTS_STRING_INCONSISTENT_CWOBJ7401";

    /**
     * <pre>
     * CATALOGSERVICE_ENDPOINTS_ORDERED_CWOBJ7402=CWOBJ7402I: This catalog server is honoring the order of catalogServiceEndPoints.
     * CATALOGSERVICE_ENDPOINTS_ORDERED_CWOBJ7402.explanation=The ordered argument/property was set to true for this server.
     * CATALOGSERVICE_ENDPOINTS_ORDERED_CWOBJ7402.useraction=No action is required.
     * </pre>
     */
    public String CATALOGSERVICE_ENDPOINTS_ORDERED_CWOBJ7402 = "CATALOGSERVICE_ENDPOINTS_ORDERED_CWOBJ7402";

    /**
     * <pre>
     * # {0} Domain Id
     * # {1} Catalog Service End Points 
     * CATALOGSERVICE_DOMAIN_INCONSISTENT_FOR_ENDPOINTS_CWOBJ7419=CWOBJ7419E: Domain names {0} are unequal for catalog servers with end points {1}.
     * CATALOGSERVICE_DOMAIN_INCONSISTENT_FOR_ENDPOINTS_CWOBJ7419.explanation=Domain names {0} are unequal for catalog servers with end points {1}.
     * CATALOGSERVICE_DOMAIN_INCONSISTENT_FOR_ENDPOINTS_CWOBJ7419.useraction=Make the domain names consistent.
     * </pre>
     */
    public String CATALOGSERVICE_DOMAIN_INCONSISTENT_FOR_ENDPOINTS_CWOBJ7419 = "CATALOGSERVICE_DOMAIN_INCONSISTENT_FOR_ENDPOINTS_CWOBJ7419";

    /**
     * <pre>
     * # {0} config file
     * # {1} property
     * # {2} Maximum off heap size
     * XM_MAX_SIZE_CWOBJ7420=CWOBJ7420I: Setting eXtremeMemory maximum off heap size found in the {0} file with the {1} property. The new value is {2}.
     * XM_MAX_SIZE_CWOBJ7420.explanation=The maxiumum off heap size is set to the value found in the listed file.
     * XM_MAX_SIZE_CWOBJ7420.useraction=No action is required.
     * </pre>
     */
    public String XM_MAX_SIZE_CWOBJ7420 = "XM_MAX_SIZE_CWOBJ7420";

    /**
     * <pre>
     * # {0} Compression Type
     * # {1} Endpoints
     * CATALOGSERVICE_COMPRESSION_INCONSISTENT_CWOBJ7422=CWOBJ7422E: Compression Type {0} is inconsistent for catalog servers with endpoints {1}.
    *  CATALOGSERVICE_COMPRESSION_INCONSISTENT_CWOBJ7422.explaination= Compression Type {0} is inconsistent for catalog servers with endpoints {1}.
    *  CATALOGSERVICE_COMPRESSION_INCONSISTENT_CWOBJ7422.useraction=Make the compression type consistent.
     * </pre>
     */
    public String CATALOGSERVICE_COMPRESSION_INCONSISTENT_CWOBJ7422 = "CATALOGSERVICE_COMPRESSION_INCONSISTENT_CWOBJ7422";

    /**
     * <pre>
     * XM_NATIVE_LIBRARY_INITIALIZED_CWOBJ7423=CWOBJ7423I: Loaded IBM eXtremeMemory library version: {0}
     * XM_NATIVE_LIBRARY_INITIALIZED_CWOBJ7423.explanation=Native libraries must be loaded when you are using eXtremeMemory.
     * XM_NATIVE_LIBRARY_INITIALIZED_CWOBJ7423.useraction=No action is required.
     * </pre>
     */
    public String XM_NATIVE_LIBRARY_INITIALIZED_CWOBJ7423 = "XM_NATIVE_LIBRARY_INITIALIZED_CWOBJ7423";

    /**
     * <pre>
     * XM_MAXIMUM_SIZE_CWOBJ7424=CWOBJ7424I: The IBM eXtremeMemory maximum memory usage for this Java virtual machine (JVM) is set to {0} bytes.
     * XM_MAXIMUM_SIZE_CWOBJ7424.explanation=The number of bytes that are stored in main memory by eXtremeMemory does not exceed the identified size. If native overflow is enabled, additional bytes beyond this limit are stored on disk.
     * XM_MAXIMUM_SIZE_CWOBJ7424.useraction=No action is required.
     * </pre>
     */
    public String XM_MAXIMUM_SIZE_CWOBJ7424 = "XM_MAXIMUM_SIZE_CWOBJ7424";
    
    /**
     * <pre>
     * # {0} Quorum enabled
     * # {1} Endpoints
     * CATALOGSERVICE_QUORUM_INCONSISTENT_CWOBJ7425E=CWOBJ7425E: The quorum property is inconsistent for catalog servers with endpoints {1}.
     * CATALOGSERVICE_QUORUM_INCONSISTENT_CWOBJ7425E.explanation= The quorum property is inconsistent for catalog servers with endpoints {1}.
     * CATALOGSERVICE_QUORUM_INCONSISTENT_CWOBJ7425E.useraction=Make the quorum setting consistent.
     * </pre>
     */
    public String CATALOGSERVICE_QUORUM_INCONSISTENT_CWOBJ7425E = "CATALOGSERVICE_QUORUM_INCONSISTENT_CWOBJ7425E";

    /**
     * <pre>
     * BYTE_BUFFER_MEMORY_LEAK_CWOBJ7421=CWOBJ7421W: XsByteBuffer memory leak detection encountered an unexpected exception while examining 'in use' tables.
     * BYTE_BUFFER_MEMORY_LEAK_CWOBJ7421=Memory leak detection could not complete.
     * BYTE_BUFFER_MEMORY_LEAK_CWOBJ7421=Review the exception provided and review the JVM logs for additional exception about the health of the server.
     * </pre>
     */
    public String BYTE_BUFFER_MEMORY_LEAK_CWOBJ7421 = "BYTE_BUFFER_MEMORY_LEAK_CWOBJ7421";

    /**
     * <pre>
     * # {0} objectgridName:mapSetName:partitionName
     * ROUTE_TABLE_PARTITION_PURGE_CWOBJ7500=CWOBJ7500W: Partition {0} will be removed from the route table because it was found to be stale.
     * ROUTE_TABLE_PARTITION_PURGE_CWOBJ7500.explanation=This partition was found in the route table, but the PlacementService is no longer tracking it.  It should be cleaned from the route table.
     * ROUTE_TABLE_PARTITION_PURGE_CWOBJ7500.useraction=No action is required.
     * </pre>
     */
    public String ROUTE_TABLE_PARTITION_PURGE_CWOBJ7500 = "ROUTE_TABLE_PARTITION_PURGE_CWOBJ7500";

    /**
     * <pre>
     * # {0} list of partitions updated
     * ROUTE_TABLE_UPDATES_CWOBJ7501=CWOBJ7501I: The following partitions just had their routing entries update: {0}.
     * ROUTE_TABLE_UPDATES_CWOBJ7501.explanation=As a result of placement work recently sent to a set of containers, the list of partitions listed are the ones whose routing entries were received from the various containers and subsequently processed and made available to clients.
     * ROUTE_TABLE_UPDATES_CWOBJ7501.useraction=No actoin is required.
     * </pre>
     */
    public String ROUTE_TABLE_UPDATES_CWOBJ7501 = "ROUTE_TABLE_UPDATES_CWOBJ7501";

    public String XIO_BOOTSTRAP_FAILED_CWOBJ7502 = "XIO_BOOTSTRAP_FAILED_CWOBJ7502";

    public String CONTAINER_WORK_ITEM_COMP_SUCCESS_CWOBJ7503 = "CONTAINER_WORK_ITEM_COMP_SUCCESS_CWOBJ7503";

    public String CONTAINER_WORK_ITEM_COMP_FAILURE_CWOBJ7504 = "CONTAINER_WORK_ITEM_COMP_FAILURE_CWOBJ7504";

    public String CONTAINER_ADDED_TO_PEN_BOX_CWOBJ7505 = "CONTAINER_ADDED_TO_PEN_BOX_CWOBJ7505";

    public String CONTAINER_REMOVED_FROM_PEN_BOX_CWOBJ7506 = "CONTAINER_REMOVED_FROM_PEN_BOX_CWOBJ7506";

    public String PLACEMENT_WORK_SENT_TO_CONTAINER_CWOBJ7507 = "PLACEMENT_WORK_SENT_TO_CONTAINER_CWOBJ7507";

    public String WORK_COMPLETED_BY_CONTAINER_CWOBJ7508 = "WORK_COMPLETED_BY_CONTAINER_CWOBJ7508";

    public String CONTAINER_RECEIPT_OF_WORK_FROM_CATALOG_CWOBJ7509 = "CONTAINER_RECEIPT_OF_WORK_FROM_CATALOG_CWOBJ7509";

    public String CONTAINER_RETRY_ON_WORK_COMPLETE_CWOBJ7510 = "CONTAINER_RETRY_ON_WORK_COMPLETE_CWOBJ7510";

    public String CONTAINER_RETRY_FAILED_CWOBJ7511 = "CONTAINER_RETRY_FAILED_CWOBJ7511";

    public String CONTAINER_CATALOG_PUSHING_ROUTE_CWOBJ7512 = "CONTAINER_CATALOG_PUSHING_ROUTE_CWOBJ7512";

    public String OUTSTANDING_WORK_FOR_FAILED_CONTAINER_CWOBJ7513 = "OUTSTANDING_WORK_FOR_FAILED_CONTAINER_CWOBJ7513";

    public String TIMED_OUT_WORK_FINALLY_RETURNED_CWOBJ7514 = "TIMED_OUT_WORK_FINALLY_RETURNED_CWOBJ7514";

    public String SHARD_TYPE_BALANCE_REQUESTED_CWOBJ7515 = "SHARD_TYPE_BALANCE_REQUESTED_CWOBJ7515";

    public String SHARD_TYPE_BALANCE_RESULT_CWOBJ7516 = "SHARD_TYPE_BALANCE_RESULT_CWOBJ7516";

    public String RTCA_NO_ROUTE_MERGING_REQUIRED_CWOBJ7517 = "RTCA_NO_ROUTE_MERGING_REQUIRED_CWOBJ7517";

    public String RTCA_ON_PRIMARY_KEEPING_MYCOPY_CWOBJ7518 = "RTCA_ON_PRIMARY_KEEPING_MYCOPY_CWOBJ7518";

    public String RTCA_ON_SEC_ROUTES_TO_COMPARE_CWOBJ7519 = "RTCA_ON_SEC_ROUTES_TO_COMPARE_CWOBJ7519";

    public String RTCA_CONTAINER_DOWN_REMOVING_ROUTE_CWOBJ7520 = "RTCA_CONTAINER_DOWN_REMOVING_ROUTE_CWOBJ7520";

    public String RTCA_ADDING_ROUTE_CWOBJ7521 = "RTCA_ADDING_ROUTE_CWOBJ7521";
    
    /**
     * <pre>
     * # {0} ObjectGrid
     * # {1} MapSet
     * REPLACE_LOST_SHARDS_REQUESTED_CWOBJ7522=CWOBJ7522I: A replace lost shards request for ObjectGrid {0}:{1} was received.
     * REPLACE_LOST_SHARDS_REQUESTED_CWOBJ7522.explanation=The catalog server received a request to replace the lost shards on the ObjectGrid:MapSet specified.
     * REPLACE_LOST_SHARDS_REQUESTED_CWOBJ7522.useraction=No user action required.
     * </pre>
     */
    public String REPLACE_LOST_SHARDS_REQUESTED_CWOBJ7522 = "REPLACE_LOST_SHARDS_REQUESTED_CWOBJ7522";

    public String POTENTIALLY_STALE_XC10_WORK_ON_STARTUP_CWOBJ7523 = "POTENTIALLY_STALE_XC10_WORK_ON_STARTUP_CWOBJ7523";

    public String UNEXPECTED_NULL_CONTINUE_CWOBJ7524 = "UNEXPECTED_NULL_CONTINUE_CWOBJ7524";
    
    public String CONTAINER_EXIST_CONTAINER_LIST_CWOBJ7525 = "CONTAINER_EXIST_CONTAINER_LIST_CWOBJ7525";
    
    /**
     * <pre>
     * # {0} ShardID
     * # {1} container name
     * # {2} failure status
     * WORK_TIMEOUT_OVERRIDE_CWOBJ7526I=CWOBJ7526I: The placement of workId:grid:mapSet:partition:shardId {0} which was sent to container {1} timed out, but the container sent back a completion notification with a reported error of {2}. Placement action occurs.
     * WORK_TIMEOUT_OVERRIDE_CWOBJ7526I.explanation=A placement action timed out, but completed after the time out occured. The failure status indicates that placement action to do recovery should occur.
     * WORK_TIMEOUT_OVERRIDE_CWOBJ7526I.useraction=Review the JVM logs and the route table xscmd command to verify if the listed partition is placed and reachable in the route table.
     * </pre> 
     */
    public String WORK_TIMEOUT_OVERRIDE_CWOBJ7526I = "WORK_TIMEOUT_OVERRIDE_CWOBJ7526I";


    /**
     * <pre>
     * {0} shard ID
     * {1} current route entry
     * {2} incoming route entry
     * REJECT_STALE_ROUTE_CWOBJ7529I=CWOBJ7529I: An incoming route entry for {0} is stale compared to the current route table and is rejected. The current route entry is {1} and the incoming route entry is {2}.
     * REJECT_STALE_ROUTE_CWOBJ7529I.explanation=If shards move rapidly or the grid is under heavy load, route table updates can be delayed reaching the catalog server. Old route updates are rejected.
     * REJECT_STALE_ROUTE_CWOBJ7529I.useraction=If clients are stable and the route table is valid, no action is required. If clients are failing or the xscmd routetable output lists unreachable shards, run the xscmd triggerPlacement to refresh the route table again.
     * </pre>
     */
    public String REJECT_STALE_ROUTE_CWOBJ7529I = "REJECT_STALE_ROUTE_CWOBJ7529I";

    /**
     * <pre>
     * {0} shard ID
     * {1} incoming route entry workId
     * {2} current route entry workId
     * {3} Grid name
     * {4} global workId
     * OVERRIDE_LOW_WORK_ROUTE_CWOBJ7530I=CWOBJ7530I: An incoming route entry for {0} has a lower workId, {1}, than the current route entry, {2}.  The global workId for {3} is {4}. The incoming route entry appears to be valid and overrides the existing route entry. Review logs for a network partition event.
     * OVERRIDE_LOW_WORK_ROUTE_CWOBJ7530I.explanation=After a network partition event where catalog server promotion happens on more than one catalog server, the resolution can result in stale routes.
     * OVERRIDE_LOW_WORK_ROUTE_CWOBJ7530I.useraction=If clients are stable and the route table output from the xscmd routetable command lists reachable shards, no action is required. If clients are failing or the xscmd routetable output lists unreachable shards, run the xscmd triggerPlacement to refresh the route table again.
     * </pre>
     */
    public String OVERRIDE_LOW_WORK_ROUTE_CWOBJ7530I = "OVERRIDE_LOW_WORK_ROUTE_CWOBJ7530I";

    /**
     * <pre>
     * {0} shard ID
     * {1} incoming route entry workId
     * {2} current route entry workId
     * {3} Grid name
     * {4} global workId
     * REJECT_HIGHER_ID_ROUTE_CWOBJ7531I=CWOBJ7531I: An incoming route entry for {0} has a higher workId, {1}, than the global workId for {2}. The current global workId is {3}. The incoming route entry is rejected. Review logs for a network partition event.
     * REJECT_HIGHER_ID_ROUTE_CWOBJ7531I.explanation=After a network partition event where catalog server promotion happens on more than one catalog server, the resolution can result in stale routes.
     * REJECT_HIGHER_ID_ROUTE_CWOBJ7531I.useraction=If clients are stable and the route table output from the xscmd routetable command lists reachable shards, no action is required. If clients are failing or the xscmd routetable output lists unreachable shards, run the xscmd triggerPlacement to refresh the route table again.
     * </pre>
     */
    public String REJECT_HIGHER_ID_ROUTE_CWOBJ7531I = "REJECT_HIGHER_ID_ROUTE_CWOBJ7531I";
    
    /**
     * <pre>
     * # {0} server name
     * # {1} catalog server host:port
     * SERVER_NAME_NOT_BOUND_CWOBJ7532I=CWOBJ7531: During a heartbeat request, this server name, {0}, was not found on the catalog service at {1}. Validation of shard placement will be done.
     * SERVER_NAME_NOT_BOUND_CWOBJ7532I.explanation=The server is not currently recognized by the catalog service. Either the server can repopulate the catalog server or the server will stop or recycle. This can occur after a network outage, very high CPU usage or other event which temporarily prevents communication between the container and catalog servers.
     * SERVER_NAME_NOT_BOUND_CWOBJ7532I.useraction=Review the logs for the next action on the server. If the WebSphere eXtreme Scale process is running as an embedded service and the container stops, then JVM needs to be restarted by the user.
     * </pre>
     */
    public String SERVER_NAME_NOT_BOUND_CWOBJ7532I = "SERVER_NAME_NOT_BOUND_CWOBJ7532I";
    
    /**
     * <pre>
     * # {0} exception
     * EXCEPTION_ON_XIO_HB_CWOBJ7533W=CWOBJ7533W: An exception occurred during the container server check in process. The check in process repeats in approximately 30 seconds. Exception received: {0}
     * EXCEPTION_ON_XIO_HB_CWOBJ7533W.explanation=While checking in with the catalog service, an exception occurred. This can occur after a network outage, very high CPU usage or other event which temporarily prevents communication between the container and catalog servers.
     * EXCEPTION_ON_XIO_HB_CWOBJ7533W.useraction=Review previous exceptions in the JVM logs. Also review the catalog server JVM logs for exceptions occurring at a similar time. If the container server continues to receive exceptions, recycle the JVM.
     * </pre>
     */
    public String EXCEPTION_ON_XIO_HB_CWOBJ7533W = "EXCEPTION_ON_XIO_HB_CWOBJ7533W";

    /**
     * <pre>
     * # {0} value that cannot be serialized
     * CANNOT_SERIALIZE_VALUE_CWOBJ7600=CWOBJ7600E: Cannot serialize cache entry value {0}. Serialization failed.
     * CANNOT_SERIALIZE_VALUE_CWOBJ7600.explanation=An error occured during the serialization of a cache entry value.
     * CANNOT_SERIALIZE_VALUE_CWOBJ7600.useraction=Ensure the value class is serializable.
     * </pre>
     */
    public String CANNOT_SERIALIZE_VALUE_CWOBJ7600 = "CANNOT_SERIALIZE_VALUE_CWOBJ7600";

    /**
     * <pre>
     * # {0} key that cannot be serialized
     * CANNOT_SERIALIZE_KEY_CWOBJ7601=CWOBJ7601E: Cannot serialize cache entry key {0}. Serialization failed.
     * CANNOT_SERIALIZE_KEY_CWOBJ7601.explanation=An error occured during the serialization of a cache entry key.
     * CANNOT_SERIALIZE_KEY_CWOBJ7601.useraction=Ensure the key class is serializable.
     * </pre>
     */
    public String CANNOT_SERIALIZE_KEY_CWOBJ7601 = "CANNOT_SERIALIZE_KEY_CWOBJ7601";

    /**
     * <pre>
     * # {0} exception message
     * CATALOG_SERVICE_DOMAIN_BEAN_INITIALIZATION_FAIL_CWOBJ7602=CWOBJ7602E: Object Grid Catalog Service Domain Bean failed to initialize. Exception occured {0}
     * CATALOG_SERVICE_DOMAIN_BEAN_INITIALIZATION_FAIL_CWOBJ7602.explanation=The attempt to initialize the Object Grid Catalog Service Domain Bean failed. The configuration may be incorrect or the WebSphere eXtreme Scale server may be unreacable.
     * CATALOG_SERVICE_DOMAIN_BEAN_INITIALIZATION_FAIL_CWOBJ7602.useraction=Review the exception, resolve the error and retry the operation.
     * </pre>
     */
    public String CATALOG_SERVICE_DOMAIN_BEAN_INITIALIZATION_FAIL_CWOBJ7602 = "CATALOG_SERVICE_DOMAIN_BEAN_INITIALIZATION_FAIL_CWOBJ7602";

    /**
     * <pre>
     * # {0} exception message
     * CLIENT_BEAN_INITIALIZATION_FAIL_CWOBJ7603=CWOBJ7603E: Object Grid Client Bean failed to initialize. Exception occured {0}
     * CLIENT_BEAN_INITIALIZATION_FAIL_CWOBJ7603.explanation=The attempt to initialize the Object Grid Client Bean failed. The Object Grid name may be incorrect.
     * CLIENT_BEAN_INITIALIZATION_FAIL_CWOBJ7603.useraction=Review the exception, resolve the error and retry the operation.
     * </pre>
     */
    public String CLIENT_BEAN_INITIALIZATION_FAIL_CWOBJ7603 = "CLIENT_BEAN_INITIALIZATION_FAIL_CWOBJ7603";

    /**
     * <pre>
     * SPRING_FAST_FAIL_DISABLED_CWOBJ7604=CWOBJ7604I: WebSphere eXtreme Scale Spring Fast-Fail disabled.
     * SPRING_FAST_FAIL_DISABLED_CWOBJ7604.explanation=WebSphere eXtreme Scale Spring Fast-Fail has been disabled.
     * SPRING_FAST_FAIL_DISABLED_CWOBJ7604.useraction=No action is required.
     * </pre>
     */
    public String SPRING_FAST_FAIL_DISABLED_CWOBJ7604 = "SPRING_FAST_FAIL_DISABLED_CWOBJ7604";

    /**
     * <pre>
     * # Do not translate: WebSphere, eXtreme, Scale, Spring Cache
     * # {0} Cache name
     * # {1} Grid
     * # {2} Map
     * SPRING_CACHE_GRID_DISCONNECTED_CWOBJ7605=CWOBJ7605E: The WebSphere eXtreme Scale Spring Cache provider has become disconnected from {0} cache, {1} WebSphere eXtreme Scale grid and {2} map.
     * SPRING_CACHE_GRID_DISCONNECTED_CWOBJ7605.explanation=The provider has become disconnected from the specified grid and map.
     * SPRING_CACHE_GRID_DISCONNECTED_CWOBJ7605.useraction=Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs.
     * </pre>
     */
    public String SPRING_CACHE_GRID_DISCONNECTED_CWOBJ7605 = "SPRING_CACHE_GRID_DISCONNECTED_CWOBJ7605";

    /**
     * <pre>
     * # {0} Cache name
     * # {1} Grid
     * # {2} Map
     * SPRING_CACHE_GRID_RECONNECTED_CWOBJ7606=CWOBJ7606I: The WebSphere eXtreme Scale Spring Cache provider has reconnected with {0} cache, {1} WebSphere eXtreme Scale grid and {2} map.
     * SPRING_CACHE_GRID_RECONNECTED_CWOBJ7606.explanation=The provider has been reconnected the specified cache, grid and map.
     * SPRING_CACHE_GRID_RECONNECTED_CWOBJ7606.useraction=No action is required.
     * </pre>
     */
    public String SPRING_CACHE_GRID_RECONNECTED_CWOBJ7606 = "SPRING_CACHE_GRID_RECONNECTED_CWOBJ7606";

    /**
     * <pre>
     * # {0} topic name
     * # {1} response code
     * SUBSCRIPTION_REJECTED_CWOBJ7650=CWOBJ7650W: The subscription for the {0} topic was rejected with the following response code: {1}
     * SUBSCRIPTION_REJECTED_CWOBJ7650.explanation=The publisher rejected a client subscription request.
     * SUBSCRIPTION_REJECTED_CWOBJ7650.useraction=Ensure that the client has the correct authorization to access the data grid and map.
     * </pre>
     */
    public String SUBSCRIPTION_REJECTED_CWOBJ7650 = "SUBSCRIPTION_REJECTED_CWOBJ7650";

    /**
     * <pre>
     * # {0} topic name
     * SUBSCRIPTION_REJECTED_CWOBJ7651=CWOBJ7651W: The subscription for the {0} topic was rejected with no response code.
     * SUBSCRIPTION_REJECTED_CWOBJ7651.explanation=The publisher rejected a client subscription request.
     * SUBSCRIPTION_REJECTED_CWOBJ7651.useraction=Ensure that the client has the correct authorization to access the data grid and map.
     * </pre>
     */
    public String SUBSCRIPTION_REJECTED_CWOBJ7651 = "SUBSCRIPTION_REJECTED_CWOBJ7651";

    /**
     * <pre>
     * # {0} topic name
     * # {1} partition id
     * NEARCACHE_MISSED_MESSAGE_CWOBJ7652=CWOBJ7652W: The subscriber did not receive one or more invalidation messages for the near cache invalidation topic {0}. Invalidating all near cache data for partition {1}.
     * NEARCACHE_MISSED_MESSAGE_CWOBJ7652.explanation=A message that contains cache invalidation data was lost.  You need to clear the near cache to avoid stale data on client.
     * NEARCACHE_MISSED_MESSAGE_CWOBJ7652.useraction=Ensure that the network connection between the client and container processes is stable.
     * </pre>
     */
    public String NEARCACHE_MISSED_MESSAGE_CWOBJ7652 = "NEARCACHE_MISSED_MESSAGE_CWOBJ7652";

    /**
     * <pre>
     * # {0} grid name
     * # {1} map name
     * # {2} partition id
     * INVALIDATION_FAILED_CWOBJ7653=CWOBJ7653W: The near cache invalidations for the following elements were not applied: {0} grid, {1} map, partition {2}
     * INVALIDATION_FAILED_CWOBJ7653.explanation=A transaction to remove near cache entries was not successful.  The near cache might contain stale data.
     * INVALIDATION_FAILED_CWOBJ7653.useraction=To ensure that the near cache does not contain stale data, restart the client application.
     * </pre>
     */
    public String INVALIDATION_FAILED_CWOBJ7653 = "INVALIDATION_FAILED_CWOBJ7653";

    /**
     * <pre>
     * # {0} publisher name
     * # {1} subscriber name
     * PUBLISHER_REJECTED_CWOBJ7654=CWOBJ7654W: The {0} publisher rejected the {1} subscriber.
     * PUBLISHER_REJECTED_CWOBJ7654.explanation=The publisher rejected a client subscription request.
     * PUBLISHER_REJECTED_CWOBJ7654.useraction=Ensure that the client has the correct authorization to access the data grid and map.
     * </pre>
     */
    public String PUBLISHER_REJECTED_CWOBJ7654 = "PUBLISHER_REJECTED_CWOBJ7654";

    /**
     * <pre>
     * # {0} topic name
     * # {1} number of queued messages
     * SUBSCRIPTION_MSG_QUEUE_EXCEEDED_CWOBJ7655=CWOBJ7655W: The subscription for the {0} topic exceeded {1} queued messages. Queued messages are discarded.
     * SUBSCRIPTION_MSG_QUEUE_EXCEEDED_CWOBJ7655.explanation=The subscriber received a large number of "out of order" messages. Therefore, the messages are discarded.
     * SUBSCRIPTION_MSG_QUEUE_EXCEEDED_CWOBJ7655.useraction=Ensure that the network connection between the client and container processes is stable.
     * </pre>
     */
    public String SUBSCRIPTION_MSG_QUEUE_EXCEEDED_CWOBJ7655 = "SUBSCRIPTION_MSG_QUEUE_EXCEEDED_CWOBJ7655";

    /**
     * <pre>
     * # {0} topic name
     * # {1} actual sequence id
     * # {2} expecting sequence id
     * OLD_SEQID_RECEIVED_CWOBJ7656=CWOBJ7656W: Subscriber for topic {0} received a message with an old sequence id of {1} while expecting sequence id {2}, discarding.
     * OLD_SEQID_RECEIVED_CWOBJ7656.explanation=The subscriber received a message which was sent before it was subscribed.  The message will be ignored.
     * OLD_SEQID_RECEIVED_CWOBJ7656.useraction=No user action required.
     * </pre>
     */
    public String OLD_SEQID_RECEIVED_CWOBJ7656 = "OLD_SEQID_RECEIVED_CWOBJ7656";

    /**
     * <pre>
     * # {0} map name
     * # {1} grid name
     * # Messages for Story 1343: Implement near-cache invalidation for clients and servers.
     * INVALID_NEARCACHEINVALIDATION_CONFIG_CWOBJ7657=CWOBJ7657E: Client near-cache invalidation is enabled, but not supported for backingMap, {0} and objectGrid, {1}.
     * INVALID_NEARCACHEINVALIDATION_CONFIG_CWOBJ7657.explanation=Near-cache invalidation is only valid for maps that can support a near cache.  Maps with pessimistic locking or non-distributed data grids are not supported.
     * INVALID_NEARCACHEINVALIDATION_CONFIG_CWOBJ7657.useraction=Change the backingMap configuration, and run the operation again.
     * </pre>
     */
    public String INVALID_NEARCACHEINVALIDATION_CONFIG_CWOBJ7657 = "INVALID_NEARCACHEINVALIDATION_CONFIG_CWOBJ7657";

    /**
     * <pre>
     * # {0} grid name
     * # {1} exception
     * FAILED_TO_INSTALL_PLUGINS_CWOBJ7658=CWOBJ7658E: A failure occurred installing plugins which support the Near Cache Invalidation and Continuous Query features for objectGrid: {0}.  The error is {1}.
     * FAILED_TO_INSTALL_PLUGINS_CWOBJ7658.explanation=System plugins are required to support the near cache invalidation and continuous query features.  One of these plugins failed to activate properly.
     * FAILED_TO_INSTALL_PLUGINS_CWOBJ7658.useraction=Contact IBM support.  The near cache invalidation and continuous query features will not work properly until this error is corrected.
     * </pre>
     */
    public String FAILED_TO_INSTALL_PLUGINS_CWOBJ7658 = "FAILED_TO_INSTALL_PLUGINS_CWOBJ7658";

    /**
     * <pre>
     * # {0} publisher reference
     * # {1} topic name
     * # {2} exception
     * #  Messages for Story 166: PubSub feature
     * PUBSUB_MESSAGE_FAILURE_CWOBJ7659=CWOBJ7659W: Error sending to actor {0} for topic {1} the error was {2}
     * PUBSUB_MESSAGE_FAILURE_CWOBJ7659.explanation=An error occured while sending a message between components.  The connection will be restablished.
     * PUBSUB_MESSAGE_FAILURE_CWOBJ7659.useraction=No user action required.
     * </pre>
     */
    public String PUBSUB_MESSAGE_FAILURE_CWOBJ7659 = "PUBSUB_MESSAGE_FAILURE_CWOBJ7659";

    /**
     * <pre>
     * # {0} map name
     * # {1} grid name
     * # Messages for Story 1343 and 10276: Implement near-cache last access TTL sync listener for clients and servers.
     * INVALID_NEARCACHE_LASTACCESS_SYNC_CONFIG_CWOBJ7660=CWOBJ7660E: Client near-cache last access TTL listener is enabled, but not supported for backingMap, {0} and objectGrid, {1}.
     * INVALID_NEARCACHE_LASTACCESS_SYNC_CONFIG_CWOBJ7660.explanation=Near-cache last access TTL listener is only valid for maps that can support optimistic locking.  Maps with pessimistic locking or non-distributed data grids are not supported.
     * INVALID_NEARCACHE_LASTACCESS_SYNC_CONFIG_CWOBJ7660.useraction=Change the backingMap configuration, and run the operation again.
     * </pre>
     */
    public String INVALID_NEARCACHE_LASTACCESS_SYNC_CONFIG_CWOBJ7660 = "INVALID_NEARCACHE_LASTACCESS_SYNC_CONFIG_CWOBJ7660";

    /**
     * <pre>
    * # {0} grid name
    * # {1} map name
    * # Messages for Story 1202: Near cache invalidation
    * CACHE_INVALIDATION_INIT_CWOBJ7661=CWOBJ7661I: Initializing near cache invalidation for grid {0} map {1}.
    * CACHE_INVALIDATION_INIT_CWOBJ7661.explanation=Near cache invalidation has been enabled for this map.
    * CACHE_INVALIDATION_INIT_CWOBJ7661.useraction=No user action required.
    * </pre>
     */
    public String CACHE_INVALIDATION_INIT_CWOBJ7661 = "CACHE_INVALIDATION_INIT_CWOBJ7661";

    /**
     * <pre>
     * # {0} map name
     * # {1} grid name
     * # Messages for Story 1202: Implement near-cache invalidation for clients and servers.
     * NEARCACHEINVALIDATION_NEEDS_XIO_CWOBJ7662=CWOBJ7662E: Client near-cache invalidation is enabled for grid {0} map {1}, but not eXtremeIO is not enabled.
     * NEARCACHEINVALIDATION_NEEDS_XIO_CWOBJ7662.explanation=Near-cache invalidation requires eXtremeIO.
     * NEARCACHEINVALIDATION_NEEDS_XIO_CWOBJ7662.useraction=Enable eXtremeIO and restart the server.
     * </pre>
     */
    public String NEARCACHEINVALIDATION_NEEDS_XIO_CWOBJ7662 = "NEARCACHEINVALIDATION_NEEDS_XIO_CWOBJ7662";

    /**
     * <pre>
     * # {0} grid name
     * # {1} map name
     * # {2} partition number
     * # Messages for Story 1202: Implement near-cache invalidation for clients and servers.
     * NEARCACHEINVALIDATION_DISCONNECTED_CWOBJ7663=CWOBJ7663W: Near Cache invalidation notification has been disconnected for grid {0}, map {1}, partition {2}, the near cache has been disabled.
     * NEARCACHEINVALIDATION_DISCONNECTED_CWOBJ7663.explanation=This client is no longer receiving near cache invalidation messages.  To prevent caching stale data, the near cache has been disabled.
     * NEARCACHEINVALIDATION_DISCONNECTED_CWOBJ7663.useraction=Determine cause of communication failure between the client and container servers.
     * </pre>
     */
    public String NEARCACHEINVALIDATION_DISCONNECTED_CWOBJ7663 = "NEARCACHEINVALIDATION_DISCONNECTED_CWOBJ7663";

    /**
     * <pre>
     * # {0} grid name
     * # {1} map name
     * # Messages for Story 1202: Implement near-cache invalidation for clients and servers.
     * NEARCACHEINVALIDATION_RECONNECTED_CWOBJ7664=CWOBJ7664I: Near Cache invalidation notification has been re-enabled for grid {0}, map {1}.
     * NEARCACHEINVALIDATION_RECONNECTED_CWOBJ7664.explanation=This client is now receiving near cache invalidation messages.  The near cache has been re-enabled.
     * NEARCACHEINVALIDATION_RECONNECTED_CWOBJ7664.useraction=No action required
     * </pre>
     */
    public String NEARCACHEINVALIDATION_RECONNECTED_CWOBJ7664 = "NEARCACHEINVALIDATION_RECONNECTED_CWOBJ7664";

    /**
     * <pre>
     * # {0} topic name
     * # {1} security information
     * REJECT_SUBSCRIPTION_DUE_TO_SECURITY_CWOBJ7665=CWOB7665W: The subscription for the topic {0} is rejected due to the following security reason {1}.
     * REJECT_SUBSCRIPTION_DUE_TO_SECURITY_CWOBJ7665.explanation= The user may not have a permission to subscribe the given topic.
     * REJECT_SUBSCRIPTION_DUE_TO_SECURITY_CWOBJ7665.useraction=Set the proper permissions in the org authorization file. Users need to have read permission on the map to run nearcache validation and have query permission on the grid and read permission on the map to run continuous query. 
     * </pre>
     */
    public String REJECT_SUBSCRIPTION_DUE_TO_SECURITY_CWOBJ7665 = "REJECT_SUBSCRIPTION_DUE_TO_SECURITY_CWOBJ7665";

    /**
     * <pre>    
     * # {0} security information
     * REJECT_SUBSCRIPTION_CANCEL_DUE_TO_SECURITY_CWOBJ7666=CWOBJ7666W: The subscription cannot be cancelled since the user defined in the security context is not the original subscriber for the topic {0}.
     * REJECT_SUBSCRIPTION_CANCEL_DUE_TO_SECURITY_CWOBJ7666.explanation= The user may not have a permission to subscribe the given topic.
     * REJECT_SUBSCRIPTION_CANCEL_DUE_TO_SECURITY_CWOBJ7666.useraction=Set the proper permissions in the org authorization file. Users need to have read permission on the map to run nearcache validation and have query permission on the grid and read permission on the map to run continuous query. 
     * </pre>
     */
    public String REJECT_SUBSCRIPTION_CANCEL_DUE_TO_SECURITY_CWOBJ7666 = "REJECT_SUBSCRIPTION_CANCEL_DUE_TO_SECURITY_CWOBJ7666";

    /**
     * <pre>
     * # {0} map name
     * # {1} partition number
     * # {2} exception class
     * NEARCACHE_LASTACCESS_SYNC_FAILED_CWOBJ7667W=CWOBJ7667W: The last access time time-to-live (TTL) listener that is configured on the client near cache did not synchronize with the remote cache for the {0} backingMap on the {1} partition. An exception was encountered during communication with the remote cache: {2}
     * NEARCACHE_LASTACCESS_SYNC_FAILED_CWOBJ7667W.explanation=The last access time TTL listener that is configured on the near cache did not synchronize the TTL last access time with a remote server.  Entries might be evicted from the server unexpectedly.
     * NEARCACHE_LASTACCESS_SYNC_FAILED_CWOBJ7667W.useraction=If this message occurs infrequently, then it can be ignored. The accompanying exception might help identify the cause of this warning.  Examine the client and server log files for indications of other errors that prevented synchronization from completing.
     * </pre>
     */
    public String NEARCACHE_LASTACCESS_SYNC_FAILED_CWOBJ7667W="NEARCACHE_LASTACCESS_SYNC_FAILED_CWOBJ7667W";

    /**
     * <pre>
     * # {0} property
     * # {1} value
     * # {2} default timeout
     * # Message for task 20355: Near-cache invalidation can bog down under load
     * PUBSUB_TIMEOUT_NUMBERFORMAT_CWOBJ7668=CWOBJ7668W: The {0} property could not be parsed into an integer. The value provided was {1}. A default timeout of {2} seconds will be used.
     * PUBSUB_TIMEOUT_NUMBERFORMAT_CWOBJ7668.explanation=The property could not be parsed into an integer. A default timeout will be used.
     * PUBSUB_TIMEOUT_NUMBERFORMAT_CWOBJ7668.useraction=Provide a valid timeout in seconds.
     * </pre>
     */
    public String PUBSUB_TIMEOUT_NUMBERFORMAT_CWOBJ7668 = "PUBSUB_TIMEOUT_NUMBERFORMAT_CWOBJ7668";

    /**
     * <pre>
     * # {0} property
     * # {1} value
     * # {2} default message queue size
     * # Message for task 20355: Near-cache invalidation can bog down under load
     * PUBSUB_MESSAGE_QUEUE_SIZE_NUMBERFORMAT_CWOBJ7669=CWOBJ7669W: The {0} property could not be parsed into an integer. The value provided was {1}. A default maximum message queue size of {2} will be used.
     * PUBSUB_MESSAGE_QUEUE_SIZE_NUMBERFORMAT_CWOBJ7669.explanation=The property could not be parsed into an integer. A default maximum message queue size will be used.
     * PUBSUB_MESSAGE_QUEUE_SIZE_NUMBERFORMAT_CWOBJ7669.useraction=Provide a valid message queue size.
     * </pre>
     */
    public String PUBSUB_MESSAGE_QUEUE_SIZE_NUMBERFORMAT_CWOBJ7669 = "PUBSUB_MESSAGE_QUEUE_SIZE_NUMBERFORMAT_CWOBJ7669";

    /**
     * <pre>
     * ENTITY_MAP_NOT_SUPPORTED_CWOBJ7750=CWOBJ7750E: Continuous query does not support entity maps.
     * ENTITY_MAP_NOT_SUPPORTED_CWOBJ7750.explanation=You cannot run continuous query against maps that have an associated EntityManager API.
     * ENTITY_MAP_NOT_SUPPORTED_CWOBJ7750.useraction=Do not define continuous query against maps that have an associated EntityManager API.
     * </pre>
     */
    public String ENTITY_MAP_NOT_SUPPORTED_CWOBJ7750 = "ENTITY_MAP_NOT_SUPPORTED_CWOBJ7750";

    /**
     * <pre>
     * # {0} attribute path
     * # Messages for Story 1203: Continuous Query feature
     * CANNOT_USE_SPACE_IN_ATTRIBUTE_PATH_CWOBJ7751=CWOBJ7751E: The {0} continuous query attribute path cannot contain whitespace characters.
     * CANNOT_USE_SPACE_IN_ATTRIBUTE_PATH_CWOBJ7751.explanation=The continuous query attribute path does not support whitespace characters.
     * CANNOT_USE_SPACE_IN_ATTRIBUTE_PATH_CWOBJ7751.useraction=Ensure that no whitespace characters are used when you define the attribute path for continuous query.
     * </pre>
     */
    public String CANNOT_USE_SPACE_IN_ATTRIBUTE_PATH_CWOBJ7751 = "CANNOT_USE_SPACE_IN_ATTRIBUTE_PATH_CWOBJ7751";

    /**
     * <pre>
     * # {0} attribute name
     * # {1} class name of the object
     * CANNOT_GET_ATTRIBUTE_CWOBJ7752=CWOBJ7752E: Cannot retrieve attribute {0} from object {1}.
     * CANNOT_GET_ATTRIBUTE_CWOBJ7752.explanation=Java's reflection is used to retrieve the attribute from the object. The attribute must be defined as a public field, or a public getter method is associated with it.
     * CANNOT_GET_ATTRIBUTE_CWOBJ7752.useraction=Ensure that the attribute is either defined as a public field, or a public getter method is associated with it.
     * </pre>
     */
    public String CANNOT_GET_ATTRIBUTE_CWOBJ7752 = "CANNOT_GET_ATTRIBUTE_CWOBJ7752";

    /**
     * <pre>
     * # {0} attribute name
     * # {1} class name of the serializer
     * CANNOT_GET_SERIALIZED_ATTRIBUTE_CWOBJ7753=CWOBJ7753E: Cannot retrieve attribute {0} from serialized entry using serializer {1}.
     * CANNOT_GET_SERIALIZED_ATTRIBUTE_CWOBJ7753.explanation=The serializer's inflateDataObjectAttributes method is used to retrieve the attribute from the object.
     * CANNOT_GET_SERIALIZED_ATTRIBUTE_CWOBJ7753.useraction=Ensure that the serializer's inflateDataObjectAttributes method can handle the requested attribute.
     * </pre>
     */
    public String CANNOT_GET_SERIALIZED_ATTRIBUTE_CWOBJ7753 = "CANNOT_GET_SERIALIZED_ATTRIBUTE_CWOBJ7753";

    /**
     * <pre>
     * # {0} method name
     * # {1} class name of the object
     * CANNOT_INVOKE_METHOD_CWOBJ7754=CWOBJ7754E: Cannot invoke method {0} on object {1}.
     * CANNOT_INVOKE_METHOD_CWOBJ7754.explanation=Java's reflection is used to invoke the method on an object. The method must be a public member of the class and do not take any arguments.
     * CANNOT_INVOKE_METHOD_CWOBJ7754.useraction=Ensure that a public method with the specified name is defined and the method does not take any arguements.
     * </pre>
     */
    public String CANNOT_INVOKE_METHOD_CWOBJ7754 = "CANNOT_INVOKE_METHOD_CWOBJ7754";

    /**
     * <pre>
     * # {0} attribute path
     * # Messages for Story 1203: Continuous Query feature
     * UNMATCHED_PARENTHESES_IN_ATTRIBUTE_PATH_CWOBJ7755=CWOBJ7755E: The {0} continuous query attribute path contains unmatched parentheses.
     * UNMATCHED_PARENTHESES_IN_ATTRIBUTE_PATH_CWOBJ7755.explanation=Method invocation on filtering objects can be specified by using a pair of parentheses \"()\" in the attribute path.
     * UNMATCHED_PARENTHESES_IN_ATTRIBUTE_PATH_CWOBJ7755.useraction=Ensure that the number of open brackets and closed brackets are the same, and all open brackets are immediately followed by a closed bracket.
     * </pre>
     */
    public String UNMATCHED_PARENTHESES_IN_ATTRIBUTE_PATH_CWOBJ7755 = "UNMATCHED_PARENTHESES_IN_ATTRIBUTE_PATH_CWOBJ7755";

    /**
     * <pre>
     * # {0} class name
     * CLASS_ALREADY_REGISTERED_TO_SERIALIZER_CWOBJ7756=CWOBJ7756W: Class {0} is already registered.
     * CLASS_ALREADY_REGISTERED_TO_SERIALIZER_CWOBJ7756.explanation=Each class should register to com.ibm.ws.xs.continuousquery.helper.ClassSerializer only once.
     * CLASS_ALREADY_REGISTERED_TO_SERIALIZER_CWOBJ7756.useraction=Ensure that the code registers the class only once.
     * </pre>
     */
    //public String CLASS_ALREADY_REGISTERED_TO_SERIALIZER_CWOBJ7756="CLASS_ALREADY_REGISTERED_TO_SERIALIZER_CWOBJ7756";

    /**
     * <pre>
     * # {0} input information
     * CANNOT_HANDLE_NULL_INPUT_CWOBJ7757=CWOBJ7757E: Cannot handle null input. {0}
     * CANNOT_HANDLE_NULL_INPUT_CWOBJ7757.explanation=All input arguments are required and cannot be null.
     * CANNOT_HANDLE_NULL_INPUT_CWOBJ7757.useraction=Ensure all input arguments are specified with non-null value.
     * </pre>
     */
    public String CANNOT_HANDLE_NULL_INPUT_CWOBJ7757 = "CANNOT_HANDLE_NULL_INPUT_CWOBJ7757";

    /**
     * <pre>
     * # {0} map name
     * # {1} continuous query topic name
     * # {2} filter chain that is currently associated with the topic
     * # {3} newly requested filter chain
     * INCOMPATIBLE_DUPLICATE_QUERY_CWOBJ7758=CWOBJ7758E: The filter of the existing continuous query topic {1} for map {0} does not match with the new query request. Existing filter: "{2}" New filter: "{3}".
     * INCOMPATIBLE_DUPLICATE_QUERY_CWOBJ7758.explanation=Continuous query topic name must be unique on each map.
     * INCOMPATIBLE_DUPLICATE_QUERY_CWOBJ7758.useraction=Specify another topic name for the new continuous query filter chain.
     * </pre>
     */
    public String INCOMPATIBLE_DUPLICATE_QUERY_CWOBJ7758 = "INCOMPATIBLE_DUPLICATE_QUERY_CWOBJ7758";

    /**
     * <pre>
     * NO_SERIALIZER_PROVIDED_CWOBJ7760=CWOBJ7760E: No serializer is provided. The serialized entry cannot be inflated.
     * NO_SERIALIZER_PROVIDED_CWOBJ7760.explanation=A serializer is needed to inflate the serialized entry.
     * NO_SERIALIZER_PROVIDED_CWOBJ7760.useraction=Ensure that the serializer is provided for the serialized entry.
     * </pre>
     */
    public String NO_SERIALIZER_PROVIDED_CWOBJ7760 = "NO_SERIALIZER_PROVIDED_CWOBJ7760";

    /**
     * {0} topicname
     * {1} error message
     * {2} callstack
     * <pre>
     * CONTINUOUSQUERY_SUBSCRIPTION_FAILED_CWOBJ7761=CWOBJ7761E: An error occurred subscribing for continuous query topic {0}, the error was {1} and the callstack was {2}
     * CONTINUOUSQUERY_SUBSCRIPTION_FAILED_CWOBJ7761.explanation=An error occured while processing a client's continuous query subscription request.  The client will not receive continuous query notifications for this query.
     * CONTINUOUSQUERY_SUBSCRIPTION_FAILED_CWOBJ7761.useraction=Ensure that any necessary custom class definitions exist in the server classpath.
     * </pre>
     */
    public String CONTINUOUSQUERY_SUBSCRIPTION_FAILED_CWOBJ7761 = "CONTINUOUSQUERY_SUBSCRIPTION_FAILED_CWOBJ7761";

    /**
     * <pre>
     * {0} Message type
     * {1} endpoint
     * {2} timeout
     * {3} queue size
     * MESSAGE_TIMEOUT_CWOBJ7851=CWOBJ7851W: Received a timeout while waiting for a response to a {0} message from endpoint {1}. The current timeout is {2} seconds. When the message was added, the queue size was {3}.
     * MESSAGE_TIMEOUT_CWOBJ7851.explanation=A server sent a message to a server at the listed endpoint, but did not receive a response before the configured timeout.
     * MESSAGE_TIMEOUT_CWOBJ7851.useraction=Timeouts can occur during server failure scenarios. If the catalog service domain is stable, there may be network problems delaying server communication.
     * </pre>
     */
    public String MESSAGE_TIMEOUT_CWOBJ7851 = "MESSAGE_TIMEOUT_CWOBJ7851";

    /**
     * <pre>
     * # {0} delay in ms
     * THREAD_STARVATION_CWOBJ7852=CWOBJ7852W: Thread starvation detected.  Thread scheduling delay is {0} ms.
     * THREAD_STARVATION_CWOBJ7852.explanation=A delay was detected in the scheduling of threads running in the JVM.
     * THREAD_STARVATION_CWOBJ7852.useraction=The most common cause of thread scheduling delay is garbage collection.   Examine your heap sizes, garbage collection policy, and verbose gc log to look for long garbage collection times.  Thread scheduling delay can also be caused by swapping in the operating system or hypervisor.
     * </pre>
     */
    public String THREAD_STARVATION_CWOBJ7852 = "THREAD_STARVATION_CWOBJ7852";

    /**
     * <pre>
     * # {0} thread name
     * # {1} thread id
     * # {2} thread state
     * # {3} date and time
     * # {4} stack trace of thread
     * # {5} runnable
     * # {6} optional outbound message
     * HUNG_THREAD_CWOBJ7853=CWOBJ7853W: Detected a hung thread named \"{0}\" TID:{1} {2}.  Executing since {3}.\nStack Trace: {4}\nRunnable: {5}\nLast outbound message: {6}
     * HUNG_THREAD_CWOBJ7853.explanation=A thread executing work inside the server has not completed in the expected amount of time.
     * HUNG_THREAD_CWOBJ7853.useraction=Examine the thread execution stack and logs for potential causes of thread execution delay.  Potential causes may include garbage collection, locking issues, and application errors.
     * </pre>
     */
    public String HUNG_THREAD_CWOBJ7853 = "HUNG_THREAD_CWOBJ7853";

    /**
     * <pre>
     * # {0} thread name
     * # {1} thread id
     * # {2} thread state
     * # {3} runnable of thread
     * HUNG_THREAD_CWOBJ7854=CWOBJ7854W: Thread named \"{0}\" TID:{1} {2} is no longer hung.  Runnable: {3}.
     * HUNG_THREAD_CWOBJ7854.explanation=A thread executing work inside the server was marked as hung, but completed.
     * HUNG_THREAD_CWOBJ7854.useraction=Examine the thread execution stack and logs for potential causes of thread execution delay.  Potential causes may include garbage collection, locking issues, and application errors.
     * </pre>
     */
    public String HUNG_THREAD_CWOBJ7854 = "HUNG_THREAD_CWOBJ7854";

    /**
     * <pre>
     *  # {0} The name of the server
     * SERVER_STARTED_NOTIFICATION_CWOBJ8250=CWOBJ8250I: Server started: {0}
     * SERVER_STARTED_NOTIFICATION_CWOBJ8250.explanation=The server started.
     * SERVER_STARTED_NOTIFICATION_CWOBJ8250.useraction=No action is required.
     * </pre>
     */
    public String SERVER_STARTED_NOTIFICATION_CWOBJ8250 = "SERVER_STARTED_NOTIFICATION_CWOBJ8250";

    // public String SERVER_STARTED_NOTIFICATION_MESSAGE_ID="CWOBJ8250I";

    /**
     * <pre>
     * # {0} The name of the server
     * SERVER_STOPPED_NOTIFICATION_CWOBJ8251=CWOBJ8251I: Server stopped: {0}
     * SERVER_STOPPED_NOTIFICATION_CWOBJ8251.explanation=The server stopped.
     * SERVER_STOPPED_NOTIFICATION_CWOBJ8251.useraction=No action is required.
     * </pre>
     */
    public String SERVER_STOPPED_NOTIFICATION_CWOBJ8251 = "SERVER_STOPPED_NOTIFICATION_CWOBJ8251";

    // public String SERVER_STOPPED_NOTIFICATION_MESSAGE_ID="CWOBJ8251I";

    /**
     * <pre>
     * # {0} The name of the core group
     * CORE_GROUP_CHANGED_NOTIFICATION_CWOBJ8252=CWOBJ8252I: Core group membership changed: {0}
     * CORE_GROUP_CHANGED_NOTIFICATION_CWOBJ8252.explanation=The core group membership for the process changed.
     * CORE_GROUP_CHANGED_NOTIFICATION_CWOBJ8252.useraction=No action is required.
     * </pre>
     */
    public String CORE_GROUP_CHANGED_NOTIFICATION_CWOBJ8252 = "CORE_GROUP_CHANGED_NOTIFICATION_CWOBJ8252";

    // public String CORE_GROUP_CHANGED_NOTIFICATION_MESSAGE_ID="CWOBJ8252I";

    /**
     * <pre>
     * # {0} The name of the server
     * # {1} The name of the core group
     * SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_CWOBJ8253=CWOBJ8253I: The {0} server  joined the {1} core group.
     * SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_CWOBJ8253.explanation=The core group membership changed for the server.
     * SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_CWOBJ8253.useraction=No action is required.
     * </pre>
     */
    public String SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_CWOBJ8253 = "SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_CWOBJ8253";

    // public String SERVER_COREGROUP_MEMBERSHIP_CHANGE_NOTIFICATION_MESSAGE_ID="CWOBJ8253I";

    /**
     * <pre>
     * # {0} The number of active catalog servers
     * # {1} The number of servers in quorum
     * QUORUM_LOST_NOTIFICATION_CWOBJ8254=Quorum is lost. Number of active catalog servers: {0}. Number of servers needed for quorum: {1}.
     * QUORUM_LOST_NOTIFICATION_CWOBJ8254.explanation=Quorum is enabled for the catalog service, but is not processing requests because one or more of the catalog service processes cannot be reached.
     * QUORUM_LOST_NOTIFICATION_CWOBJ8254.useraction=Take one of the following actions to resolve the quorum status issue: verify that all catalog service grid members are visible to this catalog service process, resolve any network failures, restart failed catalog service processes, or call the CoreGroupServiceMBean overrideQuorum MBean operation to override quorum state for this catalog service instance.
     * </pre>
     */
    public String QUORUM_LOST_NOTIFICATION_CWOBJ8254 = "QUORUM_LOST_NOTIFICATION_CWOBJ8254";

    // public String QUORUM_LOST_NOTIFICATION_MESSAGE_ID="CWOBJ8254E";

    /**
     * <pre>
     * # {0} The number of active catalog servers
     * # {1} The number of servers in quorum
     * QUORUM_CHANGED_NOTIFICATION_CWOBJ8255=CWOBJ8255I: Quorum status changed. Number of active catalog servers: {0}. Number of servers needed for quorum: {1}.
     * QUORUM_CHANGED_NOTIFICATION_CWOBJ8255.explanation=The number of catalog servers in quorum changed.
     * QUORUM_CHANGED_NOTIFICATION_CWOBJ8255.useraction=No action is required.
     * </pre>
     */
    public String QUORUM_CHANGED_NOTIFICATION_CWOBJ8255 = "QUORUM_CHANGED_NOTIFICATION_CWOBJ8255";

    /**
     * <pre>
     * # {0} server name
     * # {1} quorum recovery time
     * # {2} request start time
     * # {3} default time
     * QUORUM_HB_SKIP_CWOBJ8256I=CWOBJ8256I: After a quorum recovery event, a request to server {0} timed out. Another request is allowed before failure recovery. Quorum recovered at {1} milliseconds and the request started at {2} milliseconds which is within the allowed recovery window of {3} milliseconds.
     * QUORUM_HB_SKIP_CWOBJ8256I.explanation=The system was out of quorum and recovered. A request to a server timed out shortly after the brownout recovery. Failure recovery for the listed server will not occur until an additonal failure occurs. This prevents a false positive failure of servers.
     * QUORUM_HB_SKIP_CWOBJ8256I.useraction=Use xscmd to review running servers and the state of the grid. For example, review xscmd routetable to verify the grid is reachable. Otherwise, no action is required.
     * </pre>
     */
    public String QUORUM_HB_SKIP_CWOBJ8256I = "QUORUM_HB_SKIP_CWOBJ8256I";

    /**
     * <pre>
     * # {0} The name of the grid server
     * FFDC_LOG_MONITORING_ENABLED_CWOBJ8261=CWOBJ8261I: Critical log message and first-failure data capture (FFDC) exception notifications are enabled for the {0} container server.
     * FFDC_LOG_MONITORING_ENABLED_CWOBJ8261.explanation=The container server has log message and exception notifications enabled. The container server can monitor and relay Java Management Extensions (JMX) notifications for critical log messages and first-failure data capture exceptions.
     * FFDC_LOG_MONITORING_ENABLED_CWOBJ8261.useraction=No action is required. This container server state is the default.     * </pre>
     */
    public String FFDC_LOG_MONITORING_ENABLED_CWOBJ8261 = "FFDC_LOG_MONITORING_ENABLED_CWOBJ8261";

    /**
     * <pre>
     * # {0} The name of the grid server
     * FFDC_LOG_MONITORING_DISABLED_CWOBJ8262=CWOBJ8262I: Critical log message and first-failure data capture (FFDC) exception notifications are disabled for the {0} container server.
     * FFDC_LOG_MONITORING_DISABLED_CWOBJ8262.explanation=The container server does not have log message and exception notifications enabled. The container server does not monitor and relay Java Management Extensions (JMX) notifications for critical log messages and first-failure data capture exceptions.  Notifications are disabled when the enableManagementConcentrator server property is set to false or disabled.
     * FFDC_LOG_MONITORING_DISABLED_CWOBJ8262.useraction=No action is required. To enable critical log message and first-failure data capture (FFDC) exception notifications, set the enableManagementConcentrator server property to true for the container server.     * </pre>
     */
    public String FFDC_LOG_MONITORING_DISABLED_CWOBJ8262 = "FFDC_LOG_MONITORING_DISABLED_CWOBJ8262";

    /**
     * <pre>
     * # {0} The name of the catalog server
     * MANAGEMENT_CONCENTRATOR_ENABLED_CWOBJ8263=CWOBJ8263I: The management concentrator MBean is enabled for the {0} catalog server.
     * MANAGEMENT_CONCENTRATOR_ENABLED_CWOBJ8263.explanation=The catalog server has the management concentrator MBean enabled. The catalog server can monitor and relay Java Management Extensions (JMX) notifications for critical log messages and exceptions from the first-failure data capture log.
     * MANAGEMENT_CONCENTRATOR_ENABLED_CWOBJ8263.useraction=No action is required. This catalog server state is the default.     * </pre>
     */
    public String MANAGEMENT_CONCENTRATOR_ENABLED_CWOBJ8263 = "MANAGEMENT_CONCENTRATOR_ENABLED_CWOBJ8263";

    /**
     * <pre>
     * # {0} The name of the catalog server
     * MANAGEMENT_CONCENTRATOR_DISABLED_CWOBJ8264=CWOBJ8264I: The management concentrator MBean is disabled for the {0} catalog server.
     * MANAGEMENT_CONCENTRATOR_DISABLED_CWOBJ8264.explanation=The catalog server does not have the management concentrator MBean enabled. The catalog service does not monitor or relay  Java Management Extensions (JMX) notifications for critical log messages and exceptions from the first-failure data capture log.
     * MANAGEMENT_CONCENTRATOR_DISABLED_CWOBJ8264.useraction=No action is required. To enable critical log message and first-failure data capture (FFDC) exception notifications, set the enableManagementConcentrator server property to true for the catalog server.     * </pre>
     */
    public String MANAGEMENT_CONCENTRATOR_DISABLED_CWOBJ8264 = "MANAGEMENT_CONCENTRATOR_DISABLED_CWOBJ8264";

    /**
     * <pre>
     * # {0} The name of the server
     * # {1} The exception message contents (sometimes includes the stack trace) 
     * FFDC_NOTIFICATION_WARNING_CWOBJ8265=CWOBJ8265W: A notification was generated on the {0} server for a new exception: {1}.
     * FFDC_NOTIFICATION_WARNING_CWOBJ8265.explanation=The first-failure data capture (FFDC) log generated an exception notification.
     * FFDC_NOTIFICATION_WARNING_CWOBJ8265.useraction=Examine the first-failure data capture (FFDC) log to find out details about the exception and review the log for any additional errors. See the Enabling logging section in the WebSphere eXtreme Scale documentation for the log locations.      * </pre>
     */
    public String FFDC_NOTIFICATION_WARNING_CWOBJ8265 = "FFDC_NOTIFICATION_WARNING_CWOBJ8265";

    /**
     * <pre>
     * # {0} The name of the server
     * SIMULATED_FFDC_NOTIFICATION_CWOBJ8266=CWOBJ8266I: A simulated first-failure data capture (FFDC) exception notification was generated by the {0} server.
     * SIMULATED_FFDC_NOTIFICATION_CWOBJ8266.explanation=The checkFFDCNotification() method from the DynamicServerMBean interface ran and generated this exception for testing purposes.
     * SIMULATED_FFDC_NOTIFICATION_CWOBJ8266.useraction=No user action is required.     * </pre>
     */
    public String SIMULATED_FFDC_NOTIFICATION_CWOBJ8266 = "SIMULATED_FFDC_NOTIFICATION_CWOBJ8266";

    /**
     * <pre>
     * # {0} The name of the server
     * SIMULATED_LOG_ERROR_NOTIFICATION_CWOBJ8267=CWOBJ8267I: A simulated log error notification was generated by the {0} server.
     * SIMULATED_LOG_ERROR_NOTIFICATION_CWOBJ8267.explanation=The checkLoggingNotification() method from the DynamicServerMBean interface ran and generated this log record for testing purposes.
     * SIMULATED_LOG_ERROR_NOTIFICATION_CWOBJ8267.useraction=No user action is required.
     * </pre>
     */
    public String SIMULATED_LOG_ERROR_NOTIFICATION_CWOBJ8267 = "SIMULATED_LOG_ERROR_NOTIFICATION_CWOBJ8267";

    /**
     * <pre>
     * # {0} The name of the server
     * SIMULATED_LOG_WARNING_NOTIFICATION_CWOBJ8268=CWOBJ8268I: A simulated log warning notification was generated by the {0} server.
     * SIMULATED_LOG_WARNING_NOTIFICATION_CWOBJ8268.explanation=The checkLoggingNotification() method from the DynamicServerMBean interface ran and generated this log record for testing purposes.
     * SIMULATED_LOG_WARNING_NOTIFICATION_CWOBJ8268.useraction=No user action is required.
     * </pre>
     */
    public String SIMULATED_LOG_WARNING_NOTIFICATION_CWOBJ8268 = "SIMULATED_LOG_WARNING_NOTIFICATION_CWOBJ8268";

    /**
     * <pre>
     * # {0} The name of the server
     * SIMULATED_LOG_INFO_NOTIFICATION_CWOBJ8269=CWOBJ8269I: A simulated log information notification was generated by the {0} server.
     * SIMULATED_LOG_INFO_NOTIFICATION_CWOBJ8269.explanation=The checkLoggingNotification() method from the DynamicServerMBean interface ran and generated this log record for testing purposes.
     * SIMULATED_LOG_INFO_NOTIFICATION_CWOBJ8269.useraction=No user action is required.
     * </pre>
     */
    public String SIMULATED_LOG_INFO_NOTIFICATION_CWOBJ8269 = "SIMULATED_LOG_INFO_NOTIFICATION_CWOBJ8269";

    /**
     * <pre>
     * # {0} The name of the server
     * SIMULATED_LOG_EVENT_NOTIFICATION_CWOBJ8270=CWOBJ8270I: A simulated log event notification was generated by the {0} server.
     * SIMULATED_LOG_EVENT_NOTIFICATION_CWOBJ8270.explanation=The checkLoggingNotification() method from the DynamicServerMBean interface ran and generated this log record for testing purposes.
     * SIMULATED_LOG_EVENT_NOTIFICATION_CWOBJ8270.useraction=No user action is required.
     * </pre>
     */
    public String SIMULATED_LOG_EVENT_NOTIFICATION_CWOBJ8270 = "SIMULATED_LOG_EVENT_NOTIFICATION_CWOBJ8270";
    
    /**
     * <pre>
     * # {0} The shard
     * # {1} The container hosting the shard
     * SHARD_UNREACHABLE_NOTIFICATION_CWOBJ8271=CWOBJ8271W: The {0} shard on container {1} is unavailable.
     * SHARD_UNREACHABLE_NOTIFICATION_CWOBJ8271.explanation=The unavailable shard is not available. There might be a network disruption, or the container might have been restarted.
     * SHARD_UNREACHABLE_NOTIFICATION_CWOBJ8271.useraction=Investigate the logs for the container to determine why shard is not available.
     * </pre>
     */
    public String SHARD_UNREACHABLE_NOTIFICATION_CWOBJ8271 = "SHARD_UNREACHABLE_NOTIFICATION_CWOBJ8271";

    /**
     * <pre>
     * # {0} containers reported to be unreachable
     * CONTAINER_UNREACHABLE_CLIENT_REPORTED_NOTIFICATION_CWOBJ8272=CWOBJ8272W: The following containers have been reported as not available: {0}
     * CONTAINER_UNREACHABLE_CLIENT_REPORTED_NOTIFICATION_CWOBJ8272.explanation=A client has reported unavailable container servers to the catalog server.
     * CONTAINER_UNREACHABLE_CLIENT_REPORTED_NOTIFICATION_CWOBJ8272.useraction=Investigate the logs for the unavailable containers to determine why they were reported as not available.
     * </pre>
     */
    public String CONTAINER_UNREACHABLE_CLIENT_REPORTED_NOTIFICATION_CWOBJ8272 = "CONTAINER_UNREACHABLE_CLIENT_REPORTED_NOTIFICATION_CWOBJ8272";
    
    /**
     * <pre>
     * # {0} partition that has become available
     * PARTITION_REACHABLE_NOTIFICATION_CWOBJ8273=CWOBJ8273I: Partition {0} has become available.
     * PARTITION_REACHABLE_NOTIFICATION_CWOBJ8273.explanation=A partition has become available.
     * PARTITION_REACHABLE_NOTIFICATION_CWOBJ8273.useraction=No user action is required
     * </pre>
     */
    public String PARTITION_REACHABLE_NOTIFICATION_CWOBJ8273 = "PARTITION_REACHABLE_NOTIFICATION_CWOBJ8273";
    
    /**
     * <pre>
     * # {0} container that has been confirmed as unreachable by the catalog server
     * SERVER_UNREACHABLE_CLIENT_REPORTED_CATALOG_CONFIRMED_NOTIFICATION_CWOBJ8274=CWOBJ8274W: The catalog server has confirmed that the {0} container is not available.
     * SERVER_UNREACHABLE_CLIENT_REPORTED_CATALOG_CONFIRMED_NOTIFICATION_CWOBJ8274.explanation=A container server has been confirmed as not available by the catalog server.
     * SERVER_UNREACHABLE_CLIENT_REPORTED_CATALOG_CONFIRMED_NOTIFICATION_CWOBJ8274.useraction=Investigate the logs for the unavailable container.
     * </pre>
     */
    public String SERVER_UNREACHABLE_CLIENT_REPORTED_CATALOG_CONFIRMED_NOTIFICATION_CWOBJ8274 = "SERVER_UNREACHABLE_CLIENT_REPORTED_CATALOG_CONFIRMED_NOTIFICATION_CWOBJ8274";
    
    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid it was created for
     * # {2} name of the map it was created for
     * DYNAMIC_INDEX_CONFIGURATION_CREATED_SUCCESSFULLY_CWOBJ8300=CWOBJ8300I: The dynamic index configuration {0} was successfully stored on the catalog server for ObjectGrid {1} and map {2}.
     * DYNAMIC_INDEX_CONFIGURATION_CREATED_SUCCESSFULLY_CWOBJ8300.explanation=A client initiated the creation of a dynamic index which resulted in storing the configuration of the dynamic index on the catalog server.
     * DYNAMIC_INDEX_CONFIGURATION_CREATED_SUCCESSFULLY_CWOBJ8300.useraction=No user action is required.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_CREATED_SUCCESSFULLY_CWOBJ8300 = "DYNAMIC_INDEX_CONFIGURATION_CREATED_SUCCESSFULLY_CWOBJ8300";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to create the index for
     * # {2} name of the map to create the index for
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_ALREADY_EXISTS_CWOBJ8301=CWOBJ8301W: The request to create dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because a dynamic index configuration already exists for the index name, ObjectGrid name, and map specified.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_ALREADY_EXISTS_CWOBJ8301.explanation=The index name must be unique within the map.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_ALREADY_EXISTS_CWOBJ8301.useraction=No action is required if the existing index is sufficient.  If you would like to replace the existing index, remove the existing index first.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_ALREADY_EXISTS_CWOBJ8301 = "DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_ALREADY_EXISTS_CWOBJ8301";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to create the index for
     * # {2} name of the map to create the index for
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_OG_NOT_FOUND_CWOBJ8302=CWOBJ8302E: The request to create dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because no configuration was found for the ObjectGrid specified.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_OG_NOT_FOUND_CWOBJ8302.explanation=The ObjectGrid configuration must exist on the catalog server prior to the creation of a dynamic index configuration for that ObjectGrid.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_OG_NOT_FOUND_CWOBJ8302.useraction=Start containers with a deployment policy that includes the specified ObjectGrid and map.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_OG_NOT_FOUND_CWOBJ8302 = "DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_OG_NOT_FOUND_CWOBJ8302";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to create the index for
     * # {2} name of the map to create the index for
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_MAP_NOT_FOUND_CWOBJ8303=CWOBJ8303E: The request to create dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because no configuration was found for the map specified.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_MAP_NOT_FOUND_CWOBJ8303.explanation=The ObjectGrid configuration must exist on the catalog server prior to the creation of a dynamic index configuration for that map.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_MAP_NOT_FOUND_CWOBJ8303.useraction=Start containers with a deployment policy that includes the specified ObjectGrid and map.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_MAP_NOT_FOUND_CWOBJ8303 = "DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILURE_MAP_NOT_FOUND_CWOBJ8303";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid it was removed for
     * # {2} name of the map it was removed for
     * DYNAMIC_INDEX_CONFIGURATION_REMOVED_SUCCESSFULLY_CWOBJ8304=CWOBJ8304I: The dynamic index configuration {0} was successfully removed from the catalog server for ObjectGrid {1} and map {2}.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVED_SUCCESSFULLY_CWOBJ8304.explanation=A client initiated the removal of a dynamic index which resulted in removing the configuration of the dynamic index on the catalog server.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVED_SUCCESSFULLY_CWOBJ8304.useraction=No user action is required.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_REMOVED_SUCCESSFULLY_CWOBJ8304 = "DYNAMIC_INDEX_CONFIGURATION_REMOVED_SUCCESSFULLY_CWOBJ8304";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to remove the index for
     * # {2} name of the map to remove the index for
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_INDEX_NOT_FOUND_CWOBJ8305=CWOBJ8305W: The request to remove dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because a dynamic index configuration was not found for the index name, ObjectGrid name, and map specified.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_INDEX_NOT_FOUND_CWOBJ8305.explanation=The index name was not found for the specified ObjectGrid and map.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_INDEX_NOT_FOUND_CWOBJ8305.useraction=No action is required.
     * <pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_INDEX_NOT_FOUND_CWOBJ8305 = "DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_INDEX_NOT_FOUND_CWOBJ8305";

    /**
     * <pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to remove the index for
     * # {2} name of the map to remove the index for
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_OG_NOT_FOUND_CWOBJ8306=CWOBJ8306W: The request to remove dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because no configuration was found for the ObjectGrid specified.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_OG_NOT_FOUND_CWOBJ8306.explanation=The ObjectGrid configuration must exist on the catalog server prior to the creation or removal of a dynamic index configuration for that ObjectGrid.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_OG_NOT_FOUND_CWOBJ8306.useraction=Start containers with a deployment policy that includes the specified ObjectGrid and map.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_OG_NOT_FOUND_CWOBJ8306 = "DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_OG_NOT_FOUND_CWOBJ8306";

    /**
     * </pre>
     * # {0} name of the dynamic index
     * # {1} name of the ObjectGrid to remove the index for
     * # {2} name of the map to remove the index for
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_MAP_NOT_FOUND_CWOBJ8307=CWOBJ8307W: The request to remove dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because no configuration was found for the map specified.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_MAP_NOT_FOUND_CWOBJ8307.explanation=The ObjectGrid configuration must exist on the catalog server prior to the creation or removal of a dynamic index configuration for that map.
     * DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_MAP_NOT_FOUND_CWOBJ8307.useraction=Start containers with a deployment policy that includes the specified ObjectGrid and map.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_MAP_NOT_FOUND_CWOBJ8307 = "DYNAMIC_INDEX_CONFIGURATION_REMOVAL_FAILURE_MAP_NOT_FOUND_CWOBJ8307";

    /**
     * <pre>
     * # {0} container hosting the replica
     * # {1} partition id ObjectGrid:mapSet:partition
     * DYNAMIC_INDEX_CREATION_FAILED_ON_REPLICA_CWOBJ8308=CWOBJ8308W: The dynamic index could not be created on container {0} for the replica of partition {1}.  The WebSphere eXtreme Scale version of container {0} must be 8.6.0.2 or later.
     * DYNAMIC_INDEX_CREATION_FAILED_ON_REPLICA_CWOBJ8308.explanation=WebSphere eXtreme Scale version 8.6.0.2 or later is required to create a dynamic index on a replica.
     * DYNAMIC_INDEX_CREATION_FAILED_ON_REPLICA_CWOBJ8308.useraction=Upgrade servers in topology to WebSphere eXtreme Scale 8.6.0.2 or later if dynamic indices on replicas are a requirement.
     * </pre>
     */
    public String DYNAMIC_INDEX_CREATION_FAILED_ON_REPLICA_CWOBJ8308 = "DYNAMIC_INDEX_CREATION_FAILED_ON_REPLICA_CWOBJ8308";

    /**
     * <pre>
     * # {0} container hosting the replica
     * # {1} partition id ObjectGrid:mapSet:partition
     * DYNAMIC_INDEX_REMOVAL_FAILED_ON_REPLICA_CWOBJ8309=CWOBJ8309W: The dynamic index could not be removed from container {0} for the replica of partition {1}.  The WebSphere eXtreme Scale version of container {0} must be 8.6.0.2 or later.
     * DYNAMIC_INDEX_REMOVAL_FAILED_ON_REPLICA_CWOBJ8309.explanation=WebSphere eXtreme Scale version 8.6.0.2 or later is required to create or remove a dynamic index on a replica.
     * DYNAMIC_INDEX_REMOVAL_FAILED_ON_REPLICA_CWOBJ8309.useraction=Upgrade servers in topology to WebSphere eXtreme Scale 8.6.0.2 or later if dynamic indices on replicas are a requirement.
     * </pre>
     */
    public String DYNAMIC_INDEX_REMOVAL_FAILED_ON_REPLICA_CWOBJ8309 = "DYNAMIC_INDEX_REMOVAL_FAILED_ON_REPLICA_CWOBJ8309";

    /**
     * <pre>
     * # {0} name of dynamic index
     * # {1} name of the ObjectGrid to create the index for
     * # {2} name of the map to create the index for
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILED_CAT_DOWNLEVEL_CWOBJ8310=CWOBJ8310W: The request to create dynamic index configuration {0} for ObjectGrid {1} and map {2} failed because the WebSphere eXtreme Scale version of the catalog server does not support storing dynamic index configurations.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILED_CAT_DOWNLEVEL_CWOBJ8310.explanation=The dynamic map index will not be automatically created on new container servers.  The dynamic map index may not fail over transparently.
     * DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILED_CAT_DOWNLEVEL_CWOBJ8310.useraction=Upgrade the catalog server to WebSphere eXtreme Scale version 8.6.0.2 or later.
     * </pre>
     */
    public String DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILED_CAT_DOWNLEVEL_CWOBJ8310 = "DYNAMIC_INDEX_CONFIGURATION_CREATION_FAILED_CAT_DOWNLEVEL_CWOBJ8310";

    /**
     * <pre>  
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * HEURISTIC_COMMIT_CWOBJ8701W=CWOBJ8701W: Transaction {0} was heuristically committed at {1}.
     * HEURISTIC_COMMIT_CWOBJ8701W.explanation=Since the transaction was manually resolved, you might experience data integrity problems. For example, when you manually commit the transaction in a partition, another partition might have rolled-back at that time. This means that the transaction is inconsistent and you might encounter data integrity problems. Use extreme caution before attempting to resolve transactions manually.
     * HEURISTIC_COMMIT_CWOBJ8701W.useraction=No action required.
     * </pre>
     */
    public String HEURISTIC_COMMIT_CWOBJ8701W = "HEURISTIC_COMMIT_CWOBJ8701W";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * HEURISTIC_ROLLBACK_CWOBJ8702W=CWOBJ8702W: Transaction {0} was heuristically rolled back at {1}
     * HEURISTIC_ROLLBACK_CWOBJ8702W.explanation=Since the transaction was manually resolved, you might experience data integrity problems. For example, when you manually commit the transaction in a partition, another partition might have rolled-back at that time. This means that the transaction is inconsistent and you might encounter data integrity problems. Use extreme caution before attempting to resolve transactions manually.
     * HEURISTIC_ROLLBACK_CWOBJ8702W.useraction=No action required.
     * </pre>
     */
    public String HEURISTIC_ROLLBACK_CWOBJ8702W = "HEURISTIC_ROLLBACK_CWOBJ8702W";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * HEURISTIC_FORGET_CWOBJ8703W=CWOBJ8703W: Transaction {0} was heuristically forgotten at {1}
     * HEURISTIC_FORGET_CWOBJ8703W.explanation=Since the transaction was manually resolved, you might experience data integrity problems. For example, when you manually commit the transaction in a partition, another partition might have rolled-back at that time. This means that the transaction is inconsistent and you might encounter data integrity problems. Use extreme caution before attempting to resolve transactions manually. 
     * HEURISTIC_FORGET_CWOBJ8703W.useraction=No action required.
     * </pre>
     */
    public String HEURISTIC_FORGET_CWOBJ8703W = "HEURISTIC_FORGET_CWOBJ8703W";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * # {2} transaction decision (commit or rollback)
     * RESYNC_CWOBJ8704I=CWOBJ8704I: Automatic resolution of transaction {0} at {1} resulted in {2} 
     * RESYNC_CWOBJ8704I.explanation=The multi-partition transaction was automatically recovered.
     * RESYNC_CWOBJ8704I.useraction=No action required.
     * </pre>
     */
    public String RESYNC_RESOLVED_CWOBJ8704I = "RESYNC_RESOLVED_CWOBJ8704I";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * # {2} seconds
     * RESYNC_INDOUBT_CWOBJ8705I=CWOBJ8705I: Automatic resolution of transaction {0} at {1} is still waiting for a decision. Another attempt to resolve the transaction will occur in {2} seconds.
     * RESYNC_INDOUBT_CWOBJ8705I.explanation=The multi-partition transaction is waiting for a decision to commit or rollback.
     * RESYNC_INDOUBT_CWOBJ8705I.useraction=No action required.
     * </pre>
     */
    public String RESYNC_INDOUBT_CWOBJ8705I = "RESYNC_INDOUBT_CWOBJ8705I";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id (objectgridName:mapSetName:partitionID)
     * # {2} committed or rolled back
     * # {3} shard id 2 (objectgridName:mapSetName:partitionID)
     * # {4} committed or rolledback 
     * RESYNC_DAMAGE_CWOBJ8706E=CWOBJ8706E: Automatic resolution of transaction {0} at {1} shows heuristic damage. {1} {2} while {3} {4}.
     * RESYNC_DAMAGE_CWOBJ8706E.explanation=The multi-partition transaction shows heuristic damage. The TM partition decision was to commit the transaction but the RM partition was rolled back. Or the TM partition decision was to rollback but the RM partition committed. This means that the transaction is inconsistent and you might encounter data integrity problems.
     * RESYNC_DAMAGE_CWOBJ8706E.useraction=Contact IBM Software Support.
     * </pre>
     */
    public String RESYNC_DAMAGE_CWOBJ8706E = "RESYNC_DAMAGE_CWOBJ8706E";

    /**
     * <pre>
     * # {0} Transaction ID
     * # {1} shard id 
     * # {2} exception message
     * RESYNC_CLIENT_CWOBJ8707I=CWOBJ8707I: Transaction {0} to be committed on resynchronization. Failure to commit {1} during the second phase of the two-phase protocol: {2} 
     * RESYNC_CLIENT_CWOBJ8707I.explanation=A failure occurred during the second phase of the two-phase commit protocol. Automatic resynchronization to commit the transaction. 
     * RESYNC_CLIENT_CWOBJ8707I.useraction=No action required.
     * </pre>
     */
    public String RESYNC_CLIENT_CWOBJ8707I = "RESYNC_CLIENT_CWOBJ8707I";

    /**
     * <pre>     
    * # {0} Database directory
    * # {1} Process identifier
    * # {2} Current code stack
    * DATA_CORRUPTION_CWOBJ7900E=CWOBJ7900E: Possible database corruption due to exception, deleting database {0} and shutting down PID {1}.  See derby.log for cause. Callstack: {2}
    * DATA_CORRUPTION_CWOBJ7900E.explanation=An error was encountered opening on the system configuration databases, the database will be recreated.  Some configuration settings may be lost. 
    * DATA_CORRUPTION_CWOBJ7900E.useraction=No action required.
    * </pre>
     */
    public String DATA_CORRUPTION_CWOBJ7900E = "DATA_CORRUPTION_CWOBJ7900E";

    /** <pre>
     * # {0} Number of attempts
     * # {1} Exception/Callstack
     * GIVING_UP_ATTEMPT_TO_WRITE_TO_DISK_CWOBJ7901E=CWOBJ7901E: Giving up attempt to write to disk, tried {0} times: Exception: {1}
     * GIVING_UP_ATTEMPT_TO_WRITE_TO_DISK_CWOBJ7901E.explanation=An error was encountered writing to disk, and retrying didn't work.
     * GIVING_UP_ATTEMPT_TO_WRITE_TO_DISK_CWOBJ7901E.useraction=No action required.
     * </pre>
     */
    public String GIVING_UP_ATTEMPT_TO_WRITE_TO_DISK_CWOBJ7901E = "GIVING_UP_ATTEMPT_TO_WRITE_TO_DISK_CWOBJ7901E";

    /** <pre>
     * # {0} Number of attempts
     * # {1} Exception/Callstack
     * GIVING_UP_ATTEMPT_TO_READ_FROM_DISK_CWOBJ7902E=CWOBJ7902E: Giving up attempt to read from disk, tried {0} times: Exception: {1}
     * GIVING_UP_ATTEMPT_TO_READ_FROM_DISK_CWOBJ7902E.explanation=An error was encountered reading from disk, and retrying didn't work.
     * GIVING_UP_ATTEMPT_TO_READ_FROM_DISK_CWOBJ7902E.useraction=No action required.
     * </pre>
     */
    public String GIVING_UP_ATTEMPT_TO_READ_FROM_DISK_CWOBJ7902E = "GIVING_UP_ATTEMPT_TO_READ_FROM_DISK_CWOBJ7902E";

    /** <pre>
     * # {0} Component name
     * # {1} Exception/Callstack
     * PROBLEM_INITIALIZING_NOF_SUBCOMPONENT_CWOBJ7903E=CWOBJ7903E: Problem initializing NOF sub-component {0}: Exception: {1}
     * PROBLEM_INITIALIZING_NOF_SUBCOMPONENT_CWOBJ7903E.explanation=Problem initializing sub-component
     * PROBLEM_INITIALIZING_NOF_SUBCOMPONENT_CWOBJ7903E.useraction=No action required.
     * </pre>
     */
    public String PROBLEM_INITIALIZING_NOF_SUBCOMPONENT_CWOBJ7903E = "PROBLEM_INITIALIZING_NOF_SUBCOMPONENT_CWOBJ7903E";

    /** <pre>
     * # {0} InterruptedException message
     * IGNORING_INTERRUPTED_EXCEPTION_CWOBJ7904W=CWOBJ7904W: Ignoring the java.lang.InterruptedException: {0}
     * IGNORING_INTERRUPTED_EXCEPTION_CWOBJ7904W.explanation=Ignoring the java.lang.InterruptedException that occurred.
     * IGNORING_INTERRUPTED_EXCEPTION_CWOBJ7904W.useraction=No action required
     * </pre>
     */
    public String IGNORING_INTERRUPTED_EXCEPTION_CWOBJ7904W = "IGNORING_INTERRUPTED_EXCEPTION_CWOBJ7904W";

    /** <pre>
     * # {0} Exception
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7905E=CWOBJ7905E: Problem writing to disk (see FFDC for details): {0}
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7905E.explanation=Problem writing to disk
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7905E.useraction=No action required
     * </pre>
     */
    public String PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7905E = "PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7905E";

    /** <pre>
     * # {0} Required bytes
     * # {1} Actual bytes
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7906E=CWOBJ7906E: Problem reading data from disk: expected {0} bytes, read {1} (see FFDC for details)
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7906E.explanation=Problem reading data from to disk
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7906E.useraction=No action required
     * </pre>
     */
    public String PROBLEM_READING_DATA_FROM_DISK_CWOBJ7906E = "PROBLEM_READING_DATA_FROM_DISK_CWOBJ7906E";

    /** <pre> # {0} Exception
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7907E=CWOBJ7907E: Problem reading data from disk: (see FFDC for details): {0}
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7907E.explanation=Problem reading datafrom to disk
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7907E.useraction=No action required
     * </pre>
     */
    public String PROBLEM_READING_DATA_FROM_DISK_CWOBJ7907E = "PROBLEM_READING_DATA_FROM_DISK_CWOBJ7907E";

    /** <pre>
     * RETRYING_IO_OPERATION_CWOBJ7908W=CWOBJ7908W: Retrying I/O operation
     * RETRYING_IO_OPERATION_CWOBJ7908W.explanation=Retrying I/O operation
     * RETRYING_IO_OPERATION_CWOBJ7908W.useraction=No action required
     * </pre>
     */
    public String RETRYING_IO_OPERATION_CWOBJ7908W = "RETRYING_IO_OPERATION_CWOBJ7908W";

    /** <pre>
     * # {0} position
     * # {1} next chunk offset
     * # {2} next chunk size
     * # {3} Exception
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7909W=CWOBJ7909W: Problem writing data to disk (position={0}, next-chunk-offset={1}, next-chunk-size={2}
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7909W.explanation=Problem writing data to disk
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7909W.useraction=No action required
     * </pre>
     */
    public String PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7909W = "PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7909W";

    /** <pre>
     * # {0} position
     * # {1} length
     * # {2} real length
     * # {3} Exception
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7910W=CWOBJ7910W: Problem reading data from disk (position={0}, length={1}, real-length={2}): {3}
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7910W.explanation=Problem reading data from disk
     * PROBLEM_READING_DATA_FROM_DISK_CWOBJ7910W.useraction=No action required
     * </pre>
     */
    public String PROBLEM_READING_DATA_FROM_DISK_CWOBJ7910W = "PROBLEM_READING_DATA_FROM_DISK_CWOBJ7910W";

    /** <pre>
     * # {0} offset
     * # {1} length
     * # {2} position
     * # {3} next-chunk-offset
     * # {4} next-chunk-size
     * # {5} Exception
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7911W=CWOBJ7911W: Problem writing data to disk (offset={0}, length={1}, position={2}, next-chunk-offset={3}, next-chunk-size): {4}: {5}
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7911W.explanation=Problem writing data to disk
     * PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7911W.useraction=No action required
     * </pre>
     */
    public String PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7911W = "PROBLEM_WRITING_DATA_TO_DISK_CWOBJ7911W";

    /** <pre>
     * # {0} unit index
     * # {1} slab node
     * COMPACTION_FAILURE_CWOBJ7912W=CWOBJ7912W: Compaction on single-slab file failed for unit index {0}, slab node {1}
     * COMPACTION_FAILURE_CWOBJ7912W.explanation=Data on disk could not be compacted to free space.
     * COMPACTION_FAILURE_CWOBJ7912W.useraction=No action required
     * </pre>
     */
    public String COMPACTION_FAILURE_CWOBJ7912W = "COMPACTION_FAILURE_CWOBJ7912W";

    /** <pre>
     * # {0} slab size
     * # {1} available space
     * # {2} allow reserve flag
     * OUT_OF_DISKSPACE_CWOBJ7913W=CWOBJ7913W: Unable to allocate disk space for disk overflow because needed space {0} is greater than available space {1}, allowReserve={2}.
     * OUT_OF_DISKSPACE_CWOBJ7913W.explanation=Due to minimum disk space settings, disk space cannot be allocated.  Insertion of new data will be rejected.
     * OUT_OF_DISKSPACE_CWOBJ7913W.useraction=Decrease the minimum disk space requirement or remove data from the grid.
     * </pre>
     */
    public String OUT_OF_DISKSPACE_CWOBJ7913W = "OUT_OF_DISKSPACE_CWOBJ7913W";

    /** <pre>
     * # {0} current usage
     * # {1} maximum allowed usage
     * # {2} allow reserve flag
     * OUT_OF_DISKSPACE_CAP_CWOBJ7914W=CWOBJ7914W: Unable to allocate disk space for disk overflow because the current disk usage is {0} and the disk cap is {1}, allowReserve={2}.
     * OUT_OF_DISKSPACE_CAP_CWOBJ7914W.explanation=Due to maximum disk usage settings, disk space cannot be allocated.  Insertion of new data will be rejected.
     * OUT_OF_DISKSPACE_CAP_CWOBJ7914W.useraction=Increase the maximum disk usage limit or remove data from the grid.
     * </pre>
     */
    public String OUT_OF_DISKSPACE_CAP_CWOBJ7914W = "OUT_OF_DISKSPACE_CAP_CWOBJ7914W";

    /** <pre>
     * # {0} max bytes primary
     * # {1} max bytes reserved
     * MAX_DISK_BYTES_SET_CWOBJ7915I=CWOBJ7915I: Maximum disk space usage set to {0} bytes with a reserved limit of {1} bytes.
     * MAX_DISK_BYTES_SET_CWOBJ7915I.explanation=The amount of disk space that can be used by this process has been limited to the indicated values.
     * MAX_DISK_BYTES_SET_CWOBJ7915I.useraction=No action required
     * </pre>
     */
    public String MAX_DISK_BYTES_SET_CWOBJ7915I = "MAX_DISK_BYTES_SET_CWOBJ7915I";

    /** <pre>
     * # {0} min free bytes primary
     * # {1} min free bytes reserved
     * MIN_FREE_DISK_BYTES_SET_CWOBJ7916I=CWOBJ7916I: Minimum free disk space required set to {0} bytes with a reserved limit of {1} bytes.
     * MIN_FREE_BYTES_SET_CWOBJ7916I.explanation=The minimum amount of disk space will be maintained has been limited to the indicated values.
     * MIN_FREE_BYTES_SET_CWOBJ7916I.useraction=No action required
     * </pre>
     */
    public String MIN_FREE_BYTES_SET_CWOBJ7916I = "MIN_FREE_BYTES_SET_CWOBJ7916I";

    /** <pre>
     * # {0} entries checked
     * # {1} total entries
     * # {2} time spent
     * HARDCAP_FAILURE_CWOBJ7917W=CWOBJ7917W: The hard cap memory daemon failed to evict sufficient entries after checking {0} entries out of {1} total entries in {2} ms.
     * HARDCAP_FAILURE_CWOBJ7917W.explanation=The system could not evict sufficient entries from memory to disk.  Insertion operations will be rejected.
     * HARDCAP_FAILURE_CWOBJ7917W.useraction=Confirm that the system has not run out of disk space.
     * </pre>
     */
    public String HARDCAP_FAILURE_CWOBJ7917W = "HARDCAP_FAILURE_CWOBJ7917W";

    /** <pre>
     * # {0} storage directory
     * # {1} max memory bytes
     * # {2} max disk bytes
     * # {3} min free disk bytes
     * OVERFLOW_CONFIG_DATA_CWOBJ7918I=CWOBJ7918I: Disk overflow has been configured to store data in directory {0} with a memory cache size of {1} bytes, maximum disk usage of {2} bytes, and a minimum free disk size of {3} bytes. 
     * OVERFLOW_CONFIG_DATA_CWOBJ7918I.explanation=If the data grid size exceeds the memory cache, it will overflow into the specified disk directory.
     * OVERFLOW_CONFIG_DATA_CWOBJ7918I.useraction=No action required.
     * </pre>
     */
    public String OVERFLOW_CONFIG_DATA_CWOBJ7918I = "OVERFLOW_CONFIG_DATA_CWOBJ7918I";

    /** <pre>
     * # {0} mapset name
     * # {1} cap in bytes
     * GRID_CAP_SET_CWOBJ7919I=CWOBJ7919I: The cap on mapset {0} has been set to {1} bytes. 
     * GRID_CAP_SET_CWOBJ7919I.explanation=A user configured limit has been placed on the maximum size of this grid.  Inserts beyond this limit will be rejected. 
     * GRID_CAP_SET_CWOBJ7919I.useraction=No action required.
     * </pre>
     */
    public String GRID_CAP_SET_CWOBJ7919I = "GRID_CAP_SET_CWOBJ7919I";

    
    /** <pre>
     * # {0} property name
     * OVERFLOW_STORAGE_PATH_CWOBJ7925=CWOBJ7925E: The configured storage path for disk overflow is not a valid directory {0}
     * OVERFLOW_STORAGE_PATH_CWOBJ7925.explanation=A user configured the disk storage path property of disk overflow feature to point to an existing file.
     * OVERFLOW_STORAGE_PATH_CWOBJ7925.useraction=Modify disk storage path to be a valid directory, not file.
     * </pre>
     */
    public String OVERFLOW_STORAGE_PATH_CWOBJ7925 = "OVERFLOW_STORAGE_PATH_CWOBJ7925";

  
    /** <pre>
     * # {0} directory name
     * OVERFLOW_STORAGE_IOEXCEPTION_CWOBJ7926=CWOBJ7926E: Exception occurred while accessing the following directory for disk overflow  {0}
     * OVERFLOW_STORAGE_IOEXCEPTION_CWOBJ7926.explanation=There was a problem accessing the specified directory for disk overflow.
     * OVERFLOW_STORAGE_IOEXCEPTION_CWOBJ7926.useraction=Ensure the provided directory is accessible.
     */
    public String OVERFLOW_STORAGE_IOEXCEPTION_CWOBJ7926 = "OVERFLOW_STORAGE_IOEXCEPTION_CWOBJ7926";

    /**
     * # {0} seconds elapsed
     * OVERFLOW_EVICTION_FAIL_AFTER_RETRY_CWOBJ7927=CWOBJ7927W: The eXtremeMemory native overflow HardCapController failed to evict sufficient entries after checking for {0} seconds 
     * OVERFLOW_EVICTION_FAIL_AFTER_RETRY_CWOBJ7927.explanation=An internal error occurred while attempting to overflowing entries to disk. The eXtremeMemory native overflow library will retry eviction at the next scheduled interval.   
     * OVERFLOW_EVICTION_FAIL_AFTER_RETRY_CWOBJ7927.useraction=No action required.
     */
    public String OVERFLOW_EVICTION_FAIL_AFTER_RETRY_CWOBJ7927 = "OVERFLOW_EVICTION_FAIL_AFTER_RETRY_CWOBJ7927";

    /* 7928-7931 used by native */

    /**
     * # {0} seconds elapsed
     * OVERFLOW_EVICTION_WRITE_EXCESSIVE_TIME_CWOBJ7933=CWOBJ7933W: The overflow component spent {0} seconds writing an entry to disk.  The I/O system may be overloaded. 
     * OVERFLOW_EVICTION_WRITE_EXCESSIVE_TIME_CWOBJ7933.explanation=A write to disk took an excessive amount of time.  This may cause performance problems.   
     * OVERFLOW_EVICTION_WRITE_EXCESSIVE_TIME_CWOBJ7933.useraction=Increase the performance capacity of the disk component via RAID or replacement of a traditional disk with an Solid State Disk. 
     */
    public String OVERFLOW_EVICTION_WRITE_EXCESSIVE_TIME_CWOBJ7933 = "OVERFLOW_EVICTION_WRITE_EXCESSIVE_TIME_CWOBJ7933";

//    /* ====================== 7950-7975 used by Geo/Location Data Services ====================== */
//    /**
//     * GEO_CONFIG_INJECTION_GRID_ENABLED_CWOBJ7950=CWOBJ7950I: ObjectGrid "{0}" is enabled for storing geographic and location data on container "{1}".
//     * GEO_CONFIG_INJECTION_GRID_ENABLED_CWOBJ7950.explanation=ObjectGrid is enabled to track and store geographic and location data within the grid for location based services.
//     * GEO_CONFIG_INJECTION_GRID_ENABLED_CWOBJ7950.useraction=No action is required.
//     */
//    public String GEO_CONFIG_INJECTION_GRID_ENABLED_CWOBJ7950 = "GEO_CONFIG_INJECTION_GRID_ENABLED_CWOBJ7950";
//                    
//    /**
//     * GEO_CONFIG_INJECTION_MAP_ENABLED_CWOBJ7951=CWOBJ7951I: ObjectGrid:MapSet:Map {0}:{1}:{2} is automatically enabled for storing and indexing geographic and location based entries on container "{3}".
//     * GEO_CONFIG_INJECTION_MAP_ENABLED_CWOBJ7951.explanation=The map identified by the fully qualified map name is enabled for storing and indexing geographic and locacation based entries. Built-in indexes have been added to this map.
//     * GEO_CONFIG_INJECTION_MAP_ENABLED_CWOBJ7951.useraction=No action is required.                     
//     */
//    public String GEO_CONFIG_INJECTION_MAP_ENABLED_CWOBJ7951 = "GEO_CONFIG_INJECTION_MAP_ENABLED_CWOBJ7951";
//
//    /**
//     * GEO_CONFIG_INJECTION_FACTORY_FAILED_CWOBJ7952=CWOBJ7952E: An unexpected error "{0}" occurred while enabling geographic and location based services. Geographic and location based services will not be available.
//     * GEO_CONFIG_INJECTION_FACTORY_FAILED_CWOBJ7952.explanation=An unexpected error prevented the initialization of geographic and location based services. Location based services will not be available, because an exception occurred, but the runtime environment ignores the exception and will continue to work for other features.
//     * GEO_CONFIG_INJECTION_FACTORY_FAILED_CWOBJ7952.useraction=Review the exception provided for any configuration errors. Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs. See the Logs and Trace section in the information center for JVM log location.
//     */
//    public String GEO_CONFIG_INJECTION_FACTORY_FAILED_CWOBJ7952 = "GEO_CONFIG_INJECTION_FACTORY_FAILED_CWOBJ7952";
//    
//    /**
//     * GEO_UNEXPECTED_EXCEPTION_CWOBJ2953=CWOBJ7953E: An enexpected error "{0}" occured while processing a geographic and location based services request. The request failed.
//     * GEO_UNEXPECTED_EXCEPTION_CWOBJ2953.explanation=An unexpected error prevented the completion of a geographic and location based services request. The request was not completed due to the error.
//     * GEO_UNEXPECTED_EXCEPTION_CWOBJ2953.useraction=Review the exception provided for any configuration errors. Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs. See the Logs and Trace section in the information center for JVM log location. If appropriate, resubmit the request, alternatively disconnect and reconnect the client and reattempt the request. 
//     */
//    public String GEO_UNEXPECTED_EXCEPTION_CWOBJ2953 = "GEO_UNEXPECTED_EXCEPTION_CWOBJ2953";
//    
//    /**
//     * GEO_UNEXPECTED_PROPERTIES_CWOBJ2954=CWOBJ7954W: A geographic and location based services object of type "{0}" had an unexpected configuration error "{1}" for properties "{2}" with values "{3}". The behavior of the object or its use may not be as expected.
//     * GEO_UNEXPECTED_PROPERTIES_CWOBJ2954.explanation=The runtime detected a property configuration on an object that may indicate that the object or the geographic and location data services API may be being used incorrectly. The behavior of requests using this object may be unexpected.
//     * GEO_UNEXPECTED_PROPERTIES_CWOBJ2954.useraction=Review the exception provided for any configuration errors. Look for any additional errors in the log. Also review the first failure data capture (FFDC) logs. See the Logs and Trace section in the information center for JVM log location. If appropriate, make modifications to the way that the location data services APIs are used or reconfigure the object properties.
//     */
//    public String GEO_UNEXPECTED_PROPERTIES_CWOBJ2954 = "GEO_UNEXPECTED_PROPERTIES_CWOBJ2954";
    
    /**
     * <pre>
     * # {0} One Parameter
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9000=CWOBJ9000I: This message is an English-only Informational message: {0}.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9000.explanation=This informational message is not translated.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9000.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9000 = "ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9000";

    /**
     * <pre>
     * # {0} One Parameter
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9001=CWOBJ9001W: This message is an English-only Warning message: {0}.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9001.explanation=This warning message is not translated.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9001.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9001 = "ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9001";

    /**
     * <pre>
     * # {0} One Parameter
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9002=CWOBJ9002E: This message is an English only Error message: {0}.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9002.explanation=This error message is not translated.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9002.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9002 = "ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9002";

    /**
     * <pre>
     * # {0} One Parameter
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9003=CWOBJ9003F: This message is an English only Failure message: {0}.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9003.explanation=This failure message is not translated.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9003.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9003 = "ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9003";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9010=CWOBJ9010I: This message is an English-only Informational message: {0}, {1}.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9010.explanation=This informational message is not translated.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9010.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9010 = "ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9010";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9011=CWOBJ9011W: This message is an English-only Warning message: {0}, {1}.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9011.explanation=This warning message is not translated.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9011.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9011 = "ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9011";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9012=CWOBJ9012E: This message is an English only Error message: {0}, {1}.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9012.explanation=This error message is not translated.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9012.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9012 = "ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9012";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9013=CWOBJ9013F: This message is an English only Failure message: {0}, {1}.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9013.explanation=This failure message is not translated.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9013.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9013 = "ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9013";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * # {2} Three Parameter
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9020=CWOBJ9020I: This message is an English-only Informational message: {0}, {1}, {2}.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9020.explanation=This informational message is not translated.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9020.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9020 = "ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9020";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * # {2} Three Parameter
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9021=CWOBJ9021W: This message is an English-only Warning message: {0}, {1}, {2}.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9021.explanation=This warning message is not translated.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9021.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9021 = "ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9021";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * # {2} Three Parameter
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9022=CWOBJ9022E: This message is an English only Error message: {0}, {1}, {2}.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9022.explanation=This error message is not translated.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9022.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9022 = "ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9022";

    /**
     * <pre>
     * # {0} One Parameter
     * # {1} Two Parameter
     * # {2} Three Parameter
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9023=CWOBJ9023F: This message is an English only Failure message: {0}, {1}, {2}.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9023.explanation=This failure message is not translated.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9023.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9023 = "ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9023";

    /**
     * <pre>
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9040=CWOBJ9040I: This message is an English-only Informational message: .
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9040.explanation=This informational message is not translated.
     * ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9040.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9040 = "ENGLISH_ONLY_INFO_MESSAGE_CWOBJ9040";

    /**
     * <pre>
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9041=CWOBJ9041W: This message is an English-only Warning message: .
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9041.explanation=This warning message is not translated.
     * ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9041.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9041 = "ENGLISH_ONLY_WARN_MESSAGE_CWOBJ9041";

    /**
     * <pre>
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9042=CWOBJ9042E: This message is an English only Error message: .
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9042.explanation=This error message is not translated.
     * ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9042.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9042 = "ENGLISH_ONLY_ERROR_MESSAGE_CWOBJ9042";

    /**
     * <pre>
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9043=CWOBJ9043F: This message is an English only Failure message: .
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9043.explanation=This failure message is not translated.
     * ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9043.useraction=See message for details.
     * </pre>
     */
    public String ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9043 = "ENGLISH_ONLY_FAILURE_MESSAGE_CWOBJ9043";

    /**
     * <pre>
     * IGNORE_CREDENTIAL_GENERATOR_PROPS_CWOB9044W=CWOB9044W: The credentialGeneratorProps setting is ignored since the credentialGeneratorAssemblyName value is not provided.
     * IGNORE_CREDENTIAL_GENERATOR_PROPS_CWOB9044W.explanation= The credentialGeneratorProps setting is only used if the credentialGeneratorAssemblyName value is provided.
     * IGNORE_CREDENTIAL_GENERATOR_PROPS_CWOB9044W.useraction=Set the credentialGeneratorAssemblyName if you plan to customize the credential generator.
     * </pre>
     */
    public String IGNORE_CREDENTIAL_GENERATOR_PROPS_CWOBJ9044W = "IGNORE_CREDENTIAL_GENERATOR_PROPS_CWOBJ9044W";

    /**
     * <pre>
     * # {0} Container
     * # Defect 10359 : Translate and add messageIDs for Tr info, warning, and error messages
     * NO_CONTAINER_XIO_REF_FOUND_CWOBJ9045=CWOBJ9045W: The reference for container server {0} was not found while sending placement work
     * NO_CONTAINER_XIO_REF_FOUND_CWOBJ9045.explanation=A container server stopped or failed while the catalog service was planning placement of shards and executing work on the container servers. The placement of shards chosen for the listed container name will be distributed to other container servers.
     * NO_CONTAINER_XIO_REF_FOUND_CWOBJ9045.useraction=No action is required.
     * </pre>
     */
    public String NO_CONTAINER_XIO_REF_FOUND_CWOBJ9045 = "NO_CONTAINER_XIO_REF_FOUND_CWOBJ9045";

    public String CONVERTING_ASSOCIATIONTYPE_UNKNOWN_ASSOCIATIONTYPE_CWOBJ9047 = "CONVERTING_ASSOCIATIONTYPE_UNKNOWN_ASSOCIATIONTYPE_CWOBJ9047";

    public String CONVERTING_ASSOCIATIONTYPE_UNKNOWN_FETCHTYPE_CWOBJ9048 = "CONVERTING_ASSOCIATIONTYPE_UNKNOWN_FETCHTYPE_CWOBJ9048";

    public String CONVERTING_ACCESSTYPE_UNKNOWN_ACCESSTYPE_CWOBJ9049 = "CONVERTING_ACCESSTYPE_UNKNOWN_ACCESSTYPE_CWOBJ9049";

    public String CONVERTING_DBUPDATEMODE_UNKNOWN_DBUPDATEMODE_CWOBJ9050 = "CONVERTING_DBUPDATEMODE_UNKNOWN_DBUPDATEMODE_CWOBJ9050";

    public String CONVERTING_CUSTOM_PROPERTIES_KEY_NOT_A_STRING_CWOBJ9051 = "CONVERTING_CUSTOM_PROPERTIES_KEY_NOT_A_STRING_CWOBJ9051";

    public String CONVERTING_CUSTOM_PROPERTIES_VALUE_NOT_A_STRING_CWOBJ9052 = "CONVERTING_CUSTOM_PROPERTIES_VALUE_NOT_A_STRING_CWOBJ9052";

    public String XS_TRANSPORT_SERVICE_STOPPING_EXCEPTION_CWOBJ9053 = "XS_TRANSPORT_SERVICE_STOPPING_EXCEPTION_CWOBJ9053";

    public String XIO_ENDPOINTID_CWOBJ9054I = "XIO_ENDPOINTID_CWOBJ9054I";

    public String XIO_TP_ERROR_CWOBJ9055I = "XIO_TP_ERROR_CWOBJ9055I";

    public String XIO_SPAWN_THREAD_CWOBJ9056W = "XIO_SPAWN_THREAD_CWOBJ9056W";
    
    public String XIO_OUTBOUND_CONN_COMP_CWOBJ9057I = "XIO_OUTBOUND_CONN_COMP_CWOBJ9057I";
    
    public String XIO_INBOUND_CONN_READY_CWOBJ9058I = "XIO_INBOUND_CONN_READY_CWOBJ9058I";

    public String XIO_CLIENT_HANDSHAKE_COMP_CWOBJ9059I = "XIO_CLIENT_HANDSHAKE_COMP_CWOBJ9059I";
    
    public String XIO_SVR_HANDSHAKE_COMP_CWOBJ9060I = "XIO_SVR_HANDSHAKE_COMP_CWOBJ9060I";

    // **READ ME**: Add new messages in numerical order, not at the end of this file.

}
