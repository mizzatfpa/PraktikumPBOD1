/* Nama File : Datum.java
  Deskripsi : Berisi atribut dan method pada class generik Datum.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class Datum<T> {

    /* ATRIBUT */
    private T isi;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Datum() {
        this.isi = null;
    }

    // Konstruktor dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    // Selektor dan mutator untuk isi
    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
