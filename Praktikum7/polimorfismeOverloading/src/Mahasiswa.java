/* Nama File : Mahasiswa.java
 * Deskripsi : Kelas Mahasiswa untuk mendemonstrasikan polimorfisme ad hoc overloading.
 * Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
 * Tanggal   : 25 April 2026
 */

public class Mahasiswa {
    /* ATRIBUT */
	private int nim;
	private String nama;
	private String programStudi;

    /* METODE */
    // Konstruktor tanpa parameter
	public Mahasiswa() {
		this.nim = -999;
		this.nama = "n/a";
		this.programStudi = "n/a";
	}

    // Konstruktor dengan 3 parameter
	public Mahasiswa(int nim, String nama, String programStudi) {
		this.nim = nim;
		this.nama = nama;
		this.programStudi = programStudi;
	}

	// Konstruktor kloning objek lain
	public Mahasiswa(Mahasiswa mahasiswaLain) {
		this.nim = mahasiswaLain.nim;
		this.nama = mahasiswaLain.nama;
		this.programStudi = mahasiswaLain.programStudi;
	}

	// Set Program Studi menjadi kosong
	public void setProgramStudi() {
		this.programStudi = "Kosong";
	}

	// Set Program Studi dari String
	public void setProgramStudi(String programStudi) {
		this.programStudi = programStudi;
	}

	// Set Program Studi dari objek Mahasiswa lain
	public void setProgramStudi(Mahasiswa mahasiswaLain) {
		this.programStudi = mahasiswaLain.programStudi;
	}

	// Menampilkan data mahasiswa
	public void tampilkanData() {
		System.out.println("NIM          : " + nim);
		System.out.println("Nama         : " + nama);
		System.out.println("Program Studi: " + programStudi);
	}
}
