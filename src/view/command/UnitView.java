package view.command;

import object.Unit;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : UnitView.java.
 */
public class UnitView extends JPanel {

  private JLabel hp;
  private JLabel mp;
  private JLabel strength;
  private JLabel intel;
  private JLabel mov;
  private JLabel agi;

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
    setBackground(Color.CYAN);

    c.weighty = 1.0;                //reset to the default
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.gridheight = 1;               //reset to the default
    hp = new JLabel("HP");
    gridbag.setConstraints(hp,c);
    add(hp);
    mp = new JLabel("MP");
    gridbag.setConstraints(mp,c);
    add(mp);
    strength = new JLabel("strength");
    gridbag.setConstraints(strength,c);
    add(strength);
    intel = new JLabel("intelligence");
    gridbag.setConstraints(intel,c);
    add(intel);
    mov = new JLabel("mov");
    gridbag.setConstraints(mov,c);
    add(mov);
    agi = new JLabel("agi");
    gridbag.setConstraints(agi,c);
    add(agi);
  }

  public void setAttribute(Unit unit) {
    hp.setText("HP : "+unit.getCurrentHp()+"/"+unit.getMaxHp());
    mp.setText("MP : "+unit.getCurrentMp()+"/"+unit.getMaxMp());
    strength.setText("STR : "+unit.getStrength()+"");
    intel.setText("INT : "+unit.getIntelligence()+"");
    mov.setText("MOV : "+unit.getMov()+"");
    agi.setText("AGI : "+unit.getAgi()+"");
  }
}
