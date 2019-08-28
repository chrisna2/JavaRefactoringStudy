package com.refactoring.study.condition_4;

import java.util.Scanner;

/**
 * 이게 AS-IS 인데 case문에 들어 있는 로직 같은 경우 일정한 로직을 수행한다고 
 * 가정했을 때 위와 같은 방법으로 적용이 가능할것 같다. 그리고 솔직히 이게 가독성을 뛰어나게 하는지는
 * 잘 모르겠다...
 * @author chris
 *
 */
public class CarClientAsis {

	//as-is
	public static final int COMPACTCAR = 1;
	public static final int SEDANCAR = 2;
	public static final int SPORTCAR = 3;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int key = input.nextInt();
		int currentSpeed = 0; 
		  
		switch(key) {
		case COMPACTCAR :
			currentSpeed = currentSpeed + 10;
			System.out.println("경차가 선택되었습니다.");
			break;
		case SEDANCAR :
			currentSpeed = currentSpeed + 20;
			System.out.println("중형차가 선택되었습니다.");
			break;
		case SPORTCAR :
			currentSpeed = currentSpeed + 30;
			System.out.println("스포츠카가 선택되었습니다.");
			break;
		}
		
		System.out.println("선택한 자동차의 현재속도는 "+currentSpeed+ " 입니다.");
	}
}
