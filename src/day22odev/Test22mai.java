package day22odev;

public class Test22mai {

	public static void main(String[] args) {
	/*	1.Soru
	 * Asagidakilerden hangisi parametre olarak varargs kullanmak icin iyi bir sebeptir?

				A
				Method her zaman iki tane argument kullanilarak cagrilacak

				B
				Method farkli data tipindeki  argumentler kullanilarak kullanilarak cagrilacak

				C
				Method cagrilirken 2 argumentten 8 argumente kadar farkli sayilarda argumentler kullanilarak cagrilacak.

				D
				Method cagrilirken argument kullanilmayacak

				SUBMIT ANSWER
				
				Correct Answer:
					Method cagrilirken 2 argumentten 8 argumente kadar farkli sayilarda argumentler kullanilarak cagrilacak.

					
					2.Soru
					
					public int blMethod(boolean b1, boolean... b2) {

       return b2.length;

} 



Yukarida verilen methoda gore asagidakilerden hangisi 2 return eder?		

A
blMethod(true, false, true);

B
blMethod(true);

C
blMethod(true, false);

D
blMethod(true, false, false, false);

SUBMIT ANSWER

Correct Answer:
blMethod(true, false, true);


3.Soru

Asagidakilerden hangileri Compile Time Error verir?

A
public void methodA(int... i, int j) { }

B
public void methodA(int... i, int... j) { }

C
public void methodA(int... i) { }

D
public void methodA(int i, int j, int... k) { }

SUBMIT ANSWER

Correct Answers:
public void methodA(int... i, int... j) { }

public void methodA(int... i, int j) { }

OK


4.Soru


public void methodA(int i, int j, int... k) {

      System.out.println(k.length);

}

Yukarida verilen method ile ilgili asagidakilerden hangisi dogrudur?

A
methodA(1,2,3,4);

Ekrana 4 yazdirir.

B
methodA(1,2);

Ekrana 1 yazdirir.

C
methodA(1,2);

Compile Time Error verir

D
methodA(1,2,3,4,5);

Ekrana 3 yazdirir.

SUBMIT ANSWER

Correct Answer:
methodA(1,2,3,4,5);

Ekrana 3 yazdirir.


5.Soru

public static void product(String x, int... y) {

		int product = 1;

		for(int w: y) {

			product = product * w;

		}

		System.out.print(x);

		System.out.println(product);

	}

Asagidakilerden hangisi dogrudur?

A
product(Sonuc: , 3, 5);

Ekrana Sonuc: 15 yazdirir

B
product("Sonuc: ", 2, 2.5);

Ekrana Sonuc: 5 yazdirir

C
product("Sonuc: ");

Ekrana Sonuc: 0 yazdirir

D
product("Sonuc: ", 2,3,4);

Ekrana Sonuc: 24 yazdirir

SUBMIT ANSWER


Correct Answer:
product("Sonuc: ", 2,3,4);

Ekrana Sonuc: 24 yazdirir


6.Soru

Asagidakilerden hangisi Access Modifier'lar ile ilgili yanlistir?

A
protected access modifier kullanilarak olusturulan elemanlara olusturulduklari package icerisinden ve baska package'lerdeki bu elemanlarin child'larindan ulasilabilir.

B
default access modifier kullanilarak olusturulan elemanlara olusturulduklari package icerisinden ulasilabilir.

C
public access modifier kullanilarak olusturulan elemanlara heryerden ulasilabilir

D
private access modifier kullanilarak olusturulan elemanlara sadece olusturulduklari class icinden ulasilabilir

E
Hicbiri

SUBMIT ANSWER

Correct Answer:
Hicbiri

7.Soru


Asagidaki access modifierlardan hangisinde hata yapilmistir?

A
protected static void sum(int a, int b) {

		System.out.println(a + b);

}

B
private static void sum(int a, int b) {

		System.out.println(a + b);

}

C
public static void sum(int a, int b) {

		System.out.println(a + b);

}

D
default static void sum(int a, int b) {

		System.out.println(a + b);

}

SUBMIT ANSWER
Correct Answer:
default static void sum(int a, int b) {

System.out.println(a + b);

}


8.Soru



Zoom
Verilen resim hangi access modifier'i anlatmaktadir?

A
default

B
protected

C
private

D
public

SUBMIT ANSWER

Correct Answer:
protected


9.Soru

Asagidaki access modifier'lardan hangileri class'lar icin kullanilamaz?

A
default

B
private

C
protected

D
public 

SUBMIT ANSWER

Correct Answers:
protected

private


10.Soru


Asagidakilerden hangileri dogrudur?

A
default access modifier'in diger adi package private'dir.

B
protected access modifier default access modifer'dan daha genistir.

C
Hepsi

D
protected access modifier'a sahip elemanlara o elemanlarin child'lari diger package'lardan ulasabilirken, default access modifier'a sahip elemanlara o elemanlarin child'lari diger package'lardan ulasamazlar. 

SUBMIT ANSWER

Correct Answer:
Hepsi







					
					
					
					
					
					
					
					
					
					
					
					
*/
	}

}
