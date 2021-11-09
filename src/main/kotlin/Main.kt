fun main() {
// let = temporary scope
    val square = ScopeFunctions(12).let {
        it.fillColor("red")
        it.fillText("ok")
        it // returning lambda object
    }
    println("hello")
    println(square)

//    lateinit var square1: ScopeFunctions
//    val square2: ScopeFunctions? = null
//    square2?.let { square1 = it }
//    print("square1 => $square1")

    val x = ScopeFunctions(11).run {
        fillText("ok2")
        fillColor("some color")
        this
    }
    println(x)

    val y = ScopeFunctions(15)

//    with => call functions of an instance without explicitly using instance
    with(y){
        fillColor("new color")
        fillText("ok dok")
        y
    }
    println("with => $y")

//    apply => init configuration of an object
//    returns context not lambda
    val z = ScopeFunctions(16).apply {
        fillColor("z color")
        fillText("z text")
    }
    println("apply $z")

//    also => same as apply but with it scope
    val i = ScopeFunctions(16).also {
        it.fillColor("i color")
        it.fillText("i text")
    }
    println("also $z")
}