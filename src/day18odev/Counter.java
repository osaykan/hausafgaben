package day18odev;

public class Counter {

	 int count=0;

	Counter(){ 
		count++;
	System.out.println(count);//1 1 1 Herseferinde 1 yansitir.count static olsaydi 1 2 3 yazdirirdi
	}
	public static void main(String args[]){ 
		Counter c1=new Counter();
	Counter c2=new Counter();
	Counter c3=new Counter();
        //System.out.println(c1.count); sadece son durumu yansitir 1 dir. static count olsaydi 3 yansitirdi
	}
	}


