import java.util.*

fun main() {
    println("--------------------------------")
    println(" Selamat Datang Di Synrgy Mart  ")
    println("--------------------------------")
    val menuBeforeLogin = MenuStart()
    menuBeforeLogin.loginKasir()
    menuBeforeLogin.keluarApp()
    println("--------------------------------")
    println(" Gunakan 1/0 Untuk Memilih Menu ")
    println("--------------------------------")
    print("Menu Pilihan Anda : ")
    when (readLine()!!) {
        "1" -> {
            loginKasirUser()
        }
        "0" -> {
            println(" ")
            println("--------- TERIMA KASIH ---------")
            System.out
        }
        else -> {
            println("Silahkan Cek Note")
            main()
        }
    }
}
fun loginKasirUser(){
    println("-----------------------------")
    println("Selamat Datang Di Synrgy Mart")
    println("-----------------------------")
    println("+Login Kasir+")
    print("Username : ")
    val checkUsername = readLine()!!
    print("Password : ")
    val checkPassword = Scanner(System.`in`).next()

    val getUserDatabase = UserDatabase()

    getUserDatabase.userData.forEach{ (key, value) ->
        if(checkUsername == key && checkPassword == value){
            val getDashboardView = Dashboard()
            getDashboardView.dashboardUserLogin(checkUsername)
        }
        if(checkUsername == key && checkPassword != value){
            println("Password anda Salah, Silahkan Ulangi!")
            return@forEach loginKasirUser()
        }
        if(checkUsername != key && checkPassword == value){
            println("Username anda Salah, Silahkan Ulangi!")
            return@forEach loginKasirUser()
        }
    }
}