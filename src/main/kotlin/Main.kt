fun main() {
  Enums.values().forEach { println(it) }
  val myEnum = Enums.BLUE
  println(myEnum)
  when(myEnum){
    Enums.BLUE -> println("blue")
    Enums.RED -> println("red")
    Enums.GREEN -> println("green")
  }
  val redEnum = Enums2.RED
  println(redEnum.fillColor())
  println(redEnum.meta)
}