/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 3 Maret 2026
 */

public class Kendaraan {
    
    /* Atribut */
    private String noPlat;
    private String jenis;

    /* Method */

    //Konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    //Mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
