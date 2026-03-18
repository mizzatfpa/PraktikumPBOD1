/* Nama File : DosenTamu.java
  Deskripsi : Berisi atribut dan metode-metode dalam class DosenTamu
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    
    /* ATRIBUT */
    private String nidk;
    private LocalDate tanggalSelesaiKontrak;

    /* METHOD */
    // Konstruktor dengan parameter
    public DosenTamu (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalSelesaiKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalSelesaiKontrak = tanggalSelesaiKontrak;
      }

    // Selektor dan mutator untuk NIDK dosen tamu
    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    // Selektor dan mutator untuk tanggal selesai kontrak
    public LocalDate getTanggalSelesaiKontrak() {
        return tanggalSelesaiKontrak;
    }

    public void setTanggalSelesaiKontrak(LocalDate tanggalSelesaiKontrak) {
        this.tanggalSelesaiKontrak = tanggalSelesaiKontrak;
    }

    // Method untuk menghitung masa kontrak tersisa
    private Period hitungSisaKontrak() {
        LocalDate today = LocalDate.now();

        if (tanggalSelesaiKontrak.isBefore(today)) {
            return Period.ZERO;
        }

        return Period.between(today, tanggalSelesaiKontrak);
    }

    // Method untuk menghitung tunjangan sebesar 2.5% x gaji pokok
    private double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    // Method untuk menampilkan informasi lengkap tentang dosen tamu
    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        Period kontrakTersisa = hitungSisaKontrak();
        double tunjangan = hitungTunjangan();

        System.out.println("NIP        : " + nip);
        System.out.println("NIDK       : " + nidk);
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Lahir : " + formatDate(tanggalLahir));
        System.out.println("TMT        : " + formatDate(tmt));
        System.out.println("Jabatan    : Dosen Tamu");
        System.out.println("Fakultas   : " + fakultas);
        System.out.println("Masa Kerja : " + formatMasaKerja(masaKerja));
        System.out.println("Masa Kontrak Tersisa : " + formatMasaKerja(kontrakTersisa));
        System.out.println("Tanggal Berakhir Kontrak : " + formatDate(tanggalSelesaiKontrak));
        System.out.println("Gaji Pokok : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan  : 2,5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
