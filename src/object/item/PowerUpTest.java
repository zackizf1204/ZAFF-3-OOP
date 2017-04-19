package object.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Zacki Zulfikar Fauzi on 19-Apr-17.
 * NIM  : 13515147
 * File : PowerUpTest.java
 */
class PowerUpTest {
  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void getAddMaxHp() {
    PowerUp power = new PowerUp(3,4);
    int maxHp = 11;
    int minHp = 0;
    assertTrue((power.getAddMaxHp() <= maxHp) && (power.getAddMaxHp() >= minHp));
  }

  @Test
  void getAddMaxMp() {
    PowerUp power = new PowerUp(3,4);
    int maxMp = 11;
    int minMp = 0;
    assertTrue((power.getAddMaxMp() <= maxMp) && (power.getAddMaxMp() >= minMp));
  }

  @Test
  void getAddStrength() {
    PowerUp power = new PowerUp(3,4);
    int maxStr = 2;
    int minStr = 0;
    assertTrue((power.getAddStrength() <= maxStr) && (power.getAddStrength() >= minStr));
  }

  @Test
  void getAddIntelligence() {
    PowerUp power = new PowerUp(3,4);
    int maxInt = 2;
    int minInt = 0;
    assertTrue((power.getAddIntelligence() <= maxInt) && (power.getAddIntelligence() >= minInt));
  }

  @Test
  void getAddAgility() {
    PowerUp power = new PowerUp(3,4);
    int maxAgi = 2;
    int minAgi = 0;
    assertTrue((power.getAddAgility() <= maxAgi) && (power.getAddAgility() >= minAgi));
  }

  @Test
  void getAddMov() {
    PowerUp power = new PowerUp(3,4);
    int maxMov = 1;
    int minMov = 0;
    assertTrue((power.getAddMov() <= maxMov) && (power.getAddMov() >= minMov));
  }

  @Test
  void getItemType() {
    PowerUp power = new PowerUp(3,4);
    String itemType = "PowerUp";
    assertTrue(power.getItemType().equals(itemType));
  }

  @Test
  void getObjectType() {
    PowerUp power = new PowerUp(3,4);
    String objectType = "Item";
    assertTrue(power.getObjectType().equals(objectType));
  }

  @Test
  void getAbsis() {
    PowerUp power = new PowerUp(3,4);
    int absis = 3;
    assertTrue(power.getAbsis() == absis);
  }

  @Test
  void getOrdinat() {
    PowerUp power = new PowerUp(3,4);
    int ordinat = 4;
    assertTrue(power.getOrdinat() == ordinat);
  }

}