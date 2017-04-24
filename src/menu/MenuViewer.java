package menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/24/2017.
 */
public class MenuViewer extends JPanel{
  private JLayeredPane menuPanel;
  private JLayeredPane backgroundPanel;
  private JButton playButton;
  private JButton exitButton;
  private GridBagConstraints batasan;
  private GridBagLayout menuLayout;
  private GridBagLayout backgroundLayout;
  private JLayeredPane content;
  private Integer[] pilihanJumlah;
  private JLabel pilihanLabel;
  private JComboBox pilihanBox;
  private JLabel background;
  private int inputPlayer;
  private BufferedImage image;

  public MenuViewer () {
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
  public void menuShow() {
    JFrame frame = new JFrame("ZAFF");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(content);
    //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //frame.setUndecorated(true);
    frame.pack();
    frame.setVisible(true);
  }
  public void buildPilihanJumlah() {
    Integer[] pilihanJumlah;
    pilihanJumlah = new Integer[3];
    pilihanJumlah[0] = 2;
    pilihanJumlah[1] = 3;
    pilihanJumlah[2] = 4;
    pilihanLabel = new JLabel("Jumlah Player : ");
    pilihanBox = new JComboBox(pilihanJumlah);
    batasan.gridx = 1;
    batasan.gridy = 0;
    menuLayout.setConstraints(pilihanLabel,batasan);
    menuPanel.add(pilihanLabel);
    menuPanel.setLayer(pilihanLabel,new Integer(1),0);
    batasan.gridx = 1;
    batasan.gridy = 1;
    menuLayout.setConstraints(pilihanBox,batasan);
    menuPanel.add(pilihanBox);
    menuPanel.setLayer(pilihanBox,new Integer(1),0);
  }
  public void buildPlayButton() {
    playButton = new JButton("play");
    batasan.gridx = 0;
    batasan.gridy = 0;
    menuLayout.setConstraints(playButton,batasan);
    menuPanel.add(playButton);
    menuPanel.setLayer(playButton,new Integer(1),0);
  }
  public void buildExitButton() {
    exitButton = new JButton("exit");
    batasan.gridx = 0;
    batasan.gridy = 1;
    menuLayout.setConstraints(exitButton,batasan);
    menuPanel.add(exitButton);
    menuPanel.setLayer(exitButton,new Integer(1),0);
  }
  public void buildBackground() {
    try {
      batasan.gridx = 0;
      batasan.gridy = 0;
      image = ImageIO.read(getClass().getResource("../assets/main_menu.jpg"));
      background = new JLabel(new ImageIcon(image));
      backgroundLayout.setConstraints(background,batasan);
      backgroundPanel.add(background);
      backgroundPanel.setLayer(background,new Integer(0),0);
    } catch (IOException ie){
      System.out.println("Error:" + ie.getMessage());
    }
  }
  public int getInputPlayer() {
    inputPlayer = (int) pilihanBox.getSelectedItem();
    return (inputPlayer);
  }
  public JButton getPlayButton() {
    return(playButton);
  }
  public JButton getExitButton() {
    return(exitButton);
  }
}
