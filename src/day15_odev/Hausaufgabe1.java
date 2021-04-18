package day15_odev;

import java.util.Scanner;

public class Hausaufgabe1 {

	public static void main(String[] args) {
	//	1)	Kullanicidan isim ve soyismini alin. 
		//Kullanicinin isim ve soyisminin ilk harflerini büyük diger harflerini küçük harf olarak ekrana yazdiran programi yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi girin");
		String isim = scan.nextLine().toLowerCase();
		System.out.println("Lütfen Soy isminizi girin");
		String soyisim = scan.nextLine().toLowerCase();
		
		dönüstürücü(isim,soyisim);
scan.close();
	}
	public static void dönüstürücü(String isim,String soyisim){
		
		isim=isim.toUpperCase().charAt(0)+isim.substring(1);   //isim.substring(1, isim.length())bunun yerine
		 soyisim = soyisim.toUpperCase().charAt(0)+soyisim.substring(1);
		 
		System.out.println("Yeni isim: "+isim);   
		System.out.println("Yeni soyisim: "+soyisim);
		
		
	}

}
