package day14_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		// 
		//5)	Kullanıcıya bir String girmesini söyleyin ve
		//      bu String’in ilk harfi ile son harfi aynı ise ekrana	“Simetrik�? yazdırın.
		//     Aynı değilse tekrar bir String girmesini isteyin.

		Scanner scan = new Scanner(System.in);
		
		String str ="";
		do{
			System.out.print("Lütfen bir kelime giriniz: ");
			str = scan.next().toLowerCase();
			
			if(str.charAt(0)!=str.charAt(str.length()-1)){
				System.out.println("Tekrar....... ");
			}
			
			
		}while(str.charAt(0)!=str.charAt(str.length()-1));
		System.out.println("Simetrik");



		scan.close();

	}

}
