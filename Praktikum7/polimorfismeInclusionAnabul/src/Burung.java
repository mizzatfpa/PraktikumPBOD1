/* Nama File : Burung.java
  Deskripsi : Berisi atribut dan method pada class child Burung.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Burung extends Anabul {

    /* METHOD */
    // Konstruktor dengan parameter
    public Burung(String nama) {
        super(nama);
    }

    // Method untuk membuat burung bergerak
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    // Method untuk membuat burung bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara cuit.");
    }
}