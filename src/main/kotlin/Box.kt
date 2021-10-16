//primary constructor
//can have access modifier => clas Box private constructor... => but then object creation would not be allowed
//can not write any code inside the primary constructor as it does not have a body. but init block does
class Box (
    val length: Int = 0,
    val breadth: Int = 0,
    val area: Int = 0
) {

//    as many init block as we want but one recommended
    init {
        println("i ran after primary ctor")
    }

//    secondary constructors were needed to overload constructor params so that different combos of params could be passed
//    but kotlin has default args so better avoid it
//    has to call primary ctor
//    constructor(color: String = "Default color"): this(0,0,0) {
//
//    }

    var boxName: String = ""

//        visibility can be specified
    set(value) {
        if(value.length < 3){
            println("name must be at least 3 chars")
        }else {
            field = value
        }

    }

//    behaviour
    fun intro() = println("I am a box")
}