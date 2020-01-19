package ch6;

class Document{
	static int count = 0;
	String name;
	
	Document(){
		this("No name " + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("Generator is " + this.name + " Document");
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("java.txt");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}
