package day18odev;

import java.util.Scanner;

public class Ubung {
	public static void main(String[] args) {
		//Kullanicidan array olusturmasini isteyelim
		//Ayni eleman varsa uyari versin

		Scanner scan = new Scanner(System.in);
       System.out.println("Array'in length 'ini giriniz");
       int length = scan.nextInt();
       System.out.println("Array'in elemanlarini giriniz");
       int arr[] = new int[length];
        int i ,j,count = 0;
        for(i=0;i<length;i++){
        
        	arr[i] = scan.nextInt();
        	
        }
		for(i=0;i<length;i++){
			for(j=i+1;j<length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
				
			}
		}
		if(count>0){
			System.out.println("Ayni eleman var");
		}else{
			System.out.println("Ayni eleman yoktur");
		}
	}
}