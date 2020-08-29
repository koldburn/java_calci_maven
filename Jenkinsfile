pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''echo I am $HERO
chmod +x ./test_build.sh
./test_build.sh'''
      }
    }

    stage('junit-test') {
      steps {
        junit '*/surefire-reports/*.xml'
      }
    }

  }
  environment {
    HERO = 'Batman'
  }
}