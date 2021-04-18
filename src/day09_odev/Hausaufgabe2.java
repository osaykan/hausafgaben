package day09_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {
		//2.   Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u�? dan biri ise ekrana “Sesli harf�? yazdırın.
		//“b, c, d, f�? den biri ise ekrana “Sessiz harf�? yazdırın.
		//Bu harflerin dışında bir character için “Geçersiz character�? yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		
	char harf1 = Character.toLowerCase(harf);
	
	
	switch(harf1){
	
	        case 'a' :
	          System.out.println("Sesli Harf");
	        break;
	        
	        case 'e' :
		          System.out.println("Sesli Harf");
		        break;
	        
	        case 'i' :
		          System.out.println("Sesli Harf");
		        break;
	        
	        case 'o' :
		          System.out.println("Sesli Harf");
		        break;
	        
	        case 'u' :
		          System.out.println("Sesli Harf");
		        break;
		        
	        case 'b' :
		          System.out.println("Sessiz Harf");
		        break;
		        
	        case 'c' :
		          System.out.println("Sessiz Harf");
		        break;
		        
	        case 'd' :
		          System.out.println("Sessiz Harf");
		        break;
		        
	        case 'f' :
		          System.out.println("Sessiz Harf");
		        break;
		        
	      
		        default:
		        	System.out.println("Gecersiz Character");
	        
	        
	        
	        
	        
	
	}
	
	scan.close();
		
	}

}
