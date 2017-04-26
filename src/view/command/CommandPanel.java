package view.command;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.Duration;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/15/2017.
 * FileName : CommandPanel.java.
 */
public class CommandPanel extends JPanel {
  protected void setAndAdd(Component ctr,
                            GridBagLayout gridbag,
                            GridBagConstraints gbc) {
    gridbag.setConstraints(ctr,gbc);
    add(ctr);
  }

  private JLabel pemasa = new JLabel("15");
  private GridBagLayout gridbag = new GridBagLayout();
  private GridBagConstraints gbc = new GridBagConstraints();
  private JLabel namaPlayer;

  /**
   * Konstruktor tanpa parameter.
   * Menginisialisasi panel atas dari game
   */
  public CommandPanel() {

    setFont(new Font("SansSerif", Font.PLAIN, 20));
    setLayout(gridbag);

    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1.0;
    namaPlayer = new JLabel("Nama Player");
    setAndAdd(namaPlayer, gridbag, gbc);
    gbc.gridwidth = GridBagConstraints.REMAINDER; //end row
    JPanel exitpanel = new JPanel(new BorderLayout());
    exitpanel.add(new ExitCommandView(), BorderLayout.LINE_END);
    JPanel pausepanel = new JPanel(new BorderLayout());
    exitpanel.add(pausepanel, BorderLayout.CENTER);
    setAndAdd(exitpanel, gridbag, gbc);
    setAndAdd(pemasa, gridbag, gbc);
  }

  /**
   * Setter nama current player dari game untuk ditampilkan di atas.
   * @param str string yang akan diinputkan ke label
   */
  public void setNamaPlayer(String str) {
    namaPlayer.setText(str);
  }

  /**
   * Setter timer label untuk menentukan sekarang waktu berapa.
   * @param i detik sekarang
   */
  public void setTimerLabel(int i) {
    pemasa.setText(i + "");

  }

  /**
   * Getter timer label.
   * @return mengambil timer label dari command panel
   */
  public String getTimerLabel() {
    return pemasa.getText();
  }
}

