package lab1;

public class Espresso extends CoffeeBeverage {
	
	public Espresso(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Esspresso";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
