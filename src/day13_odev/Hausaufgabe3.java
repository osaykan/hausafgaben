package day13_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		// Aşağıdaki soruları hem for loop hem de while loop kullanarak çözünüz.

		
		//3)	Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);
		System.out.print("Pozitif bir tam sayi giriniz: ");
		int num = scan.nextInt();
		
		     // for loop ile
		for(int i =1; i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// While ile yazdir
		
		int i = 1;
		while(i<=num){
			if(num%i==0){
				System.out.print(i +" ");
				
			}i++;
			
		}




scan.close();

	}

}
