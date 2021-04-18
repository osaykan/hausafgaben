package day06odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
		// Kullanicidan bir ücgenin uc kenar uzunlugunu alin. Eger üc kenar uzunlugu
		// birbirine esit ise ekrana "Eskenar ücgen" diger durumlarda "Eskenar degil"
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ücgenin 1.kenar uzunlugunu Giriniz");
		double kenar1 = scan.nextDouble();

		System.out.println("Lütfen ücgenin 2.kenar uzunlugunu Giriniz");
		double kenar2 = scan.nextDouble();

		System.out.println("Lütfen ücgenin 3.kenar uzunlugunu Giriniz");
		double kenar3 = scan.nextDouble();

		if (kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Eskenar Ucgen");

		} else {
			System.out.println("Eskenar Degil");
		}

		scan.close();
	}

}
