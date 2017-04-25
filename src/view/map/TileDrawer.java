package view.map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Created by Finiko on 4/15/2017.
 * NIM : 13515029.
 * File : TileDrawer.java
 */
public class TileDrawer extends JPanel {
  /** posisi X.
   */

  private int absis;
  /** posisi Y.
   */

  private int ordinat;
  /** image dari object.
   */

  private BufferedImage image;
  /** constructor.
   * @param type masukkan tipe
   */

  public TileDrawer(int type) {
    absis = 0;
    ordinat = 0;
    try {
      if (type == 2) {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_grass.jpg"));
      } else if (type == 0) {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_river.jpg"));
      } else if (type == 1) {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_beach.jpg"));
      } else {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_snow.jpg"));
      }
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }
  /** menggambar tile.
   * @param g masukkan graphics
   */

  public void paint(Graphics g) {
    g.drawImage(image, absis, ordinat, null);
  }
  /**getter image.
   * @return image.
   */

  public BufferedImage getImage() {
    return (image);
  }
}