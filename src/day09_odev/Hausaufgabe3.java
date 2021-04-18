package day09_odev;

import java.util.Scanner;

public class Hausaufgabe3 {

	public static void main(String[] args) {
		//3.   Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı�? yazdırın.
		//99 ise ekrana “İki basamaklı en büyük sayı�? yazdırın.
		//999 ise ekrana “Üç basamaklı en büyük sayı�? yazdırın.
		//Bu sayıların dışındaki sayılar için “Yorum yok�? yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Tam sayi giriniz");
		int num = scan.nextInt();

		switch(num){
		    
		    case 9 :
			    System.out.println("Bir basamaklı en büyük sayı");
		     break;
		
		     
		    case 99 :
			    System.out.println("Iki basamaklı en büyük sayı");
		     break;
		     
		    case 999 :
			    System.out.println("Üc basamaklı en büyük sayı");
		     break;
		     
		default:
			System.out.println("Yorum yok");
		
		}
		
		scan.close();
		
	}

}
