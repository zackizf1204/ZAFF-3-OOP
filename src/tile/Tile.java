package tile;

/**
 * Created by Finiko on 4/13/2017.
 * NIM : 13515029.
 * File : Tile.java
 */
public class Tile {
  /** absis dari Tile.
   */
  private int absis;
  /** ordinat dari Tile.
   */
  private int ordinat;
  /** height dari Tile.
   */
  private int height;
  /** type dari Tile.
   */
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

  /** getter untuk absis.
   * @return absis
   */

  public int getX() {
    return (absis);
  }
  /** getter untuk ordinat.
   * @return ordinat
   */

  public int getY() {
    return (ordinat);
  }
  /** getter untuk height.
   * @return height
   */

  public int getHeight() {
    return (height);
  }
  /** getter untuk type.
   * @return type
   */

  public int getType() {
    return (type);
  }
  /** setter untuk height.
   * @param inputHeight masukkan height
   */

  public void setHeight(int inputHeight) {
    height = inputHeight;
  }
  /** setter untuk type.
   * @param inputType masukkan type
   */

  public void setType(int inputType) {
    type = inputType;
  }
  /** cek apakah tile adalah tipe yang bisa dilewati.
   * @return true jika iya. false jika tidak.
   */

  public boolean isPassable() {
    return (type == 0);
  }
  /** setter untuk absis.
   * @param inputX masukkan x.
   */

  public void setX(int inputX) {
    absis = inputX;
  }

  /** setter untuk ordinat.
   * @param inputY masukkan Y
   */

  public void setY(int inputY) {
    ordinat = inputY;
  }
}
