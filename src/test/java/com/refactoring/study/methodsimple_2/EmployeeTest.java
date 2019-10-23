package com.refactoring.study.methodsimple_2;

public class EmployeeTest {
	
	public static void main(String[] args) { 
		Employee kim=new Employee();
//		kim.tenPercentRaise();
//		kim.fivePercentRaise();
		
		kim.percentRaise((double)0.25);
		kim.baseCharge();
		
	}
	
}
