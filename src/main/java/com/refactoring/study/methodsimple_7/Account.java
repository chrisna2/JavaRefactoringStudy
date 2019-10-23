package com.refactoring.study.methodsimple_7;

public class Account {
	private int _balance=100;
	
	void canWithdraw(int amount) {
		if(amount > _balance) {
			throw new IllegalArgumentException("값이 너무 큽니다.");
		}
		_balance -= amount;
	}
}
