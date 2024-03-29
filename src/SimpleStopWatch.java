/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : SimpleStopWatch.java.
 */
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import javax.swing.*;

public class SimpleStopWatch {

  public static void main(String[] args) {
    new SimpleStopWatch();
  }

  public SimpleStopWatch() {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }

        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StopWatchPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }
    });
  }

  public class StopWatchPane extends JPanel {

    private JLabel label;
    private long lastTickTime;
    private Timer timer;

    public StopWatchPane() {
      setLayout(new GridBagLayout());
      label = new JLabel(String.format("%04d:%02d:%02d.%03d", 0, 0, 0, 0));

      timer = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          long runningTime = System.currentTimeMillis() - lastTickTime;
          Duration duration = Duration.ofMillis(runningTime);
          long hours = duration.toHours();
          duration = duration.minusHours(hours);
          long minutes = duration.toMinutes();
          duration = duration.minusMinutes(minutes);
          long millis = duration.toMillis();
          long seconds = millis / 1000;
          millis -= (seconds * 1000);
          label.setText(String.format("%04d:%02d:%02d.%03d", hours, minutes, seconds, millis));
        }
      });

      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.weightx = 1;
      gbc.gridwidth = GridBagConstraints.REMAINDER;
      gbc.insets = new Insets(4, 4, 4, 4);
      add(label, gbc);

      JButton start = new JButton("Start");
      start.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if (!timer.isRunning()) {
            lastTickTime = System.currentTimeMillis();
            timer.start();
          }
        }
      });
      JButton stop = new JButton("Stop");
      stop.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          timer.stop();
        }
      });

      gbc.gridx = 0;
      gbc.gridy++;
      gbc.weightx = 0;
      gbc.gridwidth = 1;
      add(start, gbc);
      gbc.gridx++;
      add(stop, gbc);
    }

  }

}
