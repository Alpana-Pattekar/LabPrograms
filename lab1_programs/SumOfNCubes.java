package lab1_programs;

import java.util.Scanner;

public class SumOfNCubes {
	
	public static int sumOfNo(int n) {
		int x = (n*(n+1)/2);
		return x*x;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a total numbers");
		int n = scan.nextInt();
		System.out.println(sumOfNo(n));
	}


}
