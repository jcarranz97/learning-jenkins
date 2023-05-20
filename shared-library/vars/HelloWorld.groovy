def call(Map config = [:]) {
    sh "echo 'Hi ${config.name}!!!. I hope you are having a great ${config.dayOfWeek} :)'"
}
