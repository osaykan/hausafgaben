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
//			 System.out.println(str.startsWith(â€œterâ€?,7));
//			 System.out.println(str.startsWith(â€œpâ€?, 11));
//			 System.out.println(str.startsWith(â€œâ€?));
////System.out.println(str.endsWith(â€œr"));
//			 System.out.println(str.endsWith(â€œC"));
//			 		 System.out.println(str.endsWith(â€œ")); 
//			 		 System.out.println(str.endsWith(â€œ â€?)); 
//			 		 System.out.println(str.endsWith(â€œlarâ€?));
//			 		 System.out.println(str.endsWith(â€œcaterpillarâ€?));
		
//		String str = â€œCat, caterpillarâ€?;
//
//		System.out.println(str.replace(â€™tâ€™, â€˜mâ€™));
//		System.out.println(str.replace(â€œtâ€?, â€œmâ€?));
//		System.out.println(str.replace(â€œxâ€?, â€œyâ€?));
//		System.out.println(str.replace(â€œâ€?, â€œ|â€?));
//		System.out.println(str.replace(â€œaâ€?, â€œâ€?));
//		System.out.println(str.replace(â€œatâ€?, â€œamelâ€?)); 
//		System.out.println(str.replace(â€œatâ€?, â€œeâ€?));
//		System.out.println(str.replaceFirst(â€œcâ€?, â€œCâ€?));
//		System.out.println(str.replaceFirst(â€œatâ€?, â€œamelâ€?));
//		System.out.println(str.replaceFirst(â€œCat, caterpillarâ€?, â€œDeveâ€?));
//
//
//		String str1 = â€œ900â€?;
//		String str2 = â€œ1000â€?;
//		int str3 = 900;
//		int str4 = 1000;
//		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
//		System.out.println(String.valueOf(str3) + String.valueOf(str4));
//
//		Integer.valueOf() methodu ile String.valueOf() methodunun farkÄ±nÄ± aÃ§Ä±klayÄ±nÄ±z.
		 


		
		
		

	}

}
