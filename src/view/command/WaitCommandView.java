package view.command;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : WaitCommandView.java.
 */
public class WaitCommandView extends CommandView {

  /**
   * Konstruktor tanpa parameter.
   */
  public WaitCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/waitbutton_2.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }


  }

  @Override
  public int getButtonType() {
    return 6;
  }
}
