/* Nama File : Seminar.java
  Deskripsi : Berisi atribut dan method pada class Seminar.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 25 April 2026
*/

public class Seminar {

    /* ATRIBUT */
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Seminar(){
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    // Menghitung banyak peserta seminar
    public int countPeserta(){
        return banyakpeserta;
    }

    // Registrasi peserta seminar
    public void registrasi(Civitasakademika peserta){
        if (banyakpeserta < 100){
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        }
    }

    // Menampilkan daftar peserta seminar
    public void tampilPeserta(){
        for (int i = 0; i < banyakpeserta; i++){
            System.out.println("Nomor : " + pesertas[i].getNomor());
            System.out.println("Nama  : " + pesertas[i].getNama());
        }
    }

    // Menghitung banyak mahasiswa seminar
    public int countMahasiswa(){
        int jumlahMahasiswa = 0;

        for (int i = 0; i < banyakpeserta; i++){
            if (pesertas[i] instanceof Mahasiswa){
                jumlahMahasiswa++;
            }
        }

        return jumlahMahasiswa;
    }
}