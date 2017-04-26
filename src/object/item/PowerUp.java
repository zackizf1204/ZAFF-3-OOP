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

  /**
   * Konstruktor PowerUp tanpa parameter.
   */

  public PowerUp() {
    super();
    Random ran = new Random();
    setItemType("PowerUp");
    setAddMaxHp(ran.nextInt(11));
    setAddMaxMp(ran.nextInt(11));
    setAddIntelligence(ran.nextInt(2));
    setAddStrength(ran.nextInt(2));
    setAddAgility(ran.nextInt(2));
    setAddMov(ran.nextInt(11) / 9);
  }

  /**
   * Konstruktor PowerUp dengan parameter.
   */

  public PowerUp(int inputX, int inputY) {
    super(inputX, inputY);
    Random ran = new Random();
    setItemType("PowerUp");
    setAddMaxHp(ran.nextInt(11));
    setAddMaxMp(ran.nextInt(11));
    setAddIntelligence(ran.nextInt(2));
    setAddStrength(ran.nextInt(2));
    setAddAgility(ran.nextInt(2));
    setAddMov(ran.nextInt(11) / 9);
  }

  /**
   * Getter addMaxHp.
   * @return addMaxHp
   */
  public int getAddMaxHp() {
    return addMaxHp;
  }

  /**
   * Setter addMaxHp.
   * @param addMaxHp input addMaxHp
   */
  public void setAddMaxHp(int addMaxHp) {
    this.addMaxHp = addMaxHp;
  }

  /**
   * Getter addMaxMp.
   * @return addMaxMp
   */
  public int getAddMaxMp() {
    return addMaxMp;
  }

  /**
   * Setter addMaxMp.
   * @param addMaxMp input addMaxMp
   */
  public void setAddMaxMp(int addMaxMp) {
    this.addMaxMp = addMaxMp;
  }

  /**
   * Getter addStrength.
   * @return addStrength
   */
  public int getAddStrength() {
    return addStrength;
  }

  /**
   * Setter addStrength.
   * @param addStrength input addStrength
   */
  public void setAddStrength(int addStrength) {
    this.addStrength = addStrength;
  }

  /**
   *  Getter addIntelligence.
   * @return input addIntelligence
   */
  public int getAddIntelligence() {
    return addIntelligence;
  }

  /**
   * Stter addIntelligence.
   * @param addIntelligence input addIntelligence
   */
  public void setAddIntelligence(int addIntelligence) {
    this.addIntelligence = addIntelligence;
  }

  /**
   * Getter addAgility.
   * @return addAgility
   */
  public int getAddAgility() {
    return addAgility;
  }

  /**
   *  Stter addAgility.
   * @param addAgility input addAgility
   */
  public void setAddAgility(int addAgility) {
    this.addAgility = addAgility;
  }

  /**
   * Getter addMov.
   * @return addMov
   */
  public int getAddMov() {
    return addMov;
  }

  /**
   * Setter addMov.
   * @param addMov input addMov
   */
  public void setAddMov(int addMov) {
    this.addMov = addMov;
  }
}
