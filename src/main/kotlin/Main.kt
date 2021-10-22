class FileDownloader: IDownloader {
    override fun download(): String {
       return "downloading"
    }
}

class FilePlayer: IPlayer {
    override fun play(): String {
        return "playing"
    }
}

fun main(){
    val mediaFile = MediaFile(FileDownloader(), FilePlayer())
    println(mediaFile.download())
    println(mediaFile.play())
}