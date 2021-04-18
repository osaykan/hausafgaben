package day15_odev;

import java.util.Scanner;

public class Ubung1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int num =(int)(Math.random() * 100);
		System.out.println("Bilgisayar: "+num);
		System.out.println("Lutfen 0 ile 100 arasinda bir sayi tahmin edin.");
		int tahmin = scan.nextInt();
		
		
		sayiTahmini(num, tahmin);
		
		scan.close();
	}
	
	public static void sayiTahmini (int num, int tahmin ) {
		
		int deneme = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			if (num < tahmin) {
				System.out.println("Asagi in");
				tahmin = scan.nextInt();
			} else if (num > tahmin) {
				System.out.println("Yukari cik");
				tahmin = scan.nextInt();
			}
			deneme++; 
		} while (num != tahmin);
		
		System.out.println("Tebrikler bildiniz!" + deneme + " denemede tahmin ettiniz. Puaniniz = " + (100 - deneme * 10));
		scan.close();
	}


	}


