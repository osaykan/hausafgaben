package day10_odev;

import java.util.Scanner;

public class Hausaufgabe6 {
	
	public static void main(String[] args){


         //6)Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini büyük harf olarak ekrana yazdırın.

		 Scanner scan = new Scanner(System.in);
         System.out.println("Hangi Ülkede yasiyorsunuz");
         String land = scan.nextLine();
         land = land.toUpperCase().trim();
        
         
        int length = land.length();
        System.out.println(land.charAt(1));
        System.out.println(land.charAt(length-2));


		
		scan.close();
	}

}
