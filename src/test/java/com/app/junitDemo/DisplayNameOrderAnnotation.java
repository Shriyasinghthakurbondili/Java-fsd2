package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DisplayNameOrderAnnotation {
  
	@Order(4)
	@DisplayName("4. SignIn button")
	@Test
	public void method1()
	{
		System.out.println("testing sign In button");
	}
	
	@Order(1)
	@DisplayName("1. Username field")
	@Test
	public void method2()
	{
		System.out.println("testing username");
	}
	
	@Order(2)
	@DisplayName("2. Password field")
	@Test
	public void method3()
	{
		System.out.println("testing password field");
	}
	
	@Order(3)
	@DisplayName("3. Forgot password field")
	@Test
	public void method4()
	{
		System.out.println("testing forgot password field");
	}
}
