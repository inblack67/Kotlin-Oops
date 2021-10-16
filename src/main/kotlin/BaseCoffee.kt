//open => so that class can b inherited
open class BaseCoffee(
    val price: Int
) {
    fun makeCoffee(){
        println("coffee with price of $price is ready")
    }
}