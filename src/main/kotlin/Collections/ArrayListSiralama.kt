package Collections

fun main(){
    val k1 = Kisiler(1,"ali kemal koçoğlu")
    val k2 = Kisiler(2,"zeynep yılmaz")
    val k3 = Kisiler(3,"berna gündoğdu")
    val kisilerArrayList = ArrayList<Kisiler>()
    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    for (k in kisilerArrayList){
        println("${k.kisiNo} ${k.kisiAdi}")
    }

    val kisilerSortedDesc = kisilerArrayList.sortedBy { it.kisiNo }
    kisilerSortedDesc.forEach { println("${it.kisiNo} ${it.kisiAdi}") }
}