fun main(){
    val box = Box();
    box.length // getter created automatically, not accessing the property directly
    println("area => ${box.area}")
    box.boxName = "okkkk"
    println("boxName => ${box.boxName}")
}