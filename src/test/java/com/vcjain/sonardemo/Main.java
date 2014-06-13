package com.vcjain.sonardemo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class test = Class.forName("com.vcjain.sonardemo.NumberTest");
		Class test1 = Class.forName("com.vcjain.sonardemo.TextTest");
		
		JUnitCore junit = new JUnitCore();
		Result result = junit.run(test);
		System.out.println(result.wasSuccessful());
		result = junit.run(test1);
		System.out.println(result.wasSuccessful());
	}

}
