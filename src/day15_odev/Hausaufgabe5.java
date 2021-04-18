package day15_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {

	//	5)	Kullaniciya bir String girmesini söyleyin ve bu String’i yukaridan asagiya dogru yazdiran Program yaziniz.
      //     Ornegin; CAN ==> C
	//	                      A
	//	                      N
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir kelime girin: ");
		String str = scan.nextLine();
	
		
		
           kontrol(str);
		
scan.close();
	}
	
	public static void kontrol (String str){
		
	
		int a = 0;
	
		
		while(a<str.length()){
			System.out.println(str.toUpperCase().charAt(a));
			a++;
		}
		
		
		
		
	}

}
