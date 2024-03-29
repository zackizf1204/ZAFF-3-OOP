package timer;


import view.command.*;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 * Created by Zacki Zulfikar Fauzi on 19-Apr-17.
 * NIM  : 13515147
 * File : Clock.java
 */
public class Clock {

  private Timer timer = new Timer();
  private JLabel timeLabel = new JLabel(" ", JLabel.CENTER);
  private int nSeconds;
  public Clock() {
    JFrame frame = new JFrame("Seconds");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
    newp.add(timeLabel,BorderLayout.CENTER);

    frame.add(newp);

    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);
    timer.schedule(new UpdateUITask(), 0, 1000);
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
          timeLabel.setText(String.valueOf(nSeconds--));

        }
      });
    }
  }

  public static void main(String args[]) {
    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        final Clock clock = new Clock();
      }
    });
  }

  public int getnSeconds() {
    return nSeconds;
  }
}

