package replit;

import java.util.Scanner;

public class Logic09maildogrumu {
	/*
	 * Kullanicidan alinan bir mailin dogru olup olmadigini kontrol eden bir program
	 * yaziniz.
	 * 
	 * Sartlar: Bir mail adresinde @ karakteri olmali Bir mail adresinde . (nokta)
	 * karakteri olmali Bir mail adresinde @ karakterinden önce en az bir karakter
	 * yazilmali (a@gmail.com gibi)
	 * 
	 * Ornekler validateEmail("@gmail.com") Cikti : false
	 * 
	 * validateEmail("gmail") Cikti : false
	 * 
	 * validateEmail("hello@gmail") Çikti : false
	 * 
	 * validateEmail("hello@edabit.com") Cikti : true
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		System.out.println("Cikti : " + validateEmail(email));

	}

	public static boolean validateEmail(String email) {
		if (!email.contains("@")) {
			return false;
		}

		if (!email.contains(".")) {
			return false;
		}
		if (email.length() <= 4) {
			return false;
		}
		String[] array = email.split("@");
		if (array[0].length() < 1) {
			return false;
		}
		if (array[1].length() < 3) {
			return false;
		}
		if (array.length > 2) {
			return false;
		}

		return true;

	}

}
