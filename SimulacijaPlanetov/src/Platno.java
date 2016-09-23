import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	public int sirina = 1000;
	public int visina = 1000;
	Color color;
	
	public Platno(List<Planet> planeti){
		super();
		this.planeti = planeti;
		setBackground(Color.black);
		setPreferredSize(new Dimension(sirina, visina));
		setBorder(BorderFactory.createLineBorder(Color.black));		
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.yellow);
		for (Planet planet : planeti){		
			if (planet.getBarva() == "siva"){
				g.setColor(Color.gray);
				g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)*45)-(int)planet.getRadij()/2+sirina/2, (int)(planet.vrniPolozaj().vrniElement(2)*45)-(int)planet.getRadij()/2+visina/2, (int)planet.getRadij(), (int)planet.getRadij());
			}
			else {
				g.setColor(Color.yellow);
				g.fillOval((int)(planet.vrniPolozaj().vrniElement(1)*45)-(int)planet.getRadij()/2+sirina/2, (int)(planet.vrniPolozaj().vrniElement(2)*45)-(int)planet.getRadij()/2+visina/2, (int)planet.getRadij(), (int)planet.getRadij());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// edini dogodek, ki je lahko, je preracunavanje
		// Pretvarjamo se, da je dejanski dt = 0.001, kar ni res
		for (Planet planet : planeti){
			Racunanje.naslednjiKorak(planeti, planet, "rk", 0.01); 
		}
		repaint();
	}
	
	
}

