package day11_odev;

import java.util.Scanner;



public class Hausaufgabe7 {

	public static void main(String[] args) {
		
		//6)	Kullanıcıdan başlangıç ve bitiş	harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen baslangic harfini giriniz : ");
		char harf1 = scan.next().toUpperCase().charAt(0);
				
		System.out.print("Lütfen bitis harfini giriniz : ");
		char harf2 = scan.next().toUpperCase().charAt(0);
		
		if((harf1>='A'&&harf1<='Z')&&(harf2>='A' && harf2<='Z')){
			
		
		    	if(harf1<=harf2){
			for(char i = harf1; i<=harf2;i++){
				
				System.out.print(i+" ");
				
			}
			
		}else{
              for(char i = harf1; i>=harf2;i--){
				
				System.out.print(i+" ");
              		
          }
		}
		}else{
			System.out.println("Baslangic ve bitis harf olmali");
		}
		

	scan.close();
	
	}

}
