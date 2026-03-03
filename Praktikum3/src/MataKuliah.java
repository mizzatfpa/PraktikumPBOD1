public class MataKuliah {

    /* Atribut */
    private String idMatKul;
    private String Nama;
    private int SKS;
    
    /* Method */

    //Konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.Nama = "";
        this.SKS = 0;
    }

    //Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String Nama, int SKS){
        this.idMatKul = idMatKul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    //Selektor
    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return Nama;
    }

    public int getSKS(){
        return SKS;
    }

    //Mutator
    public void setIdMatkul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}
