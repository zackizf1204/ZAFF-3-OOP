import map.Map;
import object.Player;
import object.Unit;

/**
 * Created by Fathur on 23-Apr-17.
 * NIM : 13515068
 * File : DriverModel.java
 */
public class DriverModel {
  private Player[] listPlayer;
  private Map map;
  private int currentPlayer;
  private int currentUnit;
  private final int countPlayer;

  DriverModel(int i) {
    countPlayer = i;
    listPlayer = new Player [i];
    for (int j = 0; j < i ; j++) {
      listPlayer[j] = new Player("Player" + j,j,j,j);
    }
    map = new Map();
    currentPlayer = 0;
    currentUnit = 0;
  }

  public void move(int i) {
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    if (i == 1) {
      if (map.getTile(x,y + 1).isPassable()) {
        listPlayer[currentPlayer].getUnit(currentUnit).move(i);
      }
    } else if (i == 2) {
      if (map.getTile(x,y - 1).isPassable()) {
        listPlayer[currentPlayer].getUnit(currentUnit).move(i);
      }
    } else if (i == 3) {
      if (map.getTile(x - 1,y).isPassable()) {
        listPlayer[currentPlayer].getUnit(currentUnit).move(i);
      }
    } else if (i == 4) {
      if (map.getTile(x + 1,y).isPassable()) {
        listPlayer[currentPlayer].getUnit(currentUnit).move(i);
      }
    }
  }

  public void attack(Unit target) {
    if (listPlayer[currentPlayer].getUnit(currentUnit).isReachable(target)) {
      listPlayer[currentPlayer].getUnit(currentUnit).attack(target);
    }
    changePlayer();
  }

  public void skill(int i, Unit target) {
    if ((listPlayer[currentPlayer].getUnit(currentUnit).isReachable(target)) && (listPlayer[currentPlayer].getUnit(currentUnit).isSkillUsabale(i))) {
      listPlayer[currentPlayer].getUnit(currentUnit).skill(i,target);
    }
    changePlayer();
  }

  public void changePlayer() {
    currentPlayer = currentPlayer + 1;
    if (currentPlayer == countPlayer) {
      currentPlayer = 0;
    }
    currentUnit = 0;
  }

  public Player getCurrentPlayer(int i) {
    return listPlayer[i];
  }

}
