package object.item;

import java.util.Random;

/**
 * Created by Zacki Zulfikar Fauzi on 15-Apr-17.
 * NIM  : 13515147
 * File : Recovery.java
 */
public class Recovery extends Item {
  private int addHp;
  private int addMp;

  public Recovery() {
    super();
    super.setItemType("Recovery");
  }

  public Recovery(int inputX, int inputY) {
    super(inputX, inputY);
    Random ran = new Random();
    super.setItemType("Recovery");
    setAddHp(ran.nextInt(41)+20);
    setAddMp(ran.nextInt(31)+10);
  }

  public int getAddHp() {
    return addHp;
  }

  public void setAddHp(int addHp) {
    this.addHp = addHp;
  }

  public int getAddMp() {
    return addMp;
  }

  public void setAddMp(int addMp) {
    this.addMp = addMp;
  }
}
