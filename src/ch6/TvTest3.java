package ch6;

class Tv3{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class TvTest3 {

	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("Current t1 channel is " + t1.channel);
		System.out.println("Current t2 channel is " + t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		
		System.out.println("Change t1 channel is 7");
		
		System.out.println("Current t1 channel is " + t1.channel);
		System.out.println("Current t2 channel is " + t2.channel);
		

	}

}
