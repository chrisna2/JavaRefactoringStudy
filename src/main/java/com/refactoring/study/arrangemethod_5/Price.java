package com.refactoring.study.arrangemethod_5;

/**
 * 매개변수로의 리턴값 대입제거
 * - 매개변수(parameter)는 그자체로 리턴값으로 나와선 곤란하다. 리턴형은 변수를 따로 구성할 것
 * @author chris
 *
 */
public class Price {

	/*
	//as-is
	public int discount (int inputVal, int quantity, int yearToDate) {
		
	    if (inputVal > 50)  inputVal -= 2;
	    if (quantity > 100) inputVal -= 1;
	    if (yearToDate > 10000) inputVal -= 4;

	    return inputVal;
	}
	*/
	
	//to-be
	public int discount (int inputVal, int quantity, int yearToDate) {
		
		int result = inputVal;
		
	    if (inputVal > 50)  result -= 2;
	    if (quantity > 100) result -= 1;
	    if (yearToDate > 10000) result -= 4;

	    return result;
	}
	
}
