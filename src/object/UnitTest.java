package object;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import object.item.Recovery;
import org.junit.jupiter.api.Test;

/**
 * Created by Fathur on 19-Apr-17.
 * NIM : 13515068
 * File : UnitTest.java
 */
class UnitTest {
  @Test
  void attackTest() {
    Unit test1 = new Unit(1,1,1);
    Unit test2 = new Unit(0,1,0);
    int currentHp = test2.getCurrentHp();
    test1.attack(test2);
    assertTrue((test2.getCurrentHp() < currentHp) || (test2.getCurrentHp() == 0));
  }

  void moveTest() {
    Unit test1 = new Unit(1 ,1,1);
    test1.move(0);
    assertEquals(test1.getOrdinat(),0);
    assertEquals(test1.getAbsis(),1);
  }

  @Test
  void waitTest() {
    Unit test = new Unit(1,1,1);
    test.minusHp(20);
    assertEquals(180,test.getCurrentHp());
    test.recov();
    assertEquals(200,test.getCurrentHp());
  }

  @Test
  void pickTest() {
    Unit test = new Unit(1,1,1);
    test.minusHp(20);
    Recovery test2 = new Recovery();
    assertTrue(test.getCurrentHp() > 80);
  }

}