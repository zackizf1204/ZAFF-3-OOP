package main;

import map.Map;
import object.Unit;
import object.item.Recovery;
import view.map.MapView;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
  public static void main(String[] args){
    Map m = new Map();
    m.setMapObject(0,new Recovery(0,0));
    m.setMapObject(1,new Unit(10,10,10,10,10,10,10,10,0));
    MapView mv = new MapView();
    try {
      mv.view(m);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
