package view.command;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : SkillCommandView.java.
 */
public class SkillCommandView extends CommandView {
  public SkillCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/skillbutton.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }
    setToolTipText("BIJI NAGA JAKI");

  }

  @Override
  public int getButtonType() {
    return 5;
  }
}
