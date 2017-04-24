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

/**
 * Created by Finiko on 4/15/2017.
 */
public class MapViewer extends JPanel {
  GridBagConstraints batasan;
  JComponent contentPane;
  JLayeredPane layerPanel;
  GridBagLayout mapLayout;
  GridBagLayout objectLayout;
  Map inputMap;
  /** constructor.
   * @param map masukkan map
   */

  public MapViewer(Map map) {
    super();
    batasan = new GridBagConstraints();
    mapLayout = new GridBagLayout();
    objectLayout = new GridBagLayout();
    layerPanel = new JLayeredPane();
    contentPane = new JPanel(mapLayout);
    contentPane.setOpaque(true);
    layerPanel.setLayout(mapLayout);
    inputMap = map;
    add(contentPane);
  }
  /** menampilkan ke layar.
   * @throws Exception jika file tidak ditemukan.
   */

  public void view() throws Exception {
    viewTile();
    viewMapObject();
    contentPane.add(layerPanel);
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
        if (inputMap.adaObject(x,y)) {
          MapObjectDrawer gambarObject = new MapObjectDrawer(inputMap.searchObject(x,y));
          JLabel objectIcon = new JLabel(new ImageIcon(gambarObject.getImage()));
          objectLayout.setConstraints(objectIcon,batasan);
          layerPanel.add(objectIcon,batasan);
          layerPanel.setLayer(objectIcon,new Integer(1),0);
        } else {
          EmptyDrawer gambarEmpty = new EmptyDrawer(x,y);
          JLabel emptyIcon = new JLabel(new ImageIcon(gambarEmpty.getImage()));
          objectLayout.setConstraints(emptyIcon,batasan);
          layerPanel.add(emptyIcon,batasan);
          layerPanel.setLayer(emptyIcon,new Integer(1),0);
        }
      }
    }
  }
}