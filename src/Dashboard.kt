import kasirHandel.Member
import kasirHandel.NonMember

//import KasirHandel.NonMember

class Dashboard {
    fun dashboardUserLogin(username: String){
        println("------------------------")
        println("Selamat Datang $username")
        println("------------------------")
        val getMenuDashboardLogin = MenuStart()
        getMenuDashboardLogin.checkOutPelanggan()
        getMenuDashboardLogin.logoutApp()
        println("--------------------------------")
        println(" Gunakan 1/0 Untuk Memilih Menu ")
        println("--------------------------------")
        print("Menu Pilihan Anda : ")
        when (readLine()!!) {
            "1" -> {
                processPelangganMenu()
            }
            "0" -> {
                println(" ")
                println("--------- Keluar ---------")
                println(" ")
                loginKasirUser()
            }
            else -> {
                println("Silahkan Cek Note")
                main()
            }
        }
    }
    private fun processPelangganMenu(){
        println("--------------------------------")
        println("Checkout Pelanggan")
        println("--------------------------------")
        val getMenuPelanggan = MenuStart()
        getMenuPelanggan.pelangganMember()
        getMenuPelanggan.pelangganNonMember()
        println("--------------------------------")
        println(" Gunakan 1/2 Untuk Memilih Menu ")
        println("--------------------------------")
        print("Menu Pilihan Anda : ")
        when (readLine()!!) {
            "1" -> {
                println("==========================")
                println("Checkout Pelanggan Member ")
                println("==========================")
                println("Input Nama Member : ")
                val namaMember = readLine().toString()
                Member(namaMember).inputPembelianBarang()
            }
            "2" -> {
                NonMember().inputPembelianBarang()
            }
            else -> {
                println("Silahkan Cek Note")
                main()
            }
        }
    }
}