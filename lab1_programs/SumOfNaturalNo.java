package lab1_programs;

import java.util.Scanner;

public class SumOfNaturalNo {
	
	static int sum=0;
	public static int calculateSum(int n) {
		for(int i=0; i<n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				//System.out.println(i);
				sum = sum+i;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println(calculateSum(n));
	}

}
