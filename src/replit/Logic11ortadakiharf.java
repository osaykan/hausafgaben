package replit;

import java.util.Scanner;

public class Logic11ortadakiharf {
	/*
	 * Ortadaki harfi alabilecegimiz bir program yazin. Eger harf sayisi 2 nin
	 * katina esitse, ortadaki 2 harfi alin, diger durumda ortadaki 1 harfi alin.
	 * 
	 * Examples
	 * 
	 * ortadakiHarf("test") Cikti : es ortadakiHarf("testing") Cikti : t
	 * ortadakiHarf("middle") Cikti : dd ortadakiHarf("A") Cikti : A
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime yaziniz : ");
		String kelime = scan.next();

		System.out.println(ortadakiHarf(kelime));

	}

	public static String ortadakiHarf(String kelime) {

		if (kelime.length() % 2 == 1) {
			int a = kelime.length() / 2;
			String orta = kelime.substring(a, a + 1);
			return orta;
		} else if (kelime.length() % 2 == 0) {
			int b = kelime.length() / 2;
			String orta = kelime.substring(b - 1, b + 1);
			return orta;
		} else {
			return null;
		}

	}

}
