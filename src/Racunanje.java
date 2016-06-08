import java.util.ArrayList;

public class Racunanje {
	public static double naslednjiKorak(double x, double y, double z) {
		ArrayList<Double> koordinate = new ArrayList<Double>();
		for (Double i : koordinate ){
			
		}
		return x;
	}
	public static double sila(Tocka polozaj) {
		double sila, silaX, silaY, silaZ = 0;
		double radij = Math.sqrt(Math.pow(polozaj.vrniElement(1), 2) + Math.pow(polozaj.vrniElement(2), 2) + Math.pow(polozaj.vrniElement(3), 2));
		sila = -1/Math.pow(radij,3);		
		silaX = polozaj.vrniElement(1)/radij;
		silaY = polozaj.vrniElement(2)/radij;
		silaZ = polozaj.vrniElement(3)/radij;
		return sila;
	}
}
//
//
//
//