/* Nama File : Persegi.java
  Deskripsi : Berisi atribut dan method dalam class child Persegi
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Maret 2026
*/

public class Persegi extends BangunDatar{
    
    /* ATRIBUT */
    private double sisi;

    /* METHOD */
    //Konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border){
        //Dengan super
        // super(4,warna,border);
        
        //Tanpa super
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    //Selektor dan mutator untuk sisi
    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }
    // Override method printInfo() dari BangunDatar
    @Override
    public void printInfo() {
        // Memanggil printInfo() dari BangunDatar
        super.printInfo();

        // Tambahkan informasi sisi, luas, dan keliling
        System.out.println("Sisi        : " + getSisi());
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}
