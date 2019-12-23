package ch4;

import java.util.*;

public class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("Inputa resident registration number.(123456-1234567) > ");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1' : case '3' :
			System.out.println("You're Man");
			break;
		case '2' : case '4' :
			System.out.println("You're Woman");
			break;
		default :
			System.out.println("Not a resident registration number");
		}

	}

}
