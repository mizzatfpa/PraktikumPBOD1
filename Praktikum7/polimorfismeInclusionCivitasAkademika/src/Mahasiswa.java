/* Nama File : Mahasiswa.java
  Deskripsi : Berisi atribut dan method pada class Mahasiswa.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Mahasiswa extends Civitasakademika {

    /* ATRIBUT */
    private String nim;
    private Dosen dosenWali;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        super();
        this.nim = "";
        this.dosenWali = new Dosen();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama){
        super(nama);
        this.nim = nim;
        this.dosenWali = new Dosen();
    }

    // Selektor
    public String getNim(){
        return nim;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    @Override
    public String getNomor(){
        return nim;
    }

    // Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("NIM           : " + nim);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nama Dosenwali : " + dosenWali.getNama());
    }
}