/**
 * 
 */
package habitat.landhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : LandHabitat.java
 * Tanggal : 28 Maret 2017
 */
public class LandHabitat extends Habitat{
  /**
   * constructor
   * @param x
   * @param y
   */
  public LandHabitat(int x, int y){
    super(x,y);
    setAbleType(1);
  }
  /**
   * display character untuk LandHabitat
   * @return character untuk didisplay
   */
  public char render(){
    return('*');
  }
}
