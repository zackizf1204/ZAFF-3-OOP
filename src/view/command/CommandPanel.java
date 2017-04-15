package view.command;

import javax.swing.*;
import java.awt.*;

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

  public CommandPanel() {

    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();

    setFont(new Font("SansSerif", Font.PLAIN, 20));
    setLayout(gridbag);

    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    JLabel namaPlayer = new JLabel("Nama Player");
    setAndAdd(namaPlayer,gridbag,c);
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    JPanel exitpanel = new JPanel(new BorderLayout());
    exitpanel.add(new ExitCommandView(),BorderLayout.LINE_END);
    JPanel pausepanel = new JPanel(new BorderLayout());
    pausepanel.add(new PauseCommandView(),BorderLayout.LINE_END);
    exitpanel.add(pausepanel,BorderLayout.CENTER);
    setAndAdd(exitpanel,gridbag,c);
    setAndAdd(new JLabel("TIMER"),gridbag,c);
    }
  }

