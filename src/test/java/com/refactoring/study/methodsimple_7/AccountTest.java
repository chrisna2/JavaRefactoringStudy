package com.refactoring.study.methodsimple_7;

public class AccountTest {
	
	public static void main(String[] args) { 
	 
		Account account= new Account();
	
		int amount = 150;
		
		try {
			account.canWithdraw(amount);
			doTheUsualThing();
		}
		catch (Exception e) {
			e.printStackTrace();
			handleOverdrawn();
		}
		
	}

	private static void doTheUsualThing() {
		System.out.println( "doTheUsualThing() -->" ); 
	}

	private static void handleOverdrawn() {
		System.out.println( "handleOverdrawn() -->" ); 
		
	}
}
