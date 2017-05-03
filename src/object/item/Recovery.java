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

  /**
   * Konstruktor recovery tanpa parameter.
   */
  public Recovery() {
    super();
    super.setItemType("Recovery");
  }
  /**
   * Konstruktor recovery dengan parameter.
   * @param inputX masukkan posisi X.
   * @param inputY masukkan posisi Y.
   */

  public Recovery(int inputX, int inputY) {
    super(inputX, inputY);
    Random ran = new Random();
    super.setItemType("Recovery");
    setAddHp(ran.nextInt(41) + 20);
    setAddMp(ran.nextInt(31) + 10);
  }

  /**
   * Getter addHp.
   * @return addHp
   */
  public int getAddHp() {
    return addHp;
  }

  /**
   * Setter addHp.
   * @param addHp input addHp
   */
  public void setAddHp(int addHp) {
    this.addHp = addHp;
  }

  /**
   * Getter addMp.
   * @return addMp
   */
  public int getAddMp() {
    return addMp;
  }

  /**
   * Setter addMp.
   * @param addMp input addMp
   */
  public void setAddMp(int addMp) {
    this.addMp = addMp;
  }
}
