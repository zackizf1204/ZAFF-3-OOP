package view.command;

import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : AttackCommandView.java.
 */
public class AttackCommandView extends CommandView {

  /**
   * Konstruktor tanpa parameter.
   * Mengimplementasi getbuttonType
   */
  public AttackCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/attackbutton.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }
    setBorderPainted(false);
    setBackground(new Color(0, 0, 0, 0));
  }

  @Override
  public int getButtonType() {
    return 1;
  }
}
