package map;

import object.MapObject;
import org.junit.jupiter.api.Test;
import tile.Tile;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

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
    MapObject dataObject = new MapObject(0,0);
    //setMapObject(0, object.dataObject());
    //assertTrue(m.getMapObject(0) == dataObject);
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
    int x1;
    x1 = 30;
    x = 20;
    Map m = new Map(20,20);
    m.setSizeX(x1);
    assertTrue(m.getSizeX() == x1);
  }

  @Test
  void setSizeY() {
    int y;
    int y1;
    y1 = 30;
    y = 20;
    Map m = new Map(20,20);
    m.setSizeX(y1);
    assertTrue(m.getSizeY() == y1);
  }

  @Test
  void setMapObject() {
    Map m = new Map(1,1);
    MapObject dataObject = new MapObject(0,0);
    //setMapObject(0, object.dataObject());
    //assertTrue(m.getMapObject(0) == dataObject);
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
    MapObject dataObject = new MapObject(0,0);
    //setMapObject(0, object.dataObject());
    //assertTrue(m.adaObject(0,0));
  }

  @Test
  void searchObject() {
    Map m = new Map(1,1);
    MapObject dataObject = new MapObject(0,0);
    //setMapObject(0, object.dataObject());
    //assertTrue(dataObject == m.searchObject(0,0));
  }

}