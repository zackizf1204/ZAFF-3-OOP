package map;

import object.MapObject;
import tile.Tile;

/**
 * Created by Finiko on 4/13/2017.
 */
public class Map {
  private int sizeX;
  private int sizeY;
  private MapObject[] arrayObject;
  private Tile[][] dataTiles;
  private int countObject;

  public int getCountObject() {
    return countObject;
  }

  /**Constructor map tanpa parameter.
   */

  public Map() {
    sizeX = 15;
    sizeY = 20;
    arrayObject = new MapObject[sizeY * sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    int i;
    int j;
    for (i = 0; i < sizeY; i++) {
      for (j = 0; j < sizeX; j++) {
        dataTiles[i][j] = new Tile(0, 0,j,i);
      }
    }
    countObject = 0;
  }
  /**Constructor map dengan parameter.
   * @param inputSizeX masukkan ukuran X map
   * @param inputSizeY masukkan ukuran Y map
   */

  public Map(int inputSizeX, int inputSizeY) {
    sizeX = inputSizeX;
    sizeY = inputSizeY;
    arrayObject = new MapObject[sizeY * sizeX];
    dataTiles = new Tile[sizeY][sizeX];
    int i;
    int j;
    for (i = 0; i < sizeY; i++) {
      for (j = 0; j < sizeX; j++) {
        dataTiles[i][j] = new Tile(0, 0,j,i);
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
    return (dataTiles[i][j]);
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
  public void moveMapObject(int i, MapObject data) {
    arrayObject[i] = data;
  }
  /** melakukan set pada dataTiles.
   * @param i kolom
   * @param j baris
   * @param data masukkan tile
   */

  public void setDataTiles(int i, int j, Tile data) {
    dataTiles[i][j] = data;
  }
  /** mencari object di posisi x dan y
   * @param x masukkan x
   * @param y masukkan y
   * @return true jika ada. false jika tidak.
   */

  public boolean adaObject(int x, int y) {
    int i;
    int absis;
    int ordinat;
    i = 0;
    boolean found = false;
    if (countObject > 0) {

      while ((!found) && (i < countObject)){
        if ((arrayObject[i].getAbsis() == x) && (arrayObject[i].getOrdinat() == y)) {
          found = true;
        } else {
          i++;
        }
      }

      /*
      do {
        absis = arrayObject[i].getAbsis();
        ordinat = arrayObject[i].getOrdinat();
        i = i + 1;
      } while ((i < countObject) && ((absis != x) || (ordinat != y)));
      /*
      while ((i < countObject) && ((absis != x) || (ordinat != y))) {
        i = i + 1;
        if (i < countObject) {
          System.out.println(i);
          absis = arrayObject[i].getAbsis();
          ordinat = arrayObject[i].getOrdinat();
        }
      }
      if (i >= countObject) {
        return (false);
      } else {
        return ((absis == x) && (ordinat == y));
      }
    } else {
      return (false);
      */
    }
    return found;
  }
  /** mencari dan mengembalikan MapObject di posisi x dan y.
   * @param x masukkan x
   * @param y masukkan y
   * @return MapObject yang memiliki absis x dan ordinat y
   */

  public MapObject searchObject(int x, int y) {
    int i;
    int absis;
    int ordinat;
    i = 0;
    absis = arrayObject[i].getAbsis();
    ordinat = arrayObject[i].getOrdinat();
    while ((i < countObject) && ((absis != x) || (ordinat != y))) {
      i = i + 1;
      if (i < countObject) {
        absis = arrayObject[i].getAbsis();
        ordinat = arrayObject[i].getOrdinat();
      }
    }
    return (arrayObject[i]);
  }
}