package _02_properties


private var prop = "..."
    set(value) {
        println("New Value: $value")
        field = value
    }











val os: String by lazy {
    println("Computing...")
    System.getProperty("os.name") +
            " v" + System.getProperty("os.version") +
            " (" + System.getProperty("os.arch") + ")"
}



fun main(args: Array<String>){
    for (i in 1..3){
        println(os)
    }
}