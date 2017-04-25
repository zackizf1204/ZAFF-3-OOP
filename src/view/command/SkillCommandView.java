package view.command;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : SkillCommandView.java.
 */
public class SkillCommandView extends CommandView {
  /**
   * Konstruktor tanpa parameter.
   */
  public SkillCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/skillbutton_2.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void setToolTip(String str) {
    setToolTipText(str);
  }

  @Override
  public int getButtonType() {
    return 5;
  }
}
