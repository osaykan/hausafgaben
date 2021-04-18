package day13_odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
		// 6)Kullanıcıdan bir String alın ve bu String’in icinde “a�? harfi varsa “a�? harfinin ilk görünümünün indexini ekrana yazdırın.
		//“a�? harfi yoksa ekrana “a harfi yok�? yazdırın.
		
		   Scanner    scan = new Scanner(System.in);
	        System.out.println("Bir cümle giriniz: ");
	        String str = scan.nextLine();
	    
	 
	    
	    if(str.contains("a")){
	    	System.out.println("'a' harfinin ilk gorunum indexi: " +str.indexOf('a'));
	    }else{
	    	System.out.println("a harfi yok");
	    }

scan.close();
	}

}
