package Goroutine
import  kotlinx.coroutines.*
fun main(){
    println(runBlocking {
        val listOfDeferred: List<Deferred<Int>> = (1..50).map{
            i -> async {
                delay(100)
            Int.MAX_VALUE
        }
        }
    }.toString())
}
