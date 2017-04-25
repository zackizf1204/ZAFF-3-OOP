package view.map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import object.MapObject;
import object.Unit;
import object.item.Item;

/**
 * Created by Finiko on 4/19/2017.
 */
public class MapObjectDrawer extends JPanel {
  private int absis;
  private int ordinat;
  private BufferedImage image;

  /** constructor.
   * @param type masukkan object input.
   */

  public MapObjectDrawer(int type) {
    absis = 0;
    ordinat = 0;
    try {
      if (type == 0) {
        image = ImageIO.read(getClass().getResource("../../assets/unit/monk_down.png"));
      } else if (type == 1) {
        image = ImageIO.read(getClass().getResource("../../assets/unit/agi_1_down.png"));
      } else if (type == 2) {
        image = ImageIO.read(getClass().getResource("../../assets/unit/int_1_down.png"));
      } else if (type == 3) {
        image = ImageIO.read(getClass().getResource("../../assets/unit/spd_down.png"));
      } else if (type == -1) {
        image = ImageIO.read(getClass().getResource("../../assets/item/pu.png"));
      } else {
        image = ImageIO.read(getClass().getResource("../../assets/item/item.png"));
      }
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }

  /** menggambar graphics g.
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
