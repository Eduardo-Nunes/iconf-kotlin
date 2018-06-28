package _06_coroutines

import kotlinx.coroutines.experimental.runBlocking
import kotlin.coroutines.experimental.suspendCoroutine

class CallbackService(val name: String) {
    class Response(val from: CallbackService, val message: String)

    fun request(from: String, callback: (Response) -> Unit) {
        // Do Work...
        callback(Response(this, "Hi $from! \n -- Yours, $name"))
    }
}

fun CallbackService.sendMany(vararg from: String, callback: (CallbackService.Response) -> Unit) {
    if(from.isEmpty()) return
    this.request(from[0]) { r ->
        callback(r)
        sendMany(*from.copyOfRange(1, from.size), callback = callback)
    }
}


fun main(args: Array<String>) {
    val s1 = CallbackService("1")
    val s2 = CallbackService("2")

    s1.request(s2.name) { r1 ->
        println(r1.message)
        r1.from.request(s1.name) { r2 ->
            println(r2.message)
        }
    }

    s1.sendMany("a", "b", "c") {
        r -> println(r.message)
    }

    runBlocking {
        val r1 = s1.request(s2.name)
        println(r1.message)
        val r2 = s2.request(s1.name)
        println(r2.message)

        for (from in listOf("a", "b", "c")) {
            println(s1.request(from).message)
        }

    }

}


suspend fun CallbackService.request(from: String) =
        suspendCoroutine<CallbackService.Response> { cont ->
            request(from) { r ->
                cont.resume(r)
            }
        }




