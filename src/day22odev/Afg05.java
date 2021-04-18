package day22odev;

public class Afg05 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1.Soru
		 * 
		 * List<String> list1 = new ArrayList<>();
		 * 
		 * List<String> list2 = new ArrayList<>();
		 * 
		 * List<String> list3 = new ArrayList<>();
		 * 
		 * list3.add("Ayhan"); list3.add(0,"Beyhan");
		 * 
		 * List<String> list4 = new ArrayList<>();
		 * 
		 * list4.add("Ayhan"); list4.add("Beyhan");
		 * 
		 * Asagidakilerden hangisi yanlistir?
		 * 
		 * A System.out.println(list1.equals(list2)); Ekrana true yazdirir.
		 * 
		 * B System.out.println(list1.equals(list3)); Ekrana false yazdirir.
		 * 
		 * C System.out.println(list4.equals(list3)); Ekrana true yazdirir.
		 * 
		 * D System.out.println(list3.equals(list4)); Ekrana false yazdirir.
		 * 
		 * Correct Answer: System.out.println(list4.equals(list3)); Ekrana true
		 * yazdirir.
		 * 
		 * 2.Soru
		 * 
		 * Asagidakilerden hangileri dogrudur?
		 * 
		 * A Java'da Object Class, parent class'indaki tum method'lari
		 * kullanabilir
		 * 
		 * B Java'da parent class'i olmayan tek class Object Class'tir
		 * 
		 * C Java'da Object Class tum class'larin parent class'idir
		 * 
		 * 
		 * Correct Answers: Java'da Object Class tum class'larin parent
		 * class'idir
		 * 
		 * Java'da parent class'i olmayan tek class Object Class'tir
		 * 
		 * 
		 * 3.Soru
		 * 
		 * Array, List'e donusturuldugunde List'ler icin kullanilan hangi
		 * methodlar artik kullanilamaz olur?
		 * 
		 * A add() B remove() C clear() D set()
		 * 
		 * 
		 * Correct Answers: clear() remove() add()
		 * 
		 * 4.Soru
		 * 
		 * String arr[] = {"Ali", "Can"};
		 * 
		 * List<String> list = Arrays.asList(arr);
		 * 
		 * Yukaridaki kod ile ilgili asagidakilerden hangisi yanlistir?
		 * 
		 * A System.out.println(arr.length == list.size()); Ekrana true yazdirir
		 * 
		 * B list.add("Veli");
		 * 
		 * System.out.println(list.size()); Ekrana 3 yazdirir
		 * 
		 * C list.set(1, "Kemal"); System.out.println(list); Ekran ciktisi [Ali,
		 * Kemal] dir D list.clear(); kodu calistirlidiginda Run Time Error
		 * alinir
		 * 
		 * Correct Answer: list.add("Veli");
		 * 
		 * System.out.println(list.size()); Ekrana 3 yazdirir
		 * 
		 * 5.Soru
		 * 
		 * int arr[] = {1, 3, 5};
		 * 
		 * for(int w : arr) { System.out.print(w + ""); } Ekran ciktisi nedir?
		 * 
		 * A w w w B 1 3 5 C 9 D 1 3 5 Correct Answer: 1 3 5
		 * 
		 * 
		 * 6.Soru
		 * 
		 * int arr[] = {1, 3, 5};
		 * 
		 * int x = 0;
		 * 
		 * for(int w : arr) { x = x + w*w; }
		 * 
		 * System.out.print(x);
		 * 
		 * Ekran ciktisi nedir?
		 * 
		 * A Compile Time Error B 9 C 35 D Run Time Error
		 * 
		 * Correct Answer: 35
		 * 
		 * 
		 * 7.Soru
		 * 
		 * 
		 * int arr[][] = { {1, 2}, {3}, {4, 5, 6} };
		 * 
		 * int sum = 0;
		 * 
		 * for(int[] w : arr) { for(int z : w){ sum = sum + z; } }
		 * 
		 * System.out.println(sum);
		 * 
		 * A 186 B 20 C 21 D 19
		 * 
		 * Correct Answer: 21
		 * 
		 * 
		 * 8.Soru
		 * 
		 * int arr[][] = { {1,2,3}, {4}, {5, 6}};
		 * 
		 * Yukarida verilen multi dimensional array ile ilgili asagidakilerden
		 * hangisi yanlistir?
		 * 
		 * A for(int[] w : arr){ System.out.print(w.length + " "); } Ekrana 3 1
		 * 2 yazdirir
		 * 
		 * B System.out.print(Arrays.toString(arr[1])); Ekrana [1, 2, 3]
		 * yazdirir
		 * 
		 * C System.out.println(arr.length); Ekrana 3 yazdirir
		 * 
		 * Correct Answer: System.out.print(Arrays.toString(arr[1])); Ekrana [1, 2, 3] yazdirir
		 * 
		 * 9.Soru
	  
		 * int arr1[][] = { {1, 2, 3}, {4, 5}, {6, 7}, {8}};
		 * 
		 * int arr2[] = new int[arr.length];
		 * 
		 * Asagidakilerden hangisi yanlistir?
		 * 
		 * A arr2 multi dimensional array degildir
		 * 
		 * B System.out.println(Arrays.toString(arr2)); Ekrana [0, 0, 0, 0]
		 * yazdirir
		 * 
		 * C System.out.println(arr2.length); Ekrana 4 yazdirir
		 * 
		 * D System.out.println(Arrays.toString(arr1)); Ekrana [1, 2, 3, 4, 5,
		 * 6, 7, 8] yazdirir
		
		 * Correct Answer: System.out.println(Arrays.toString(arr1)); Ekrana [1,
		 * 2, 3, 4, 5, 6, 7, 8] yazdirir
		 * 
		 * 
		 * 10.Soru
		 * 
		 * int arr[] = {12, 21, 13};
		 * 
		 * for(int w : arr) { System.out.print(w + " "); }
		 * 
		 * Asagidakilerden hangisinin ekran ciktisi yukaridaki ile aynidir?
		 * 
		 * A int arr[] = {12, 21, 13};
		 * 
		 * for(int i=0; i<arr.length; i++) { System.out.print(arr[i] + " "); }
		 * 
		 * B Hicbiri C int arr[] = { {12}, {21}, {13} };
		 * 
		 * for(int[] w : arr) { System.out.print(w + " "); }
		 * 
		 * Correct Answer: int arr[] = {12, 21, 13};
		 * 
		 * for(int i=0; i<arr.length; i++) { System.out.print(arr[i] + " "); }
		 */
	}

}
