/* Nama File : Anabul.java
  Deskripsi : Berisi atribut dan method pada abstract class Anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public abstract class Anabul {

    /* ATRIBUT */
    protected String nama;

    /* METHOD */
    // Konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Selektor dan mutator untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method abstrak untuk gerak
    public abstract void gerak();

    // Method abstrak untuk bersuara
    public abstract void bersuara();
}