package day22odev;

import java.util.ArrayList;
import java.util.List;

public class Afg02 {

	public static void main(String[] args) {
		// Bir intiger list olusturunuz ve bu listteki tüm sayilarin karesinin toplamini
		//for each loop kullanarak bulunuz ve ekrana yazdiriniz.

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
    System.out.println(list);		
		int sum=0;
		
		for(int w: list){
			sum = sum+ w*w;
			
		}System.out.println("Karelerinin toplami: " + sum);
		
	}

}
