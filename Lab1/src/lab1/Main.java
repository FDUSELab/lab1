package lab1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".0");

		int num = Integer.parseInt(args[0]); //饮料的杯数
		double totalCost = 0;

		ArrayList<ArrayList<String>> disArr = new ArrayList<ArrayList<String>>();
		disArr.add(new ArrayList<String>());

		int i = 0; //i:杯数 j:args个数
		for (int j = 1; j < args.length; j++) {
			if(args[j].equals(";")) {
				i++;
				disArr.add(new ArrayList<String>());
			}
			else {
				String a = args[j].toLowerCase();
				disArr.get(i).add(a.toLowerCase());
			}
		}

		SmallToGrant sf = new SmallToGrant();
		int l;//l:一杯饮料的arg数目

		for (i = 0;i < num;i++) { //i:杯数
			ok:
			for (l = 0; l < disArr.get(i).size(); l++){
				for(int j = 0; j < sf.getSizes().length; j++){
					if(disArr.get(i).get(l).equals(sf.getSizes()[j])){
						break ok;
					}
				}
			}


			if (l >= disArr.get(i).size()) {
				System.out.println("Must set a size!");
				return;
			}

			String beveStr;
			if (l == 2) {
				beveStr = disArr.get(i).get(0) + " " + disArr.get(i).get(1);
			} else {
				beveStr = disArr.get(i).get(0);
			}

			Beverage order;
			if (beveStr.equals("espresso")) {
				order = new Espresso(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("houseblend")) {
				order = new HouseBlend(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("decaf")) {
				order = new Decaf(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("mocha")) {
				order = new Espresso(disArr.get(i).get(l),sf);
				order = new Chocolate(order);
			} else if (beveStr.equals("latte")) {
				order = new Espresso(disArr.get(i).get(l),sf);
				order = new Milk(order);
			} else if (beveStr.equals("cappuccino")) {
				order = new Espresso(disArr.get(i).get(l),sf);
				order = new WhipCream(order);
			} else if (beveStr.equals("decaf mocha")) {
				order = new Decaf(disArr.get(i).get(l),sf);
				order = new Chocolate(order);
			} else if (beveStr.equals("decaf latte")){
				order = new Decaf(disArr.get(i).get(l),sf);
				order = new Milk(order);
			} else if (beveStr.equals("decaf cappuccino")){
				order = new Decaf(disArr.get(i).get(l),sf);
				order = new WhipCream(order);
			} else if (beveStr.equals("green tea")) {
				order = new GreenTea(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("red tea")) {
				order = new RedTea(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("white tea")) {
				order = new WhiteTea(disArr.get(i).get(l),sf);
			} else if (beveStr.equals("flower tea")) {
				order = new GreenTea(disArr.get(i).get(l),sf);
				order = new Jasmine(order);
			} else if (beveStr.equals("ginger tea")) {
				order = new GreenTea(disArr.get(i).get(l),sf);
				order = new Ginger(order);
			} else if (beveStr.equals("tea latte")) {
				order = new RedTea(disArr.get(i).get(l),sf);
				order = new Milk(order);
			} else {
				System.out.println("Illegal input: " + beveStr);
				return;
			}

			for (l++; l < disArr.get(i).size(); l++) {
				if (disArr.get(i).get(l).equals("chocolate")) {
					order = new Chocolate(order);
				} else if (disArr.get(i).get(l).equals("ginger")) {
					order = new Ginger(order);
				} else if (disArr.get(i).get(l).equals("milk")) {
					order = new Milk(order);
				} else if (disArr.get(i).get(l).equals("jasmine")) {
					order = new Jasmine(order);
				} else if (disArr.get(i).get(l).equals("whip")) {
					l++;
					order = new WhipCream(order);
				} else {
					System.out.println("Illegal input: " + disArr.get(i).get(l));
				}
			}
			totalCost += order.cost();
			System.out.println("The cost of this order is: "
					+ df.format(order.cost()) + " dollars. \nThe order is " + beveStr + "(" + order. getDescription() + ")" + ".\n");

		}

		System.out.println("The total cost of your order is: " + totalCost + " dollars.");

	}
}