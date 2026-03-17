/* Nama File : Main.java
  Deskripsi : Berisi implementasi dari abstract class dan interface
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/


public class Main {
    public static void main(String[] args) {        
        // Tidak bisa dilakukan karena BangunDatar adalah abstract class
        // BangunDatar B1 = new BangunDatar();
        // BangunDatar P1 = new Persegi(10);
        // Persegi P2 = new Persegi(5);
        // BangunDatar L1 = new Lingkaran(7);
        // Lingkaran L1 = new Lingkaran(14);

        // Objek persegi
        BangunDatar p1 = new Persegi(10, "Merah", "Hitam");
        Persegi p2 = new Persegi(5, "Biru", "Putih");

        // Objek lingkaran (parameter konstruktor = diameter)
        BangunDatar l1 = new Lingkaran(14, "Hijau", "Kuning");
        Lingkaran l2 = new Lingkaran(20, "Ungu", "Abu-abu");

        System.out.println("=== INFO AWAL OBJEK ===");
        p1.printInfo();
        System.out.println();
        p2.printInfo();
        System.out.println("Diagonal p2 : " + p2.getDiagonal());
        System.out.println();
        l1.printInfo();
        System.out.println();
        l2.printInfo();

        System.out.println("\n=== GETTER / SETTER BANGUNDATAR ===");
        p2.setWarna("Oranye");
        p2.setBorder("Coklat");
        p2.setJmlSisi(4);
        System.out.println("Warna p2    : " + p2.getWarna());
        System.out.println("Border p2   : " + p2.getBorder());
        System.out.println("Jml sisi p2 : " + p2.getJmlSisi());

        System.out.println("\n=== GETTER / SETTER KHUSUS ===");
        p2.setSisi(8);
        System.out.println("Sisi p2     : " + p2.getSisi());
        l2.setJariJari(7);
        System.out.println("Jari-jari l2: " + l2.getJariJari());

        System.out.println("\n=== LUAS & KELILING ===");
        System.out.println("Luas p1     : " + p1.getLuas());
        System.out.println("Keliling p1 : " + p1.getKeliling());
        System.out.println("Luas l1     : " + l1.getLuas());
        System.out.println("Keliling l1 : " + l1.getKeliling());

        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("p1 == p2 (luas)      : " + p1.isEqualLuas(p2));
        System.out.println("p1 == l1 (luas)      : " + p1.isEqualLuas(l1));
        System.out.println("p1 == p2 (keliling)  : " + p1.isEqualKeliling(p2));
        System.out.println("p1 == l1 (keliling)  : " + p1.isEqualKeliling(l1));

        System.out.println("\n=== RESIZE  ===");
        System.out.println("Sisi p2 sebelum zoom : " + p2.getSisi());
        p2.zoomIn();
        System.out.println("Sisi p2 zoomIn       : " + p2.getSisi());
        p2.zoomOut();
        System.out.println("Sisi p2 zoomOut      : " + p2.getSisi());
        p2.zoom(150);
        System.out.println("Sisi p2 zoom(150)    : " + p2.getSisi());

        System.out.println("Jari2 l2 sebelum zoom: " + l2.getJariJari());
        l2.zoomIn();
        System.out.println("Jari2 l2 zoomIn      : " + l2.getJariJari());
        l2.zoomOut();
        System.out.println("Jari2 l2 zoomOut     : " + l2.getJariJari());
        l2.zoom(120);
        System.out.println("Jari2 l2 zoom(120)   : " + l2.getJariJari());

        System.out.println("\n=== JUMLAH OBJEK BANGUNDATAR ===");
        BangunDatar.printCounterBangunDatar();
       
    }

    /* ============================== JAWABAN MODUL ABSTRACT CLASS ============================== */
    /*  1. Hasilnya error karena BangunDatar sudah dijadikan abstract class yang objeknya
          tidak boleh dibuat secara langsung. Untuk BangunDatar P1 = new Persegi(10) itu
          bisa dijalankan karena objek aslinya tetap persegi atau lingkaran, walaupun dengan
          menggunakan tipe referensi berupa BangunDatar.

        2. Ya, method isEqualLuas() dan isEqualKeliling() dapat dipakai untuk
          membandingkan bangun datar yang berbeda (misalnya persegi dan lingkaran), karena
          parameternya bertipe BangunDatar dan menggunakan polimorfisme milik objek aslinya.
          
        3. Jika BangunDatar tidak abstract maka tetap bisa membuat isEqualLuas() dan isEqualKeliling()
          tetapi harus diberikan implementasi konkrit untuk getLuas() dan getKeliling() di BangunDatar
          sehingga desainnya kurang modular untuk digunakan kembali.

        4. Kelebihan BangunDatar sebagai abstract class yaitu mencegah pembuatan objek BangunDatar yang
          tidak memiliki bentuk spesifik, memaksa semua kelas anak untuk mengimplementasikan getLuas() dan
          getKeliling() serta desain dari kelas lebih konsisten.
     */

    /* ============================== JAWABAN MODUL INTERFACE ============================== */
    /*  1. Hasil eksperimen pemanggilan metode IResize di main adalah sesuai dengan deskripsi
          dari masing masing fungsi, yaitu zoomIn memperbesar 10%, zoomOut memperkecil 10%, dan zoom
          memperbesar/memperkecil sesuai dengan paramter input yang diberikan.

        2. Keuntungan menggunakan interface IResize dibandingkan dengan abstract method adalah 
          lebih fleksibel dalam pengimplementasiannya, lalu interface juga memudahkan pemakaian dalam
          polimorfisme yang berbasis metode/perilaku dan interface juga memisahkan bentuk/karakter
          dari class dengan kemampuan yang dapat dilakukan oleh class tersebut.
     */
}
