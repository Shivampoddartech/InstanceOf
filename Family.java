package Exception;

public class Family {
	public static void main(String[] args) {

		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		System.out.println(s instanceof Son); // true why because son inherit father property
		System.out.println(s instanceof Father); // true

		System.out.println(d instanceof Daughter); // true why because son inherit father property
		System.out.println(d instanceof Father); // true

		System.out.println(f instanceof Father); // true
		System.out.println(f instanceof Son); // // false because father not access son property
		System.out.println(f instanceof Daughter); // false because father not access son property

	}
}
