package view.command;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : WaitCommandView.java.
 */
public class WaitCommandView extends CommandView {
  public WaitCommandView() {
    super();
    try {
      Image img = ImageIO.read(getClass().getResource("../../assets/waitbutton.png"));
      setIcon(new ImageIcon(img));
    } catch (Exception e) {
      System.out.println(e);
    }


  }

  @Override
  public int getButtonType() {
    return 6;
  }
}
