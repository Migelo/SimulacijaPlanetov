import java.util.ArrayList;

public class SimulacijePlanetov {

	public static void main(String[] args) {
		
		Tocka a = new Tocka(1, 0, 0);
		Tocka prazna = new Tocka(0,0,0);
		//Tocka c = new Tocka(0, Math.sqrt(1/Racunanje.radij(a)),0);
		Tocka c = new Tocka(0, 1.1,0);
		Planet mars = new Planet(a, c, prazna);
		
		Tocka aa = new Tocka(.75, 0, 0);
		Tocka cc = new Tocka(0, 1.3, 0);
		Planet zemlja = new Planet(aa, cc, prazna);

		ArrayList<Planet> planeti = new ArrayList<Planet>();
		planeti.add(mars);
		planeti.add(zemlja);
		Stanje stanje = new Stanje(planeti);
		Okno frame = new Okno(stanje);
		frame.setVisible(true);
		System.out.println(a);
		
	}
}
