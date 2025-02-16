package odevNo1;

public class Dikdortgen extends Sekil {
	
	private double uzunKenar;
	private double kisaKenar;
	
	public Dikdortgen(double uzunKenar,  double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }
	
	@Override 
    public void ciz() {
		/*if (uzunKenar <= 0 || kisaKenar <= 0) {
		    throw new IllegalArgumentException("Kenar uzunlukları pozitif olmalıdır.");
		}*/
		
        System.out.println("Uzun kenarı: " + uzunKenar +", Kısa kenarı: " + kisaKenar + " olan bir Dikdörtgen ");
        for (int i = 0; i < (int) uzunKenar; i++) {
            for (int j = 0; j < (int) kisaKenar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public double alanHesapla() {
        return uzunKenar * kisaKenar;
    }
}


