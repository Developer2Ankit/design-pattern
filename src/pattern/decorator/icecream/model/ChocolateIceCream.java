package pattern.decorator.icecream.model;

import pattern.decorator.icecream.interfaces.IceCream;
import pattern.decorator.icecream.logic.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

	
	public ChocolateIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double cost() {
		System.out.println("Adding Chocolate Ice Cream!");
		return 1.0+super.cost();
	}


}
