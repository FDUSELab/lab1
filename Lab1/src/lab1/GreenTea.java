package lab1;

public class GreenTea extends TeaBeverage {
	private String description;
	
	public GreenTea(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Green Tea";
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
