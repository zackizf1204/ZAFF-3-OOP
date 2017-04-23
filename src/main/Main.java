package main;

import map.Map;
import object.Unit;
import object.item.Recovery;
import view.map.MapViewer;

public class Main {
  /** Main class.
   * @param args masukkan string[].
   */
  public static void main(String[] args) {
    Map m = new Map();
    m.setMapObject(0,new Recovery(0,0));
    m.setMapObject(1,new Unit(10,10,10,10,10,10,5,10,0));
    MapViewer mv = new MapViewer(m);
    try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
