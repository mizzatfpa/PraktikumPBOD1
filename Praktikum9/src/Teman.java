/* Nama File : Teman.java
  Deskripsi : Berisi atribut dan method pada class Teman untuk mengelola koleksi nama teman.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Mei 2026
*/

import java.util.*;

public class Teman {

    /* ATRIBUT */
    private int nbelm;
    private ArrayList<String> Lnama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    // Method untuk mendapatkan banyak elemen
    public int getNbelm() {
        return nbelm;
    }

    // Method untuk mendapatkan nama pada indeks tertentu
    public String getNama(int indeks) {
        if (indeks < 0 || indeks >= nbelm) {
            throw new IllegalArgumentException("Indeks tidak valid.");
        }
        return Lnama.get(indeks);
    }

    // Method untuk mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks < 0 || indeks >= nbelm) {
            throw new IllegalArgumentException("Indeks tidak valid.");
        }
        Lnama.set(indeks, nama);
    }

    // Method untuk menambahkan nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // Method untuk menghapus nama
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // Method untuk mengecek keanggotaan nama
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Method untuk mengganti nama tertentu menjadi nama baru
    public void gantiNama(String nama, String namaBaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namaBaru);
        }
    }

    // Method untuk menghitung banyak kemunculan nama
    public int countNama(String nama) {
        int banyak = 0;
        for (String namaTeman : Lnama) {
            if (namaTeman.equals(nama)) {
                banyak++;
            }
        }
        return banyak;
    }

    // Method untuk menampilkan semua nama teman
    public void showTeman() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}
