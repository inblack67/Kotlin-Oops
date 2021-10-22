class MyApp: IDownloadListener {
    override fun onDownloadStarted() {
        println("download started")
    }

    override fun downloadInProgress(progress: Int) {
        println("$progress% downloaded")
    }

    override fun fileDownloaded(file: String) {
        println("downloaded $file")
    }

}

fun main(){
    val app = MyApp()
    val downloader = Downloader()
    downloader.downloadListener = app
    downloader.downloadFile("hello.txt")
}