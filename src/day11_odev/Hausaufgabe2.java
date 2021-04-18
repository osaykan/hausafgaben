package day11_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {
		// 1)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen baslangic degerini giriiz..");
		int num1 = scan.nextInt();
		
		System.out.println("Lütfen bitis degerini giriniz..");
		int num2 = scan.nextInt();
		
		if(num1<=num2){
			for(int i = num1; i <= num2; i++){
				System.out.print(i+" ");
				
			}
			
		}else{
			for (int i = num1; i>=num2;i--){
				System.out.print(i+" ");
			}
			
		}
		
		scan.close();

	}

}
