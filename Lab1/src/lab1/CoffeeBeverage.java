package lab1;

public abstract class CoffeeBeverage implements Beverage {
	private String size;
	private SizeFactor sizeFactor;
	
	public CoffeeBeverage(String size, SizeFactor sizeFactor) {
		this.size = size;
		this.sizeFactor = sizeFactor;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public double cost() {
		return sizeFactor.sizeCost(size, this);
	}
}
