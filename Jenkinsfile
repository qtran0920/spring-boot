pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/qtran0920/spring-boot.git'
                sh "./gradlew build"
            }
        }
    }
}
