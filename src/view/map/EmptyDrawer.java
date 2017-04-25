package view.map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Created by Finiko on 4/20/2017.
 * NIM : 13515029.
 * File : EmptyDrawer.java
 */
public class EmptyDrawer extends JPanel {
  /** posisi X.
   */

  private int absis;
  /** posisi Y.
   */

  private int ordinat;
  /** gambar di layar.
   */

  private BufferedImage image;
  /** constructor.
   * @param inputX masukkan X
   * @param inputY masukkan Y
   */

  public EmptyDrawer(int inputX, int inputY) {
    absis = inputX;
    ordinat = inputY;
    try {
      image = ImageIO.read(getClass().getResource("../../assets/tile/empty_tile.png"));
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }
  /** menggambar ke layar
   * @param g masukkan graphics.
   */

  public void paint(Graphics g) {
    g.drawImage(image, absis, ordinat, null);
  }
  /** getter image.
   * @return image
   */

  public BufferedImage getImage() {
    return (image);
  }
}
