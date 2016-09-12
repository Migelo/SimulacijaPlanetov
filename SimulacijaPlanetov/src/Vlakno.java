import java.awt.Graphics;


public  class Vlakno {
	
	private Okno okno;
	private Platno platno;
	private Stanje stanje;
    private Thread simulacija;
    private Racunanje algoritem = new Racunanje();
    private int dt;
    public boolean prekiniAlgoritem;

    
    public Vlakno(Stanje stanje, Platno platno) {
    	super();
    	this.stanje = stanje;
    	this.platno = platno;
    	this.okno = okno;
//    	Graphics g;

    }
    

    
    public void narediVlakno() throws InterruptedException {
    	ustaviVlakno();
    	simulacija = new Thread(new Runnable() {
			@Override
			public void run() {
				prekiniAlgoritem = false;
				pozeniVlakno();
				simulacija = null;
			}
		});
    	simulacija.start();
    }
    
    public void pozeniVlakno() {
//    	stanje = 
    	dt = 0;
    	while(Thread.currentThread() == simulacija) {
    		if (dt % 20 == 0) {
    			try {
    				Thread.sleep(8);
    			} catch(InterruptedException e) {}
    			for (Planet planet : stanje.planeti){
    				Racunanje.naslednjiKorak(planet, "rk", 0.001); 
//    				System.out.print(planet);
    			}
    			platno.narisiPlanete(g, stanje);
    		}

        	if (prekiniAlgoritem == true) {
        		break;
        	}
			dt++;
        }
    }
    
    public void ustaviVlakno() throws InterruptedException {
    	prekiniAlgoritem = true;
    	if (simulacija != null) {
    		simulacija.join();
    	}
    }
}

