
import object.Unit;
import object.item.Recovery;
import view.command.*;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.util.*;
import view.command.*;
import view.map.MapViewer;
import map.Map;
import java.awt.*;
import java.util.TimerTask;
import javax.swing.*;
/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverView.java.
 */
public class DriverView {
  private java.util.Timer timer = new java.util.Timer();
  private JLabel timeLabel = new JLabel(" ", JLabel.CENTER);
  private CommandPanel cp = new CommandPanel();
  private JPanel playerPanel = new JPanel(new FlowLayout());
  private MapViewer mv;

  /**
   * Konstruktor DriverView tanpa parameter.
   */
  public DriverView(Map mp) {
    JFrame frame = new JFrame("ZAFF");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mv = new MapViewer(mp);
    try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }
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
    playerPanel.add(new UnitView());
    playerPanel.add(new UnitView());
    playerPanel.add(new UnitView());
    playerPanel.add(new UnitView());
    playerPanel.setOpaque(false);
    endp.add(playerPanel,BorderLayout.LINE_START);

    newp.add(cp,BorderLayout.PAGE_START);
    newp.add(endp,BorderLayout.PAGE_END);
    newp.add(mv,BorderLayout.CENTER);

    frame.add(newp);

    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);
    timer.schedule(new UpdateUITask(), 0, 1000);

  }

  /**
   * Getter command panel
   * @return Command panel dari suatu laman
   */
  public CommandPanel getCp() {
    return cp;
  }

  private class UpdateUITask extends TimerTask {

    int nSeconds = 5;

    @Override
    public void run() {
      EventQueue.invokeLater(new Runnable() {

        @Override
        public void run() {
          if (nSeconds == 0) {
            timer.cancel();
          }
          //timeLabel.setText(String.valueOf(nSeconds--));
          cp.setTimerLabel((nSeconds--));
        }
      });
    }
  }


  public static void main(String args[]) {
    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        Map m = new Map(15,20);
        m.setMapObject(0,new Recovery(0,0));
        m.setMapObject(1,new Unit(10,10,10,10,10,10,5,5,0));
        final DriverView clock = new DriverView(m);
      }
    });
  }
}
