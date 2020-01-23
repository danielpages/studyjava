package ch7;

class Card1{
	final int Number;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card1(String kind, int num){
		KIND = kind;
		Number = num;
	}
	
	Card1(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + Number;
	}
	
}

public class FinalCardTest {

	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 10);
		
		//c.Number = 5;
		
		System.out.println(c.KIND);
		System.out.println(c.Number);
		System.out.println(c);

	}

}
