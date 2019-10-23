package com.refactoring.study.methodsimple_3;

public class HeatingPlan {
	private TempRange _range = new TempRange();
	
	//as-is
//	boolean withinRange (int low, int high) {
//	    return (low >= _range.getLow() && high <= _range.getHigh());
//	}
	//to-be
	boolean withinRange (TempRange range) {
		return (range.getLow() >= _range.getLow() && range.getHigh() <= _range.getHigh());
	}
	
	
}
