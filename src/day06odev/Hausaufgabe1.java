package day06odev;

import java.util.Scanner;

public class Hausaufgabe1 {

	public static void main(String[] args) {
		// 1) Kullanıcıdan bir tamsayı alın eğer tamsayı 3 ile bölünebiliyorsa ekrana
		// “3’ün katı�? yazdırın.
		// 3 ile bölünemiyorsa ekrana “3’ün katı değildir�? yazdırın.

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Lütfen  üc basamakli bir sayi girin.."); ........alttaki
		 * daha kis ve genel int sayi = sc.nextInt(); int birler = sayi%10; int onlar =
		 * (sayi/10)%10; int yüzler = sayi/100;
		 */
		System.out.println("Lütfen bir sayi giriniz..");
		int sayi = sc.nextInt();

		if (sayi % 3 == 0) {
			System.out.println("3`ün kati");

		} else {
			System.out.println("3`ün kati degildir");
		}

		sc.close();
	}

}
