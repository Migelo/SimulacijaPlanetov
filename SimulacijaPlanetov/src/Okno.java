import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Okno extends JFrame {

	/**
	 Prikazno okno našega programa z vsemi gumbi, menuji in platnom.
	 */
	private static final long serialVersionUID = 1L;
	private Platno platno;
	private Timer stoparca;
	private Menu menu;

	/**
	 * Create the frame.
	 */
	public Okno(List<Planet> planeti) {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		Container kontejner = this.getContentPane();
		kontejner.setPreferredSize(new Dimension(700, 700));
		
		platno = new Platno(planeti);		
		GridBagConstraints platnoLayout = new GridBagConstraints();
		platnoLayout.gridx = 0;
		platnoLayout.gridy = 0;
		kontejner.add(platno, platnoLayout);
		
		menu = new Menu(this);
		setJMenuBar(menu);
		
	}
		
	public void pozeni() {
		if (stoparca == null) {
			stoparca = new Timer(16, platno);
		}
		stoparca.start();
	}
	
	public void ustavi() {
		if (stoparca != null) {
			stoparca.stop();
		}
	}
}
