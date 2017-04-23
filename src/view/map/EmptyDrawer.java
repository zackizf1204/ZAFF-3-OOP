package view.map;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/20/2017.
 */
public class EmptyDrawer extends JPanel {
  private int x;
  private int y;
  private BufferedImage image;

  public EmptyDrawer(int inputX, int inputY) {
    x = inputX;
    y = inputY;
    try {
      image = ImageIO.read(getClass().getResource("../../assets/tile/empty_tile.png"));
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
