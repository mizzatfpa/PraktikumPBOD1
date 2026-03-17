/* Nama File : PNS.java
  Deskripsi : Berisi implementasi class PNS turunan dari Manusia.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {

    /* ATRIBUT */
    private String nip;
    private static int counterPNS = 0;

    // A = digit ke-14 NIM 24060124130096
    private static final int A = 6;

    /* METHOD */
    // Konstruktor dengan parameter lengkap
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor tanpa parameter alamat
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor dan mutator untuk NIP
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // Selektor untuk counter PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Metode untuk menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        return hitungSelisihTahun() + A;
    }

    // Metode untuk menghitung pajak PNS
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Metode untuk menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        System.out.println("\n=== INFO PNS ===");
        super.cetakInfo();
        System.out.println("NIP              : " + nip);
        System.out.println("Counter PNS      : " + counterPNS);
    }
}
