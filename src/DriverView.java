
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import map.Map;
import object.Player;
import object.Unit;
import object.item.Recovery;
import view.command.AttackCommandView;
import view.command.CommandPanel;
import view.command.PickCommandView;
import view.command.SkillCommandView;
import view.command.UnitView;
import view.command.WaitCommandView;
import view.map.MapViewer;


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
  private AttackCommandView attack = new AttackCommandView();
  private SkillCommandView skill = new SkillCommandView();
  private WaitCommandView wait = new WaitCommandView();
  private PickCommandView pick = new PickCommandView();
  private UnitView[] unit = new UnitView[4];
  private JPanel newp = new JPanel(new BorderLayout());

  /** Konstruktor DriverView tanpa parameter.
   * @param model masukkan model.
   */
  public DriverView(DriverModel model) {
    JFrame frame = new JFrame("ZAFF");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mv = new MapViewer(model.getMap());
    for (int i = 0; i < model.getCountPlayer(); i++) {
      unit[i] = new UnitView(i);
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
    endp.setBackground(Color.blue);
    newp.add(cp,BorderLayout.PAGE_START);
    newp.add(endp,BorderLayout.PAGE_END);
    newp.add(mv,BorderLayout.CENTER);
    frame.add(newp);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setVisible(true);
  }

  /**
   * Melakukan perubahan pada view.
   * @param model model yang dijadikan acuan
   */
  public void updateView(DriverModel model) {
    // setting nama player, ambil dari current player
    cp.setNamaPlayer(model.getCurrentPlayer().getPlayerName());
    // setting nama unit
    for (int i = 0; i < model.getCountPlayer(); i++) {
      unit[i].setAttribute(model.getPlayer(i));
    }
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

  public MapViewer getMv() {
    return mv;
  }

  /**
   * Getter command panel.
   * @return Command panel dari suatu laman
   */

  public CommandPanel getCp() {
    return cp;
  }

  public String getTimer() {
    return cp.getTimerLabel();
  }
}
