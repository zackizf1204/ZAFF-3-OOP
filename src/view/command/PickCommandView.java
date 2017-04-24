package view.command;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : PickCommandView.java.
 */
public class PickCommandView extends CommandView {
  public PickCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/pickbutton.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }

    addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {

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
            Image img = ImageIO.read(getClass().getResource("../../assets/pickbuttononhover.png"));
            c.setIcon(new ImageIcon(img));
          } catch (Exception ex) {
            System.out.println(ex);
          }
        }
      }

      @Override
      public void mouseExited(MouseEvent e) {
        JButton c = (JButton) e.getComponent();
        try {
          Image img = ImageIO.read(getClass().getResource("../../assets/pickbutton.png"));
          c.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
          System.out.println(ex);
        }
      }
    });
  }

  @Override
  public int getButtonType() {
    return 4;
  }
}
