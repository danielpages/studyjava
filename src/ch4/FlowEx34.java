package ch4;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] argrs) {
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer :
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
			
			for(;;) {
				System.out.print("Input caculator number. (end : 0, overall end : 99) >");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0) {
					break;
				}
				
				if(num == 99) {
					break outer;
				}
				
				switch(menu) {
					case 1:
						System.out.println("result = " + num*num);
						break;
					case 2:
						System.out.println("result = " + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result = " + Math.log(num));
						break;
					
				}
			}
		}
	}

}
