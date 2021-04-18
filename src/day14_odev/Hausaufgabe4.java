package day14_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
		//4)	Kullanıcıya iki sayı girmesini söyleyin. 
		//     Bu sayılar eşit ise ekrana “Kare oluşturdunuz�? yazdırın.
		//     Eşit değilse tekrar iki sayı girmesini söyleyin.
       Scanner scan = new Scanner(System.in);
     
       int num1;
      
       int num2;
       
       do{
    	   
    	   System.out.print("Lütfen ilk sayiyi  giriniz: ");
    	   num1 = scan.nextInt();

    	   System.out.print("Lütfen ikinci sayiyi  giriniz: ");    	  
    	   num2 = scan.nextInt();
    	   
    	   System.out.println();  //Bosluk birakmak icin
 
    	   if(num1!=num2){
    		   System.out.println("Sayilari tekrar giriniz..");
    	   }
    	   
    	  
       }while(!(num1==num2));
       System.out.println("Kare olusturdunuz..");

	}

}
