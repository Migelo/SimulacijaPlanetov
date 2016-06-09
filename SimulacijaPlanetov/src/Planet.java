import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

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

	public void premakni(double dx, double dy, double dz){
		this.polozaj = this.polozaj.pristej(dx, dy, dz);
	}
	
	/**Sprejme Točko "podatki" in jo nastavi elementu Planet. (1. položaj, 2. hitrost, 3. pospešek).
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


	public void narisi(Graphics g) {
		g.fillOval((int)polozaj.vrniElement(1)-5+100, (int)polozaj.vrniElement(2)-5+100, 10, 10);
		
	}
}
