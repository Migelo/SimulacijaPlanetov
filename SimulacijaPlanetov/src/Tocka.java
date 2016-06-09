public class Tocka {
	
	private double x,y,z;

	public Tocka(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Tocka pristej(double x, double y, double z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return null;
	}
	public Tocka nastavi(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		return null;
	}
	@Override
	public String toString() {
		return "Tocka [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	/**Vrne element točke označen z i. (x, y, z)
	 * @param i
	 * @return
	 */
	public double vrniElement(int i){
		if (i == 1){
			return this.x;
		}
		else if (i == 2){
			return this.y;
		}
		else if (i == 3){
			return this.z;
		}
		else{
			throw new IllegalArgumentException("n mora biti med 1 in 3.");
		}
	}
	
}
