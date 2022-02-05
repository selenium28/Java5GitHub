package abs;

public class RunBike {

	public static void main(String[] args) {
		CBZBike cb = new CBZBike();
		cb.start();
		cb.start();
		cb.helmet();
		
		Bike b = new CBZBike();
		b.start();
		b.stop();
		b.helmet();
		
//		Bike b1 = new Bike();

	}

}
