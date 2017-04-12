/**
 * 
 */
package pointer.facility.road;
import pointer.facility.Facility;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Road.java
 * Tanggal : 28 Maret 2017
 */
public class Road extends Facility{
  /**
   * constructor
   * @param x
   * @param y
   */
  public Road(int x,int y){
    super(x,y);
  }
  /**
   * cek apakah facility adalah jalan. true jika iya. false jika tidak.
   */
  public boolean isJalan(){
    return(true);
  }
  /**
   * display character untuk Road
   * @return character untuk didisplay
   */
  public char render(){
	  return('-');
  }
}
