public class MMahasiswa {
    public static void main(String[] args) {

        /* Uji coba relasi antar objek */
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ASD = new MataKuliah("ASD", "Algoritma dan Struktur Data", 4);
        MataKuliah Kalkulus = new MataKuliah("KAL", "Kalkulus", 2);
        MataKuliah Jarkom = new MataKuliah("JAR", "Jaringan Komputer", 3);

        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Dosen D2 = new Dosen("124", "Budi", "Informatika");

        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        Kendaraan K2 = new Kendaraan("H5678CD", "mobil");

        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Mahasiswa M2 = new Mahasiswa("235", "Dina", "Informatika");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.addMatkul(ASD);

        M2.setDosenWali(D2);
        M2.setKendaraan(K2);
        M2.addMatkul(PBO);
        M2.addMatkul(Kalkulus);
        M2.addMatkul(Jarkom);

        System.out.println("=== Detail Mahasiswa 1 ===");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        System.out.println();
        System.out.println("=== Detail Mahasiswa 2 ===");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
    }
}
