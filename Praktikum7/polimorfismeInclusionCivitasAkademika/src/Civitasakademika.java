/* Nama File : Civitasakademika.java
  Deskripsi : Berisi atribut dan method pada abstract class Civitasakademika.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public abstract class Civitasakademika {

    /* ATRIBUT */
    protected String nama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Civitasakademika(){
        this.nama = "";
    }

    // Konstruktor dengan parameter
    public Civitasakademika(String nama){
        this.nama = nama;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    // Method abstrak untuk nomor
    public abstract String getNomor();
}