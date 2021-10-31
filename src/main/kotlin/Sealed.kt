sealed class Sealed {
    data class Success(val message: String): Sealed()
    data class Error(val error: String): Sealed()
    object  Loading: Sealed()
}

fun getResponseData() = Sealed.Success("some data")