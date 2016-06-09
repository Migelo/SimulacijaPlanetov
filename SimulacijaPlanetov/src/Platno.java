import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Platno extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Stanje stanje;

	public Platno(Stanje stanje){
		super();
		this.stanje = stanje;
		
	}

	public Dimension getPreferredSize(){
		return new Dimension(500,500);
	}
	
	public void paintComponent(Graphics g){
		stanje.narisi(g);
		//g.fillOval(100, 100, 100, 100);
	}
	
}

