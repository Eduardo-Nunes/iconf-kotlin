package _02_properties




private var prop: String = "..."

fun getProp() = prop
fun setProp(v: String){
    println("New Value: $v")
    prop = v
}




















private var _os: String? = null
val os: String
    get() {
        if (_os == null){
            println("Computing...")
            _os = System.getProperty("os.name") +
                    " v" + System.getProperty("os.version") +
                    " (" + System.getProperty("os.arch") + ")"
        }
        return _os!!
    }



fun main(args: Array<String>){
    for (i in 1..3){
        println(os)
    }
}