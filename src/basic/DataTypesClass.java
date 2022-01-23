package basic;

public class DataTypesClass {
	
	//main()Method ---> Starting/execution point of the program
	public static void main(String[] args) {
		//Primitive DataTypes: int, double, char, boolean.
		//Non-Primitive DataTypes: String and Array.
		
		//1. int
		int a = 10;     // int- DataType, a- Variable, 10-vales.
		int b = 20;
		int m = -6;
		System.out.println("A + B = " + (a+b));
		
		//2. double
		double d = 12.22;
		double d1 = 10;
		double d2 = 200;  // 200.0
		
		//3. char: only single digit value, should be written within single quote 
		char c = 'a';
		char c1 = 'A';
		char c2 = '$';
		
		//4. IMP IQ-  boolean - is true and false are the keywords or values? 
		// Yes they are keywords in Java but we can use as values.
		boolean b1 = true;
		boolean b3 = false;
		System.out.println(b3);
		
		//5. String - is a class in Java, not a data type
		String s = "amol";
		String s1 = "12345";
		String s2 = "12.34";
		System.out.println(s2+s1);
		

	}

}
