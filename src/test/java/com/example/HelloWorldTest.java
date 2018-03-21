package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void absolutelyNothing(){
		;
	}
	
	@Test
	public void testHelloWorldMessage() {
		HelloWorld helloWorldInstance = new HelloWorld();
		String message = helloWorldInstance.getMessage();
		assertTrue("Error expected message to be equal to HelloWorld",message.equals("HelloWorld"));
		
	}
}
