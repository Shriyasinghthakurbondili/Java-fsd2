package com.app.junitDemo;

import java.lang.annotation.Annotation;

public class Myannotationdemo implements MetaAnnotation{
  
	@Override
	public Class<? extends Annotation> annotationType()
	{
		return null;
	}
	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
}
