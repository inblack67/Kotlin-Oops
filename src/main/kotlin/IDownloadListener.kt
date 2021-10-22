interface IDownloadListener  {
    fun onDownloadStarted()
    fun downloadInProgress(progress: Int)
    fun fileDownloaded(file: String)
}