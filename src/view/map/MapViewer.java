package view.map;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import map.Map;
import object.Player;
import object.Unit;

/**
 * Created by Finiko on 4/15/2017.
 */
public class MapViewer extends JPanel {
  private GridBagConstraints batasan;
  private JComponent content;
  private JLayeredPane layerPanel;
  private GridBagLayout mapLayout;
  private Map inputMap;
  private Player[] listPlayer;
  private int countPlayer;
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
    //layerPanel = new JLayeredPane();
    viewTile();
    viewMapObject();

  }

  public void setListPlayer(Player[] list) {
    listPlayer = list;
  }
  public void setCountPlayer(int count) {
    countPlayer = count;
  }
  /** Menampilkan tile.
   */

  public void viewTile() {
    int x;
    int y;
    for (y = 0; y < inputMap.getSizeY(); y++) {
      for (x = 0; x < inputMap.getSizeX(); x++) {
        batasan.gridx = y;
        batasan.gridy = x;
        TileDrawer gambar = new TileDrawer(inputMap.getTile(y,x));
        JLabel mapIcon = new JLabel(new ImageIcon(gambar.getImage()));
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
    for (x = 0; x < inputMap.getSizeX();x++) {
      for (y = 0; y < inputMap.getSizeY();y++) {
        batasan.gridx = x;
        batasan.gridy = y;
        /*if (adaPlayer(x,y)) {
          MapObjectDrawer gambarObject = new MapObjectDrawer(getXYUnit(x,y));
          JLabel objectIcon = new JLabel(new ImageIcon(gambarObject.getImage()));
          mapLayout.setConstraints(objectIcon,batasan);
          layerPanel.add(objectIcon,batasan);
          layerPanel.setLayer(objectIcon,new Integer(1),0);
        } else */if (inputMap.adaObject(x,y)) {
          MapObjectDrawer gambarObject = new MapObjectDrawer(inputMap.searchObject(x,y));
          JLabel objectIcon = new JLabel(new ImageIcon(gambarObject.getImage()));
          mapLayout.setConstraints(objectIcon,batasan);
          layerPanel.add(objectIcon,batasan);
          layerPanel.setLayer(objectIcon,new Integer(1),0);
        } else {
          EmptyDrawer gambarEmpty = new EmptyDrawer(x,y);
          JLabel emptyIcon = new JLabel(new ImageIcon(gambarEmpty.getImage()));
          mapLayout.setConstraints(emptyIcon,batasan);
          layerPanel.add(emptyIcon,batasan);
          layerPanel.setLayer(emptyIcon,new Integer(1),0);
        }
      }
    }
  }
  public JComponent getContent() {
    return (content);
  }

  public boolean adaPlayer (int x, int y) {
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
  public Unit getXYUnit(int x, int y) {
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
