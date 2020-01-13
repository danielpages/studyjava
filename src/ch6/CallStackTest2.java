package ch6;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("Start is main(String[] args)");
		firstMethod();
		System.out.println("End is main(String[] args)");

	}
	
	static void firstMethod() {
		System.out.println("Start is firstMethod()");
		secondMethod();
		System.out.println("End is firstMethod()");
	}
	
	static void secondMethod() {
		System.out.println("Start is secondMethod()");
		System.out.println("End is secondMethod()");
	}


}
