/* Nama File : MainPiaraan.java
  Deskripsi : Berisi aplikasi class Piaraan pada praktikum koleksi.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Mei 2026
*/

public class MainPiaraan {
    public static void main(String[] args) throws Exception {
        /* Objek anabul */
        Anabul anjing = new Anjing("Buddy");
        Anabul burung = new Burung("Kiki");
        Anggora anggora = new Anggora("Luna", 4.5);
        Kembangtelon kembangtelon = new Kembangtelon("Bona", 5.1);

        /* Objek piaraan */
        Piaraan piaraan = new Piaraan();

        System.out.println("=== KOLEKSI KELAS BENTUKAN ===");
        piaraan.enqueueAnabul(anjing);
        piaraan.enqueueAnabul(burung);
        piaraan.enqueueAnabul(anggora);
        piaraan.enqueueAnabul(kembangtelon);

        System.out.println("Banyak elemen piaraan     : " + piaraan.getNbelm());
        System.out.println("Anabul terdepan antrean   : " + piaraan.getAnabul().getNama());
        System.out.println("Apakah Luna dalam antrean : " + piaraan.isMember(anggora));

        System.out.println();
        System.out.println("Daftar nama anabul:");
        piaraan.showAnabul();

        System.out.println();
        System.out.println("Jumlah keluarga kucing : " + piaraan.countKucing());
        System.out.println("Total bobot kucing     : " + piaraan.bobotKucing() + " kg");

        System.out.println();
        System.out.println("Daftar jenis anabul:");
        piaraan.showJenisAnabul();

        System.out.println();
        Anabul anabulKeluar = piaraan.dequeueAnabul();
        System.out.println("Anabul keluar antrean : " + anabulKeluar.getNama());
        System.out.println("Sisa elemen piaraan   : " + piaraan.getNbelm());
    }
}

/* Renungan
   Koleksi pada soal ini bekerja dengan menyimpan objek-objek Anabul dalam array statis yang diperlakukan
   sebagai antrean. Elemen pertama dapat diambil lebih dulu, elemen baru masuk di bagian akhir, dan isi
   dari koleksi tetap bisa ditelusuri untuk menghitung jenis tertentu maupun menampilkan informasi setiap objek.
*/
