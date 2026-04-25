/* Nama File : Kucing.java
  Deskripsi : Berisi atribut dan method pada class child Kucing.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Kucing extends Anabul {

    /* METHOD */
    // Konstruktor dengan parameter
    public Kucing(String nama) {
        super(nama);
    }

    // Method untuk membuat kucing bergerak
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    // Method untuk membuat kucing bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara meong.");
    }
}