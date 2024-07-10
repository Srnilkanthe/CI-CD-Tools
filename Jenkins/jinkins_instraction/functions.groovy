def greet(name) {
    echo "Hello, $name!"
}

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    greet('Alice')
                    greet('Bob')
                }
            }
        }
    }
}