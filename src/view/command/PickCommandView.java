package view.command;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : PickCommandView.java.
 */
public class PickCommandView extends CommandView {
  /**
   * Konstruktor tanpa parameter.
   */
  public PickCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/pickbutton_2.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  public int getButtonType() {
    return 4;
  }
}
