pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh "gradle build"
            }
        }
        stage('Build and Push Image') {
            steps {
                sh '''
                    echo $USER
                    docker version
                    /usr/local/bin/docker-compose version
                    /usr/local/bin/docker-compose build
                '''
            }
        }
    }
}
