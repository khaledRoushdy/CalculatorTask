package propertyfinder.calculator;

import propertyfinder.calculator.Calculator.Invalid;

public class Calculator {

	public double add(double x,double y){
		return x+y;
	}
	
	public double subtract(double x,double y){
		return x-y;
	}
	
	public double multiply(double x,double y){
		return x*y;
	}
	
	public double divide (double x,double y) throws Invalid{
		if(y == 0)
			throw new Invalid("Can not divide by zero");
		
		else 
			return x/y;
	}
	
	
	public class Invalid extends Exception {

		  public Invalid(String message){
		     super(message);
		  }

		}
}
