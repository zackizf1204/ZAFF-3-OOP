/**
 * 
 */
package cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : CellTest.java
 * Tanggal : 28 Maret 2017
 */
public class CellTest {
  @Test
  void getMakananTotal() {
    Cell C = new Cell();
    double getMakanan=0;
    assertTrue(C.getMakananTotal()== getMakanan);
  }
  @Test
  void getSizeX() {
    Cell C = new Cell();
    int x=20;
    assertTrue(C.getSizeX()== x);
  }
  @Test
  void getSizeY() {
    Cell C = new Cell();
    int y=20;
    assertTrue(C.getSizeY()== y);
  }
}
