package com.refactoring.study.condition_4;

public class SportCar extends CarType {

	@Override
	public int speedUp() {
		int currentSpeed = 20;
		System.out.println("스포츠카가 선택되었습니다.");
		return currentSpeed;
	}

}
