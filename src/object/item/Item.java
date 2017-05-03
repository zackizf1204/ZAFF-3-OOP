package object.item;

import object.MapObject;

/**
 * Created by Zacki Zulfikar Fauzi on 13-Apr-17.
 * NIM  : 13515147
 * File : Item.java
 */
public class Item extends MapObject {
  protected String itemType;

  /**
   * Konstruktor item tanpa parameter.
   */
  public Item() {
    super();
    setObjectType();
  }

  /**
   * Konstruktor item dengan parameter.
   * @param inputX masukkan posisi X.
   * @param inputY masukkan posisi Y.
   */

  public Item(int inputX, int inputY) {
    super(inputX, inputY);
    setObjectType();
  }

  /**
   * Getter tipe item.
   * @return itemType
   */
  public String getItemType() {
    return itemType;
  }

  /**
   * Setter item type.
   * @param itemType tipe item.
   */
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  /**
   * Implementasi dari method abstract setObjectType.
   */
  public void setObjectType() {
    objectType = "Item";
  }
}
