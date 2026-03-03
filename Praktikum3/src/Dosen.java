public class Dosen {

    /*Atribut*/

    private String NIP;
    private String Nama;
    private String Prodi;

    /* Method */

    //Konstruktor tanpa parameter
    public Dosen(){
        this.NIP = "";
        this.Nama = "";
        this.Prodi = "";
    }

    //Konstruktor dengan parameter
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    //Selektor
    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    //Mutator
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}
