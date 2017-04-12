/**
 * 
 */
package cell;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Cell.java
 * Tanggal : 28 Maret 2017
 */
import pointer.Pointer;
import cage.Cage;

public class Cell{
  /** sizeX adalah ukuran x cell
    */
  private int sizeX;
  /** sizeY adalah ukuran y cell
    */
  private int sizeY;
  /**
   * point adalah matriks dari Pointer
   */
  private Pointer point[][];
  /**
   * listCage adalah array dari Cage
   */
  private Cage listCage[];
  /**
   * jumlahCage adalah jumlah total dari cage
   */
  private int jumlahCage;
  /**
   * counterCage adalah counter untuk Cage yang telah dibangun
   */
  private int counterCage;
  
  /** 
   * Constructor
   * @I.S Cell tidak terdefinisi
   * @F.S Cell terdefinisi dengan ukuran default
   */
  public Cell(){
    sizeX=20;
    sizeY=20;
    int i,j;
    point = new Pointer[sizeX][sizeY];
    for(i=0;i<sizeX;i++){
      for(j=0;j<sizeY;j++){
        point[i][j]=new Pointer(i,j);
      }
    }
    jumlahCage=30;
    listCage=new Cage[jumlahCage];
    counterCage=0;
  }
  /** 
   * Constructor dengan parameter
   * @param inputX x
   * @param inputY y
   * @param jumlahKandang kandang
   * @I.S x,y, dan jumlah_kandang terdefinisi
   * @F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public Cell(int inputX, int inputY, int jumlahKandang){
    sizeX=inputX;
    sizeY=inputY;
    int i;
    Pointer point[][]=new Pointer[sizeX][];
    for(i=0;i<sizeX;i++){
      point[i]=new Pointer[sizeY];
    }
    jumlahCage=jumlahKandang;
    listCage=new Cage[jumlahCage];
    counterCage=0;
  }
  /** 
   * setter untuk Cage secara total
   */
  public void setCage(Cage inputCage){
    listCage[counterCage]=inputCage;
    listCage[counterCage].setCageNumber(counterCage);
    counterCage=counterCage+1;
  }
  /**
   * getter untuk list Cage
   * @return array dari Cage
   */
  public Cage[] getListCage(){
    return(listCage);
  }
  /**
   * getter untuk totalMakan
   * @return total makanan yang dibutuhkan dari tiap cage
   */
  public double getMakananTotal(){
    int i;
    double totalMakan;
    totalMakan=0;
    for(i=0;i<counterCage;i++){
      totalMakan=totalMakan+listCage[i].getJumlahMakan();
    }
    return(totalMakan);
  }
  /**
   * getter untuk sizeX
   * @return sizeX
   */
  public int getSizeX(){
    return(sizeX);
  }
  /**
   * getter untuk sizeY
   * @return sizeY
   */
  public int getSizeY(){
    return(sizeY);
  }
  /**
   * getter untuk Pointer di posisi inputX dan inputY
   * @param inputX
   * @param inputY
   * @return point di posisi inputX dan inputY
   */
  public Pointer getPoint(int inputX, int inputY){
    return(point[inputX][inputY]);  
  }
  /**
   * getter untuk counterCage
   * @return counterCage
   */
  public int getCounterCage(){
    return(counterCage);
  }
  /**
   * setter untuk Point di posisi inputX dan inputY 
   * @param inputX
   * @param inputY
   * @I.S x,y, dan jumlah_kandang terdefinisi
   * @F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public void setPoint(int inputX, int inputY, Pointer inputPoint){
    point[inputX][inputY]=inputPoint;
  }
  /**
   * mendisplay isi dari cell
   */
  public void gambar(){
    int i,j,k;
    k=0;
    for(i=0;i<sizeX;i++){
      for(j=0;j<sizeY;j++){
        k=0;
        while((k<counterCage)&&(!listCage[k].isInCage(i,j))){
          k=k+1;
        }
        if(k>counterCage-1){
          k=k-1;
        }
        if(listCage[k].adaHewan(i,j)){
          System.out.print(listCage[k].getRender(i,j));
        }else{
          System.out.print(getPoint(i,j).render());
        }
      }
      System.out.println();
    }
  }
}
