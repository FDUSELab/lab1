package lab1;

public class RedTea extends TeaBeverage {
	
	public RedTea(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "Red Tea";
	}


	public double cost() {
		return super.cost() + 0.8;
	}
}
