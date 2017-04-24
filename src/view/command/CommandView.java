
package view.command;

import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import timer.Stopwatch;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/13/2017.
 * FileName : CommandView.java.
 */
public abstract class CommandView extends JButton {
  /**
   * Konstrutktor CommandView.
   * menghasilkan sebuah button yang telah terkustomisasi.
   */
  public CommandView() {
    super();
    setBorderPainted(false);
    setContentAreaFilled(false);
    setOpaque(false);
    setBackground(new Color(0,0,0,0));
  }

  public abstract int getButtonType();
}
