package odevNo1;

public class Kare extends Sekil{
	
	private double kareKenari;
	
	public Kare(double kareKenari) {
		this.kareKenari = kareKenari;
	}
	
	@Override
	public void ciz() {
		System.out.println("Bir kenarı " + kareKenari + " olan kare ");
		for (int i = 0; i < (int) kareKenari; i++) {
            for (int j = 0; j < (int) kareKenari; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
		
	}

	@Override
	public double alanHesapla() {
		return kareKenari * kareKenari;
	}
	

}
