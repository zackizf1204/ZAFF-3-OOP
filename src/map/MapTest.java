package map;

import static org.junit.Assert.assertTrue;

import object.MapObject;
import org.junit.jupiter.api.Test;
import tile.Tile;



/**
 * Created by Finiko on 4/15/2017.
 * NIM : 13515029.
 * File : MapTest.java
 */
class MapTest {
  @Test
  void getSizeX() {
    int x;
    x = 20;
    Map m = new Map(20,20);
    assertTrue(m.getSizeX() == x);
  }

  @Test
  void getSizeY() {
    int y;
    y = 20;
    Map m = new Map(20,20);
    assertTrue(m.getSizeY() == y);
  }
}