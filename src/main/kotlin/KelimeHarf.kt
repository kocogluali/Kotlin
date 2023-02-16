fun main(){
    fun bul(metin:String, harf:String):Int{
        var sonuc=0
        for(a in metin){
            if(a.toString()==harf){
                sonuc+=1
                println(a)
            }
        }
        return sonuc
    }
    println(bul("ali kemal koçoğlu","a"))
}