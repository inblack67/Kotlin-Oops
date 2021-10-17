// instances can not be created
abstract class Subscription(
    val name: String,
    val price: Int
) {
    abstract fun description(): String

//    with open => can now be overridden by another class which extends this class
    open fun greet(): String = "hello" // abstract class can also have functions with body
}