package day12_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
	//	4)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerini giriniz: ");
		int num1 = scan.nextInt();
		
		System.out.print("Lütfen bitis degerini giriniz: ");
		int num2 = scan.nextInt();
		
		int sum = 0;
		int i = num1;
		
		if(num1<=num2){                  //Baslangic degeri kücükse
			 while(i<=num2){
				 sum =sum+i;
				 i++;
				 
			 }System.out.println("Toplam: "+sum+" ");
			
		}else{                           //Baslangic degeri büyükse
			 while(i>=num2){
				 sum =sum+i;
				 i--;
				 
			 }System.out.println("Toplam: "+sum+" ");
			
			
		}
	
		scan.close();
		
	}

}
