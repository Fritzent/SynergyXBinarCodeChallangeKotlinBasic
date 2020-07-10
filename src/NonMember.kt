import java.util.*

class NonMember : Anggota() {
    override fun nonMember(){
        println("-----------------------------")
        println("Checkout Pelanggan Non Member")
        println("-----------------------------")
        print("Input Nama Barang : ")
        val checkNamaBarang = readLine()!!
        print("Input Harga Satuan Barang : ")
        val checkHargaSatuan = Scanner(System.`in`).nextInt()
        print("Input Jumlah Barang : ")
        val checkJumlahBarang = Scanner(System.`in`).nextInt()
        println("-----------------------------")


        print("Input Barang Lagi? (Ya/Tidak) : ")
        val checkResponUser = readLine()!!

        if(checkResponUser == "Tidak" || checkResponUser == "tidak"){
            checkOutBarang(checkNamaBarang,checkHargaSatuan,checkJumlahBarang)
        }
    }

    private fun checkOutBarang(checkNamaBarang:String, checkHargaBarang:Int, checkJumlahBarang:Int){
        println("-----------------------------")
        println("Checkout Pelanggan Non Member")
        println("-----------------------------")
        if(checkJumlahBarang > 1 ){
            val hargaKaliJumlahBarang = checkJumlahBarang * checkHargaBarang
            println("$checkNamaBarang X $checkJumlahBarang : Rp. $hargaKaliJumlahBarang")
            println("-----------------------------")
            println("Total Belanja : Rp. $hargaKaliJumlahBarang")
        }else{
            println("$checkNamaBarang X $checkJumlahBarang : Rp. $checkHargaBarang")
        }

    }
}