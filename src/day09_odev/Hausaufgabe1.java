package day09_odev;

import java.util.Scanner;

public class Hausaufgabe1 {

	public static void main(String[] args) {
		//1.  Kullanıcıdan bir gun alın eğer gun “Cuma�? ise ekrana “Müslümanlar için kutsal gün�? yazdırın.
		//“Cumartesi�? ise ekrana “Yahudiler için kutsal gün�? yazdırın.
		//“Pazar�? ise ekrana  “Hıristiyanlar için kutsal gün�? yazdırın.
		//Diler günler icin “Kutsal gün değil�? yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Gün giriniz");
		String gün = scan.next();
		
		gün = gün.toLowerCase();
		
		
		
		
		switch(gün){
		    case "cuma" :
		    	System.out.println("Müslümanlar icin kutsal gün..");
			    break;
		
		    case "cumartesi" :
		    	System.out.println("Yahudiler icin kutsal gün..");
			    break;
		
			    
		    case "pazar" :
		    	System.out.println("Hiristiyanlar icin kutsal gün..");
			    break;
		
		default:
			System.out.println("Kutsal gün degil");
		
		
		}
		
		
		
		
		scan.close();

	}

}
