pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Automation executed successfully'
        }
        failure {
            echo 'Check failure logs'
        }
    }
}
