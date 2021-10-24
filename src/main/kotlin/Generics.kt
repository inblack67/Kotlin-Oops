class Generics<T>(private val arr: Array<T>) {
    fun findElement(element: T): Int? {
        for ((index, el) in arr.withIndex()) {
            if (el === element)
                return index
        }
        return null
    }
}