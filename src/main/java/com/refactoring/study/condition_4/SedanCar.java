package com.refactoring.study.condition_4;

public class SedanCar extends CarType {

	@Override
	public int speedUp() {
		int currentSpeed = 20;
		System.out.println("세단차가 선택되었습니다.");
		return currentSpeed;
	}

}
