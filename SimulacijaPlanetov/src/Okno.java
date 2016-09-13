import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class Okno extends JFrame {

	/**
	 Prikazno okno našega programa z vsemi gumbi, menuji in platnom.
	 */
	private static final long serialVersionUID = 1L;
	private Platno platno;
	private Stanje stanje;
	private Vlakno vlakno;
	private Okno okno;
	private Gumbi gumbi;
	private GridBagConstraints gumbiLayout = new GridBagConstraints();
	private Container kontejner;
	private GridBagConstraints platnoLayout = new GridBagConstraints();

	/**
	 * Create the frame.
	 */
	public Okno(Stanje stanje) {
		super();
		setLayout(new GridBagLayout());
		kontejner = this.getContentPane();
		pripraviKontejner();
		this.stanje = stanje;
		vlakno = new Vlakno(stanje, platno);
	}
		
	public void pripraviKontejner(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kontejner.setPreferredSize(new Dimension(700, 700));
		platno = new Platno(stanje);
		platnoLayout.gridx = 0;
		platnoLayout.gridy = 0;
		kontejner.add(platno, platnoLayout);
		kontejner = this.getContentPane();
		
		gumbi = new Gumbi(this);
		gumbiLayout.gridx = 0;
		gumbiLayout.gridy = 1;
		kontejner.add(gumbi, gumbiLayout);
	}

	public Container getKontejner() {
		return kontejner;
	}

	public void setKontejner(Container kontejner) {
		this.kontejner = kontejner;
	}

	public void pozeni() {
		try {
			vlakno.narediVlakno();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
