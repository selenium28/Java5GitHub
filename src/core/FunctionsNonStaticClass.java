package core;

public class FunctionsNonStaticClass {

	public static void main(String[] args) {
		FunctionsNonStaticClass obj = new FunctionsNonStaticClass();
		obj.add();
		obj.sum();
		obj.display();
		int ans = obj.abc(100, 10);
		System.out.println(ans);

	}
	
	// return type: void --> does not return any value
	public void add() {  
		System.out.println("I am in Add method");
		
	}
	
	// return type: int
	public int sum() { 
		System.out.println("I am in Sum method");
		
		int p = 10;
		int q = 20;
		int m = p+q;
		
		return m;
	}
	
	// return type: String
	public String display() {
		System.out.println("I am in Display method");
		String s = "Selenium";
		
		return s;
	}
	
	// return type: int
	//x & y --> input para.
	public int abc(int x, int y) { 
		System.out.println("I am in Sum method");
		
		int a = x/y;
		
		return a;
	}

}
