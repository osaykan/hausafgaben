package day18odev;

public class Afg5 {

	public static void main(String[] args) {
		//4.Soru
		
		int arr1[]={1,2,3};           //Array ler bir obje dir. Onlarin karsilastirilmasi equals ile olmali.
		int arr2[]={1,2,3};           //Elemanlari ayni olabilir ama reference leri farklidir.arr1==arr2 olmaz. else calisir
		if(arr1==arr2){               // arr1==arr2 yerine Arrays.equals(arr1, arr2) olursa esittir ve Same yazdirir.
			System.out.println("Same");
			
		}else{
			System.out.println("Not same");
		}
//5.Soru
		String[] cities = {"London","Paris","Rome","Newyork"};
		System.out.println(cities[cities.length-2]);//Rome
	}

}
