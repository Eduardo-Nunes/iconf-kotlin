package _04_expressions

class Example(val a: Int, val b: String? = null, val c: Boolean)


fun main(args: Array<String>) {

    val ex = Example(1, c = true)

    with(ex) {
        println("a = $a, b = $b, c = $c")
    }


    val map = hashMapOf(
            "k1" to 1,
            "k2" to 2,
            "k3" to 3
    )


    for ((key, value) in map.entries) {
        println("$key -> $value")
    }


    val s = if (System.currentTimeMillis() % 2L == 0L) {
        println("Yay!")
        "Luck"
    } else {
        "Note this time fella"
    }
    println(s)
}

fun test(e: Example): String {
    return when (e.a) {
        1, 3, 5 -> "Odd"
        2, 4, 6 -> "Even"
        else -> "Too big"
    }
}

fun test2(str: String?): String? {
    println(str?.length)

    str?.forEach(::println)

//    str ?: throw RuntimeException("Unexpected null!")

    str?.let {
        print(it)
    } ?: run {
       return null
    }

    if (str == null) return null
    if (str == null) throw RuntimeException("Unexpected null!")
    if (str == null) error("Unexpected null")

    return ""
}