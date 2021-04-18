package day11_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		
		//2)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın
		//ve başlangıç değerinden veya sonrasından başlayıp bitiş değerinde veya öncesinde	biten tüm çift tamsayıları ekrana yazdırın.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen baslangic degerini giriiz..");
		int num1 = scan.nextInt();
		
		System.out.println("Lütfen bitis degerini giriniz..");
		int num2 = scan.nextInt();
		
		if(num1<=num2){
			for(int i =num1;i<=num2;i++){
				if(i%2==0){
					System.out.print(i+" ");
				}
				
			}
			
		}else{
			for(int i =num1;i>=num2;i--){
				 if(i%2==0){
					 System.out.print(i+" ");
				 }
			}
		}
		
		
		scan.close();

	}

	}
