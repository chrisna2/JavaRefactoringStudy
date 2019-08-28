package com.refactoring.study.condition_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 조건문 쪼개기(Decompose Conditional)
 * - 복합조건문을 각각 notSummer(), winterCharge(), summerCharge()로 교체
 * 
 * 조건문이 복잡해지면 오류 발생 가능성이 높아진다.
 * 
 * @author chris
 *
 */
public class HeatingBill {
	
	private static final String SUMMER_START = "06-01";
	private static final String SUMMER_END = "08-30";
	private double _winterRate = 1.5;
	private double _summerRate = 2;
	private double _winterServiceCharge = 10;

	public HeatingBill() {}
	
	/*
	//as-is
	public double calculateBills (int quantity, Date date) {
		double charge = 0;
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
			Date startDate = formatter.parse(SUMMER_START);
			Date endDate = formatter.parse(SUMMER_END);

			int startCompare = date.compareTo(startDate);
			int endCompare = date.compareTo(endDate);
        
			if ( startCompare < 0 || endCompare > 0)
				charge  = quantity * _winterRate + _winterServiceCharge;
			else charge = quantity * _summerRate;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return charge;
	}
	*/
	
	//to-be
	public double calculateBills (int quantity, Date date) {
		if ( notSummer(date) ) {
			return summerCharge(quantity);
		}
		else {
			return winterCharge(quantity);
		}
	}
	
	//#1
	private double winterCharge(int quantity) {
		return quantity * _summerRate;
	}

	//#2
	private double summerCharge(int quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}
	
	//#3
	private boolean notSummer(Date date) {
		
		int startCompare = 0;
		int endCompare = 0;
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
			Date startDate = formatter.parse(SUMMER_START);
			Date endDate = formatter.parse(SUMMER_END);
			startCompare = date.compareTo(startDate);
			endCompare = date.compareTo(endDate);
		}
		catch (ParseException ex){
			ex.printStackTrace();
		}
		
		if(startCompare < 0 || endCompare > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
