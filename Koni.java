package odevNo1;

public class Koni extends UcBoyutluSekil{
	
		private double yaricap;
	    private double egikKenarUzunlugu;
	    private double yukseklik;
	    private double tabanAlani = yaricap * yaricap * Math.PI;

	    public Koni(double yaricap, double egikKenarUzunlugu, double yukseklik) {
	        this.yaricap = yaricap;
	        this.egikKenarUzunlugu = egikKenarUzunlugu;
	        this.yukseklik = yukseklik;
	    }

	    @Override
	    public void ciz() {
	        System.out.println("Yarıçap uzunluğu: " + yaricap + ", Eğik kenar uzunluğu: " + egikKenarUzunlugu + ", Yüksekliği: " + yukseklik + " olan bir Koni ");
	    }

	    @Override
	    public double alanHesapla() {
	        double tabanAlani =  yaricap * yaricap * Math.PI;
	        double yanAlan = Math.PI * yaricap * egikKenarUzunlugu;
	        return tabanAlani + yanAlan;
	    }

	    @Override
	    public double hacimHesapla() {
	    	  double tabanAlani = yaricap * yaricap * Math.PI;
	          return  (tabanAlani * yukseklik)/3;
	    }
	}



