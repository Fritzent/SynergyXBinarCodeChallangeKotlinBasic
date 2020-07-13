package kasirHandel

import java.util.*

class NonMember : Anggota() {

    companion object {
        private var listNama = ArrayList<String>()
        private var listHarga = ArrayList<Int>()
        private var listJumlah = ArrayList<Int>()
        const val BATASDISKON = 70000
    }

    fun Int.IDR():String {
        return ("Rp. $this,00")
    }

    override fun inputPembelianBarang(){
        println("=============================")
        println("Checkout Pelanggan Non Member")
        println("=============================")

        println("Input Nama Barang : ")
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

        println("=============================")
        println("Checkout Pelanggan Non Member")
        println("=============================")

        var totalBarang = 0
        var i = 0

        while(i < listNama.size){
            val totalHargaBarang: Int = listHarga[i] * listJumlah[i]
            totalBarang = totalBarang+totalHargaBarang
            println("${listNama[i]} X ${listJumlah[i]} : ${totalHargaBarang.IDR()}")
            i++
        }
        println("====================================")
        println("Total Belanja : ${totalBarang.IDR()}")
        println("====================================")

        if(totalBarang> BATASDISKON){
            val diskon = totalBarang.toDouble() * 4.1 / 100
            totalBarang = totalBarang - diskon.toInt()
            println("Selamat! karena total belanjaan lebih besar dari ${BATASDISKON.IDR()}," +
                    "Maka mendapatkan potongan sebesar 4.1% " +
                    "Cukup membayar ${totalBarang.IDR()}")
        }
        hitungJumlahBelanja(totalBarang)
    }

    override fun hitungJumlahBelanja(totalBayar: Int){
        println("=============================")
        println("Checkout Pelanggan Non Member")
        println("=============================")

        println("Masukkan Nominal Uang Anda : ")
        val checkUangUser = readLine()
        if(checkUangUser != null){
            if(checkUangUser.toInt() < totalBayar){
                println("Maaf duit anda kurang")
            }else{
                val kembalian = checkUangUser.toInt() - totalBayar
                println("------------------------------")
                println("Kembalian : ${kembalian.IDR()}")
                println("------------------------------")
            }
        }
    }
}