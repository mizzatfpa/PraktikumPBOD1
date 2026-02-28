/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 24 Februari 2026
 */

public class Titik {
    /********************ATRIBUT*********************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /********************METHOD**********************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik dengan parameter absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //mencetak getCounterTitik
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //mencari kuadran pada titik
    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    //mencari jarakPusat
    double getjarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    //mencari jarak
    double getJarak (Titik T){
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    //mencari refleksi terhadap sumbu x
    void refleksiX(){
        ordinat = -ordinat;
    }

    //mencari refleksi terhadap sumbu y
    void refleksiY(){
        absis = -absis;
    }

    //mencari hasil titik setelah direfleksikan dengan sumbu x
    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    //mencari hasil titik setelah direfleksikan dengan sumbu y
    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} //end class Titik