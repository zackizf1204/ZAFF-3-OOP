package timer;

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
    interval = 60;
    System.out.println(interval);
    timer.scheduleAtFixedRate(new TimerTask() {
      public void run() {
        System.out.println(setInterval());
      }
    }, delay, period);
  }

  private int setInterval() {
    if (interval == 1) {
      timer.cancel();
    }
    return --interval;
  }

  public int getInterval() {
    return interval;
  }
}
