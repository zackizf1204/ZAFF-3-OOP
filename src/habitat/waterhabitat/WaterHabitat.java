/**
 * 
 */
package habitat.waterhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : WaterHabitat.java
 * Tanggal : 28 Maret 2017
 */
public class WaterHabitat extends Habitat {
  /**
   * constructor
   * @param x
   * @param y
   */
  public WaterHabitat(int x, int y){
    super(x,y);
    setAbleType(1);
  }
  /**
   * display character untuk WaterHabitat
   * @return character untuk didisplay
   */
  public char render(){
    return('~');
  }
}
