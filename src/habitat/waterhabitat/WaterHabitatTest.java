/**
 * 
 */
package habitat.waterhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : WaterHabitatTest.java
 * Tanggal : 28 Maret 2017
 */
public class WaterHabitatTest {
  @Test
  void getAbleType() {
    WaterHabitat h = new WaterHabitat(3,4);
    assertTrue(h.getAbleType()== 1);
  }
}
