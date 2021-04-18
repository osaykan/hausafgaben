package day13_odev;

import java.util.Scanner;

public class Hausaufgabe7 {

	public static void main(String[] args) {
		// //Kullanicidan bir String alin ve bu Stringi ekrana tersten yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle veya kelime giriniz..");
		String str = scan.nextLine();
		
		
		for(int i = str.length()-1;i>=0;i--){
			
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		
		System.out.println("While ile cözüm....");
		
		int i=str.length()-1;
		 while(i>=0){
			 System.out.print(str.charAt(i));
			 i--;
		 }
				
	}

}
