package com.refactoring.study.arrangemethod_1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 메서드 추출 :  메서드가 너무 길거나 코드내 주석을 달아야 의도를 이해할 수 있을 때.
 * @author chris
 *
 */
public class Owe {
	
	private String _name ;
	private Vector _orders = new Vector();
	
    public Owe(String _name){
 		   this._name=_name;
    }
   
    public void addOrder(Order arg) {
	   _orders.addElement(arg);
    }	
	
	/* 
	//as-is
	public void printOwing(double previousAmount) {

	    Enumeration e = _orders.elements();
	    double outstanding = previousAmount*1.2;
	    System.out.println("************************");
	    System.out.println("*******고객 외상*******");
	    System.out.println("************************");

	    // 외상액 계산
	    while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        outstanding += each.getAmount();
	    }

	    // 세부내역 출력
	    System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);

	}
	 */
	
	//to-be
	public void printOwing(double previousAmount) {

	    double outstanding = previousAmount*1.2;
	    
	    // refactor > extract Method > 메서드 명 설정
	    printHeader();

	    // 외상액 계산
	    // 과다한 매개변수(Long Parameter List) 수정
	    outstanding = clacRedeem(outstanding);

	    // 세부내역 출력
	    printResult(outstanding);

	}

	private void printResult(double outstanding) {
		System.out.println("name: " + _name);
	    System.out.println("amount: " + outstanding);
	}

	private double clacRedeem(double outstanding) {
		
		//사용된 변수(지역변수, 매개변수)를 알맞게 조정한다.
		 Enumeration e = _orders.elements();
		
		while(e.hasMoreElements()) {
	        Order each = (Order)e.nextElement();
	        outstanding += each.getAmount();
	    }
		return outstanding;
		
	}

	private void printHeader() {
		System.out.println("************************");
	    System.out.println("*******고객 외상*******");
	    System.out.println("************************");
	}	

}
