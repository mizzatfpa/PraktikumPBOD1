/* Nama File : Kucing.java
  Deskripsi : Berisi atribut dan method pada class child Kucing.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class Kucing extends Anabul {

    /* ATRIBUT */
    protected double bobot;

    /* METHOD */
    // Konstruktor dengan parameter
    public Kucing(String nama) {
        super(nama);
        this.bobot = 0;
    }

    // Konstruktor dengan parameter nama dan bobot
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Selektor dan mutator untuk bobot
    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
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
