package replit;

import java.util.Arrays;

public class Logic12Arraybirlestirme {
	/*
	 * Iki farkli Array'i birlestiren bir program yaziniz.
	 * 
	 * Ornekler:
	 * 
	 * birlestir([1, 3, 5], [2, 6, 8]) Cikti : [1, 3, 5, 2, 6, 8]
	 * 
	 * birlestir([7, 8], [10, 9, 1, 1, 2]) Cikti : [7, 8, 10, 9, 1, 1, 2]
	 * 
	 * birlestir([4, 5, 1], [3, 3, 3, 3, 3]) Cikti : [4, 5, 1, 3, 3, 3, 3, 3]
	 */

	public static void main(String[] args) {
		int[] birinciArray = { 1, 5, 9 };
		int[] ikinciArray = { 7, 15, 3, 7, 12 };

		System.out.println(Arrays.toString(birlestir(birinciArray, ikinciArray)));

	}

	public static int[] birlestir(int[] birinciArray, int[] ikinciArray) {
		int x = birinciArray.length + ikinciArray.length;
		int[] birlesik = new int[x];

		for (int j = 0; j < birinciArray.length; j++) {
			birlesik[j] = birinciArray[j];
		}
		for (int i = 0; i < ikinciArray.length; i++) {
			birlesik[i + birinciArray.length] = ikinciArray[i];

		}

		return birlesik;

	}

}
