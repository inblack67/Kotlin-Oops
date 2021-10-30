class Nested(val x: Int, val y: Int) {

//    cannot access outer class var
//    can be instantiated using outer class (without outer class's instance)
    class Inner1 {
        fun inner1Log() = println("inner1 class log1")
    }

//    creates ref to outer class => now can access outer class vars
//    can be instantiated via outer class's object
    inner class Inner2 {
        fun inner2Log() = println("inner2 class log2 => outer has vars => $x $y")
    }
}