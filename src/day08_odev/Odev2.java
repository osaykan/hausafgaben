package day08_odev;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		//2)Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ilk Tamsayi giriniz..");
		int num1 = scan.nextInt();
		

		System.out.println("Lütfen ikinci Tamsayi giriniz..");
		int num2 = scan.nextInt();
		
		
		int result = num1>=num2 ? num1 : num2 ;
		
		System.out.println("Büyük sayi : " +result);
		
		
	scan.close();	
	}

}
