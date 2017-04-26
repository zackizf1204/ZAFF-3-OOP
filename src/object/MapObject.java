package object;

/**
 * Created by Zacki Zulfikar Fauzi on 13-Apr-17.
 * NIM  : 13515147
 * File : MapObject.java
 */
public abstract class MapObject {
  protected int absis;
  protected int ordinat;
  protected String objectType;

  /**
   * Konstuktor kelas MapObject.
   */
  public MapObject() {
    absis = 0;
    ordinat = 0;
  }

  /**
   * Konstuktor kelas MapObject dengan parameter.
   */

  public MapObject(int absis, int ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
  }

  /**
   * Getter objectType.
   * @return objectType Tipe objek.
   */

  public String getObjectType() {
    return objectType;
  }

  /**
   * Getter absis.
   * @return absis
   */

  public int getAbsis() {
    return absis;
  }

  /**
   * Getter ordinat.
   * @return ordinat
   */

  public int getOrdinat() {
    return ordinat;
  }

  /**
   * Setter absis.
   * @param absis absis input
   */

  public void setAbsis(int absis) {
    this.absis = absis;
  }

  /**
   * Setter ordinat.
   * @param ordinat ordinat input.
   */

  public void setOrdinat(int ordinat) {
    this.ordinat = ordinat;
  }

  /**
   * Setter abstract object type.
   */

  public abstract void setObjectType();
}
