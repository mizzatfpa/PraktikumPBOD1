/* Nama File : AngkaSialException.java
 * Deskripsi : Program penggunaan exception buatan sendiri menolak angka 13
 * Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
 * Tanggal   : 31 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}
