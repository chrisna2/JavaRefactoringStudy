package com.refactoring.study.condition_4;

public abstract class CarType {
	
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;
	
	
	public static CarType setType(int key) {
		
		switch(key) {
		case COMPACTCAR :
			//child class로 로직 변경
			return new CompactCar();
		case SEDANCAR :
			//child class로 로직 변경
			return new SedanCar();
		case SPORTCAR :
			//child class로 로직 변경
			return new SportCar();
		default :
			throw new IllegalArgumentException("잘못된 입력값을 입력하셨습니다. : "+key);
		}
	}

	public abstract int speedUp();
}
