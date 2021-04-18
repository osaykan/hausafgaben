package day22odev;

import java.util.Arrays;

public class Afg04 {

	public static void main(String[] args) {
		// Bir string olusturunuz.Bu stringteki characterleri yukaridan asagiya for each loop kullanarak yazdiriniz.
		//ip ucu split()
		
		String str ="Hergün planli calis";
		String arr[] = str.split("");
		System.out.println(Arrays.toString(arr));
		
		for(String w:arr){
			System.out.println(w);
			
		}

	}

}
