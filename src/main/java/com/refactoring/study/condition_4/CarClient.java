package com.refactoring.study.condition_4;

import java.util.Scanner;

/**
 * 조건문을 재정의로 전환
 * - 다형성 구조를 정의하고 Parent 클래스, child 클래스를 작성한다.
 * - Switch 문의 각 조건절을 각각의 Child 클래스로 이동한다
 * - junit 테스트 확인
 * @author chris
 *
 */
public class CarClient {
	
	//as-is
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CarType carType = null;
		int key = input.nextInt();
		
		carType = CarType.setType(key);
		
		int currentSpeed = carType.speedUp();
		
		System.out.println("선택한 자동차의 현재속도는 "+currentSpeed+ " 입니다.");
	}
}
