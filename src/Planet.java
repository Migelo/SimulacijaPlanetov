import java.util.Vector;

@SuppressWarnings("unused")
public class Planet {
	//koordinate, hitrosti in pospeški
	private Tocka polozaj;
	private Tocka hitrost;
	private Tocka pospešek;

	//zgodovina premikov
	private Vector<Tocka> zgodovina;

	public Planet(Tocka polozaj, Tocka hitrost, Tocka pospesek){
		this.polozaj = polozaj;
		this.hitrost = hitrost;
		this.pospešek = pospesek;
	}
	
	
public void polozaj(double x, double y, double z){
	this.polozaj(1,1,1);
}

//public void premakni(double dx, double dy, double dz){
//	this.polozaj.
//}
}
