import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Gumbi extends JPanel implements ActionListener {
	
	private Okno okno;
	public JButton gumbStart = new JButton("Start!");
	private JLabel besedilo = new JLabel("Simulacija planetov se začne s pritiskom na gumb Start.");
	private GridBagConstraints gumb1Layout = new GridBagConstraints();
	private GridBagConstraints besediloLayout = new GridBagConstraints();

	public Gumbi(Okno okno) {
		super();
		this.okno = okno;
		setLayout(new GridBagLayout());
		setBackground(Color.white);
		pripraviBesedilo();
		pripraviGumb1(gumbStart);
		
		gumbStart.addActionListener(this);
	}

	public void pripraviBesedilo () {
		besediloLayout.ipady = 10;
		besediloLayout.gridx = 0;
		besediloLayout.gridy = 0;
		besediloLayout.gridwidth = 2;
		add(besedilo, besediloLayout);	
	}
	
	public void pripraviGumb1 (JButton gumb1) {
		remove(gumb1);
		gumb1Layout.ipadx = 40;
		gumb1Layout.weightx = 0.5;
		gumb1Layout.gridx = 0;
		gumb1Layout.gridy = 2;
		add(gumb1, gumb1Layout);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == gumbStart) {
			okno.pozeni();
		}
	}
}
