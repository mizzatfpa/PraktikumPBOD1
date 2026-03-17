/* Nama File : Petani.java
  Deskripsi : Berisi implementasi class Petani turunan dari Manusia.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {

    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani = 0;

    // C = digit ke-12 NIM 24060124130096
    private static final int C = 0;

    /* METHOD */
    // Konstruktor dengan parameter lengkap
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Konstruktor tanpa parameter alamat
    public Petani(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor dan mutator untuk asal kota
    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Selektor untuk counter Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Metode untuk menghitung masa kerja Petani
    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + C;
    }

    // Metode untuk menghitung pajak Petani
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Metode untuk menampilkan informasi Petani
    @Override
    public void cetakInfo() {
        System.out.println("\n=== INFO PETANI ===");
        super.cetakInfo();
        System.out.println("Asal Kota        : " + asal_kota);
        System.out.println("Counter Petani   : " + counterPetani);
    }
}
