package _01_classes

data class FullName(val first: String, val last: String)
fun String.parseName(): FullName {
    val space = this.indexOf(' ')
    return FullName(
            this.substring(0, space),
            this.substring(space + 1)
    )
}

fun main(args: Array<String>) {
    val name = "Mary Jane".parseName()
    val first = name.first
    val last = name.last

    println("$first $last")

    if (name !=  "Mary Jane".parseName()){
        println("!!!!!!!!!!!!!!!!!!!!!")
        println("Equals doen't work :(")
        println("!!!!!!!!!!!!!!!!!!!!!")
    }
}