class Downloader {
    var downloadListener: IDownloadListener? = null

    fun downloadFile(file: String) {
        downloadListener?.onDownloadStarted()
        for (i in 1..10) {
            downloadListener?.downloadInProgress(i * 10)
            Thread.sleep(100)
        }
        downloadListener?.fileDownloaded(file)
    }
}