package lab1;

public abstract class BeverageWithIngredient implements Beverage {
	private Beverage drink;
	protected String description;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double cost() {
		return drink.cost();
	}
}
