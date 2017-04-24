
import object.Player;
import object.Unit;
import object.item.Recovery;
import view.command.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.util.*;
import view.command.*;
import view.map.MapViewer;
import map.Map;
import java.awt.*;
import java.util.TimerTask;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/17/2017.
 * FileName : DriverView.java.
 */
public class DriverView {
  private java.util.Timer timer = new java.util.Timer();
  private JLabel timeLabel = new JLabel(" ", JLabel.CENTER);
  private CommandPanel cp = new CommandPanel();
  private JPanel playerPanel = new JPanel(new FlowLayout());
  private MapViewer mv;

  public MapViewer getMv() {
    return mv;
  }

  private AttackCommandView attack = new AttackCommandView();
  private SkillCommandView skill = new SkillCommandView();
  private WaitCommandView wait = new WaitCommandView();
  private PickCommandView pick = new PickCommandView();
  private UnitView[] unit = new UnitView[4];
  private JPanel newp = new JPanel(new BorderLayout());

  /**
   * Konstruktor DriverView tanpa parameter.
   */
  public DriverView(DriverModel model) {
    JFrame frame = new JFrame("ZAFF");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mv = new MapViewer(model.getMap());
    /*try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }*/
    for (int i = 0; i < model.getCountPlayer(); i++) {
      unit[i] = new UnitView();
    }



    JPanel panelcommand = new JPanel(new GridLayout(2,2));
    panelcommand.add(attack);
    panelcommand.add(skill);
    panelcommand.add(wait);
    panelcommand.add(pick);
    panelcommand.setBackground(Color.blue);

    JPanel endp = new JPanel(new BorderLayout());
    endp.add(panelcommand,BorderLayout.LINE_END);
    endp.setBackground(new Color(0,0,0,100));
    for (int i = 0; i < model.getCountPlayer(); i++) {
      playerPanel.add(unit[i]);
    }
    playerPanel.setOpaque(false);
    endp.add(playerPanel,BorderLayout.LINE_START);


    newp.add(cp,BorderLayout.PAGE_START);
    newp.add(endp,BorderLayout.PAGE_END);
    newp.add(mv,BorderLayout.CENTER);

    frame.add(newp);

    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);

  }

  public void startTime() {
    timer = new java.util.Timer();
    cp.setTimerLabel(60);
    timer.schedule(new UpdateUITask(), 0, 1000);
  }

  public void stopTime() {
    timer.cancel();
  }

  public void updateView(DriverModel model) {
    // setting nama player, ambil dari current player
    cp.setNamaPlayer(model.getCurrentPlayer().getPlayerName());
    // setting nama unit
    for (int i = 0; i < model.getCountPlayer(); i++) {
      unit[i].setAttribute(model.getPlayer(i));
    }
    //mv.setListPlayer(model.getListPlayer());

    try {
      mv.view();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public AttackCommandView getAttack() {
    return attack;
  }

  public SkillCommandView getSkill() {
    return skill;
  }

  public WaitCommandView getWait() {
    return wait;
  }

  public PickCommandView getPick() {
    return pick;
  }
  /**
   * Getter command panel
   * @return Command panel dari suatu laman
   */
  public CommandPanel getCp() {
    return cp;
  }

  public String getTimer(){
    return cp.getTimerLabel();
  }
  private class UpdateUITask extends TimerTask {

    int nSeconds = 60;

    @Override
    public void run() {
      EventQueue.invokeLater(new Runnable() {

        @Override
        public void run() {
          if (nSeconds == 0) {
            timer.cancel();
          }
          //timeLabel.setText(String.valueOf(nSeconds--));
          cp.setTimerLabel((nSeconds--));
        }
      });
    }
  }


  public static void main(String args[]) {
    EventQueue.invokeLater(new Runnable() {

      @Override
      public void run() {
        Map m = new Map(15,20);
        m.setMapObject(0,new Recovery(0,0));
        m.setMapObject(1,new Unit(1,5,5));
        //final DriverView clock = new DriverView(m);
      }
    });
  }
}
