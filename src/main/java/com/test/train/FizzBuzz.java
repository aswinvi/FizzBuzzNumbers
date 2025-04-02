package com.test.train;

public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	
	public String compute(int number) {
		if(isDivisibleBy3(number)) {
			return FIZZ;
		}
		return String.valueOf(number);
	}

	private boolean isDivisibleBy3(int number) {
		return number%3==0;
	}
}
