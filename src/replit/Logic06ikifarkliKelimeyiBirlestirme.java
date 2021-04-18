package replit;

import java.util.Scanner;

public class Logic06ikifarkliKelimeyiBirlestirme {
	/*
	 * Iki farkli kelimeyi birlestirip, ilk harfini b�y�k kalan harfleri k�c�k yapan
	 * bir method yaziniz.
	 * 
	 * Ornekler getKelime("kal", "em") ? "Kalem" getWord("g�zl", "emlemek") ?
	 * "G�zlemlemek" getWord("zor", "luk") ? "Zorluk"
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk kelimeyi giriniz : ");
		String ilk = scan.next();

		System.out.println("Ikinci kelimeyi giriniz : ");
		String iki = scan.next();

		System.out.println(getKelime(ilk, iki));
	}

	public static String getKelime(String ilk, String iki) {

		String result = ilk.substring(0, 1).toUpperCase() + ilk.substring(1).toLowerCase() + iki.toLowerCase();

		return result;
	}

}
