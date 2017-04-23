package main;
<<<<<<< .merge_file_a07208
import map.Map;
import object.Unit;
import object.item.Recovery;
import view.map.MapViewer;
||||||| .merge_file_a06684
import map.Map;
import object.Unit;
import object.item.Recovery;
import view.map.MapView;
=======
>>>>>>> .merge_file_a02316


import timer.Stopwatch;

public class Main {
  public static void main(String[] args){
<<<<<<< .merge_file_a07208
    Map m = new Map();
    m.setMapObject(0,new Recovery(0,0));
    m.setMapObject(1,new Unit(10,10,10,10,10,10,10,10,0));
    MapViewer mv = new MapViewer(m);
    try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }
||||||| .merge_file_a06684
    Map m = new Map();
    m.setMapObject(0,new Recovery(0,0));
    m.setMapObject(1,new Unit(10,10,10,10,10,10,10,10,0));
    MapView mv = new MapView();
    try {
      mv.View(m);
    } catch (Exception e) {
      e.printStackTrace();
    }
=======
    Stopwatch timer = new Stopwatch();
>>>>>>> .merge_file_a02316
  }
}
