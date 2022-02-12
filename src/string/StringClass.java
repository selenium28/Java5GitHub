package string;

public class StringClass {
	
	// Difference between == and equals method.

	public static void main(String[] args) {
		String s1 = new String ("Selenium");
		String s2 = new String ("Selenium");
		
		System.out.println(s1==s2);   // false
		System.out.println(s1.equals(s2));  // true
		
		System.out.println("**************************");
		
		String s3 = "Pune";
		String s4 = "Pune";
		System.out.println(s3==s4);    //true
		System.out.println(s3.equals(s4));    //true
		
		String s5 = new String ("Selenium");
		String s6 = "Selenium";
		System.out.println(s5==s6);
		

	}

}
