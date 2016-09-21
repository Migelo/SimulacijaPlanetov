import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Planet planet;
	private JMenu sistemi = new JMenu("Sistemi");
	private JMenuItem sistem1 = new JMenuItem ("Osoncje");
	private JMenuItem sistem2 = new JMenuItem ("Dzabe sistem");
	private JMenuItem sistem3 = new JMenuItem ("Binarni sistem brez planetov");
	private JMenuItem sistem4 = new JMenuItem ("Binarni sistem s planeti");
	
	public Menu(Okno okno){
		super();
		izbiraSistemaMenu();
	}
	
	
	public void izbiraSistemaMenu() {
		this.add(sistemi);
		sistemi.add(sistem1);
		sistemi.add(sistem2);
		sistemi.add(sistem3);
		sistemi.add(sistem4);
		
		sistem1.addActionListener(this);
		sistem2.addActionListener(this);
		sistem3.addActionListener(this);
		sistem4.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getActionCommand()=="Sistem2"){
			Tocka prazna = new Tocka(0,0,0);
			
			double sonceMasa = 2*Math.pow(10, 30);
			double marsMasa = 6*Math.pow(10, 23);
			Tocka marsPolozaj = new Tocka(-1.3, 0, 0);
			Tocka marsHitrost = new Tocka(0, -1,0);
			Planet mars = new Planet(marsPolozaj, marsHitrost, prazna, marsMasa/sonceMasa, "mars");
			
			double zemljaMasa = 6*Math.pow(10, 24);
			Tocka zemljaPolozaj = new Tocka(1, 0, 0);
			Tocka zemljaHitrost = new Tocka(0, 1.2, 0);
			Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna, zemljaMasa/sonceMasa, "zemlja");

			Tocka soncePolozaj = new Tocka(0, 0, 0);
			Tocka sonceHitrost = new Tocka(0, 0, 0);
			Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(mars);
			planeti.add(zemlja);
			planeti.add(sonce);
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}
		else if (a.getActionCommand()=="Binarni sistem brez planetov") {
			Tocka prazna = new Tocka(0,0,0);
			Tocka sonce1Polozaj = new Tocka(-0.5, 0, 0);
			Tocka sonce1Hitrost = new Tocka(0, -0.85, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 1, "sonce1");
			
			//double sonce2Masa = 6*Math.pow(10, 32);
			Tocka sonce2Polozaj = new Tocka(0.5, 0, 0);
			Tocka sonce2Hitrost = new Tocka(0, 0.85, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 1, "sonce2");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			planeti.add(sonce2);
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}
		else if (a.getActionCommand()=="Binarni sistem s planeti") {
			Tocka prazna = new Tocka(0,0,0);
			double sonceMasa = 2*Math.pow(10, 32);
			Tocka sonce1Polozaj = new Tocka(-0.5, 0, 0);
			Tocka sonce1Hitrost = new Tocka(0, -0.85, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 1, "sonce1");
			
			//double sonce2Masa = 6*Math.pow(10, 32);
			Tocka sonce2Polozaj = new Tocka(0.5, 0, 0);
			Tocka sonce2Hitrost = new Tocka(0, 0.85, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 1, "sonce2");

			Tocka planeticPolozaj = new Tocka(0, 0, 0);
			Tocka planeticHitrost = new Tocka (0, 0, 0);
			double planeticMasa = 6*Math.pow(10, 26);
			Planet planetic = new Planet(planeticPolozaj, planeticHitrost, prazna, planeticMasa/sonceMasa , "sonce");
			
			Tocka planetic1Polozaj = new Tocka(0, 1.5, 0);
			Tocka planetic1Hitrost = new Tocka (-1, 0, 0);
			double planetic1Masa = 6*Math.pow(10, 26);
			Planet planetic1 = new Planet(planetic1Polozaj, planetic1Hitrost, prazna, planetic1Masa/sonceMasa , "sonce");
			
			Tocka planetic2Polozaj = new Tocka(0, -1.2, 0);
			Tocka planetic2Hitrost = new Tocka (1.1, 0, 0);
			double planetic2Masa = 3*Math.pow(10, 26);
			Planet planetic2 = new Planet(planetic2Polozaj, planetic2Hitrost, prazna, planetic2Masa/sonceMasa , "sonce");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			planeti.add(sonce2);
			planeti.add(planetic);
			planeti.add(planetic1);
			planeti.add(planetic2);
			
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}

		
	}
	

}
