package day08_odev;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		// 1) Kullanıcıdan bir tamsayı girmesini isteyin, 
		//tamsayı çift ise ekrana “Çift�? tek ise ekrana “Tek�? yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Tamsayi giriniz..");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "Cift" : "Tek";
		System.out.println(result);
		
		
	
		
scan.close();
	}

}
