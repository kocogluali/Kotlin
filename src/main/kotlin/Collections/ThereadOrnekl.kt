package Collections

fun main(){
    val birinciThread = BirinciThread()
    birinciThread.start()
    val ikinnciThread = Thread(İkinciThread())
    ikinnciThread.start()

    for(i in 900..999){
        println("Main Thread:$i")
        Thread.sleep(100)
    }

}