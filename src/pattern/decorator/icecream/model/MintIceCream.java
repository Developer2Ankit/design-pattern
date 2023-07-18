package pattern.decorator.icecream.model;

import pattern.decorator.icecream.interfaces.IceCream;
import pattern.decorator.icecream.logic.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

	public MintIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
	System.out.println("Adding Min Chocolate Ice Cream!");
		return 1.50+super.cost();
	}

}
