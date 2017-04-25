package object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
  void checkAddUnit(){
    test.addUnit(1);
    assertTrue(true);
  }

}