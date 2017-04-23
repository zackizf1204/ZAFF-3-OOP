package map;

import static org.junit.Assert.assertTrue;

import object.MapObject;
import object.item.Item;
import object.item.Recovery;
import org.junit.jupiter.api.Test;
import tile.Tile;

/**
 * Created by Finiko on 4/15/2017.
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

  @Test
  void getMapObject() {
    Map m = new Map(1,1);
    Item dataObject = new Recovery(0,0);
    m.setMapObject(0,dataObject);
    assertTrue(m.getMapObject(0) == dataObject);
  }

  @Test
  void getTile() {
    Map m = new Map(1,1);
    Tile t = new Tile();
    m.setDataTiles(0,0,t);
    assertTrue(m.getTile(0,0) == t);
  }

  @Test
  void setSizeX() {
    int x;
    x = 30;
    Map m = new Map(20,20);
    m.setSizeX(x);
    assertTrue(m.getSizeX() == x);
  }

  @Test
  void setSizeY() {
    int y;
    y = 30;
    Map m = new Map(20,20);
    m.setSizeX(y);
    assertTrue(m.getSizeY() == y);
  }

  @Test
  void setMapObject() {
    Map m = new Map(1,1);
    Item dataObject = new Recovery(0,0);
    m.setMapObject(0,dataObject);
    assertTrue(m.getMapObject(0) == dataObject);
  }

  @Test
  void setDataTiles() {
    Map m = new Map(1,1);
    Tile t = new Tile();
    m.setDataTiles(0,0,t);
    assertTrue(m.getTile(0,0) == t);
  }

  @Test
  void adaObject() {
    Map m = new Map(1,1);
    Item dataObject = new Recovery(0,0);
    m.setMapObject(0,dataObject);
    assertTrue(m.adaObject(0,0));
  }

  @Test
  void searchObject() {
    Map m = new Map(1,1);
    Item dataObject = new Recovery(0,0);
    m.setMapObject(0,dataObject);
    assertTrue(dataObject == m.searchObject(0,0));
  }
}