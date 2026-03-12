/* Nama File : DosenTetap.java
  Deskripsi : Berisi atribut dan metode-metode dalam class DosenTetap
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    
    /* ATRIBUT */
    private String nidn;
    private static final int BUP = 65;

    /* METHOD */
    // Konstruktor dengan parameter
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Method untuk menghitung batas usia pensiun (BUP) dengan rumus tanggal lahir + 65 (1 bulan setelah tanggal lahir + 65)
    private LocalDate hitungBUP(){
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Method untuk menghitung tunjangan dengan rumus 2% x masa kerja x gaji pokok
    private double hitungTunjangan(){
        return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
    }

    // Method untuk menampilkan informasi lengkap mengenai dosen tetap
    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        double tunjangan = hitungTunjangan();

        System.out.println("NIP        : " + nip);
        System.out.println("NIDN       : " + nidn);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
        System.out.println("TMT        : " + formatDate(tmt));
        System.out.println("Jabatan    : Dosen Tetap");
        System.out.println("Fakultas   : " + fakultas);
        System.out.println("Masa Kerja : " + formatMasaKerja(masaKerja));
        System.out.println("Tanggal Pensiun : " + formatDate(hitungBUP()));
        System.out.println("Gaji Pokok : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan  : 2% x " + masaKerja.getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
