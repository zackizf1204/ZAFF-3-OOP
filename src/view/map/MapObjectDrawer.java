package view.map;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import object.MapObject;

/**
 * Created by Finiko on 4/19/2017.
 */
public class MapObjectDrawer extends JPanel {
  private int absis;
  private int ordinat;
  private BufferedImage image;

  /** constructor.
   * @param inputObject masukkan object input.
   */

  public MapObjectDrawer(MapObject inputObject) {
    absis = inputObject.getAbsis();
    ordinat = inputObject.getOrdinat();
    try {
      if (inputObject.getObjectType() == "Unit") {
        image = ImageIO.read(getClass().getResource("../../assets/unit/monk_down.gif"));
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
