package day13_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
	
	//	5)	Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek ekrana yazdırın.
	//	Ornegin; Kullanıcı “Java�? girerse ekrana “aavJ�? yazdıracaksınız.

        Scanner    scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String str = scan.nextLine();
    
     int i =str.length();
              System.out.println(str.charAt(i-1)+str.substring(1, i-1)+str.charAt(0));         

              
              
             scan.close();
	}

}
