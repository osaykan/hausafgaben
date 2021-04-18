package day09_odev;

import java.util.Scanner;

public class Hausaufgabe5 {

	public static void main(String[] args) {
		// 	//Kullanıcıdan A, B, C, D harﬂerinden birini alın eğer harf C ise ekrana “Doğru cevap�? yazdırın. 
		//A, B, D den biri ise ekrana “Yanlış cevap�? yazdırın. Bu harﬂerin dışındaki harﬂer için “Geçersiz cevap şıkkı�? yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen \" A,B,C,D\" harflerinden birini seciniz.");
         char harf = scan.next().charAt(0);
         
         char harf1 = Character.toUpperCase(harf);
         
         
         switch(harf1){
         
             case 'A' :
             System.out.println("Yanlis cevap");
             break;
             

             case 'B' :
             System.out.println("Yanlis cevap");
             break;
             

             case 'D' :
             System.out.println("Yanlis cevap");
             break;
             

             case 'C' :
             System.out.println("Dogru cevap");
             break;
         
         default:
        	 System.out.println("Gecersiz Cevap Sikki");
             
             
             
         }
		
		
		scan.close();
		
		
	}

}
