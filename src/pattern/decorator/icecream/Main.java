package pattern.decorator.icecream;

import pattern.decorator.icecream.interfaces.IceCream;
import pattern.decorator.icecream.logic.BasicIceCream;
import pattern.decorator.icecream.model.MintIceCream;
import pattern.decorator.icecream.model.VanillaIceCream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IceCream basicIceCream=new BasicIceCream();
System.out.println("Basic Ice-cream cost :$ "+basicIceCream.cost());

IceCream vanillaIceCream=new VanillaIceCream(basicIceCream);
System.out.println("Basic Ice-cream cost :$ "+vanillaIceCream.cost());

IceCream mintIceCream=new MintIceCream(basicIceCream);
System.out.println("Basic Ice-cream cost :$ "+mintIceCream.cost());
	}

}
