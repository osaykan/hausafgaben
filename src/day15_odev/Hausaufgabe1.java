package day15_odev;

import java.util.Scanner;

public class Hausaufgabe1 {

	public static void main(String[] args) {
	//	1)	Kullanicidan isim ve soyismini alin. 
		//Kullanicinin isim ve soyisminin ilk harflerini b�y�k diger harflerini k���k harf olarak ekrana yazdiran programi yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen isminizi girin");
		String isim = scan.nextLine().toLowerCase();
		System.out.println("L�tfen Soy isminizi girin");
		String soyisim = scan.nextLine().toLowerCase();
		
		d�n�st�r�c�(isim,soyisim);
scan.close();
	}
	public static void d�n�st�r�c�(String isim,String soyisim){
		
		isim=isim.toUpperCase().charAt(0)+isim.substring(1);   //isim.substring(1, isim.length())bunun yerine
		 soyisim = soyisim.toUpperCase().charAt(0)+soyisim.substring(1);
		 
		System.out.println("Yeni isim: "+isim);   
		System.out.println("Yeni soyisim: "+soyisim);
		
		
	}

}
