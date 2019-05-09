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

        stage('Deploy-Tomcat') {
            sshagent(['tomcat-admin']) {
                sh 'ssh -o StrictHostKeyChecking=no target/*.war tomcat@http://157.230.12.110:/opt/tomcat/apache-tomcat-9.0.19/webapps/'
            }
        }
    }
}
    