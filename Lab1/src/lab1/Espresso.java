package lab1;

public class Espresso extends CoffeeBeverage {
	private String description;
	
	public Espresso(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Esspresso";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
