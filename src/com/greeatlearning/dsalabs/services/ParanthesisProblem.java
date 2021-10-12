package com.greeatlearning.dsalabs.services;

import java.util.Stack;

public class ParanthesisProblem {

	/*
	 * @author Rohit Shrivastva
	 * 
	 * @description This function checks whether a given expression is balanaced or
	 * not
	 * 
	 * @param String expression
	 * 
	 * @return
	 * 
	 */

	public boolean checkBalance(String expression) {
		// TODO Auto-generated method stub

		if (expression.length() % 2 == 1)
			return false;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {

			char character = expression.charAt(i);

			if (character == '{' || character == '[' || character == '(')
				stack.push(character);
			else {
				char c = stack.pop();

				switch (character) {
				case '}':
					if (c != '{')
						return false;
					break;
				case ']':
					if (c != '[')
						return false;
					break;
				case ')':
					if (c != '(')
						return false;
					break;
				}
			}

		}

		return stack.isEmpty();
	}

}
