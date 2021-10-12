package com.greeatlearning.dsalabs.main;

import com.greeatlearning.dsalabs.services.ParanthesisProblem;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParanthesisProblem obj = new ParanthesisProblem();

		String expression = "{[]}()}";

		boolean result = obj.checkBalance(expression);

		if (result)
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}

}
