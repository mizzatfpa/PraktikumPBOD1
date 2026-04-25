/* Nama File : Main.java
 * Deskripsi : Program penggunaan polimorfisme ad hoc overloading pada kelas Mahasiswa.
 * Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
 * Tanggal   : 25 April 2026
 */

public class Main {
	public static void main(String[] args) {
		// Membuat objek dengan nilai default
		Mahasiswa mahasiswaDefault = new Mahasiswa();
		// Membuat Objek dengan data input
		Mahasiswa mahasiswaData = new Mahasiswa(24120012, "Andi Wijaya", "Informatika");
		// Membuat Objek sumber untuk kloning dan overloading
		Mahasiswa mahasiswaAsal = new Mahasiswa(24060124, "Andi", "Teknik Informatika");
		// Membuat Hasil kloning objek lain
		Mahasiswa mahasiswaKloning = new Mahasiswa(mahasiswaAsal);

		// Menampilkan konstruktor tanpa parameter
		System.out.println("=== A. Konstruktor Mahasiswa Tanpa Parameter ===");
		mahasiswaDefault.tampilkanData();
		System.out.println();

		// Menampilkan konstruktor tiga parameter
		System.out.println("=== B. Konstruktor Mahasiswa Tiga Parameter ===");
		mahasiswaData.tampilkanData();
		System.out.println();

		// Menampilkan konstruktor kloning
		System.out.println("=== C. Konstruktor Mahasiswa Satu Parameter Objek Mahasiswa Lain ===");
		mahasiswaKloning.tampilkanData();
		System.out.println();

		// Menguji setProgramStudi tanpa parameter
		System.out.println("=== D. setProgramStudi Tanpa Parameter ===");
		mahasiswaDefault.setProgramStudi();
		mahasiswaDefault.tampilkanData();
		System.out.println();

		// Menguji setProgramStudi dengan String
		System.out.println("=== E. setProgramStudi Dengan String ===");
		mahasiswaDefault.setProgramStudi("Sistem Informasi");
		mahasiswaDefault.tampilkanData();
		System.out.println();

		// Menguji setProgramStudi dengan objek lain
		System.out.println("=== F. setProgramStudi Dengan Objek Mahasiswa Lain ===");
		mahasiswaDefault.setProgramStudi(mahasiswaAsal);
		mahasiswaDefault.tampilkanData();
	}
}
