package day10_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {


        //3)	Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		
              Scanner scan = new Scanner(System.in);
              System.out.println("Adinizi giriniz");
              String ad = scan.nextLine();
              
              System.out.println("Soyadinizi giriniz");
              String soyad = scan.nextLine();

                ad = ad.toUpperCase();
               soyad = soyad.toUpperCase();
              
               ad = ad.trim();
               soyad = soyad.trim();

              
              
             System.out.println(ad.charAt(0));
             System.out.println(soyad.charAt(0));

scan.close();
	}

}
