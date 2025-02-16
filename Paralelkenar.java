package odevNo1;

public class Paralelkenar extends Sekil{
	
	    private double taban;
	    private double yukseklik;

	    public Paralelkenar(double taban, double yukseklik) {
	        this.taban = taban;
	        this.yukseklik = yukseklik;
	    }

	    @Override
	    public void ciz() {
	        System.out.println("Tabanı: " + taban + ", Yüksekliği: " + yukseklik + " olan bir Paralelkenar ");
	        for (int i = 0; i < (int) yukseklik; i++) {
	        	if(i!=0) {
	        		for(int k = 0 ; k<i ; k++) {
	        			System.out.print(" ");

	            	}
	        		
	        	}
	        	
	            for (int j = 0; j < (int) taban; j++) {
	          
	            	
	                System.out.print("* ");
	            }
	        	
	        	System.out.println();
	        }
	        
	    }

	    @Override
	    public double alanHesapla() {
	        return taban * yukseklik;
	    }
	}



