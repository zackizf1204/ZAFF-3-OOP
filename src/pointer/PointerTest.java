/**
 * 
 */
package pointer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import habitat.landhabitat.LandHabitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : PointerTest.java
 * Tanggal : 28 Maret 2017
 */
public class PointerTest {
  @Test
  void getHabitat(){
    Pointer p=new Pointer(0,0);
    LandHabitat l = new LandHabitat(3,4);
    p.setHabitat(l);
    assertTrue(p.getHabitat()==l);
  }
  @Test
  void getPositionX(){
    Pointer p=new Pointer(0,0);
    assertTrue(p.getPositionX()==0);
  }
  @Test
  void getPositionY(){
    Pointer p=new Pointer(0,0);
    assertTrue(p.getPositionY()==0);
  }
}
