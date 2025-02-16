package odevNo1;

public class Silindir extends UcBoyutluSekil {
	
	    private double yaricap;
	    private double yukseklik;
	    private double yanalAlan;

	    public Silindir(double yaricap , double yukseklik ) {
	        this.yaricap = yaricap;
	        this.yukseklik = yukseklik;
	        
	    }

		@Override
	    public void ciz() {
	        System.out.println("Yarıçapı: " + yaricap + ", Yüksekliği: " + yukseklik + " olan bir Silindir ");
	    }

	    @Override
	    public double alanHesapla() {
	    	double yanalAlan = 2 * Math.PI * yukseklik ;
	        return  (2* Math.PI * yaricap * yaricap) +  yanalAlan ;
	    }

	    @Override
	    public double hacimHesapla() {
	        return Math.PI * yaricap * yaricap * yukseklik;
	    }
	}

	
	


