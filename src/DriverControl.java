import map.Map;
import object.Unit;
import object.item.Recovery;
import view.command.AttackCommandView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TimerTask;
import java.util.Timer;
/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverControl.java.
 */
public class DriverControl {
  private DriverView view;
  private DriverModel model;
  public static int counter;
  public DriverControl() {
    model = new DriverModel(2);
    counter=0;
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        Map m = new Map(15,20);
        m.setMapObject(0,new Recovery(10,10));
        m.setMapObject(1,model.getCurrentPlayer(0).getUnit(0));
        m.setMapObject(2,model.getCurrentPlayer(1).getUnit(0));
        view = new DriverView(model);
        AttackCommandView attack = view.getAttack();
        attack.addMouseListener(new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent e) {

            //attackPlayer(Player1, Player2)
          }

          @Override
          public void mousePressed(MouseEvent e) {

          }

          @Override
          public void mouseReleased(MouseEvent e) {
            attack.setBackground(new Color(0,0,0,0));
          }

          @Override
          public void mouseEntered(MouseEvent e) {
            JButton c = (JButton) e.getComponent();
            try {
              Image img = ImageIO.read(getClass().getResource("assets/attackbuttononhover.png"));
              c.setIcon(new ImageIcon(img));
            } catch (Exception ex) {
              System.out.println(ex);
            }
            attack.setBorderPainted(false);
            attack.setBackground(new Color(0,0,0,0));
          }

          @Override
          public void mouseExited(MouseEvent e) {
            JButton c = (JButton) e.getComponent();
            try {
              Image img = ImageIO.read(getClass().getResource("assets/attackbutton.png"));
              c.setIcon(new ImageIcon(img));
            } catch (Exception ex) {
              System.out.println(ex);
            }
            attack.setBorderPainted(false);
            attack.setBackground(new Color(0,0,0,0));
          }
        });

      }
    });
  }

  public void runGame(){
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        view.updateView(model);
        TimerTask timerTask = new TimerTask() {

          @Override
          public void run() {
            if(counter>5) {
              System.exit(0);
            } else {
              counter++;
            }
          }
        };

        Timer timer = new Timer("MyTimer");
        timer.scheduleAtFixedRate(timerTask, 0, 1000);//this line starts the timer at the same time its executed
        /*while(counter<60){

        }*/
      }
    });
  }

  public static void main(String[] args) {
    DriverControl ctrl = new DriverControl();
      ctrl.runGame();
  }
}
