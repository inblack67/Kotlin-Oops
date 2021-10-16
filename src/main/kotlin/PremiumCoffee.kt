//primary ctor of the parent class has to be called while inheriting
class PremiumCoffee (price: Int) : BaseCoffee(price) {
    fun makePremiumCoffee(){
        println("premium coffee of price $price is ready")
    }
}