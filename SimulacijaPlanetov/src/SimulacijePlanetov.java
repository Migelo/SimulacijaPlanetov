import java.util.ArrayList;

import javax.swing.JFrame;

public class SimulacijePlanetov {

	public static void main(String[] args) {
		
		Tocka prazna = new Tocka(0,0,0);
		
		Tocka marsPolozaj = new Tocka(1, 0, 0);
		Tocka marsHitrost = new Tocka(0, 1.1,0);
		Planet mars = new Planet(marsPolozaj, marsHitrost, prazna);
		
		Tocka zemljaPolozaj = new Tocka(.75, 0, 0);
		Tocka zemljaHitrost = new Tocka(0, 1.3, 0);
		Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna);

		ArrayList<Planet> planeti = new ArrayList<Planet>();
		planeti.add(mars);
		planeti.add(zemlja);
		JFrame okno = new Okno(planeti);
		okno.pack();
		okno.setVisible(true);
//		Okno frame = new Okno();
//		frame.setVisible(true);		
	}
}
