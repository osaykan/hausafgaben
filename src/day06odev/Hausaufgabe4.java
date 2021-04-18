package day06odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
		// 4) Kullanicidan iki sayi alin eger sayilarin isaretleri ayni ise ekrana Ayni
		// isaretli yazdirin.
		// Sayilarin isaretleri farkli ise ekrana Farkli isaretli yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen birinci sayiyi giriniz...");
		double sayi1 = scan.nextDouble();

		System.out.println("Lutfen Ikinci sayiyi Giriniz...");
		double sayi2 = scan.nextDouble();

		if (sayi1 * sayi2 == 0) {
			System.out.println("Lütfen sifirdan farkli bir sayi giriniz");

		}

		else if (sayi1 * sayi2 > 0) {
			System.out.println("Ayni isaretli");

		} else if (sayi1 * sayi2 < 0) {
			System.out.println("Sayilar farkli isaretli");

		}

		scan.close();
	}
	
}
