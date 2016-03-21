package lab1;

public class HouseBlend extends CoffeeBeverage {
	
	public HouseBlend(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "HouseBlend";
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
