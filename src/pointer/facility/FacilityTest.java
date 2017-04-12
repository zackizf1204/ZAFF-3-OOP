/**
 * 
 */
package pointer.facility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : FacilityTest.java
 * Tanggal : 28 Maret 2017
 */
public class FacilityTest {
  @Test
  void getX(){
    Facility F= new Facility(0,0);
    assertTrue(F.getX()==0);
  }
  @Test
  void getY(){
    Facility F= new Facility(0,0);
    assertTrue(F.getY()==0);
  }
}
