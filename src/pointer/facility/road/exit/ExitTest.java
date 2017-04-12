/**
 * 
 */
package pointer.facility.road.exit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : ExitTest.java
 * Tanggal : 28 Maret 2017
 */
public class ExitTest {
  @Test
  void render() {
    Exit E = new Exit(3,4);
    assertTrue(E.render() == '<');
  }
}
