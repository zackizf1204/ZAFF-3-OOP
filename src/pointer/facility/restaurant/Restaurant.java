/**
 * 
 */
package pointer.facility.restaurant;
import pointer.facility.Facility;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Restaurant.java
 * Tanggal : 28 Maret 2017
 */
public class Restaurant extends Facility {
  /**
   * constructor
   * @param x
   * @param y
   */
  public Restaurant(int x, int y){
	super(x,y);  
  }
  /**
   * cek apakah facility adalah restaurant. true jika iya. false jika tidak.
   */
  public boolean isRestaurant(){
	  return(true);
  }
  /**
   * display character untuk Restaurant
   * @return character untuk didisplay
   */
  public char render(){
	  return('@');
  }
}
