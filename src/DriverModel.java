import map.Map;
import object.Player;
import object.Unit;
import object.item.Item;
import object.item.PowerUp;
import object.item.Recovery;

import java.io.FileNotFoundException;
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
    listPlayer[0] = new Player("Player 1",0,0,0);
    listPlayer[1] = new Player("Player 2",1,14,19);
    if (i > 2) {
      listPlayer[2] = new Player("Player 3",1,0,19);
    }
    if (i > 3) {
      listPlayer[3] = new Player("Player 4",1,14,0);
    }
    try {
      map = new Map();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    setPlayer(listPlayer);

    currentPlayer = 0;
    currentUnit = 0;
    setPowerUp(5);
    setRecovery(5);
    gameEnd = false;
  }

  private void setPlayer(Player[] listPlayer) {
    for (int i = 0; i < countPlayer; i++) {
      map.setMapObject(map.getCountObject(),listPlayer[i].getUnit(0));
    }
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
    int height;
    x = listPlayer[currentPlayer].getUnit(currentUnit).getAbsis();
    y = listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat();
    height = map.getTile(x,y).getHeight();
    if (i == 0) {
      if (y != 0) {
        if (((map.getTile(x,y - 1).getHeight() - height) < listPlayer[currentPlayer].getUnit(currentUnit).getJump()) && (map.getTile(x, y - 1).isPassable()) && (!adaPlayer(x,y - 1))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 1) {
      if (y != map.getSizeY()) {
        if (((map.getTile(x,y + 1).getHeight() - height) < listPlayer[currentPlayer].getUnit(currentUnit).getJump()) && (map.getTile(x, y + 1).isPassable()) && (!adaPlayer(x,y + 1))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 2) {
      if (x != 0) {
        if (((map.getTile(x - 1,y).getHeight() - height) < listPlayer[currentPlayer].getUnit(currentUnit).getJump()) && (map.getTile(x - 1, y).isPassable()) && (!adaPlayer(x - 1,y))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    } else if (i == 3) {
      if (x != map.getSizeX()) {
        if (((map.getTile(x + 1,y).getHeight() - height) < listPlayer[currentPlayer].getUnit(currentUnit).getJump()) && (map.getTile(x + 1, y).isPassable()) && (!adaPlayer(x + 1,y))) {
          listPlayer[currentPlayer].getUnit(currentUnit).move(i);
        }
      }
    }
    int currentHeight;
    currentHeight = map.getTile(listPlayer[currentPlayer].getUnit(currentUnit).getAbsis(), listPlayer[currentPlayer].getUnit(currentUnit).getOrdinat()).getHeight();
    if (height - currentHeight > listPlayer[currentPlayer].getUnit(currentUnit).getJump()) {
      Random rand = new Random();
      int n = rand.nextInt(5) + 7;
      listPlayer[currentPlayer].getUnit(currentUnit).minusHp(n * (height - currentHeight));
      changePlayer();
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
    for (int i = 0; i < countPlayer; i++) {
      for (int j = 0; j < listPlayer[i].getCountUnit(); j++) {
        listPlayer[i].getUnit(j).setRemainingMov();
      }
    }
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
      if ((!map.adaObject(x, y)) && (adaPlayer(x,y))) {
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
    for (int i = 0 ; i < countPlayer;i++){
      for (int j = 0; j < listPlayer[i].getCountUnit(); j++){
        if ((listPlayer[i].getUnit(j).getAbsis() == x) && (listPlayer[i].getUnit(j).getOrdinat() == y)) {
          return true;
        }
      }
    }
    return false;
  }
}
