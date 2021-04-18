package day12_odev;

import java.util.Scanner;

public class Hausaufgabe7 {

	public static void main(String[] args) {
//		7)	Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
//		Ornegin kullanıcı 3 girerse;
//		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir rakam giriniz: ");
		
		int rakam = scan.nextByte();
		
	for(int i =1; i<11;i++){
		System.out.print(rakam+"x"+i+"=" + rakam*i+"  ");
	}
	System.out.println("");
	
		System.out.println("While ile carpim tablosu");
		
		int i = 1;
		while(i<=10){
			System.out.print(rakam+"x"+i+"=" + rakam*i+"  ");
			i++;
			
		}
		
		
	scan.close();	
		
	}

}
