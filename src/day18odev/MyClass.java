package day18odev;

public class MyClass {
	int x = 3;
	int y = 5;
	MyClass(){                            //Bu Cons.this olmadigi icin asagidaki argümenti DEGIL
		x+=1;                               //class Variable'ı kullanir,x'i 3 alir.x 1 arttirilir 4 olur.
		System.out.println("-x"+x);         //-x4
	}
	MyClass(int i){                      
		 this();                      //bu this ile parametresiz constructora gider x degerini oradan aliriz,x==> 4 alinir.
		 this.y=i;                    //y degeri aşagidaki argümentten alir ,y ==>3 olur
		 x+=y;                        //x 3 arttirilıirsa x degeri 7 olur.
		
		 System.out.println("-x"+x);        //-x7

	}
	MyClass(int i, int i2){              //2 parametreli cons.
		 this(3);                       // tek parametreli cons gider,oradan x degeri 7 alinir
		 this.x-=4;                       //bulunan x degeri yani 7,   4 azalir sonucta x==>3 çikar.
	
		 System.out.println("-x"+x);    //-x3
}
public static void main(String[] args) {
	MyClass mc1 = new MyClass(4,3);
}
}
