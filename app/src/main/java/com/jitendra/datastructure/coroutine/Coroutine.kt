package com.jitendra.datastructure.coroutine

import kotlinx.coroutines.*
import kotlin.concurrent.thread

@DelicateCoroutinesApi
fun main() {
    println("main starts ")
    val job = GlobalScope.launch(start = CoroutineStart.LAZY) {
        val result = doNetWorkCall()
        println(result)
    }
    job.start()
    thread {
        Thread.sleep(3000)
    }
    println("main ends")
}

private suspend fun doNetWorkCall(): String {
    println("some work started")
    delay(3000)
    return "work complete"
}