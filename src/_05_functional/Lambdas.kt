package _05_functional

fun main(args: Array<String>) {

    val list = (1..100).toList()
            .filter { it -> it % 16 == 0 }
            .map { it -> "0x" + it.toString(16) }

    println(list)

    repeat(100) { number ->
        println(number)
    }
}

inline fun repeat(times: Int, body: (Int) -> Unit) {
    for (index in 0 until times){
        body(index)
    }
}