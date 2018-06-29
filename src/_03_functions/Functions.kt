package _03_functions


fun String.getFirstWord(): String {
    val index = indexOf(" ")
    return if (index > 0) this else substring(0, index)
}


fun main(args: Array<String>) {
    println(
            "Mary Jane".getFirstWord()

    )
}