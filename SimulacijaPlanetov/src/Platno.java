import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

//import gui.Platno;

public class Platno extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	/**
	 Tukaj so stvari potrebne za platno kjer rišemo gibanje planetov.
	 Platno riše planete, katerih položaj dobi iz stanja.
	 */
//	private Okno okno;
	public List<Planet> planeti;
	public int sirina = 500;
	public int visina = 500;
	
	public Platno(List<Planet> planeti){
		super();
		this.planeti = planeti;
		setBackground(Color.black);
		setPreferredSize(new Dimension(sirina, visina));
		setBorder(BorderFactory.createLineBorder(Color.black));		
	}
	
	public void paintComponent(Graphics g){
		//nariši sonce
		g.setColor(Color.yellow);
//		g.fillOval(sirina/2, visina/2, 20, 20);
		for (Planet planet : planeti){
//			Racunanje.naslednjiKorak(planet, "rk", 0.001);
//			g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)/Math.pow(10, 10))-5+sirina/2, (int)(planet.vrniPolozaj().vrniElement(2)/Math.pow(10, 10))-5+visina/2, 10, 10);
			g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)*50)-5+sirina/2, (int)(planet.vrniPolozaj().vrniElement(2)*50)-5+visina/2, 10, 10);
			System.out.println("x: " + (planet.vrniPolozaj().vrniElement(1)));
			System.out.println("y: " + (planet.vrniPolozaj().vrniElement(2)));

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// edini dogodek, ki je lahko, je preračunavanje
		// Pretvarjamo se, da je dejanski dt = 0.001, kar ni res
		for (Planet planet : planeti){
			Racunanje.naslednjiKorak(planeti, planet, "rk", 0.01); 
		}
		repaint();
	}
	
	
}

