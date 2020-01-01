package ch4;

import java.util.Scanner;

public class FlowEx32 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square ");
			System.out.println("(2) square root ");
			System.out.println("(3) log ");
			System.out.println("Want you select number 1 ~ 3. (end 0)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("End programming");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("No select menu. (end 0)");
				continue;
			}
			
			System.out.println("You' choice menu " + menu);
		}

	}

}
