package replit;

import java.util.Scanner;

public class Logic13FazlaMesai {
	/*
	 * Fazla mesaiyi hesaplayan bir program yaziniz. Yazacaginiz program toplam
	 * kazanci return etsin.
	 * 
	 * Kullanicidan saatlik calisma ücretini, hangi saatler arasinda calistigini ve
	 * fazla mesaiye kalirsa kazancini kac ile katlayacagini alalim.
	 * 
	 * Daha sonra su sekilde bir program yaziniz :
	 * 
	 * Ornek : saatlik calisma ücreti : 40.0 hangi saat basladi : 9.0 hangi saat
	 * bitti : 20.0 mesaiyi kacla katlayacagiz : 1.8
	 * 
	 * ucretHesapla(9.0,20.0,40.0,1.8);
	 * 
	 * 9 ile 17 arasinda toplam calisma 8 saat oldugu icin 8 x 40 = 320 17 ile 20
	 * arasinda toplam calisma 3 saat oldugu icin 3 x 40 x 1.8 = 216
	 * 
	 * toplam = 536.0
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("saatlik calisma ücreti : ");
		double saatlikUcret = scan.nextInt();

		System.out.println("hangi saat basladi : ");
		double baslangic = scan.nextInt();

		System.out.println("hangi saat bitti : ");
		double bitis = scan.nextInt();

		System.out.println("mesaiyi kacla katlayacagiz : ");
		double oran = scan.nextFloat();

		double kazanc = ucretHesapla(baslangic, bitis, saatlikUcret, oran);

		System.out.println("toplam = " + kazanc);

	}

	public static double ucretHesapla(double baslangic, double bitis, double saatlikUcret, double oran) {

		if (bitis <= 17.0) {
			double gelir = (bitis - baslangic) * saatlikUcret;
			return gelir;
		} else {
			double gelir = (17.0 - baslangic) * saatlikUcret + (bitis - 17.0) * saatlikUcret * oran;
			return gelir;
		}

	}

}
