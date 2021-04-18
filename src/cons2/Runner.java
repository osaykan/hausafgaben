package cons2;

public class Runner {

	public static void main(String[] args) {
	
		Balik balik1 = new Balik();
		Balik balik2=new Balik();
		Balik balik3= new Balik("Balikcik","Hamsi",2);
		System.out.println(balik1.ad);//null
		balik1.ad="cingöz";
		System.out.println(balik1.ad);//cingöz
		
		System.out.println(balik3.ad);

	}

}
