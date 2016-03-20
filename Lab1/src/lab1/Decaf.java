package lab1;

public class Decaf extends CoffeeBeverage {
	private String description;
	
	public Decaf(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Decaf";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.5;
	}
}
