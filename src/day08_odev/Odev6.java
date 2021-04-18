package day08_odev;

import java.util.Scanner;

public class Odev6 {

	public static void main(String[] args) {
		//6)Kullanıcıdan bir yıl girmesini isteyin,
		//yıl artık yıl ise ekrana “Artık yıl�? degilse ekrana “Artık yıl degil�? yazdırın

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Yil giriniz..");
		int year = scan.nextInt();

		String result = (year%400==0)||(year%4==0 && year%100!=0) ? "Artik Yil" : "Artik Yil Degil" ;  //( year%100==0 && year%400==0) esittir  year%400==0. Ayni anlama gelir
		System.out.println(result);
		
		
		
		scan.close();
	}

}
