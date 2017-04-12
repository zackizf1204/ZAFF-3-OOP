/**
 * 
 */
package pointer.facility.park;
import pointer.facility.Facility;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Park.java
 * Tanggal : 28 Maret 2017
 */
public class Park extends Facility{
  /**
   * constructor
   * @param inputX
   * @param inputY
   */
  public Park(int inputX, int inputY){
    super(inputX,inputY);
  }
  /**
   * cek apakah facility adalah park. true jika iya. false jika tidak.
   */
  public boolean isPark(){
    return(true);
  }
  /**
   * display character untuk Park
   * @return character untuk didisplay
   */
  public char render(){
	  return('#');
  }
}
