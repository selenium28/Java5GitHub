package core;

public class MethodOverLoadingClass {
	
	//MethodOverLoading--> When the method name is same with different input parameters within the same class.
	//Duplicate methods are not allowed.
	//Method inside method is not allowed.

	public static void main(String[] args) {
		MethodOverLoadingClass obj = new MethodOverLoadingClass();
		MethodOverLoadingClass.display();
		obj.display(50);
		obj.display(10, 20);
	}

	public static void display() {  // 0 input parameters
		System.out.println("0 input parameters");
	}

	public void display(int i) {  // 1 input parameters
		System.out.println("1 input parameters");
		System.out.println(i);
	}
	
	public void display(double d) {  // 1 input parameters
		System.out.println("1 input parameters");
		System.out.println(d);
	}
	
	public void  display(int m, int n) {  // 2 input parameters
		System.out.println("2 input parameters");
		System.out.println(m+n);
	}
}
