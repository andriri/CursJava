package curs9;

public class Mobile extends Product{

	private int buyPrice;
	private int vat; //tva
	private int adaos;
	
	//polimorfism
	
	@Override 

	public int calculatePrice() {
		
		return buyPrice + vat + adaos;
	}

	//constructor
	public Mobile(int buyPrice, int vat, int adaos) {
		this.buyPrice = buyPrice;
		this.vat      = vat;
		this.adaos    = adaos;
	}
	
}
