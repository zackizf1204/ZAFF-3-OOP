package view.command;

import timer.Stopwatch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : CommandPanel.java.
 */
public class CommandPanel extends JPanel {
  protected void setAndAdd(Component ctr,
                            GridBagLayout gridbag,
                            GridBagConstraints c) {
    gridbag.setConstraints(ctr,c);
    add(ctr);
  }

  private JLabel bijijaki = new JLabel("15");
  GridBagLayout gridbag = new GridBagLayout();
  GridBagConstraints c = new GridBagConstraints();

  public CommandPanel() {

    setFont(new Font("SansSerif", Font.PLAIN, 20));
    setLayout(gridbag);

    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    JLabel namaPlayer = new JLabel("Nama Player");
    setAndAdd(namaPlayer, gridbag, c);
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    JPanel exitpanel = new JPanel(new BorderLayout());
    exitpanel.add(new ExitCommandView(), BorderLayout.LINE_END);
    JPanel pausepanel = new JPanel(new BorderLayout());
    pausepanel.add(new PauseCommandView(), BorderLayout.LINE_END);
    exitpanel.add(pausepanel, BorderLayout.CENTER);
    setAndAdd(exitpanel, gridbag, c);
    setAndAdd(bijijaki, gridbag, c);

  }
  public void setTimerLabel(int i){
    bijijaki.setText(i + "");

  }

  public String getTimerLabel() {
    return bijijaki.getText();
  }
  public void runCommandPanel() {
    Stopwatch stp = new Stopwatch();
    //while (stp.getInterval() > 0) {
      bijijaki.setText(4 + "");

    //}
  }
}

