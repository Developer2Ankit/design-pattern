package pattern.strategy.payment.controller;

public class CreditCartAlgorithm implements Payment {
private String name;
private String cardNumber;


	@Override
	public void pay(int amount) {
System.out.println(amount+" paid with Card");
		
	}


	public CreditCartAlgorithm(String name, String cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}


	

}
