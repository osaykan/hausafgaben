package day08_odev;

import java.util.Scanner;

public class Odev5 {
	public static void main(String[] args){
		
		
		//5)Kullanıcıdan bir tamsayı girmesini isteyin,
				//o tamsayı 3 basamaklı ise ekrana “3 Basamaklı�? yazdırın.
				//3 basamaklı degilse çift olup olmadigini kontrol edin.
				//Çift ise “3 basamaklı olmayan çift sayı�? yazdırın. 
				//Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.�?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Tamsayi giriniz..");
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000)||(num<-99 && num>-1000) ? "3 Basamakli" : (num%2==0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ")  ;
		
		System.out.println(result);
		
		
		scan.close();
	}

}
