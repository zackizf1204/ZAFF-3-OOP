import static java.lang.Thread.sleep;

import controlmenu.MenuControl;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import map.Map;
import object.Unit;
import object.item.Recovery;
import view.command.AttackCommandView;
import view.command.PickCommandView;
import view.command.SkillCommandView;
import view.command.WaitCommandView;
import view.map.MapViewer;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverControl.java.
 */
public class DriverControl {
  private DriverView view;
  private DriverModel model;
  private boolean interrupted = false;
  private static int counter = 60;
  private java.util.Timer timer = new java.util.Timer();
  private MouseListener skillListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
      view.getSkill().setFocusable(true);
      view.getSkill().requestFocusInWindow();
      Object[] stringArray = { "Kiri", "Kanan","Atas","Bawah", "Self" };
      Icon blueIcon = new ImageIcon("assets/item/item.png");
      int i = JOptionPane.showOptionDialog(view.getMv(), "Pilih arah serangan", "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
          stringArray[0]);
      Object[] string2 = {"Skill 1", "Skill 2", "Skill 3"};
      String str = new String("Skill 1 : "
          + model.getCurrentPlayer().getUnit(0).getSkillDescription(1)
          + "\nSkill 2 : " + model.getCurrentPlayer().getUnit(0).getSkillDescription(2)
          + "\nSkill 3 : " + model.getCurrentPlayer().getUnit(0).getSkillDescription(3));

      int j = JOptionPane.showOptionDialog(view.getMv(), str, "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, string2,
          string2[0]);
      model.skill(i,j + 1);
      if (model.isGameEnd()) {
        Object[] stringArray2 = {"EXIT"};
        int x = JOptionPane.showOptionDialog(view.getMv(),
            "Game telah usai. Tekan tombol EXIT untuk keluar", "Select an Option",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray2,
            stringArray2[0]);
        System.exit(0);
      }
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

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  };
  private MouseListener attackListener = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
      view.getAttack().setFocusable(true);
      view.getAttack().requestFocusInWindow();
      Object[] stringArray = { "Kiri", "Kanan","Atas","Bawah" };
      Icon blueIcon = new ImageIcon("assets/item/item.png");
      int i = JOptionPane.showOptionDialog(view.getMv(), "Pilih arah serangan", "Select an Option",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
          stringArray[0]);
      model.attack(i);
      if (model.isGameEnd()) {
        Object[] stringArray2 = {"EXIT"};
        int x = JOptionPane.showOptionDialog(view.getMv(),
            "Game telah usai. Tekan tombol EXIT untuk keluar", "Select an Option",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray2,
            stringArray2[0]);
        System.exit(0);
      }
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
      view.getAttack().setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
  };


  /**
   * Konstruktor drivercontrol dengan parameter.
   * @param a jumlah player yang ingin dibuat
   * @param nomorMap nomor map keberapa yang ingin dimainkan
   */
  public DriverControl(int a, int nomorMap) {
    model = new DriverModel(a, nomorMap);
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        view = new DriverView(model);
      }
    });
  }

  /**
   * Menjalankan game.
   */
  public void runGame() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        view.getMv().setListPlayer(model.getListPlayer());
        view.getMv().setCountPlayer(model.getCountPlayer());
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
            if (counter < 0) {
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
      }
    });
  }

  /**
   * Melanjutkan permainan dengan mengeset ulang keylistener.
   */
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

  /**
   * Main Program.
   * @param args kosong
   * @throws InterruptedException jika diinterupsi maka akan dikeluarkan exception
   */
  public static void main(String[] args) throws InterruptedException {
    MenuControl mv = new MenuControl();
    mv.controlMenu();
    while (mv.isInput() == false) {
      sleep(10);
    }
    DriverControl ctrl = new DriverControl(mv.getJumlahPlayer(),mv.getMap());
    ctrl.runGame();
  }
}
