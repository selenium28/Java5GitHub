package basic;

public class DataTypesConcepts {

	//main()Method ---> Starting/execution point of the program
	public static void main(String[] args) {
		//Primitive DataTypes: int, double, char, boolean.
		//Non-Primitive DataTypes: String and Array.
		
		//1. Int -
		int a = 10;  // Duplicate variables not allowed.
		int b = 20; 
		
//		int c = a+b;
		System.out.println(a);
		System.out.println("a + b : " + (b+a));
//		System.out.println(c);
		
		//2.Double -
		double d = 100; // 100.0
		double d1 = 22.22;
		double d3 = 10; 
		System.out.println(d);
		
		//3. Char
		char c = 'A';
		char c1 = 'a';
		System.out.println(c);
		
		//4. Boolean true or false - values and keywords
		boolean b1 = true;   // Values
		boolean b2 = false;  // Values
		
		//5. String - is a class also we can use as datatypes.
		String s = "Arnav";
		String s1 = "100";
		String s2 = "@#$$%%&";
		String s3 = "200";
		System.out.println(s1+s3+s2);

	}

}
