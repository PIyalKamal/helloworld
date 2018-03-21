package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void absolutelyNothing(){
		;
	}
	
	//@Test
	public void testHelloWorldMessage() {
		HelloWorld helloWorldInstance = new HelloWorld();
		String message = helloWorldInstance.getMessage();
		assertTrue("Error expected message to be equal to HelloWorld",message.equals("HelloWorld"));
		
	}
	
	@Test
	public void testZero(){
		Fibo f = new Fibo();
		int i = f.generate (0);
		assertTrue (" Error",i==1);		
	}
	
	@Test
	public void testOne(){
		Fibo f = new Fibo();
		int observedResult = f.generate (1);
		int expectedResult=1;
		assertTrue (" Error expected "+expectedResult+ " obeserved result " + observedResult,observedResult==expectedResult);
	}
}
