package object.item;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Created by Zacki Zulfikar Fauzi on 19-Apr-17.
 * NIM  : 13515147
 * File : RecoveryTest.java
 */
class RecoveryTest {
  @BeforeEach
  void setUp() {

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void getAddHp() {
    Recovery recov = new Recovery(3,4);
    int maxHp = 61;
    int minHp = 0;
    assertTrue((recov.getAddHp() <= maxHp) && (recov.getAddHp() >= minHp));
  }

  @Test
  void getAddMp() {
    Recovery recov = new Recovery(3,4);
    int maxMp = 41;
    int minMp = 0;
    assertTrue((recov.getAddMp() <= maxMp) && (recov.getAddMp() >= minMp));
  }

  @Test
  void getItemType() {
    Recovery recov = new Recovery(3,4);
    String itemType = "Recovery";
    assertTrue(recov.getItemType().equals(itemType));
  }

  @Test
  void getObjectType() {
    Recovery recov = new Recovery(3,4);
    String objectType = "Item";
    assertTrue(recov.getObjectType().equals(objectType));
  }

  @Test
  void getAbsis() {
    Recovery recov = new Recovery(3,4);
    int absis = 3;
    assertTrue(recov.getAbsis() == absis);
  }

  @Test
  void getOrdinat() {
    Recovery recov = new Recovery(3,4);
    int ordinat = 4;
    assertTrue(recov.getOrdinat() == ordinat);
  }

}