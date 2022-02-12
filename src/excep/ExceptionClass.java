package excep;

public class ExceptionClass {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		
		try {
			System.out.println(b/a);
		}
		catch(Exception e){
			System.out.println("Exception Handled");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}

		System.out.println("Execption");
	}

}
