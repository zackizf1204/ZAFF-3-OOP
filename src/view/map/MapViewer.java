package view.map;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import map.Map;
import object.Player;
import object.Unit;
import object.item.Item;

/**
 * Created by Finiko on 4/15/2017.
 * NIM : 13515029.
 * File : MapViewer.java
 */
public class MapViewer extends JPanel {
  /** batasan layout.
   */

  private GridBagConstraints batasan;
  /** content dari component.
   */

  private JComponent content;
  /** panel layer.
   */

  private JLayeredPane layerPanel;
  /** layout map.
   */

  private GridBagLayout mapLayout;
  /** masukkan map.
   */

  private Map inputMap;
  /** list dari Player pada map.
   */

  private Player[] listPlayer;
  /** jumlah Player.
   */

  private int countPlayer;
  /** Jumlah Unit.
   */

  private int countUnit;
  /** constructor.
   * @param map masukkan map
   */

  public MapViewer(Map map) {
    super();
    batasan = new GridBagConstraints();
    mapLayout = new GridBagLayout();
    layerPanel = new JLayeredPane();
    content = new JPanel(mapLayout);
    content.setOpaque(true);
    layerPanel.setLayout(mapLayout);
    inputMap = map;
    content.add(layerPanel);
    add(content);
  }
  /** menampilkan ke layar.
   * @throws Exception jika file tidak ditemukan.
   */

  public void view() throws Exception {
    content.remove(layerPanel);
    layerPanel = new JLayeredPane();
    layerPanel.setLayout(mapLayout);
    content.add(layerPanel);
    viewTile();
    viewMapObject();
  }
  /** Setter pada list Player.
   * @param list masukkan list Player.
   */

  public void setListPlayer(Player[] list) {
    listPlayer = list;
  }
  /** Setter jumlah Player.
   * @param count masukkan jumlah Player.
   */

  public void setCountPlayer(int count) {
    countPlayer = count;
  }
  /** Menampilkan tile.
   */

  public void viewTile() {
    int x;
    int y;
    TileDrawer gambarDarat = new TileDrawer(2);
    TileDrawer gambarLaut = new TileDrawer(0);
    TileDrawer gambarPantai = new TileDrawer(1);
    TileDrawer gambarSalju = new TileDrawer(3);
    for (y = 0; y < inputMap.getSizeY(); y++) {
      for (x = 0; x < inputMap.getSizeX(); x++) {
        batasan.gridx = y;
        batasan.gridy = x;
        JLabel mapIcon;
        if (inputMap.getTile(x,y).getHeight() == 0) {
          mapIcon = new JLabel(new ImageIcon(gambarLaut.getImage()));
        } else if (inputMap.getTile(x,y).getHeight() == 1) {
          mapIcon = new JLabel(new ImageIcon(gambarPantai.getImage()));
        } else if (inputMap.getTile(x,y).getHeight() == 2) {
          mapIcon = new JLabel(new ImageIcon(gambarDarat.getImage()));
        } else {
          mapIcon = new JLabel(new ImageIcon(gambarSalju.getImage()));
        }
        mapLayout.setConstraints(mapIcon,batasan);
        layerPanel.add(mapIcon);
        layerPanel.setLayer(mapIcon,new Integer(0),0);
        mapIcon.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.GRAY));
      }
    }
  }
  /** Menampilkan Map Object.
   */

  public void viewMapObject() {
    int x;
    int y;
    EmptyDrawer gambarEmpty = new EmptyDrawer(0,0);
    MapObjectDrawer pu = new MapObjectDrawer(-1);
    MapObjectDrawer rec = new MapObjectDrawer(-2);
    MapObjectDrawer ty0 = new MapObjectDrawer(0);
    MapObjectDrawer ty1 = new MapObjectDrawer(1);
    MapObjectDrawer ty2 = new MapObjectDrawer(2);
    MapObjectDrawer ty3 = new MapObjectDrawer(3);
    for (x = 0; x < inputMap.getSizeX();x++) {
      for (y = 0; y < inputMap.getSizeY();y++) {
        JLabel objectIcon;
        batasan.gridx = y;
        batasan.gridy = x;
        if (inputMap.adaObject(x,y)) {
          if (inputMap.searchObject(x,y).getObjectType() == "Unit") {
            Unit unit = (Unit) inputMap.searchObject(x,y);
            if (unit.getType() == 0) {
              objectIcon = new JLabel(new ImageIcon(ty0.getImage()));
            } else if (unit.getType() == 1) {
              objectIcon = new JLabel(new ImageIcon(ty1.getImage()));
            } else if (unit.getType() == 2) {
              objectIcon = new JLabel(new ImageIcon(ty2.getImage()));
            } else {
              objectIcon = new JLabel(new ImageIcon(ty3.getImage()));
            }
          } else {
            Item item = (Item) inputMap.searchObject(x,y);
            if (item.getItemType() == "PowerUp") {
              objectIcon = new JLabel(new ImageIcon(pu.getImage()));
            } else {
              objectIcon = new JLabel(new ImageIcon(rec.getImage()));
            }
          }
          mapLayout.setConstraints(objectIcon,batasan);
          layerPanel.add(objectIcon,batasan);
          layerPanel.setLayer(objectIcon,new Integer(1),0);
        } else {
          JLabel emptyIcon = new JLabel(new ImageIcon(gambarEmpty.getImage()));
          mapLayout.setConstraints(emptyIcon,batasan);
          layerPanel.add(emptyIcon,batasan);
          layerPanel.setLayer(emptyIcon,new Integer(1),0);
        }
      }
    }
  }

  /** getter untuk content.
   * @return Content pada map viewer.
   */
  public JComponent getContent() {
    return (content);
  }

  /**
   * Mengecek apakah ada player di x dan y.
   * @param x parameter x
   * @param y parameter y
   * @return true jika ada player di point x dan y
   */
  public boolean adaPlayer(int x, int y) {
    int i;
    boolean ada;
    ada = false;
    i = 0;
    do {
      countUnit = listPlayer[i].getCountUnit();
      int j;
      j = 0;
      int absis;
      int ordinat;
      do {
        absis = listPlayer[i].getUnit(j).getAbsis();
        ordinat = listPlayer[i].getUnit(j).getOrdinat();
        j = j + 1;
      } while ((j < countUnit) && ((absis != x) || (ordinat != y)));
      if ((absis == x) && (ordinat == y)) {
        ada = true;
      }
      i = i + 1;
    } while ((i < countPlayer) && (!ada));
    return (ada);
  }
  /** getter unit di posisi X dan Y.
   * @param x posisi x.
   * @param y posisi y.
   * @return unit di posisi x dan y.
   */

  public Unit getAbsisOrdinatUnit(int x, int y) {
    int i;
    int k;
    i = 0;
    boolean ada;
    k = 0;
    ada = false;
    do {
      countUnit = listPlayer[i].getCountUnit();
      int j;
      j = 0;
      int absis;
      int ordinat;
      do {
        absis = listPlayer[i].getUnit(j).getAbsis();
        ordinat = listPlayer[i].getUnit(j).getOrdinat();
        j = j + 1;
      } while ((j < countUnit) && ((absis != x) || (ordinat != y)));
      if ((absis == x) && (ordinat == y)) {
        ada = true;
        k = j;
      }
      i = i + 1;
    } while ((i < countPlayer) && (!ada));
    return (listPlayer[i].getUnit(k));
  }
}
