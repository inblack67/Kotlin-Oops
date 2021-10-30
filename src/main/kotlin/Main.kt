fun main() {
  val data1 = Data(x = "hello", y = "worlds")
  println(data1) // toString and equals func already overidden
  val data2 = Data(x = "hello", y = "world")
  println(data1 == data2)
  println(data1.sumUp())

//  componentN function => where N is the number of properties of the data class
  val x = data1.component1()
  val y = data1.component2()

//  thus
  val (x1, y1) = data1
  println("$x1 and $y1")
}