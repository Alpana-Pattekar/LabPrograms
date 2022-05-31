package lab5_programs;

import java.util.Scanner;

class AgeException extends Exception {
	public AgeException(String str) {
		System.out.println(str);
	}
	
}

public class AgeExcDemo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = s.nextInt();
		
		try {
			if(age < 15)
				throw new AgeException("Invalid Age");
			else
				System.out.println("Valid age");
		}
		catch(AgeException a) {
			System.out.println(a);
			
		}
	}

}
