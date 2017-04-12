/**
 * 
 */
package habitat.landhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : LandHabitatTest.java
 * Tanggal : 28 Maret 2017
 */
public class LandHabitatTest {
  @Test
  void getAbleType() {
    LandHabitat h = new LandHabitat(3,4);
    assertTrue(h.getAbleType()== 1);
  }
}
