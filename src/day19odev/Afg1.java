package day19odev;

import java.util.Arrays;
import java.util.Scanner;

public class Afg1 {

	public static void main(String[] args) {
		// Soru:
		// Kullaniciya kac elemanli bir array girecegini sorun. Kullanıicidan
		// array'in elemanlarini girmesini isteyin.
		// a) Bu array'in icinde herhangi bir elemanin var olup olmadigini
		// kontrol edin.
		// b) Bu arayin tum elemanlarini tersten yazdirin.
		// Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdirin.
		//

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli bir array girmek istiyorsunuz?");
		int length = scan.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Array'in elemanlarini giriniz");
		for(int i =0;i<length;i++){
			arr[i] = scan.nextInt();
			
		} 
		int arr1[] = new int[length];
		for(int i = 0;i<length;i++){
			arr1[i] = arr[length-1-i];
		}
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Tersten:  "+Arrays.toString(arr1));
         Arrays.sort(arr);
		
		int deger = Arrays.binarySearch(arr, 8);
		if(deger<0){
			System.out.println("8 array'in elemanlari arasinda yoktur");
		}else{
			System.out.println("8 array'in elemanlari arasinda vardir");
		}
	}

}
