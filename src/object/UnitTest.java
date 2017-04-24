package object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Fathur on 19-Apr-17.
 * NIM : 13515068
 * File : UnitTest.java
 */
class UnitTest {
  @Test
  void attackTest() {
    Unit test1 = new Unit(1,1,1);
    Unit test2 = new Unit (0,1,0);
    int atk = test1.getStrength();
    int currentHp = test2.getCurrentHp();
    test1.attack(test2);
    boolean a;
    a = (test2.getCurrentHp() == (currentHp - 7/10*atk))||(test2.getCurrentHp()==(currentHp-8/10*atk))
        ||(test2.getCurrentHp() == (currentHp-9/10*atk))||(test2.getCurrentHp()==(currentHp-10/10*atk))
        ||(test2.getCurrentHp()==(currentHp-11/10*atk))||(test2.getCurrentHp()==(currentHp-12/10*atk))
        ||(currentHp==test2.getCurrentHp());
    assertTrue(a);
  }

  @Test
  void moveTest() {

  }

  @Test
  void skillTest() {
  }

  @Test
  void waitTest() {
  }

  @Test
  void pickTest() {
  }

  @Test
  void pick1Test() {
  }

}