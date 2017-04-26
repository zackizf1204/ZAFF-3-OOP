package tile;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Tile {
  private int absis;
  private int ordinat;
  private int height;
  private int type;
  /** Constructor tanpa parameter.
   */

  public Tile() {
    absis = 0;
    ordinat = 0;
    height = 0;
    type = 0;
  }
  /** Constructor dengan parameter.
   * @param inputHeight masukkan tinggi
   * @param inputType masukkan tipe tile
   * @param inputX masukkan x
   * @param inputY masukkan y
   */

  public Tile(int inputHeight, int inputType,int inputX, int inputY) {
    height = inputHeight;
    type = inputType;
    absis = inputX;
    ordinat = inputY;
  }

  public int getX() {
    return (absis);
  }

  public int getY() {
    return (ordinat);
  }

  public int getHeight() {
    return (height);
  }

  public int getType() {
    return (type);
  }

  public void setHeight(int inputHeight) {
    height = inputHeight;
  }

  public void setType(int inputType) {
    type = inputType;
  }

  public boolean isPassable() {
    return (type == 1);
  }

  public void setX(int inputX) {
    absis = inputX;
  }

  public void setY(int inputY) {
    ordinat = inputY;
  }
}
