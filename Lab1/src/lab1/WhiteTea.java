package lab1;

public class WhiteTea extends TeaBeverage {

	public WhiteTea(String size, SizeFactor sizeFactor) {
		super(size,sizeFactor);
		description = "White Tea";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
