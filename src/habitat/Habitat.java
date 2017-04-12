/**
 * 
 */
package habitat;
import pointer.Pointer;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Habitat.java
 * Tanggal : 28 Maret 2017
 */
public class Habitat extends Pointer {
  /**
   * ableType adalah apakah type habitat tertentu waterHabitat, airHabitat atau landHabitat. 1 jika iya.
   */
  private int ableType;
  /**
   * cageNumber adalah nomor urut cage di suatu habitat
   */
  private int cageNumber;
  /**
   * constructor Habitat
   * @param x
   * @param y
   */
  public Habitat(int x, int y){
    super(x,y);
  }
  /**
   * setter untuk cageNumber
   * @param cageInput
   */
  public void setCageNumber(int cageInput){
    cageNumber=cageInput;
  }
  /**
   * setter untuk ableType
   * @param ableInput
   */
  public void setAbleType(int ableInput){
    ableType=ableInput;
  }
  /**
   * getter untuk cageNumber
   * @return cageNumber
   */
  public int getCageNumber(){
    return(cageNumber);
  }
  /**
   * getter untuk ableType
   * @return ableType
   */
  public int getAbleType(){
    return(ableType);
  }
  /**
   * cek apakah habitat
   */
  public boolean isHabitat(){
    return(true);
  }
}
