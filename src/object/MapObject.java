package object;

/**
 * Created by Zacki Zulfikar Fauzi on 13-Apr-17.
 * NIM  : 13515147
 * File : MapObject.java
 */
public class MapObject {
  private int absis;
  private int ordinat;
  private String objectType;

  public MapObject() {
    absis = 0;
    ordinat = 0;
  }

  public MapObject(int absis, int ordinat) {
    this.absis = absis;
    this.ordinat = ordinat;
  }

  public String getObjectType() {
    return objectType;
  }

  public int getAbsis() {
    return absis;
  }

  public int getOrdinat() {
    return ordinat;
  }

  public void setAbsis(int absis) {
    this.absis = absis;
  }

  public void setOrdinat(int ordinat) {
    this.ordinat = ordinat;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }
}
