// username & password

withCredentials([usernamePassword(credentialsId: 'my-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
    sh 'echo $USERNAME:$PASSWORD'
}


// secret text

withCredentials([usernamePassword(credentialsId: 'my-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
    sh 'echo $USERNAME:$PASSWORD'
}


// ssh private key
withCredentials([sshUserPrivateKey(credentialsId: 'my-ssh-key', keyFileVariable: 'SSH_KEY')]) {
    sh 'echo $SSH_KEY'
}


// cert
withCredentials([file(credentialsId: 'my-cert', variable: 'CERT')]) {
    sh 'echo $CERT'
}