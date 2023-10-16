package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParametrizedDemoMethodSource {
  
	// argument = each value stored in method or enum class or value source
	@ParameterizedTest(name = "Method value {arguments}")
	@MethodSource("stringParameters")
	public void getdatafromMethod(String input)
	{
		System.out.println("The value from method is: " + input);
	}
	
	//This method will pass a range of values 
	public static Stream<String> stringParameters()
	{
		return Stream.of("Monday","tuesday","Wednesday");
	}
	
}
