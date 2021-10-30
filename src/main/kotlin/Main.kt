fun main() {
  val x = Nested(1,2)
  val inner1 = Nested.Inner1()
  val inner2 = x.Inner2()
  inner1.inner1Log()
  inner2.inner2Log()
}