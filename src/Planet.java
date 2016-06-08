import java.util.Vector;

@SuppressWarnings("unused")
public class Planet {
	//koordinate, hitrosti in pospeški
	private Tocka polozaj;
	private Tocka hitrost;
	private Tocka pospesek;

	//zgodovina premikov
	private Vector<Tocka> zgodovina;

	public Planet(Tocka polozaj, Tocka hitrost, Tocka pospesek){
		this.polozaj = polozaj;
		this.hitrost = hitrost;
		this.pospesek = pospesek;
	}


	public void polozaj(double x, double y, double z){
		this.polozaj(x,y,z);
	}

	public Tocka vrniPolozaj(){
		return this.polozaj;
	}
	public Tocka vrniHitrost(){
		return this.hitrost;
	}
	public Tocka vrniPospesek(){
		return this.pospesek;
	}

	public void premakni(double dx, double dy, double dz){
		this.polozaj = this.polozaj.pristej(dx, dy, dz);
	}
	
	public void nastavi(int izbira, Tocka podatki){
		if (izbira == 1){
			this.polozaj = podatki;
		}
		if (izbira == 2){
			this.hitrost = podatki;
		}
		if (izbira == 3){
			this.pospesek = podatki;
		}
	}
}
