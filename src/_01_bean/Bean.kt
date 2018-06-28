package _01_bean

class Bean {
    private var name: String
    private var age: Int

    constructor(n: String, a: Int){
        name = n
        age = a
    }

    fun getName(): String{
        return name
    }

    fun getAte(): Int{
        return age
    }
}