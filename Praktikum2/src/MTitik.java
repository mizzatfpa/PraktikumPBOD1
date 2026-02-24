/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Muhammad Izzat Fauzan Putra Arya / 24060124130096
 * Tanggal      : 24 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);    //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);  //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();   //mencetak koordinat T1 ke layar
        T1.geser(3,4);     //menggeser T1 sejauh (3,4)
        T1.printTitik();   //menampilkan koordinat T1 setelah digeser

        //memasukkan t1 ke dalam t2
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        //membuat titik baru
        Titik T3 = new Titik();
        Titik T4 = new Titik(3,5);

        //mencari jumlah titik yang telah dibuat
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());

        //mencari kuadran
        Titik t1 = new Titik(10, 20); 
        System.out.println("Kuadran t1: " + t1.getKuadran());

        Titik t2 = new Titik(-10, 20);
        System.out.println("Kuadran t2: " + t2.getKuadran());

        Titik t3 = new Titik(-10, -20);
        System.out.println("Kuadran t3: " + t3.getKuadran());

        Titik t4 = new Titik(10, -20);
        System.out.println("Kuadran t4: " + t4.getKuadran());

        //mencari jarak ke pusat
        System.out.println("Jarak t1 ke pusat: " + t1.getjarakPusat());

        //mencari jarak antara t1 dan t2
        System.out.println("Jarak antara t1 dan t2: " + t1.getJarak(t2));

        //mencari refleksix
        t1.refleksiX();
        System.out.print("t1 refleksiX: ");
        t1.printTitik();

        //mencari refleksiy
        t1.refleksiY();
        System.out.print("t1 refleksiY: ");
        t1.printTitik();

        //mencari titik setelah refleksix
        Titik t1RefleksiX = t1.getRefleksiX();
        System.out.print("getRefleksiX t1: ");
        t1RefleksiX.printTitik();

        //mencari titik setelah refleksiy
        Titik t1RefleksiY = t1.getRefleksiY();
        System.out.print("getRefleksiY t1: ");
        t1RefleksiY.printTitik();
    }
}