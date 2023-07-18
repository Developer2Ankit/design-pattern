package pattern.decorator.icecream.logic;

import pattern.decorator.icecream.interfaces.IceCream;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream=iceCream;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.iceCream.cost();
	}

}
