package odevNo1;

public class Kup extends UcBoyutluSekil{
	
		private double kenar;

	    public Kup(double kenar) {
	        this.kenar = kenar;
	    }

	    @Override
	    public void ciz() {
	        System.out.println("Kenar uzunluğu: " + kenar + " olan bir Küp ");
	        //for ile çizdir
	    }

	    @Override
	    public double alanHesapla() {
	        return 6 * kenar * kenar;
	    }

	    @Override
	    public double hacimHesapla() {
	        return kenar * kenar * kenar;
	    }
	}



