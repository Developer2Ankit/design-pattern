package pattern.strategy.payment;

import pattern.strategy.payment.controller.CreditCartAlgorithm;
import pattern.strategy.payment.controller.PaypalAlgorithm;
import pattern.strategy.payment.controller.ShoppingCart;
import pattern.strategy.payment.modal.Product;

public class Main {

	public static void main(String[] args) {
	ShoppingCart shop=new ShoppingCart();
	Product pants= new Product("234",25);
	Product shirt= new Product("434",44);
	
	shop.addProduct(shirt);
	shop.addProduct(pants);
	shop.pay(new CreditCartAlgorithm("Ankit Yadav","12345678909"));
	shop.pay(new PaypalAlgorithm("abc@gmail.com","password"));
	}
	
}
