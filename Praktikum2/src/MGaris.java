/* Nama File    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 28 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("     Pengujian Kelas Garis (Objek Garis)   ");
        System.out.println("===========================================\n");

        // === 1. UJI KONSTRUKTOR DEFAULT ===
        System.out.println(">> 1. PENGUJIAN KONSTRUKTOR DEFAULT");
        System.out.println("--- Kasus: Membuat garis dengan konstruktor tanpa parameter ---");
        Garis g1 = new Garis();
        System.out.println("Garis g1 berhasil dibuat");
        System.out.println("Data g1:");
        g1.printGaris();
        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Gradien g1: " + g1.getGradien());
        System.out.print("Titik Tengah g1: ");
        g1.getTitikTengah().printTitik();
        System.out.println("\n");

        // === 2. UJI KONSTRUKTOR DENGAN PARAMETER (KASUS NORMAL) ===
        System.out.println(">> 2. PENGUJIAN KONSTRUKTOR DENGAN PARAMETER");
        System.out.println("--- Kasus Normal: Garis dari Titik(1,2) ke Titik(4,6) ---");
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(4, 6);
        Garis g2 = new Garis(t1, t2);
        System.out.println("Garis g2 berhasil dibuat");
        g2.printGaris();
        System.out.println("Panjang g2: " + g2.getPanjang());
        System.out.println("Gradien g2: " + g2.getGradien());
        System.out.print("Titik Tengah g2: ");
        g2.getTitikTengah().printTitik();
        System.out.println();

        // === 3. UJI KONSTRUKTOR DENGAN PARAMETER (KASUS TITIK SAMA) ===
        System.out.println("--- Kasus Khusus: Titik awal dan akhir sama Titik(3,3) ke Titik(3,3) ---");
        Titik t3 = new Titik(3, 3);
        Titik t4 = new Titik(3, 3);
        Garis g3 = new Garis(t3, t4);
        System.out.println("Garis g3 dengan titik sama:");
        g3.printGaris();
        System.out.println("Panjang g3: " + g3.getPanjang() + " (seharusnya 0)");
        System.out.println("Gradien g3: " + g3.getGradien() + " (undefined/tak terdefinisi)");
        System.out.print("Titik Tengah g3: ");
        g3.getTitikTengah().printTitik();
        System.out.println("\n");

        // === 4. UJI SELEKTOR getTitikAwal ===
        System.out.println(">> 3. PENGUJIAN SELEKTOR getTitikAwal");
        System.out.println("--- Verifikasi getter titik awal ---");
        System.out.print("Titik Awal g2: ");
        g2.getTitikAwal().printTitik();
        System.out.println("Ekspektasi: Titik(1, 2)");
        System.out.println();

        // === 5. UJI SELEKTOR getTitikAkhir ===
        System.out.println(">> 4. PENGUJIAN SELEKTOR getTitikAkhir");
        System.out.println("--- Verifikasi getter titik akhir ---");
        System.out.print("Titik Akhir g2: ");
        g2.getTitikAkhir().printTitik();
        System.out.println("Ekspektasi: Titik(4, 6)");
        System.out.println("\n");

        // === 6. UJI METHOD getPanjang ===
        System.out.println(">> 5. PENGUJIAN METHOD getPanjang");
        System.out.println("--- Kasus 1: Garis normal ---");
        System.out.println("Panjang g2 dari (1,2) ke (4,6): " + g2.getPanjang());
        System.out.println("Ekspektasi: 5.0 (sqrt(9+16)=5)");
        
        System.out.println("\n--- Kasus 2: Garis horizontal ---");
        Titik t5 = new Titik(0, 0);
        Titik t6 = new Titik(5, 0);
        Garis g4 = new Garis(t5, t6);
        System.out.println("Panjang garis dari (0,0) ke (5,0): " + g4.getPanjang());
        System.out.println("Ekspektasi: 5.0");
        
        System.out.println("\n--- Kasus 3: Garis vertikal ---");
        Titik t7 = new Titik(0, 0);
        Titik t8 = new Titik(0, 5);
        Garis g5 = new Garis(t7, t8);
        System.out.println("Panjang garis dari (0,0) ke (0,5): " + g5.getPanjang());
        System.out.println("Ekspektasi: 5.0");
        
        System.out.println("\n--- Kasus 4: Garis dengan titik sama (panjang 0) ---");
        System.out.println("Panjang g3: " + g3.getPanjang());
        System.out.println("Ekspektasi: 0.0");
        System.out.println();

        // === 7. UJI METHOD getGradien ===
        System.out.println(">> 6. PENGUJIAN METHOD getGradien");
        System.out.println("--- Kasus 1: Garis normal (gradien positif) ---");
        System.out.println("Gradien g2 dari (1,2) ke (4,6): " + g2.getGradien());
        System.out.println("Ekspektasi: 1.33333... (4/3)");
        
        System.out.println("\n--- Kasus 2: Garis gradien negatif ---");
        Titik t9 = new Titik(0, 5);
        Titik t10 = new Titik(5, 0);
        Garis g6 = new Garis(t9, t10);
        System.out.println("Gradien garis dari (0,5) ke (5,0): " + g6.getGradien());
        System.out.println("Ekspektasi: -1.0");
        
        System.out.println("\n--- Kasus 3: Garis horizontal (gradien 0) ---");
        System.out.println("Gradien g4 dari (0,0) ke (5,0): " + g4.getGradien());
        System.out.println("Ekspektasi: 0.0");
        
        System.out.println("\n--- Kasus 4: Garis vertikal (gradien undefined) ---");
        System.out.println("Gradien g5 dari (0,0) ke (0,5): " + g5.getGradien());
        System.out.println("Ekspektasi: Infinity atau undefined");
        System.out.println();

        // === 8. UJI METHOD getTitikTengah ===
        System.out.println(">> 7. PENGUJIAN METHOD getTitikTengah");
        System.out.println("--- Kasus 1: Garis normal ---");
        System.out.print("Titik Tengah g2 dari (1,2) ke (4,6): ");
        g2.getTitikTengah().printTitik();
        System.out.println("Ekspektasi: Titik(2.5, 4)");
        
        System.out.println("\n--- Kasus 2: Titik tengah garis horizontal ---");
        System.out.print("Titik Tengah g4 dari (0,0) ke (5,0): ");
        g4.getTitikTengah().printTitik();
        System.out.println("Ekspektasi: Titik(2.5, 0)");
        
        System.out.println("\n--- Kasus 3: Titik tengah garis vertikal ---");
        System.out.print("Titik Tengah g5 dari (0,0) ke (0,5): ");
        g5.getTitikTengah().printTitik();
        System.out.println("Ekspektasi: Titik(0, 2.5)");
        System.out.println();

        // === 9. UJI METHOD isSejajar ===
        System.out.println(">> 8. PENGUJIAN METHOD isSejajar");
        System.out.println("--- Kasus 1: Dua garis yang sejajar ---");
        Titik t11 = new Titik(0, 0);
        Titik t12 = new Titik(2, 2);
        Titik t13 = new Titik(1, 0);
        Titik t14 = new Titik(3, 2);
        Garis g7 = new Garis(t11, t12);  // gradien 1
        Garis g8 = new Garis(t13, t14);  // gradien 1
        System.out.println("Apakah g7 (0,0)-(2,2) sejajar g8 (1,0)-(3,2)? " + g7.isSejajar(g8));
        System.out.println("Ekspektasi: true (gradien sama)");
        
        System.out.println("\n--- Kasus 2: Dua garis yang tidak sejajar ---");
        System.out.println("Apakah g2 sejajar g4? " + g2.isSejajar(g4));
        System.out.println("Ekspektasi: false (gradien berbeda)");
        
        System.out.println("\n--- Kasus 3: Garis vertikal dengan garis normal ---");
        System.out.println("Apakah g5 sejajar g4? " + g5.isSejajar(g4));
        System.out.println("Ekspektasi: false");
        System.out.println();

        // === 10. UJI METHOD isTegakLurus ===
        System.out.println(">> 9. PENGUJIAN METHOD isTegakLurus");
        System.out.println("--- Kasus 1: Dua garis tegak lurus ---");
        Titik t15 = new Titik(0, 0);
        Titik t16 = new Titik(3, 0);
        Titik t17 = new Titik(0, 0);
        Titik t18 = new Titik(0, 3);
        Garis g9 = new Garis(t15, t16);   // horizontal
        Garis g10 = new Garis(t17, t18);  // vertikal
        System.out.println("Apakah g9 (0,0)-(3,0) tegak lurus g10 (0,0)-(0,3)? " + g9.isTegakLurus(g10));
        System.out.println("Ekspektasi: true");
        
        System.out.println("\n--- Kasus 2: Dua garis tidak tegak lurus ---");
        System.out.println("Apakah g7 sejajar dengan g6 tegak lurus? " + g7.isTegakLurus(g6));
        System.out.println("Ekspektasi: true (gradien 1 dan -1)");
        
        System.out.println("\n--- Kasus 3: Garis yang sama (tidak tegak lurus) ---");
        System.out.println("Apakah g2 tegak lurus g2? " + g2.isTegakLurus(g2));
        System.out.println("Ekspektasi: false");
        System.out.println();

        // === 11. UJI METHOD printGaris ===
        System.out.println(">> 10. PENGUJIAN METHOD printGaris");
        System.out.println("--- Output semua garis yang telah dibuat ---");
        System.out.print("g1 (default): ");
        g1.printGaris();
        System.out.print("g2 (1,2)-(4,6): ");
        g2.printGaris();
        System.out.print("g3 (titik sama): ");
        g3.printGaris();
        System.out.print("g4 (horizontal): ");
        g4.printGaris();
        System.out.print("g5 (vertikal): ");
        g5.printGaris();
        System.out.print("g6 (gradien negatif): ");
        g6.printGaris();
        System.out.println();
    }
}
