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

	private JMenu sistemi = new JMenu("Sistemi");
	private JMenuItem sistem1 = new JMenuItem ("Osoncje");
	private JMenuItem sistem2 = new JMenuItem ("Enostaven sistem");
	private JMenuItem sistem3 = new JMenuItem ("Binarni sistem brez planetov");
	private JMenuItem sistem4 = new JMenuItem ("Binarni sistem s planeti");
	private JMenuItem sistem5 = new JMenuItem ("Sončni izstrelek");
	private JMenuItem sistem6 = new JMenuItem ("Prehod črne luknje");
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
		sistemi.add(sistem5);
		sistemi.add(sistem6);
		
		
		sistem1.addActionListener(this);
		sistem2.addActionListener(this);
		sistem3.addActionListener(this);
		sistem4.addActionListener(this);
		sistem5.addActionListener(this);
		sistem6.addActionListener(this);
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
			okno.ponastavi(planeti);
			okno.pozeni();
		}
		
		else if (a.getActionCommand()=="Enostaven sistem"){
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
			Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce", 20, "yellow");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(mars);
			planeti.add(zemlja);
			planeti.add(sonce);
			okno.ponastavi(planeti);
			okno.pozeni();
			}
		
		else if (a.getActionCommand()=="Binarni sistem brez planetov") {
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			Tocka sonce1Polozaj = new Tocka(-0.5, 0, 0);
			Tocka sonce1Hitrost = new Tocka(0, -0.85, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 1, "sonce1", 20, "yellow");
			
			//double sonce2Masa = 6*Math.pow(10, 32);
			Tocka sonce2Polozaj = new Tocka(0.5, 0, 0);
			Tocka sonce2Hitrost = new Tocka(0, 0.85, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 1, "sonce2", 20, "yellow");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			planeti.add(sonce2);
			okno.ponastavi(planeti);
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
			okno.ponastavi(planeti);
			okno.pozeni();
		}
		
		else if (a.getActionCommand()=="Sončni izstrelek") {
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			
			double sonceMasa = 2*Math.pow(10, 32);
			Tocka sonce1Polozaj = new Tocka(-10, 0, 0);
			Tocka sonce1Hitrost = new Tocka(5, 0, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 20, "sonce1", 20, "yellow");
			
			Tocka sonce2Polozaj = new Tocka(10, 0, 0);
			Tocka sonce2Hitrost = new Tocka(-5, 0, 0);
			Planet sonce2 = new Planet(sonce2Polozaj, sonce2Hitrost, prazna, 20, "sonce1", 20, "yellow");

			Tocka planetic0Polozaj = new Tocka(-4, -2, 0);
			Tocka planetic0Hitrost = new Tocka (0, 0, 0);
			double planetic0Masa = 6*Math.pow(10, 26);
			Planet planetic0 = new Planet(planetic0Polozaj, planetic0Hitrost, prazna, planetic0Masa/sonceMasa , "planetic0", 10, "siva");
			
			Tocka planetic1Polozaj = new Tocka(-2, -2, 0);
			Tocka planetic1Hitrost = new Tocka (0, 0, 0);
			double planetic1Masa = 6*Math.pow(10, 26);
			Planet planetic1 = new Planet(planetic1Polozaj, planetic1Hitrost, prazna, planetic1Masa/sonceMasa , "planetic1", 10, "siva");
			
			Tocka planetic2Polozaj = new Tocka(0, -2, 0);
			Tocka planetic2Hitrost = new Tocka (0, 0, 0);
			double planetic2Masa = 6*Math.pow(10, 26);
			Planet planetic2 = new Planet(planetic2Polozaj, planetic2Hitrost, prazna, planetic2Masa/sonceMasa , "planetic2", 10, "siva");
			
			Tocka planetic3Polozaj = new Tocka(2, -2, 0);
			Tocka planetic3Hitrost = new Tocka (0, 0, 0);
			double planetic3Masa = 6*Math.pow(10, 26);
			Planet planetic3 = new Planet(planetic3Polozaj, planetic3Hitrost, prazna, planetic3Masa/sonceMasa , "planetic3", 10, "siva");
			
			Tocka planetic4Polozaj = new Tocka(4, -2, 0);
			Tocka planetic4Hitrost = new Tocka (0, 0, 0);
			double planetic4Masa = 6*Math.pow(10, 26);
			Planet planetic4 = new Planet(planetic4Polozaj, planetic4Hitrost, prazna, planetic4Masa/sonceMasa , "planetic4", 10, "siva");
			
			Tocka planetic5Polozaj = new Tocka(-4, 2, 0);
			Tocka planetic5Hitrost = new Tocka (0, 0, 0);
			double planetic5Masa = 6*Math.pow(10, 26);
			Planet planetic5 = new Planet(planetic5Polozaj, planetic5Hitrost, prazna, planetic5Masa/sonceMasa , "planetic5", 10, "siva");
			
			Tocka planetic6Polozaj = new Tocka(-2, 2, 0);
			Tocka planetic6Hitrost = new Tocka (0, 0, 0);
			double planetic6Masa = 6*Math.pow(10, 26);
			Planet planetic6 = new Planet(planetic6Polozaj, planetic6Hitrost, prazna, planetic6Masa/sonceMasa , "planetic6", 10, "siva");
			
			Tocka planetic7Polozaj = new Tocka(0, 2, 0);
			Tocka planetic7Hitrost = new Tocka (0, 0, 0);
			double planetic7Masa = 6*Math.pow(10, 26);
			Planet planetic7 = new Planet(planetic7Polozaj, planetic7Hitrost, prazna, planetic7Masa/sonceMasa , "planetic7", 10, "siva");
			
			Tocka planetic8Polozaj = new Tocka(2, 2, 0);
			Tocka planetic8Hitrost = new Tocka (0, 0, 0);
			double planetic8Masa = 6*Math.pow(10, 26);
			Planet planetic8 = new Planet(planetic8Polozaj, planetic8Hitrost, prazna, planetic8Masa/sonceMasa , "planetic8", 10, "siva");
			
			Tocka planetic9Polozaj = new Tocka(4, 2, 0);
			Tocka planetic9Hitrost = new Tocka (0, 0, 0);
			double planetic9Masa = 6*Math.pow(10, 26);
			Planet planetic9 = new Planet(planetic9Polozaj, planetic9Hitrost, prazna, planetic9Masa/sonceMasa , "planetic9", 10, "siva");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce1);
			//planeti.add(sonce2);
			planeti.add(planetic0);
			planeti.add(planetic1);
			planeti.add(planetic2);
			planeti.add(planetic3);
			planeti.add(planetic4);
			planeti.add(planetic5);
			planeti.add(planetic6);
			planeti.add(planetic7);
			planeti.add(planetic8);
			planeti.add(planetic9);
			okno.ponastavi(planeti);
			okno.pozeni();
		}
		
		else if (a.getActionCommand()=="Prehod črne luknje") {
			okno.ustavi();
			Tocka prazna = new Tocka(0,0,0);
			
			double sonceMasa = 2*Math.pow(10, 32);
			Tocka sonce1Polozaj = new Tocka(-11, 0, 0);
			Tocka sonce1Hitrost = new Tocka(5, 0, 0);
			Planet sonce1 = new Planet(sonce1Polozaj, sonce1Hitrost, prazna, 25, "sonce1", 0, "yellow");
			double planet0Masa = 6*Math.pow(10, 26);

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			
			Tocka planet414Polozaj = new Tocka(-6, -6, 0);
			Tocka planet414Hitrost = new Tocka(0, 0, 0);
			Planet planet414 = new Planet(planet414Polozaj, planet414Hitrost, prazna, planet0Masa/sonceMasa , "planet414", 10, "siva");
			planeti.add(planet414);
			Tocka planet614Polozaj = new Tocka(-4, -6, 0);
			Tocka planet614Hitrost = new Tocka(0, 0, 0);
			Planet planet614 = new Planet(planet614Polozaj, planet614Hitrost, prazna, planet0Masa/sonceMasa , "planet614", 10, "siva");
			planeti.add(planet614);
			Tocka planet814Polozaj = new Tocka(-2, -6, 0);
			Tocka planet814Hitrost = new Tocka(0, 0, 0);
			Planet planet814 = new Planet(planet814Polozaj, planet814Hitrost, prazna, planet0Masa/sonceMasa , "planet814", 10, "siva");
			planeti.add(planet814);
			Tocka planet1014Polozaj = new Tocka(0, -6, 0);
			Tocka planet1014Hitrost = new Tocka(0, 0, 0);
			Planet planet1014 = new Planet(planet1014Polozaj, planet1014Hitrost, prazna, planet0Masa/sonceMasa , "planet1014", 10, "siva");
			planeti.add(planet1014);
			Tocka planet1214Polozaj = new Tocka(2, -6, 0);
			Tocka planet1214Hitrost = new Tocka(0, 0, 0);
			Planet planet1214 = new Planet(planet1214Polozaj, planet1214Hitrost, prazna, planet0Masa/sonceMasa , "planet1214", 10, "siva");
			planeti.add(planet1214);
			Tocka planet1414Polozaj = new Tocka(4, -6, 0);
			Tocka planet1414Hitrost = new Tocka(0, 0, 0);
			Planet planet1414 = new Planet(planet1414Polozaj, planet1414Hitrost, prazna, planet0Masa/sonceMasa , "planet1414", 10, "siva");
			planeti.add(planet1414);
			Tocka planet1614Polozaj = new Tocka(6, -6, 0);
			Tocka planet1614Hitrost = new Tocka(0, 0, 0);
			Planet planet1614 = new Planet(planet1614Polozaj, planet1614Hitrost, prazna, planet0Masa/sonceMasa , "planet1614", 10, "siva");
			planeti.add(planet1614);
			Tocka planet416Polozaj = new Tocka(-6, -4, 0);
			Tocka planet416Hitrost = new Tocka(0, 0, 0);
			Planet planet416 = new Planet(planet416Polozaj, planet416Hitrost, prazna, planet0Masa/sonceMasa , "planet416", 10, "siva");
			planeti.add(planet416);
			Tocka planet616Polozaj = new Tocka(-4, -4, 0);
			Tocka planet616Hitrost = new Tocka(0, 0, 0);
			Planet planet616 = new Planet(planet616Polozaj, planet616Hitrost, prazna, planet0Masa/sonceMasa , "planet616", 10, "siva");
			planeti.add(planet616);
			Tocka planet816Polozaj = new Tocka(-2, -4, 0);
			Tocka planet816Hitrost = new Tocka(0, 0, 0);
			Planet planet816 = new Planet(planet816Polozaj, planet816Hitrost, prazna, planet0Masa/sonceMasa , "planet816", 10, "siva");
			planeti.add(planet816);
			Tocka planet1016Polozaj = new Tocka(0, -4, 0);
			Tocka planet1016Hitrost = new Tocka(0, 0, 0);
			Planet planet1016 = new Planet(planet1016Polozaj, planet1016Hitrost, prazna, planet0Masa/sonceMasa , "planet1016", 10, "siva");
			planeti.add(planet1016);
			Tocka planet1216Polozaj = new Tocka(2, -4, 0);
			Tocka planet1216Hitrost = new Tocka(0, 0, 0);
			Planet planet1216 = new Planet(planet1216Polozaj, planet1216Hitrost, prazna, planet0Masa/sonceMasa , "planet1216", 10, "siva");
			planeti.add(planet1216);
			Tocka planet1416Polozaj = new Tocka(4, -4, 0);
			Tocka planet1416Hitrost = new Tocka(0, 0, 0);
			Planet planet1416 = new Planet(planet1416Polozaj, planet1416Hitrost, prazna, planet0Masa/sonceMasa , "planet1416", 10, "siva");
			planeti.add(planet1416);
			Tocka planet1616Polozaj = new Tocka(6, -4, 0);
			Tocka planet1616Hitrost = new Tocka(0, 0, 0);
			Planet planet1616 = new Planet(planet1616Polozaj, planet1616Hitrost, prazna, planet0Masa/sonceMasa , "planet1616", 10, "siva");
			planeti.add(planet1616);
			Tocka planet418Polozaj = new Tocka(-6, -2, 0);
			Tocka planet418Hitrost = new Tocka(0, 0, 0);
			Planet planet418 = new Planet(planet418Polozaj, planet418Hitrost, prazna, planet0Masa/sonceMasa , "planet418", 10, "siva");
			planeti.add(planet418);
			Tocka planet618Polozaj = new Tocka(-4, -2, 0);
			Tocka planet618Hitrost = new Tocka(0, 0, 0);
			Planet planet618 = new Planet(planet618Polozaj, planet618Hitrost, prazna, planet0Masa/sonceMasa , "planet618", 10, "siva");
			planeti.add(planet618);
			Tocka planet818Polozaj = new Tocka(-2, -2, 0);
			Tocka planet818Hitrost = new Tocka(0, 0, 0);
			Planet planet818 = new Planet(planet818Polozaj, planet818Hitrost, prazna, planet0Masa/sonceMasa , "planet818", 10, "siva");
			planeti.add(planet818);
			Tocka planet1018Polozaj = new Tocka(0, -2, 0);
			Tocka planet1018Hitrost = new Tocka(0, 0, 0);
			Planet planet1018 = new Planet(planet1018Polozaj, planet1018Hitrost, prazna, planet0Masa/sonceMasa , "planet1018", 10, "siva");
			planeti.add(planet1018);
			Tocka planet1218Polozaj = new Tocka(2, -2, 0);
			Tocka planet1218Hitrost = new Tocka(0, 0, 0);
			Planet planet1218 = new Planet(planet1218Polozaj, planet1218Hitrost, prazna, planet0Masa/sonceMasa , "planet1218", 10, "siva");
			planeti.add(planet1218);
			Tocka planet1418Polozaj = new Tocka(4, -2, 0);
			Tocka planet1418Hitrost = new Tocka(0, 0, 0);
			Planet planet1418 = new Planet(planet1418Polozaj, planet1418Hitrost, prazna, planet0Masa/sonceMasa , "planet1418", 10, "siva");
			planeti.add(planet1418);
			Tocka planet1618Polozaj = new Tocka(6, -2, 0);
			Tocka planet1618Hitrost = new Tocka(0, 0, 0);
			Planet planet1618 = new Planet(planet1618Polozaj, planet1618Hitrost, prazna, planet0Masa/sonceMasa , "planet1618", 10, "siva");
			planeti.add(planet1618);
			Tocka planet422Polozaj = new Tocka(-6, 2, 0);
			Tocka planet422Hitrost = new Tocka(0, 0, 0);
			Planet planet422 = new Planet(planet422Polozaj, planet422Hitrost, prazna, planet0Masa/sonceMasa , "planet422", 10, "siva");
			planeti.add(planet422);
			Tocka planet622Polozaj = new Tocka(-4, 2, 0);
			Tocka planet622Hitrost = new Tocka(0, 0, 0);
			Planet planet622 = new Planet(planet622Polozaj, planet622Hitrost, prazna, planet0Masa/sonceMasa , "planet622", 10, "siva");
			planeti.add(planet622);
			Tocka planet822Polozaj = new Tocka(-2, 2, 0);
			Tocka planet822Hitrost = new Tocka(0, 0, 0);
			Planet planet822 = new Planet(planet822Polozaj, planet822Hitrost, prazna, planet0Masa/sonceMasa , "planet822", 10, "siva");
			planeti.add(planet822);
			Tocka planet1022Polozaj = new Tocka(0, 2, 0);
			Tocka planet1022Hitrost = new Tocka(0, 0, 0);
			Planet planet1022 = new Planet(planet1022Polozaj, planet1022Hitrost, prazna, planet0Masa/sonceMasa , "planet1022", 10, "siva");
			planeti.add(planet1022);
			Tocka planet1222Polozaj = new Tocka(2, 2, 0);
			Tocka planet1222Hitrost = new Tocka(0, 0, 0);
			Planet planet1222 = new Planet(planet1222Polozaj, planet1222Hitrost, prazna, planet0Masa/sonceMasa , "planet1222", 10, "siva");
			planeti.add(planet1222);
			Tocka planet1422Polozaj = new Tocka(4, 2, 0);
			Tocka planet1422Hitrost = new Tocka(0, 0, 0);
			Planet planet1422 = new Planet(planet1422Polozaj, planet1422Hitrost, prazna, planet0Masa/sonceMasa , "planet1422", 10, "siva");
			planeti.add(planet1422);
			Tocka planet1622Polozaj = new Tocka(6, 2, 0);
			Tocka planet1622Hitrost = new Tocka(0, 0, 0);
			Planet planet1622 = new Planet(planet1622Polozaj, planet1622Hitrost, prazna, planet0Masa/sonceMasa , "planet1622", 10, "siva");
			planeti.add(planet1622);
			Tocka planet424Polozaj = new Tocka(-6, 4, 0);
			Tocka planet424Hitrost = new Tocka(0, 0, 0);
			Planet planet424 = new Planet(planet424Polozaj, planet424Hitrost, prazna, planet0Masa/sonceMasa , "planet424", 10, "siva");
			planeti.add(planet424);
			Tocka planet624Polozaj = new Tocka(-4, 4, 0);
			Tocka planet624Hitrost = new Tocka(0, 0, 0);
			Planet planet624 = new Planet(planet624Polozaj, planet624Hitrost, prazna, planet0Masa/sonceMasa , "planet624", 10, "siva");
			planeti.add(planet624);
			Tocka planet824Polozaj = new Tocka(-2, 4, 0);
			Tocka planet824Hitrost = new Tocka(0, 0, 0);
			Planet planet824 = new Planet(planet824Polozaj, planet824Hitrost, prazna, planet0Masa/sonceMasa , "planet824", 10, "siva");
			planeti.add(planet824);
			Tocka planet1024Polozaj = new Tocka(0, 4, 0);
			Tocka planet1024Hitrost = new Tocka(0, 0, 0);
			Planet planet1024 = new Planet(planet1024Polozaj, planet1024Hitrost, prazna, planet0Masa/sonceMasa , "planet1024", 10, "siva");
			planeti.add(planet1024);
			Tocka planet1224Polozaj = new Tocka(2, 4, 0);
			Tocka planet1224Hitrost = new Tocka(0, 0, 0);
			Planet planet1224 = new Planet(planet1224Polozaj, planet1224Hitrost, prazna, planet0Masa/sonceMasa , "planet1224", 10, "siva");
			planeti.add(planet1224);
			Tocka planet1424Polozaj = new Tocka(4, 4, 0);
			Tocka planet1424Hitrost = new Tocka(0, 0, 0);
			Planet planet1424 = new Planet(planet1424Polozaj, planet1424Hitrost, prazna, planet0Masa/sonceMasa , "planet1424", 10, "siva");
			planeti.add(planet1424);
			Tocka planet1624Polozaj = new Tocka(6, 4, 0);
			Tocka planet1624Hitrost = new Tocka(0, 0, 0);
			Planet planet1624 = new Planet(planet1624Polozaj, planet1624Hitrost, prazna, planet0Masa/sonceMasa , "planet1624", 10, "siva");
			planeti.add(planet1624);
			Tocka planet426Polozaj = new Tocka(-6, 6, 0);
			Tocka planet426Hitrost = new Tocka(0, 0, 0);
			Planet planet426 = new Planet(planet426Polozaj, planet426Hitrost, prazna, planet0Masa/sonceMasa , "planet426", 10, "siva");
			planeti.add(planet426);
			Tocka planet626Polozaj = new Tocka(-4, 6, 0);
			Tocka planet626Hitrost = new Tocka(0, 0, 0);
			Planet planet626 = new Planet(planet626Polozaj, planet626Hitrost, prazna, planet0Masa/sonceMasa , "planet626", 10, "siva");
			planeti.add(planet626);
			Tocka planet826Polozaj = new Tocka(-2, 6, 0);
			Tocka planet826Hitrost = new Tocka(0, 0, 0);
			Planet planet826 = new Planet(planet826Polozaj, planet826Hitrost, prazna, planet0Masa/sonceMasa , "planet826", 10, "siva");
			planeti.add(planet826);
			Tocka planet1026Polozaj = new Tocka(0, 6, 0);
			Tocka planet1026Hitrost = new Tocka(0, 0, 0);
			Planet planet1026 = new Planet(planet1026Polozaj, planet1026Hitrost, prazna, planet0Masa/sonceMasa , "planet1026", 10, "siva");
			planeti.add(planet1026);
			Tocka planet1226Polozaj = new Tocka(2, 6, 0);
			Tocka planet1226Hitrost = new Tocka(0, 0, 0);
			Planet planet1226 = new Planet(planet1226Polozaj, planet1226Hitrost, prazna, planet0Masa/sonceMasa , "planet1226", 10, "siva");
			planeti.add(planet1226);
			Tocka planet1426Polozaj = new Tocka(4, 6, 0);
			Tocka planet1426Hitrost = new Tocka(0, 0, 0);
			Planet planet1426 = new Planet(planet1426Polozaj, planet1426Hitrost, prazna, planet0Masa/sonceMasa , "planet1426", 10, "siva");
			planeti.add(planet1426);
			Tocka planet1626Polozaj = new Tocka(6, 6, 0);
			Tocka planet1626Hitrost = new Tocka(0, 0, 0);
			Planet planet1626 = new Planet(planet1626Polozaj, planet1626Hitrost, prazna, planet0Masa/sonceMasa , "planet1626", 10, "siva");
			planeti.add(planet1626);

			
			planeti.add(sonce1);
			okno.ponastavi(planeti);
			okno.pozeni();
		}
		
	}
	

}
