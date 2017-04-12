/**
 * 
 */
package pointer.facility.road.entrance;
import pointer.facility.road.Road;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Entrance.java
 * Tanggal : 28 Maret 2017
 */
public class Entrance extends Road{  
  /**
   * constructor
   * @param inputX
   * @param inputY
   */
  public Entrance(int inputX,int inputY){
    super(inputX,inputY);
  }
  /**
   * cek apakah road adalah jalan. true jika iya. false jika tidak.
   */
  public boolean isEntrance(){
    return(true);
  }
  /**
   * display character untuk Entrance
   * @return character untuk didisplay
   */
  public char render(){
	  return('>');
  }
}
