/**
 * 
 */
package habitat.airhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : AirHabitatTest.java
 * Tanggal : 28 Maret 2017
 */
public class AirHabitatTest {
  @Test
  void getAbleType() {
    AirHabitat h = new AirHabitat(3,4);
    assertTrue(h.getAbleType() == 1);
  }
}
