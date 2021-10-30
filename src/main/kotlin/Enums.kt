// defined constants => at compile time
//can only inherit interfaces
//everything inside enum is an object
enum class Enums {
    RED, GREEN, BLUE
}

interface IColors {
    fun fillColor(): String
}

enum class Enums2(val meta: String) : IColors {
    RED(meta = "red meta") {
        override fun fillColor(): String {
           return "filled red color"
        }
    },
    GREEN(meta = "green meta") {
        override fun fillColor(): String {
            return "filled green color"
        }
    }
}
