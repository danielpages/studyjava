package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("Input rock(1)-paper(2)-scissors(3). >");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.println("You're " + user);
		System.out.println("Computer's " + com);
		
		switch(user - com) {
		case 2 : case -1 :
			System.out.println("You're Lost");
			break;
		case 1 : case -2 :
			System.out.println("You're Win");
			break;
		case 0 :
			System.out.println("Our Draw");
			break;
		}

	}

}
