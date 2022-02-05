package inheri;

public class Dog extends Animal{
	
	//It is Inheriting the properties of parent class into child class is known as Inheritance.
	
	//When same method is present in parent class as well as in child class with the same no of parameters is known as Method Overriding
	
	public void eat() {  // overriden method
		System.out.println("Dog--- Eat");
	}
	
	public void nonVeg() {
		System.out.println("Dog--- NonVeg");
	}
	
	

}
