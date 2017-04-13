package map;
import tile.Tile;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Map {
  private int sizeX;
  private int sizeY;
  private MapObject[][] position;
  private Tile[][] dataTiles;

  /**
   *
   */
  public Map() {
    int i;
    int j;
    sizeX = 20;
    sizeY = 20;
    position = new MapObject[sizeY][sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    for (i = 0; i < sizeY; i++) {
      for(j = 0; j < sizeX; j++) {
        position[j][i] = MapObject(j,i);
        dataTiles[j][i] = Tile(0,0);
      }
    }
  }

  /**
   *
   * @param inputSizeX
   * @param inputSizeY
   */

  public Map(int inputSizeX, int inputSizeY) {
    int i;
    int j;
    sizeX = inputSizeX;
    sizeY = inputSizeY;
    position = new MapObject[sizeY][sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    for (i = 0; i < sizeY; i++) {
      for(j = 0; j < sizeX; j++) {
        position[j][i] = MapObject(j,i);
        dataTiles[j][i] = Tile(0,0);
      }
    }
  }

  public int getSizeX() {
    return (sizeX);
  }

  /**
   *
   * @return
   */
  public int getSizeY() {
    return(sizeY);
  }

  /**
   *
   * @param inputSizeX
   */

  public void setSizeX(int inputSizeX) {
    sizeX = inputSizeX;
  }

  /**
   *
   * @param inputSizeY
   */

  public void setSizeY(int inputSizeY) {
    sizeY = inputSizeY;
  }
}
