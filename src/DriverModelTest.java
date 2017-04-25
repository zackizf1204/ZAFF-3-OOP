import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by user on 26-Apr-17.
 */
class DriverModelTest {
  DriverModel test = new DriverModel(4);

  @Test
  void gameCheck() {
    test.gameCheck();
    assertTrue(test.isGameEnd() == false);
  }

  @Test
  void move() {
    test.move(1);
    assertTrue(test.getCurrentPlayer().getUnit(test.getCurrentUnit()).getOrdinat() == 0);
  }

  @Test
  void changePlayer() {
    test.changePlayer();
    assertTrue(test.getCurrentPlayer() != null);
  }

  @Test
  void recov() {
    test.recov();

    assertTrue(test.getCurrentPlayer().getUnit(test.getCurrentUnit()).getCurrentHp() == test.getCurrentPlayer().getUnit(test.getCurrentUnit()).getMaxHp());
  }

}