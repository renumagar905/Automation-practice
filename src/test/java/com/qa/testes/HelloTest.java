package com.qa.testes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloTest {
	@Test
	public void verifyHelloWord() {
		String actual_result="Hello world";
		String Expected_result="Hello world";
		Assert.assertEquals(actual_result, Expected_result);
		
	}

}
