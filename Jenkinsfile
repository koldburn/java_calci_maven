pipeline {
  agent any
  stages {
    stage('Buzz Build') {
      steps {
        sh '''chmod +x ./build.sh
./build.sh'''
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
      }
    }

    stage('') {
      steps {
        echo 'this is test step'
      }
    }

  }
}