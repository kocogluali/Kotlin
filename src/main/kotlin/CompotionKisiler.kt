fun main(){
    val adres = Adres("giresun","┼čebinkarahisar")
    var kisiler = Kisiler("ali",23,adres)
    println(kisiler.ad + " " + kisiler.yas +" "+ kisiler.adres.il + " " + kisiler.adres.ilce )
}