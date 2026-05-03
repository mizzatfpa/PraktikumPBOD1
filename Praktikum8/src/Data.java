/* Nama File : Data.java
  Deskripsi : Berisi atribut dan method pada class generik Data.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class Data<T> {

    /* ATRIBUT */
    private T[] ruang;
    private int banyak;

    /* METHOD */
    // Konstruktor tanpa parameter
    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // Method untuk mendapatkan isi pada posisi tertentu
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus berada pada rentang 1 sampai 100.");
        }
        return ruang[posisi - 1];
    }

    // Method untuk mengubah isi pada posisi tertentu
    public void setIsi(int posisi, T isiBaru) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Posisi harus berada pada rentang 1 sampai 100.");
        }

        if (ruang[posisi - 1] == null && isiBaru != null) {
            banyak++;
        } else if (ruang[posisi - 1] != null && isiBaru == null) {
            banyak--;
        }

        ruang[posisi - 1] = isiBaru;
    }

    // Method untuk mendapatkan banyak elemen efektif
    public int getSize() {
        return banyak;
    }
}
