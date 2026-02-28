/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 24 Februari 2026
 */


public class Garis {
    /************** ATRIBUT **************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris;

    /************** METHOD **************/
    // Kosntruktor tanpa parameter dengan titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor dengan parameter masukan titik awal dan titik akhir
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor untuk mendapatkan titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    // Selektor untuk mendapatkan titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mutator untuk mengeset titik awal
    void setTitikAwal(Titik titikAwal) { 
        this.titikAwal = titikAwal;
    }

    // Mutator untuk mengeset titik akhir
    void setTitikAkhir(Titik titikAkhir) { 
        this.titikAkhir = titikAkhir;
    }

    // Selektor untuk mendapatkan counterGaris
    static int getCounterGaris() { 
        return counterGaris;
    }

    // Metode untuk mendapatkan panjang sebuah garis
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Metode untuk mendapatkan gradien dari sebuah garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Metode untuk mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        double absisTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ordinatTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // Metode untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isSejajar(Garis garis) {
        return this.getGradien() == garis.getGradien();
    }

    // Metode untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya.
    boolean isTegakLurus(Garis garis) {
        return this.getGradien() * garis.getGradien() == -1;
    }

    // Metode untuk menampilkan ke layar titik awal dan titik akhir garis.
    void printGaris() {
        System.out.println("Titik awal: ");
        titikAwal.printTitik();
        System.out.println("Titik akhir: ");
        titikAkhir.printTitik();
    }

    // Metode untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}