/**
 * 
 */
package render;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : RenderTest.java
 * Tanggal : 28 Maret 2017
 */
public class RenderTest {
  @Test
  void render() {
    Render R = new Render();
    assertTrue(R.render() == ' ');
  }
}
