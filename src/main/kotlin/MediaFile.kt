class MediaFile(private val downloader: IDownloader, private val player: IPlayer)
    : IDownloader by downloader, IPlayer by player