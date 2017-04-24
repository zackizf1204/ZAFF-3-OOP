import map.Map;
import object.item.Recovery;
import view.command.AttackCommandView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Zacki Zulfikar Fauzi on 24-Apr-17.
 * NIM  : 13515147
 * File : MenuControl.java
 */
public class MenuControl {
  private MenuViewer menu;
  private int jumlahPlayer;

  public MenuControl(){
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {

        menu = new Menuviewer();
        menu.addMouseListener(new MouseListener() {
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

  public int getJumlahPlayer() {
    return jumlahPlayer;
  }

  public void setJumlahPlayer(int jumlahPlayer) {
    this.jumlahPlayer = jumlahPlayer;
  }
}
