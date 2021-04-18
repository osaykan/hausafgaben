package day11_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		
		//4)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen baslangic degerini giriiz..");
		int num1 = scan.nextInt();
		
		System.out.println("Lütfen bitis degerini giriniz..");
		int num2 = scan.nextInt();
		
		int sum = 0;
		if(num1<=num2){
			for(int i = num1; i<=num2; i++){
				sum = sum+i;
				
			}System.out.println(sum);
		}else{
			for(int i = num1;i>=num2;i--){
				sum=sum+i;
			}System.out.println(sum);
		}
		
	scan.close();	
		
	}

}
