/* Nama File : MainOperatorGenerik.java
  Deskripsi : Berisi implementasi class OperatorGenerik pada integer, string, dan keluarga class Anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class MainOperatorGenerik {
    public static void main(String[] args) throws Exception {
        /* Objek operator generik */
        OperatorGenerik operator = new OperatorGenerik();

        /* Objek datum integer */
        Datum<Integer> datumInteger1 = new Datum<>(3);
        Datum<Integer> datumInteger2 = new Datum<>(6);

        /* Objek datum string */
        Datum<String> datumString1 = new Datum<>("satu");
        Datum<String> datumString2 = new Datum<>("dua");

        /* Objek keluarga anabul */
        Anabul anjing = new Anjing("Buddy");
        Kucing kucing = new Kucing("Mimi", 3.2);
        Anggora anggora = new Anggora("Luna", 4.5);
        Kembangtelon kembangtelon = new Kembangtelon("Bona", 5.1);

        /* Objek datum anabul */
        Datum<Anabul> datumAnabul1 = new Datum<>(anjing);
        Datum<Anabul> datumAnabul2 = new Datum<>(kucing);

        System.out.println("=== GENERIK PADA OPERATOR ===");
        System.out.println("Sebelum tukar integer : " + datumInteger1.getIsi() + " dan " + datumInteger2.getIsi());
        operator.tukar(datumInteger1, datumInteger2);
        System.out.println("Sesudah tukar integer : " + datumInteger1.getIsi() + " dan " + datumInteger2.getIsi());

        System.out.println();
        System.out.println("Sebelum tukar string  : " + datumString1.getIsi() + " dan " + datumString2.getIsi());
        operator.tukar(datumString1, datumString2);
        System.out.println("Sesudah tukar string  : " + datumString1.getIsi() + " dan " + datumString2.getIsi());

        System.out.println();
        System.out.println("Sebelum tukar anabul  : " + datumAnabul1.getIsi().getNama() + " dan " + datumAnabul2.getIsi().getNama());
        operator.tukar(datumAnabul1, datumAnabul2);
        System.out.println("Sesudah tukar anabul  : " + datumAnabul1.getIsi().getNama() + " dan " + datumAnabul2.getIsi().getNama());

        System.out.println();
        System.out.println("Jumlah bobot dua kucing : " + operator.bobot2(anggora, kembangtelon) + " kg");
    }
}
