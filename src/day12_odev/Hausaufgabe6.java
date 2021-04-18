package day12_odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
	//	6)	Kullanıcıdan başlangıç ve bitiş	harflerini alın ve
	//      başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic harfini giriniz: ");
		char harf1 = scan.next().toUpperCase().charAt(0);
		
		System.out.print("Lütfen bitis harfini giriniz: ");
		char harf2 = scan.next().toUpperCase().charAt(0);
		
		char ch=harf1 ;
		while(ch<=harf2){
			
			System.out.print(ch+" ");
			
			ch++;
		}
		scan.close();
	}

}
