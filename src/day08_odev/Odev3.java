package day08_odev;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {

		//3)Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Tamsayi giriniz..");
		int num = scan.nextInt();
		
		
		int result = num>=0 ? num : -num ;
		
		System.out.println(num +" sayisinin mutlak degeri " +result+ " `e esittir");
		
		
scan.close();
	}

}
