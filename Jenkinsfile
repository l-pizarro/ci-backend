node {
    stage('Checkout') {
        git 'https://github.com/l-pizarro/ci-backend'
    }
    
    stage('Compile-Package') {
        def mvnHome = tool name: 'MAVEN 3.6.1', type: 'maven'
        sh '${mvnHome}/bin/mvn clean package'
    }

    stage('Deploy-Tomcat') {
        sshagent(['tomcat-admin']) {
            sh 'ssh -o StrictHostKeyChecking=no target/*.war tomcat@http://157.230.12.110:/opt/tomcat/apache-tomcat-9.0.19/webapps/'
        }
    }
}
    