package day18odev;

public class Afg6 {
	// Bir array'de herhangi iki elemanin ayni olup olmadigini kontrol eden
	// bir program yaziniz.Aynı eleman varsa "Aynı eleman var"
	// yoksa "Aynı eleman yok" yazdiriniz.

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 5 };
		int i,j,count = 0;
		//int j = 0;
		//int count = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break; // break olmasada calisir ama break döngüyü bulunca
							// bitirir.Digerturlü sonuna kadar bakar
				}

			}

		}
		if (count > 0) {
			System.out.println(" Ayni eleman var");
		} else {
			System.out.println("Ayni eleman yok");
		}

	}
}
