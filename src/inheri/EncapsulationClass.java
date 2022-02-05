package inheri;

public class EncapsulationClass {
	
	//Hiding the actual implemention outside the class.
	private int rollNo;
	private String name;
	private int dob; 

	//public getter and public setter methods.
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public static void main(String[] args) {
		EncapsulationClass obj = new EncapsulationClass();
		obj.setRollNo(1511);
		obj.setName("Asif");
		obj.setDob(11012021);
		
		System.out.println("Name of the student ---" +obj.getName());
		System.out.println("DOB ---- " + obj.getDob());
		System.out.println("RollNo----" + obj.getRollNo());

	}

}
