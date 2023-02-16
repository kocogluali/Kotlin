fun main(){
    val adres = Adres("giresun","şebinkarahisar")
    var kisiler = Kisiler("ali",23,adres)
    println(kisiler.ad + " " + kisiler.yas +" "+ kisiler.adres.il + " " + kisiler.adres.ilce )
}