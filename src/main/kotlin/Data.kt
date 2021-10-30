// class for storing data
//cannot be open and abstract and blank ctor is not allowed
//cannot inherit another data class => final by default
//can have body
data class Data(val x: String, val y: String) {
    fun sumUp() = x + y
}