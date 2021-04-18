package day21odev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Afg5 {

	public static void main(String[] args) {
//		Ödev
//		1)	Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("F");
		System.out.println(list);
		
//		2)	İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		list.add("B");
		System.out.println("B eklendi: "+list);
//		İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		list.add(1, "L");
		System.out.println("L eklendi: "+list);     // [A, L, C, E, F, B]
//
//		3)	set() methodu kullanarak, E’yi D yapınız.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		
		list.set(3,"D");
		System.out.println("E yerine D geldi: "+list);  //[A, L, C, D, F, B]
		
//
//		4)	remove() methodu kullanarak, F’yi siliniz.
//		ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		list.remove(4);
		System.out.println("F silindi: "+list);     //[A, L, C, D, B]
		
//
//		5)	sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		Collections.sort(list);
		System.out.println("Elemanlar Alfabetik siraya dizildi: "+list);  //[A, B, C, D, L]
//
//		6)	contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadığını doğrulayınız.
		System.out.println("Listede L varmi: "+list.contains("L"));    //true
        System.out.println("Listede M varmi: "+list.contains("M"));    //false
        
//		7)	size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız.
        System.out.println("List'in eleman sayisi: "+list.size());
        
//
//		8)	clear() methodu kullanarak, list’deki tum elemanları siliniz.
        
        list.clear();
        System.out.println(list);  //[]
//
//		9)	isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
        System.out.println("List bos mu: "+list.isEmpty());// true


	}

}
