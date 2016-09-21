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
			okno.ustavi();
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
