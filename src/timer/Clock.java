package timer;


import java.awt.EventQueue;
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
    JFrame f = new JFrame("Seconds");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pnl = new JPanel();

    pnl.add(new JLabel("biji"));
    pnl.add(timeLabel);
    f.add(pnl);
    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    timer.schedule(new UpdateUITask(), 0, 1000);
  }

  private class UpdateUITask extends TimerTask {

    nSeconds = 5;

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
