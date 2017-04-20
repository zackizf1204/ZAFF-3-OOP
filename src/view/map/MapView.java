package view.map;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import map.Map;

/**
 * Created by Finiko on 4/15/2017.
 */
public class MapView extends JPanel {
  /**
   *
   * @param inputMap
   * @throws Exception
   */
  public void view(Map inputMap) throws Exception {
    int x;
    int y;

    JFrame frame = new JFrame("Display image");
    GridBagLayout mapLayout = new GridBagLayout();
    GridBagLayout objectLayout = new GridBagLayout();
    GridBagConstraints batasan = new GridBagConstraints();

    JPanel mapPanel = new JPanel(mapLayout);
    JPanel objectPanel = new JPanel(objectLayout);
    objectPanel.setOpaque(true);

    frame.getContentPane().add(mapPanel);
    frame.getContentPane().add(objectPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1200,1080);

    for (y = 0; y < inputMap.getSizeY(); y++) {
      for (x = 0; x < inputMap.getSizeX(); x++) {

        batasan.gridx = y;
        batasan.gridy = x;
        DrawTile gambar = new DrawTile(inputMap.getTile(x,y));
        if (inputMap.adaObject(x,y)) {
          DrawMapObject gambarObject = new DrawMapObject(inputMap.searchObject(x,y));
          JLabel objectIcon = new JLabel(new ImageIcon(gambarObject.getImage()));
          objectLayout.setConstraints(objectIcon,batasan);
          objectPanel.add(objectIcon);
        } else {
          DrawEmpty gambarEmpty = new DrawEmpty(x,y);
          JLabel emptyIcon = new JLabel(new ImageIcon(gambarEmpty.getImage()));
          objectLayout.setConstraints(emptyIcon,batasan);
          objectPanel.add(emptyIcon);
        }
        JLabel mapIcon = new JLabel(new ImageIcon(gambar.getImage()));
        mapLayout.setConstraints(mapIcon,batasan);
        mapPanel.add(mapIcon);
        mapIcon.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.GRAY));
      }
    }
    frame.setVisible(true);
  }
}