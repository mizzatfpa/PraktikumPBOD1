/* Nama File : Main.java
  Deskripsi : Berisi implementasi dari inheritance
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Maret 2026
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTASI INHERITANCE ===\n");

        BangunDatar bangunUmum = new BangunDatar(0, "Abu-abu", "Tipis");
        Lingkaran lingkaran = new Lingkaran(14, "Merah", "Putus-putus");
        Persegi persegi = new Persegi(8, "Biru", "Tebal");

        System.out.println("1. Objek parent (BangunDatar)");
        bangunUmum.printInfo();

        System.out.println("\n2. Objek child (Lingkaran) -> mewarisi class BangunDatar");
        lingkaran.printInfo();

        System.out.println("\n3. Objek child (Persegi) -> mewarisi class BangunDatar");
        persegi.printInfo();

        System.out.println("\n4. Referensi parent menyimpan objek child");
        BangunDatar[] daftarBangun = {
            lingkaran,
            persegi,
            new Lingkaran(10, "Hijau", "Garis-garis")
        };

        for (int i = 0; i < daftarBangun.length; i++) {
            System.out.println("\nData bangun ke-" + (i + 1));
            daftarBangun[i].printInfo();
        }

        System.out.println();
        BangunDatar.printCounterBangunDatar();

        /* ====================================== JAWABAN MODUL ====================================== */
        /* JAWABAN BAGIAN 1 */
        /* Tidak bisa karena atribut pada class bangun datar memiliki modifier private
        sehingga tidak bisa diakses oleh subclassnya, dan harus memanggil method yang disediakan */

        /* JAWABAN BAGIAN 3 */
        /* Hasil yang dihasilkan dari melakukan overriding pada method printCounterBangunDatar() adalah error */

        /* JAWABAN BAGIAN 4 */
        /* Setelah dilakukan modifikasi dengan mengganti akses modifiernya menjadi protected maka
        atribut akan dapat diakses oleh subclass-subclassnya sehingga kode akan dapat dijalankan dengan normal
        tanpa memerlukan method selektor khusus*/

        /* JAWABAN BAGIAN 5 */
        /* Penambahan keyword final akan membuat suatu class tidak dapat diturunkan kembali
         dan akan menghasilkan error pada subclass dari bangun datar. Penambahan pada method printInfo
         juga akan menyebabkan hal yang sama */
    }
}
