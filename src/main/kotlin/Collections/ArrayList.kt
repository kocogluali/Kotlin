package Collections

import java.util.ArrayList

fun main(){
    val urun1 = Urun(1,"telefon",125.0)
    val urunler = ArrayList<Urun>()
    urunler.add(urun1)

    for (urun in urunler){
        println("${urun.urunAdi} ${urun.urunNo} ${urun.urunFiyat}")
    }
}
