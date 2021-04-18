package day14_odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
		// 6)	Kullanıcıdan bir String alın ve
		//     bu String’in icinde “a�? harfi varsa ekrana “a harfi var�? yazdırın.
		//    “a�? harfi yoksa tekrar bir String girmesini isteyin.

     	Scanner scan = new Scanner(System.in);
		
		String str ="";
		
		do{
			System.out.println("Lütfen bir kelime giriniz.");
			str = scan.nextLine().toLowerCase();
			
		}while(!(str.contains("a")));
           System.out.println("a harfi var");
           
           
           scan.close();
	}

}
