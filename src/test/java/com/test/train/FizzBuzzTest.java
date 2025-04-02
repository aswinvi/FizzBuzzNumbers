package com.test.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@BeforeEach
	void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void shouldReturnNumberItself() {
		Assertions.assertEquals("2", fizzBuzz.compute(2));
	}

}
