import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Platno extends JPanel {
	/**
	 Tukaj so stvari potrebne za platno kjer rišemo gibanje planetov.
	 Platno riše planete, katerih položaj dobi iz stanja.
	 */
	private Stanje stanje;
	public int sirina = 500;
	public int visina = 500;
	Graphics g;
	
	public Platno(Stanje stanje){
		super();
		this.stanje = stanje;
		setBackground(Color.black);
		setPreferredSize(new Dimension(sirina, visina));
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public void paintComponent(Graphics g){
		//nariši sonce
		g.setColor(Color.yellow);
		g.fillOval(sirina/2, visina/2, 20, 20);
		repaint();
	}
	
	//rišemo planete
	public void narisiPlanete(Stanje stanje){
		for (Planet planet : stanje.planeti){
			Racunanje.naslednjiKorak(planet, "rk", 0.001);
			g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)*100)-5+250, (int)(planet.vrniPolozaj().vrniElement(2)*100)-5+150, 10, 10);
		}
	}
}

