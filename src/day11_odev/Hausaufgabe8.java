package day11_odev;

import java.util.Scanner;

public class Hausaufgabe8 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Enter the firs value");
//		int num1 = scan.nextInt();
//		System.out.println("Enter the second value");
//		int num2 = scan.nextInt();
//		
//		
//		for (int i=num1;i<=num2;i++) { ...................................
//		if (i%3==0)                      ....................................
//			System.out.print(i+" ");
//		}
//		scan.close();	
		
		
//	Scanner scan= new Scanner(System.in);
//		
//		System.out.print("Please enter the first int : ");..........................
//		int num1 = scan.nextInt();
//		
//		System.out.print("Please enter the second int : "); .........................
//		int num2 = scan.nextInt();
//		
//		int sum = 0;
//		for (int i=num1;i<num2;i++) {
//			sum=sum+i;
//			
//		}
//		System.out.println(num1+" ve "+num2+" arasindaki tum sayilar toplami : "+sum);
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter a starting number");
//		int num1=scan.nextInt();
//		System.out.println("Enter a ending number");
//		int num2=scan.nextInt();
//		
//		
//		int num=num1%2!=0? num1+1: num1;.....................................................
//		
//		for (int i=num; i<=num2;i=i+2) {
//		System.out.println(i);
//	}
		
//		
//	    int tribleStart = start%3==0 ? start : (start+1)%3 == 0 ? start+1 : start+2;
//		
//		for (int i = tribleStart ; i>= tribleStart && i<=end;i+=3) {
//			
//			System.out.print(i+" ");

//
//       Scanner scan = new Scanner(System.in);
//        
//        System.out.println("Geben Sie bitte Ihren Anfangsbustaben  ein");
//        char a  = scan.next().toUpperCase().charAt(0);                     .................................................
//        
//        
//        System.out.println("Geben Sie bitte Ihren Endsbustaben  ein");
//        char e  = scan.next().toUpperCase().charAt(0);             .......................................................
//        
//        for(char bustaben =a; bustaben<=e; bustaben++) {
//            System.out.println("Bustaben = "+ bustaben );
//        }
//		
//		
//		  if(num1%3==2) {
//	            num1+=1 ;
//	        }else if (num1%3==1) {
//	            num1 +=2 ;
//	        }else {
//	            num1+=0 ;
//	        }for(int i=num1 ; i<=num2 ; i+=3) {
//	            System.out.print(i+" ");
//	        }
//	        sc.close();

//		      Scanner scan = new Scanner(System.in);
//	           System.out.println("Lutfen tam sayi olarak bir baslangic degeri girin.");
//				int start = scan.nextInt();
//
//				System.out.println("Lutfen tam sayi olarak bitis degeri girin.");
//				int stop = scan.nextInt();
//             
//				for (; start < stop; start++) {                        ..........................................
//					if (start % 3 == 0) {
//						System.out.print(start+" ");
//					}
//				}


//		Scanner scan = new Scanner (System.in);
//		System.out.println("Baslangic sayisi giriniz");
//		int num1 = scan.nextInt();
//		System.out.println("Bitis sayisi giriniz");
//		int num2 = scan.nextInt();
//		
//		int result = num1%3==0 ? num1 : (num1%3==1? num1+2 : num1+1);   ............................................
//		System.out.println();
//		for(int i= result; result<=num2; result+=3){
//			
//			System.out.print(result+" ");
//		}

	Scanner scan = new Scanner(System.in);
		
		System.out.println("baslangic degerini giriniz : ");
		int bas = scan.nextInt();
		
		System.out.println("bitis degerini giriniz : ");
		int bitis = scan.nextInt();
		
		for (int i= bas ;i<bitis;i+=3 ) {
			if (i%3==0) {
			System.out.print(" "+ i);
			}else 
				System.out.print(" " +(i+2));
			}

		
		
		
		scan.close();
		
	}
}

