package pattern.strategy.payment.controller;

import java.util.ArrayList;
import java.util.List;

import pattern.strategy.payment.modal.Product;

public class ShoppingCart {

	List<Product> productList;
	
	public ShoppingCart() {
		this.productList=new ArrayList<>();
	}
	
	public void  addProduct(Product product) {
		this.productList.add(product);
	}
	
	public void  removeProduct(Product product) {
		this.productList.remove(product);
	}
	
	public int calculateTotal() {
		int sum=0;
		for(Product product:productList) {
			sum+=product.getPrice();
		}
		return sum;	
	}
	public void pay(Payment paymentType) {
		int amount=calculateTotal();
		paymentType.pay(amount);
	}
}
