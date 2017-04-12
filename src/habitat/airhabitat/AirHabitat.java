/**
 * 
 */
package habitat.airhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : AirHabitat.java
 * Tanggal : 28 Maret 2017
 */
public class AirHabitat extends Habitat {
  /**
   * constructor
   * @param x
   * @param y
   */
  public AirHabitat(int x, int y){
    super(x,y);
    setAbleType(1);
  }
  /**
   * display character untuk AirHabitat
   * @return character untuk didisplay
   */
  public char render(){
    return('^');
  }
}
