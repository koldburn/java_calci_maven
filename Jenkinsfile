pipeline {
  agent any
  stages {
    stage('Fluffy Build') {
      steps {
        sh 'mvn package'
      }
    }

    stage('Fluffy Test') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('Fluffy Deploy') {
      steps {
        echo 'This is deploy stage'
      }
    }

  }
}