package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Repeatedtest {
  
	// we will not use @Test annotation
	@RepeatedTest(5)
	//it will execute the test 5 times
	@DisplayName("repeatedtests")
	public void repeatmessage()
	{
		System.out.println("We are learning Junit");
	}
}
