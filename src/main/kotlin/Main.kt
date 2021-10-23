import kotlin.properties.Delegates

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

class HeavyClass {
    init {
        println("doing some heavy task")
    }
}

class ABC {
    val heavy by lazy { HeavyClass() }

//    observer onChange
    var todo: Int by Delegates.observable(50) {property, oldValue, newValue ->
        println("Old value of todo $oldValue")
        println("New value of todo $newValue")
    }

//    conditionally assigning values to variables
    var age: Int by Delegates.vetoable(18) {property, oldValue, newValue ->
        println("$oldValue => $newValue")
        newValue >= 18
    }
}

fun main(){

    val abc = ABC()
//    abc.heavy // only init when accessed
    abc.todo = 12
    abc.age = 12
    println(abc.age)
    abc.age = 19
    println(abc.age)

//    val mediaFile = MediaFile(FileDownloader(), FilePlayer())
//    println(mediaFile.download())
//    println(mediaFile.play())
}