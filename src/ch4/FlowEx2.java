package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("Input Numbers. >");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0) {
			System.out.println("Current Input number 0.");
		}
		
		if(input != 0)
			System.out.println("Current Input is not number 0.");
			System.out.printf("Current Input number %d.", input);

	}

}
