import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;


//import gui.Platno;

public class Okno extends JFrame {

	/**
	 Prikazno okno našega programa z vsemi gumbi, menuji in platnom.
	 */
	private static final long serialVersionUID = 1L;
	private Platno platno;
	private Stanje stanje;
	private Container kontejner;
	private GridBagConstraints platnoLayout = new GridBagConstraints();

	/**
	 * Create the frame.
	 */
	public Okno() {
		super();
		setLayout(new GridBagLayout());
		kontejner = this.getContentPane();
		pripraviKontejner();
	}
		
	public void pripraviKontejner(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kontejner.setPreferredSize(new Dimension(700, 700));
		platno = new Platno(stanje);
		platnoLayout.gridx = 0;
		platnoLayout.gridy = 0;
		kontejner.add(platno, platnoLayout);
		kontejner = this.getContentPane();


		
	}


}
