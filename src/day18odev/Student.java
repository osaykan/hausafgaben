package day18odev;

public class Student {

	int number; 
	String name;
	static String college ="ITS";

	Student(int r, String n, String college){ 
		number = r;
	name = n;
	college = college;
	}

	public static void main(String args[]){

	Student s1 = new Student(111,"Karan", "MIT");//111 Karan ?
	Student s2 = new Student(222,"Aryan", "Harvard");//22 Aryan ?

	System.out.println(s1.number);//111
	System.out.println(s2.number);//222

	System.out.println(s1.name);//Karan
	System.out.println(s2.name);//Aryan

	System.out.println(s1.college);//ITS?
	System.out.println(s2.college);//ITS?

	}
	}

	

