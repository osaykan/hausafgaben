package day08_odev;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		//4)Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		//En ve boy eşit ise ekrana “Kare�? farklı ise ekrana “Dikdörtgen�? yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin enini  giriniz..");
		double num1 = scan.nextDouble();
		

		System.out.println("Dikdörtgenin boyunu  giriniz..");
		double num2 = scan.nextDouble();

		
		String result = num1>0 && num2>0 ? (num1==num2 ? "Kare"  : "Dikdörtgen"): "Yanlis deger girdiniz" ;
		
		System.out.println(result);
	
		
		scan.close();
		
	}

}
