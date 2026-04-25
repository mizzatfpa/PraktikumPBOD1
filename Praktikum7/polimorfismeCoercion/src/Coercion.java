/* Nama File : Coercion.java
  Deskripsi : Mendemonstrasikan polimorfisme ad hoc coercion, parsing String, dan verifikasi tipe dengan getClass.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Coercion {
    public static void main(String[] args){
    // Contoh penggunaan coercion pada int yang dipaksa menjadi char dan double
    int nilaiInt = 65;
    char nilaiChar = (char) nilaiInt;
    double nilaiReal = (double) nilaiInt;

    System.out.println("=== A. Ilustrasi Coercion ===");
    System.out.println("Integer : " + nilaiInt);
    System.out.println("Karakter: " + nilaiChar);
    System.out.println("Real    : " + nilaiReal);
    System.out.println("Verifikasi tipe (getClass):");
    System.out.println("nilaiInt  -> " + ((Object) nilaiInt).getClass().getSimpleName());
    System.out.println("nilaiChar -> " + ((Object) nilaiChar).getClass().getSimpleName());
    System.out.println("nilaiReal -> " + ((Object) nilaiReal).getClass().getSimpleName());
    System.out.println();

    // Mengubah sebuah integer menjadi double lalu menjadi integer lagi
    int angkaAwal = 123;
    double angkaReal = (double) angkaAwal;
    int angkaKembali = (int) angkaReal;

    System.out.println("=== B. Konversi int -> real -> int ===");
    System.out.println("angkaAwal   (int)   = " + angkaAwal);
    System.out.println("angkaReal   (double)= " + angkaReal);
    System.out.println("angkaKembali(int)   = " + angkaKembali);
    System.out.println("Verifikasi tipe (getClass):");
    System.out.println("angkaAwal    -> " + ((Object) angkaAwal).getClass().getSimpleName());
    System.out.println("angkaReal    -> " + ((Object) angkaReal).getClass().getSimpleName());
    System.out.println("angkaKembali -> " + ((Object) angkaKembali).getClass().getSimpleName());
    System.out.println();

    // Melakukan simulasi penjumlahan String secara langsung dan menggunakan parseInt
    String X = "1234";
    String Y = "5678";
    String S = X + Y;
    Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

    System.out.println("=== C. Operasi String dan Integer ===");
    System.out.println("X = " + X);
    System.out.println("Y = " + Y);
    System.out.println("S (konkatenasi) = " + S);
    System.out.println("Z (penjumlahan) = " + Z);
    System.out.println("Verifikasi tipe (getClass):");
    System.out.println("X -> " + X.getClass().getSimpleName());
    System.out.println("Y -> " + Y.getClass().getSimpleName());
    System.out.println("S -> " + S.getClass().getSimpleName());
    System.out.println("Z -> " + Z.getClass().getSimpleName());
    System.out.println();

    // Melakukan simulasi penjumlahan String secara langsung untuk tipe data double menggunakan parseDouble
    String P = "12.34";
    String Q = "56.78";
    String R = P + Q;
    Double D = Double.parseDouble(P) + Double.parseDouble(Q);

    System.out.println("=== D. Operasi String dan Double ===");
    System.out.println("P = " + P);
    System.out.println("Q = " + Q);
    System.out.println("R (konkatenasi) = " + R);
    System.out.println("D (penjumlahan) = " + D);
    System.out.println("Verifikasi tipe (getClass):");
    System.out.println("P -> " + P.getClass().getSimpleName());
    System.out.println("Q -> " + Q.getClass().getSimpleName());
    System.out.println("R -> " + R.getClass().getSimpleName());
    System.out.println("D -> " + D.getClass().getSimpleName());
    System.out.println();

    // Membuat sebuah objek Integer A yang diisi hasil konversi nilai S dan menampilkan nilai A
    Integer A = Integer.parseInt(S);
    System.out.println("=== E. Konversi S ke Integer ===");
    System.out.println("A = " + A);
    System.out.println("Verifikasi tipe A -> " + A.getClass().getSimpleName());
    System.out.println();

    // Membuat sebuah objek String T yang diisi hasil konversi nilai A dan menampilkan nilai T
    String T = String.valueOf(A);
    System.out.println("=== F. Konversi A ke String ===");
    System.out.println("T = " + T);
    System.out.println("Verifikasi tipe T -> " + T.getClass().getSimpleName());
    }
}
