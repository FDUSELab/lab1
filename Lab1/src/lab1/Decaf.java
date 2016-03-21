package lab1;

public class Decaf extends CoffeeBeverage {
	
	public Decaf(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Decaf";
	}

	public double cost() {
		return super.cost() + 0.5;
	}
}
