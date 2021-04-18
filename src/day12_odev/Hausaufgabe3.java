package day12_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
	//	3)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve 
	//  	başlangıç değerinden veya sonrasından başlayıp bitiş değerinde veya öncesinde biten
	//   	tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.


		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerini giriniz: ");
		int num1 = scan.nextInt();
		
		System.out.print("Lütfen bitis degerini giriniz: ");
		int num2 = scan.nextInt();
		
		int i = num1;
		//Baslangic degeri bitis degerinden büyükse
		if(num1>num2){
			   while(i>=num2){
				   if(i%2==0){
					   System.out.print(i+" ");
				   }i--;
				   
			   }
			
		}else{            //Baslangic degeri kücükse
			
			while(i<=num2){
				if(i%2==0){
					System.out.print(i+" ");
				}i++;
				
			}
		}

//		int result =num1%2==0 ? num1: (num1+1);
//		while(result<=num2){
//			System.out.print(result+" ");
//		result+=3;	
//		}
//	
  scan.close();
	}

}
