package tile;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Tile {
  private int x;
  private int y;
  private int height;
  private int type;

  public Tile() {
    x = 0;
    y = 0;
    height = 0;
    type = 0;
  }
  public Tile(int inputHeight, int inputType,int inputX, int inputY) {
    height = inputHeight;
    type = inputType;
    x = inputX;
    y = inputY;
  }
  public int getX() {
    return (x);
  }
  public int getY() {
    return (y);
  }
  public int getHeight() {
    return (height);
  }
  public int getType() {
    return(type);
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
    x = inputX;
  }
  public void setY(int inputY) {
    y = inputY;
  }
}
