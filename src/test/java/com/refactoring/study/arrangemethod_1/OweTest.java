package com.refactoring.study.arrangemethod_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OweTest {

	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testPrintOwing() {
		Owe owe = new Owe("거지");
		Order order1 = new Order(20000);
		owe.addOrder(order1);
		owe.printOwing(200);
	}
}
