package basic;

public class ArrayClass {

	public static void main(String[] args) {
		
		//array: To store similar datatypes vales in array variable
		//array start zero index
		//size n; n - 1; 5-1= 4 (n is size of array)
		
		//Disadvantage:
		//Size is fixed
		//Store only similar data types 
		
		//1.int array
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 60;
		
		System.out.println(i.length);
		System.out.println(i[5]);   //ArrayIndexOutOfBoundsException
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		 Object obj[] = new Object[4];  // Object is a class ---> is used to store diff data types value
		 obj[0] = "Asif";
		 obj[1] = 50;
	}

}
