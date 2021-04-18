package day12_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		//5)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerini giriniz: ");
		int num1 = scan.nextInt();
		
		System.out.print("Lütfen bitis degerini giriniz: ");
		int num2 = scan.nextInt();
		
		int product = 1;
		int i = num1;
		
		if(num1<=num2){                  //Baslangic degeri kücükse
			 while(i<=num2){
				 product =product*i;
				 i++; 
			 }System.out.println("Carpim: "+product+" ");
			
		}else{                           //Baslangic degeri büyükse
			 while(i>=num2){
				 product =product*i;
				 i--;
			 }System.out.println("Carpim: "+product+" ");
			
			
		}
		

	scan.close();
	}

}
