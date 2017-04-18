package propertyfinder.calculator.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import propertyfinder.calculator.Calculator;
import propertyfinder.calculator.Calculator.Invalid;

public class CalculatorTests {

	private Calculator calculator;

	@BeforeMethod
	public void setup() {

		calculator = new Calculator();
	}

	@Test
	public void ShouldAddTwoPositiveNumber() {

		double expected = 7;
		double actual = calculator.add(2, 5);
		Assert.assertEquals(actual, expected, "The addition is not correct");
	}

	@Test
	public void ShouldSubtractTwoNumbers() {

		double expected = 1;
		double actual = calculator.subtract(5, 4);
		Assert.assertEquals(actual, expected, "The subtraction is not correct");
	}

	@Test
	public void ShouldMultiplyTwoNumbers() {

		double expected = 25;
		double actual = calculator.multiply(5, 5);
		Assert.assertEquals(actual, expected, "The multiplication is not correct");
	}

}
