package com.greeatlearning.dsalabs.model;

/*
 * @author Rohit Shrivastva
 * @description This class create Tree Nodes
 */

public class Node {

	public int data;
	public Node left, right;
	
	
	/*
	 * @param int value
	 */

	public Node(int value) {
		data = value;
		left = right = null;
	}

}
