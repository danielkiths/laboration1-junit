package com.example.lab1junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Lab1JunitApplicationTests {

	public boolean isNumberEven(int number) {
		return number % 2 == 0;
	}

	@Test
	@DisplayName("Ska returnera true om jämnt tal skickats")
	void shouldReturnTrueNumberIsEven() {
		//given
		int evenNumber = 8;

		//when
		boolean result = isNumberEven(evenNumber);

		//then
		Assertions.assertTrue(result);

	}
@Test
@DisplayName("Ska returnera false om udda tal skickats")
	void shouldReturnFalseWhenNumberIsOdd() {
		//given
	int OddNumber = 3;

		//when
	boolean result = isNumberEven(OddNumber);

		//then
		Assertions.assertFalse(result);
}


}
