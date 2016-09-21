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
	private Okno okno;
	//private Planet planet;
	private JMenu sistemi = new JMenu("Sistemi");
	private JMenuItem sistem1 = new JMenuItem ("Sistem1");
	private JMenuItem sistem2 = new JMenuItem ("Sistem2");
	private JMenuItem sistem3 = new JMenuItem ("Sistem3");
	
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
		
		sistem1.addActionListener(this);
		sistem2.addActionListener(this);
		sistem3.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent a) {
		if (a.getActionCommand()=="Sistem1"){
			Tocka prazna = new Tocka(0,0,0);
			double sonceMasa = 2*Math.pow(10, 30);
			
			double merkurMasa = 0.33*Math.pow(10, 24);
			Tocka merkurPolozaj = new Tocka(0.217425882, 0.217425882, 0);
			Tocka merkurHitrost = new Tocka(-1.275181147, 1.275181147,0);
			Planet merkur = new Planet(merkurPolozaj, merkurHitrost, prazna, merkurMasa/sonceMasa, "merkur");
			
			double veneraMasa = 4.87*Math.pow(10, 24);
			Tocka veneraPolozaj = new Tocka(0, 0.718582888, 0);
			Tocka veneraHitrost = new Tocka(0, 1.179672797,0);
			Planet venera = new Planet(veneraPolozaj, veneraHitrost, prazna, veneraMasa/sonceMasa, "venera");
			
			double zemljaMasa = 5.97*Math.pow(10, 24);
			Tocka zemljaPolozaj = new Tocka(-0.707106781, 0.707106781, 0);
			Tocka zemljaHitrost = new Tocka(-0.707106781, -0.707106781, 0);
			Planet zemlja = new Planet(zemljaPolozaj, zemljaHitrost, prazna, zemljaMasa/sonceMasa, "zemlja");
			
			double marsMasa = 0.642*Math.pow(10, 24);
			Tocka marsPolozaj = new Tocka(-1.523395722, 0, 0);
			Tocka marsHitrost = new Tocka(-0.810202603, 0,0);
			Planet mars = new Planet(marsPolozaj, marsHitrost, prazna, marsMasa/sonceMasa, "mars");
			
			double jupiterMasa = 1898*Math.pow(10, 24);
			Tocka jupiterPolozaj = new Tocka(1, 0, 0);
			Tocka jupiterHitrost = new Tocka(0, 1.2, 0);
			Planet jupiter = new Planet(jupiterPolozaj, jupiterHitrost, prazna, jupiterMasa/sonceMasa, "jupiter");

			double saturnMasa = 568*Math.pow(10, 24);
			Tocka saturnPolozaj = new Tocka(1, 0, 0);
			Tocka saturnHitrost = new Tocka(0, 1.2, 0);
			Planet saturn = new Planet(saturnPolozaj, saturnHitrost, prazna, saturnMasa/sonceMasa, "saturn");

			double uranMasa = 86.8*Math.pow(10, 24);
			Tocka uranPolozaj = new Tocka(1, 0, 0);
			Tocka uranHitrost = new Tocka(0, 1.2, 0);
			Planet uran = new Planet(uranPolozaj, uranHitrost, prazna, uranMasa/sonceMasa, "uran");

			double neptunMasa = 102*Math.pow(10, 24);
			Tocka neptunPolozaj = new Tocka(1, 0, 0);
			Tocka neptunHitrost = new Tocka(0, 1.2, 0);
			Planet neptun = new Planet(neptunPolozaj, neptunHitrost, prazna, neptunMasa/sonceMasa, "neptun");


			Tocka soncePolozaj = new Tocka(0, 0, 0);
			Tocka sonceHitrost = new Tocka(0, 0, 0);
			Planet sonce = new Planet(soncePolozaj, sonceHitrost, prazna, 1, "sonce");

			ArrayList<Planet> planeti = new ArrayList<Planet>();
			planeti.add(sonce);
			planeti.add(merkur);
//			planeti.add(venera);
			planeti.add(zemlja);
//			planeti.add(mars);
//			planeti.add(jupiter);
//			planeti.add(saturn);
//			planeti.add(uran);
//			planeti.add(neptun);
			Okno okno = new Okno(planeti);
			okno.pack();
			okno.setVisible(true);
			okno.pozeni();
		}
		else if (a.getActionCommand()=="Sistem2"){
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
		
	}
	

}
