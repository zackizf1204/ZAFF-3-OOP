package controlmenu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import map.Map;
import menu.MenuViewer;
import object.item.Recovery;
import view.command.AttackCommandView;



/**
 * Created by Zacki Zulfikar Fauzi on 24-Apr-17.
 * NIM  : 13515147
 * File : MenuControl.java
 */
public class MenuControl {
  public MenuViewer menu;
  private int jumlahPlayer;
  private boolean input;
  private int map;

  /**
   * Konstruktor menu control.
   */
  public MenuControl() {
    menu = new MenuViewer();
    setInput(false);
    menu.getPlayButton().addMouseListener(new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent e) {
            setJumlahPlayer(menu.getInputPlayer());
            setInput(true);
            setMap(menu.getMap());
            //attackPlayer(Player1, Player2)
          }

          @Override
          public void mousePressed(MouseEvent e) {

          }

          @Override
          public void mouseReleased(MouseEvent e) {
          }

          @Override
          public void mouseEntered(MouseEvent e) {
          }

          @Override
          public void mouseExited(MouseEvent e) {
          }
        });
    menu.getExitButton().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.exit(0);
        //attackPlayer(Player1, Player2)
      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
      }

      @Override
      public void mouseExited(MouseEvent e) {
      }
    });

  }

  /**
   * Getter jumlah player
   * @return jumlahPlayer.
   */
  public int getJumlahPlayer() {
    return jumlahPlayer;
  }

  /**
   * Setter jumlah player.
   * @param jumlahPlayer jumlah player
   */

  public void setJumlahPlayer(int jumlahPlayer) {
    this.jumlahPlayer = jumlahPlayer;
  }

  /**
   * Method menampilkan menu dari control.
   */

  public void controlMenu() {
    menu.menuShow();
  }

  /**
   * getter input.
   * @return input
   */

  public boolean isInput() {
    return input;
  }

  /**
   * Setter input.
   * @param input input yang akan dimasukkan.
   */
  public void setInput(boolean input) {
    this.input = input;
  }

  /**
   * Getter pilihan map.
   * @return pilihan map.
   */

  public int getMap() {
    return map;
  }

  /**
   * Setter pilihan map.
   * @param map pilihan map.
   */

  public void setMap(int map) {
    this.map = map;
  }
}
