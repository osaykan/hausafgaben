package day10_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {

//		2)	Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adinizi  giriniz");
      String ad = scan.nextLine();
      
      System.out.println("Lütfen soyadinizi giriniz");
      String soyad = scan.nextLine();
      
       ad = ad.trim();
       soyad = soyad.trim();
      
      System.out.println("Adiniz  " +ad.length() +" harften olusmaktadir");
      System.out.println("Soyadiniz  "+soyad.length()+" harften olusmaktadir");




scan.close();


	}

}
