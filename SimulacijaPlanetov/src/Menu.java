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
	private Okno okno;
	
	public Menu(Okno okno){
		super();
		this.okno = okno;
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


	public void actionPerformed(ActionEvent a) {
		
		if (a.getActionCommand()=="Osoncje"){
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			double sonceMasa = 2*Math.pow(10, 30);

			double merkurMasa = 0.33*Math.pow(10, 24);
			Tocka merkurPolozaj = new Tocka(0.217425882, 0.217425882, 0);
			Tocka merkurHitrost = new Tocka(-1.275181147*1.3, 1.275181147*1.3 ,0);
			Planet merkur = new Planet(merkurPolozaj, merkurHitrost, prazna, merkurMasa/sonceMasa, "merkur", 5, "siva");

			double veneraMasa = 4.87*Math.pow(10, 24);
			Tocka veneraPolozaj = new Tocka(0, 0.718582888, 0);
			Tocka veneraHitrost = new Tocka(-1.179672797*1.2, 0,0);
			Planet venera = new Planet(veneraPolozaj, veneraHitrost, prazna, veneraMasa/sonceMasa, "venera", 10, "siva");
			
			double zemljaMasa = 5.97*Math.pow(10, 24);
			Tocka zemljaPolozaj = new Tocka(-0.707106781, 0.707106781, 0);
			Tocka zemljaHitrost = new Tocka(-0.707106781, -0.707106781, 0);
			Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna, zemljaMasa/sonceMasa, "zemlja", 10, "siva");
			
			double marsMasa = 0.642*Math.pow(10, 24);
			Tocka marsPolozaj = new Tocka(-1.523395722, 0, 0);
			Tocka marsHitrost = new Tocka(0, -0.810202603,0);
			Planet mars = new Planet(marsPolozaj, marsHitrost, prazna, marsMasa/sonceMasa, "mars", 10, "siva");
			
			double jupiterMasa = 1898*Math.pow(10, 24);
			Tocka jupiterPolozaj = new Tocka(-3.680169384, -3.680169384, 0);
			Tocka jupiterHitrost = new Tocka(0.309951398, -0.309951398, 0);
			Planet jupiter = new Planet(jupiterPolozaj, jupiterHitrost, prazna, jupiterMasa/sonceMasa, "jupiter", 10, "siva");

			double saturnMasa = 568*Math.pow(10, 24);
			Tocka saturnPolozaj = new Tocka(0, -9.582219251, 0);
			Tocka saturnHitrost = new Tocka(0.323047919, 0, 0);
			Planet saturn = new Planet(saturnPolozaj, saturnHitrost, prazna, saturnMasa/sonceMasa, "saturn", 10, "siva");

//			double uranMasa = 86.8*Math.pow(10, 24);
//			Tocka uranPolozaj = new Tocka(13.577301, -13.577301, 0);
//			Tocka uranHitrost = new Tocka(0.16136925, 0.16136925, 0);
//			Planet uran = new Planet(uranPolozaj, uranHitrost, prazna, uranMasa/sonceMasa, "uran", 10, "siva");
//
//			double neptunMasa = 102*Math.pow(10, 24);
//			Tocka neptunPolozaj = new Tocka(30.04745989, 0, 0);
//			Tocka neptunHitrost = new Tocka(0, 0.182429941, 0);
//			Planet neptun = new Planet(neptunPolozaj, neptunHitrost, prazna, neptunMasa/sonceMasa, "neptun", 10, "siva");


			Tocka soncePolozaj = new Tocka(0, 0, 0);
			Tocka sonceHitrost = new Tocka(0, 0, 0);
			Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce", 15, "yellow");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce);
			planeti.add(merkur);
			planeti.add(venera);
			planeti.add(zemlja);
			planeti.add(mars);
			planeti.add(jupiter);
			planeti.add(saturn);
//			planeti.add(uran);
//			planeti.add(neptun);
			okno.dispose();
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}
		
		else if (a.getActionCommand()=="Dzabe sistem"){
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			
			double sonceMasa = 2*Math.pow(10, 30);
			double marsMasa = 6*Math.pow(10, 23);
			Tocka marsPolozaj = new Tocka(-1.3, 0, 0);
			Tocka marsHitrost = new Tocka(0, -1,0);
			Planet mars = new Planet(marsPolozaj, marsHitrost, prazna, marsMasa/sonceMasa, "mars", 10, "siva");
			
			double zemljaMasa = 6*Math.pow(10, 24);
			Tocka zemljaPolozaj = new Tocka(1, 0, 0);
			Tocka zemljaHitrost = new Tocka(0, 1.2, 0);
			Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna, zemljaMasa/sonceMasa, "zemlja", 10, "siva");

			Tocka soncePolozaj = new Tocka(0, 0, 0);
			Tocka sonceHitrost = new Tocka(0, 0, 0);
			Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce", 10, "yellow");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(mars);
			planeti.add(zemlja);
			planeti.add(sonce);
			okno.dispose();
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
			}
		
		else if (a.getActionCommand()=="Binarni sistem brez planetov") {
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			Tocka sonce1Polozaj = new Tocka(-0.5, 0, 0);
			Tocka sonce1Hitrost = new Tocka(0, -0.85, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 1, "sonce1", 10, "yellow");
			
			//double sonce2Masa = 6*Math.pow(10, 32);
			Tocka sonce2Polozaj = new Tocka(0.5, 0, 0);
			Tocka sonce2Hitrost = new Tocka(0, 0.85, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 1, "sonce2", 10, "yellow");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			planeti.add(sonce2);
			okno.dispose();
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}
		
		else if (a.getActionCommand()=="Binarni sistem s planeti") {
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			double sonceMasa = 2*Math.pow(10, 32);
			Tocka sonce1Polozaj = new Tocka(-0.5, 0, 0);
			Tocka sonce1Hitrost = new Tocka(0, -0.85, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 1, "sonce1", 20, "yellow");
			
			//double sonce2Masa = 6*Math.pow(10, 32);
			Tocka sonce2Polozaj = new Tocka(0.5, 0, 0);
			Tocka sonce2Hitrost = new Tocka(0, 0.85, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 1, "sonce2", 20, "yellow");

			Tocka planeticPolozaj = new Tocka(0, 0, 0);
			Tocka planeticHitrost = new Tocka (0, 0, 0);
			double planeticMasa = 6*Math.pow(10, 26);
			Planet planetic = new Planet(planeticPolozaj, planeticHitrost, prazna, planeticMasa/sonceMasa , "planetic", 10, "siva");
			
			Tocka planetic1Polozaj = new Tocka(0, 5, 0);
			Tocka planetic1Hitrost = new Tocka (-.8, 0, 0);
			double planetic1Masa = 6*Math.pow(10, 26);
			Planet planetic1 = new Planet(planetic1Polozaj, planetic1Hitrost, prazna, planetic1Masa/sonceMasa , "planetic1", 10, "siva");
			
			Tocka planetic2Polozaj = new Tocka(0, -1.2, 0);
			Tocka planetic2Hitrost = new Tocka (1.1, 0, 0);
			double planetic2Masa = 3*Math.pow(10, 26);
			Planet planetic2 = new Planet(planetic2Polozaj, planetic2Hitrost, prazna, planetic2Masa/sonceMasa , "planetic2", 10, "siva");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			planeti.add(sonce2);
			planeti.add(planetic);
			planeti.add(planetic1);
			planeti.add(planetic2);
//			okno.dispose();
//			Okno okno = new Okno(planeti);
//			okno.pack();
//			okno.setVisible(true);
//			okno.pozeni();
			okno.ponastavi(planeti);
		}
		
	}
	

}
