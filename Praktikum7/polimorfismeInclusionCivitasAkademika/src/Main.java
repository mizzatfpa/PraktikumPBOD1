/* Nama File : Main.java
  Deskripsi : Berisi implementasi polimorfisme inclusion pada Civitas Akademika.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Main {
    public static void main(String[] args) {
        /* Objek dosen */
        Dosen dosen1 = new Dosen("12345", "Budi Santoso");
        Dosen dosen2 = new Dosen("67890", "Siti Aminah");

        /* Objek mahasiswa */
        Mahasiswa mahasiswa1 = new Mahasiswa("241001", "Andi Pratama");
        Mahasiswa mahasiswa2 = new Mahasiswa("241002", "Bella Putri");
        Mahasiswa mahasiswa3 = new Mahasiswa("241003", "Candra Wijaya");
        Mahasiswa mahasiswa4 = new Mahasiswa("241004", "Dewi Lestari");
        Mahasiswa mahasiswa5 = new Mahasiswa("241005", "Eko Saputra");

        /* Mengubah dosen wali */
        mahasiswa1.setWali(dosen1);
        mahasiswa2.setWali(dosen1);
        mahasiswa3.setWali(dosen2);
        mahasiswa4.setWali(dosen2);
        mahasiswa5.setWali(dosen1);

        /* Objek seminar */
        Seminar seminar = new Seminar();

        /* Registrasi peserta seminar */
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mahasiswa1);
        seminar.registrasi(mahasiswa2);
        seminar.registrasi(mahasiswa3);
        seminar.registrasi(mahasiswa4);
        seminar.registrasi(mahasiswa5);

        System.out.println("=== DATA PESERTA SEMINAR ===");
        seminar.tampilPeserta();

        System.out.println("Jumlah peserta seminar: " + seminar.countPeserta());
        System.out.println("Jumlah mahasiswa seminar: " + seminar.countMahasiswa());

        System.out.println();
        System.out.println("=== DATA MAHASISWA ===");
        mahasiswa1.tampilDataMahasiswa();
        System.out.println();
        mahasiswa2.tampilDataMahasiswa();
        System.out.println();
        mahasiswa3.tampilDataMahasiswa();
        System.out.println();
        mahasiswa4.tampilDataMahasiswa();
        System.out.println();
        mahasiswa5.tampilDataMahasiswa();
    }
}
