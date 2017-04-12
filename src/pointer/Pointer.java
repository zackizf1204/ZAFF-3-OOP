/**
 * 
 */
package pointer;
import render.Render;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Pointer.java
 * Tanggal : 28 Maret 2017
 */
public class Pointer extends Render{
  /**
   * positionX adalah posisi X dari Pointer
   */
  private int positionX;
  /**
   * positionY adalah posisi y dari Pointer
   */
  private int positionY;
  /**
   * dataHabitat adalah habitat pada posisi pointer 
   */
  private Habitat dataHabitat;
  /**
   * constructor
   */
  public Pointer(){
  }
  /**
   * constructor
   * @param inputX
   * @param inputY
   * I.S : Pointer tidak terdefinisi
   * F.S : Pointer terdefinisi dengan positionX adalah inputX dan positionY adalaj inputY
   */
  public Pointer(int inputX, int inputY){
    positionX=inputX;
    positionY=inputY;
  }
  /**
   * setter untuk dataHabitat
   * @param inputHabitat
   * I.S : dataHabitat tidak terdefinisi
   * F.S : dataHabitat terdefinisi
   */
  public void setHabitat(Habitat inputHabitat){
    dataHabitat=inputHabitat;
  }
  /**
   * setter untuk positionX
   * @param inputX
   */
  public void setPositionX(int inputX){
    positionX=inputX;
  }
  /**
   * setter untuk positionY
   * @param inputY
   */
  public void setPositionY(int inputY){
    positionY=inputY;
  }
  /**
   * getter untuk dataHabitat
   * @return dataHabitat
   */
  public Habitat getHabitat(){
    return(dataHabitat);
  }
  /**
   * getter untuk positionX
   * @return positionX
   */
  public int getPositionX(){
    return(positionX);
  }
  /**
   * getter untuk positionY
   * @return positionY
   */
  public int getPositionY(){
    return(positionY);
  }
  /**
   * cek apakah pointer adalah jalan
   * @return true jika iya. false jika tidak.
   */
  public boolean isJalan(){
    return(false);
  }
  /**
   * cek apakah pointer adalah entrance
   * @return true jika iya. false jika tidak.
   */
  public boolean isEntrance(){
    return(false);
  }
  /**
   * cek apakah pointer adalah exit
   * @return true jika iya. false jika tidak.
   */
  public boolean isExit(){
    return(false);
  }
  /**
   * cek apakah pointer adalah park
   * @return true jika iya. false jika tidak.
   */
  public boolean isPark(){
    return(false);
  }
  /**
   * cek apakah pointer adalah restaurant
   * @return true jika iya. false jika tidak.
   */
  public boolean isRestaurant(){
    return(false);
  }
  /**
   * cek apakah pointer adalah habitat
   * @return true jika iya. false jika tidak.
   */
  public boolean isHabitat(){
    return(false);
  }
}
