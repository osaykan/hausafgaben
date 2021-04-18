package day07_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		// //3)Kullanicidan password girmesini isteyin.
        // Girdigi password 5 e bölünüyorsa son rakamini kontrol edin.
		//Son rakami 0 ise ekrana 5 e bölünen cift sayı yazdirin. Son rakami 0 degil ise 5 e bölünen tek sayi yazdirin.
		//Girdigi password 5 e bölünmüyorsa ekrana Tekrar deneyin yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Password");
		int password = scan.nextInt();
		
		if(password%5==0){
			if(password%10==0){
				System.out.println("5 ile bölunen cift sayi");
				
			}else if(password%10!=0){
				System.out.println("5 e bölünen tek sayi");
				
			}
			
		}else{
			System.out.println("Tekrar deneyin");
		}
scan.close();
}
}
