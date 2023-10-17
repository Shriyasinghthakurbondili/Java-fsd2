package com.app.junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags({"devlopment"})  // execute those methods that have tag name as devlopment
@ExcludeTags({"prod"})// execute those methods that do not have tag name as prod
public class IncludeExcludeTags {

	@Test
	@Tag("development")
	public void devtest1()
	{
		System.out.println("test Case development 1");
	}
	
	@Test
	@Tag("devlopment")
	public void devtest2()
	{
		System.out.println("test Case development 2");
	}
	
	@Test
	@Tag("Qa")
	public void Qatest1()
	{
		System.out.println("test Case Qa 1");
	}
	
	@Test
	@Tag("Qa")
	public void Qatest2()
	{
		System.out.println("test Case Qa 2");
	}
	
	@Test
	@Tag("prod")
	public void prodtest1()
	{
		System.out.println("test Case Production 1");
	}
	
	@Test
	@Tag("prod")
	public void prodtest2()
	{
		System.out.println("test Case Production 2");
	}
	
}
