import javax.swing.*;
import java.awt.*;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverControl.java.
 */
public class DriverControl {
  private DriverView view;

  public DriverControl() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        //view = new DriverView();
      }
    });
  }

  public static void main(String[] args){
    new DriverControl();
  }
}
