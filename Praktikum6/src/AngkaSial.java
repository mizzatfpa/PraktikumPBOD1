/* Nama File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri. Pengenalan klausa throw dan throws
 * Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
 * Tanggal   : 31 Maret 2026
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati hati memasukkan angka!!");
        }
    }
}

/* PERTANYAAN: Ketika eksepsi terjadi, apakah System.out.println(angka + " bukan angka sial"); di eksekusi
   Jawaban: Iya di eksekusi saat mencoba angka 10, tetapi ketika di angka 13 tidak di eksekusi karena perintah throw
   akan langsung mengentikan program sementara dan menyebabkan angka 12 tidak dieksekusi.*/

/* PERTANYAAN: Apakah baris catch (AngkaSialException ase) di eksekusi
   Jawaban: Iya di eksekusi, karena exception yang dilakukan oleh cobaAngka(13) membuat program berpindah ke catch
   lalu menjalankan fungsi getMessage() dan mencetak peringatan "Hati hati memasukkan angka!"*/
