package com.nttdata.calculator.util;

public class CalculatorFunctionsClass {
	public static int add2Method(int num1, int num2) {
		// This method adds two numbers
		int add2sum = num1 + num2;
		return add2sum;
	}

	public static int sub2Method(int num1, int num2) {
		/// This method subtracts two numbers
		int sub2sum = num1 - num2;
		return sub2sum;
	}

	public static int div2Method(int num1, int num2) {
		// This method multiplies two numbers
		int div2sum = num1 / num2;
		return div2sum;
	}

	public static int mult2Method(int num1, int num2) {
		// This method multiplies two numbers
		int mult2sum = num1 * num2;
		return mult2sum;
	}

	public static void sumAnyMethod(int num1, int... nums) {
		// This method add together the number passed to it, regardless of how many
		// numbers there are
		for (int j = 0; j < nums.length; j++) {
			System.out.println(nums[j]);

		}

	}

	// Demonstrating the public and private variables, and where get/set is used
	private static int privnum = 1;
	public static int pubnum = 1;

	public static int getPrivnum() {
		return privnum;
	}

	public void setPrivnum(int privnum) {
		this.privnum = privnum;
	}

	public static int getPubnum() {
		return pubnum;
	}

	public static void setPubnum(int pubnum) {
		CalculatorFunctionsClass.pubnum = pubnum;
	}

}