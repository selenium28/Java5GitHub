package core;

public class GlobalAndLocalVeriables {
	int num = 100;  //Global Veriables  - Non-static
	static String str = "Selenium";   // Global static variable

	public static void main(String[] args) {
		
		GlobalAndLocalVeriables obj = new GlobalAndLocalVeriables();
		int a = 100;   // Local variable
		System.out.println(a);
		System.out.println(obj.num);
		System.out.println(GlobalAndLocalVeriables.str);
		
		obj.demo();
		//direct calling - static method 
		// static method, variables - call by using class names.
		GlobalAndLocalVeriables.display();
		
	}

	public void demo() {
		int i = 10;
		int j = 20;
		System.out.println(i+j);
	}
	
	public static void display() {
		int m = 200;
		
		GlobalAndLocalVeriables obj2 = new GlobalAndLocalVeriables();
		System.out.println(m);
		
		System.out.println((obj2.num + m));
	}


}
