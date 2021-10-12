package com.greeatlearning.dsalabs.services;

import java.util.ArrayList;

import com.greeatlearning.dsalabs.model.Node;

public class LongestPathProblem {

	/*
	 * @description this functions finds the longest path present in the node
	 * 
	 * @param Node root
	 * 
	 * @return ArrayList
	 * 
	 */

	public ArrayList<Integer> findLongestPath(Node root) {

		if (root == null)
			return new ArrayList<>();

		ArrayList<Integer> rightNode = findLongestPath(root.right);
		ArrayList<Integer> leftNode = findLongestPath(root.left);

		if (rightNode.size() < leftNode.size())
			leftNode.add(root.data);
		else
			rightNode.add(root.data);

		return leftNode.size() > rightNode.size() ? leftNode : rightNode;
	}

}
