package Collections

fun main(){
    //index
    val metin = "ali"
    println(metin[0])
    println(metin.get(0))

    //plus ekleme (add) yapar.
    var metin1 = "ali"
    println(metin1.plus(" kemal"))

    var metin2 = "semanur koçoğlu"
    println(metin2.length)

    // equals ile tiplerini kontrol eder
    val kelime1 ="ali"
    val kelime2="ali"

    println(kelime1.equals(kelime2))
}