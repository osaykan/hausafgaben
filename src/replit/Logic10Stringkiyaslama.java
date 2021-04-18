package replit;

import java.util.Scanner;

public class Logic10Stringkiyaslama {
	/*
	 * Yazilan iki String'den ikincisi, birincisinin son harflerine esitse, true,
	 * diger durumda false dönderen bir program yaziniz.
	 * 
	 * Ornekler: kontrolEt("abc", "bc") ==> true kontrolEt("abc", "d") ==> false
	 * kontrolEt("samurai", "zi") ==> false kontrolEt("feminine", "nine") ==> true
	 * kontrolEt("convention", "tio") ==> false
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ilk kelimeyi girin : ");
		String ilk = scan.next();

		System.out.println("Ikinci kelimeyi girin : ");
		String iki = scan.next();

		System.out.println(kontrolEt(ilk, iki));

	}

	public static boolean kontrolEt(String ilk, String iki) {

		int ikilength = iki.length();
		int ilklength = ilk.length();
		if (ilklength < ikilength) {
			return false;
		}
		if (ilk.substring(ilklength - ikilength).equals(iki)) {
			return true;
		} else {
			return false;
		}

	}

}
