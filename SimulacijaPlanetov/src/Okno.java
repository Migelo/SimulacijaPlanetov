import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Okno extends JFrame {

	/**
	 Prikazno okno našega programa z vsemi gumbi, menuji in platnom.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Platno platno;

	/**
	 * Create the frame.
	 */
	public Okno(Stanje stanje) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		contentPane.setLayout(new MigLayout("", "[500px][39.00]", "[67px,grow][bottom]"));
//
//		
		JPanel panel = new Platno(stanje);
//		contentPane.add(panel, "cell 0 0, grow");
//		
//		JButton btnPlay = new JButton("Play");
//		contentPane.add(btnPlay, "flowx,cell 0 1, alignx left, growy");
//		
//		JButton btnPause = new JButton("Pause");
//		contentPane.add(btnPause, "cell 0 1, alignx left, growy");
//		
//		JButton btnStop = new JButton("Stop");
//		contentPane.add(btnStop, "cell 0 1, alignx left, growy");

//		btnPlay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
	}

}
