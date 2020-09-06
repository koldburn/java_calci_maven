pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('junit') {
      steps {
        junit '**/surefire-reports/*.xml'
      }
    }

  }
}