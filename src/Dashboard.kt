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
                val member = Member()
                member.member()
            }
            "2" -> {
                val nonMember = NonMember()
                nonMember.nonMember()
            }
            else -> {
                println("Silahkan Cek Note")
                main()
            }
        }
    }
}

//TODO LOGIC
//TODO User Input nama,harga,jumlah
//TODO Inputan semua masuk ke penampung
//TODO di checkoutnya akses ke penampungnya
//TODO buatnya gimana !!!! -wawaadawndaadb