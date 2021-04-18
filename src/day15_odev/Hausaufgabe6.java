package day15_odev;

import java.util.Scanner;

public class Hausaufgabe6 {

	public static void main(String[] args) {
	//	6)	do_while kullanarak bir oyun tasarlayın
	Scanner scan = new Scanner(System.in);
	int  ran = (int)(Math.random()*100);
	// System.out.println("Bilgisayarin sectigi sayi: "+ran);
	
	System.out.print("0 dan 100 e kadar bir sayi giriniz: ");
	int tahmin =scan.nextInt();
	
	
	 
	 oyun(tahmin,ran);	
	
	scan.close();
		  
	  }
	
	public static void oyun(int tahmin,int ran){
		Scanner scan = new Scanner(System.in);
	
		 
		
		
		  int deneme =0;
		  
		  do{
			  if(tahmin>ran){
				  System.out.println("Azalt");
				  tahmin = scan.nextInt();
			  }else if(tahmin<ran){
				  System.out.println("Artir");
				  tahmin = scan.nextInt();
			  }
			  
			  deneme++;
		  }while(tahmin!=ran);
		  int puan = 100-deneme*10;
	System.out.println("Tebrikler "+deneme+" denemede bildiniz ve "+ puan+ " puan kazandiniz.");
scan.close();	
	}
	
	
}
