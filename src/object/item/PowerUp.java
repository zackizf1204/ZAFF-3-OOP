package object.item;

/**
 * Created by Zacki Zulfikar Fauzi on 15-Apr-17.
 * NIM  : 13515147
 * File : PowerUp.java
 */
public class PowerUp extends Item {
  private int addMaxHp;
  private int addMaxMp;
  private int addStrength;
  private int addIntelligence;


  public PowerUp() {
    super();
    setItemType("PowerUp");
  }
  public PowerUp(int inputX, int inputY) {

  }


}
