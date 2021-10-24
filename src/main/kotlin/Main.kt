fun main() {
    val numberGeneric = Generics(arrayOf<Int>(1,2,3,4))
    println(numberGeneric.findElement(4))
    println(numberGeneric.findElement(10))
    val stringGeneric = Generics(arrayOf<String>("hello", "worlds"))
    println(stringGeneric.findElement("worlds"))
    println(stringGeneric.findElement("ok"))
}