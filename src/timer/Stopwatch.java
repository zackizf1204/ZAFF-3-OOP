package timer;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Zacki Zulfikar Fauzi on 15-Apr-17.
 * NIM  : 13515147
 * File : Stopwatch.java
 */

public class Stopwatch {
  private int interval;
  private Timer timer;

  public Stopwatch() {
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = 5;
    timer.scheduleAtFixedRate(new TimerTask() {

      public void run() {
        setInterval();
      }
    }, delay, period);
  }

  private void setInterval() {
    if (interval == 1) {
      timer.cancel();
    }
    --interval;
  }

  public int getInterval() {
    return interval;
  }

  public static void main(String[] args) {
    Stopwatch stp = new Stopwatch();
    JFrame frame = new JFrame("FATHUR BANGSAT");
    JLabel lbl = new JLabel("60");
    frame.getContentPane().add(lbl);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
        while (stp.getInterval() > 0) {
          lbl.setText(stp.getInterval() + "");
//          System.out.print(stp.getInterval() + "");
        }


    }


  }

