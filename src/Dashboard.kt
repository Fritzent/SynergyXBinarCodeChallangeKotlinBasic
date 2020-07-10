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
                println("uNDERcoNTRAINTER")
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

//    private fun pelangganNonMember(){
//        println("-----------------------------")
//        println("Checkout Pelanggan Non Member")
//        println("-----------------------------")
//        print("Input Nama Barang : ")
//        val checkNamaBarang = readLine()!!
//        print("Input Harga Satuan Barang : ")
//        val checkHargaSatuan = Scanner(System.`in`).nextInt()
//        print("Input Jumlah Barang : ")
//        val checkJumlahBarang = Scanner(System.`in`).nextInt()
//        println("-----------------------------")
//
//
//        print("Input Barang Lagi? (Ya/Tidak) : ")
//        val checkResponUser = readLine()!!
//
//        if(checkResponUser == "Tidak" || checkResponUser == "tidak"){
//            checkOutBarang(checkNamaBarang,checkHargaSatuan,checkJumlahBarang)
//        }
//
//        //TODO NOTE: addnya nanti dulu
////        val getBarang = Barang()
////        getBarang.nyimpanBarangCheckOut(checkNamaBarang,checkJumlahBarang,checkHargaSatuan,username)
//    }

//    private fun checkOutBarang(checkNamaBarang:String, checkHargaBarang:Int, checkJumlahBarang:Int){
//        println("-----------------------------")
//        println("Checkout Pelanggan Non Member")
//        println("-----------------------------")
//        if(checkJumlahBarang > 1 ){
//            val hargaKaliJumlahBarang = checkJumlahBarang * checkHargaBarang
//            println("$checkNamaBarang X $checkJumlahBarang : Rp. $hargaKaliJumlahBarang")
//            println("-----------------------------")
//            println("Total Belanja : Rp. $hargaKaliJumlahBarang")
//        }else{
//            println("$checkNamaBarang X $checkJumlahBarang : Rp. $checkHargaBarang")
//        }
//
//    }
}

//TODO LOGIC
//TODO User Input nama,harga,jumlah
//TODO Inputan semua masuk ke penampung
//TODO di checkoutnya akses ke penampungnya
//TODO buatnya gimana !!!! -wawaadawndaadb