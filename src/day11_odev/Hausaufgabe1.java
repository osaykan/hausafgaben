package day11_odev;

public class Hausaufgabe1 {

	public static void main(String[] args) {
		 String str = "Cat, caterpillar";

              System.out.println(str.substring(0));//"Cat, caterpillar"
            	System.out.println(str.substring(3));//, caterpillar
         		System.out.println(str.substring(4));// caterpillar 
                System.out.println(str.substring(15));//r
                System.out.println(str.substring(16));//bosluk olacak
                
                System.out.println(str.substring(5,8));//cat
        		System.out.println(str.substring(3,4));//,
        		System.out.println(str.substring(5,5));//bosluk olacak
         //		System.out.println(str.substring(8,5));//Exception
        		
                System.out.println(str.startsWith("C"));//true
		        System.out.println(str.startsWith("c"));//false
     			 System.out.println(str.startsWith("B"));//false
  			 	 System.out.println(str.startsWith("Cat"));//true
         			 System.out.println(str.startsWith("c",5));//false..........true
//			 System.out.println(str.startsWith(“ter�?,7));
//			 System.out.println(str.startsWith(“p�?, 11));
//			 System.out.println(str.startsWith(“�?));
////System.out.println(str.endsWith(“r"));
//			 System.out.println(str.endsWith(“C"));
//			 		 System.out.println(str.endsWith(“")); 
//			 		 System.out.println(str.endsWith(“ �?)); 
//			 		 System.out.println(str.endsWith(“lar�?));
//			 		 System.out.println(str.endsWith(“caterpillar�?));
		
//		String str = “Cat, caterpillar�?;
//
//		System.out.println(str.replace(’t’, ‘m’));
//		System.out.println(str.replace(“t�?, “m�?));
//		System.out.println(str.replace(“x�?, “y�?));
//		System.out.println(str.replace(“�?, “|�?));
//		System.out.println(str.replace(“a�?, “�?));
//		System.out.println(str.replace(“at�?, “amel�?)); 
//		System.out.println(str.replace(“at�?, “e�?));
//		System.out.println(str.replaceFirst(“c�?, “C�?));
//		System.out.println(str.replaceFirst(“at�?, “amel�?));
//		System.out.println(str.replaceFirst(“Cat, caterpillar�?, “Deve�?));
//
//
//		String str1 = “900�?;
//		String str2 = “1000�?;
//		int str3 = 900;
//		int str4 = 1000;
//		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
//		System.out.println(String.valueOf(str3) + String.valueOf(str4));
//
//		Integer.valueOf() methodu ile String.valueOf() methodunun farkını açıklayınız.
		 


		
		
		

	}

}
