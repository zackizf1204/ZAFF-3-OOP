
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
    setContentAreaFilled(false);
    setOpaque(false);
    setBackground(new Color(0,0,0,0));
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("FATHUR BANGSAT");
    /*
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    JPanel gridCommandView = new JPanel(gbl);

    //frame.add("Map Command View",gridCommandView);
    JPanel testingpanel = new JPanel(new GridLayout(2,2));
    JPanel wtf = new JPanel(new BorderLayout());
    wtf.add(new CommandPanel(),BorderLayout.PAGE_START);
    testingpanel.add(wtf);
    JPanel panelcommand = new JPanel(new GridLayout(2,2));
    panelcommand.add(new AttackCommandView());
    panelcommand.add(new SkillCommandView());

    panelcommand.add(new WaitCommandView());
    panelcommand.add(new ExitCommandView());
    panelcommand.setBackground(Color.blue);
    panelcommand.setSize(new Dimension(1,1));
    testingpanel.add(panelcommand);
    testingpanel.add(Box.createHorizontalGlue());
    JPanel ptest = new JPanel();
    ptest.setBackground(Color.BLACK);
    testingpanel.add(ptest);

    frame.getContentPane().add(testingpanel);*/

    JPanel newp = new JPanel(new BorderLayout());
    newp.add(new CommandPanel(),BorderLayout.PAGE_START);
    JPanel endp = new JPanel(new BorderLayout());
    JPanel panelcommand = new JPanel(new GridLayout(2,2));
    panelcommand.add(new AttackCommandView());
    panelcommand.add(new SkillCommandView());

    panelcommand.add(new WaitCommandView());
    panelcommand.add(new PickCommandView());
    panelcommand.setBackground(Color.blue);


    endp.add(panelcommand,BorderLayout.LINE_END);
    endp.add(new UnitView(),BorderLayout.LINE_START);
    newp.add(endp,BorderLayout.PAGE_END);
    frame.getContentPane().add(newp);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);

   }

}
