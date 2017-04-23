package map;
import tile.Tile;
import object.MapObject;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Map {
  private int sizeX;
  private int sizeY;
  private MapObject[] arrayObject;
  private Tile[][] dataTiles;
  private int countObject;

  /**Constructor map.
   */

  public Map() {
    int i;
    int j;
    sizeX = 20;
    sizeY = 20;
    arrayObject = new MapObject[sizeY * sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    for (i = 0; i < sizeY; i++) {
      for (j = 0; j < sizeX; j++) {
        dataTiles[j][i] = new Tile(0, 0,j,i);
      }
    }
    countObject = 0;
  }

  /**Constructor map.
   * @param inputSizeX masukkan ukuran X map
   * @param inputSizeY masukkan ukuran Y map
   */

  public Map(int inputSizeX, int inputSizeY) {
    int i;
    int j;
    sizeX = inputSizeX;
    sizeY = inputSizeY;
    arrayObject = new MapObject[sizeY * sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    for (i = 0; i < sizeY; i++) {
      for (j = 0; j < sizeX; j++) {
        dataTiles[j][i] = new Tile(0, 0,j,i);
      }
    }
    countObject = 0;
  }

  /** Mendapatkan ukuran X map.
   * @return ukuran X map
   */
  public int getSizeX() {
    return (sizeX);
  }

  /** Mendapatkan ukuran Y map.
   * @return ukuran Y map
   */
  public int getSizeY() {
    return (sizeY);
  }

  /** Mendapatkan object map pada indeks ke i.
   * @param i indeks objek
   * @return object map yang ke i.
   */

  public MapObject getMapObject(int i) {
    return (arrayObject[i]);
  }

  /** Mendapatkan Tile di koordinat (i, j).
   * @param i indeks kolom
   * @param j indeks baris
   * @return Tile
   */

  public Tile getTile(int i, int j) {
    return (dataTiles[j][i]);
  }

  /** melakukan set pada nilai ukuran X map.
   * @param inputSizeX masukkan ukuran X map
   */

  public void setSizeX(int inputSizeX) {
    sizeX = inputSizeX;
  }

  /** melakukan set pada nilai ukuran Y  map.
   * @param inputSizeY masukkan ukuran Y map
   */

  public void setSizeY(int inputSizeY) {
    sizeY = inputSizeY;
  }

  /** melakukan set pada MapObject pada indeks ke i.
   * @param i indeks arrayObject
   * @param data masukkan mapObject
   */

  public void setMapObject(int i, MapObject data) {
    arrayObject[i] = data;
    countObject = countObject + 1;
  }

  /** melakukan set pada dataTiles.
   * @param i kolom
   * @param j baris
   * @param data masukkan tile
   */

  public void setDataTiles(int i, int j, Tile data) {
    dataTiles[j][i] = data;
  }

  /** mencari object di posisi x dan y
   * @param x masukkan x
   * @param y masukkan y
   * @return true jika ada. false jika tidak.
   */

  public boolean adaObject(int x, int y) {
    int i;
    i = 0;
    while ((i < countObject)&&((arrayObject[i].getAbsis() != x)||(arrayObject[i].getOrdinat() != y))) {
      i = i + 1;
    }
    if (i >= countObject) {
      return (false);
    } else {
      return ((arrayObject[i].getAbsis() == x)&&(arrayObject[i].getOrdinat() == y));
    }
  }

  /** mencari dan mengembalikan MapObject di posisi x dan y.
   * @param x masukkan x
   * @param y masukkan y
   * @return MapObject yang memiliki absis x dan ordinat y
   */

  public MapObject searchObject(int x, int y) {
    int i;
    i = 0;
    while ((i < countObject) && ((arrayObject[i].getAbsis() != x) || (arrayObject[i].getOrdinat() != y))) {
      i = i + 1;
    }
    return (arrayObject[i]);
  }
}