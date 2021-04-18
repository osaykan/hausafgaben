package day14_odev;

import java.util.Scanner;

public class Hausaufgabe2 {
	

	public static void main(String[] args) {

		// 2)	Kullanıcıdan baslangıc ve bitis	degerlerini alın ve
		//baslangıc degerinden baslayıp bitis degerinde biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic degerini giriniz: ");
		int num1=scan.nextInt();
		
		System.out.print("Lütfen bitis degerini giriniz: ");
		int num2 = scan.nextInt();
		
       if(num1<=num2){
        do{
        	
        	if(num1%12==0){
        		System.out.print(num1+" ");
        	}num1++;
        	
        }while(num1<=num2);
       }else{
    	   System.out.println("Baslangic degeri bitis degerinden büyük olamaz.");
       }
		
		scan.close();
		
	}

}
