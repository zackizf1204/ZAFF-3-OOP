package view.map;

import java.awt.*;
import javax.swing.*;

import map.Map;

/**
 * Created by Finiko on 4/15/2017.
 */
public class MapViewer extends JPanel{
  GridBagConstraints batasan;
  JComponent contentPane;
  JLayeredPane layerPanel;
  GridBagLayout mapLayout;
  GridBagLayout objectLayout;
  Map inputMap;

  public MapViewer (Map map) {
    batasan = new GridBagConstraints();
    mapLayout = new GridBagLayout();
    objectLayout = new GridBagLayout();
    layerPanel = new JLayeredPane();
    contentPane = new JPanel(mapLayout);
    contentPane.setOpaque(true);
    layerPanel.setLayout(mapLayout);
    inputMap = map;
  }
  /**
   *
   * @throws Exception
   */
  public void view() throws Exception {
    JFrame frame = new JFrame("Display image");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setContentPane(contentPane);
    frame.setSize(1200,1080);
    viewTile();
    viewMapObject();
    contentPane.add(layerPanel);
    frame.setVisible(true);
  }
  public void viewTile () {
    int x;
    int y;
    for (y = 0; y < inputMap.getSizeY(); y++) {
      for (x = 0; x < inputMap.getSizeX(); x++) {
        batasan.gridx = y;
        batasan.gridy = x;
        TileDrawer gambar = new TileDrawer(inputMap.getTile(x,y));
        JLabel mapIcon = new JLabel(new ImageIcon(gambar.getImage()));
        mapLayout.setConstraints(mapIcon,batasan);
        layerPanel.add(mapIcon);
        layerPanel.setLayer(mapIcon,new Integer(0),0);
        mapIcon.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.GRAY));
      }
    }
  }
  public void viewMapObject () {
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