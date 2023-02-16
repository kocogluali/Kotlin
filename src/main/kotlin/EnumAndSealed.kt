import kotlin.reflect.typeOf

data class UserInfo(
    var ad:String,
    var soyad:String,
    var yas:Int
)
/*
enum class USER_TYPE(val get:UserInfo){
    ADMIN(UserInfo("ali","kocoglu",10)),
    USER(UserInfo("veli","akkaya",25)),
    SUPERUSER(UserInfo("sema","yuzer",27)),
}
*/
sealed class USER_TYPE
data class Admin(val userInfo: UserInfo):USER_TYPE()
data class User(val userInfo: UserInfo) : USER_TYPE()
data class SuperAdmin(val userInfo: UserInfo): USER_TYPE()
object None: USER_TYPE()

fun main(){
    //var userType = USER_TYPE.ADMIN.get
    //println(userType.ad+" "+userType.soyad+" "+userType.yas)
    val userType =  Admin(UserInfo("ali","kemal",30))
   /* when(userType){
        is User -> {userType.userInfo}
        is Admin -> {userType.userInfo}
        is SuperAdmin -> {userType.userInfo}
        is None -> {}
    }
    */

    println(typeOf<Admin>())

}