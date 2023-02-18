package Collections

fun main(){
    val meyveler = HashSet<String>()
    meyveler.add("elma")
    meyveler.add("armut")
    meyveler.add("üzüm")
    meyveler.add("limon")
    meyveler.add("kayısı")
    meyveler.add("portakal")

    meyveler.forEach{
        println("$it")
    }
    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.count())
    println(meyveler.isEmpty())
    println(meyveler.contains("elma"))


    var meyvelerHashMap = HashMap<Int,String>()
    meyvelerHashMap.put(1,"elma")
    meyvelerHashMap.put(2,"armut")
    meyvelerHashMap.put(3,"üzüm")
    meyvelerHashMap.put(4,"limon")
    meyvelerHashMap.put(5,"kayısı")
    meyvelerHashMap.put(6,"portakal")
    meyvelerHashMap.forEach{
        println("${it.key} ${it.value}")
    }
}