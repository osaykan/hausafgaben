package day12_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {
	//	2)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve
	//  	başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.

	Scanner scan = new Scanner(System.in);
	System.out.print("Lütfen baslangic degerini giriniz: ");
	int num1 = scan.nextInt();
	
	System.out.print("Lütfen bitis degerini giriniz: ");
	int num2 = scan.nextInt();
	
	if(num1>num2){
		System.out.println("Baslangic degeri bitis degerinden kücük olmali");
	}else{
		
		int i = num1;
		while(i<=num2){
			System.out.print(i+" ");
			i++;
		}
	}
	
		
		
		scan.close();
	}

}
