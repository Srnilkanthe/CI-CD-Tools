pipeline {
    agent any
    stages {
        stage('Example') {
            when {
                branch 'master'
            }
            steps {
                echo 'This will only execute on the master branch.'
            }
        }
    }
}