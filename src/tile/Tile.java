package tile;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Tile {
  private int height;
  private int type;

  public Tile() {
    height = 0;
    type = 0;
  }
  public Tile(int inputHeight, int inputType) {
    height = inputHeight;
    type = inputType;
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
}
