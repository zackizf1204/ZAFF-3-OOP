/**
 * 
 */
package pointer.facility.road.exit;
import pointer.facility.road.Road;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Exit.java
 * Tanggal : 28 Maret 2017
 */
public class Exit extends Road {
  /**
   * constructor
   * @param inputX
   * @param inputY
   */
  public Exit(int inputX,int inputY){
    super(inputX,inputY);
  }
  /**
   * cek apakah road adalah exit. true jika iya. false jika tidak.
   */
  public boolean isExit(){
    return(true);
  }
  /**
   * display character untuk Exit
   * @return character untuk didisplay
   */
  public char render(){
	  return('<');
  }
}
