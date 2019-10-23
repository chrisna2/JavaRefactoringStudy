package com.refactoring.study.methodsimple_4;

public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	
	//as-is
	public double getPrice() {
		int basePrice = _quantity * _itemPrice;
		int discountLevel = getDiscountLevel();
		double finalPrice = discountedPice(basePrice, discountLevel);
		return finalPrice;
	}

	private int getDiscountLevel() {
		if (_quantity > 100) return 2;
		else return 1;
	}
	
	private double discountedPice(int basePrice, int discountLevel) {
		if (discountLevel == 2) return basePrice * 0.1;
		else return basePrice * 0.05;
	}
}
