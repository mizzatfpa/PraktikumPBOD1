/* Nama File : Pengusaha.java
  Deskripsi : Berisi implementasi class Pengusaha turunan dari Manusia.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {

    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha = 0;

    // B = digit ke-13 NIM 24060124130096
    private static final int B = 9;

    /* METHOD */
    // Konstruktor dengan parameter lengkap
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Konstruktor tanpa parameter alamat
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor dan mutator untuk NPWP
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Selektor untuk counter Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Metode untuk menghitung masa kerja Pengusaha
    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + B;
    }

    // Metode untuk menghitung pajak Pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Metode untuk menampilkan informasi Pengusaha
    @Override
    public void cetakInfo() {
        System.out.println("\n=== INFO PENGUSAHA ===");
        super.cetakInfo();
        System.out.println("NPWP             : " + npwp);
        System.out.println("Counter Pengusaha: " + counterPengusaha);
    }
}
