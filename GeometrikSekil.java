package odevNo1;

import java.util.Scanner;

public class GeometrikSekil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner scanner = new Scanner(System.in);
	    int secim=0;
	    
		do {
			try {
				
			System.out.println("\n****** Geometri Şekil Menüsü ******");
            System.out.println("1) KARE");
            System.out.println("2) DİKDÖRTGEN");
            System.out.println("3) PARALELKENAR");
            System.out.println("4) SİLİNDİR");
            System.out.println("5) KONİ");
            System.out.println("6) KÜP");
            System.out.println("7) ÇIKIŞ BUTONU");
            
            System.out.print("Bir seçenek seçiniz: ");
            secim = scanner.nextInt();
            
            if(secim==1) {
            	
            	System.out.println(" *** KARE *** ");
            	System.out.println("Karenin bir kenarını giriniz: ");
            	double kareKenari = scanner.nextDouble();
            	if( sifirdanKucukEsitMidir (kareKenari)) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {
            		Kare kare = new Kare(kareKenari);
                    kare.ciz();
                    System.out.println("Alan: " + kare.alanHesapla());
            		
            	}
           
            }
            else if(secim==2) {
            	
            	System.out.println(" *** DİKDÖRTGEN *** ");
            	System.out.println("Dikdörtgenin uzun kenarını giriniz: ");
            	double uzunKenar = scanner.nextDouble();
            	System.out.println("Dikdörtgenin kısa kenarını giriniz: ");
            	double kisaKenar = scanner.nextDouble();
            	
            	if( sifirdanKucukEsitMidir ( kisaKenar ) || sifirdanKucukEsitMidir ( uzunKenar )) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {
            		Dikdortgen dikdortgen = new Dikdortgen(uzunKenar , kisaKenar);
                    dikdortgen.ciz();
                    System.out.println("Alan: " + dikdortgen.alanHesapla());
                
            	}
            
            }
            else if(secim==3) {
            	
            	System.out.println(" *** PARALELKENAR *** ");
            	System.out.println("Paralelkenarın tabanını giriniz: ");
            	double taban = scanner.nextDouble();
                System.out.print("Paralelkenarın yüksekliğini giriniz: ");
                double yukseklik = scanner.nextDouble();
                
                if( sifirdanKucukEsitMidir (taban) || sifirdanKucukEsitMidir (yukseklik)) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {
            		 Paralelkenar paralelkenar = new Paralelkenar(taban , yukseklik);
                     paralelkenar.ciz();
                     System.out.println("Alan: " + paralelkenar.alanHesapla());
            		
            	}
               
            	
            	
            	
            }
            else if(secim==4) {
            	
            	System.out.println(" *** SİLİNDİR *** ");
            	System.out.println("Silindirin yarıçapını giriniz: ");
            	double yaricap = scanner.nextDouble();
            	System.out.println("Silindirin yüksekliğini giriniz: ");
            	double yukseklik = scanner.nextDouble();
            	
            	if( sifirdanKucukEsitMidir (yaricap) || sifirdanKucukEsitMidir (yukseklik) ) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {
            		Silindir silindir = new Silindir(yaricap , yukseklik );           	
                	System.out.println("Alan: " + silindir.alanHesapla());
                	System.out.println("Alan: " + silindir.hacimHesapla());
         
            	}
            	
            
            }
            else if(secim==5) {
            	
            	System.out.println(" *** KONİ *** ");
            	System.out.println("Koninin yarıçapını giriniz: ");
            	double yaricap = scanner.nextDouble();
            	System.out.println("Koninin eğik kenar uzunluğunu giriniz: ");
            	double egikKenarUzunlugu = scanner.nextDouble();
            	System.out.println("Koninin yüksekliğini giriniz: ");
            	double yukseklik = scanner.nextDouble();
            	
            	if( sifirdanKucukEsitMidir (yaricap) ||  sifirdanKucukEsitMidir (egikKenarUzunlugu) ||  sifirdanKucukEsitMidir (yukseklik)) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {
            		Koni koni = new Koni(yaricap , egikKenarUzunlugu , yukseklik );
                	System.out.println("Alan: " + koni.alanHesapla());
                	System.out.println("Hacim: " + koni.hacimHesapla());
                
            	}
            	
            	
            }
            else if(secim==6) {
            	
            	System.out.println(" *** KÜP *** ");
            	System.out.println("Küpün bir kenarını giriniz: ");
            	double kenar = scanner.nextDouble();
            	
            	if( sifirdanKucukEsitMidir (kenar)) {
            		
            		sifirdanKucukDegerUyarisi();
            	}
            	else {

                	Kup kup = new Kup(kenar);
                	System.out.println("Alan: " + kup.alanHesapla());
                	System.out.println("Hacim: " + kup.hacimHesapla());
                	
            		
            	}
            	
            }
            else if(secim==7) {
            	System.out.println("**** SİSTEMDEN ÇIKIŞ YAPILDI **** ");
            
            }
            else {
            	System.out.println(" ! geçersiz bir değer girdiniz ! TEKRAR DENEYİNİZ ");

            }
			    
			} catch (Exception exceptionObject) {
            	System.out.println(" ! geçersiz bir değer girdiniz ! TEKRAR DENEYİNİZ ");

			    //try-catch blokları, Java'da beklenmedik durumlarla (istisnalar) karşılaştığımızda programımızın 
				//çökmesini engellemek için kullanılan önemli bir mekanizmadır.Bu sayede programımız daha sağlam ve kullanıcı dostu hale gelir.
			} 
			
		  
		}
		while (secim != 7);
	
	}
	    static boolean  sifirdanKucukEsitMidir(double girdi) {
		int result = Double.compare( girdi , 0);
		return result<=0;
		
		}
	    static void sifirdanKucukDegerUyarisi() {
	    	System.out.println("Kenar uzunluğu sıfırdan büyük olmalıdır!!");
	    	
	    }

}
