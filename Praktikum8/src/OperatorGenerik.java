/* Nama File : OperatorGenerik.java
  Deskripsi : Berisi method generik pada class OperatorGenerik.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 3 Mei 2026
*/

public class OperatorGenerik {

    /* METHOD */
    // Method generik untuk menukar isi dua datum
    public <T> void tukar(Datum<T> datum1, Datum<T> datum2) {
        T sementara = datum1.getIsi();
        datum1.setIsi(datum2.getIsi());
        datum2.setIsi(sementara);
    }

    // Method generik untuk menjumlahkan bobot dua objek turunan kucing
    public <T extends Kucing> double bobot2(T kucing1, T kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}
