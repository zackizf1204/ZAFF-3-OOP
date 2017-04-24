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
  private int countPlayer;
  private boolean gameEnd;

  DriverModel(int i) {
    countPlayer = i;
    listPlayer = new Player [i];
    for (int j = 0; j < i ; j++) {
      listPlayer[j] = new Player("Player" + j,j,j,j);
    }
    map = new Map();
    currentPlayer = 0;
    currentUnit = 0;
    setPowerUp(5);
    setRecovery(5);
    gameEnd = false;
  }

  public void gameCheck() {
    int temp = 0;
    for (int i = 0; i < countPlayer; i++) {
      listPlayer[i].checkUnit();
    }
    for (int i = 0; i < countPlayer; i++) {
      if (!listPlayer[i].isGameOver()) {
        temp++;
      }
    }
    gameEnd = temp == 1;
  }

  public void move(int i) {
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    if (i == 0) {
      if (y != 0) {
        if ((map.getTile(x, y - 1).isPassable()) && (!adaPlayer(x,y - 1))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 1) {
      if (y != map.getSizeY()) {
        if ((map.getTile(x, y + 1).isPassable()) && (!adaPlayer(x,y + 1))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 2) {
      if (x != 0) {
        if ((map.getTile(x - 1, y).isPassable()) && (!adaPlayer(x - 1,y))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 3) {
      if (x != map.getSizeX()) {
        if ((map.getTile(x + 1, y).isPassable()) && (!adaPlayer(x + 1,y))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    }
  }

  public void pick() {
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    listPlayer[currentPlayer].getUnit(currentUnit).pick(getItemAt(x,y));
    changePlayer();

  }

  public void attack(int i) {
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    if (i == 0) {
      if (y != 0) {
        listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x, y - 1));
      }
    } else if (i == 1) {
      if (y != map.getSizeY()-1) {
        listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x, y + 1));
      }
    } else if (i == 2) {
      if (x != 0) {
        listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x - 1, y));
      }
    } else if (i == 3) {
      if (x != map.getSizeX()-1) {
        listPlayer[currentPlayer].getUnit(currentUnit).attack(getUnitAt(x + 1, y));
      }
    }
    changePlayer();
  }

  public void skill(int i, int j) {
    int x;
    int y;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    if (i == 0) {
      if (y != 0) {
        listPlayer[currentPlayer].getUnit(currentUnit).skill(j,getUnitAt(x, y - 1));
      }
    } else if (i == 1) {
      if (y != map.getSizeY()-1) {
        listPlayer[currentPlayer].getUnit(currentUnit).skill(j,getUnitAt(x, y + 1));
      }
    } else if (i == 2) {
      if (x != 0) {
        listPlayer[currentPlayer].getUnit(currentUnit).skill(j,getUnitAt(x - 1, y));
      }
    } else if (i == 3) {
      if (x != map.getSizeX()-1) {
        listPlayer[currentPlayer].getUnit(currentUnit).skill(j,getUnitAt(x + 1, y));
      }
    }
    changePlayer();
  }

  public void changePlayer() {
    gameCheck();
    if(!gameEnd) {
      currentPlayer = currentPlayer + 1;
      if (currentPlayer == countPlayer) {
        currentPlayer = 0;
      }
      while (listPlayer[currentPlayer].isGameOver() == true) {
        currentPlayer++;
        if (currentPlayer == countPlayer) {
          currentPlayer = 0;
        }
      }
      currentUnit = 0;
    }
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
      x = rand.nextInt(map.getSizeX()-1);
      y = rand.nextInt(map.getSizeY()-1);
      if ((!map.adaObject(x,y)) && (!adaPlayer(x,y))) {
        map.setMapObject(map.getCountObject(),new PowerUp(x,y));
      }
    }
  }

  public void setRecovery(int n) {
    int x;
    int y;
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
      x = rand.nextInt(map.getSizeX()-1);
      y = rand.nextInt(map.getSizeY()-1);
      if ((!map.adaObject(x, y)) && (!adaPlayer(x,y))) {
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

  public boolean adaPlayer(int x, int y) {
    for (int i = 0 ; i < countPlayer;i++) {
      for (int j = 0; j < listPlayer[i].getCountUnit(); j++){
        if ((listPlayer[i].getUnit(j).getAbsis() == x) && (listPlayer[i].getUnit(j).getOrdinat() == y)) {
          return true;
        }
      }
    }
    return false;
  }
}
