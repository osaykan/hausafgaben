package day11_odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
		
		//5)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen baslangic degerini giriiz..");
		int num1 = scan.nextInt();
		
		System.out.println("Lütfen bitis degerini giriniz..");
		int num2 = scan.nextInt();
		
		int product = 1;
		if(num1<=num2){
			for(int i = num1; i<=num2; i++){
				product = product*i;
				
			}System.out.println(product);
		}else{
			for(int i = num1;i>=num2;i--){
				product=product*i;
			}System.out.println(product);
		}
		
	scan.close();
		
	}

}
