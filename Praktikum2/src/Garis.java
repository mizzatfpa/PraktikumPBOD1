/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 24 Februari 2026
 */


public class Garis {
    /************** ATRIBUT **************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris;

    /************** METHOD **************/
    // Kosntruktor tanpa parameter dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor untuk mendapatkan titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Selektor untuk mendapatkan titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mutator untuk mengeset titik awal
    public void setTitikAwal(Titik titikAwal) { 
        this.titikAwal = titikAwal;
    }

    // Mutator untuk mengeset titik akhir
    public void setTitikAkhir(Titik titikAkhir) { 
        this.titikAkhir = titikAkhir;
    }

    // Selektor untuk mendapatkan counterGaris
    public static int getCounterGaris() { 
        return counterGaris;
    }

    // Metode untuk mendapatkan panjang sebuah garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Metode untuk mendapatkan gradien dari sebuah garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Metode untuk mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah() {
        double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // Metode untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    public boolean isSejajar(Garis garis) {
        return this.getGradien() == garis.getGradien();
    }

    // Metode untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    public boolean isTegakLurus(Garis garis) {
        return this.getGradien() * garis.getGradien() == -1;
    }

    // Metode untuk menampilkan ke layar titik awal dan titik akhir garis.
    public void printGaris() {
        System.out.println("Titik awal: ");
        titikAwal.printTitik();
        System.out.println("Titik akhir: ");
        titikAkhir.printTitik();
    }

    // Metode untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}