/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 3 Maret 2026
 */

public class MataKuliah {

    /* Atribut */
    private String idMatKul;
    private String nama;
    private int sks;
    
    /* Method */

    //Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    //Mutator
    public void setIdMatkul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
