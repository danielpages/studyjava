package ch2;

import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input Number.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("Text : " + input);
		System.out.printf("num=%d%n", num);

	}

}
