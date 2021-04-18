package day13_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
		
		//Aşağıdaki soruları String methodlarını kullanarak çözünüz.


		//4)	Kullanıcıdan uzunluğu çift sayı olan bir String alın ve
		//      bu String’in ilk yarısını ekrana yazdırın.
		//      Ornegin; Kullanıcı “Hollanda�? girerse ekrana “Holl�? yazdıracaksınız.

          Scanner    scan = new Scanner(System.in);
           System.out.println("Uzunlugu cift sayi olan bir kelime giriniz: ");
           String str = scan.nextLine();
        int i = str.length();
        if(i%2==0){
        	System.out.println(str.substring(0, i/2));
        	
        }else{
        	System.out.println("Lütfen uzunlugu cift sayi olan bir kelime giriniz..");
        }
        
          
scan.close();
	}

}
