import object.Player;

/**
 * Created by Fathur on 23-Apr-17.
 * NIM : 13515068
 * File : DriverModel.java
 */
public class DriverModel {
  DriverModel() {
    Player[] listPlayer;
    listPlayer = new Player[4];
    listPlayer[0] = new Player("Player 1", 1, 1, 1);
    listPlayer[1] = new Player("Player 2", 2, 1, 10);
    listPlayer[2] = new Player("Player 3", 3, 10, 10);
    listPlayer[3] = new Player("Player 4", 4, 10, 1);
  }
}
