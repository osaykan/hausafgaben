package day13_odev;

import java.util.Scanner;

public class Hausaufgabe2 {

	public static void main(String[] args) {
		// Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz.

//2)	Kullanıcıdan başlangıç ve bitiş	değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten
		//3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		System.out.print("Baslangic degerini giriniz: ");
		int num1 = scan.nextInt();
		
		System.out.print("Bitis degerini giriniz: ");
		int num2 = scan.nextInt();
		
		             //for loop ile
		
		if(num1<=num2){                 
			for(int i=num1;i<=num2;i++){
				if(i%15==0){
					System.out.print(i+" ");
				}	
			}
		}else{
			for(int i =num1; i>=num2;i--){
				if(i%15==0){
					System.out.print(i+" ");
				  }	
			   }
		}
               
		
		System.out.println(" ");
		
		System.out.println("While ile yazdirin");
		
		
		if(num1<=num2){                     //baslangic kücükse
			int i=num1;
			while(i<=num2){
				if(i%15==0){
					System.out.print(i+" ");
				}i++;
				
			}
			
		}else{                          //Baslangic büyükse
			int i =num1;
			while(i>=num2){
				if(i%15==0){
					System.out.print(i+" ");
					
				}i--;
				
			}
			
		}
		
		scan.close();
		
	}

}
