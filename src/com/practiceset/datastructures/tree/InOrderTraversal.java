package com.practiceset.datastructures.tree;

import java.util.Stack;

public class InOrderTraversal {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){this.data = data;}
	}
	Node createNodeStructure(){
		Node root = new Node(40);
		Node n20 = new Node(20);
		Node n60 = new Node(60);
		root.left = n20;
		root.right = n60;
		return root;
	}
	//left child=>parent=>right child
	void inOrderTraversal(Node root){
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		while(!stack.empty() || node !=null){
			if(node !=null ){
				stack.push(node);
				node.left = node;
				System.out.println(node.data);
			}else{
				Node n = stack.pop();
				System.out.println(n.data);
				node = n.right;
				
			}
		}
	}
	public static void main(String args[]){
		
		InOrderTraversal iOT = new InOrderTraversal();
		Node root = iOT.createNodeStructure();
		iOT.inOrderTraversal(root);
	}
	
}
