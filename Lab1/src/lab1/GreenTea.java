package lab1;

public class GreenTea extends TeaBeverage {
	
	public GreenTea(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Green Tea";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
