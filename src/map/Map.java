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

  /** Constructor map.
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

  /** Constructor map.
   * @param inputSizeX masukkan ukuran X
   * @param inputSizeY masukkan ukuran Y
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

  public MapObject getMapObject (int i, int j) {
    return (position[j][i]);
  }
  public Tile getTile (int i, int j) {
    return (dataTiles[j][i]);
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
  public void setPosition(int i, int j, MapObject data) {
    position[j][i] = data;
  }
  public void setDataTiles(int i, int j, Tile data) {
    dataTiles[j][i] = data;
  }