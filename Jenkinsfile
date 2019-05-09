pipeline {
    agent any

    tools {maven 'MAVEN 3.6.1'}

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/l-pizarro/ci-backend'
            }
        }
        
        stage('Compile-Package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
    