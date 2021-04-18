package day21odev;

public class Afg2 {

	public static void main(String[] args) {
	//	2)	Asagidaki multi dimensional array'in ic array'lerindeki son elemanlarin carpimini
//		ekrana yazdiran bir program yazınız { {1,2,3}, {4,5}, {6} }

		int arr[][] = { {1,2,3}, {4,5}, {6} };
		int product =1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				
				if(j==arr[i].length-1){         //  veya if yerine   product = product * arr[i][arr[i].length - 1]; kullanilabilir
					product=product*arr[i][j];
				}
				
			}
			
		}System.out.println("Ic array'lerindeki son elemanlarin carpimi: "+product);



	}

}
