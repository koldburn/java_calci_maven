pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh '''echo I am $HERO
chmod +x ./test_build.sh
./test_build.sh'''
            archiveArtifacts(artifacts: 'target/*.jar', fingerprint: true)
          }
        }

        stage('TestinB') {
          steps {
            sh '''sleep 10
echo done.'''
          }
        }

      }
    }

  }
  environment {
    HERO = 'Batman'
  }
}