package view.command;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : UnitView.java.
 */
public class UnitView extends JPanel{
  public UnitView() {
    super();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    setFont(new Font("SansSerif", Font.PLAIN, 14));
    setLayout(gridbag);
    c.gridwidth = 1;                //reset to the default
    c.gridheight = 6;
    c.weighty = 1.0;

    Image img = null;
    try {
      img = ImageIO.read(getClass().getResource("../../assets/boldandbrash.jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    JLabel licon = new JLabel(new ImageIcon(img));
    gridbag.setConstraints(licon,c);
    add(licon);
    setBackground(Color.blue);

    c.weighty = 1.0;                //reset to the default
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.gridheight = 1;               //reset to the default
    makeLabel("HP",gridbag,c);
    makeLabel("MP",gridbag,c);
    makeLabel("strength",gridbag,c);
    makeLabel("intelligence",gridbag,c);
    makeLabel("mov",gridbag,c);
    makeLabel("agi",gridbag,c);
  }

  protected void makeLabel(String name,
                           GridBagLayout gridbag,
                           GridBagConstraints c) {
    JLabel lbl = new JLabel(name);
    gridbag.setConstraints(lbl,c);
    add(lbl);
  }
}
