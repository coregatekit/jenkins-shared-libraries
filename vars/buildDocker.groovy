def call(tag=null) {
    sh "docker build -t ${tag} ."
}