package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Input integer 1 and 100. > ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("Again try input lower number.");
			} else if(input < answer) {
				System.out.println("Again try input high number.");
			}
		} while(input != answer);
			
		System.out.println("Correct answer");

	}

}
