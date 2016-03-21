package lab1;

public abstract class BeverageBased implements Beverage{
	private String size;
	private SizeFactor sizeFactor;
	
	public BeverageBased(String size, SizeFactor sizeFactor) {
		this.size = size;
		this.sizeFactor = sizeFactor;
	}
	
	public double cost() {
		return sizeFactor.sizeCost(this);
	}
	
	public String getSize(){
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
}
