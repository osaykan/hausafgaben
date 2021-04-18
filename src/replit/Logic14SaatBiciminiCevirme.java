package replit;

import java.util.Scanner;

public class Logic14SaatBiciminiCevirme {
	/*
	 * Yazilan saati diger saat bicimine ceviriniz. Eger yazilan saat 12 saatlik
	 * bicimde yazilmissa (örnegin 06:00 pm), 24 saatlik bicime ceviriniz. Eger
	 * yazilan saat 24 saatlik bicimde yazilmissa (örnegin 19:30), 12 saatlik bicime
	 * ceviriniz.
	 * 
	 * 
	 * Examples zamaniCevir("12:00 am") ==> "0:00"
	 * 
	 * zamaniCevir("6:20 pm") ==> "18:20"
	 * 
	 * zamaniCevir("21:00") ==>"9:00 pm"
	 * 
	 * zamaniCevir("5:05") ==> "5:05 am"
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Zamani yaziniz : ");
		String zaman = scan.next();

		System.out.println(zamaniCevir(zaman));

	}

	public static String zamaniCevir(String zaman) {

		if (zaman.contains("pm")) {
			zaman = zaman.substring(0, zaman.length() - 2);

			String dakika = zaman.substring(zaman.length() - 3);
			int saat = Integer.parseInt(zaman.substring(0, zaman.length() - 3)) + 12;
			zaman = saat + "" + dakika;

			return zaman;
		} else if (zaman.contains("am")) {
			zaman = zaman.substring(0, zaman.length() - 2);
			return zaman;

		} else {
			int saat = Integer.parseInt(zaman.substring(0, zaman.length() - 3));
			String dakika = zaman.substring(zaman.length() - 3);

			if (saat < 12) {
				return zaman + "am";
			} else {
				return (saat - 12) + dakika + "pm";
			}
		}

	}

}
