class Song (private val name: String) : Greet(), IDownloader, IPlayer {
    fun downloadSong(){
        println("Song $name is ${super.download()}")
    }
    fun playSong(){
        println("Song $name is ${super.play()}")
    }

    override fun sayHello(): String {
       return "hello"
    }
}