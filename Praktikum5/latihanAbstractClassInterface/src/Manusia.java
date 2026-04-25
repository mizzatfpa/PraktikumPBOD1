/* Nama File : Manusia.java
  Deskripsi : Berisi atribut dan method pada abstract class Manusia.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {

    /* ATRIBUT */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /* METHOD */
    // Konstruktor dengan parameter lengkap
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Konstruktor tanpa parameter alamat
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this(nama, tgl_mulai_kerja, "-", pendapatan);
    }

    // Selektor dan mutator untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Selektor dan mutator untuk tanggal mulai kerja
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Selektor dan mutator untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Selektor dan mutator untuk pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Selektor untuk counter manusia
    public static int getCounterMns() {
        return counterMns;
    }

    // Metode untuk menghitung selisih tahun
    protected int hitungSelisihTahun() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    // Metode format tanggal
    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return tanggal.format(formatter);
    }

    // Menampilkan informasi atribut Manusia
    public void cetakInfo() {
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Mulai    : " + formatTanggal(tgl_mulai_kerja));
        System.out.println("Alamat           : " + alamat);
        System.out.println("Pendapatan       : " + pendapatan);
        System.out.println("Counter Manusia  : " + counterMns);
    }

    // Metode abstrak untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}