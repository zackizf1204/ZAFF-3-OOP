import map.Map;
import object.Unit;
import object.item.Recovery;
import view.command.AttackCommandView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        m.setMapObject(1,new Unit(1,5,5));
        view = new DriverView(m);
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
              Image img = ImageIO.read(getClass().getResource("../../assets/attackbuttononhover.png"));
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
              Image img = ImageIO.read(getClass().getResource("../../assets/attackbutton.png"));
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

  public static void main(String[] args) {
    new DriverControl();
  }
}
