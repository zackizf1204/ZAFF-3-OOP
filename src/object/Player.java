package object;

/**
 * Created by Fathur on 13-Apr-17.
 * NIM : 13515068
 * File : Player.java
 */
public class Player {
  private Unit[] arrayUnit;
  private String playerName;
  int countUnit;

  public Player(String input) {
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit();
    countUnit = 1;
  }

  public Player(String input,int type,int x, int y) {
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit(type,x,y);
    countUnit = 1;
  }

  public void addUnit(int type) {
    assert countUnit <= 10 : "Unit Full";
    arrayUnit[countUnit] = new Unit(type,0,0);
    countUnit++;
  }

  public Unit getUnit(int i) {
    return arrayUnit[i];
  }

  public String getPlayerName() {
    return playerName;
  }

  public int getCountUnit() {
    return countUnit;
  }
}

