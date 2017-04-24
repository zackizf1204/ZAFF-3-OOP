package menu;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Created by Finiko on 4/24/2017.
 */

public class BackgroundDrawer extends JPanel {
  private BufferedImage image;
  /** constructor.
   */

  public BackgroundDrawer() {
    try {
      image = ImageIO.read(getClass().getResource("../../assets/boldandbrash.jpg"));
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }

  /** menggambar background.
   * @param g masukkan graphics
   */

  public void paint(Graphics g) {
    g.drawImage(image,0, 0, null);
  }
  /**getter image.
   * @return image.
   */

  public BufferedImage getImage() {
    return (image);
  }
}
