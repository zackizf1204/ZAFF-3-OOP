package view.command;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import object.Player;
import object.Unit;

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
  private JLabel playername;

  /**
   * Konstruktor tanpa parameter.
   * Menginisialisasi unit view dengan tulisan templates dan sprites.
   */
  public UnitView() {
    super();
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();
    setFont(new Font("SansSerif", Font.PLAIN, 14));
    setLayout(gridbag);
    c.gridwidth = 1;                //reset to the default
    c.gridheight = 7;
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
    playername = new JLabel("player");
    gridbag.setConstraints(playername,c);
    add(playername);
  }

  /**
   * Melakukan pengesetan label yang terdapat dalam unit.
   * @param p player yang akan diisikan ke dalam label
   */
  public void setAttribute(Player p) {
    Unit unit = p.getUnit(0);
    playername.setText(p.getPlayerName());
    hp.setText("HP : " + unit.getCurrentHp() + "/" + unit.getMaxHp());
    mp.setText("MP : " + unit.getCurrentMp() + "/" + unit.getMaxMp());
    strength.setText("STR : " + unit.getStrength() + "");
    intel.setText("INT : " + unit.getIntelligence() + "");
    mov.setText("MOV : " + unit.getMov() + "");
    agi.setText("AGI : " + unit.getAgi() + "");
  }
}
