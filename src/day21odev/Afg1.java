package day21odev;

import java.util.ArrayList;
import java.util.List;

public class Afg1 {

	public static void main(String[] args) {
//		Multi Dimensional Array Sorulari
//
//		1)	Asagidaki multi dimensional array'in tum elemanlarinin carpimini ekrana yazdiran bir program yaziniz.
//		{ {1,2,3}, {4,5,6} }
   
	int arr[][]= { {1,2,3}, {4,5,6} };
	
	int product = 1;
	
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			
			product= product*arr[i][j];
			
		}
	}System.out.println("Tüm elemanlarinin carpimi: "+product);


		
		 


	}

}
