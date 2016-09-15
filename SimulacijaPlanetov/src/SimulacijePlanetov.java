import java.util.ArrayList;

public class SimulacijePlanetov {

	public static void main(String[] args) {
		double G = 6.67*Math.pow(10, -11);
		Tocka prazna = new Tocka(0,0,0);
		
		double sonceMasa = 2*Math.pow(10, 30);
//		double sonceMasa = 1;
		double marsMasa = 6*Math.pow(10, 23);
		Tocka marsPolozaj = new Tocka(-2*Math.pow(10, 11), 0, 0);
//		Tocka marsPolozaj = new Tocka(-1.3, 0, 0);
		Tocka marsHitrost = new Tocka(0, -Math.sqrt(Math.abs(G*sonceMasa/marsPolozaj.vrniElement(1))),0);
//		System.out.println("Začetna hitrost: " + G*sonceMasa/marsPolozaj.vrniElement(1));
//		Tocka marsHitrost = new Tocka(0, -.8,0);
		Planet mars = new Planet(marsPolozaj, marsHitrost, prazna, marsMasa, "mars");
		
		double zemljaMasa = 6*Math.pow(10, 24);
//		Tocka zemljaPolozaj = new Tocka(1.5*Math.pow(10, 11), 0, 0);
		Tocka zemljaPolozaj = new Tocka(1, 0, 0);
//		Tocka zemljaHitrost = new Tocka(0, Math.sqrt(Math.abs(G*sonceMasa/zemljaPolozaj.vrniElement(1))), 0);
		Tocka zemljaHitrost = new Tocka(0, 1, 0);
		Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna, zemljaMasa/sonceMasa, "zemlja");

		Tocka soncePolozaj = new Tocka(0, 0, 0);
		Tocka sonceHitrost = new Tocka(0, 0, 0);
		Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce");

		ArrayList<Planet> planeti = new ArrayList<Planet>();
//		planeti.add(mars);
		planeti.add(zemlja);
		planeti.add(sonce);
		Okno okno = new Okno(planeti);
		okno.pack();
		okno.setVisible(true);
	}
}