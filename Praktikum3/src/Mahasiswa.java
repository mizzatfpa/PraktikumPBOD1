/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 3 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    /* Atribut */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* Method */

    //Konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatKul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //Mutator
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah matkul){
        if (listMatKul.size() < 50){
            listMatKul.add(matkul);
        }
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul){
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " +  nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi; " + prodi);
    }

    public void printDetailMhs(){
        printMhs();
        //menampilkan nim, nama, dan prodi mahasiswa

        System.out.println("Daftar Mata Kuliah: ");
        for (MataKuliah matkul : listMatKul){
            System.out.println(" -" + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
            //menampilkan nama matkul dan berapa sks matkul tersebut untuk setiap matkul di listmatkul.
        }

        System.out.println("Dosen Wali: ");
        System.out.println("- NIP : " + dosenWali.getNip());
        System.out.println(" - Nama : " + dosenWali.getNama());
        System.out.println("- Prodi : " + dosenWali.getProdi());

        System.out.println("Kendaraan: ");
        System.out.println("- No Plat : " + kendaraan.getNoPlat());
        System.out.println("- Jenis : " + kendaraan.getJenis());
    }
}
