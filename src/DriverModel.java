import map.Map;
import object.Player;
import object.Unit;
import object.item.Item;
import object.item.PowerUp;
import object.item.Recovery;

import java.util.Random;

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
      if (map.getTile(x,y - 1).isPassable()) {
        listPlayer[currentPlayer].getUnit(currentUnit).move(i);
      }
    } else if (i == 2) {
      if (map.getTile(x,y + 1).isPassable()) {
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

  public void pick(){
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    listPlayer[currentPlayer].getUnit(currentUnit).pick(getItemAt(x,y));

  }

  public void attack(int i) {
    int x;
    int y;
    x = listPlayer[i].getUnit(currentUnit).getAbsis();
    y = listPlayer[i].getUnit(currentUnit).getOrdinat();
    if (i == 0) {
      listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x ,y - 1));
    } else if (i == 1) {
      listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x,y + 1));
    } else if (i == 2) {
      listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x - 1,y));
    } else if (i == 3) {
      listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x + 1,y));
    }
    changePlayer();
  }

  public void skill(int i, Unit target) {
    if ((listPlayer[currentPlayer].getUnit(currentUnit).isReachable(target))
        && (listPlayer[currentPlayer].getUnit(currentUnit).isSkillUsabale(i))) {
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

  public Player getPlayer(int i) {
    return listPlayer[i];
  }

  public Player[] getListPlayer() {
    return listPlayer;
  }

  public int getCountPlayer() {
    return countPlayer;
  }

  public int getCurrentUnit() {
    return currentUnit;
  }

  public Player getCurrentPlayer() {
    return listPlayer[currentPlayer];
  }

  public void recov() {
    listPlayer[currentPlayer].getUnit(currentUnit).recov();
    changePlayer();
  }

  public Map getMap() {
    return map;
  }

  public void setPowerUp(int n) {
    int x;
    int y;
    Random rand = new Random();
    for (int i = 0;i<n;i++) {
      x = rand.nextInt(map.getSizeX());
      y = rand.nextInt(map.getSizeY());
      if (!map.adaObject(x,y)) {
        map.setMapObject(map.getCountObject(),new PowerUp(x,y));
      }
    }
  }

  public void setRecovery(int n) {
    int x;
    int y;
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
      x = rand.nextInt(map.getSizeX());
      y = rand.nextInt(map.getSizeY());
      if (!map.adaObject(x, y)) {
        map.setMapObject(map.getCountObject(), new Recovery(x, y));
      }
    }
  }

  public Unit getUnitAt(int x,int y) {
    for (int i = 0; i < countPlayer; i++) {
      for (int j = 0; j < listPlayer[i].getCountUnit(); j++) {
        if ((listPlayer[i].getUnit(j).getAbsis() == x) && (listPlayer[i].getUnit(j).getOrdinat() == y)) {
          return (listPlayer[i].getUnit(j));
        }
      }
    }
    return null;
  }

  public Item getItemAt(int x,int y) {
    if (map.adaObject(x,y)) {
      return ((Item) (map.searchObject(x,y)));
    }
    return null;
  }
}
