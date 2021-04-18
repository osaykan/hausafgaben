package replit;

import java.util.HashMap;
import java.util.Map;

public class Logic08TekrarEdenHarfSayisi {
	/*
	 * String icindeki birden fazla gecen karakter sayisini bulan program yaziniz.
	 * Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettigi icin bu String icin
	 * sonuc 1 olacak. Eger herhangi tekrar eden bir harf yoksa 0 sayisini döndersin
	 * program.
	 * 
	 * Ornekler: duplicates("Hello World!") Cikti : 2 duplicates("foobar") Cikti : 1
	 * duplicates("helicopter") Cikti : 1
	 */

	public static void main(String[] args) {
		String str = "Merhabablalar";
		Map<Object, Object> harf1 = new HashMap<Object, Object>();

		for (int i = 0; i < str.length(); i++) {
			if (!harf1.containsKey(str.charAt(i))) {
				harf1.put(str.charAt(i), 1);
			} else {
				int count = (int) harf1.get(str.charAt(i));
				harf1.put(str.charAt(i), count + 1);
			}
		}
		System.out.println(str);
		System.out.println(harf1);
		System.out.println(harf1.keySet());
		System.out.println(harf1.values());
		System.out.println(harf1.entrySet());
		int flag = 0;
		for (int i = 2; i < harf1.size(); i++) {
			// OLMADIIIIIIIIIIIIII
		}
		// System.out.println(flag);
	}

}
