/* Nama File : Anjing.java
  Deskripsi : Berisi atribut dan method pada class child Anjing.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
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
        System.out.println(nama + " bergerak dengan melata.");
    }

    // Method untuk membuat anjing bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk.");
    }
}