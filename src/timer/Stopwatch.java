package timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Zacki Zulfikar Fauzi on 15-Apr-17.
 * NIM  : 13515147
 * File : Stopwatch.java
 */

public class Stopwatch {
  static int interval;
  static Timer timer;

  public Stopwatch() {
    /*Scanner sc = new Scanner(System.in);
    System.out.print("Input seconds => : ");
    String secs = sc.nextLine();*/
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = 60;//Integer.parseInt(secs);
    System.out.println(interval);
    timer.scheduleAtFixedRate(new TimerTask() {

      public void run() {
        System.out.println(setInterval());

      }
    }, delay, period);
  }

  private static final int setInterval() {
    if (interval == 1) {
      timer.cancel();
    }
    return --interval;
  }
}
