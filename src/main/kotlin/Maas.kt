fun main(){
    fun maas(gun:Int,saat:Int):Int{
        var mesai:Int = 0
        var maasi:Int =0
        if (saat<9){
            if (gun*saat<=160){
                maasi=saat*10*gun
            }else{
                maasi=1600
                mesai=((saat*gun)-160) *20
            }

        }else{
            println("Günlük çalışma vaktini aştınız. Bu yüzden hesaplama işlemini 0 olarak gönderiyoruz")
            return 0
        }
        return mesai+maasi
    }

    println(maas(30,8))
}