package day15_odev;

import java.util.Scanner;

public class Ubung2 {

	public static void main(String[] args) {
		// ODEV 3 SAYIYI STRİNG ALARAK 
		//Kullaniciya sayi girmesini söyleyin. 
		// Kullanıcının girdiği sayının rakamları toplamını ekrana  yazdıran bir program yazın
	
		// Kullanıcıya sayı girmesini söyleyin. 
		// Kullanıcının girdiği sayının rakamları toplamını ekrana  yazdıran bir program yazın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		String str = scan.nextLine();
		int sum = 0;
		rakamlarTopla (str,sum);
		scan.close();
	}
	public static void rakamlarTopla (String str, int sum ) {
		
		for (int i=0; i<=str.length()-1;i++) {
			sum = sum + Integer.valueOf(str.substring(i, i+1));
		}
		System.out.println(sum); 	
		
	}


	}


