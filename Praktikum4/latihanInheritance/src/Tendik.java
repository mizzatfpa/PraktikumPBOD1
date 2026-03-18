/* Nama File : Tendik.java
  Deskripsi : Berisi atribut dan metode-metode dalam class Tendik
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    
    /* ATRIBUT */
    private String bidang;
    private static final int BUP = 55;

    /* METHOD */
    // Konstruktor dengan parameter
    public Tendik (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;

        // Cek apakah bidang termasuk ke dalam akademik, kemahasiswaan, atau sumber daya
        if (!bidang.equals("Akademik") && !bidang.equals("Kemahasiswaan") && !bidang.equals("Sumber Daya")){
            throw new IllegalArgumentException("Bidang tidak memenuhi syarat");
        }
    }

    // Selektor dan mutator untuk bidang tendik
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        if (!bidang.equals("Akademik") && !bidang.equals("Kemahasiswaan") && !bidang.equals("Sumber Daya")){
            throw new IllegalArgumentException("Bidang tidak memenuhi syarat");
        }
        this.bidang = bidang;
    }

    // Method untuk menghitung batas usia pensiun (BUP)
    private LocalDate hitungBUP(){
        return tanggalLahir.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    // Method untuk menghitung tunjangan yaitu 1% x masa kerja x gaji pokok
    private double hitungTunjangan(){
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }

    // Method untuk menampilkan informasi tendik secara lengkap
    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        double tunjangan = hitungTunjangan();

        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
        System.out.println("TMT        : " + formatDate(tmt));
        System.out.println("Jabatan    : Tendik");
        System.out.println("Bidang     : " + bidang);
        System.out.println("Masa Kerja : " + formatMasaKerja(masaKerja));
        System.out.println("Tanggal Pensiun : " + formatDate(hitungBUP()));
        System.out.println("Gaji Pokok : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan  : 1% x " + masaKerja.getYears() + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
