package ch7;

class Product1{
	int price;
	int bonusPoint;
	
	Product1(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv4 extends Product1{
	Tv4(){
		super(100);
	}
	
	public String toString() {return "Tv";}
}

class Computer1 extends Product1{
	Computer1(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class Audio extends Product1{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
	Product1[] item = new Product1[10];
	int i = 0;
	
	void buy1(Product1 p) {
		if(money < p.price) {
			System.out.println("Insufficient cash");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println("Purchase " + p);
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) break;
			
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		System.out.println("Overall Purchase " + sum);
		System.out.println("Purchase Product " + itemList);
	}
}



public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		
		b.buy1(new Tv4());
		b.buy1(new Computer1());
		b.buy1(new Audio());
		b.summary();
		
	}

}
