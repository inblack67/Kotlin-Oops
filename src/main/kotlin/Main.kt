fun main(){
    val app = MyApp()
    val downloader = Downloader()

//    object : IDownloadListener => creating anonymous class and inheriting the interface
    downloader.downloadListener = object : IDownloadListener {
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
    downloader.downloadFile("hello.txt")
}