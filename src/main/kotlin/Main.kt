fun main(){
    val coffee1 = BaseCoffee(10)
    coffee1.makeCoffee()
    val coffee2 = PremiumCoffee(20)
    coffee2.makePremiumCoffee()
    coffee2.makeCoffee()
}