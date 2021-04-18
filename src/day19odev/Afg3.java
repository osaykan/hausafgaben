package day19odev;

public class Afg3 {

	public static void main(String[] args) {
		// Program calistiktan sonra i'nin degeri ne olur?

		int[] x = { 2, 1, 4, 5, 7 };
		int limit = 3;
		int i = 0;
		int sum = 0;

		while ((sum < limit) && (i < x.length)) {

			i++;
			sum = sum + x[i];
		}
		System.out.println(i);  //2
	}

}
