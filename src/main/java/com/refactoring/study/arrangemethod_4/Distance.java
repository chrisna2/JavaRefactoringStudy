package com.refactoring.study.arrangemethod_4;

/**
 * 임시변수 분리 - 하나의 변수가 여러개의 기능을 사용해선 안돤다.
 * - 해당 메소드내에 2가지 용도로 사용되고 있는 임시변수 acc를 primaryAcc, secondaryAcc로 변경 분리하시오
 * @author chris
 *
 */
public class Distance {

	private int _primaryForce = 10;
	private int _secondaryForce = 20;
	private int _mass = 3; 
	private int _delay = 1;
	
	/*
	//as-is
	public double getDistanceTravelled (int time) {
		
		double result;
		double acc = _primaryForce / _mass; // #1
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVel = acc * _delay;
			acc = (_primaryForce + _secondaryForce) / _mass; // #2
			result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
	*/
	
	//to-be
	// 매서드 정리 : 하나의 변수에 여러개의 용도로 사용하지 마라
	public double getDistanceTravelled (int time) {
		
		double result;
		// #1 첫번째 변수 : final로 설정 하면 해당 변수에 다른 값을 셋팅할 수 없다.
		final double primaryAcc = _primaryForce / _mass; 
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			// #2 두번째 변수
			final double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
	
}

