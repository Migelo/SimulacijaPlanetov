public class SimulacijePlanetov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nastavi začetne položaje in hitrosti
		//Planet a = new Planet(Tocka(1,2,3), null, null);
		//a.polozaj(1,1,1);
		Tocka a = new Tocka(0, 0, 0);
		Tocka c = new Tocka(5,5,5);
		a.pristej(1,2,3);
		Planet b = new Planet(a,a,a);
		b.nastavi(1, c);
		Racunanje.sila(b.vrniPolozaj());
		System.out.println(Racunanje.sila(b.vrniPolozaj()));
		System.out.println(a);
		
	}
}
