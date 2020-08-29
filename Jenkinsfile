pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''chmod +x ./test_build.sh
./test_build.sh'''
      }
    }

    stage('archive') {
      steps {
        archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
      }
    }

  }
}