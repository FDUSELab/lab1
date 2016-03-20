package lab1;

public class SmallToLarge extends SizeFactor{
	public double sizeCost(String size, Beverage drink) {
		if (size.toLowerCase().equals("small")) {
			if (drink instanceof CoffeeBeverage) {
				return 0.4;
			} else {
				return 0.2;
			}
		} else if (size.toLowerCase().equals("medium")) {
			if (drink instanceof CoffeeBeverage) {
				return 0.7;
			} else {
				return 0.5;
			}
		} else {
			if (drink instanceof CoffeeBeverage) {
				return 1.0;
			} else {
				return 0.7;
			}
		}
	}
}
