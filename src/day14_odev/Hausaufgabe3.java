package day14_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		// 3)	Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu tüm sayıların toplamını yazdırınız.
	//	Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın



		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int toplam = 0;
		
		do{
			System.out.print("Bir sayi giriniz: ");
			num = scan.nextInt();
			toplam = toplam + num;
			
		}while(!(num==0));
		System.out.println("Girilen sayilarin toplami: "+ toplam);
		
		

	
		
		
		scan.close();
		
	}

}
