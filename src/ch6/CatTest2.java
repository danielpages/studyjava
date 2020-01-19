package ch6;

class Car1{
	String color;
	String gearType;
	int door;
	
	Car1(){
		this("white", "aute", 4);
	}
	
	Car1(String color){
		this(color, "auto", 4);
	}
	
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CatTest2 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		
		System.out.println("Color of c1 = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("Color of c2 = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

	}

}
