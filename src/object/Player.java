package object;

/**
 * Created by Fathur on 13-Apr-17.
 * NIM : 13515068
 * File : Player.java
 */
public class Player {
  private Unit[] arrayUnit;
  private String playerName;
  private int countUnit;
  private boolean gameOver;

  /**
   * Constructor Player
   * @param input nama Player.
   */
  public Player(String input) {
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit();
    countUnit = 1;
    gameOver = false;
  }

  /**
   * Constructor Player.
   * @param input nama player.
   * @param type type dari unit pertama.
   * @param x posisi absis dari unit pertama.
   * @param y posisi ordinat dari unit pertama.
   */
  public Player(String input,int type,int x, int y) {
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit(type,x,y);
    countUnit = 1;
    gameOver = false;
  }

  /**
   * menambakan unit pada player.
   * @param type type unit yang akan ditambahkan.
   */
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

  /**
   * Melakukan pengecekan terhadap seluruh unit player.
   */
  public void checkUnit() {
    boolean temp = true;
    for (int i = 0 ; i < countUnit ; i++) {
      arrayUnit[i].checkDead();
      temp = temp && arrayUnit[i].getDead();
    }
    gameOver = temp;
  }

  public boolean isGameOver() {
    return gameOver;
  }
}

