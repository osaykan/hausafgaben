package day07_odev;

import java.util.Scanner;

public class Hausaufgabe1 {

	public static void main(String[] args) {
		// Nested if() Statement Soruları 
		//1)Kullanicidan cinsiyetini girmesini isteyin.
       // Erkek ise yasini kontrol edin. Yasi 18 den kücük ise ekrana  Erkek çocuk yazdirin. Yasi 18 den büyük esit ise ekrana Adam yazdirin.
		//Kadin ise yasini kontrol edin. Yasi 18 den kücük ise ekrana Kiz cocuk yazdirin. Yasi 18 den büyük esit ise ekrana Kadin yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte Ihr Geschleckt ein");
		String geschleckt = scan.next();
		System.out.println("Geben Sie bitte Ihr Alter ein");
		int alter = scan.nextInt();
		
		if(geschleckt.equalsIgnoreCase("mänlich")){
			
			     if(alter<18 && alter>=0){
				  System.out.println("Sie sind ein Junge");
				
			    }else if(alter>= 18){
				   System.out.println("Sie sind ein Mann");
				
		        }else{
				   System.out.println("Sie haben falsches Alter gegeben");
			     }
			
			
		}else if(geschleckt.equalsIgnoreCase("weiblich")){
			
			   if(alter<18 && alter>=0){
				  System.out.println("Sie sind ein Mädchen..");
				  
			   }else if(alter>=18){
				  System.out.println("Sie sind eine Frau");
				
			   }else{
				   System.out.println("Sie haben falsches Alter gegeben.....");
			}
			
		}else{
			System.out.println("Sie haben falsche Geschleckt gegeben..");
			
		}
			
		
		
		
scan.close();
	}
}


