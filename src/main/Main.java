package main;

import map.Map;
import object.Unit;
import object.item.Recovery;
import tile.Tile;
import view.map.MapViewer;

public class Main {
  /** Main class.
   * @param args masukkan string[].
   */
  public static void main(String[] args) {
    //DriverView dv = new DriverView();
    Map m = new Map();
    m.setMapObject(0,new Recovery(0,0));
    m.setMapObject(1,new Unit(0,5,2));
    m.setDataTiles(5,7,new Tile(0,1,5,7));
    MapViewer mv = new MapViewer(m);
    try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
