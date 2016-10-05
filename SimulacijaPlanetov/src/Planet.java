import java.util.Vector;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class Planet {
	//koordinate, hitrosti in pospeski
	private Tocka polozaj;
	private Tocka hitrost;
	private Tocka pospesek;
	private double masa;
	private String ime;
	private double radij;
	private String barva;

	//zgodovina premikov
	private Vector<Tocka> zgodovina;

	public Planet(Tocka polozaj, Tocka hitrost, Tocka pospesek, double masa, String ime, double radij, String barva){
		this.polozaj = polozaj;
		this.hitrost = hitrost;
		this.pospesek = pospesek;
		this.masa = masa;
		this.ime = ime;
		this.radij = radij;
		this.barva = barva;
		this.zgodovina = new Vector<Tocka>();
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
	public double vrniMaso(){
		return this.masa;
	}
	
public String getIme() {
		return ime;
	}

	
	/**Sprejme Tocko "podatki" in jo nastavi elementu Planet. (1. polozaj, 2. hitrost, 3. pospesek).
	 * @param izbira
	 * @param podatki
	 */
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


	public Vector<Tocka> getZgodovina() {
		return zgodovina;
	}


	public void setZgodovina(Vector<Tocka> zgodovina) {
		this.zgodovina = zgodovina;
	}


	public double getRadij() {
		return radij;
	}


	public void setRadij(double radij) {
		this.radij = radij;
	}


	public String getBarva() {
		return barva;
	}


	public void setBarva(String barva) {
		this.barva = barva;
	}
}
