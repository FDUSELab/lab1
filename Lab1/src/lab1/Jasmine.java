package lab1;

public class Jasmine extends BeverageWithIngredient {
	public Jasmine(Beverage drink) {
		super(drink);
		description = drink.getDescription() +  " jasmine";
	}

	public double cost() {
		return 0.5 + super.cost();
	}
}
