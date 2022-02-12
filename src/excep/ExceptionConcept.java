package excep;

public class ExceptionConcept{

	public static void main(String[] args) {
		
		
//		int b = 10;
		
		try {
			int a[] = new int[5];
			a[5] = 10/6;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}catch (Exception e) {
			System.out.println(" Normal Exception");
		}
		
		System.out.println("Rest code");
		
//		try {
//			System.out.println("Exception");
//		} finally {
//			System.out.println("Finally block");
//		}
		
		


	}

}
