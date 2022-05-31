package lab1_programs;

import java.util.Scanner;

public class TrafficSignals {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Red\n2. Yellow\n3. Green");
		int color = scan.nextInt();
		String message = "";
		switch(color) {
		case 1:
			message = "Stop";
			break;
		
		case 2:
			message = "Ready";
			break;
			
		case 3:
			message = "Go";
			break;
			
		default:
			message = "Invalid Input";
			break;
		}
		System.out.println(message);
	}


}
