/* Nama File : Main.java
  Deskripsi : Berisi implementasi dari polimorfisme universal inclusion pada Anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Main {
    public static void main(String[] args) throws Exception {
        /* Objek anabul */
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        System.out.println("=== SIMULASI ANABUL ===");
        kucing.gerak();
        kucing.bersuara();

        System.out.println();
        anjing.gerak();
        anjing.bersuara();

        System.out.println();
        burung.gerak();
        burung.bersuara();

        System.out.println();
        Anabul[] daftarAnabul = {kucing, anjing, burung};

        System.out.println("=== POLIMORFISME UNIVERSAL INCLUSION ===");
        for (Anabul anabul : daftarAnabul) {
            System.out.println("Nama    : " + anabul.getNama());
            System.out.print("Gerak   : ");
            anabul.gerak();
            System.out.print("Bersuara: ");
            anabul.bersuara();
            System.out.println();
        }
    }
}
