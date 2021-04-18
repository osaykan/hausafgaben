package day13_odev;

import java.util.Scanner;

public class Hausaufgabe8 {

	public static void main(String[] args) {
		// // Kullanicidan bir sayi alin ve tersini ekrana yazdirin
		//Bu sayinin tersinin 2 fazlasini ekrana yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Zahl ein..");
		String str = scan.next();
		 int length = str.length();
		 int i = length-1;
	String ters= "";
		
	  while(i>=0){
		  ters = ters+str.charAt(i);
		  i--;
	  }

	  int terssayi = Integer.valueOf(ters);
	  terssayi+=2;
	  System.out.println(terssayi);
	  
		 
//			String ters = "";                          //int sum = 0;
//			
//			for(int i = num.length()-1;i>=0;i--){
//				ters =ters+ num.charAt(i)+ "";         //char i stringe cevirmek icin sonuna + "" ekledik   sum=sum+i
//				
//			}
////			System.out.println(ters);
//	        
//			int tersInt = Integer.valueOf(ters);
//			tersInt = tersInt+2;
//			System.out.println(tersInt);
	}

}
