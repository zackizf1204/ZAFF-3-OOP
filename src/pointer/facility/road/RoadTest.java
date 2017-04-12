/**
 * 
 */
package pointer.facility.road;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : RoadTest.java
 * Tanggal : 28 Maret 2017
 */
public class RoadTest {
  @Test
  void render() {
    Road R = new Road(3,4);
    assertTrue(R.render()=='-');
  }
}
