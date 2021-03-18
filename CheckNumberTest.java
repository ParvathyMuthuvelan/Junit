package com.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckNumberTest {
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 16, Integer.MAX_VALUE}) // six numbers
	void isOdd(int number) {
	    assertTrue(CheckNumber.isOdd(number));
	}
	@ParameterizedTest
	@ValueSource(strings = {"", "  ","abc"})
	void isBlank(String input) {
	    assertTrue(CheckNumber.isBlank(input));
	}
}
