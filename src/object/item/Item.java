package object.item;

import object.MapObject;

/**
 * Created by Zacki Zulfikar Fauzi on 13-Apr-17.
 * NIM  : 13515147
 * File : Item.java
 */
public class Item extends MapObject {
  private String itemType;

  public Item() {
    super();
    super.setObjectType("Item");
  }

  public Item(int inputX, int inputY) {
    super(inputX, inputY);
    super.setObjectType("Item");
  }

  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }
}
