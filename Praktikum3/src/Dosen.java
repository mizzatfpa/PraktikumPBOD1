/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 3 Maret 2026
 */

public class Dosen {

    /*Atribut*/

    private String nip;
    private String nama;
    private String prodi;

    /* Method */

    //Konstruktor tanpa parameter
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
