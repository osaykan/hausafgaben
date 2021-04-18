package replit;

public class Logic07KelimmedekiEksikHarf {
	/*
	 * Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz.
	 * (Ingilizce alfabeye göre). Eger herhangi atlanan bir harf yoksa
	 * "Sirali Harfler" yazdiralim.
	 * 
	 * 
	 * Ornekler
	 * 
	 * kayipHarfler("abdefg") Cikti : c
	 * 
	 * kayipHarfler("mnopqs") Cikti : r
	 * 
	 * kayipHarfler("abcdefgh") Cikti : Sirali Harfler
	 */

	public static void main(String[] args) {
		String str = "abdefg";
		System.out.println("Cikti : " + kayipHarfler(str));

	}

	public static String kayipHarfler(String str) {
		String y = "";
		String result = "";
		int count = 0;

		for (char i = str.charAt(0); i <= str.charAt(str.length() - 1); i++) {// 96 97 98 99 100 101 102
			y += i + "";
		}
		for (int i = 0; i < y.length(); i++) {
			if (!str.contains(y.substring(i, i + 1))) {
				result += y.substring(i, i + 1);
				count++;
			}

		}
		if (count != 0) {
			return result;
		} else {
			result = "Sirali Harfler";
			return result;
		}
	}

}
