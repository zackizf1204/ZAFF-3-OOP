import map.Map;
import object.Unit;
import object.item.Recovery;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverControl.java.
 */
public class DriverControl {
  private DriverView view;
  private DriverModel model;

  public DriverControl() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        Map m = new Map(15,20);
        m.setMapObject(0,new Recovery(0,0));
        m.setMapObject(1,new Unit(10,10,10,10,10,10,5,5,0));

        view = new DriverView(m);
      }
    });
  }

  public static void main(String[] args) {
    new DriverControl();
  }
}
