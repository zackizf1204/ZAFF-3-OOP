package view.map;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import tile.Tile;

/**
 * Created by Finiko on 4/15/2017.
 */
public class DrawTile extends JPanel{
  private int x;
  private int y;
  private BufferedImage image;

  public DrawTile (Tile inputTile) {
    x = inputTile.getX();
    y = inputTile.getY();
    try {
      if (inputTile.getType() == 0) {
        image = ImageIO.read(getClass().getResource("../../assets/tile_grass.jpg"));
      } else {
        image = ImageIO.read(getClass().getResource("../../assets/tile_river.jpg"));
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
