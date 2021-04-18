package day15_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {

		//2)	Kullanicidan iki sayi alin bu sayilar esit ise ekrana "Esit",
		//birinci sayi büyük ise ekrana "Birinci sayi büyük", ikinci sayi büyük ise ekrana "Ikinci sayi büyük" yazdiriniz.

            Scanner scan = new Scanner(System.in);
            System.out.print("Birinci sayiyi giriniz: ");
            int num1 = scan.nextInt();
            System.out.print("Ikinci sayiyi giriniz: ");
            int num2 = scan.nextInt();
            
	kontrol(num1,num2);
	scan.close();
	}

	
	public static void kontrol(int num1,int num2){
		if(num1==num2){
			System.out.println("Esit ");
			
		}else if(num1>num2){
			System.out.println("Birinci sayi büyük");
			
		}else{
			System.out.println("Ikinci sayi büyük  ");
		}
		
		
	}
	
}
