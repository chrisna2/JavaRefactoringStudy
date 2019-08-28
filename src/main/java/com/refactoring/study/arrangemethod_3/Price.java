package com.refactoring.study.arrangemethod_3;

/**
 * 직관적 임시 변수 사용
 * - price() 메소드 내의 return 값의 내용을 임시변수 basePrice, discountPrice, shippingPrice로 변환
 * - junit 테스트 확인
 * @author chris
 */
public class Price {
	
	private int _quantity;
	private int _itemPrice;
	
	public Price(int quantity, int itemPrice) {
		this._quantity = quantity;
		this._itemPrice = itemPrice;
	}
	/*
	// as-is
	public double price() {
	
		// 리턴형의 변수가 너무 길다.
		return _quantity * _itemPrice - 
				Math.max(0,  _quantity - 500) * _itemPrice * 0.05 + 
				Math.min(_quantity * _itemPrice * 0.1,  1000.0);
	}
	*/
	
	// to-be : 이클립스 > Refactor > Extract Local Variables
	public double price() {
		
		// final : 값이 한번만 입력되어 어디에서도 변하지 않는 변수로 지정시
		final int basePrice = _quantity * _itemPrice;
		final double discountPrice = Math.max(0,  _quantity - 500) * _itemPrice * 0.05;
		final double shippingPrice = Math.min(basePrice * 0.1,  1000.0);
		
		return basePrice - discountPrice + shippingPrice;
	}
}
