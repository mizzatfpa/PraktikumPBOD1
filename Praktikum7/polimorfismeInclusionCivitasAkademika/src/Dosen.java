/* Nama File : Dosen.java
  Deskripsi : Berisi atribut dan method pada class Dosen.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Dosen extends Civitasakademika {

    /* ATRIBUT */
    private String nip;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Dosen(){
        super();
        this.nip = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama){
        super(nama);
        this.nip = nip;
    }

    // Selektor
    public String getNip(){
        return nip;
    }

    @Override
    public String getNomor(){
        return nip;
    }

    // Mutator
    public void setNip(String nip){
        this.nip = nip;
    }
}