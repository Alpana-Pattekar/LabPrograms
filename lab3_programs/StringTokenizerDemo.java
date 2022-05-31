package lab3_programs;

import java.util.*;
import java.lang.*;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line of numbers: ");
		String input = scan.next();
		StringTokenizer st = new StringTokenizer(input, "@");
		int sum = 0;
		while(st.hasMoreTokens()) {
			int n=0;
			n = Integer.parseInt(st.nextToken());
			System.out.println("Number is: "+n);
			sum = sum+n;
		}
		System.out.println("Sum of the numbers is: "+sum);
		
	}
	


}
