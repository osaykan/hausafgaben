package cons2;

public class Balik extends Hayvan {

	String ad;
	String t�r;
	int yas;

	public Balik() {

		System.out.println("Balik Parametresiz Constructor");
	}

	public Balik(String ad, String t�r, int yas) {
		this.ad = ad;
		this.t�r = t�r;
		this.yas = yas;
		System.out.println("Balik 3 parametreli constructor");

	}

}
