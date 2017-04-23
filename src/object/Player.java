package object;

/**
 * Created by Fathur on 13-Apr-17.
 * 13515068.
 */
public class Player {
<<<<<<< .merge_file_a06064
||||||| .merge_file_a05208
  private Unit[] arrayUnit;
  private String playerName;
  int countUnit;

  public Player(String input){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit();
    countUnit = 1;
  }

  public Player(String input,int type){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit(type);
    countUnit = 1;
  }

  public void addUnit(int type){
    arrayUnit[countUnit] = new Unit(type);
    countUnit++;
  }


=======
  private Unit[] arrayUnit;
  private String playerName;
  int countUnit;

  public Player(String input){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit();
    countUnit = 1;
  }

  public Player(String input,int type,int x, int y){
    playerName = input;
    arrayUnit = new Unit [10];
    arrayUnit[0] = new Unit(type,x,y);
    countUnit = 1;
  }

  public void addUnit(int type){
    arrayUnit[countUnit] = new Unit(type);
    countUnit++;
  }


>>>>>>> .merge_file_a06440
}
