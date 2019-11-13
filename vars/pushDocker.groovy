def call() {
    sh "steps {
        script {
            withDockerRegistry(
                credentialsId: 'Dockerhub',
                url: 'https://index.docker.io/v1/'
            ) {
                dockerImage.push()
            }
        }
    }"
}