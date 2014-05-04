package module07;

public class LuxuryCar extends Car {
	public String make;

	public LuxuryCar() {
		super();
		super.make = "Car";
		super.displayData();
		System.out.println("Constructor of Luxury Car");
	}

	public static void main(String[] args) {
		LuxuryCar objLuxuryCar = new LuxuryCar();

	}
}
