
package view.command;

import timer.Stopwatch;

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
public abstract class CommandView extends JButton {
  /**
   * Konstrutktor CommandView.
   * menghasilkan sebuah button yang telah terkustomisasi.
   */
  public CommandView() {
    super();
    setBorderPainted(false);
    setContentAreaFilled(false);
    setOpaque(false);
    setBackground(new Color(0,0,0,0));
  }

  public abstract int getButtonType();

  public static void main(String[] args) {
    JFrame frame = new JFrame("FATHUR BANGSAT");
    JPanel newp = new JPanel(new BorderLayout());
    JPanel endp = new JPanel(new BorderLayout());
    JPanel panelcommand = new JPanel(new GridLayout(2,2));
    panelcommand.add(new AttackCommandView());
    panelcommand.add(new SkillCommandView());

    panelcommand.add(new WaitCommandView());
    panelcommand.add(new PickCommandView());
    panelcommand.setBackground(Color.blue);


    endp.add(panelcommand,BorderLayout.LINE_END);
    endp.setBackground(new Color(0,0,0,100));
    // make allunitlayout
    JPanel allunit = new JPanel(new FlowLayout());
    allunit.add(new UnitView());
    allunit.add(new UnitView());
    allunit.add(new UnitView());
    allunit.add(new UnitView());
    allunit.setOpaque(false);
    CommandPanel cp = new CommandPanel();
    newp.add(cp,BorderLayout.PAGE_START);
    endp.add(allunit,BorderLayout.LINE_START);
    newp.add(endp,BorderLayout.PAGE_END);
    frame.add(newp);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);

  }
}
