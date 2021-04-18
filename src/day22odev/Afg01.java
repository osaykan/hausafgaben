package day22odev;

public class Afg01 {

	public static void main(String[] args) {
		//Bir integer array olusturunuz ve bu array daki tüm sayilarin carpimini
		//for-each loop kullanarak bulunuz ve ekrana yazdiriniz
		
		int arr[]= {2,3,4,5,6};
		
		int product=1;
		for (int w: arr) {
			product= product*w;
			
		}System.out.println("Elemanlarin carpimi: "+product);

	}

}
