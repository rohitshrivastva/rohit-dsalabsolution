package com.greeatlearning.dsalabs.main;

import java.util.ArrayList;

import com.greeatlearning.dsalabs.model.Node;
import com.greeatlearning.dsalabs.services.LongestPathProblem;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestPathProblem obj = new LongestPathProblem();

		Node node1 = new Node(100);
		Node node2 = new Node(20);
		Node node3 = new Node(130);
		Node node4 = new Node(10);
		Node node5 = new Node(50);
		Node node6 = new Node(100);
		Node node7 = new Node(140);
		Node node8 = new Node(5);

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		node4.left = node8;

		
		ArrayList<Integer> list = obj.findLongestPath(node1);
		
		for(int i: list) {
			System.out.println(i);
		}
	}

}
