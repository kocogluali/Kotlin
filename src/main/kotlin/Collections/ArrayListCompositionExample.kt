package Collections

import java.util.Scanner

fun main(){
    val personeller = ArrayList<Personel>()
    val girdi = Scanner(System.`in`)
    for(i in 1..5){
        println("$i. Personel Adı:")
        val isim = girdi.next()
        println("$i. İl Adı:")
        val il = girdi.next()

        println("$i. İlçe Adı:")
        val ilce = girdi.next()

        val adres = Adres(il,ilce)
        val personel = Personel(i,isim,adres)
        personeller.add(personel)
    }

    personeller.forEach{ println("${it.no} ${it.isim} ${it.adres.il} ${it.adres.ilce}")}

}