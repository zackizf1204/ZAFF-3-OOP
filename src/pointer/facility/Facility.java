/**
 * 
 */
package pointer.facility;
import pointer.Pointer;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Facility.java
 * Tanggal : 28 Maret 2017
 */
public class Facility extends Pointer{
  /**
   * facilityX adalah posisi x dari facility
   */
  private int facilityX;
  /**
   * facilityY adalah posisi y dari facility
   */
  private int facilityY;
  /**
   * constructor
   * @param inputX
   * @param inputY
   */
  public Facility(int inputX,int inputY){
    super(inputX,inputY);
    facilityX=inputX;
    facilityY=inputY;
  }
  /**
   * getter untuk facilityX
   * @return facilityX
   */
  public int getX(){
    return(facilityX);
  }
  /**
   * getter untuk facilityY
   * @return facilityY
   */
  public int getY(){
    return(facilityY);
  }
}
