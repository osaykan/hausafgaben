package day15_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
		//4)	Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
		//  Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Ücgen,dikdörtgen ve paralelkenar kelimelerinden birini seciniz:  ");
         String art = scan.nextLine().toLowerCase();
       
         System.out.println("Iki sayi seciniz: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
       
          
         
         kontrol(art,num1,num2);
          
   scan.close();       
          

	}
	
	public static void kontrol(String art, double num1,double num2){   //void yerine double olsaydi yazdirma isi yukarda syso(kontrol(..)
	
		
		switch(art){
		case "dikdörtgen":
			System.out.println("Dikdörtgenin  alani: " + num1*num2);
			System.out.println("Dikdörtgenin cevresi: " +2*(num1+num2));
			break;
		
		case "paralelkenar":
			 
			System.out.println("Lütfen ilk kenara ait yüksekligi giriniz: ");
			Scanner scan = new Scanner(System.in);
			double h = scan.nextDouble();
			System.out.println("Paralelkenar'in alani: " + num1*h);
			System.out.println("Ücgenin cevresi: " +2*(num1+num2));
			break;
			
			
		case "ücgen":
			Scanner scan1 = new Scanner(System.in);
               
			 System.out.println("Ücüncü kenar uzunlugunu giriniz");
	        	double num3 = scan1.nextDouble();
			
			
			System.out.println("Lütfen ilk girdiginiz uzunluga ait yüksekligi  giriniz");
		        	 double h1  = scan1.nextDouble();
		        	
			System.out.println("Ücgenin  alani: " + (num1*h1)/2);
			System.out.println("Ücgenin cevresi: " +(num1+num2+num3));
			break;
			
		default:
			System.out.println("Yanlis secim yaptiniz...");
		
		
		}
	
	}

}
