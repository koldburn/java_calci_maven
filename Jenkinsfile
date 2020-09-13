pipeline {
  agent any
  stages {
    stage('Buzz Build') {
      steps {
        sh '''chmod +x ./build.sh
./build.sh'''
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
        sh 'echo "batman is from ${city}"'
      }
    }

    stage('Buzz Test') {
      steps {
        echo 'this is test step'
        junit '*/surefire-reports/*.xml'
      }
    }

  }
  environment {
    city = 'gautham'
  }
}