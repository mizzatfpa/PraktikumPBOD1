/* Nama File : IResize.java
  Deskripsi : Berisi metode dalam interface IResize
  Pembuat   : Muhammad Izzat Fauzan Putra Arya - 24060124130096
  Tanggal   : 17 Maret 2026
*/

public interface IResize {
    
    //Metode untuk melakukan zoomIn sebesar 10%
    public void zoomIn();

    //Metode untuk melakukan zoomOut sebesar 10%
    public void zoomOut();

    //Metode untuk melakukan zoom sebesar besaran input
    public void zoom(int percent);
}
