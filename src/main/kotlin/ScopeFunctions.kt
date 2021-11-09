class ScopeFunctions(
    private val side: Int,
    private var color: String? = null,
    private var text: String? = null
) {
    fun fillColor(givenColor: String){
//        this.color = givenColor
        color = givenColor
    }
    fun fillText(givenText: String){
//        this.text = givenText
        text = givenText
    }

    override fun toString(): String {
        return "Square with side $side, color $color and text $text"
    }
}