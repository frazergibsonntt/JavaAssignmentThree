package com.nttdata.calculator.main;

import com.nttdata.calculator.util.CalculatorFunctionsClass;

public class Main {

	public static void main(String[] args) {
		// Call add
		System.out.println(CalculatorFunctionsClass.add2Method(3, 5));
		System.out.println(CalculatorFunctionsClass.sub2Method(3, 5));
		System.out.println(CalculatorFunctionsClass.div2Method(3, 4));
		System.out.println(CalculatorFunctionsClass.mult2Method(4, 5));
		CalculatorFunctionsClass.sumAnyMethod(3, 7, 8 , 21);
		System.out.println(CalculatorFunctionsClass.pubnum);
		System.out.println(CalculatorFunctionsClass.getPrivnum());
	}

}
