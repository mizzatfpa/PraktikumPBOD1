/* Nama File : MainDatum.java
  Deskripsi : Berisi implementasi class generik Datum menggunakan keluarga class Anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class MainDatum {
    public static void main(String[] args) throws Exception {
        /* Objek anabul */
        Anabul anjing = new Anjing("Buddy");
        Anabul burung = new Burung("Kiki");
        Kucing kucing = new Kucing("Mimi", 3.2);
        Anggora anggora = new Anggora("Luna", 4.5);
        Kembangtelon kembangtelon = new Kembangtelon("Bona", 5.1);

        /* Objek datum */
        Datum<Anabul> datumAnabul = new Datum<>();

        System.out.println("=== GENERIK PADA CLASS DATUM ===");
        datumAnabul.setIsi(anjing);
        System.out.println("Isi datum pertama  : " + datumAnabul.getIsi().getNama());
        System.out.print("Gerak              : ");
        datumAnabul.getIsi().gerak();
        System.out.print("Bersuara           : ");
        datumAnabul.getIsi().bersuara();

        System.out.println();
        datumAnabul.setIsi(burung);
        System.out.println("Isi datum kedua    : " + datumAnabul.getIsi().getNama());
        System.out.print("Gerak              : ");
        datumAnabul.getIsi().gerak();
        System.out.print("Bersuara           : ");
        datumAnabul.getIsi().bersuara();

        System.out.println();
        datumAnabul.setIsi(kucing);
        System.out.println("Isi datum ketiga   : " + datumAnabul.getIsi().getNama());
        System.out.print("Gerak              : ");
        datumAnabul.getIsi().gerak();
        System.out.print("Bersuara           : ");
        datumAnabul.getIsi().bersuara();
        System.out.println("Bobot              : " + ((Kucing) datumAnabul.getIsi()).getBobot() + " kg");

        System.out.println();
        datumAnabul.setIsi(anggora);
        System.out.println("Isi datum keempat  : " + datumAnabul.getIsi().getNama());
        System.out.print("Gerak              : ");
        datumAnabul.getIsi().gerak();
        System.out.print("Bersuara           : ");
        datumAnabul.getIsi().bersuara();
        System.out.println("Bobot              : " + ((Kucing) datumAnabul.getIsi()).getBobot() + " kg");

        System.out.println();
        datumAnabul.setIsi(kembangtelon);
        System.out.println("Isi datum kelima   : " + datumAnabul.getIsi().getNama());
        System.out.print("Gerak              : ");
        datumAnabul.getIsi().gerak();
        System.out.print("Bersuara           : ");
        datumAnabul.getIsi().bersuara();
        System.out.println("Bobot              : " + ((Kucing) datumAnabul.getIsi()).getBobot() + " kg");
    }
}
