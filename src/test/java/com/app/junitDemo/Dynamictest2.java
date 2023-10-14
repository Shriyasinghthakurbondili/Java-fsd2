package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Dynamictest2 {
  
	@TestFactory
	public Stream<DynamicTest> dynamictestforPalindrome()
	{
		return Stream.of("pop","mom","sis","dad","madam").map(inputText->DynamicTest.dynamicTest(inputText, ()->Assertions.assertTrue(Myutils.isPalindrome(inputText))));
	}
}
