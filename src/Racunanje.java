public class Racunanje {
	@SuppressWarnings("unused")
	public static double sila(Tocka polozaj) {
		double sila, silaX, silaY, silaZ = 0;
		double radij = Math.sqrt(Math.pow(polozaj.vrniElement(1), 2) + Math.pow(polozaj.vrniElement(2), 2) + Math.pow(polozaj.vrniElement(3), 2));
		sila = -1/Math.pow(radij,3);		
		silaX = polozaj.vrniElement(1)/radij;
		silaY = polozaj.vrniElement(2)/radij;
		silaZ = polozaj.vrniElement(3)/radij;
		return sila;
	}
	public static Planet sila2(Planet planet) {
		double dt = 0.001;
		double sila, silaX, silaY, silaZ = 0;
		Tocka polozaj = planet.vrniPolozaj();
		//double radij = Math.sqrt(Math.pow(polozaj.vrniElement(1), 2) + Math.pow(polozaj.vrniElement(2), 2) + Math.pow(polozaj.vrniElement(3), 2));
		double radij = radij(polozaj);
		sila = -1/Math.pow(radij,3);		
		silaX = sila * polozaj.vrniElement(1) / radij;
		silaY = sila * polozaj.vrniElement(2) / radij;
		silaZ = sila * polozaj.vrniElement(3) / radij;
		Tocka silaTocka = new Tocka(silaX, silaY, silaZ);
		Tocka novaHitrost = new Tocka(silaX * dt + planet.vrniHitrost().vrniElement(1), silaY * dt + planet.vrniHitrost().vrniElement(2), silaZ * dt + planet.vrniHitrost().vrniElement(3));
		Tocka novPremik = new Tocka(novaHitrost.vrniElement(1) * dt + planet.vrniPolozaj().vrniElement(1), novaHitrost.vrniElement(2) * dt + planet.vrniPolozaj().vrniElement(2), novaHitrost.vrniElement(3) * dt + planet.vrniPolozaj().vrniElement(3));
		planet.nastavi(1, novPremik);
		planet.nastavi(2, novaHitrost);
		planet.nastavi(3, silaTocka);
		planet.getZgodovina().add(novPremik);
		return planet;
	}
	
	public static double radij(Tocka polozaj){
		double radij = Math.sqrt(Math.pow(polozaj.vrniElement(1), 2) + Math.pow(polozaj.vrniElement(2), 2) + Math.pow(polozaj.vrniElement(3), 2));
		return radij;
		
	}
}