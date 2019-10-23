package com.refactoring.study.methodsimple_5;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	//자바에서는 동적인 길이로 여러 데이터형을 저장하기 위해 Vector 클래스를 제공한다. Vector 클래스는 가변 길이의 배열이라고 할 수 있다.
	Vector _entries = new Vector();

	// 두 날짜 사이의 계좌입출금 현황을 알아내는 메서드
	double getFlowBetween (DateRange dateRange) {
		
		double result = 0;
		
		//Enumeration 인터페이스는 객체들의 집합(Vector)에서 각각의 객체들을 한순간에 하나씩 처리할 수 있는 메소드를 제공하는 켈렉션이다.
		while (setData().hasMoreElements()) {
			Entry each = (Entry) setData().nextElement();
			if (dateRange.insclude(each.getDate()))
			{
				result += each.getValue();
			}
		}
		
		return result;
	}

	private Enumeration setData() {
		
		_entries.addElement(new Entry(10, new Date(2016, 1, 2)));
		_entries.addElement(new Entry(20, new Date(2016, 1, 3)));
		_entries.addElement(new Entry(30, new Date(2016, 1, 4)));
		
		Enumeration e = _entries.elements();
		
		return e;
	}
}
