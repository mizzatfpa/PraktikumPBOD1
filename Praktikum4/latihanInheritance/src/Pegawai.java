/* Nama File : Pegawai.java
  Deskripsi : Berisi atribut dan metode-metode dalam class Pegawai
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 12 Maret 2026
*/

import java.time.Period;
import java.time.LocalDate;
import java.util.Locale;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

public class Pegawai {

    /* ATRIBUT */
    protected String nama;
    protected String nip;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /* METHOD */
    // Konstruktor dengan parameter
    public Pegawai (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nama = nama;
        this.nip = nip;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Selektor dan mutator untuk nama pegawai
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Selektor dan mutator untuk NIP pegawai
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // Selektor dan mutator untuk tanggal lahir pegawai
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    // Selektor dan mutator untuk TMT pegawai
    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    // Selektor dan mutator untuk gaji pokok pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menghitung masa kerja
    protected Period hitungMasaKerja(){
        LocalDate today = LocalDate.now();
        return Period.between(tmt, today);
    }

    // Method untuk memformat tanggal
    protected String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }

    // Method untuk melakukan format masa kerja
    protected String formatMasaKerja(Period period) {
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    // Method untuk memformat nominal rupiah sesuai format Indonesia
    protected String formatRupiah(double nominal) {
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
        return rupiahFormat.format(nominal);
    }

    // Method untuk menghitung dan menampilkan informasi pegawai
    public void printInfo() {
        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
        System.out.println("TMT        : " + formatDate(tmt));
        System.out.println("Gaji Pokok : " + formatRupiah(gajiPokok));
    }
}
