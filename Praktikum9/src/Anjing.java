/* Nama File : Anjing.java
  Deskripsi : Berisi atribut dan method pada class child Anjing.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class Anjing extends Anabul {

    /* METHOD */
    // Konstruktor dengan parameter
    public Anjing(String nama) {
        super(nama);
    }

    // Method untuk membuat anjing bergerak
    @Override
    public void gerak() {
        System.out.println(panggilan + " bergerak dengan melata.");
    }

    // Method untuk membuat anjing bersuara
    @Override
    public void bersuara() {
        System.out.println(panggilan + " bersuara guk-guk.");
    }
}
