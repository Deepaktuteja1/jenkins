pipeline {
    agent any
    stages {
        stage('Maven Clean') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Maven Clean Install') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}