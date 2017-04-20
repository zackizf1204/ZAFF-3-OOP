package view.command;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : PauseCommandView.java.
 */
public class PauseCommandView extends CommandView {
  public PauseCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/pausebutton.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }

    addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.exit(0);
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      public void mouseEntered(MouseEvent e) {
        if (isEnabled()) {
          JButton c = (JButton) e.getComponent();
          try {
            Image img = ImageIO.read(getClass().getResource("../../assets/pausebuttononhover.png"));
            c.setIcon(new ImageIcon(img));
          } catch (Exception ex) {
            System.out.println(ex);
          }
          setBorderPainted(false);
          setBackground(new Color(0, 0, 0, 0));
        }
      }

      @Override
      public void mouseExited(MouseEvent e) {
        JButton c = (JButton) e.getComponent();
        try {
          Image img = ImageIO.read(getClass().getResource("../../assets/pausebutton.png"));
          c.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
          System.out.println(ex);
        }
        setBorderPainted(false);
        setBackground(new Color(0, 0, 0, 0));
      }
    });
  }
}
