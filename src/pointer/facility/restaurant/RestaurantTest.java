/**
 * 
 */
package pointer.facility.restaurant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : RestaurantTest.java
 * Tanggal : 28 Maret 2017
 */
public class RestaurantTest {
  @Test
  void render() {
    Restaurant R = new Restaurant(3,4);
    assertTrue(R.render()=='@');
  }
}
