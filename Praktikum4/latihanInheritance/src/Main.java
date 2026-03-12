/* Nama File : Main.java
  Deskripsi : Berisi demonstrasi implementasi class hierarchy untuk manajemen pegawai
              yang terdiri dari Dosen Tetap, Dosen Tamu, dan Tenaga Kependidikan (Tendik).
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 12 Maret 2026
*/

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		System.out.println("========== SISTEM INFORMASI KEPEGAWAIAN PERGURUAN TINGGI ==========\n");
		
		// ========== DATA DOSEN TETAP ==========
		DosenTetap dosenTetap = new DosenTetap(
			"9545647548",
			"Andi",
			LocalDate.of(1990, 5, 5),
			LocalDate.of(2015, 1, 1),
			5_000_000,
			"Fakultas Sains dan Matematika",
			"78647324"
		);

		// ========== DATA DOSEN TAMU ==========
		DosenTamu dosenTamu = new DosenTamu(
			"1987654321",
			"Budi",
			LocalDate.of(1988, 9, 18),
			LocalDate.of(2020, 2, 1),
			4_500_000,
			"Fakultas Teknik",
			"45781239",
			LocalDate.of(2027, 12, 31)
		);

		// ========== DATA TENAGA KEPENDIDIKAN (TENDIK) ==========
		Tendik tendik = new Tendik(
			"1978123456",
			"Citra",
			LocalDate.of(1992, 7, 11),
			LocalDate.of(2018, 3, 1),
			4_000_000,
			"Akademik"
		);

		// ========== MENAMPILKAN INFORMASI PEGAWAI ==========
		System.out.println("========== INFORMASI DOSEN TETAP ==========");
		dosenTetap.printInfo();
		System.out.println("\n========== INFORMASI DOSEN TAMU ==========");
		dosenTamu.printInfo();
		System.out.println("\n========== INFORMASI TENDIK ==========");
		tendik.printInfo();
        System.out.println();
	}
}