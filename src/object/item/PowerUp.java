package object.item;

import java.util.Random;

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
  private int addAgility;
  private int addMov;


  public PowerUp() {
    super();
    Random ran = new Random();
    setItemType("PowerUp");
    setAddMaxHp(ran.nextInt(11));
    setAddMaxMp(ran.nextInt(11));
    setAddIntelligence(ran.nextInt(2));
    setAddStrength(ran.nextInt(2));
    setAddAgility(ran.nextInt(2));
    setAddMov(ran.nextInt(10) / 10);
  }

  public PowerUp(int inputX, int inputY) {
    super(inputX, inputY);
    Random ran = new Random();
    setItemType("PowerUp");
    setAddMaxHp(ran.nextInt(11));
    setAddMaxMp(ran.nextInt(11));
    setAddIntelligence(ran.nextInt(2));
    setAddStrength(ran.nextInt(2));
    setAddAgility(ran.nextInt(2));
  }

  public int getAddMaxHp() {
    return addMaxHp;
  }

  public void setAddMaxHp(int addMaxHp) {
    this.addMaxHp = addMaxHp;
  }

  public int getAddMaxMp() {
    return addMaxMp;
  }

  public void setAddMaxMp(int addMaxMp) {
    this.addMaxMp = addMaxMp;
  }

  public int getAddStrength() {
    return addStrength;
  }

  public void setAddStrength(int addStrength) {
    this.addStrength = addStrength;
  }

  public int getAddIntelligence() {
    return addIntelligence;
  }

  public void setAddIntelligence(int addIntelligence) {
    this.addIntelligence = addIntelligence;
  }

  public int getAddAgility() {
    return addAgility;
  }

  public void setAddAgility(int addAgility) {
    this.addAgility = addAgility;
  }

  public int getAddMov() {
    return addMov;
  }

  public void setAddMov(int addMov) {
    this.addMov = addMov;
  }
}
