package day14_odev;

import java.util.Scanner;

public class Ubung1 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int carpim = 1;
		do{
			System.out.print("Sifirdan farkli bir deger giriniz: ");
			num = scan.nextInt();
			carpim = carpim*num;
			
			
			
			
		}while(!(num==1));
		
		System.out.println("Girilen sayilarin carpimi: " + carpim);

	}

}
