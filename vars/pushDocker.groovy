def call(tag=null) {
    sh "docker image push ${tag}"
}