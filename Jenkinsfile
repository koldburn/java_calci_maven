pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''chmod +x ./test_build.sh
./test_build.sh'''
      }
    }

    stage('test') {
      steps {
        junit 'target/surefire-reports/*.xml'
      }
    }

  }
}