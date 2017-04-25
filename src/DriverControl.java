import controlmenu.MenuControl;
import map.Map;
import object.Unit;
import object.item.Recovery;
import timer.Clock;
import view.command.AttackCommandView;
import view.command.PickCommandView;
import view.command.SkillCommandView;
import view.command.WaitCommandView;
import view.map.MapViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverControl.java.
 */
public class DriverControl {
  private DriverView view;
  private DriverModel model;
  private static int counter = 60;
  private java.util.Timer timer = new java.util.Timer();
  private MouseListener skillListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
      view.getSkill().setFocusable(true);
      view.getSkill().requestFocusInWindow();
      Object stringArray[] = { "Kiri", "Kanan","Atas","Bawah", "Aing" };
      Icon blueIcon = new ImageIcon("assets/item/item.png");
      int i =       JOptionPane.showOptionDialog(view.getMv(), "Pilih arah serangan", "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
          stringArray[0]);
      Object string2[] = {"Skill 1", "Skill 2", "Skill 3"};
      int j =       JOptionPane.showOptionDialog(view.getMv(), "Pilih nomor skill", "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, string2,
          string2[0]);
      model.skill(i,j+1);
      view.updateView(model);
      interrupted = true;
      MapViewer mv = view.getMv();
      mv.setFocusable(true);
      mv.requestFocusInWindow();


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/skillbuttononhover.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/skillbutton.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }
  };
  private MouseListener attackListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {

      view.getAttack().setFocusable(true);
      view.getAttack().requestFocusInWindow();
      Object stringArray[] = { "Kiri", "Kanan","Atas","Bawah" };
      Icon blueIcon = new ImageIcon("assets/item/item.png");
      int i =       JOptionPane.showOptionDialog(view.getMv(), "Pilih arah serangan", "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
          stringArray[0]);
      model.attack(i);
      view.updateView(model);
      interrupted = true;
      MapViewer mv = view.getMv();
      mv.setFocusable(true);
      mv.requestFocusInWindow();
      /*view.getAttack().addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
          System.out.println("EXEC");
          if (e.getKeyCode() == KeyEvent.VK_W) {
            model.attack(2);
          } else if (e.getKeyCode() == KeyEvent.VK_A) {
            model.attack(0);
          } else if (e.getKeyCode() == KeyEvent.VK_S) {
            model.attack(3);
          } else if (e.getKeyCode() == KeyEvent.VK_D) {
            model.attack(1);
          }
          view.updateView(model);
          interrupted = true;
          MapViewer mv = view.getMv();
          mv.setFocusable(true);
          mv.requestFocusInWindow();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
      });
*/
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      view.getAttack().setBackground(new Color(0, 0, 0, 0));
    }


    @Override
    public void mouseEntered(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/attackbuttononhover.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/attackbutton.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }

    ;
  };
  private MouseListener pickListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
      model.pick();
      interrupted = true;
      view.updateView(model);
      MapViewer mv = view.getMv();
      mv.setFocusable(true);
      mv.requestFocusInWindow();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
      if (view.getPick().isEnabled()) {
        JButton c = (JButton) e.getComponent();
        try {
          Image img = ImageIO.read(getClass().getResource("assets/pickbuttononhover.png"));
          c.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
          System.out.println(ex);
        }
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/pickbutton.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }
  };
  private MouseListener waitListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
      model.recov();
      interrupted = true;
      view.updateView(model);
      MapViewer mv = view.getMv();
      mv.setFocusable(true);
      mv.requestFocusInWindow();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
      if (view.getWait().isEnabled()) {
        JButton c = (JButton) e.getComponent();
        try {
          Image img = ImageIO.read(getClass().getResource("assets/waitbuttononhover.png"));
          c.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
          System.out.println(ex);
        }
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      JButton c = (JButton) e.getComponent();
      try {
        Image img = ImageIO.read(getClass().getResource("assets/waitbutton.png"));
        c.setIcon(new ImageIcon(img));
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }
  };
  private boolean interrupted = false;

  public DriverControl(int a) {
    model = new DriverModel(a);
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        view = new DriverView(model);
      }
    });
  }

  public void runGame() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        view.getMv().setListPlayer(model.getListPlayer());
        view.getMv().setCountPlayer(model.getCountPlayer());
        for (int i = 0; i < model.getCountPlayer(); i++) {
          model.getMap().setMapObject(model.getMap().getCountObject(),model.getPlayer(i).getUnit(0));
        }

        view.updateView(model);
          // remove semua actionlistener
          view.getAttack().removeMouseListener(attackListener);
          view.getPick().removeMouseListener(pickListener);
          view.getWait().removeMouseListener(waitListener);
          view.getSkill().removeMouseListener(skillListener);
          AttackCommandView attack = view.getAttack();
          attack.addMouseListener(attackListener);
          playAgain();
          PickCommandView pick = view.getPick();
          pick.addMouseListener(pickListener);
          WaitCommandView wait = view.getWait();
          wait.addMouseListener(waitListener);
          SkillCommandView skill = view.getSkill();
          skill.addMouseListener(skillListener);
          //run si jaki
          TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

              if (interrupted) {
                interrupted = false;
                counter = 60;
              }
              if(counter<0) {
                counter = 60;
                model.changePlayer();
                MapViewer mv = view.getMv();
                mv.setFocusable(true);
                mv.requestFocusInWindow();
              } else {
                counter--;
              }
              view.getCp().setTimerLabel(counter);
            }
          };
        Timer timer = new Timer("MyTimer");
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        //this line starts the timer at the same time its executed.
      }
    });
  }

  public void playAgain() {
    MapViewer mv = view.getMv();
    mv.setFocusable(true);
    mv.requestFocusInWindow();
    mv.addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {

      }

      @Override
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
          model.move(2);
          view.updateView(model);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
          model.move(0);
          view.updateView(model);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
          model.move(3);
          view.updateView(model);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
          model.move(1);
          view.updateView(model);
        }
      }

      @Override
      public void keyReleased(KeyEvent e) {

      }
    });
  }

  public static void main(String[] args) throws InterruptedException {
    MenuControl mv = new MenuControl();
    mv.controlMenu();
    while(mv.isInput()==false) {
      sleep(10);
    }
    DriverControl ctrl = new DriverControl(mv.getJumlahPlayer());
    ctrl.runGame();
  }
}
