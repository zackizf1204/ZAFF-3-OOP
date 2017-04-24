package menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Finiko on 4/24/2017.
 */
public class MenuViewer extends JFrame{
  private JLayeredPane menuPanel;
  public JButton playButton;
  public JButton exitButton;
  private GridBagConstraints batasan;
  private GridBagLayout menuLayout;
  private JComponent content;
  private Integer[] pilihanJumlah;
  private JLabel pilihanLabel;
  private JComboBox pilihanBox;
  private int inputPlayer;

  public MenuViewer() {
    super();
    batasan = new GridBagConstraints();
    menuLayout = new GridBagLayout();
    menuPanel = new JLayeredPane();
    content = new JPanel(menuLayout);
    menuPanel.setLayout(menuLayout);
    buildPilihanJumlah();
    buildPlayButton();
    buildExitButton();
    content.setOpaque(true);
    content.add(menuPanel);
    add(content);
  }
  public void menuShow() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(content);
    //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    setUndecorated(true);
    setSize(1000,100);
    setVisible(true);
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
  public int getInputPlayer() {
    inputPlayer = (int) pilihanBox.getSelectedItem();
    return (inputPlayer);
  }
}
