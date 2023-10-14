package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
  
	@Test
	public void Assumptions()
	{
		// i want to run the test cases only and only if my DB server is Up and running
		boolean isDBServerUp = true;
		Assumptions.assumeTrue(isDBServerUp,"server is not Up");
		System.out.println("Creates tables and insert data");
	}
}
