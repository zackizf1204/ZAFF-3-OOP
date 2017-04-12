/**
 * 
 */
package pointer.facility.road.entrance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : EntranceTest.java
 * Tanggal : 28 Maret 2017
 */
public class EntranceTest {
  @Test
  void render() {
    Entrance E = new Entrance(3,4);
    assertTrue(E.render()=='>');
  }
}
