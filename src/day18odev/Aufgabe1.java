package day18odev;

public class Aufgabe1 {
	 static int i=1;
	   public static void main(String[] args) {
		   
		   for(int i=1 ;i<10 ; i++) {
			   i=i+2;
			   System.out.print(i+" "); } //3 6 9 yazılır..
			  
			   //ilk 'i' değeri 1, i=i+2;den dolayı ekrana 3 yazdırılır
			 
			   //ikinci 'i'değeri 3(Variable static, bir öncekini görür),for'un içine girer 1 arttırılır 4 olur,
			   //i=i+2;den dolayı ekrana 6 yazdırılır.
			 
			   //Üçüncü 'i' degeri 6(Variable static, bir öncekini görür),for'un içine girer 1 arttırılır 7 olur
	   }
}
