import java.util.ArrayList;

public class SimulacijePlanetov {

	public static void main(String[] args) {
		//nastavi začetne položaje in hitrosti
		//Planet a = new Planet(Tocka(1,2,3), null, null);
		//a.polozaj(1,1,1);
		Tocka a = new Tocka(1, 0, 0);
		Tocka prazna = new Tocka(0,0,0);
		Tocka c = new Tocka(0, Math.sqrt(1/Racunanje.radij(a)),0);
		Planet b = new Planet(a, c, prazna);
		//Racunanje.sila(b.vrniPolozaj());
		//System.out.println(Racunanje.sila(b.vrniPolozaj()));
//		for (int i = 0; i < 1000; i++){
//			Racunanje.sila2(b);
//		}
		ArrayList<Planet> planeti = new ArrayList<Planet>();
		planeti.add(b);
		Stanje stanje = new Stanje(planeti);
		Okno frame = new Okno(stanje);
		frame.setVisible(true);
		System.out.println(a);
		
	}
}
