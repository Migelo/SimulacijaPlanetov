import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar implements ActionListener{
	
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
			okno.pozeni();
		}
		
	}
	

}
