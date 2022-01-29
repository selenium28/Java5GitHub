package basic;

public class StringConcatination {

	public static void main(String[] args) {
		// + : opretor
		
		int a = 20;
		int b = 10;
		String str = "Java";
		String ptr = "Selenium";
		
		System.out.println(a+str+b);
		System.out.println(a+b+str);
		
		System.out.println(ptr+a+str+b+a);
		System.out.println(ptr+a+str+(b+a));

	}

}
