package view.map;

import static org.junit.Assert.assertTrue;

import map.Map;
import object.Player;
import org.junit.jupiter.api.Test;

/**
 * Created by Finiko on 4/24/2017.
 */
public class MapViewerTest {
  @Test
  public void adaPlayer (int x, int y) {
    Map map = new Map();
    Player[] list = new Player[1];
    list[0] = new Player("Player0");
    list[0].addUnit(0);
    MapViewer mv = new MapViewer(map);
    mv.setListPlayer(list);
    mv.setCountPlayer(1);
    assertTrue(mv.adaPlayer(0,0));
  }
  @Test
  public void getXYUnit(int x, int y) {
    Map map = new Map();
    Player[] list = new Player[1];
    list[0] = new Player("Player0");
    list[0].addUnit(0);
    MapViewer mv = new MapViewer(map);
    mv.setListPlayer(list);
    mv.setCountPlayer(1);
    assertTrue(mv.getXYUnit(0,0) == list[0].getUnit(0));
  }
}
