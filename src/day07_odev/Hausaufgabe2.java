package day07_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {
		// //2)Kullanicidan bir harf girmesini isteyin.
		//Girdiği küçük harf ise harfin a olup olmadigini kontrol edin.
		//Harf a ise ekrana Ilk kücük harf yazdirin. a degil ise ekrana Ilk kücük harf degil yazdirin. 
		//Girdigi büyük harf ise harfin Z olup olmadigini kontrol edin. Harf Z ise ekrana Son büyük harf yazdirin.
		//Z degil ise ekrana Son büyük harf değil yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte einen Buchstabe ein.");
		char buchstabe = scan.next().charAt(0);
		
		if(buchstabe>=97 && buchstabe<=122){
			if(buchstabe=='a'){
				System.out.println("Erst kleiner Buchstabe");
				
			}else if(buchstabe!='a'){
				System.out.println("Kein erst kleiner Buchstabe");
				
			}
			
		}else if(buchstabe>=65 && buchstabe<=90 ){
			if(buchstabe=='Z'){
				System.out.println("Ende großer Buchstabe");
			}else if(buchstabe!='Z'){
				System.out.println("Kein ende großer Buchstabe");
				
			}
			
		}else{
			System.out.println("Sie haben keinen Buchstaben gegeben");
		}
		
		
		scan.close();	
}
}