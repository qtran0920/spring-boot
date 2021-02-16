pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }
        stage('Build and Push Image') {
           steps {
               sh '''
                    docker version
                    docker-compose version
                    cd build && docker-compose build
               '''
           }
        }
    }
}
