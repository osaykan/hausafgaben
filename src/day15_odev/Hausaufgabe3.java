package day15_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		//3)	Kullaniciya sayi girmesini söyleyin. 
		//     Kullaicinin girdigi sayinin rakamlari toplamini ekrana yazdiran bir program yazin.

       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen bir sayi giriniz");
        int num = scan.nextInt();
   //    int sum= 0;  //int sum altta tanimlanabilirdi
        rakamToplami(num);
scan.close();	
	}
	public static void rakamToplami (int num){   //int sum burada tanimlanirsa parantez icine yazilmaz
		int sum =0;
		do{
			sum = sum+num%10;
			num = num/10;
			
		}while(num!=0);
		System.out.println("Girilen sayinin rakamlar toplami: "+sum);
		
	}

}
