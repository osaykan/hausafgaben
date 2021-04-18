package day06odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		// 3) Kullanicidan bir gun alin eger gun Cuma ise ekrana Müslümanlar icin kutsal
		// gün yazdirin.
		// Cumartesi ise ekrana Yahudiler icin kutsal gün yazdirin.
		// Pazar ise ekrana Hiristiyanlar icin kutsal gün yazdirin
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir gün giriniz");
		String gün = sc.nextLine();

		if (gün.equalsIgnoreCase("Cuma")) { // Büyük kücük harf dikkate almiyor. cuma Cuma CUMA ayni kabul edilir
			System.out.println("Müslümanlar icin kutsal gün..");

		} else if (gün.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün..");

		} else if (gün.equalsIgnoreCase("Pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");

		} else {
			System.out.println("Kutsal gün degil");
		}
		sc.close();
	}
}

