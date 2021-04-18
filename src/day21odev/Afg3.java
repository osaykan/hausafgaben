package day21odev;

public class Afg3 {

	public static void main(String[] args) {
//		3)	Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz
//		arr1 = { {1,2}, {3,4,5}, {6} }	ve	arr2 = { {7,8,9}, {10,11}, {12} }

       int arr1[][] = { {1,2}, {3,4,5}, {6} };
       int arr2[][] = { {7,8,9}, {10,11}, {12} };
       
       int sum=0;
       for(int i=0;i<arr1.length;i++){
    	   for(int j=0;j<arr1[i].length;j++){
    		   
    		   for(int k=0;k<arr2.length;k++){
    	    	   for(int m=0;m<arr2[k].length;m++){
    	    		   
    	    		   if(k==i&& j==m){
    	    			   sum=sum+arr1[i][j]+arr2[k][m];
    	    		   }
    	    		   
    	    		   
    	    	   }
    	    	   
    	       }
    	   }
    	   
       }System.out.println("Ic array'lerdeki ayni index'e sahip elemanlarin toplami: "+sum);


	}

}
