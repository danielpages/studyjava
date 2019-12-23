package ch4;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		System.out.print("Input Current Month. > ");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("Current Season is Spring");
		case 6 : case 7 : case 8 :
			System.out.println("Current Season is Summer");
		case 9 : case 10 : case 11 :
			System.out.println("Current Season is Fall");
			break;
		default :
		case 12 : case 1 : case 2 :
			System.out.println("Current Season is Winter");
		}

	}

}
