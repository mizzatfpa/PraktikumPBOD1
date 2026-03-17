/* Nama File : BangunDatar.java
  Deskripsi : Berisi atribut dan method dalam class parent BangunDatar
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

public abstract class BangunDatar {
    
    /* ATRIBUT */
    // private int jmlSisi;
    // private String warna;
    // private String border;

    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* METHOD */
    //Konstruktor tanpa parameter
    public BangunDatar(){
      counterBangunDatar++;
    }

    //Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
      this.jmlSisi = jmlSisi;
      this.warna = warna;
      this.border = border;
      counterBangunDatar++;
    }

    // SELEKTOR DAN MUTATOR
    //Selektor dan mutator untuk jumlah sisi
    public int getJmlSisi(){
      return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
      this.jmlSisi = jmlSisi;
    }

    //Selektor dan mutator untuk warna
    public String getWarna(){
      return warna;
    }

    public void setWarna(String warna){
      this.warna = warna;
    }

    //Selektor dan mutator untuk border
    public String getBorder(){
      return border;
    }

    public void setBorder(String border){
      this.border = border;
    }

    //Metode abstrak yang diimplementasikan oleh subclass
    public abstract double getLuas();

    public abstract double getKeliling();

    //Metode untuk membandingkan luas
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    //Metode untuk membandingkan keliling
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    //Metode untuk menampilkan jumlah bangun datar yang telah dibuat
    public static void printCounterBangunDatar() {
      System.out.println("Jumlah BangunDatar yang sudah dibuat: " + counterBangunDatar);
    }

    //Metode untuk menampilkan informasi tentang bangun datar
    public void printInfo() {
      System.out.println("Jumlah sisi: " + jmlSisi);
      System.out.println("Warna: " + warna);
      System.out.println("Border: " + border);
    }
}
