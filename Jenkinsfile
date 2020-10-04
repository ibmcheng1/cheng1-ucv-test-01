parameters([
    string(name: 'buildNumber', description: 'The version of the application to deploy.')
])

node {
    def VELOCITY_TENANT_ID="5ade13625558f2c6688d15ce"
    
    //Retrieve ENV ID values for DEV and QA from "Download attributes from API" json file
    def VELOCITY_ENV_ID_DEV="c4d4f656-7c9a-4572-a65e-a8e8691441ef"
    def VELOCITY_ENV_NAME_DEV="DEV"    

    //VELOCITY_APP_NAME must match your Velocity pipeline application name
    def VELOCITY_APP_NAME="cheng1-ucd-01"
    
    // UCD properties
	def ucdApp           = 'cheng1-ucd-01'
	def ucdComp          = 'cheng1-samplescriptsrepo'
	def compVer          = 'compVer' + new Date().format("yyyyMMddHHmm")
	def IMAGE_TAG        = ''
			
	def siteName        = 'UC Deploy Dev'
			
	def appName         = 'cheng1-ucd-01'
	def staging         = 'STAGING'
	def createSnap      = '00-Create Snapshot'			
	def comp01          = ''					
	def snapshotName    = ''	
		
	//env['comp01']          = 'FZM-LakeHouse-cfg:2.0'
	//env['comp02']          = 'FZM-LakeHouse-src:3.1'	
	//env['snapshotName']    = 'JT-' + new Date().format("yyyy.MM.dd.HHmmss")
						 
    //Do not change below this line.
    def GIT_COMMIT
        
    stage ('Git') {
		checkout scm
		GIT_COMMIT = sh(script: 'git rev-parse HEAD', returnStdout: true).trim()		
		
		echo "Stage-git: GIT_COMMIT=${GIT_COMMIT}"
		echo "WORKSPACE: ${WORKSPACE}"	
		sh """
		   pwd
		   ls -lat		   
	    """
    }
    
    stage ('Set Properties') {
         //currentBuild.displayName = "1.1.1.${BUILD_NUMBER}"
         currentBuild.displayName = "${buildNumber}"
         snapshotName    = "${currentBuild.displayName}"	
    }
  		          	
	stage ("Build") {
        echo "Building ${VELOCITY_APP_NAME} (versionName:${currentBuild.displayName}, GIT_COMMIT:${GIT_COMMIT})"	    
 	    echo "VELOCITY_TENANT_ID: ${VELOCITY_TENANT_ID}"
        echo "revision: ${GIT_COMMIT}"
        echo "appName: ${VELOCITY_APP_NAME}"
        echo "versionName: ${currentBuild.displayName}"
        step($class: 'UploadBuild', 
           tenantId: "${VELOCITY_TENANT_ID}",
           revision: "${GIT_COMMIT}",
           appName: "${VELOCITY_APP_NAME}",
           versionName:"${currentBuild.displayName}",
           requestor: "admin", id: "${currentBuild.displayName}"
        )
    }
    
}
