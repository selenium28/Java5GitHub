package core;

public class ClassAndObjects {

	public static void main(String[] args) {
		
		ClassAndObjects obj = new ClassAndObjects();
		obj.demo();
		display();

	}
	
	public void demo() {
		System.out.println("Demo method");
	}
	
	public static void display() {
		System.out.println("Display method");
	}

}
