package day22odev;

public class Afg03 {

	public static void main(String[] args){
		//Iki string array olusturunuz ve bu array lerdaki ortak elemanlari
		//for each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa "Ortak eleman yoktur" yazdiriniz.
		
		String arr1[] = {"Ali","Veli","Ayse","Cem"};
		String arr2[] = {"Ahmet","Ali","Fatma"};
		int count=0;
		for(String w : arr1){
			for(String z : arr2){
				if(w.equals(z)){
					System.out.println("Ortak eleman: "+w);
					count++;
				}
				
				
			}
			
		}if(count==0){
			System.out.println("Ortak eleman yok");
			
		}
		
		
	}
}
