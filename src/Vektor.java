/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/27/2017.
 * FileName : Vektor.java.
 */
public class Vektor <T> {
  private T[] data; 
  public Vektor(); // ctor tanpa parameter, hanya melakukan alokasi T utk menampung Max elements
  public Vektor(Vektor V); // ctor dengan parameter, create satu copy isi data dari V
  public void copy(Vektor V); // copy V ke dirinya
  // jika ukuran V > dari ukuran current object, hanya copy sebanyak ukuran current object
// jika ukuran V = dari ukuran current object, copy semua elemen V
// jika ukuran V < dari ukuran current object, alokasi ulang T sebesar ukuran V,
//                                             copy semua elemen V
  public void print(); //implementasi toString() utk menulis isi Vector V berderet ke bawah
                  // jika ada N buah elemen maka ditulis N baris, baris ke(i) adalah elemen ke-i
                      // baris terakhir diakhiri dengan [Return]
  public boolean equal(Vektor V); 
// Prekond: T has the same “size”
// return true if all element of V are equal to element of current object
// Perbandingan terhadap elemen dilakukan hanya berdasarkan refensi ke objek saja.
}