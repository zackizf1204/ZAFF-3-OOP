package view.map;

import object.MapObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/20/2017.
 */
public class DrawEmpty {
  private int x;
  private int y;
  private BufferedImage image;

  public DrawEmpty(int inputX, int inputY) {
    x = inputX;
    y = inputY;
    try {
      image = ImageIO.read(getClass().getResource("../../assets/empty_tile.png"));
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
