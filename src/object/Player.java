package object;

/**
 * Created by Fathur on 13-Apr-17.
 * NIM : 13515068
 * File : Player.java
 */
public class Player {
  private Unit[] arrayUnit;
  private String playerName;

  public Player(String input){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit();
  }

  public Player(String input,int type){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit(type);
  }


}

