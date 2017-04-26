package menu;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 * Created by Finiko on 4/24/2017.
 * NIM : 13515029.
 * File : MenuViewer.java
 */
public class MenuViewer extends JPanel {
  /** Layer Panel untuk menu.
   */

  private JLayeredPane menuPanel;
  /** Layer panel untuk background.
   */

  private JLayeredPane backgroundPanel;
  /** Button untuk tombol play.
   */

  private JButton playButton;
  /** Button untuk tombol exit.
   */

  private JButton exitButton;
  /** batasan untuk layout.
   */

  private GridBagConstraints batasan;
  /** layout untuk menu.
   */

  private GridBagLayout menuLayout;
  /** layout untuk background.
   */

  private GridBagLayout backgroundLayout;
  /** layeredPanel untuk content.
   */

  private JLayeredPane content;
  /** comboBox untuk player.
   */

  private JComboBox playerBox;
  /** label untuk background.
   */

  private JLabel background;
  /** input masukkan player dari playerBox.
   */

  private int inputPlayer;
  /** input masukkan map dari mapBox.
   */

  private int map;
  /** combo box untuk pilihan map.
   */

  private JComboBox mapBox;
  /** image untuk background.
   */

  private BufferedImage image;
  /** Constructor tanpa parameter.
   */

  public MenuViewer() {
    batasan = new GridBagConstraints();
    menuLayout = new GridBagLayout();
    backgroundLayout = new GridBagLayout();
    menuPanel = new JLayeredPane();
    backgroundPanel = new JLayeredPane();
    content = new JLayeredPane();
    content.setLayout(backgroundLayout);
    menuPanel.setLayout(menuLayout);
    backgroundPanel.setLayout(backgroundLayout);
    buildBackground();
    buildPilihanMap();
    buildPilihanJumlah();
    buildPlayButton();
    buildExitButton();
    content.setOpaque(true);
    batasan.gridx = 0;
    batasan.gridy = 0;
    content.add(backgroundPanel);
    backgroundLayout.setConstraints(backgroundPanel,batasan);
    content.setLayer(backgroundPanel,new Integer(0),0);
    content.add(menuPanel);
    backgroundLayout.setConstraints(menuPanel,batasan);
    content.setLayer(menuPanel,new Integer(1),0);
  }
  /** Menampilkan pada frame.
   */

  public void menuShow() {
    JFrame frame = new JFrame("ZAFF");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(content);
    frame.pack();
    frame.setVisible(true);
  }
  /** melakukan build pada pilihan jumlah player.
   */

  public void buildPilihanJumlah() {
    JLabel playerLabel;
    playerLabel = new JLabel("PLAYERS : ");
    playerLabel.setFont(new Font("Arial",Font.BOLD,15));
    Integer[] pilihanPlayer;
    pilihanPlayer = new Integer[3];
    pilihanPlayer[0] = 2;
    pilihanPlayer[1] = 3;
    pilihanPlayer[2] = 4;
    playerBox = new JComboBox(pilihanPlayer);
    playerBox.setFont(new Font("Arial",Font.PLAIN,15));
    batasan.gridx = 0;
    batasan.gridy = 0;
    menuLayout.setConstraints(playerLabel,batasan);
    menuPanel.add(playerLabel);
    menuPanel.setLayer(playerLabel,new Integer(1),0);
    batasan.gridx = 1;
    batasan.gridy = 0;
    menuLayout.setConstraints(playerBox,batasan);
    menuPanel.add(playerBox);
    menuPanel.setLayer(playerBox,new Integer(1),0);
  }
  /** melakukan build pada pilihan map.
   */

  public void buildPilihanMap() {
    JLabel mapLabel;
    mapLabel = new JLabel("MAP :");
    mapLabel.setFont(new Font("Arial",Font.BOLD,15));
    Integer[] pilihanMap;
    pilihanMap = new Integer[2];
    pilihanMap[0] = 1;
    pilihanMap[1] = 2;
    mapBox = new JComboBox(pilihanMap);
    mapBox.setFont(new Font("Arial",Font.PLAIN,15));
    batasan.gridx = 0;
    batasan.gridy = 1;
    menuLayout.setConstraints(mapLabel,batasan);
    menuPanel.add(mapLabel);
    menuPanel.setLayer(mapLabel,new Integer(1),0);
    batasan.gridx = 1;
    batasan.gridy = 1;
    menuLayout.setConstraints(mapBox,batasan);
    menuPanel.add(mapBox);
    menuPanel.setLayer(mapBox,new Integer(1),0);
  }
  /** melakukan build pada playButton.
   */

  public void buildPlayButton() {
    playButton = new JButton("PLAY");
    playButton.setFont(new Font("Arial",Font.PLAIN,30));
    playButton.setPreferredSize(new Dimension(120,40));
    batasan.gridx = 0;
    batasan.gridy = 2;
    menuLayout.setConstraints(playButton,batasan);
    menuPanel.add(playButton);
    menuPanel.setLayer(playButton,new Integer(1),0);
  }
  /** melakukan build pada exitButton.
   */

  public void buildExitButton() {
    exitButton = new JButton("EXIT");
    exitButton.setFont(new Font("Arial",Font.PLAIN,30));
    exitButton.setPreferredSize(new Dimension(120,40));
    batasan.gridx = 0;
    batasan.gridy = 3;
    menuLayout.setConstraints(exitButton,batasan);
    menuPanel.add(exitButton);
    menuPanel.setLayer(exitButton,new Integer(1),0);
  }
  /** melakukan build pada background.
   */

  public void buildBackground() {
    try {
      batasan.gridx = 0;
      batasan.gridy = 0;
      image = ImageIO.read(getClass().getResource("../assets/menutitle_2.jpg"));
      background = new JLabel(new ImageIcon(image));
      backgroundLayout.setConstraints(background,batasan);
      backgroundPanel.add(background);
      backgroundPanel.setLayer(background,new Integer(0),0);
    } catch (IOException ie) {
      System.out.println("Error:" + ie.getMessage());
    }
  }
  /** getter untuk inputPlayer.
   */

  public int getInputPlayer() {
    inputPlayer = (int) playerBox.getSelectedItem();
    return (inputPlayer);
  }
  /** getter untuk map.
   */

  public int getMap() {
    map = (int) mapBox.getSelectedItem();
    return (map);
  }
  /** getter untuk playButton.
   */

  public JButton getPlayButton() {
    return (playButton);
  }
  /** getter untuk exitButton.
   */

  public JButton getExitButton() {
    return (exitButton);
  }
}
