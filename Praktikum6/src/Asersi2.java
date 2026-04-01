/* Nama File : Asersi2.java
 * Deskripsi : Program untuk demo asersi yang menolak input jari-jari lingkaran bernilai 0
 * Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
 * Tanggal   : 31 Maret 2026
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari jari tidak boleh nol!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

    }
}

/* PERTANYAAN: secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
   Jawaban: Penggunaan asersi ditujukan untuk proses debugging atau mengidentifikasi kesalahan logika
   saat melakukan validasi nilai/validasi logika, selain itu asersi juga hanya bekerja ketika diaktifkan
   dengan menggunakan perintah -enableassertion di Java sehingga kurang cocok untuk memvalidasi input pada
   saat program dijalankan atau proses pembuatan objek baru*/
