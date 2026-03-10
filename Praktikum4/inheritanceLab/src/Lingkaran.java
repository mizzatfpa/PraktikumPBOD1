/* Nama File : Lingkaran.java
  Deskripsi : Berisi atribut dan method dalam class child Lingkaran
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Maret 2026
*/

public class Lingkaran extends BangunDatar{
    
    /* ATRIBUT */
    private double jariJari;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        //Dengan super
        super(1, warna, border); //Asumsi sisi dari lingkaran berjumlah 1

        //Tanpa super
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(jmlSisi);
        this.jariJari = diameter / 2;
    }

    // Selektor dan mutator untuk jari jari
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Override method printInfo() dari BangunDatar
    @Override
    public void printInfo() {
        // Memanggil printInfo() dari BangunDatar
        super.printInfo();

        // Tambahkan informasi jari-jari, luas, dan keliling
        System.out.println("Jari-jari   : " + jariJari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}
