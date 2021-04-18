package replit;

import java.util.Scanner;

public class Logic04IngilizceSayiOkuma {
	/*
	 * Girilen sayinin ingilizce yazilisini return eden bir method yaziniz.
	 * 
	 * Örnek
	 * 
	 * numToEng(0) zero
	 * 
	 * numToEng(18) eighteen
	 * 
	 * numToEng(126) one hundred twenty six
	 * 
	 * numToEng(909) nine hundred nine
	 */
	private static final String[] hundretNames = { "", " hundred", " hundred", " hundred", " hundred", " hundred",
			" hundred", " hundred", " hundred", " hundred" };
	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };
	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };
	static String result;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		System.out.println(sayi);

		System.out.println(numToEng(sayi));

	}

	public static String numToEng(int sayi) { // 987

		if (sayi > 19 && sayi < 1000) {
			int yüzler = sayi / 100; // 9
			String yüzlerbasamagi = numberNames[yüzler] + hundretNames[yüzler];
			sayi = sayi % 100; // 87
			int onlar = sayi / 10; // 8
			String onlarBasamagi = tensNames[onlar];
			sayi = sayi % 10;
			String birlerBasamagi = numberNames[sayi];

			result = yüzlerbasamagi + onlarBasamagi + birlerBasamagi;
			return result;
		} else if (sayi > 0 && sayi <= 19) {
			result = numberNames[sayi];
			return result;
		} else if (sayi == 0) {
			String result = "zero";
			return result;
		}
		return result;
	}

}
