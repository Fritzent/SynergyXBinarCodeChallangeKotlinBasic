package kasirHandel

class Member (private val nama: String): Anggota() {

    companion object {
        private var listNama = ArrayList<String>()
        private var listHarga = ArrayList<Int>()
        private var listJumlah = ArrayList<Int>()
        const val BATASDISKON = 50000
    }

    protected fun Int.idr():String {
        return ("Rp. $this,00")
    }

    override fun inputPembelianBarang(){
        println("===============================")
        println("Checkout Pelanggan Member $nama")
        println("===============================")

        println("Input nama barang : ")
        val namaBarang = readLine()
        println("Input Harga Satuan Barang : ")
        val hargaBarang = readLine()
        println("Input Jumlah Barang : ")
        val jumlahBarang = readLine()

        if(namaBarang != null && hargaBarang != null && jumlahBarang != null){
            val changeHargaBarang = hargaBarang.toInt()
            val changeJumlahBarang = jumlahBarang.toInt()

            listNama.add(namaBarang)
            listHarga.add(changeHargaBarang)
            listJumlah.add(changeJumlahBarang)
        }
        println("Input Barang Lagi? (y/t)")
        val inputanRespon = readLine()!!
        val changeResponToChar: Char = inputanRespon.single()

        when(changeResponToChar) {
            'y' -> {
                inputPembelianBarang()
            }
            't' -> {
                hitungJumlahBelanja()
            }
        }


    }

    override fun hitungJumlahBelanja(){

        println("===============================")
        println("Checkout Pelanggan Member $nama")
        println("===============================")

        var totalBarang = 0
        var i = 0

        while(i < listNama.size){
            val totalHargaBarang: Int = listHarga[i] * listJumlah[i]
            totalBarang += totalHargaBarang
            println("${listNama[i]} X ${listJumlah[i]} : ${totalHargaBarang.idr()}")
            i++
        }
        println("====================================")
        println("Total Belanja : ${totalBarang.idr()}")
        println("====================================")

        if(totalBarang>BATASDISKON){
            val diskon = totalBarang.toDouble() * 9.5 / 100
            totalBarang -= diskon.toInt()
            println("Selamat! karena total belanjaan $nama lebih besar dari ${BATASDISKON.idr()}," +
                    "Maka mendapatkan potongan sebesar 9.5% " +
                    "$nama cukup membayar ${totalBarang.idr()}")
        }
        pembayaran(totalBarang)
    }

    override fun pembayaran(totalBayar: Int){
        println("===============================")
        println("Checkout Pelanggan Member $nama")
        println("===============================")

        println("Masukkan Nominal Uang Anda : ")
        val checkUangUser = readLine()
        if(checkUangUser != null){
            if(checkUangUser.toInt() < totalBayar){
                println("Maaf duit anda kurang")
            }else{
                val kembalian = checkUangUser.toInt() - totalBayar
                println("------------------------------")
                println("Kembalian : ${kembalian.idr()}")
                println("------------------------------")
            }
        }
    }
}