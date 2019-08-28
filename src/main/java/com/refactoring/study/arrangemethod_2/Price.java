package com.refactoring.study.arrangemethod_2;

/**
 * 임시변수를 메서드 호출로 전환
 * 
 * 수행 가이드
 * - getPirce() 메서드 내의 임시변수를 basePrice 부분을 basePrice() 메서드로 변환
 * - getPricet() 메서드 내의 나머지 코드를 discountFactor() 메서드로 변환
 * - junit 테스트 확인
 * 
 * @author chris
 *
 */
public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	
	/*
	// AS-IS
	public double getPrice() {
		// #1
		int basePrice = _quantity * _itemPrice;
		
		// #2
		double discountFactor;
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		return basePrice * discountFactor;
	}	
	*/
	
	// TO-BE
	//임시 필드(Temporary Field) 정리
	public double getPrice() {
		return discountFactor(basePrice());
	}
	
	// #2
	private double discountFactor(int basePrice) {
		double discountFactor;
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		
		return basePrice * discountFactor;
	}
	
	// #1
	private int basePrice() {
		return _quantity * _itemPrice;
	}	
}

