interface Command {
    val keyword: String
    val description: String
    fun execute(text: String)
}