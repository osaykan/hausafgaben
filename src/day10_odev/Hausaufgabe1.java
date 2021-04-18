package day10_odev;

import java.util.Scanner;

public class Hausaufgabe1 {
	
	public static void main(String[] args){
		
//		1)	Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu rakamlarını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kart numarasini giriniz");
        String num = scan.next();
        int lng = num.length();
        
       System.out.println("Kartnumaranizin 3.rakami : "+num.charAt(2));
       System.out.println("Kartnumaranizin 4.rakami : "+num.charAt(3));
       
       System.out.println("Kartnumaranizin son rakami : "+num.charAt(lng-1));
		
		
		
		
		scan.close();
	}
	

}
