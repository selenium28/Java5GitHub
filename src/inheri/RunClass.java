package inheri;

public class RunClass {

	public static void main(String[] args) {
		
		// static polymorphism---- complile time polymorphism
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.running();
		d.nonVeg();
		
		System.out.println("****************");
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
		a.running();
		
		System.out.println("****************");
		
		//Casting
		// child class object can be referred by parent  class ref variable -- dynamic polymorphism-- also called call Runtime Polymorphism
		Animal a1 = new Dog();
		a1.eat();
		a1.sleep();
		a1.running();
		
		
		
	}

}
