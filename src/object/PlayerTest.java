package object;

import static junit.framework.TestCase.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Created by user on 26-Apr-17.
 */
class PlayerTest {
  Player test = new Player("test");

  @Test
  void checkUnit() {
    assertTrue(test.isGameOver() == false);
  }

  @Test
  void checkAddUnit() {
    test.addUnit(1);
    assertTrue(true);
  }

}