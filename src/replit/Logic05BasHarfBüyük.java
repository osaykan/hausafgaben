package replit;

import java.util.Scanner;

public class Logic05BasHarfB�y�k {
	/*
	 * Girilen metindeki t�m kelimelerin ilk harflerini b�y�k yapiniz.(diger
	 * harflere dokunmayin, b�y�kse b�y�k, k�c�kse k�c�k kalsin).
	 * 
	 * Ornek makeTitle("Bu bir basliktir") Bu Bir Basliktir
	 * 
	 * makeTitle("t�m ilk harfler b�y�k olacak") T�m Ilk Harfler B�y�k Olacak
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
