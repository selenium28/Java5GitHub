package string;

public class StringMethods {

	public static void main(String[] args) {
		String s3 = "Pune";  // Return type of Length - int
		
		System.out.println(s3.length());   
		
		String str = null;
		System.out.println(str);  
		
		String s4 = "";
		System.out.println(s4.isEmpty());  
		
		String s5 = " Selenium ";
		String trimString = s5.trim();
		System.out.println(trimString); 
		System.out.println(s5.length());
		System.out.println(trimString.length());
		
	}

}
