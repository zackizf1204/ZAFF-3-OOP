/**
 * 
 */
package habitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : HabitatTest.java
 * Tanggal : 28 Maret 2017
 */
public class HabitatTest {
  @Test
  void getCageNumber() {
    Habitat h = new Habitat(3,4);
    assertTrue(h.getCageNumber()== 0);
  }
}
