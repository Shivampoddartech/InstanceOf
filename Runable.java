package Exception;

public class Runable {
	public static void main(String[] args) {

		Vechicle obj = new Car();  // UPCASTING
//		Vechicle obj = new Bike();
		if (obj instanceof Bike) {
			Bike b = (Bike) obj;   // DownCast
			System.out.println(b.brand + " " + b.name + " : Bike");
		} 
		
		else if (obj instanceof Car) {
		Car c = (Car) obj;
		System.out.println(c.cost+" " +c.name + " : Car");
		}
		else {
			System.out.println("invalid");
		}
		
	}
}
