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
		g.fillOval(sirina/2, visina/2, 20, 20);
		for (Planet planet : planeti){
//			Racunanje.naslednjiKorak(planet, "rk", 0.001);
			g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)*100)-5+250, (int)(planet.vrniPolozaj().vrniElement(2)*100)-5+150, 10, 10);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// edini dogodek, ki je lahko, je preračunavanje
		// Pretvarjamo se, da je dejanski dt = 0.001, kar ni res
		for (Planet planet : planeti){
			Racunanje.naslednjiKorak(planet, "rk", 0.01); 
		}
		repaint();
	}
	
	
}

