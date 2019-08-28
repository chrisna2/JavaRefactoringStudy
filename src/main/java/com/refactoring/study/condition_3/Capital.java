package com.refactoring.study.condition_3;

/**
 * 여러겹에 조건문을 감시절로 전환
 * - 복잡해진 조건문을 감시절로 전환해서 단순화 한다.
 * - 조건을 반대로 해서 if문을 분리한다.
 * @author chris
 *
 */
public class Capital {
	
	private static final double ADJ_FACTOR = 1.2;
	private double _capital = 100;
	private double _intRate = 0.3;
	private double _duration = 12;

	public Capital () {}
	
	/*
	//as-is
	public double getAdjustedCapital(double _income) {
		double result = 0.0;
		if (_capital > 0.0) {
			if (_intRate > 0.0 && _duration > 0.0) {
				result = (_income / _duration) * ADJ_FACTOR;
			}
		}
		
		return result;
	}
	*/
	
	//to-be
	public double getAdjustedCapital(double _income) {
		
		double noMatch = 0.0;
		
		//이게 감시절이다. 이거는 실무에서 꼭 활용하자!
		if (_capital <= 0.0) {
			return noMatch;
		}
		if (_intRate <= 0.0 || _duration <= 0.0) {
			return noMatch;
		}
		
		return (_income / _duration) * ADJ_FACTOR;
	}
}
