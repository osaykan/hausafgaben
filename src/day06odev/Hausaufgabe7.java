package day06odev;

import java.util.Scanner;

public class Hausaufgabe7 {

	public static void main(String[] args) {
		// Kullanicidan bir tam sayi alin. Eger tam sayi 10 dan k�c�kse ve sifir dan
		// b�y�kesit se ekrana "Rakam" yazdirin.Diger durumlarda "SAyi" yazdirin

		Scanner sc = new Scanner(System.in);

		System.out.println("L�tfen bir Tamsayi Giriniz...");

		int num = sc.nextInt();

		if (num >= 0 && num < 10) {
			System.out.println("Rakam");

		} else {
			System.out.println("Sayi");
		}

		sc.close();
	}

}
