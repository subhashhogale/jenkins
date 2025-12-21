pipeline {
    agent any

    tools {
        jdk 'Java'
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Code checked out from GitHub'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
