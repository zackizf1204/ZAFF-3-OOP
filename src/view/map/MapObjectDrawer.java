package view.map;

import object.MapObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/19/2017.
 */
public class MapObjectDrawer extends JPanel {
  private int x;
  private int y;
  private BufferedImage image;

  public MapObjectDrawer(MapObject inputObject) {
    x = inputObject.getAbsis();
    y = inputObject.getOrdinat();
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
  public void paint(Graphics g) {
    g.drawImage (image, x, y, null);
  }
  public BufferedImage getImage() {
    return (image);
  }
}
