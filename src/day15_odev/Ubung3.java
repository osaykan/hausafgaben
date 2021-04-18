package day15_odev;

import java.util.Scanner;

public class Ubung3 {

	public static void main(String[] args) {
		  //do_while kullanarak bir oyun tasarlayın
        //Kullanıcıya sayı girmesini söyleyin. 
       //Kullanıcının girdiği sayının rakamları toplamın ciftse "KAZANDINIZ",tekse "KAYBETTINIZ" 
	   //yazdıran bir program yazın.

	//	Scanner scan = new Scanner(System.in);
		oyun();
		
	}

	public static void oyun() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen bir tam sayi giriniz: ");
		int num = scan.nextInt();
		int sum = 0;
		
		do{
			sum=sum+num%10;
			num/=10;
	
		}while(num!=0);
		if(sum%10==0){
			System.out.println("Kazandiniz");
		}else{
			System.out.println("Kaybettiniz");
		}
		scan.close();
	}
	
}
