class Box {
//    properties
     val length: Int = 1
     val breadth: Int = 2
    val area: Int
    get() = length * breadth // visibility is same as the property

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