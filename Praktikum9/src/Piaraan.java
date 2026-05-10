/* Nama File : Piaraan.java
  Deskripsi : Berisi atribut dan method pada class Piaraan untuk mengelola antrean anabul.
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 10 Mei 2026
*/

public class Piaraan {

    /* ATRIBUT */
    private int nbelm;
    private Anabul[] Lanabul;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new Anabul[100];
    }

    // Method untuk mendapatkan banyak elemen
    public int getNbelm() {
        return nbelm;
    }

    // Method untuk menambahkan anabul pada akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        if (nbelm < Lanabul.length) {
            Lanabul[nbelm] = anabul;
            nbelm++;
        }
    }

    // Method untuk mengecek keanggotaan anabul
    public boolean isMember(Anabul anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] == anabul) {
                return true;
            }
        }
        return false;
    }

    // Method untuk mendapatkan anabul pertama dalam antrean
    public Anabul getAnabul() {
        if (nbelm == 0) {
            return null;
        }
        return Lanabul[0];
    }

    // Method untuk mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        if (nbelm == 0) {
            return null;
        }

        Anabul anabulPertama = Lanabul[0];
        for (int i = 0; i < nbelm - 1; i++) {
            Lanabul[i] = Lanabul[i + 1];
        }
        Lanabul[nbelm - 1] = null;
        nbelm--;
        return anabulPertama;
    }

    // Method untuk menampilkan nama panggilan semua anabul
    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lanabul[i].getNama());
        }
    }

    // Method untuk menghitung banyak keluarga kucing dalam antrean
    public int countKucing() {
        int banyak = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                banyak++;
            }
        }
        return banyak;
    }

    // Method untuk menghitung total bobot keluarga kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] instanceof Kucing) {
                totalBobot += ((Kucing) Lanabul[i]).getBobot();
            }
        }
        return totalBobot;
    }

    // Method untuk menampilkan nama panggilan anabul beserta jenis objeknya
    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            Anabul anabul = Lanabul[i];
            System.out.println((i + 1) + ". " + anabul.getNama() + " - " + anabul.getClass().getName());
        }
    }
}
