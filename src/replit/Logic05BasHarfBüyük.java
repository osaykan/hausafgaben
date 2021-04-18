package replit;

import java.util.Scanner;

public class Logic05BasHarfBüyük {
	/*
	 * Girilen metindeki tüm kelimelerin ilk harflerini büyük yapiniz.(diger
	 * harflere dokunmayin, büyükse büyük, kücükse kücük kalsin).
	 * 
	 * Ornek makeTitle("Bu bir basliktir") Bu Bir Basliktir
	 * 
	 * makeTitle("tüm ilk harfler büyük olacak") Tüm Ilk Harfler Büyük Olacak
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(makeTitle(s));

	}

	public static String makeTitle(String s) {
		String result = "";
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";

		}

		return result;
	}
}
