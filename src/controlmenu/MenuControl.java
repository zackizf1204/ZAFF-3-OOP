package controlmenu;
import map.Map;
import menu.MenuViewer;
import object.item.Recovery;
import view.command.AttackCommandView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Zacki Zulfikar Fauzi on 24-Apr-17.
 * NIM  : 13515147
 * File : MenuControl.java
 */
public class MenuControl {
  public MenuViewer menu;
  private int jumlahPlayer;
  private boolean input;

  public MenuControl(){
        menu = new MenuViewer();
    setInput(false);
        menu.getPlayButton().addMouseListener(new MouseListener() {
          @Override
          public void mouseClicked(MouseEvent e) {
            setJumlahPlayer(menu.getInputPlayer());
            setInput(true);
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

  public int getJumlahPlayer() {
    return jumlahPlayer;
  }

  public void setJumlahPlayer(int jumlahPlayer) {
    this.jumlahPlayer = jumlahPlayer;
  }
  public void controlMenu(){
    menu.menuShow();
  }

  public boolean isInput() {
    return input;
  }

  public void setInput(boolean input) {
    this.input = input;
  }
}
