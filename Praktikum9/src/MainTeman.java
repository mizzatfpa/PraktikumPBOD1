/* Nama File : MainTeman.java
  Deskripsi : Berisi aplikasi class Teman pada praktikum koleksi.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) throws Exception {
        /* Objek teman */
        Teman teman = new Teman();

        System.out.println("=== KOLEKSI KELAS DASAR ===");
        teman.addNama("Alya");
        teman.addNama("Bima");
        teman.addNama("Citra");
        teman.addNama("Bima");

        System.out.println("Banyak elemen teman : " + teman.getNbelm());
        System.out.println("Nama pada indeks 1  : " + teman.getNama(1));
        System.out.println("Apakah Bima anggota : " + teman.isMember("Bima"));
        System.out.println("Banyak nama Bima    : " + teman.countNama("Bima"));

        teman.setNama(2, "Dinda");
        teman.gantiNama("Bima", "Bagas");
        teman.delNama("Bima");

        System.out.println();
        System.out.println("Daftar nama teman:");
        teman.showTeman();
    }
}

/* Renungan
   Koleksi pada soal ini bekerja sebagai wadah yang menyimpan banyak objek dengan satu nama entitas.
   Setiap elemen dapat ditambah, diubah, dihapus, dicek keanggotaannya, dan diakses berdasarkan indeks.
   Dengan menggunakan koleksi, pengelolaan data yang jumlahnya banyak menjadi lebih terstruktur dan efisien.
*/
