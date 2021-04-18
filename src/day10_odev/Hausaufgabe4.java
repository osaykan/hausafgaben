package day10_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {

   //4)	Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdırın.
		//Diğer ülkeler için ise NA yazdırın.

        Scanner scan = new Scanner(System.in);
         System.out.println("Hangi Ülkede yasiyorsunuz");
         String land = scan.nextLine();
         land = land.toLowerCase();
         
         land = land.trim();
         
         switch(land){
             case "amerika" :
               System.out.println("USA");
               break;
             
             case "ingilter" :
            	System.out.println("UK");
                break;
             
             case "almanya" :
            	 System.out.println("DE");
            	 break;
            	 
             default:
            		 System.out.println("NA");
            	 
            	 
            	 
         }



scan.close();
	}

}
