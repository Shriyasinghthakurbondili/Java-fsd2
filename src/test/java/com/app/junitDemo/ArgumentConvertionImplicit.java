package com.app.junitDemo;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConvertionImplicit {
       
	// Junit will automatically convert the datatype of input source in to desired datatype by test method
	// source = string
	// implcit convert to TimeUnit
	
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void  testwithImplicitArgumentConversion(ChronoUnit chronounit)
	{
		System.out.println(chronounit.name());
		Assertions.assertNotNull(chronounit.name());
	}
}
