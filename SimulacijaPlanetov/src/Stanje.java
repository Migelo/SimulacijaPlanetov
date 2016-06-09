import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

//tukaj opišemo trenutno stanje, ki ga narišemo na platno

@SuppressWarnings("unused")
public class Stanje {
	ArrayList<Planet> planeti;
	boolean sled;
	Color ozadje;
	
	public Stanje(ArrayList<Planet> planeti){
		this.planeti = planeti;
		this.sled = true;
		this.ozadje = Color.GRAY;
	}
	
	public void narisi(Graphics g){
		int i = 0;
		while (i  < 2000){
			for (Planet planet : planeti){
				Racunanje.sila2(planet);
				planet.narisi(g);
				System.out.println(planet.vrniPolozaj());
			}
//			try {
//				Thread.sleep(40);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			i++;
		}
	}
}
