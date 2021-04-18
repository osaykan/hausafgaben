package cons2;

public class Balik extends Hayvan {

	String ad;
	String tür;
	int yas;

	public Balik() {

		System.out.println("Balik Parametresiz Constructor");
	}

	public Balik(String ad, String tür, int yas) {
		this.ad = ad;
		this.tür = tür;
		this.yas = yas;
		System.out.println("Balik 3 parametreli constructor");

	}

}
