fun main(){
    var sonuc = 1
    fun faktoriyel(sayi:Int):Int{
        if(sayi>0){
            sonuc*=sayi
            faktoriyel(sayi-1)
        }
        return sonuc
    }
    println(faktoriyel(6))
}