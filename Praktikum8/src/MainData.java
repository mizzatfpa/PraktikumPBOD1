/* Nama File : MainData.java
  Deskripsi : Berisi implementasi class generik Data menggunakan keluarga class Anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class MainData {
    public static void main(String[] args) throws Exception {
        /* Objek anabul */
        Anabul anjing = new Anjing("Buddy");
        Anabul burung = new Burung("Kiki");
        Anggora anggora = new Anggora("Luna", 4.5);
        Kembangtelon kembangtelon = new Kembangtelon("Bona", 5.1);

        /* Objek data anabul */
        Data<Anabul> dataAnabul = new Data<>();

        System.out.println("=== LARIK GENERIK DATA ===");
        dataAnabul.setIsi(1, anjing);
        dataAnabul.setIsi(2, burung);
        dataAnabul.setIsi(3, anggora);
        dataAnabul.setIsi(4, kembangtelon);

        System.out.println("Banyak elemen data anabul : " + dataAnabul.getSize());
        System.out.println();

        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul anabul = dataAnabul.getIsi(i);

            System.out.println("Data ke-" + i);
            System.out.println("Nama    : " + anabul.getNama());
            System.out.print("Gerak   : ");
            anabul.gerak();
            System.out.print("Bersuara: ");
            anabul.bersuara();

            if (anabul instanceof Kucing) {
                System.out.println("Bobot   : " + ((Kucing) anabul).getBobot() + " kg");
            }
            System.out.println();
        }

        System.out.println("Isi elemen pada posisi 3 : " + dataAnabul.getIsi(3).getNama());
        System.out.println("Isi elemen pada posisi 4 : " + dataAnabul.getIsi(4).getNama());
    }
}
