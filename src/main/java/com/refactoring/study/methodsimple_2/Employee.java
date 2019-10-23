package com.refactoring.study.methodsimple_2;

public class Employee {

	private double salary=100;
	
	//AS-IS 아래 기능을 파라미터를 받으면 기능 합쳐진다.
	void tenPercentRaise () {
		salary *= 1.1;
		System.out.println("tenPercentRaise --> " + salary );
	}

	void fivePercentRaise () {
		salary *= 1.05;
		System.out.println("fivePercentRaise --> " + salary );
	}
	
	//TO-BE 
	void percentRaise(double factor){
		salary = salary*(1+factor);
		System.out.println("percentRaise -->" + salary);
	}
	
	double baseCharge() {
		
		double result = Math.min(lastUsage(), 100) * 0.03;
		if (lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200)-100) * 0.05;
		}
		if (lastUsage() > 200) {
			result += (lastUsage()-200) * 0.07;
		}
		
		System.out.println("result --> " + result );
		return result;
	}

	private int lastUsage() {
		return 300;
	}

}
