def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    emailext subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'", body: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]': Check console output at '${env.BUILD_URL}' ", to: '$DEFAULT_RECIPIENTS'
  }
  else if( buildResult == "FAILURE" ) { 
    emailext subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'", body: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]': Check console output at '${env.BUILD_URL}' ", to: '$DEFAULT_RECIPIENTS'
    }
}
