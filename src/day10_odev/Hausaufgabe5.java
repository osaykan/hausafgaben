package day10_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
	//	5)	Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.

		   Scanner scan = new Scanner(System.in);
	         System.out.println("Hangi Ülkede yasiyorsunuz");
	         String land = scan.nextLine();
	         land = land.toUpperCase();
	         land = land.trim();
	         
	         System.out.print(land.charAt(0));
	         System.out.print(land.charAt(1));
	         
		scan.close();
	}

}
