package day06odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		// Kullanicidan bir character alin eger character bir harf ise ekrana Harf
		// yazdirin. Diger durumlarda ekrana Harf degil yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Karakter Giriniz");

		char karakter = scan.next().charAt(0);

		/*
		 * int deger = karakter;
		 * 
		 * if(deger>=65 && deger<=90|| deger>=97&&deger<=122){
		 * System.out.println("Girdiginiz karakter bir Harf tir...");
		 * 
		 * }else{ System.out.println("Girdiginiz karakter bir Harf degil..."); }
		 * 
		 */
		boolean kontrol = Character.isAlphabetic(karakter);

		if (kontrol == true) {
			System.out.println("Harf");

		} else {
			System.out.println("Harf degil");
		}

		scan.close();
	}
	
}
