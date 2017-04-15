
package view.command;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/13/2017.
 * FileName : CommandView.java.
 */
public class CommandView extends JButton {
  /**
   * Konstrutktor CommandView.
   * menghasilkan sebuah button yang telah terkustomisasi.
   */
  public CommandView() {
    super();
    setBorderPainted(false);
    setBackground(new Color(0,0,0,0));
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("FATHUR BANGSAT");
    frame.getContentPane().setLayout(new FlowLayout());
    JPanel panelcommand = new JPanel();
    panelcommand.add(new AttackCommandView());
    panelcommand.add(new SkillCommandView());
    frame.getContentPane().add(panelcommand);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.pack();
    //frame.setUndecorated(true);
    frame.setVisible(true);
  }

}
