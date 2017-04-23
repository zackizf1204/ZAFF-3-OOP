package view.map;

import object.MapObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/19/2017.
 */
public class DrawMapObject {
  private int x;
  private int y;
  private BufferedImage image;

  public DrawMapObject(MapObject inputObject) {
    x = inputObject.getAbsis();
    y = inputObject.getOrdinat();
    try {
      if (inputObject.getObjectType() == "Unit") {
        image = ImageIO.read(getClass().getResource("../../assets/monk_up.png"));
      } else {
        image = ImageIO.read(getClass().getResource("../../assets/item.png"));
      }
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }
  public void paint(Graphics g) {
    g.drawImage (image, x, y, null);
  }
  public BufferedImage getImage() {
    return (image);
  }
}
