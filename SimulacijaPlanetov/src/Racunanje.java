

public class Racunanje {
	@SuppressWarnings("unused")

	public static double[] sila(java.util.List<Planet> planeti, Tocka polozaj, String ime) {
		double sila, silaX, silaY, silaZ = 0;
		double G = 6.67*Math.pow(10, -11);
		sila = 0;
		silaX = 0;
		silaY = 0;
		silaZ = 0;
		double[] silaTocka = new double[3];
		for (Planet planet : planeti){
			sila = 0;
			if (planet.getIme() == ime){

			}
			else{
				double radij = Math.sqrt(Math.pow((polozaj.vrniElement(1)-planet.vrniPolozaj().vrniElement(1)), 2) + Math.pow((polozaj.vrniElement(2)-planet.vrniPolozaj().vrniElement(2)), 2));		
				sila = -planet.vrniMaso()/Math.pow(radij,3);
				silaX += sila * (polozaj.vrniElement(1) - planet.vrniPolozaj().vrniElement(1));
				silaY += sila * (polozaj.vrniElement(2) - planet.vrniPolozaj().vrniElement(2));
				silaZ += sila * (polozaj.vrniElement(3) - planet.vrniPolozaj().vrniElement(3));
			}
		}
		silaTocka[0] = silaX;
		silaTocka[1] = silaY;
		silaTocka[2] = 0;
		return silaTocka;
	}
	/** Za dani Planet po metodi "euler" oz. "rk" s korakom dt izračuna naslednji korak planetu in mu nastavi položaj, hitrost, pospešek in doda položaj v zgodovino položajev.
	 * @param planet
	 * @param izbira
	 * @param dt
	 * @return
	 */
	public static Planet naslednjiKorak(java.util.List<Planet> planeti, Planet planet, String izbira, double dt) {
		
//		if (izbira == "euler") {planet = Euler(planet, dt);}
		if (izbira == "rk") {planet = RungeKutta4(planeti, planet, dt);}
		else{throw new IllegalArgumentException("Metoda je 'euler' oz. 'rk'.");}
		return planet;
	}
	
	
//	public static Planet Euler(Planet planet, double silaX, double silaY, double silaZ, double dt){
//		Tocka silaTocka = new Tocka(silaX, silaY, silaZ);
//		Tocka novaHitrost = new Tocka(silaX * dt + planet.vrniHitrost().vrniElement(1), silaY * dt + planet.vrniHitrost().vrniElement(2), silaZ * dt + planet.vrniHitrost().vrniElement(3));
//		Tocka novPremik = new Tocka(novaHitrost.vrniElement(1) * dt + planet.vrniPolozaj().vrniElement(1), novaHitrost.vrniElement(2) * dt + planet.vrniPolozaj().vrniElement(2), novaHitrost.vrniElement(3) * dt + planet.vrniPolozaj().vrniElement(3));
//		planet.nastavi(1, novPremik);
//		planet.nastavi(2, novaHitrost);
//		planet.nastavi(3, silaTocka);
//		planet.getZgodovina().add(novPremik);
//		return planet;
//	}
	
	public static Planet RungeKutta4(java.util.List<Planet> planeti, Planet planet, double dt){
		
		double[] k1 = new double[3];
		double[] k2 = new double[3];
		double[] k3 = new double[3];
		double[] k4 = new double[3];
		double[] l1 = new double[3];
		double[] l2 = new double[3];
		double[] l3 = new double[3];
		double[] l4 = new double[3];
		k1 = sila(planeti, planet.vrniPolozaj(), planet.getIme());
		l1[0] = planet.vrniHitrost().vrniElement(1);
		l1[1] = planet.vrniHitrost().vrniElement(2);
		l1[2] = planet.vrniHitrost().vrniElement(3);
		Tocka zacasniPolozaj = new Tocka(0,0,0);
		zacasniPolozaj = planet.vrniPolozaj();
		zacasniPolozaj.pristej(l1[0] * dt / 2, l1[1] * dt / 2, l1[2] * dt / 2);
		k2 = sila(planeti, zacasniPolozaj, planet.getIme());
		l2[0] = planet.vrniHitrost().vrniElement(1) * k1[0] * dt / 2;
		l2[1] = planet.vrniHitrost().vrniElement(2) * k1[1] * dt / 2;
		l2[2] = planet.vrniHitrost().vrniElement(3) * k1[2] * dt / 2;
		zacasniPolozaj = planet.vrniPolozaj();
		zacasniPolozaj.pristej(l2[0] * dt / 2, l2[1] * dt / 2, l2[2] * dt / 2);
		k3 = sila(planeti, zacasniPolozaj, planet.getIme());
		l3[0] = planet.vrniHitrost().vrniElement(1) * k2[0] * dt / 2;
		l3[1] = planet.vrniHitrost().vrniElement(2) * k2[1] * dt / 2;
		l3[2] = planet.vrniHitrost().vrniElement(3) * k2[2] * dt / 2;
		zacasniPolozaj = planet.vrniPolozaj();
		zacasniPolozaj.pristej(l3[0] * dt / 2, l3[1] * dt / 2, l3[2] * dt / 2);
		k4 = sila(planeti, zacasniPolozaj, planet.getIme());
		l4[0] = planet.vrniHitrost().vrniElement(1) * k3[0] * dt / 2;
		l4[1] = planet.vrniHitrost().vrniElement(2) * k3[1] * dt / 2;
		l4[2] = planet.vrniHitrost().vrniElement(3) * k3[2] * dt / 2;
		
		Tocka dv = new Tocka(dt / 6 * (k1[0] + 2 * k2[0] + 2 * k3[0] + k4[0]), dt / 6 * (k1[1] + 2 * k2[1] + 2 * k3[1] + k4[1]), dt / 6 * (k1[2] + 2 * k2[2] + 2 * k3[2] + k4[2]));
		Tocka dr = new Tocka(dt / 6 * (l1[0] + 2 * l2[0] + 2 * l3[0] + l4[0]), dt / 6 * (l1[1] + 2 * l2[1] + 2 * l3[1] + l4[1]), dt / 6 * (l1[2] + 2 * l2[2] + 2 * l3[2] + l4[2]));

		Tocka novaHitrost = new Tocka(0,0,0);
		novaHitrost = planet.vrniHitrost().pristejTocko(dv);
		Tocka novPremik = new Tocka(0,0,0);
		novPremik = planet.vrniPolozaj().pristejTocko(dr);
		planet.nastavi(1, novPremik);
		planet.nastavi(2, novaHitrost);
//		planet.nastavi(3, silaTocka);
		planet.getZgodovina().add(novPremik);

		return planet;
	}
	
	public static double radij(Tocka polozaj){
		double radij = Math.sqrt(Math.pow(polozaj.vrniElement(1), 2) + Math.pow(polozaj.vrniElement(2), 2) + Math.pow(polozaj.vrniElement(3), 2));
		return radij;
		
	}
}