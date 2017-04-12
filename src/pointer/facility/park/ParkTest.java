/**
 * 
 */
package pointer.facility.park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : ParkTest.java
 * Tanggal : 28 Maret 2017
 */
public class ParkTest {
  @Test
  void render() {
    Park P = new Park(3,4);
    assertTrue(P.render()=='#');
  }
}
