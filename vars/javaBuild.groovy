def call() {
    sh "mvn -B -Dstyle.color=always -DskipTests clean package"
}