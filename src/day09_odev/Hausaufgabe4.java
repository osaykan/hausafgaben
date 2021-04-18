package day09_odev;

import java.util.Scanner;

public class Hausaufgabe4 {

	public static void main(String[] args) {
		// //4.  Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür�? yazdırın.
		//Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür�? yazdırın.
		//Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır�? yazdırın.
		//Bu isimlerin dışındaki isimler için “Geçersiz ay ismi�? yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Ay ismi giriniz");
		String ay = scan.next();
		
		ay = ay.toLowerCase();
		
		
		switch(ay){
		
		case "ocak" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		
		case "subat" :
			System.out.println("Bu ay Subat ayidir.");
		    break;
		    
		case "mart" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		case "nisan" :
			System.out.println("Bu ay 30 gündür.");
		    break;
		    
		case "mayis" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		case "haziran" :
			System.out.println("Bu ay 30 gündür.");
		    break;
		    
		case "temmuz" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		case "agustos" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		case "eylül" :
			System.out.println("Bu ay 30 gündür.");
		    break;
		    
		case "ekim" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		case "kasim" :
			System.out.println("Bu ay 30 gündür.");
		    break;
		    
		case "aralik" :
			System.out.println("Bu ay 31 gündür.");
		    break;
		    
		    default :
		    	System.out.println("Gecersiz ay");
		}

		scan.close();
	}

}
