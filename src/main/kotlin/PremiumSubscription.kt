class PremiumSubscription(name: String, price: Int)
    : Subscription(name = name, price = price) {

    override fun description(): String {
        return "You have $name subscription of price $price"
    }

    override fun greet(): String {
        return super.greet() + " worlds"
    }
}