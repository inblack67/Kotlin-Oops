//no ctors allowed and it's thread safe (2 thread try to instantiate => even then only once instance would be created)
object Singleton {
    init {
        println("init only once")
    }
    fun greet(): String = "hello worlds"
}