package ch7;

import java.util.Vector;

class Product3{
	int price;
	int bonusPoint;
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product3(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv6 extends Product3{
	Tv6(){
		super(100);
	}
	
	public String toString() {return "Tv";}
}

class Computer3 extends Product3{
	Computer3(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class Audio2 extends Product3{
	Audio2(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer3{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy3(Product3 p) {
		if(money < p.price) {
			System.out.println("Insufficient cash");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println("Purchase " + p);
	}
	
	void refund1(Product3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println("Refund Product " + p);
		} else {
			System.out.println("Nothing Product");
		}
	}
	
	void summary2() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("Nothing Product");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product3 p = (Product3)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		
		System.out.println("Overall Purchase " + sum);
		System.out.println("Purchase Product " + itemList);
	}
}



public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer3  b = new Buyer3();
		Tv6 tv = new Tv6();
		Computer3 com = new Computer3();
		Audio2 audio = new Audio2();
		
		b.buy3(tv);
		b.buy3(com);
		b.buy3(audio);
		b.summary2();
		System.out.println();
		b.refund1(com);
		b.summary2();
		
	}

}
