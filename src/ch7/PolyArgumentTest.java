package ch7;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product{
	Tv3(){
		super(100);
	}
	
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("Insufficient cash");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("Purchase " + p);
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());
		
		System.out.println("Current remain chsh " + b.money);
		System.out.println("Current Bonus Point " + b.bonusPoint);

	}

}
