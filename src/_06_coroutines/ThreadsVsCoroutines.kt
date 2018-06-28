package _06_coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main(args: Array<String>) = threads(100_000)

fun threads(n: Int) {
    val threads = List(n) {
        thread {
            sleep(1000L)
            println(it)
        }
    }

    threads.forEach { it.join() }
}


fun coroutines(n: Int) = runBlocking {
    val jobs = List(100_000) {
        async {
            delay(1000L)
            println(it)
        }
    }

    jobs.forEach { it.join() }
}