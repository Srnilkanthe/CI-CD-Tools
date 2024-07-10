pipeline {
    agent any
    environment {
        NAME = 'John'
        AGE = 30
    }
    stages {
        stage('Example') {
            steps {
                echo "Hello ${env.NAME}, you are ${env.AGE} years old."
            }
        }
    }
}