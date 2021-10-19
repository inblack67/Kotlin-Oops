fun main(){
//    interfaces can't have init blocks and constructors
//    multiple interfaces inheritance is allowed unlike in classes
//    kotlin does not support multiple inheritance


    val song = Song("Lose Yourself")
    song.downloadSong()
    song.playSong()


    val song2: IDownloader = Song("Lose Yourself")
    println(song2.download()) // referenced to IDownloader => since Song inherits IDownloader => Song is IDownloader
}