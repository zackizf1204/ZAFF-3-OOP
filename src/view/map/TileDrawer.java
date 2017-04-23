package view.map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import tile.Tile;

/**
 * Created by Finiko on 4/15/2017.
 */
public class TileDrawer extends JPanel {
  private int absis;
  private int ordinat;
  private BufferedImage image;
  /** constructor.
   * @param inputTile masukkan tile
   */

  public TileDrawer(Tile inputTile) {
    absis = inputTile.getX();
    ordinat = inputTile.getY();
    try {
      if (inputTile.getType() == 0) {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_grass.jpg"));
      } else {
        image = ImageIO.read(getClass().getResource("../../assets/tile/tile_river.jpg"));
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
